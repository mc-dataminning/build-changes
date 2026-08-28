import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import org.apache.commons.lang3.math.Fraction;

public class cyn extends czu {
   public static final int a = 4;
   public static final int b = 3;
   public static final int c = 12;
   public static final int d = 11;
   private static final int o = axy.a(1.0F, 1.0F, 0.33F, 0.33F);
   private static final int p = axy.a(1.0F, 0.44F, 0.53F, 1.0F);
   private static final int q = 10;
   private static final int r = 2;
   private static final int s = 200;

   public cyn(czu.a $$0) {
      super($$0);
   }

   public static float c(czy $$0) {
      dcb $$1 = $$0.a(kk.Q, dcb.a);
      return $$1.f().floatValue();
   }

   @Override
   public boolean a(czy $$0, cxn $$1, cwa $$2, crx $$3) {
      dcb $$4 = $$0.a(kk.Q);
      if ($$4 == null) {
         return false;
      } else {
         czy $$5 = $$1.g();
         dcb.a $$6 = new dcb.a($$4);
         if ($$2 == cwa.a && !$$5.f()) {
            if ($$6.a($$1, $$3) > 0) {
               b($$3);
            } else {
               c($$3);
            }

            $$0.b(kk.Q, $$6.d());
            this.a($$3);
            return true;
         } else if ($$2 == cwa.b && $$5.f()) {
            czy $$7 = $$6.b();
            if ($$7 != null) {
               czy $$8 = $$1.d($$7);
               if ($$8.M() > 0) {
                  $$6.a($$8);
               } else {
                  a((bwt)$$3);
               }
            }

            $$0.b(kk.Q, $$6.d());
            this.a($$3);
            return true;
         } else {
            return false;
         }
      }
   }

