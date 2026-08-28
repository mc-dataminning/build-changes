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

public abstract class edn implements dlo.a, edz, eej {
   public static final int a = -1;
   private static final Logger n = LogUtils.getLogger();
   private static final LongSet o = new LongOpenHashSet();
   protected final ShortList[] b;
   private volatile boolean p;
   private volatile boolean q;
   protected final djo c;
   private long r;
   @Nullable
   @Deprecated
   private dln s;
   @Nullable
   protected eht d;
   protected final eek e;
   @Nullable
   protected eis f;
   protected final Map<ehp.a, ehp> h = Maps.newEnumMap(ehp.a.class);
   protected exk i;
   private final Map<esn, esv> t = Maps.newHashMap();
   private final Map<esn, LongSet> u = Maps.newHashMap();
   protected final Map<iw, ua> j = Maps.newHashMap();
   protected final Map<iw, dyo> k = new Object2ObjectOpenHashMap();
   protected final dkl l;
   protected final edy[] m;

   public edn(djo $$0, eek $$1, dkl $$2, jt<dlm> $$3, long $$4, @Nullable edy[] $$5, @Nullable eis $$6) {
      this.c = $$0;
      this.e = $$1;
      this.l = $$2;
      this.m = new edy[$$2.ap()];
      this.r = $$4;
      this.b = new ShortList[$$2.ap()];
      this.f = $$6;
      this.i = new exk($$2);
      if ($$5 != null) {
         if (this.m.length == $$5.length) {
            System.arraycopy($$5, 0, this.m, 0, this.m.length);
         } else {
            n.warn("Could not set level chunk sections, array length is {} instead of {}", $$5.length, this.m.length);
         }
      }

      a($$3, this.m);
   }

   private static void a(jt<dlm> $$0, edy[] $$1) {
      for (int $$2 = 0; $$2 < $$1.length; $$2++) {
         if ($$1[$$2] == null) {
            $$1[$$2] = new edy($$0);
         }
      }
   }

   public egt a(int $$0) {
      return egt.a;
   }

   @Nullable
   public ebq a(iw $$0, ebq $$1) {
      return this.a($$0, $$1, 3);
   }

   @Nullable
   public abstract ebq a(iw var1, ebq var2, int var3);

   public abstract void a(dyo var1);

   public abstract void a(bxe var1);

