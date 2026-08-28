import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.shorts.ShortArrayList;
import it.unimi.dsi.fastutil.shorts.ShortList;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class dwz implements dfy.a, dxl, dxv {
   public static final int a = -1;
   private static final Logger o = LogUtils.getLogger();
   private static final LongSet p = new LongOpenHashSet();
   protected final ShortList[] b;
   protected volatile boolean c;
   private volatile boolean q;
   protected final deb d;
   private long r;
   @Nullable
   @Deprecated
   private dfx s;
   @Nullable
   protected ebd e;
   protected final dxw f;
   @Nullable
   protected ecc h;
   protected final Map<eaz.a, eaz> i = Maps.newEnumMap(eaz.a.class);
   protected eqo j;
   private final Map<elr, elz> t = Maps.newHashMap();
   private final Map<elr, LongSet> u = Maps.newHashMap();
   protected final Map<jg, uj> k = Maps.newHashMap();
   protected final Map<jg, dsg> l = new Object2ObjectOpenHashMap();
   protected final dex m;
   protected final dxk[] n;

   public dwz(deb $$0, dxw $$1, dex $$2, kc<dfw> $$3, long $$4, @Nullable dxk[] $$5, @Nullable ecc $$6) {
      this.d = $$0;
      this.f = $$1;
      this.m = $$2;
      this.n = new dxk[$$2.ao()];
      this.r = $$4;
      this.b = new ShortList[$$2.ao()];
      this.h = $$6;
      this.j = new eqo($$2);
      if ($$5 != null) {
         if (this.n.length == $$5.length) {
            System.arraycopy($$5, 0, this.n, 0, this.n.length);
         } else {
            o.warn("Could not set level chunk sections, array length is {} instead of {}", $$5.length, this.n.length);
         }
      }

      a($$3, this.n);
   }

   private static void a(kc<dfw> $$0, dxk[] $$1) {
      for (int $$2 = 0; $$2 < $$1.length; $$2++) {
         if ($$1[$$2] == null) {
            $$1[$$2] = new dxk($$0);
         }
      }
   }

   public ead a(int $$0) {
      return ead.a;
   }

   @Nullable
   public abstract dvd a(jg var1, dvd var2, boolean var3);

   public abstract void a(dsg var1);

   public abstract void a(btz var1);

   public int a() {
      dxk[] $$0 = this.d();

      for (int $$1 = $$0.length - 1; $$1 >= 0; $$1--) {
         dxk $$2 = $$0[$$1];
         if (!$$2.c()) {
            return $$1;
         }
      }

      return -1;
   }

   @Deprecated(
      forRemoval = true
   )
   public int b() {
      int $$0 = this.a();
      return $$0 == -1 ? this.I_() : ki.c(this.h($$0));
   }

   public Set<jg> c() {
      Set<jg> $$0 = Sets.newHashSet(this.k.keySet());
      $$0.addAll(this.l.keySet());
      return $$0;
   }

   public dxk[] d() {
      return this.n;
   }

   public dxk b(int $$0) {
      return this.d()[$$0];
   }

   public Collection<Entry<eaz.a, eaz>> e() {
      return Collections.unmodifiableSet(this.i.entrySet());
   }

   public void a(eaz.a $$0, long[] $$1) {
      this.a($$0).a(this, $$0, $$1);
   }

   public eaz a(eaz.a $$0) {
      return this.i.computeIfAbsent($$0, $$0x -> new eaz(this, $$0x));
   }

   public boolean b(eaz.a $$0) {
      return this.i.get($$0) != null;
   }

   public int a(eaz.a $$0, int $$1, int $$2) {
      eaz $$3 = this.i.get($$0);
      if ($$3 == null) {
         if (ab.aW && this instanceof dxj) {
            o.error("Unprimed heightmap: " + $$0 + " " + $$1 + " " + $$2);
         }

         eaz.a(this, EnumSet.of($$0));
         $$3 = this.i.get($$0);
      }

      return $$3.a($$1 & 15, $$2 & 15) - 1;
   }

   public deb f() {
      return this.d;
   }

   @Nullable
   @Override
   public elz a(elr $$0) {
      return this.t.get($$0);
   }

   @Override
   public void a(elr $$0, elz $$1) {
      this.t.put($$0, $$1);
      this.c = true;
   }

   public Map<elr, elz> g() {
      return Collections.unmodifiableMap(this.t);
   }

   public void a(Map<elr, elz> $$0) {
      this.t.clear();
      this.t.putAll($$0);
      this.c = true;
   }

   @Override
   public LongSet b(elr $$0) {
      return this.u.getOrDefault($$0, p);
   }

   @Override
   public void a(elr $$0, long $$1) {
      this.u.computeIfAbsent($$0, $$0x -> new LongOpenHashSet()).add($$1);
      this.c = true;
   }

   @Override
   public Map<elr, LongSet> h() {
      return Collections.unmodifiableMap(this.u);
   }

   @Override
   public void b(Map<elr, LongSet> $$0) {
      this.u.clear();
      this.u.putAll($$0);
      this.c = true;
   }

   public boolean a(int $$0, int $$1) {
      if ($$0 < this.I_()) {
         $$0 = this.I_();
      }

      if ($$1 > this.an()) {
         $$1 = this.an();
      }

      for (int $$2 = $$0; $$2 <= $$1; $$2 += 16) {
         if (!this.b(this.f($$2)).c()) {
            return false;
         }
      }

      return true;
   }

   public boolean c(int $$0) {
      return this.b(this.g($$0)).c();
   }

   public void a(boolean $$0) {
      this.c = $$0;
   }

   public boolean i() {
      return this.c;
   }

   public abstract dya j();

   public dya m() {
      dya $$0 = this.j();
      ean $$1 = this.w();
      if ($$1 != null) {
         dya $$2 = $$1.a();
         return dya.a($$2, $$0);
      } else {
         return $$0;
      }
   }

   public abstract void d(jg var1);

   public void e(jg $$0) {
      o.warn("Trying to mark a block for PostProcessing @ {}, but this operation is not supported.", $$0);
   }

   public ShortList[] n() {
      return this.b;
   }

   public void a(ShortList $$0, int $$1) {
      a(this.n(), $$1).addAll($$0);
   }

   public void a(uj $$0) {
      this.k.put(dsg.b($$0), $$0);
   }

   @Nullable
   public uj f(jg $$0) {
      return this.k.get($$0);
   }

   @Nullable
   public abstract uj a(jg var1, jr.a var2);

   @Override
   public final void a(BiConsumer<jg, dvd> $$0) {
      this.a($$0x -> $$0x.k() != 0, $$0);
   }

   public void a(Predicate<dvd> $$0, BiConsumer<jg, dvd> $$1) {
      jg.a $$2 = new jg.a();

      for (int $$3 = this.ap(); $$3 <= this.aq(); $$3++) {
         dxk $$4 = this.b(this.g($$3));
         if ($$4.a($$0)) {
            jg $$5 = ki.a(this.d, $$3).j();

            for (int $$6 = 0; $$6 < 16; $$6++) {
               for (int $$7 = 0; $$7 < 16; $$7++) {
                  for (int $$8 = 0; $$8 < 16; $$8++) {
                     dvd $$9 = $$4.a($$8, $$6, $$7);
                     if ($$0.test($$9)) {
                        $$1.accept($$2.a($$5, $$8, $$6, $$7), $$9);
                     }
                  }
               }
            }
         }
      }
   }

   public abstract fbc<dhy> o();

   public abstract fbc<erd> p();

   public abstract dwz.a a(long var1);

   public dxw q() {
      return this.f;
   }

   public boolean r() {
      return this.h != null;
   }

   @Nullable
   public ecc s() {
      return this.h;
   }

   public long t() {
      return this.r;
   }

   public void b(long $$0) {
      this.r += $$0;
   }

   public void c(long $$0) {
      this.r = $$0;
   }

   public static ShortList a(ShortList[] $$0, int $$1) {
      if ($$0[$$1] == null) {
         $$0[$$1] = new ShortArrayList();
      }

      return $$0[$$1];
   }

   public boolean u() {
      return this.q;
   }

   public void b(boolean $$0) {
      this.q = $$0;
      this.a(true);
   }

   @Override
   public int I_() {
      return this.m.I_();
   }

   @Override
   public int J_() {
      return this.m.J_();
   }

   public ebd a(Function<dwz, ebd> $$0) {
      if (this.e == null) {
         this.e = $$0.apply(this);
      }

      return this.e;
   }

   @Deprecated
   public dfx a(Supplier<dfx> $$0) {
      if (this.s == null) {
         this.s = $$0.get();
      }

      return this.s;
   }

   @Override
   public jp<dfw> getNoiseBiome(int $$0, int $$1, int $$2) {
      try {
         int $$3 = ka.a(this.I_());
         int $$4 = $$3 + ka.a(this.J_()) - 1;
         int $$5 = azj.a($$1, $$3, $$4);
         int $$6 = this.f(ka.c($$5));
         return this.n[$$6].c($$0 & 3, $$5 & 3, $$2 & 3);
      } catch (Throwable var8) {
         o $$8 = o.a(var8, "Getting biome");
         p $$9 = $$8.a("Biome being got");
         $$9.a("Location", () -> p.a(this, $$0, $$1, $$2));
         throw new z($$8);
      }
   }

   public void a(dfz $$0, dgf.f $$1) {
      deb $$2 = this.f();
      int $$3 = ka.a($$2.d());
      int $$4 = ka.a($$2.e());
      dex $$5 = this.y();

      for (int $$6 = $$5.ap(); $$6 <= $$5.aq(); $$6++) {
         dxk $$7 = this.b(this.g($$6));
         int $$8 = ka.d($$6);
         $$7.a($$0, $$1, $$3, $$8, $$4);
      }
   }

   public boolean v() {
      return !this.h().isEmpty();
   }

   @Nullable
   public ean w() {
      return null;
   }

   public boolean x() {
      return this.w() != null;
   }

   public dex y() {
      return this;
   }

   public void z() {
      this.j.a(this);
   }

   @Override
   public eqo A() {
      return this.j;
   }

   public static record a(List<fay<dhy>> a, List<fay<erd>> b) {
   }
}
