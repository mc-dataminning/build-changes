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

public abstract class dhh implements cpd, cqx.a, dhu, die {
   public static final int a = -1;
   private static final Logger n = LogUtils.getLogger();
   private static final LongSet o = new LongOpenHashSet();
   protected final ShortList[] b;
   protected volatile boolean c;
   private volatile boolean p;
   protected final cpe d;
   private long q;
   @Nullable
   @Deprecated
   private cqw r;
   @Nullable
   protected dky e;
   protected final dif f;
   @Nullable
   protected dlx g;
   protected final Map<dku.a, dku> h = Maps.newEnumMap(dku.a.class);
   protected dzy i;
   private final Map<dvk, dvs> s = Maps.newHashMap();
   private final Map<dvk, LongSet> t = Maps.newHashMap();
   protected final Map<gw, qy> j = Maps.newHashMap();
   protected final Map<gw, dcx> k = Maps.newHashMap();
   protected final cpz l;
   protected final dht[] m;

   public dhh(cpe $$0, dif $$1, cpz $$2, ht<cqv> $$3, long $$4, @Nullable dht[] $$5, @Nullable dlx $$6) {
      this.d = $$0;
      this.f = $$1;
      this.l = $$2;
      this.m = new dht[$$2.ak()];
      this.q = $$4;
      this.b = new ShortList[$$2.ak()];
      this.g = $$6;
      this.i = new dzy($$2);
      if ($$5 != null) {
         if (this.m.length == $$5.length) {
            System.arraycopy($$5, 0, this.m, 0, this.m.length);
         } else {
            n.warn("Could not set level chunk sections, array length is {} instead of {}", $$5.length, this.m.length);
         }
      }

      a($$3, this.m);
   }

   private static void a(ht<cqv> $$0, dht[] $$1) {
      for (int $$2 = 0; $$2 < $$1.length; $$2++) {
         if ($$1[$$2] == null) {
            $$1[$$2] = new dht($$0);
         }
      }
   }

   public djy a(int $$0) {
      return djy.a;
   }

   @Nullable
   public abstract dfl a(gw var1, dfl var2, boolean var3);

   public abstract void a(dcx var1);

   public abstract void a(bis var1);

