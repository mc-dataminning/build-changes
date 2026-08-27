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

public abstract class ddx implements cls, cnm.a, dek, deu {
   public static final int a = -1;
   private static final Logger n = LogUtils.getLogger();
   private static final LongSet o = new LongOpenHashSet();
   protected final ShortList[] b;
   protected volatile boolean c;
   private volatile boolean p;
   protected final clt d;
   private long q;
   @Nullable
   @Deprecated
   private cnl r;
   @Nullable
   protected dho e;
   protected final dev f;
   @Nullable
   protected din g;
   protected final Map<dhk.a, dhk> h = Maps.newEnumMap(dhk.a.class);
   protected dwo i;
   private final Map<dsa, dsi> s = Maps.newHashMap();
   private final Map<dsa, LongSet> t = Maps.newHashMap();
   protected final Map<gu, qr> j = Maps.newHashMap();
   protected final Map<gu, czn> k = Maps.newHashMap();
   protected final cmo l;
   protected final dej[] m;

   public ddx(clt $$0, dev $$1, cmo $$2, hr<cnk> $$3, long $$4, @Nullable dej[] $$5, @Nullable din $$6) {
      this.d = $$0;
      this.f = $$1;
      this.l = $$2;
      this.m = new dej[$$2.ak()];
      this.q = $$4;
      this.b = new ShortList[$$2.ak()];
      this.g = $$6;
      this.i = new dwo($$2);
      if ($$5 != null) {
         if (this.m.length == $$5.length) {
            System.arraycopy($$5, 0, this.m, 0, this.m.length);
         } else {
            n.warn("Could not set level chunk sections, array length is {} instead of {}", $$5.length, this.m.length);
         }
      }

      a($$3, this.m);
   }

   private static void a(hr<cnk> $$0, dej[] $$1) {
      for (int $$2 = 0; $$2 < $$1.length; $$2++) {
         if ($$1[$$2] == null) {
            $$1[$$2] = new dej($$0);
         }
      }
   }

   public dgo a(int $$0) {
      return dgo.a;
   }

   @Nullable
   public abstract dcb a(gu var1, dcb var2, boolean var3);

   public abstract void a(czn var1);

   public abstract void a(bfj var1);

