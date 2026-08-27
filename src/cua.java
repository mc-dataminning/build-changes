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

public class cua extends dga implements cqy {
   public static final MapCodec<cua> p = b(cua::new);
   private static final Logger a = LogUtils.getLogger();
   private final ib.c<cua> b = jy.f.f(this);
   public static final ii<dgb> q = new ii<>();
   private static final LoadingCache<eiy, Boolean> c = CacheBuilder.newBuilder().maximumSize(512L).weakKeys().build(new CacheLoader<eiy, Boolean>() {
      public Boolean a(eiy $$0) {
         return !eiv.c(eiv.b(), $$0, eij.g);
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
   protected final dgc<cua, dgb> E;
   private dgb d;
   @Nullable
   private String e;
   @Nullable
   private cke f;
   private static final int g = 2048;
   private static final ThreadLocal<Object2ByteLinkedOpenHashMap<cua.a>> h = ThreadLocal.withInitial(() -> {
      Object2ByteLinkedOpenHashMap<cua.a> $$0 = new Object2ByteLinkedOpenHashMap<cua.a>(2048, 0.25F) {
         protected void rehash(int $$0) {
         }
      };
      $$0.defaultReturnValue((byte)127);
      return $$0;
   });

   @Override
   protected MapCodec<? extends cua> a() {
      return p;
   }

   public static int i(@Nullable dgb $$0) {
      if ($$0 == null) {
         return 0;
      } else {
         int $$1 = q.a($$0);
         return $$1 == -1 ? 0 : $$1;
      }
   }

   public static dgb a(int $$0) {
      dgb $$1 = q.a($$0);
      return $$1 == null ? cuc.a.o() : $$1;
   }

   public static cua a(@Nullable cke $$0) {
      return $$0 instanceof cic ? ((cic)$$0).e() : cuc.a;
   }

   public static dgb a(dgb $$0, dgb $$1, cra $$2, ht $$3) {
      eiy $$4 = eiv.b($$0.k($$2, $$3), $$1.k($$2, $$3), eij.c).a((double)$$3.u(), (double)$$3.v(), (double)$$3.w());
      if ($$4.c()) {
         return $$1;
      } else {
         for (bjt $$6 : $$2.a_(null, $$4.a())) {
            double $$7 = eiv.a(hx.a.b, $$6.cG().d(0.0, 1.0, 0.0), List.of($$4), -1.0);
            $$6.c(0.0, 1.0 + $$7, 0.0);
         }

         return $$1;
      }
   }

   public static eiy a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      return eiv.a($$0 / 16.0, $$1 / 16.0, $$2 / 16.0, $$3 / 16.0, $$4 / 16.0, $$5 / 16.0);
   }

   public static dgb b(dgb $$0, cra $$1, ht $$2) {
      dgb $$3 = $$0;
      ht.a $$4 = new ht.a();

      for (hx $$5 : aF) {
         $$4.a($$2, $$5);
         $$3 = $$3.a($$5, $$1.a_($$4), $$1, $$2, $$4);
      }

      return $$3;
   }

   public static void a(dgb $$0, dgb $$1, cra $$2, ht $$3, int $$4) {
      a($$0, $$1, $$2, $$3, $$4, 512);
   }

   public static void a(dgb $$0, dgb $$1, cra $$2, ht $$3, int $$4, int $$5) {
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

   public cua(dga.d $$0) {
      super($$0);
      dgc.a<cua, dgb> $$1 = new dgc.a<>(this);
      this.a($$1);
      this.E = $$1.a(cua::o, dgb::new);
      this.k(this.E.b());
      if (aa.aT) {
         String $$2 = this.getClass().getSimpleName();
         if (!$$2.endsWith("Block")) {
            a.error("Block classes should end with Block and {} doesn't.", $$2);
         }
      }
   }

   public static boolean j(dgb $$0) {
      return $$0.b() instanceof cyi || $$0.a(cuc.hW) || $$0.a(cuc.ee) || $$0.a(cuc.ef) || $$0.a(cuc.fa) || $$0.a(cuc.eZ) || $$0.a(aqs.aQ);
   }

   public boolean e_(dgb $$0) {
      return this.aI;
   }

   public static boolean a(dgb $$0, cqf $$1, ht $$2, hx $$3, ht $$4) {
      dgb $$5 = $$1.a_($$4);
      if ($$0.a($$5, $$3)) {
         return false;
      } else if ($$5.p()) {
         cua.a $$6 = new cua.a($$0, $$5, $$3);
         Object2ByteLinkedOpenHashMap<cua.a> $$7 = h.get();
         byte $$8 = $$7.getAndMoveToFirst($$6);
         if ($$8 != 127) {
            return $$8 != 0;
         } else {
            eiy $$9 = $$0.a($$1, $$2, $$3);
            if ($$9.c()) {
               return true;
            } else {
               eiy $$10 = $$5.a($$1, $$4, $$3.g());
               boolean $$11 = eiv.c($$9, $$10, eij.e);
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

   public static boolean c(cqf $$0, ht $$1) {
      return $$0.a_($$1).a($$0, $$1, hx.b, dbz.c);
   }

   public static boolean a(crc $$0, ht $$1, hx $$2) {
      dgb $$3 = $$0.a_($$1);
      return $$2 == hx.a && $$3.a(aqs.aY) ? false : $$3.a($$0, $$1, $$2, dbz.b);
   }

   public static boolean a(eiy $$0, hx $$1) {
      eiy $$2 = $$0.a($$1);
      return a($$2);
   }

   public static boolean a(eiy $$0) {
      return (Boolean)c.getUnchecked($$0);
   }

   public boolean c(dgb $$0, cqf $$1, ht $$2) {
      return !a($$0.j($$1, $$2)) && $$0.u().c();
   }

   public void a(dgb $$0, cqz $$1, ht $$2, ate $$3) {
   }

   public void a(cra $$0, ht $$1, dgb $$2) {
   }

   public static List<ckj> a(dgb $$0, alq $$1, ht $$2, @Nullable ddx $$3) {
      edo.a $$4 = new edo.a($$1).a(eft.f, eif.b($$2)).a(eft.i, ckj.b).b(eft.h, $$3);
      return $$0.a($$4);
   }

   public static List<ckj> a(dgb $$0, alq $$1, ht $$2, @Nullable ddx $$3, @Nullable bjt $$4, ckj $$5) {
      edo.a $$6 = new edo.a($$1).a(eft.f, eif.b($$2)).a(eft.i, $$5).b(eft.a, $$4).b(eft.h, $$3);
      return $$0.a($$6);
   }

   public static void c(dgb $$0, cqz $$1, ht $$2) {
      if ($$1 instanceof alq) {
         a($$0, (alq)$$1, $$2, null).forEach($$2x -> a($$1, $$2, $$2x));
         $$0.a((alq)$$1, $$2, ckj.b, true);
      }
   }

   public static void a(dgb $$0, cra $$1, ht $$2, @Nullable ddx $$3) {
      if ($$1 instanceof alq) {
         a($$0, (alq)$$1, $$2, $$3).forEach($$2x -> a((cqz)((alq)$$1), $$2, $$2x));
         $$0.a((alq)$$1, $$2, ckj.b, true);
      }
   }

   public static void a(dgb $$0, cqz $$1, ht $$2, @Nullable ddx $$3, @Nullable bjt $$4, ckj $$5) {
      if ($$1 instanceof alq) {
         a($$0, (alq)$$1, $$2, $$3, $$4, $$5).forEach($$2x -> a($$1, $$2, $$2x));
         $$0.a((alq)$$1, $$2, $$5, true);
      }
   }

   public static void a(cqz $$0, ht $$1, ckj $$2) {
      double $$3 = (double)bjx.ad.l() / 2.0;
      double $$4 = (double)$$1.u() + 0.5 + asy.a($$0.z, -0.25, 0.25);
      double $$5 = (double)$$1.v() + 0.5 + asy.a($$0.z, -0.25, 0.25) - $$3;
      double $$6 = (double)$$1.w() + 0.5 + asy.a($$0.z, -0.25, 0.25);
      a($$0, () -> new bzq($$0, $$4, $$5, $$6, $$2), $$2);
   }

   public static void a(cqz $$0, ht $$1, hx $$2, ckj $$3) {
      int $$4 = $$2.j();
      int $$5 = $$2.k();
      int $$6 = $$2.l();
      double $$7 = (double)bjx.ad.k() / 2.0;
      double $$8 = (double)bjx.ad.l() / 2.0;
      double $$9 = (double)$$1.u() + 0.5 + ($$4 == 0 ? asy.a($$0.z, -0.25, 0.25) : (double)$$4 * (0.5 + $$7));
      double $$10 = (double)$$1.v() + 0.5 + ($$5 == 0 ? asy.a($$0.z, -0.25, 0.25) : (double)$$5 * (0.5 + $$8)) - $$8;
      double $$11 = (double)$$1.w() + 0.5 + ($$6 == 0 ? asy.a($$0.z, -0.25, 0.25) : (double)$$6 * (0.5 + $$7));
      double $$12 = $$4 == 0 ? asy.a($$0.z, -0.1, 0.1) : (double)$$4 * 0.1;
      double $$13 = $$5 == 0 ? asy.a($$0.z, 0.0, 0.1) : (double)$$5 * 0.1 + 0.1;
      double $$14 = $$6 == 0 ? asy.a($$0.z, -0.1, 0.1) : (double)$$6 * 0.1;
      a($$0, () -> new bzq($$0, $$9, $$10, $$11, $$3, $$12, $$13, $$14), $$3);
   }

   private static void a(cqz $$0, Supplier<bzq> $$1, ckj $$2) {
      if (!$$0.B && !$$2.b() && $$0.X().b(cqv.g)) {
         bzq $$3 = $$1.get();
         $$3.t();
         $$0.b($$3);
      }
   }

   protected void a(alq $$0, ht $$1, int $$2) {
      if ($$0.X().b(cqv.g)) {
         bjz.a($$0, eif.b($$1), $$2);
      }
   }

   public float e() {
      return this.aH;
   }

   public void a(cqz $$0, ht $$1, cqr $$2) {
   }

   public void a(cqz $$0, ht $$1, dgb $$2, bjt $$3) {
   }

   @Nullable
   public dgb a(cmr $$0) {
      return this.o();
   }

   public void a(cqz $$0, ccx $$1, ht $$2, dgb $$3, @Nullable ddx $$4, ckj $$5) {
      $$1.b(aqn.a.b(this));
      $$1.A(0.005F);
      a($$3, $$0, $$2, $$4, $$1, $$5);
   }

   public void a(cqz $$0, ht $$1, dgb $$2, @Nullable bkj $$3, ckj $$4) {
   }

   public boolean a(dgb $$0) {
      return !$$0.e() && !$$0.k();
   }

   public uw f() {
      return ui.c(this.h());
   }

   public String h() {
      if (this.e == null) {
         this.e = ac.a("block", jy.f.b(this));
      }

      return this.e;
   }

   public void a(cqz $$0, dgb $$1, ht $$2, bjt $$3, float $$4) {
      $$3.a($$4, 1.0F, $$3.dM().k());
   }

   public void a(cqf $$0, bjt $$1) {
      $$1.f($$1.do().d(1.0, 0.0, 1.0));
   }

   public ckj a(crc $$0, ht $$1, dgb $$2) {
      return new ckj(this);
   }

   public float i() {
      return this.aK;
   }

   public float j() {
      return this.aL;
   }

   public float l() {
      return this.aM;
   }

   protected void a(cqz $$0, ccx $$1, ht $$2, dgb $$3) {
      $$0.a($$1, 2001, $$2, i($$3));
   }

   public dgb a(cqz $$0, ht $$1, dgb $$2, ccx $$3) {
      this.a($$0, $$3, $$1, $$2);
      if ($$2.a(aqs.aV)) {
         cbo.a($$3, false);
      }

      $$0.a(dkl.f, $$1, dkl.a.a($$3, $$2));
      return $$2;
   }

   public void a(dgb $$0, cqz $$1, ht $$2, crx.c $$3) {
   }

   public boolean a(cqr $$0) {
      return true;
   }

   protected void a(dgc.a<cua, dgb> $$0) {
   }

   public dgc<cua, dgb> n() {
      return this.E;
   }

   protected final void k(dgb $$0) {
      this.d = $$0;
   }

   public final dgb o() {
      return this.d;
   }

   public final dgb l(dgb $$0) {
      dgb $$1 = this.o();

      for (dhe<?> $$2 : $$0.b().n().d()) {
         if ($$1.b($$2)) {
            $$1 = a($$0, $$1, $$2);
         }
      }

      return $$1;
   }

   private static <T extends Comparable<T>> dgb a(dgb $$0, dgb $$1, dhe<T> $$2) {
      return $$1.a($$2, $$0.c($$2));
   }

   public dbl m(dgb $$0) {
      return this.aJ;
   }

   @Override
   public cke k() {
      if (this.f == null) {
         this.f = cke.a(this);
      }

      return this.f;
   }

   public boolean p() {
      return this.aN;
   }

   @Override
   public String toString() {
      return "Block{" + jy.f.b(this) + "}";
   }

   public void a(ckj $$0, @Nullable cqf $$1, List<ui> $$2, cma $$3) {
   }

   @Override
   protected cua q() {
      return this;
   }

   protected ImmutableMap<dgb, eiy> a(Function<dgb, eiy> $$0) {
      return this.E.a().stream().collect(ImmutableMap.toImmutableMap(Function.identity(), $$0));
   }

   @Deprecated
   public ib.c<cua> r() {
      return this.b;
   }

   protected void a(alq $$0, ht $$1, ckj $$2, bhg $$3) {
      if (cov.a(cox.v, $$2) == 0) {
         int $$4 = $$3.a($$0.z);
         if ($$4 > 0) {
            this.a($$0, $$1, $$4);
         }
      }
   }

   public static final class a {
      private final dgb a;
      private final dgb b;
      private final hx c;

      public a(dgb $$0, dgb $$1, hx $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else {
            return !($$0 instanceof cua.a $$1) ? false : this.a == $$1.a && this.b == $$1.b && this.c == $$1.c;
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
