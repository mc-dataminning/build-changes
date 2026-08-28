import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import org.apache.commons.lang3.math.Fraction;

public class cvv extends cxd {
   public static final int a = 4;
   public static final int b = 3;
   public static final int c = 12;
   public static final int d = 11;
   private static final int n = axk.a(1.0F, 1.0F, 0.33F, 0.33F);
   private static final int o = axk.a(1.0F, 0.44F, 0.53F, 1.0F);
   private static final int p = 10;
   private static final int q = 2;
   private static final int r = 200;

   public cvv(cxd.a $$0) {
      super($$0);
   }

   public static float c(cxh $$0) {
      czj $$1 = $$0.a(kv.Q, czj.a);
      return $$1.f().floatValue();
   }

   @Override
   public boolean a(cxh $$0, cut $$1, ctg $$2, cpr $$3) {
      czj $$4 = $$0.a(kv.Q);
      if ($$4 == null) {
         return false;
      } else {
         cxh $$5 = $$1.g();
         czj.a $$6 = new czj.a($$4);
         if ($$2 == ctg.a && !$$5.f()) {
            if ($$6.a($$1, $$3) > 0) {
               b($$3);
            } else {
               c($$3);
            }

            $$0.b(kv.Q, $$6.d());
            this.a($$3);
            return true;
         } else if ($$2 == ctg.b && $$5.f()) {
            cxh $$7 = $$6.b();
            if ($$7 != null) {
               cxh $$8 = $$1.d($$7);
               if ($$8.M() > 0) {
                  $$6.a($$8);
               } else {
                  a((bva)$$3);
               }
            }

            $$0.b(kv.Q, $$6.d());
            this.a($$3);
            return true;
         } else {
            return false;
         }
      }
   }