   public int a() {
      dej[] $$0 = this.d();

      for (int $$1 = $$0.length - 1; $$1 >= 0; $$1--) {
         dej $$2 = $$0[$$1];
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
      return $$0 == -1 ? this.C_() : hx.c(this.g($$0));
   }

   public Set<gu> c() {
      Set<gu> $$0 = Sets.newHashSet(this.j.keySet());
      $$0.addAll(this.k.keySet());
      return $$0;
   }

   public dej[] d() {
      return this.m;
   }

   public dej b(int $$0) {
      return this.d()[$$0];
   }

   public Collection<Entry<dhk.a, dhk>> e() {
      return Collections.unmodifiableSet(this.h.entrySet());
   }

   public void a(dhk.a $$0, long[] $$1) {
      this.a($$0).a(this, $$0, $$1);
   }

   public dhk a(dhk.a $$0) {
      return this.h.computeIfAbsent($$0, $$0x -> new dhk(this, $$0x));
   }

   public boolean b(dhk.a $$0) {
      return this.h.get($$0) != null;
   }

   public int a(dhk.a $$0, int $$1, int $$2) {
      dhk $$3 = this.h.get($$0);
      if ($$3 == null) {
         if (aa.aS && this instanceof dei) {
            n.error("Unprimed heightmap: " + $$0 + " " + $$1 + " " + $$2);
         }

         dhk.a(this, EnumSet.of($$0));
         $$3 = this.h.get($$0);
      }

      return $$3.a($$1 & 15, $$2 & 15) - 1;
   }

   public clt f() {
      return this.d;
   }

   @Nullable
   @Override
   public dsi a(dsa $$0) {
      return this.s.get($$0);
   }

   @Override
   public void a(dsa $$0, dsi $$1) {
      this.s.put($$0, $$1);
      this.c = true;
   }

   public Map<dsa, dsi> g() {
      return Collections.unmodifiableMap(this.s);
   }

   public void a(Map<dsa, dsi> $$0) {
      this.s.clear();
      this.s.putAll($$0);
      this.c = true;
   }

   @Override
   public LongSet b(dsa $$0) {
      return this.t.getOrDefault($$0, o);
   }

   @Override
   public void a(dsa $$0, long $$1) {
      this.t.computeIfAbsent($$0, $$0x -> new LongOpenHashSet()).add($$1);
      this.c = true;
   }

   @Override
   public Map<dsa, LongSet> h() {
      return Collections.unmodifiableMap(this.t);
   }

   @Override
   public void b(Map<dsa, LongSet> $$0) {
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

   public abstract dec j();

   public dec k() {
      dec $$0 = this.j();
      dgy $$1 = this.x();
      if ($$1 != null) {
         dec $$2 = $$1.a();
         return $$2.b($$0) ? $$2 : $$0;
      } else {
         return $$0;
      }
   }

   public abstract void d(gu var1);

   public void e(gu $$0) {
      n.warn("Trying to mark a block for PostProcessing @ {}, but this operation is not supported.", $$0);
   }

   public ShortList[] n() {
      return this.b;
   }

   public void a(short $$0, int $$1) {
      a(this.n(), $$1).add($$0);
   }

   public void a(qr $$0) {
      this.j.put(czn.c($$0), $$0);
   }

   @Nullable
   public qr f(gu $$0) {
      return this.j.get($$0);
   }

   @Nullable
   public abstract qr g(gu var1);

   @Override
   public final void a(BiConsumer<gu, dcb> $$0) {
      this.a($$0x -> $$0x.h() != 0, $$0);
   }

   public void a(Predicate<dcb> $$0, BiConsumer<gu, dcb> $$1) {
      gu.a $$2 = new gu.a();

      for (int $$3 = this.al(); $$3 < this.am(); $$3++) {
         dej $$4 = this.b(this.f($$3));
         if ($$4.a($$0)) {
            gu $$5 = hx.a(this.d, $$3).j();

            for (int $$6 = 0; $$6 < 16; $$6++) {
               for (int $$7 = 0; $$7 < 16; $$7++) {
                  for (int $$8 = 0; $$8 < 16; $$8++) {
                     dcb $$9 = $$4.a($$8, $$6, $$7);
                     if ($$0.test($$9)) {
                        $$1.accept($$2.a($$5, $$8, $$6, $$7), $$9);
                     }
                  }
               }
            }
         }
      }
   }

   public abstract efw<cpn> o();

   public abstract efw<dxd> p();

   public abstract ddx.a q();

   public dev r() {
      return this.f;
   }

   public boolean s() {
      return this.g != null;
   }

   @Nullable
   public din t() {
      return this.g;
   }

   public void a(din $$0) {
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

   public dho a(Function<ddx, dho> $$0) {
      if (this.e == null) {
         this.e = $$0.apply(this);
      }

      return this.e;
   }

   @Deprecated
   public cnl a(Supplier<cnl> $$0) {
      if (this.r == null) {
         this.r = $$0.get();
      }

      return this.r;
   }

   @Override
   public he<cnk> getNoiseBiome(int $$0, int $$1, int $$2) {
      try {
         int $$3 = hq.a(this.C_());
         int $$4 = $$3 + hq.a(this.D_()) - 1;
         int $$5 = apa.a($$1, $$3, $$4);
         int $$6 = this.e(hq.c($$5));
         return this.m[$$6].c($$0 & 3, $$5 & 3, $$2 & 3);
      } catch (Throwable var8) {
         o $$8 = o.a(var8, "Getting biome");
         p $$9 = $$8.a("Biome being got");
         $$9.a("Location", () -> p.a(this, $$0, $$1, $$2));
         throw new y($$8);
      }
   }

   public void a(cnn $$0, cnt.f $$1) {
      clt $$2 = this.f();
      int $$3 = hq.a($$2.d());
      int $$4 = hq.a($$2.e());
      cmo $$5 = this.z();

      for (int $$6 = $$5.al(); $$6 < $$5.am(); $$6++) {
         dej $$7 = this.b(this.f($$6));
         int $$8 = hq.d($$6);
         $$7.a($$0, $$1, $$3, $$8, $$4);
      }
   }

   public boolean w() {
      return !this.h().isEmpty();
   }

   @Nullable
   public dgy x() {
      return null;
   }

   public boolean y() {
      return this.x() != null;
   }

   public cmo z() {
      return this;
   }

   public void A() {
      this.i.a(this);
   }

   @Override
   public dwo B() {
      return this.i;
   }

   public static record a(efu<cpn> a, efu<dxd> b) {
   }
}
