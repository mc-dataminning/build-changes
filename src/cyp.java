import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import org.apache.commons.lang3.math.Fraction;

public class cyp extends czw {
   public static final int a = 4;
   public static final int b = 3;
   public static final int c = 12;
   public static final int d = 11;
   private static final int o = aya.a(1.0F, 1.0F, 0.33F, 0.33F);
   private static final int p = aya.a(1.0F, 0.44F, 0.53F, 1.0F);
   private static final int q = 10;
   private static final int r = 2;
   private static final int s = 200;

   public cyp(czw.a $$0) {
      super($$0);
   }

   public static float c(daa $$0) {
      dcd $$1 = $$0.a(kl.Q, dcd.a);
      return $$1.f().floatValue();
   }

   @Override
   public boolean a(daa $$0, cxp $$1, cwc $$2, crz $$3) {
      dcd $$4 = $$0.a(kl.Q);
      if ($$4 == null) {
         return false;
      } else {
         daa $$5 = $$1.g();
         dcd.a $$6 = new dcd.a($$4);
         if ($$2 == cwc.a && !$$5.f()) {
            if ($$6.a($$1, $$3) > 0) {
               b($$3);
            } else {
               c($$3);
            }

            $$0.b(kl.Q, $$6.d());
            this.a($$3);
            return true;
         } else if ($$2 == cwc.b && $$5.f()) {
            daa $$7 = $$6.b();
            if ($$7 != null) {
               daa $$8 = $$1.d($$7);
               if ($$8.M() > 0) {
                  $$6.a($$8);
               } else {
                  a((bwv)$$3);
               }
            }

            $$0.b(kl.Q, $$6.d());
            this.a($$3);
            return true;
         } else {
            return false;
         }
      }
   }

