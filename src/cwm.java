import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import org.apache.commons.lang3.math.Fraction;

public class cwm extends cxu {
   public static final int a = 4;
   public static final int b = 3;
   public static final int c = 12;
   public static final int d = 11;
   private static final int n = axu.a(1.0F, 1.0F, 0.33F, 0.33F);
   private static final int o = axu.a(1.0F, 0.44F, 0.53F, 1.0F);
   private static final int p = 10;
   private static final int q = 2;
   private static final int r = 200;

   public cwm(cxu.a $$0) {
      super($$0);
   }

   public static float c(cxy $$0) {
      czz $$1 = $$0.a(kx.Q, czz.a);
      return $$1.f().floatValue();
   }

   @Override
   public boolean a(cxy $$0, cvk $$1, ctx $$2, cqi $$3) {
      czz $$4 = $$0.a(kx.Q);
      if ($$4 == null) {
         return false;
      } else {
         cxy $$5 = $$1.g();
         czz.a $$6 = new czz.a($$4);
         if ($$2 == ctx.a && !$$5.f()) {
            if ($$6.a($$1, $$3) > 0) {
               b($$3);
            } else {
               c($$3);
            }

            $$0.b(kx.Q, $$6.d());
            this.a($$3);
            return true;
         } else if ($$2 == ctx.b && $$5.f()) {
            cxy $$7 = $$6.b();
            if ($$7 != null) {
               cxy $$8 = $$1.d($$7);
               if ($$8.M() > 0) {
                  $$6.a($$8);
               } else {
                  a((bvs)$$3);
               }
            }

            $$0.b(kx.Q, $$6.d());
            this.a($$3);
            return true;
         } else {
            return false;
         }
      }
   }

   @Override
   public boolean a(cxy $$0, cxy $$1, cvk $$2, ctx $$3, cqi $$4, bxi $$5) {
      if ($$3 == ctx.a && $$1.f()) {
         a($$0, -1);
         return false;
      } else {
         czz $$6 = $$0.a(kx.Q);
         if ($$6 == null) {
            return false;
         } else {
            czz.a $$7 = new czz.a($$6);
            if ($$3 == ctx.a && !$$1.f()) {
               if ($$2.b($$4) && $$7.a($$1) > 0) {
                  b($$4);
               } else {
                  c($$4);
               }

               $$0.b(kx.Q, $$7.d());
               this.a($$4);
               return true;
            } else if ($$3 == ctx.b && $$1.f()) {
               if ($$2.b($$4)) {
                  cxy $$8 = $$7.b();
                  if ($$8 != null) {
                     a((bvs)$$4);
                     $$5.a($$8);
                  }
               }

               $$0.b(kx.Q, $$7.d());
               this.a($$4);
               return true;
            } else {
               a($$0, -1);
               return false;
            }
         }
      }
   }

   @Override
   public btq a(dhp $$0, cqi $$1, btp $$2) {
      $$1.c($$2);
      return btq.a;
   }

   private void a(dhp $$0, cqi $$1, cxy $$2) {
      if (this.b($$2, $$1)) {
         a($$0, $$1);
         $$1.b(awu.c.b(this));
      }
   }

   @Override
   public boolean d(cxy $$0) {
      czz $$1 = $$0.a(kx.Q, czz.a);
      return $$1.f().compareTo(Fraction.ZERO) > 0;
   }

   @Override
   public int e(cxy $$0) {
      czz $$1 = $$0.a(kx.Q, czz.a);
      return Math.min(1 + azk.a($$1.f(), 12), 13);
   }

   @Override
   public int f(cxy $$0) {
      czz $$1 = $$0.a(kx.Q, czz.a);
      return $$1.f().compareTo(Fraction.ONE) >= 0 ? n : o;
   }

   public static void a(cxy $$0, int $$1) {
      czz $$2 = $$0.a(kx.Q);
      if ($$2 != null) {
         czz.a $$3 = new czz.a($$2);
         $$3.a($$1);
         $$0.b(kx.Q, $$3.d());
      }
   }

   public static boolean g(cxy $$0) {
      czz $$1 = $$0.a(kx.Q);
      return $$1 != null && $$1.h() != -1;
   }