   @Override
   public boolean a(czy $$0, czy $$1, cxn $$2, cwa $$3, crx $$4, byl $$5) {
      if ($$3 == cwa.a && $$1.f()) {
         a($$0, -1);
         return false;
      } else {
         dcb $$6 = $$0.a(kk.Q);
         if ($$6 == null) {
            return false;
         } else {
            dcb.a $$7 = new dcb.a($$6);
            if ($$3 == cwa.a && !$$1.f()) {
               if ($$2.b($$4) && $$7.a($$1) > 0) {
                  b($$4);
               } else {
                  c($$4);
               }

               $$0.b(kk.Q, $$7.d());
               this.a($$4);
               return true;
            } else if ($$3 == cwa.b && $$1.f()) {
               if ($$2.b($$4)) {
                  czy $$8 = $$7.b();
                  if ($$8 != null) {
                     a((bwt)$$4);
                     $$5.a($$8);
                  }
               }

               $$0.b(kk.Q, $$7.d());
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
   public bur a(djx $$0, crx $$1, buq $$2) {
      $$1.c($$2);
      return bur.a;
   }

   private void a(djx $$0, crx $$1, czy $$2) {
      if (this.b($$2, $$1)) {
         a($$0, $$1);
         $$1.b(awz.c.b(this));
      }
   }

   @Override
   public boolean d(czy $$0) {
      dcb $$1 = $$0.a(kk.Q, dcb.a);
      return $$1.f().compareTo(Fraction.ZERO) > 0;
   }

   @Override
   public int e(czy $$0) {
      dcb $$1 = $$0.a(kk.Q, dcb.a);
      return Math.min(1 + azo.a($$1.f(), 12), 13);
   }

   @Override
   public int f(czy $$0) {
      dcb $$1 = $$0.a(kk.Q, dcb.a);
      return $$1.f().compareTo(Fraction.ONE) >= 0 ? o : p;
   }

   public static void a(czy $$0, int $$1) {
      dcb $$2 = $$0.a(kk.Q);
      if ($$2 != null) {
         dcb.a $$3 = new dcb.a($$2);
         $$3.a($$1);
         $$0.b(kk.Q, $$3.d());
      }
   }

   public static boolean g(czy $$0) {
      dcb $$1 = $$0.a(kk.Q);
      return $$1 != null && $$1.h() != -1;
   }

   public static int h(czy $$0) {
      dcb $$1 = $$0.a(kk.Q, dcb.a);
      return $$1.h();
   }

   public static czy i(czy $$0) {
      dcb $$1 = $$0.a(kk.Q);
      return $$1 != null && $$1.h() != -1 ? $$1.a($$1.h()) : czy.k;
   }

   public static int j(czy $$0) {
      dcb $$1 = $$0.a(kk.Q, dcb.a);
      return $$1.a();
   }

   private boolean b(czy $$0, crx $$1) {
      dcb $$2 = $$0.a(kk.Q);
      if ($$2 != null && !$$2.g()) {
         Optional<czy> $$3 = a($$0, $$1, $$2);
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

   private static Optional<czy> a(czy $$0, crx $$1, dcb $$2) {
      dcb.a $$3 = new dcb.a($$2);
      czy $$4 = $$3.b();
      if ($$4 != null) {
         a((bwt)$$1);
         $$0.b(kk.Q, $$3.d());
         return Optional.of($$4);
      } else {
         return Optional.empty();
      }
   }

   @Override
   public void a(djx $$0, bxu $$1, czy $$2, int $$3) {
      if ($$1 instanceof crx $$4) {
         int $$5 = this.a($$2, $$1);
         boolean $$6 = $$3 == $$5;
         if ($$6 || $$3 < $$5 - 10 && $$3 % 2 == 0) {
            this.a($$0, $$4, $$2);
         }
      }
   }

   @Override
   public int a(czy $$0, bxu $$1) {
      return 200;
   }

   @Override
   public daa b(czy $$0) {
      return daa.k;
   }

   @Override
   public Optional<cxx> k(czy $$0) {
      ddc $$1 = $$0.a(kk.q, ddc.c);
      return !$$1.a(kk.Q) ? Optional.empty() : Optional.ofNullable($$0.a(kk.Q)).map(cxw::new);
   }

   @Override
   public void a(coc $$0) {
      dcb $$1 = $$0.f().a(kk.Q);
      if ($$1 != null) {
         $$0.f().b(kk.Q, dcb.a);
         dab.a($$0, $$1.d());
      }
   }

   public static List<cyn> a() {
      return Stream.of(dac.rM, dac.rN, dac.rO, dac.rP, dac.rQ, dac.rR, dac.rS, dac.rT, dac.rU, dac.rV, dac.rW, dac.sc, dac.rZ, dac.sa, dac.sb, dac.rY, dac.rX)
         .map($$0 -> (cyn)$$0)
         .toList();
   }

   public static czu a(cyw $$0) {
      return switch ($$0) {
         case a -> dac.rN;
         case b -> dac.rO;
         case c -> dac.rP;
         case d -> dac.rQ;
         case e -> dac.rR;
         case f -> dac.rS;
         case g -> dac.rT;
         case h -> dac.rU;
         case i -> dac.rV;
         case j -> dac.rW;
         case l -> dac.rY;
         case m -> dac.rZ;
         case n -> dac.sa;
         case o -> dac.sb;
         case p -> dac.sc;
         case k -> dac.rX;
      };
   }

   private static void a(bwt $$0) {
      $$0.a(awp.ds, 0.8F, 0.8F + $$0.dV().G_().i() * 0.4F);
   }

   private static void b(bwt $$0) {
      $$0.a(awp.dq, 0.8F, 0.8F + $$0.dV().G_().i() * 0.4F);
   }

   private static void c(bwt $$0) {
      $$0.a(awp.dr, 1.0F, 1.0F);
   }

   private static void a(djx $$0, bwt $$1) {
      $$0.a(null, $$1.dv(), awp.dp, awq.h, 0.8F, 0.8F + $$1.dV().G_().i() * 0.4F);
   }

   private void a(crx $$0) {
      cvq $$1 = $$0.bR;
      if ($$1 != null) {
         $$1.a($$0.gj());
      }
   }
}
