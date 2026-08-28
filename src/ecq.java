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

public abstract class ecq implements dkr.a, edc, edm {
   public static final int a = -1;
   private static final Logger n = LogUtils.getLogger();
   private static final LongSet o = new LongOpenHashSet();
   protected final ShortList[] b;
   private volatile boolean p;
   private volatile boolean q;
   protected final dir c;
   private long r;
   @Nullable
   @Deprecated
   private dkq s;
   @Nullable
   protected egw d;
   protected final edn e;
   @Nullable
   protected ehv f;
   protected final Map<egs.a, egs> h = Maps.newEnumMap(egs.a.class);
   protected ewk i;
   private final Map<ern, erv> t = Maps.newHashMap();
   private final Map<ern, LongSet> u = Maps.newHashMap();
   protected final Map<iv, tz> j = Maps.newHashMap();
   protected final Map<iv, dxr> k = new Object2ObjectOpenHashMap();
   protected final djo l;
   protected final edb[] m;

   public ecq(dir $$0, edn $$1, djo $$2, js<dkp> $$3, long $$4, @Nullable edb[] $$5, @Nullable ehv $$6) {
      this.c = $$0;
      this.e = $$1;
      this.l = $$2;
      this.m = new edb[$$2.ap()];
      this.r = $$4;
      this.b = new ShortList[$$2.ap()];
      this.f = $$6;
      this.i = new ewk($$2);
      if ($$5 != null) {
         if (this.m.length == $$5.length) {
            System.arraycopy($$5, 0, this.m, 0, this.m.length);
         } else {
            n.warn("Could not set level chunk sections, array length is {} instead of {}", $$5.length, this.m.length);
         }
      }

      a($$3, this.m);
   }

   private static void a(js<dkp> $$0, edb[] $$1) {
      for (int $$2 = 0; $$2 < $$1.length; $$2++) {
         if ($$1[$$2] == null) {
            $$1[$$2] = new edb($$0);
         }
      }
   }

   public efw a(int $$0) {
      return efw.a;
   }

   @Nullable
   public eat a(iv $$0, eat $$1) {
      return this.a($$0, $$1, 3);
   }

   @Nullable
   public abstract eat a(iv var1, eat var2, int var3);

   public abstract void a(dxr var1);

   public abstract void a(bwi var1);

