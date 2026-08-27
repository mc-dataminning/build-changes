import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import it.unimi.dsi.fastutil.shorts.ShortArrayList;
import it.unimi.dsi.fastutil.shorts.ShortList;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class dha implements cow, cqq.a, dhn, dhx {
   public static final int a = -1;
   private static final Logger n = LogUtils.getLogger();
   private static final LongSet o = new LongOpenHashSet();
   protected final ShortList[] b;
   protected volatile boolean c;
   private volatile boolean p;
   protected final cox d;
   private long q;
   @Nullable
   @Deprecated
   private cqp r;
   @Nullable
   protected dkr e;
   protected final dhy f;
   @Nullable
   protected dlq g;
   protected final Map<dkn.a, dkn> h = Maps.newEnumMap(dkn.a.class);
   protected dzr i;
   private final Map<dvd, dvl> s = Maps.newHashMap();
   private final Map<dvd, LongSet> t = Maps.newHashMap();
   protected final Map<gw, qu> j = Maps.newHashMap();
   protected final Map<gw, dcq> k = Maps.newHashMap();
   protected final cps l;
   protected final dhm[] m;

   public dha(cox $$0, dhy $$1, cps $$2, ht<cqo> $$3, long $$4, @Nullable dhm[] $$5, @Nullable dlq $$6) {
      this.d = $$0;
      this.f = $$1;
      this.l = $$2;
      this.m = new dhm[$$2.ak()];
      this.q = $$4;
      this.b = new ShortList[$$2.ak()];
      this.g = $$6;
      this.i = new dzr($$2);
      if ($$5 != null) {
         if (this.m.length == $$5.length) {
            System.arraycopy($$5, 0, this.m, 0, this.m.length);
         } else {
            n.warn("Could not set level chunk sections, array length is {} instead of {}", $$5.length, this.m.length);
         }
      }

      a($$3, this.m);
   }

   private static void a(ht<cqo> $$0, dhm[] $$1) {
      for (int $$2 = 0; $$2 < $$1.length; $$2++) {
         if ($$1[$$2] == null) {
            $$1[$$2] = new dhm($$0);
         }
      }
   }

   public djr a(int $$0) {
      return djr.a;
   }

   @Nullable
   public abstract dfe a(gw var1, dfe var2, boolean var3);

   public abstract void a(dcq var1);

   public abstract void a(bil var1);

   public int a() {
      dhm[] $$0 = this.d();

      for (int $$1 = $$0.length - 1; $$1 >= 0; $$1--) {
         dhm $$2 = $$0[$$1];
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
      return $$0 == -1 ? this.C_() : hz.c(this.g($$0));
   }

   public Set<gw> c() {
      Set<gw> $$0 = Sets.newHashSet(this.j.keySet());
      $$0.addAll(this.k.keySet());
      return $$0;
   }

   public dhm[] d() {
      return this.m;
   }

   public dhm b(int $$0) {
      return this.d()[$$0];
   }

   public Collection<Entry<dkn.a, dkn>> e() {
      return Collections.unmodifiableSet(this.h.entrySet());
   }

   public void a(dkn.a $$0, long[] $$1) {
      this.a($$0).a(this, $$0, $$1);
   }

   public dkn a(dkn.a $$0) {
      return this.h.computeIfAbsent($$0, $$0x -> new dkn(this, $$0x));
   }

   public boolean b(dkn.a $$0) {
      return this.h.get($$0) != null;
   }

   public int a(dkn.a $$0, int $$1, int $$2) {
      dkn $$3 = this.h.get($$0);
      if ($$3 == null) {
         if (aa.aS && this instanceof dhl) {
            n.error("Unprimed heightmap: " + $$0 + " " + $$1 + " " + $$2);
         }

         dkn.a(this, EnumSet.of($$0));
         $$3 = this.h.get($$0);
      }

      return $$3.a($$1 & 15, $$2 & 15) - 1;
   }

   public cox f() {
      return this.d;
   }

   @Nullable
   @Override
   public dvl a(dvd $$0) {
      return this.s.get($$0);
   }

   @Override
   public void a(dvd $$0, dvl $$1) {
      this.s.put($$0, $$1);
      this.c = true;
   }

   public Map<dvd, dvl> g() {
      return Collections.unmodifiableMap(this.s);
   }

   public void a(Map<dvd, dvl> $$0) {
      this.s.clear();
      this.s.putAll($$0);
      this.c = true;
   }

   @Override
   public LongSet b(dvd $$0) {
      return this.t.getOrDefault($$0, o);
   }

   @Override
   public void a(dvd $$0, long $$1) {
      this.t.computeIfAbsent($$0, $$0x -> new LongOpenHashSet()).add($$1);
      this.c = true;
   }

   @Override
   public Map<dvd, LongSet> h() {
      return Collections.unmodifiableMap(this.t);
   }

   @Override
   public void b(Map<dvd, LongSet> $$0) {
      this.t.clear();
      this.t.putAll($$0);
      this.c = true;
   }

   public boolean a(int $$0, int $$1) {
      if ($$0 < this.C_()) {
         $$0 = this.C_();
      }

      if ($$1 >= this.aj()) {
         $$1 = this.aj() - 1;
      }

      for (int $$2 = $$0; $$2 <= $$1; $$2 += 16) {
         if (!this.b(this.e($$2)).c()) {
            return false;
         }
      }

      return true;
   }

   public void a(boolean $$0) {
      this.c = $$0;
   }

   public boolean i() {
      return this.c;
   }

   public abstract dhf j();

   public dhf k() {
      dhf $$0 = this.j();
      dkb $$1 = this.x();
      if ($$1 != null) {
         dhf $$2 = $$1.a();
         return $$2.b($$0) ? $$2 : $$0;
      } else {
         return $$0;
      }
   }

   public abstract void d(gw var1);

   public void e(gw $$0) {
      n.warn("Trying to mark a block for PostProcessing @ {}, but this operation is not supported.", $$0);
   }

   public ShortList[] n() {
      return this.b;
   }

   public void a(short $$0, int $$1) {
      a(this.n(), $$1).add($$0);
   }

   public void a(qu $$0) {
      this.j.put(dcq.c($$0), $$0);
   }

   @Nullable
   public qu f(gw $$0) {
      return this.j.get($$0);
   }

   @Nullable
   public abstract qu g(gw var1);

   @Override
   public final void a(BiConsumer<gw, dfe> $$0) {
      this.a($$0x -> $$0x.h() != 0, $$0);
   }

   public void a(Predicate<dfe> $$0, BiConsumer<gw, dfe> $$1) {
      gw.a $$2 = new gw.a();

      for (int $$3 = this.al(); $$3 < this.am(); $$3++) {
         dhm $$4 = this.b(this.f($$3));
         if ($$4.a($$0)) {
            gw $$5 = hz.a(this.d, $$3).j();

            for (int $$6 = 0; $$6 < 16; $$6++) {
               for (int $$7 = 0; $$7 < 16; $$7++) {
                  for (int $$8 = 0; $$8 < 16; $$8++) {
                     dfe $$9 = $$4.a($$8, $$6, $$7);
                     if ($$0.test($$9)) {
                        $$1.accept($$2.a($$5, $$8, $$6, $$7), $$9);
                     }
                  }
               }
            }
         }
      }
   }

   public abstract eix<csq> o();

   public abstract eix<eag> p();

   public abstract dha.a q();

   public dhy r() {
      return this.f;
   }

   public boolean s() {
      return this.g != null;
   }

   @Nullable
   public dlq t() {
      return this.g;
   }

   public void a(dlq $$0) {
      this.g = $$0;
   }

   public long u() {
      return this.q;
   }

   public void a(long $$0) {
      this.q += $$0;
   }

   public void b(long $$0) {
      this.q = $$0;
   }

   public static ShortList a(ShortList[] $$0, int $$1) {
      if ($$0[$$1] == null) {
         $$0[$$1] = new ShortArrayList();
      }

      return $$0[$$1];
   }

   public boolean v() {
      return this.p;
   }

   public void b(boolean $$0) {
      this.p = $$0;
      this.a(true);
   }

   @Override
   public int C_() {
      return this.l.C_();
   }

   @Override
   public int D_() {
      return this.l.D_();
   }

   public dkr a(Function<dha, dkr> $$0) {
      if (this.e == null) {
         this.e = $$0.apply(this);
      }

      return this.e;
   }

   @Deprecated
   public cqp a(Supplier<cqp> $$0) {
      if (this.r == null) {
         this.r = $$0.get();
      }

      return this.r;
   }

   @Override
   public hg<cqo> getNoiseBiome(int $$0, int $$1, int $$2) {
      try {
         int $$3 = hs.a(this.C_());
         int $$4 = $$3 + hs.a(this.D_()) - 1;
         int $$5 = ars.a($$1, $$3, $$4);
         int $$6 = this.e(hs.c($$5));
         return this.m[$$6].c($$0 & 3, $$5 & 3, $$2 & 3);
      } catch (Throwable var8) {
         o $$8 = o.a(var8, "Getting biome");
         p $$9 = $$8.a("Biome being got");
         $$9.a("Location", () -> p.a(this, $$0, $$1, $$2));
         throw new y($$8);
      }
   }

   public void a(cqr $$0, cqx.f $$1) {
      cox $$2 = this.f();
      int $$3 = hs.a($$2.d());
      int $$4 = hs.a($$2.e());
      cps $$5 = this.z();

      for (int $$6 = $$5.al(); $$6 < $$5.am(); $$6++) {
         dhm $$7 = this.b(this.f($$6));
         int $$8 = hs.d($$6);
         $$7.a($$0, $$1, $$3, $$8, $$4);
      }
   }

   public boolean w() {
      return !this.h().isEmpty();
   }

   @Nullable
   public dkb x() {
      return null;
   }

   public boolean y() {
      return this.x() != null;
   }

   public cps z() {
      return this;
   }

   public void A() {
      this.i.a(this);
   }

   @Override
   public dzr B() {
      return this.i;
   }

   public static record a(eiv<csq> a, eiv<eag> b) {
   }
}
