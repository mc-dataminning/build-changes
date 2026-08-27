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

public abstract class dhf implements cpb, cqv.a, dhs, dic {
   public static final int a = -1;
   private static final Logger n = LogUtils.getLogger();
   private static final LongSet o = new LongOpenHashSet();
   protected final ShortList[] b;
   protected volatile boolean c;
   private volatile boolean p;
   protected final cpc d;
   private long q;
   @Nullable
   @Deprecated
   private cqu r;
   @Nullable
   protected dkw e;
   protected final did f;
   @Nullable
   protected dlv g;
   protected final Map<dks.a, dks> h = Maps.newEnumMap(dks.a.class);
   protected dzw i;
   private final Map<dvi, dvq> s = Maps.newHashMap();
   private final Map<dvi, LongSet> t = Maps.newHashMap();
   protected final Map<gw, qy> j = Maps.newHashMap();
   protected final Map<gw, dcv> k = Maps.newHashMap();
   protected final cpx l;
   protected final dhr[] m;

   public dhf(cpc $$0, did $$1, cpx $$2, ht<cqt> $$3, long $$4, @Nullable dhr[] $$5, @Nullable dlv $$6) {
      this.d = $$0;
      this.f = $$1;
      this.l = $$2;
      this.m = new dhr[$$2.ak()];
      this.q = $$4;
      this.b = new ShortList[$$2.ak()];
      this.g = $$6;
      this.i = new dzw($$2);
      if ($$5 != null) {
         if (this.m.length == $$5.length) {
            System.arraycopy($$5, 0, this.m, 0, this.m.length);
         } else {
            n.warn("Could not set level chunk sections, array length is {} instead of {}", $$5.length, this.m.length);
         }
      }

      a($$3, this.m);
   }

   private static void a(ht<cqt> $$0, dhr[] $$1) {
      for (int $$2 = 0; $$2 < $$1.length; $$2++) {
         if ($$1[$$2] == null) {
            $$1[$$2] = new dhr($$0);
         }
      }
   }

   public djw a(int $$0) {
      return djw.a;
   }

   @Nullable
   public abstract dfj a(gw var1, dfj var2, boolean var3);

   public abstract void a(dcv var1);

   public abstract void a(biq var1);

