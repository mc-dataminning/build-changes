import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import org.apache.commons.lang3.math.Fraction;

public class cxz extends czg {
   public static final int a = 4;
   public static final int b = 3;
   public static final int c = 12;
   public static final int d = 11;
   private static final int o = axw.a(1.0F, 1.0F, 0.33F, 0.33F);
   private static final int p = axw.a(1.0F, 0.44F, 0.53F, 1.0F);
   private static final int q = 10;
   private static final int r = 2;
   private static final int s = 200;

   public cxz(czg.a $$0) {
      super($$0);
   }

   public static float c(czk $$0) {
      dbn $$1 = $$0.a(kk.Q, dbn.a);
      return $$1.f().floatValue();
   }

   @Override
   public boolean a(czk $$0, cwz $$1, cvm $$2, crj $$3) {
      dbn $$4 = $$0.a(kk.Q);
      if ($$4 == null) {
         return false;
      } else {
         czk $$5 = $$1.g();
         dbn.a $$6 = new dbn.a($$4);
         if ($$2 == cvm.a && !$$5.f()) {
            if ($$6.a($$1, $$3) > 0) {
               b($$3);
            } else {
               c($$3);
            }

            $$0.b(kk.Q, $$6.d());
            this.a($$3);
            return true;
         } else if ($$2 == cvm.b && $$5.f()) {
            czk $$7 = $$6.b();
            if ($$7 != null) {
               czk $$8 = $$1.d($$7);
               if ($$8.M() > 0) {
                  $$6.a($$8);
               } else {
                  a((bwi)$$3);
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
   public boolean a(czk $$0, czk $$1, cwz $$2, cvm $$3, crj $$4, bya $$5) {
      if ($$3 == cvm.a && $$1.f()) {
         a($$0, -1);
         return false;
      } else {
         dbn $$6 = $$0.a(kk.Q);
         if ($$6 == null) {
            return false;
         } else {
            dbn.a $$7 = new dbn.a($$6);
            if ($$3 == cvm.a && !$$1.f()) {
               if ($$2.b($$4) && $$7.a($$1) > 0) {
                  b($$4);
               } else {
                  c($$4);
               }

               $$0.b(kk.Q, $$7.d());
               this.a($$4);
               return true;
            } else if ($$3 == cvm.b && $$1.f()) {
               if ($$2.b($$4)) {
                  czk $$8 = $$7.b();
                  if ($$8 != null) {
                     a((bwi)$$4);
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
   public bug a(djh $$0, crj $$1, buf $$2) {
      $$1.c($$2);
      return bug.a;
   }

   private void a(djh $$0, crj $$1, czk $$2) {
      if (this.b($$2, $$1)) {
         a($$0, $$1);
         $$1.b(awx.c.b(this));
      }
   }

   @Override
   public boolean d(czk $$0) {
      dbn $$1 = $$0.a(kk.Q, dbn.a);
      return $$1.f().compareTo(Fraction.ZERO) > 0;
   }

   @Override
   public int e(czk $$0) {
      dbn $$1 = $$0.a(kk.Q, dbn.a);
      return Math.min(1 + azm.a($$1.f(), 12), 13);
   }

   @Override
   public int f(czk $$0) {
      dbn $$1 = $$0.a(kk.Q, dbn.a);
      return $$1.f().compareTo(Fraction.ONE) >= 0 ? o : p;
   }

   public static void a(czk $$0, int $$1) {
      dbn $$2 = $$0.a(kk.Q);
      if ($$2 != null) {
         dbn.a $$3 = new dbn.a($$2);
         $$3.a($$1);
         $$0.b(kk.Q, $$3.d());
      }
   }

   public static boolean g(czk $$0) {
      dbn $$1 = $$0.a(kk.Q);
      return $$1 != null && $$1.h() != -1;
   }

   public static int h(czk $$0) {
      dbn $$1 = $$0.a(kk.Q, dbn.a);
      return $$1.h();
   }

   public static czk i(czk $$0) {
      dbn $$1 = $$0.a(kk.Q);
      return $$1 != null && $$1.h() != -1 ? $$1.a($$1.h()) : czk.k;
   }

   public static int j(czk $$0) {
      dbn $$1 = $$0.a(kk.Q, dbn.a);
      return $$1.a();
   }

   private boolean b(czk $$0, crj $$1) {
      dbn $$2 = $$0.a(kk.Q);
      if ($$2 != null && !$$2.g()) {
         Optional<czk> $$3 = a($$0, $$1, $$2);
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

   private static Optional<czk> a(czk $$0, crj $$1, dbn $$2) {
      dbn.a $$3 = new dbn.a($$2);
      czk $$4 = $$3.b();
      if ($$4 != null) {
         a((bwi)$$1);
         $$0.b(kk.Q, $$3.d());
         return Optional.of($$4);
      } else {
         return Optional.empty();
      }
   }

   @Override
   public void a(djh $$0, bxj $$1, czk $$2, int $$3) {
      if ($$1 instanceof crj $$4) {
         int $$5 = this.a($$2, $$1);
         boolean $$6 = $$3 == $$5;
         if ($$6 || $$3 < $$5 - 10 && $$3 % 2 == 0) {
            this.a($$0, $$4, $$2);
         }
      }
   }

   @Override
   public int a(czk $$0, bxj $$1) {
      return 200;
   }

   @Override
   public czm b(czk $$0) {
      return czm.k;
   }

   @Override
   public Optional<cxj> k(czk $$0) {
      dco $$1 = $$0.a(kk.q, dco.c);
      return !$$1.a(kk.Q) ? Optional.empty() : Optional.ofNullable($$0.a(kk.Q)).map(cxi::new);
   }

   @Override
   public void a(cno $$0) {
      dbn $$1 = $$0.f().a(kk.Q);
      if ($$1 != null) {
         $$0.f().b(kk.Q, dbn.a);
         czn.a($$0, $$1.d());
      }
   }

   public static List<cxz> a() {
      return Stream.of(czo.rM, czo.rN, czo.rO, czo.rP, czo.rQ, czo.rR, czo.rS, czo.rT, czo.rU, czo.rV, czo.rW, czo.sc, czo.rZ, czo.sa, czo.sb, czo.rY, czo.rX)
         .map($$0 -> (cxz)$$0)
         .toList();
   }

   public static czg a(cyi $$0) {
      return switch ($$0) {
         case a -> czo.rN;
         case b -> czo.rO;
         case c -> czo.rP;
         case d -> czo.rQ;
         case e -> czo.rR;
         case f -> czo.rS;
         case g -> czo.rT;
         case h -> czo.rU;
         case i -> czo.rV;
         case j -> czo.rW;
         case l -> czo.rY;
         case m -> czo.rZ;
         case n -> czo.sa;
         case o -> czo.sb;
         case p -> czo.sc;
         case k -> czo.rX;
      };
   }

   private static void a(bwi $$0) {
      $$0.a(awn.ds, 0.8F, 0.8F + $$0.dU().C_().i() * 0.4F);
   }

   private static void b(bwi $$0) {
      $$0.a(awn.dq, 0.8F, 0.8F + $$0.dU().C_().i() * 0.4F);
   }

   private static void c(bwi $$0) {
      $$0.a(awn.dr, 1.0F, 1.0F);
   }

   private static void a(djh $$0, bwi $$1) {
      $$0.a(null, $$1.du(), awn.dp, awo.h, 0.8F, 0.8F + $$1.dU().C_().i() * 0.4F);
   }

   private void a(crj $$0) {
      cvc $$1 = $$0.bR;
      if ($$1 != null) {
         $$1.a($$0.gi());
      }
   }
}