   @Override
   public boolean a(daa $$0, daa $$1, cxp $$2, cwc $$3, crz $$4, byn $$5) {
      if ($$3 == cwc.a && $$1.f()) {
         a($$0, -1);
         return false;
      } else {
         dcd $$6 = $$0.a(kl.Q);
         if ($$6 == null) {
            return false;
         } else {
            dcd.a $$7 = new dcd.a($$6);
            if ($$3 == cwc.a && !$$1.f()) {
               if ($$2.b($$4) && $$7.a($$1) > 0) {
                  b($$4);
               } else {
                  c($$4);
               }

               $$0.b(kl.Q, $$7.d());
               this.a($$4);
               return true;
            } else if ($$3 == cwc.b && $$1.f()) {
               if ($$2.b($$4)) {
                  daa $$8 = $$7.b();
                  if ($$8 != null) {
                     a((bwv)$$4);
                     $$5.a($$8);
                  }
               }

               $$0.b(kl.Q, $$7.d());
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
   public but a(djz $$0, crz $$1, bus $$2) {
      $$1.c($$2);
      return but.a;
   }

   private void a(djz $$0, crz $$1, daa $$2) {
      if (this.b($$2, $$1)) {
         a($$0, $$1);
         $$1.b(axb.c.b(this));
      }
   }

   @Override
   public boolean d(daa $$0) {
      dcd $$1 = $$0.a(kl.Q, dcd.a);
      return $$1.f().compareTo(Fraction.ZERO) > 0;
   }

   @Override
   public int e(daa $$0) {
      dcd $$1 = $$0.a(kl.Q, dcd.a);
      return Math.min(1 + azq.a($$1.f(), 12), 13);
   }

   @Override
   public int f(daa $$0) {
      dcd $$1 = $$0.a(kl.Q, dcd.a);
      return $$1.f().compareTo(Fraction.ONE) >= 0 ? o : p;
   }

   public static void a(daa $$0, int $$1) {
      dcd $$2 = $$0.a(kl.Q);
      if ($$2 != null) {
         dcd.a $$3 = new dcd.a($$2);
         $$3.a($$1);
         $$0.b(kl.Q, $$3.d());
      }
   }

   public static boolean g(daa $$0) {
      dcd $$1 = $$0.a(kl.Q);
      return $$1 != null && $$1.h() != -1;
   }

   public static int h(daa $$0) {
      dcd $$1 = $$0.a(kl.Q, dcd.a);
      return $$1.h();
   }

   public static daa i(daa $$0) {
      dcd $$1 = $$0.a(kl.Q);
      return $$1 != null && $$1.h() != -1 ? $$1.a($$1.h()) : daa.k;
   }

   public static int j(daa $$0) {
      dcd $$1 = $$0.a(kl.Q, dcd.a);
      return $$1.a();
   }

   private boolean b(daa $$0, crz $$1) {
      dcd $$2 = $$0.a(kl.Q);
      if ($$2 != null && !$$2.g()) {
         Optional<daa> $$3 = a($$0, $$1, $$2);
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

   private static Optional<daa> a(daa $$0, crz $$1, dcd $$2) {
      dcd.a $$3 = new dcd.a($$2);
      daa $$4 = $$3.b();
      if ($$4 != null) {
         a((bwv)$$1);
         $$0.b(kl.Q, $$3.d());
         return Optional.of($$4);
      } else {
         return Optional.empty();
      }
   }

   @Override
   public void a(djz $$0, bxw $$1, daa $$2, int $$3) {
      if ($$1 instanceof crz $$4) {
         int $$5 = this.a($$2, $$1);
         boolean $$6 = $$3 == $$5;
         if ($$6 || $$3 < $$5 - 10 && $$3 % 2 == 0) {
            this.a($$0, $$4, $$2);
         }
      }
   }

   @Override
   public int a(daa $$0, bxw $$1) {
      return 200;
   }

   @Override
   public dac b(daa $$0) {
      return dac.k;
   }

   @Override
   public Optional<cxz> k(daa $$0) {
      dde $$1 = $$0.a(kl.q, dde.c);
      return !$$1.a(kl.Q) ? Optional.empty() : Optional.ofNullable($$0.a(kl.Q)).map(cxy::new);
   }

   @Override
   public void a(coe $$0) {
      dcd $$1 = $$0.f().a(kl.Q);
      if ($$1 != null) {
         $$0.f().b(kl.Q, dcd.a);
         dad.a($$0, $$1.d());
      }
   }

   public static List<cyp> a() {
      return Stream.of(dae.rM, dae.rN, dae.rO, dae.rP, dae.rQ, dae.rR, dae.rS, dae.rT, dae.rU, dae.rV, dae.rW, dae.sc, dae.rZ, dae.sa, dae.sb, dae.rY, dae.rX)
         .map($$0 -> (cyp)$$0)
         .toList();
   }

   public static czw a(cyy $$0) {
      return switch ($$0) {
         case a -> dae.rN;
         case b -> dae.rO;
         case c -> dae.rP;
         case d -> dae.rQ;
         case e -> dae.rR;
         case f -> dae.rS;
         case g -> dae.rT;
         case h -> dae.rU;
         case i -> dae.rV;
         case j -> dae.rW;
         case l -> dae.rY;
         case m -> dae.rZ;
         case n -> dae.sa;
         case o -> dae.sb;
         case p -> dae.sc;
         case k -> dae.rX;
      };
   }

   private static void a(bwv $$0) {
      $$0.a(awr.ds, 0.8F, 0.8F + $$0.dV().G_().i() * 0.4F);
   }

   private static void b(bwv $$0) {
      $$0.a(awr.dq, 0.8F, 0.8F + $$0.dV().G_().i() * 0.4F);
   }

   private static void c(bwv $$0) {
      $$0.a(awr.dr, 1.0F, 1.0F);
   }

   private static void a(djz $$0, bwv $$1) {
      $$0.a(null, $$1.dv(), awr.dp, aws.h, 0.8F, 0.8F + $$1.dV().G_().i() * 0.4F);
   }

   private void a(crz $$0) {
      cvs $$1 = $$0.bR;
      if ($$1 != null) {
         $$1.a($$0.gj());
      }
   }
}