   public static int h(cxy $$0) {
      czz $$1 = $$0.a(kx.Q, czz.a);
      return $$1.h();
   }

   public static cxy i(cxy $$0) {
      czz $$1 = $$0.a(kx.Q);
      return $$1 != null && $$1.h() != -1 ? $$1.a($$1.h()) : cxy.k;
   }

   public static int j(cxy $$0) {
      czz $$1 = $$0.a(kx.Q, czz.a);
      return $$1.a();
   }

   private boolean b(cxy $$0, cqi $$1) {
      czz $$2 = $$0.a(kx.Q);
      if ($$2 != null && !$$2.g()) {
         Optional<cxy> $$3 = a($$0, $$1, $$2);
         if ($$3.isPresent()) {
            $$1.a($$3.get(), true);
            return true;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   private static Optional<cxy> a(cxy $$0, cqi $$1, czz $$2) {
      czz.a $$3 = new czz.a($$2);
      cxy $$4 = $$3.b();
      if ($$4 != null) {
         a((bvs)$$1);
         $$0.b(kx.Q, $$3.d());
         return Optional.of($$4);
      } else {
         return Optional.empty();
      }
   }

   @Override
   public void a(dhp $$0, bwr $$1, cxy $$2, int $$3) {
      if ($$1 instanceof cqi $$4) {
         int $$5 = this.a($$2, $$1);
         boolean $$6 = $$3 == $$5;
         if ($$6 || $$3 < $$5 - 10 && $$3 % 2 == 0) {
            this.a($$0, $$4, $$2);
         }
      }
   }

   @Override
   public int a(cxy $$0, bwr $$1) {
      return 200;
   }

   @Override
   public cya b(cxy $$0) {
      return cya.k;
   }

   @Override
   public Optional<cvu> k(cxy $$0) {
      return !$$0.c(kx.r) && !$$0.c(kx.q) ? Optional.ofNullable($$0.a(kx.Q)).map(cvt::new) : Optional.empty();
   }

   @Override
   public void a(cmn $$0) {
      czz $$1 = $$0.f().a(kx.Q);
      if ($$1 != null) {
         $$0.f().b(kx.Q, czz.a);
         cyb.a($$0, $$1.d());
      }
   }

   public static List<cwm> b() {
      return Stream.of(cyc.rF, cyc.rG, cyc.rH, cyc.rI, cyc.rJ, cyc.rK, cyc.rL, cyc.rM, cyc.rN, cyc.rO, cyc.rP, cyc.rV, cyc.rS, cyc.rT, cyc.rU, cyc.rR, cyc.rQ)
         .map($$0 -> (cwm)$$0)
         .toList();
   }

   public static cxu a(cwv $$0) {
      return switch ($$0) {
         case a -> cyc.rG;
         case b -> cyc.rH;
         case c -> cyc.rI;
         case d -> cyc.rJ;
         case e -> cyc.rK;
         case f -> cyc.rL;
         case g -> cyc.rM;
         case h -> cyc.rN;
         case i -> cyc.rO;
         case j -> cyc.rP;
         case l -> cyc.rR;
         case m -> cyc.rS;
         case n -> cyc.rT;
         case o -> cyc.rU;
         case p -> cyc.rV;
         case k -> cyc.rQ;
      };
   }

   private static void a(bvs $$0) {
      $$0.a(awk.ds, 0.8F, 0.8F + $$0.dV().C_().i() * 0.4F);
   }

   private static void b(bvs $$0) {
      $$0.a(awk.dq, 0.8F, 0.8F + $$0.dV().C_().i() * 0.4F);
   }

   private static void c(bvs $$0) {
      $$0.a(awk.dr, 1.0F, 1.0F);
   }

   private static void a(dhp $$0, bvs $$1) {
      $$0.a(null, $$1.dv(), awk.dp, awl.h, 0.8F, 0.8F + $$1.dV().C_().i() * 0.4F);
   }

   private void a(cqi $$0) {
      ctn $$1 = $$0.bP;
      if ($$1 != null) {
         $$1.a($$0.gi());
      }
   }
}