   public int a() {
      dht[] $$0 = this.d();

      for (int $$1 = $$0.length - 1; $$1 >= 0; $$1--) {
         dht $$2 = $$0[$$1];
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

   public dht[] d() {
      return this.m;
   }

   public dht b(int $$0) {
      return this.d()[$$0];
   }

   public Collection<Entry<dku.a, dku>> e() {
      return Collections.unmodifiableSet(this.h.entrySet());
   }

   public void a(dku.a $$0, long[] $$1) {
      this.a($$0).a(this, $$0, $$1);
   }

   public dku a(dku.a $$0) {
      return this.h.computeIfAbsent($$0, $$0x -> new dku(this, $$0x));
   }

   public boolean b(dku.a $$0) {
      return this.h.get($$0) != null;
   }

   public int a(dku.a $$0, int $$1, int $$2) {
      dku $$3 = this.h.get($$0);
      if ($$3 == null) {
         if (aa.aT && this instanceof dhs) {
            n.error("Unprimed heightmap: " + $$0 + " " + $$1 + " " + $$2);
         }

         dku.a(this, EnumSet.of($$0));
         $$3 = this.h.get($$0);
      }

      return $$3.a($$1 & 15, $$2 & 15) - 1;
   }

   public cpe f() {
      return this.d;
   }

   @Nullable
   @Override
   public dvs a(dvk $$0) {
      return this.s.get($$0);
   }

   @Override
   public void a(dvk $$0, dvs $$1) {
      this.s.put($$0, $$1);
      this.c = true;
   }

   public Map<dvk, dvs> g() {
      return Collections.unmodifiableMap(this.s);
   }

   public void a(Map<dvk, dvs> $$0) {
      this.s.clear();
      this.s.putAll($$0);
      this.c = true;
   }

   @Override
   public LongSet b(dvk $$0) {
      return this.t.getOrDefault($$0, o);
   }

   @Override
   public void a(dvk $$0, long $$1) {
      this.t.computeIfAbsent($$0, $$0x -> new LongOpenHashSet()).add($$1);
      this.c = true;
   }

   @Override
   public Map<dvk, LongSet> h() {
      return Collections.unmodifiableMap(this.t);
   }

   @Override
   public void b(Map<dvk, LongSet> $$0) {
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

   public abstract dhm j();

   public dhm k() {
      dhm $$0 = this.j();
      dki $$1 = this.x();
      if ($$1 != null) {
         dhm $$2 = $$1.a();
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
      this.j.put(dcx.c($$0), $$0);
   }

   @Nullable
   public qy f(gw $$0) {
      return this.j.get($$0);
   }

   @Nullable
   public abstract qy g(gw var1);

   @Override
   public final void a(BiConsumer<gw, dfl> $$0) {
      this.a($$0x -> $$0x.h() != 0, $$0);
   }

   public void a(Predicate<dfl> $$0, BiConsumer<gw, dfl> $$1) {
      gw.a $$2 = new gw.a();

      for (int $$3 = this.al(); $$3 < this.am(); $$3++) {
         dht $$4 = this.b(this.f($$3));
         if ($$4.a($$0)) {
            gw $$5 = hz.a(this.d, $$3).j();

            for (int $$6 = 0; $$6 < 16; $$6++) {
               for (int $$7 = 0; $$7 < 16; $$7++) {
                  for (int $$8 = 0; $$8 < 16; $$8++) {
                     dfl $$9 = $$4.a($$8, $$6, $$7);
                     if ($$0.test($$9)) {
                        $$1.accept($$2.a($$5, $$8, $$6, $$7), $$9);
                     }
                  }
               }
            }
         }
      }
   }

   public abstract eje<csx> o();

   public abstract eje<ean> p();

   public abstract dhh.a q();

   public dif r() {
      return this.f;
   }

   public boolean s() {
      return this.g != null;
   }

   @Nullable
   public dlx t() {
      return this.g;
   }

   public void a(dlx $$0) {
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

   public dky a(Function<dhh, dky> $$0) {
      if (this.e == null) {
         this.e = $$0.apply(this);
      }

      return this.e;
   }

   @Deprecated
   public cqw a(Supplier<cqw> $$0) {
      if (this.r == null) {
         this.r = $$0.get();
      }

      return this.r;
   }

   @Override
   public hg<cqv> getNoiseBiome(int $$0, int $$1, int $$2) {
      try {
         int $$3 = hs.a(this.H_());
         int $$4 = $$3 + hs.a(this.I_()) - 1;
         int $$5 = ary.a($$1, $$3, $$4);
         int $$6 = this.e(hs.c($$5));
         return this.m[$$6].c($$0 & 3, $$5 & 3, $$2 & 3);
      } catch (Throwable var8) {
         o $$8 = o.a(var8, "Getting biome");
         p $$9 = $$8.a("Biome being got");
         $$9.a("Location", () -> p.a(this, $$0, $$1, $$2));
         throw new y($$8);
      }
   }

   public void a(cqy $$0, cre.f $$1) {
      cpe $$2 = this.f();
      int $$3 = hs.a($$2.d());
      int $$4 = hs.a($$2.e());
      cpz $$5 = this.z();

      for (int $$6 = $$5.al(); $$6 < $$5.am(); $$6++) {
         dht $$7 = this.b(this.f($$6));
         int $$8 = hs.d($$6);
         $$7.a($$0, $$1, $$3, $$8, $$4);
      }
   }

   public boolean w() {
      return !this.h().isEmpty();
   }

   @Nullable
   public dki x() {
      return null;
   }

   public boolean y() {
      return this.x() != null;
   }

   public cpz z() {
      return this;
   }

   public void A() {
      this.i.a(this);
   }

   @Override
   public dzy B() {
      return this.i;
   }

   public static record a(ejc<csx> a, ejc<ean> b) {
   }
}