   @Override
   public boolean a(cxh $$0, cxh $$1, cut $$2, ctg $$3, cpr $$4, bwq $$5) {
      if ($$3 == ctg.a && $$1.f()) {
         a($$0, -1);
         return false;
      } else {
         czj $$6 = $$0.a(kv.Q);
         if ($$6 == null) {
            return false;
         } else {
            czj.a $$7 = new czj.a($$6);
            if ($$3 == ctg.a && !$$1.f()) {
               if ($$2.b($$4) && $$7.a($$1) > 0) {
                  b($$4);
               } else {
                  c($$4);
               }

               $$0.b(kv.Q, $$7.d());
               this.a($$4);
               return true;
            } else if ($$3 == ctg.b && $$1.f()) {
               if ($$2.b($$4)) {
                  cxh $$8 = $$7.b();
                  if ($$8 != null) {
                     a((bva)$$4);
                     $$5.a($$8);
                  }
               }

               $$0.b(kv.Q, $$7.d());
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
   public bsy a(dgz $$0, cpr $$1, bsx $$2) {
      $$1.c($$2);
      return bsy.a;
   }

   private void a(dgz $$0, cpr $$1, cxh $$2) {
      if (this.b($$2, $$1)) {
         a($$0, $$1);
         $$1.b(awk.c.b(this));
      }
   }

   @Override
   public boolean d(cxh $$0) {
      czj $$1 = $$0.a(kv.Q, czj.a);
      return $$1.f().compareTo(Fraction.ZERO) > 0;
   }

   @Override
   public int e(cxh $$0) {
      czj $$1 = $$0.a(kv.Q, czj.a);
      return Math.min(1 + ayz.a($$1.f(), 12), 13);
   }

   @Override
   public int f(cxh $$0) {
      czj $$1 = $$0.a(kv.Q, czj.a);
      return $$1.f().compareTo(Fraction.ONE) >= 0 ? n : o;
   }

   public static void a(cxh $$0, int $$1) {
      czj $$2 = $$0.a(kv.Q);
      if ($$2 != null) {
         czj.a $$3 = new czj.a($$2);
         $$3.a($$1);
         $$0.b(kv.Q, $$3.d());
      }
   }

   public static boolean g(cxh $$0) {
      czj $$1 = $$0.a(kv.Q);
      return $$1 != null && $$1.h() != -1;
   }

   public static int h(cxh $$0) {
      czj $$1 = $$0.a(kv.Q, czj.a);
      return $$1.h();
   }

   public static cxh i(cxh $$0) {
      czj $$1 = $$0.a(kv.Q);
      return $$1 != null && $$1.h() != -1 ? $$1.a($$1.h()) : cxh.k;
   }

   public static int j(cxh $$0) {
      czj $$1 = $$0.a(kv.Q, czj.a);
      return $$1.a();
   }

   private boolean b(cxh $$0, cpr $$1) {
      czj $$2 = $$0.a(kv.Q);
      if ($$2 != null && !$$2.g()) {
         Optional<cxh> $$3 = a($$0, $$1, $$2);
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

   private static Optional<cxh> a(cxh $$0, cpr $$1, czj $$2) {
      czj.a $$3 = new czj.a($$2);
      cxh $$4 = $$3.b();
      if ($$4 != null) {
         a((bva)$$1);
         $$0.b(kv.Q, $$3.d());
         return Optional.of($$4);
      } else {
         return Optional.empty();
      }
   }

   @Override
   public void a(dgz $$0, bvy $$1, cxh $$2, int $$3) {
      if ($$1 instanceof cpr $$4) {
         int $$5 = this.a($$2, $$1);
         boolean $$6 = $$3 == $$5;
         if ($$6 || $$3 < $$5 - 10 && $$3 % 2 == 0) {
            this.a($$0, $$4, $$2);
         }
      }
   }

   @Override
   public int a(cxh $$0, bvy $$1) {
      return 200;
   }

   @Override
   public cxj b(cxh $$0) {
      return cxj.k;
   }

   @Override
   public Optional<cvd> k(cxh $$0) {
      return !$$0.b(kv.r) && !$$0.b(kv.q) ? Optional.ofNullable($$0.a(kv.Q)).map(cvc::new) : Optional.empty();
   }

   @Override
   public void a(clw $$0) {
      czj $$1 = $$0.f().a(kv.Q);
      if ($$1 != null) {
         $$0.f().b(kv.Q, czj.a);
         cxk.a($$0, $$1.d());
      }
   }

   public static List<cvv> b() {
      return Stream.of(cxl.rD, cxl.rE, cxl.rF, cxl.rG, cxl.rH, cxl.rI, cxl.rJ, cxl.rK, cxl.rL, cxl.rM, cxl.rN, cxl.rT, cxl.rQ, cxl.rR, cxl.rS, cxl.rP, cxl.rO)
         .map($$0 -> (cvv)$$0)
         .toList();
   }

   public static cxd a(cwe $$0) {
      return switch ($$0) {
         case a -> cxl.rE;
         case b -> cxl.rF;
         case c -> cxl.rG;
         case d -> cxl.rH;
         case e -> cxl.rI;
         case f -> cxl.rJ;
         case g -> cxl.rK;
         case h -> cxl.rL;
         case i -> cxl.rM;
         case j -> cxl.rN;
         case l -> cxl.rP;
         case m -> cxl.rQ;
         case n -> cxl.rR;
         case o -> cxl.rS;
         case p -> cxl.rT;
         case k -> cxl.rO;
      };
   }

   private static void a(bva $$0) {
      $$0.a(awa.ds, 0.8F, 0.8F + $$0.dU().C_().i() * 0.4F);
   }

   private static void b(bva $$0) {
      $$0.a(awa.dq, 0.8F, 0.8F + $$0.dU().C_().i() * 0.4F);
   }

   private static void c(bva $$0) {
      $$0.a(awa.dr, 1.0F, 1.0F);
   }

   private static void a(dgz $$0, bva $$1) {
      $$0.a(null, $$1.du(), awa.dp, awb.h, 0.8F, 0.8F + $$1.dU().C_().i() * 0.4F);
   }

   private void a(cpr $$0) {
      csw $$1 = $$0.bQ;
      if ($$1 != null) {
         $$1.a($$0.gl());
      }
   }
}
