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

public abstract class edb implements dlc.a, edn, edx {
   public static final int a = -1;
   private static final Logger n = LogUtils.getLogger();
   private static final LongSet o = new LongOpenHashSet();
   protected final ShortList[] b;
   private volatile boolean p;
   private volatile boolean q;
   protected final djc c;
   private long r;
   @Nullable
   @Deprecated
   private dlb s;
   @Nullable
   protected ehh d;
   protected final edy e;
   @Nullable
   protected eig f;
   protected final Map<ehd.a, ehd> h = Maps.newEnumMap(ehd.a.class);
   protected ewy i;
   private final Map<esb, esj> t = Maps.newHashMap();
   private final Map<esb, LongSet> u = Maps.newHashMap();
   protected final Map<iv, tz> j = Maps.newHashMap();
   protected final Map<iv, dyc> k = new Object2ObjectOpenHashMap();
   protected final djz l;
   protected final edm[] m;

   public edb(djc $$0, edy $$1, djz $$2, js<dla> $$3, long $$4, @Nullable edm[] $$5, @Nullable eig $$6) {
      this.c = $$0;
      this.e = $$1;
      this.l = $$2;
      this.m = new edm[$$2.ap()];
      this.r = $$4;
      this.b = new ShortList[$$2.ap()];
      this.f = $$6;
      this.i = new ewy($$2);
      if ($$5 != null) {
         if (this.m.length == $$5.length) {
            System.arraycopy($$5, 0, this.m, 0, this.m.length);
         } else {
            n.warn("Could not set level chunk sections, array length is {} instead of {}", $$5.length, this.m.length);
         }
      }

      a($$3, this.m);
   }

   private static void a(js<dla> $$0, edm[] $$1) {
      for (int $$2 = 0; $$2 < $$1.length; $$2++) {
         if ($$1[$$2] == null) {
            $$1[$$2] = new edm($$0);
         }
      }
   }

   public egh a(int $$0) {
      return egh.a;
   }

   @Nullable
   public ebe a(iv $$0, ebe $$1) {
      return this.a($$0, $$1, 3);
   }

   @Nullable
   public abstract ebe a(iv var1, ebe var2, int var3);

   public abstract void a(dyc var1);

   public abstract void a(bwt var1);