   public int a() {
      edy[] $$0 = this.d();

      for (int $$1 = $$0.length - 1; $$1 >= 0; $$1--) {
         edy $$2 = $$0[$$1];
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
      return $$0 == -1 ? this.K_() : jz.c(this.h($$0));
   }

   public Set<iw> c() {
      Set<iw> $$0 = Sets.newHashSet(this.j.keySet());
      $$0.addAll(this.k.keySet());
      return $$0;
   }

   public edy[] d() {
      return this.m;
   }

   public edy b(int $$0) {
      return this.d()[$$0];
   }

   public Collection<Entry<ehp.a, ehp>> e() {
      return Collections.unmodifiableSet(this.h.entrySet());
   }

   public void a(ehp.a $$0, long[] $$1) {
      this.a($$0).a(this, $$0, $$1);
   }

   public ehp a(ehp.a $$0) {
      return this.h.computeIfAbsent($$0, $$0x -> new ehp(this, $$0x));
   }

   public boolean b(ehp.a $$0) {
      return this.h.get($$0) != null;
   }

   public int a(ehp.a $$0, int $$1, int $$2) {
      ehp $$3 = this.h.get($$0);
      if ($$3 == null) {
         if (ac.aU && this instanceof edx) {
            n.error("Unprimed heightmap: " + $$0 + " " + $$1 + " " + $$2);
         }

         ehp.a(this, EnumSet.of($$0));
         $$3 = this.h.get($$0);
      }

      return $$3.a($$1 & 15, $$2 & 15) - 1;
   }

   public djo f() {
      return this.c;
   }

   @Nullable
   @Override
   public esv a(esn $$0) {
      return this.t.get($$0);
   }

   @Override
   public void a(esn $$0, esv $$1) {
      this.t.put($$0, $$1);
      this.i();
   }

   public Map<esn, esv> g() {
      return Collections.unmodifiableMap(this.t);
   }

   public void a(Map<esn, esv> $$0) {
      this.t.clear();
      this.t.putAll($$0);
      this.i();
   }

   @Override
   public LongSet b(esn $$0) {
      return this.u.getOrDefault($$0, o);
   }

   @Override
   public void a(esn $$0, long $$1) {
      this.u.computeIfAbsent($$0, $$0x -> new LongOpenHashSet()).add($$1);
      this.i();
   }

   @Override
   public Map<esn, LongSet> h() {
      return Collections.unmodifiableMap(this.u);
   }

   @Override
   public void b(Map<esn, LongSet> $$0) {
      this.u.clear();
      this.u.putAll($$0);
      this.i();
   }

   public boolean a(int $$0, int $$1) {
      if ($$0 < this.K_()) {
         $$0 = this.K_();
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

   public abstract eeo n();

   public eeo o() {
      eeo $$0 = this.n();
      ehd $$1 = this.z();
      if ($$1 != null) {
         eeo $$2 = $$1.a();
         return eeo.a($$2, $$0);
      } else {
         return $$0;
      }
   }

   public abstract void d(iw var1);

   public void e(iw $$0) {
      n.warn("Trying to mark a block for PostProcessing @ {}, but this operation is not supported.", $$0);
   }

   public ShortList[] p() {
      return this.b;
   }

   public void a(ShortList $$0, int $$1) {
      a(this.p(), $$1).addAll($$0);
   }

   public void a(ua $$0) {
      iw $$1 = dyo.a(this.c, $$0);
      if (!this.k.containsKey($$1)) {
         this.j.put($$1, $$0);
      }
   }

   @Nullable
   public ua f(iw $$0) {
      return this.j.get($$0);
   }

   @Nullable
   public abstract ua a(iw var1, ji.a var2);

   @Override
   public final void a(BiConsumer<iw, ebq> $$0) {
      this.a($$0x -> $$0x.k() != 0, $$0);
   }

   public void a(Predicate<ebq> $$0, BiConsumer<iw, ebq> $$1) {
      iw.a $$2 = new iw.a();

      for (int $$3 = this.aq(); $$3 <= this.ar(); $$3++) {
         edy $$4 = this.b(this.g($$3));
         if ($$4.a($$0)) {
            iw $$5 = jz.a(this.c, $$3).j();

            for (int $$6 = 0; $$6 < 16; $$6++) {
               for (int $$7 = 0; $$7 < 16; $$7++) {
                  for (int $$8 = 0; $$8 < 16; $$8++) {
                     ebq $$9 = $$4.a($$8, $$6, $$7);
                     if ($$0.test($$9)) {
                        $$1.accept($$2.a($$5, $$8, $$6, $$7), $$9);
                     }
                  }
               }
            }
         }
      }
   }

   public abstract fhx<dno> q();

   public abstract fhx<exz> r();

   public boolean s() {
      return true;
   }

   public abstract edn.a a(long var1);

   public eek t() {
      return this.e;
   }

   public boolean u() {
      return this.f != null;
   }

   @Nullable
   public eis v() {
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
   public int K_() {
      return this.l.K_();
   }

   @Override
   public int L_() {
      return this.l.L_();
   }

   public eht a(Function<edn, eht> $$0) {
      if (this.d == null) {
         this.d = $$0.apply(this);
      }

      return this.d;
   }

   @Deprecated
   public dln a(Supplier<dln> $$0) {
      if (this.s == null) {
         this.s = $$0.get();
      }

      return this.s;
   }

   @Override
   public jg<dlm> getNoiseBiome(int $$0, int $$1, int $$2) {
      try {
         int $$3 = jr.a(this.K_());
         int $$4 = $$3 + jr.a(this.L_()) - 1;
         int $$5 = azz.a($$1, $$3, $$4);
         int $$6 = this.f(jr.c($$5));
         return this.m[$$6].c($$0 & 3, $$5 & 3, $$2 & 3);
      } catch (Throwable var8) {
         p $$8 = p.a(var8, "Getting biome");
         q $$9 = $$8.a("Biome being got");
         $$9.a("Location", () -> q.a(this, $$0, $$1, $$2));
         throw new aa($$8);
      }
   }

   public void a(dlp $$0, dlv.f $$1) {
      djo $$2 = this.f();
      int $$3 = jr.a($$2.d());
      int $$4 = jr.a($$2.e());
      dkl $$5 = this.B();

      for (int $$6 = $$5.aq(); $$6 <= $$5.ar(); $$6++) {
         edy $$7 = this.b(this.g($$6));
         int $$8 = jr.d($$6);
         $$7.a($$0, $$1, $$3, $$8, $$4);
      }
   }

   public boolean y() {
      return !this.h().isEmpty();
   }

   @Nullable
   public ehd z() {
      return null;
   }

   public boolean A() {
      return this.z() != null;
   }

   public dkl B() {
      return this;
   }

   public void C() {
      this.i.a(this);
   }

   @Override
   public exk D() {
      return this.i;
   }

   public static record a(List<fht<dno>> a, List<fht<exz>> b) {
   }
}