   public int a() {
      dhr[] $$0 = this.d();

      for (int $$1 = $$0.length - 1; $$1 >= 0; $$1--) {
         dhr $$2 = $$0[$$1];
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
      return $$0 == -1 ? this.H_() : hz.c(this.g($$0));
   }

   public Set<gw> c() {
      Set<gw> $$0 = Sets.newHashSet(this.j.keySet());
      $$0.addAll(this.k.keySet());
      return $$0;
   }

   public dhr[] d() {
      return this.m;
   }

   public dhr b(int $$0) {
      return this.d()[$$0];
   }

   public Collection<Entry<dks.a, dks>> e() {
      return Collections.unmodifiableSet(this.h.entrySet());
   }

   public void a(dks.a $$0, long[] $$1) {
      this.a($$0).a(this, $$0, $$1);
   }

   public dks a(dks.a $$0) {
      return this.h.computeIfAbsent($$0, $$0x -> new dks(this, $$0x));
   }

   public boolean b(dks.a $$0) {
      return this.h.get($$0) != null;
   }

   public int a(dks.a $$0, int $$1, int $$2) {
      dks $$3 = this.h.get($$0);
      if ($$3 == null) {
         if (aa.aT && this instanceof dhq) {
            n.error("Unprimed heightmap: " + $$0 + " " + $$1 + " " + $$2);
         }

         dks.a(this, EnumSet.of($$0));
         $$3 = this.h.get($$0);
      }

      return $$3.a($$1 & 15, $$2 & 15) - 1;
   }

   public cpc f() {
      return this.d;
   }

   @Nullable
   @Override
   public dvq a(dvi $$0) {
      return this.s.get($$0);
   }

   @Override
   public void a(dvi $$0, dvq $$1) {
      this.s.put($$0, $$1);
      this.c = true;
   }

   public Map<dvi, dvq> g() {
      return Collections.unmodifiableMap(this.s);
   }

   public void a(Map<dvi, dvq> $$0) {
      this.s.clear();
      this.s.putAll($$0);
      this.c = true;
   }

   @Override
   public LongSet b(dvi $$0) {
      return this.t.getOrDefault($$0, o);
   }

   @Override
   public void a(dvi $$0, long $$1) {
      this.t.computeIfAbsent($$0, $$0x -> new LongOpenHashSet()).add($$1);
      this.c = true;
   }

   @Override
   public Map<dvi, LongSet> h() {
      return Collections.unmodifiableMap(this.t);
   }

   @Override
   public void b(Map<dvi, LongSet> $$0) {
      this.t.clear();
      this.t.putAll($$0);
      this.c = true;
   }

   public boolean a(int $$0, int $$1) {
      if ($$0 < this.H_()) {
         $$0 = this.H_();
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

   public abstract dhk j();

   public dhk k() {
      dhk $$0 = this.j();
      dkg $$1 = this.x();
      if ($$1 != null) {
         dhk $$2 = $$1.a();
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

   public void a(qy $$0) {
      this.j.put(dcv.c($$0), $$0);
   }

   @Nullable
   public qy f(gw $$0) {
      return this.j.get($$0);
   }

   @Nullable
   public abstract qy g(gw var1);

   @Override
   public final void a(BiConsumer<gw, dfj> $$0) {
      this.a($$0x -> $$0x.h() != 0, $$0);
   }

   public void a(Predicate<dfj> $$0, BiConsumer<gw, dfj> $$1) {
      gw.a $$2 = new gw.a();

      for (int $$3 = this.al(); $$3 < this.am(); $$3++) {
         dhr $$4 = this.b(this.f($$3));
         if ($$4.a($$0)) {
            gw $$5 = hz.a(this.d, $$3).j();

            for (int $$6 = 0; $$6 < 16; $$6++) {
               for (int $$7 = 0; $$7 < 16; $$7++) {
                  for (int $$8 = 0; $$8 < 16; $$8++) {
                     dfj $$9 = $$4.a($$8, $$6, $$7);
                     if ($$0.test($$9)) {
                        $$1.accept($$2.a($$5, $$8, $$6, $$7), $$9);
                     }
                  }
               }
            }
         }
      }
   }

   public abstract ejc<csv> o();

   public abstract ejc<eal> p();

   public abstract dhf.a q();

   public did r() {
      return this.f;
   }

   public boolean s() {
      return this.g != null;
   }

   @Nullable
   public dlv t() {
      return this.g;
   }

   public void a(dlv $$0) {
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
   public int H_() {
      return this.l.H_();
   }

   @Override
   public int I_() {
      return this.l.I_();
   }

   public dkw a(Function<dhf, dkw> $$0) {
      if (this.e == null) {
         this.e = $$0.apply(this);
      }

      return this.e;
   }

   @Deprecated
   public cqu a(Supplier<cqu> $$0) {
      if (this.r == null) {
         this.r = $$0.get();
      }

      return this.r;
   }

   @Override
   public hg<cqt> getNoiseBiome(int $$0, int $$1, int $$2) {
      try {
         int $$3 = hs.a(this.H_());
         int $$4 = $$3 + hs.a(this.I_()) - 1;
         int $$5 = arx.a($$1, $$3, $$4);
         int $$6 = this.e(hs.c($$5));
         return this.m[$$6].c($$0 & 3, $$5 & 3, $$2 & 3);
      } catch (Throwable var8) {
         o $$8 = o.a(var8, "Getting biome");
         p $$9 = $$8.a("Biome being got");
         $$9.a("Location", () -> p.a(this, $$0, $$1, $$2));
         throw new y($$8);
      }
   }

   public void a(cqw $$0, crc.f $$1) {
      cpc $$2 = this.f();
      int $$3 = hs.a($$2.d());
      int $$4 = hs.a($$2.e());
      cpx $$5 = this.z();

      for (int $$6 = $$5.al(); $$6 < $$5.am(); $$6++) {
         dhr $$7 = this.b(this.f($$6));
         int $$8 = hs.d($$6);
         $$7.a($$0, $$1, $$3, $$8, $$4);
      }
   }

   public boolean w() {
      return !this.h().isEmpty();
   }

   @Nullable
   public dkg x() {
      return null;
   }

   public boolean y() {
      return this.x() != null;
   }

   public cpx z() {
      return this;
   }

   public void A() {
      this.i.a(this);
   }

   @Override
   public dzw B() {
      return this.i;
   }

   public static record a(eja<csv> a, eja<eal> b) {
   }
}
