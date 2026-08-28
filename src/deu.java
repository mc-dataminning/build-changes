import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.google.common.collect.ImmutableMap;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2ByteLinkedOpenHashMap;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class deu extends drw implements dbs {
   public static final MapCodec<deu> p = b(deu::new);
   private static final Logger a = LogUtils.getLogger();
   private final ji.c<deu> b = lp.e.f(this);
   public static final jo<drx> q = new jo<>();
   private static final LoadingCache<ewf, Boolean> c = CacheBuilder.newBuilder().maximumSize(512L).weakKeys().build(new CacheLoader<ewf, Boolean>() {
      public Boolean a(ewf $$0) {
         return !ewc.c(ewc.b(), $$0, evq.g);
      }
   });
   public static final int r = 1;
   public static final int s = 2;
   public static final int t = 4;
   public static final int u = 8;
   public static final int v = 16;
   public static final int w = 32;
   public static final int x = 64;
   public static final int y = 4;
   public static final int z = 3;
   public static final int A = 11;
   public static final float B = -1.0F;
   public static final float C = 0.0F;
   public static final int D = 512;
   protected final dry<deu, drx> E;
   private drx d;
   @Nullable
   private String e;
   @Nullable
   private cuf f;
   private static final int g = 2048;
   private static final ThreadLocal<Object2ByteLinkedOpenHashMap<deu.a>> h = ThreadLocal.withInitial(() -> {
      Object2ByteLinkedOpenHashMap<deu.a> $$0 = new Object2ByteLinkedOpenHashMap<deu.a>(2048, 0.25F) {
         protected void rehash(int $$0) {
         }
      };
      $$0.defaultReturnValue((byte)127);
      return $$0;
   });

   @Override
   protected MapCodec<? extends deu> a() {
      return p;
   }

   public static int i(@Nullable drx $$0) {
      if ($$0 == null) {
         return 0;
      } else {
         int $$1 = q.a($$0);
         return $$1 == -1 ? 0 : $$1;
      }
   }

   public static drx a(int $$0) {
      drx $$1 = q.a($$0);
      return $$1 == null ? dew.a.n() : $$1;
   }

   public static deu a(@Nullable cuf $$0) {
      return $$0 instanceof csi ? ((csi)$$0).d() : dew.a;
   }

   public static drx a(drx $$0, drx $$1, dbu $$2, iz $$3) {
      ewf $$4 = ewc.b($$0.k($$2, $$3), $$1.k($$2, $$3), evq.c).a((double)$$3.u(), (double)$$3.v(), (double)$$3.w());
      if ($$4.c()) {
         return $$1;
      } else {
         for (bsp $$6 : $$2.a_(null, $$4.a())) {
            double $$7 = ewc.a(je.a.b, $$6.cK().d(0.0, 1.0, 0.0), List.of($$4), -1.0);
            $$6.d(0.0, 1.0 + $$7, 0.0);
         }

         return $$1;
      }
   }

   public static ewf a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      return ewc.a($$0 / 16.0, $$1 / 16.0, $$2 / 16.0, $$3 / 16.0, $$4 / 16.0, $$5 / 16.0);
   }

   public static drx b(drx $$0, dbu $$1, iz $$2) {
      drx $$3 = $$0;
      iz.a $$4 = new iz.a();

      for (je $$5 : aF) {
         $$4.a($$2, $$5);
         $$3 = $$3.a($$5, $$1.a_($$4), $$1, $$2, $$4);
      }

      return $$3;
   }

   public static void a(drx $$0, drx $$1, dbu $$2, iz $$3, int $$4) {
      a($$0, $$1, $$2, $$3, $$4, 512);
   }

   public static void a(drx $$0, drx $$1, dbu $$2, iz $$3, int $$4, int $$5) {
      if ($$1 != $$0) {
         if ($$1.i()) {
            if (!$$2.x_()) {
               $$2.a($$3, ($$4 & 32) == 0, null, $$5);
            }
         } else {
            $$2.a($$3, $$1, $$4 & -33, $$5);
         }
      }
   }

   public deu(drw.d $$0) {
      super($$0);
      dry.a<deu, drx> $$1 = new dry.a<>(this);
      this.a($$1);
      this.E = $$1.a(deu::n, drx::new);
      this.k(this.E.b());
      if (aa.aX) {
         String $$2 = this.getClass().getSimpleName();
         if (!$$2.endsWith("Block")) {
            a.error("Block classes should end with Block and {} doesn't.", $$2);
         }
      }
   }

   public static boolean j(drx $$0) {
      return $$0.b() instanceof dje || $$0.a(dew.hW) || $$0.a(dew.ee) || $$0.a(dew.ef) || $$0.a(dew.fa) || $$0.a(dew.eZ) || $$0.a(awl.aR);
   }

   public static boolean a(drx $$0, daz $$1, iz $$2, je $$3, iz $$4) {
      drx $$5 = $$1.a_($$4);
      if ($$0.a($$5, $$3)) {
         return false;
      } else if ($$5.p()) {
         deu.a $$6 = new deu.a($$0, $$5, $$3);
         Object2ByteLinkedOpenHashMap<deu.a> $$7 = h.get();
         byte $$8 = $$7.getAndMoveToFirst($$6);
         if ($$8 != 127) {
            return $$8 != 0;
         } else {
            ewf $$9 = $$0.a($$1, $$2, $$3);
            if ($$9.c()) {
               return true;
            } else {
               ewf $$10 = $$5.a($$1, $$4, $$3.g());
               boolean $$11 = ewc.c($$9, $$10, evq.e);
               if ($$7.size() == 2048) {
                  $$7.removeLastByte();
               }

               $$7.putAndMoveToFirst($$6, (byte)($$11 ? 1 : 0));
               return $$11;
            }
         }
      } else {
         return true;
      }
   }

   public static boolean c(daz $$0, iz $$1) {
      return $$0.a_($$1).a($$0, $$1, je.b, dmv.c);
   }

   public static boolean a(dbw $$0, iz $$1, je $$2) {
      drx $$3 = $$0.a_($$1);
      return $$2 == je.a && $$3.a(awl.aZ) ? false : $$3.a($$0, $$1, $$2, dmv.b);
   }

   public static boolean a(ewf $$0, je $$1) {
      ewf $$2 = $$0.a($$1);
      return a($$2);
   }

   public static boolean a(ewf $$0) {
      return (Boolean)c.getUnchecked($$0);
   }

   public void a(drx $$0, dbt $$1, iz $$2, azc $$3) {
   }

   public void a(dbu $$0, iz $$1, drx $$2) {
   }

   public static List<cuk> a(drx $$0, arb $$1, iz $$2, @Nullable dpc $$3) {
      eqg.a $$4 = new eqg.a($$1).a(esz.f, evm.b($$2)).a(esz.i, cuk.l).b(esz.h, $$3);
      return $$0.a($$4);
   }

   public static List<cuk> a(drx $$0, arb $$1, iz $$2, @Nullable dpc $$3, @Nullable bsp $$4, cuk $$5) {
      eqg.a $$6 = new eqg.a($$1).a(esz.f, evm.b($$2)).a(esz.i, $$5).b(esz.a, $$4).b(esz.h, $$3);
      return $$0.a($$6);
   }

   public static void c(drx $$0, dbt $$1, iz $$2) {
      if ($$1 instanceof arb) {
         a($$0, (arb)$$1, $$2, null).forEach($$2x -> a($$1, $$2, $$2x));
         $$0.a((arb)$$1, $$2, cuk.l, true);
      }
   }

   public static void a(drx $$0, dbu $$1, iz $$2, @Nullable dpc $$3) {
      if ($$1 instanceof arb) {
         a($$0, (arb)$$1, $$2, $$3).forEach($$2x -> a((dbt)((arb)$$1), $$2, $$2x));
         $$0.a((arb)$$1, $$2, cuk.l, true);
      }
   }

   public static void a(drx $$0, dbt $$1, iz $$2, @Nullable dpc $$3, @Nullable bsp $$4, cuk $$5) {
      if ($$1 instanceof arb) {
         a($$0, (arb)$$1, $$2, $$3, $$4, $$5).forEach($$2x -> a($$1, $$2, $$2x));
         $$0.a((arb)$$1, $$2, $$5, true);
      }
   }

   public static void a(dbt $$0, iz $$1, cuk $$2) {
      double $$3 = (double)bsv.ag.m() / 2.0;
      double $$4 = (double)$$1.u() + 0.5 + ayu.a($$0.z, -0.25, 0.25);
      double $$5 = (double)$$1.v() + 0.5 + ayu.a($$0.z, -0.25, 0.25) - $$3;
      double $$6 = (double)$$1.w() + 0.5 + ayu.a($$0.z, -0.25, 0.25);
      a($$0, () -> new cjc($$0, $$4, $$5, $$6, $$2), $$2);
   }

   public static void a(dbt $$0, iz $$1, je $$2, cuk $$3) {
      int $$4 = $$2.j();
      int $$5 = $$2.k();
      int $$6 = $$2.l();
      double $$7 = (double)bsv.ag.l() / 2.0;
      double $$8 = (double)bsv.ag.m() / 2.0;
      double $$9 = (double)$$1.u() + 0.5 + ($$4 == 0 ? ayu.a($$0.z, -0.25, 0.25) : (double)$$4 * (0.5 + $$7));
      double $$10 = (double)$$1.v() + 0.5 + ($$5 == 0 ? ayu.a($$0.z, -0.25, 0.25) : (double)$$5 * (0.5 + $$8)) - $$8;
      double $$11 = (double)$$1.w() + 0.5 + ($$6 == 0 ? ayu.a($$0.z, -0.25, 0.25) : (double)$$6 * (0.5 + $$7));
      double $$12 = $$4 == 0 ? ayu.a($$0.z, -0.1, 0.1) : (double)$$4 * 0.1;
      double $$13 = $$5 == 0 ? ayu.a($$0.z, 0.0, 0.1) : (double)$$5 * 0.1 + 0.1;
      double $$14 = $$6 == 0 ? ayu.a($$0.z, -0.1, 0.1) : (double)$$6 * 0.1;
      a($$0, () -> new cjc($$0, $$9, $$10, $$11, $$3, $$12, $$13, $$14), $$3);
   }

   private static void a(dbt $$0, Supplier<cjc> $$1, cuk $$2) {
      if (!$$0.B && !$$2.e() && $$0.ab().b(dbp.h)) {
         cjc $$3 = $$1.get();
         $$3.v();
         $$0.b($$3);
      }
   }

   protected void a(arb $$0, iz $$1, int $$2) {
      if ($$0.ab().b(dbp.h)) {
         bta.a($$0, evm.b($$1), $$2);
      }
   }

   public float e() {
      return this.aH;
   }

   public void a(dbt $$0, iz $$1, dbl $$2) {
   }

   public void a(dbt $$0, iz $$1, drx $$2, bsp $$3) {
   }

   @Nullable
   public drx a(cxv $$0) {
      return this.n();
   }

   public void a(dbt $$0, cms $$1, iz $$2, drx $$3, @Nullable dpc $$4, cuk $$5) {
      $$1.b(awg.a.b(this));
      $$1.C(0.005F);
      a($$3, $$0, $$2, $$4, $$1, $$5);
   }

   public void a(dbt $$0, iz $$1, drx $$2, @Nullable btk $$3, cuk $$4) {
   }

   public boolean a(drx $$0) {
      return !$$0.e() && !$$0.k();
   }

   public xz f() {
      return xl.c(this.g());
   }

   public String g() {
      if (this.e == null) {
         this.e = ac.a("block", lp.e.b(this));
      }

      return this.e;
   }

   public void a(dbt $$0, drx $$1, iz $$2, bsp $$3, float $$4) {
      $$3.a($$4, 1.0F, $$3.dQ().k());
   }

   public void a(daz $$0, bsp $$1) {
      $$1.h($$1.ds().d(1.0, 0.0, 1.0));
   }

   public cuk a(dbw $$0, iz $$1, drx $$2) {
      return new cuk(this);
   }

   public float h() {
      return this.aK;
   }

   public float j() {
      return this.aL;
   }

   public float k() {
      return this.aM;
   }

   protected void a(dbt $$0, cms $$1, iz $$2, drx $$3) {
      $$0.a($$1, 2001, $$2, i($$3));
   }

   public drx a(dbt $$0, iz $$1, drx $$2, cms $$3) {
      this.a($$0, $$3, $$1, $$2);
      if ($$2.a(awl.aW)) {
         clj.a($$3, false);
      }

      $$0.a(dwq.f, $$1, dwq.a.a($$3, $$2));
      return $$2;
   }

   public void a(drx $$0, dbt $$1, iz $$2, dcs.c $$3) {
   }

   public boolean a(dbl $$0) {
      return true;
   }

   protected void a(dry.a<deu, drx> $$0) {
   }

   public dry<deu, drx> l() {
      return this.E;
   }

   protected final void k(drx $$0) {
      this.d = $$0;
   }

   public final drx n() {
      return this.d;
   }

   public final drx l(drx $$0) {
      drx $$1 = this.n();

      for (dta<?> $$2 : $$0.b().l().d()) {
         if ($$1.b($$2)) {
            $$1 = a($$0, $$1, $$2);
         }
      }

      return $$1;
   }

   private static <T extends Comparable<T>> drx a(drx $$0, drx $$1, dta<T> $$2) {
      return $$1.a($$2, $$0.c($$2));
   }

   @Override
   public cuf r() {
      if (this.f == null) {
         this.f = cuf.a(this);
      }

      return this.f;
   }

   public boolean o() {
      return this.aN;
   }

   @Override
   public String toString() {
      return "Block{" + lp.e.b(this) + "}";
   }

   public void a(cuk $$0, cuf.b $$1, List<xl> $$2, cwd $$3) {
   }

   @Override
   protected deu p() {
      return this;
   }

   protected ImmutableMap<drx, ewf> a(Function<drx, ewf> $$0) {
      return this.E.a().stream().collect(ImmutableMap.toImmutableMap(Function.identity(), $$0));
   }

   @Deprecated
   public ji.c<deu> q() {
      return this.b;
   }

   protected void a(arb $$0, iz $$1, cuk $$2, bpu $$3) {
      if (czw.a(czy.v, $$2) == 0) {
         int $$4 = $$3.a($$0.z);
         if ($$4 > 0) {
            this.a($$0, $$1, $$4);
         }
      }
   }

   public static final class a {
      private final drx a;
      private final drx b;
      private final je c;

      public a(drx $$0, drx $$1, je $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else {
            return !($$0 instanceof deu.a $$1) ? false : this.a == $$1.a && this.b == $$1.b && this.c == $$1.c;
         }
      }

      @Override
      public int hashCode() {
         int $$0 = this.a.hashCode();
         $$0 = 31 * $$0 + this.b.hashCode();
         return 31 * $$0 + this.c.hashCode();
      }
   }
}