   public int a() {
      edb[] $$0 = this.d();

      for (int $$1 = $$0.length - 1; $$1 >= 0; $$1--) {
         edb $$2 = $$0[$$1];
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
      return $$0 == -1 ? this.G_() : jy.c(this.h($$0));
   }

   public Set<iv> c() {
      Set<iv> $$0 = Sets.newHashSet(this.j.keySet());
      $$0.addAll(this.k.keySet());
      return $$0;
   }

   public edb[] d() {
      return this.m;
   }

   public edb b(int $$0) {
      return this.d()[$$0];
   }

   public Collection<Entry<egs.a, egs>> e() {
      return Collections.unmodifiableSet(this.h.entrySet());
   }

   public void a(egs.a $$0, long[] $$1) {
      this.a($$0).a(this, $$0, $$1);
   }

   public egs a(egs.a $$0) {
      return this.h.computeIfAbsent($$0, $$0x -> new egs(this, $$0x));
   }

   public boolean b(egs.a $$0) {
      return this.h.get($$0) != null;
   }

   public int a(egs.a $$0, int $$1, int $$2) {
      egs $$3 = this.h.get($$0);
      if ($$3 == null) {
         if (ac.aV && this instanceof eda) {
            n.error("Unprimed heightmap: " + $$0 + " " + $$1 + " " + $$2);
         }

         egs.a(this, EnumSet.of($$0));
         $$3 = this.h.get($$0);
      }

      return $$3.a($$1 & 15, $$2 & 15) - 1;
   }

   public dir f() {
      return this.c;
   }

   @Nullable
   @Override
   public erv a(ern $$0) {
      return this.t.get($$0);
   }

   @Override
   public void a(ern $$0, erv $$1) {
      this.t.put($$0, $$1);
      this.i();
   }

   public Map<ern, erv> g() {
      return Collections.unmodifiableMap(this.t);
   }

   public void a(Map<ern, erv> $$0) {
      this.t.clear();
      this.t.putAll($$0);
      this.i();
   }

   @Override
   public LongSet b(ern $$0) {
      return this.u.getOrDefault($$0, o);
   }

   @Override
   public void a(ern $$0, long $$1) {
      this.u.computeIfAbsent($$0, $$0x -> new LongOpenHashSet()).add($$1);
      this.i();
   }

   @Override
   public Map<ern, LongSet> h() {
      return Collections.unmodifiableMap(this.u);
   }

   @Override
   public void b(Map<ern, LongSet> $$0) {
      this.u.clear();
      this.u.putAll($$0);
      this.i();
   }

   public boolean a(int $$0, int $$1) {
      if ($$0 < this.G_()) {
         $$0 = this.G_();
      }

      if ($$1 > this.ao()) {
         $$1 = this.ao();
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

   public void i() {
      this.p = true;
   }

   public boolean j() {
      if (this.p) {
         this.p = false;
         return true;
      } else {
         return false;
      }
   }

   public boolean k() {
      return this.p;
   }

   public abstract edr n();

   public edr o() {
      edr $$0 = this.n();
      egg $$1 = this.z();
      if ($$1 != null) {
         edr $$2 = $$1.a();
         return edr.a($$2, $$0);
      } else {
         return $$0;
      }
   }

   public abstract void d(iv var1);

   public void e(iv $$0) {
      n.warn("Trying to mark a block for PostProcessing @ {}, but this operation is not supported.", $$0);
   }

   public ShortList[] p() {
      return this.b;
   }

   public void a(ShortList $$0, int $$1) {
      a(this.p(), $$1).addAll($$0);
   }

   public void a(tz $$0) {
      iv $$1 = dxr.b($$0);
      if (!this.k.containsKey($$1)) {
         this.j.put($$1, $$0);
      }
   }

   @Nullable
   public tz f(iv $$0) {
      return this.j.get($$0);
   }

   @Nullable
   public abstract tz a(iv var1, jh.a var2);

   @Override
   public final void a(BiConsumer<iv, eat> $$0) {
      this.a($$0x -> $$0x.k() != 0, $$0);
   }

   public void a(Predicate<eat> $$0, BiConsumer<iv, eat> $$1) {
      iv.a $$2 = new iv.a();

      for (int $$3 = this.aq(); $$3 <= this.ar(); $$3++) {
         edb $$4 = this.b(this.g($$3));
         if ($$4.a($$0)) {
            iv $$5 = jy.a(this.c, $$3).j();

            for (int $$6 = 0; $$6 < 16; $$6++) {
               for (int $$7 = 0; $$7 < 16; $$7++) {
                  for (int $$8 = 0; $$8 < 16; $$8++) {
                     eat $$9 = $$4.a($$8, $$6, $$7);
                     if ($$0.test($$9)) {
                        $$1.accept($$2.a($$5, $$8, $$6, $$7), $$9);
                     }
                  }
               }
            }
         }
      }
   }

   public abstract fgx<dmr> q();

   public abstract fgx<ewz> r();

   public boolean s() {
      return true;
   }

   public abstract ecq.a a(long var1);

   public edn t() {
      return this.e;
   }

   public boolean u() {
      return this.f != null;
   }

   @Nullable
   public ehv v() {
      return this.f;
   }

   public long w() {
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

   public boolean x() {
      return this.q;
   }

   public void a(boolean $$0) {
      this.q = $$0;
      this.i();
   }

   @Override
   public int G_() {
      return this.l.G_();
   }

   @Override
   public int H_() {
      return this.l.H_();
   }

   public egw a(Function<ecq, egw> $$0) {
      if (this.d == null) {
         this.d = $$0.apply(this);
      }

      return this.d;
   }

   @Deprecated
   public dkq a(Supplier<dkq> $$0) {
      if (this.s == null) {
         this.s = $$0.get();
      }

      return this.s;
   }

   @Override
   public jf<dkp> getNoiseBiome(int $$0, int $$1, int $$2) {
      try {
         int $$3 = jq.a(this.G_());
         int $$4 = $$3 + jq.a(this.H_()) - 1;
         int $$5 = azm.a($$1, $$3, $$4);
         int $$6 = this.f(jq.c($$5));
         return this.m[$$6].c($$0 & 3, $$5 & 3, $$2 & 3);
      } catch (Throwable var8) {
         p $$8 = p.a(var8, "Getting biome");
         q $$9 = $$8.a("Biome being got");
         $$9.a("Location", () -> q.a(this, $$0, $$1, $$2));
         throw new aa($$8);
      }
   }

   public void a(dks $$0, dky.f $$1) {
      dir $$2 = this.f();
      int $$3 = jq.a($$2.d());
      int $$4 = jq.a($$2.e());
      djo $$5 = this.B();

      for (int $$6 = $$5.aq(); $$6 <= $$5.ar(); $$6++) {
         edb $$7 = this.b(this.g($$6));
         int $$8 = jq.d($$6);
         $$7.a($$0, $$1, $$3, $$8, $$4);
      }
   }

   public boolean y() {
      return !this.h().isEmpty();
   }

   @Nullable
   public egg z() {
      return null;
   }

   public boolean A() {
      return this.z() != null;
   }

   public djo B() {
      return this;
   }

   public void C() {
      this.i.a(this);
   }

   @Override
   public ewk D() {
      return this.i;
   }

   public static record a(List<fgt<dmr>> a, List<fgt<ewz>> b) {
   }
}