   public int a() {
      edm[] $$0 = this.d();

      for (int $$1 = $$0.length - 1; $$1 >= 0; $$1--) {
         edm $$2 = $$0[$$1];
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
      return $$0 == -1 ? this.K_() : jy.c(this.h($$0));
   }

   public Set<iv> c() {
      Set<iv> $$0 = Sets.newHashSet(this.j.keySet());
      $$0.addAll(this.k.keySet());
      return $$0;
   }

   public edm[] d() {
      return this.m;
   }

   public edm b(int $$0) {
      return this.d()[$$0];
   }

   public Collection<Entry<ehd.a, ehd>> e() {
      return Collections.unmodifiableSet(this.h.entrySet());
   }

   public void a(ehd.a $$0, long[] $$1) {
      this.a($$0).a(this, $$0, $$1);
   }

   public ehd a(ehd.a $$0) {
      return this.h.computeIfAbsent($$0, $$0x -> new ehd(this, $$0x));
   }

   public boolean b(ehd.a $$0) {
      return this.h.get($$0) != null;
   }

   public int a(ehd.a $$0, int $$1, int $$2) {
      ehd $$3 = this.h.get($$0);
      if ($$3 == null) {
         if (ac.aU && this instanceof edl) {
            n.error("Unprimed heightmap: " + $$0 + " " + $$1 + " " + $$2);
         }

         ehd.a(this, EnumSet.of($$0));
         $$3 = this.h.get($$0);
      }

      return $$3.a($$1 & 15, $$2 & 15) - 1;
   }

   public djc f() {
      return this.c;
   }

   @Nullable
   @Override
   public esj a(esb $$0) {
      return this.t.get($$0);
   }

   @Override
   public void a(esb $$0, esj $$1) {
      this.t.put($$0, $$1);
      this.i();
   }

   public Map<esb, esj> g() {
      return Collections.unmodifiableMap(this.t);
   }

   public void a(Map<esb, esj> $$0) {
      this.t.clear();
      this.t.putAll($$0);
      this.i();
   }

   @Override
   public LongSet b(esb $$0) {
      return this.u.getOrDefault($$0, o);
   }

   @Override
   public void a(esb $$0, long $$1) {
      this.u.computeIfAbsent($$0, $$0x -> new LongOpenHashSet()).add($$1);
      this.i();
   }

   @Override
   public Map<esb, LongSet> h() {
      return Collections.unmodifiableMap(this.u);
   }

   @Override
   public void b(Map<esb, LongSet> $$0) {
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

   public abstract eec n();

   public eec o() {
      eec $$0 = this.n();
      egr $$1 = this.z();
      if ($$1 != null) {
         eec $$2 = $$1.a();
         return eec.a($$2, $$0);
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
      iv $$1 = dyc.b($$0);
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
   public final void a(BiConsumer<iv, ebe> $$0) {
      this.a($$0x -> $$0x.k() != 0, $$0);
   }

   public void a(Predicate<ebe> $$0, BiConsumer<iv, ebe> $$1) {
      iv.a $$2 = new iv.a();

      for (int $$3 = this.aq(); $$3 <= this.ar(); $$3++) {
         edm $$4 = this.b(this.g($$3));
         if ($$4.a($$0)) {
            iv $$5 = jy.a(this.c, $$3).j();

            for (int $$6 = 0; $$6 < 16; $$6++) {
               for (int $$7 = 0; $$7 < 16; $$7++) {
                  for (int $$8 = 0; $$8 < 16; $$8++) {
                     ebe $$9 = $$4.a($$8, $$6, $$7);
                     if ($$0.test($$9)) {
                        $$1.accept($$2.a($$5, $$8, $$6, $$7), $$9);
                     }
                  }
               }
            }
         }
      }
   }

   public abstract fhl<dnc> q();

   public abstract fhl<exn> r();

   public boolean s() {
      return true;
   }

   public abstract edb.a a(long var1);

   public edy t() {
      return this.e;
   }

   public boolean u() {
      return this.f != null;
   }

   @Nullable
   public eig v() {
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

   public ehh a(Function<edb, ehh> $$0) {
      if (this.d == null) {
         this.d = $$0.apply(this);
      }

      return this.d;
   }

   @Deprecated
   public dlb a(Supplier<dlb> $$0) {
      if (this.s == null) {
         this.s = $$0.get();
      }

      return this.s;
   }

   @Override
   public jf<dla> getNoiseBiome(int $$0, int $$1, int $$2) {
      try {
         int $$3 = jq.a(this.K_());
         int $$4 = $$3 + jq.a(this.L_()) - 1;
         int $$5 = azo.a($$1, $$3, $$4);
         int $$6 = this.f(jq.c($$5));
         return this.m[$$6].c($$0 & 3, $$5 & 3, $$2 & 3);
      } catch (Throwable var8) {
         p $$8 = p.a(var8, "Getting biome");
         q $$9 = $$8.a("Biome being got");
         $$9.a("Location", () -> q.a(this, $$0, $$1, $$2));
         throw new aa($$8);
      }
   }

   public void a(dld $$0, dlj.f $$1) {
      djc $$2 = this.f();
      int $$3 = jq.a($$2.d());
      int $$4 = jq.a($$2.e());
      djz $$5 = this.B();

      for (int $$6 = $$5.aq(); $$6 <= $$5.ar(); $$6++) {
         edm $$7 = this.b(this.g($$6));
         int $$8 = jq.d($$6);
         $$7.a($$0, $$1, $$3, $$8, $$4);
      }
   }

   public boolean y() {
      return !this.h().isEmpty();
   }

   @Nullable
   public egr z() {
      return null;
   }

   public boolean A() {
      return this.z() != null;
   }

   public djz B() {
      return this;
   }

   public void C() {
      this.i.a(this);
   }

   @Override
   public ewy D() {
      return this.i;
   }

   public static record a(List<fhh<dnc>> a, List<fhh<exn>> b) {
   }
}
