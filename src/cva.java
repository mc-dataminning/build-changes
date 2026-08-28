import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import org.apache.commons.lang3.math.Fraction;

public class cva extends cwj {
   public static final int a = 4;
   public static final int b = 3;
   public static final int c = 12;
   public static final int d = 11;
   private static final int m = axj.a(1.0F, 1.0F, 0.33F, 0.33F);
   private static final int n = axj.a(1.0F, 0.44F, 0.53F, 1.0F);
   private static final int o = 10;
   private static final int p = 2;
   private static final int q = 200;

   public cva(cwj.a $$0) {
      super($$0);
   }

   public static float c(cwn $$0) {
      cyr $$1 = $$0.a(kv.P, cyr.a);
      return $$1.f().floatValue();
   }

   @Override
   public boolean a(cwn $$0, ctx $$1, csk $$2, cov $$3) {
      cyr $$4 = $$0.a(kv.P);
      if ($$4 == null) {
         return false;
      } else {
         cwn $$5 = $$1.g();
         cyr.a $$6 = new cyr.a($$4);
         if ($$2 == csk.a && !$$5.f()) {
            if ($$6.a($$1, $$3) > 0) {
               b($$3);
            } else {
               c($$3);
            }

            $$0.b(kv.P, $$6.d());
            this.a($$3);
            return true;
         } else if ($$2 == csk.b && $$5.f()) {
            cwn $$7 = $$6.b();
            if ($$7 != null) {
               cwn $$8 = $$1.d($$7);
               if ($$8.M() > 0) {
                  $$6.a($$8);
               } else {
                  a((buj)$$3);
               }
            }

            $$0.b(kv.P, $$6.d());
            this.a($$3);
            return true;
         } else {
            return false;
         }
      }
   }

   @Override
   public boolean a(cwn $$0, cwn $$1, ctx $$2, csk $$3, cov $$4, bvx $$5) {
      if ($$3 == csk.a && $$1.f()) {
         a($$0, -1);
         return false;
      } else {
         cyr $$6 = $$0.a(kv.P);
         if ($$6 == null) {
            return false;
         } else {
            cyr.a $$7 = new cyr.a($$6);
            if ($$3 == csk.a && !$$1.f()) {
               if ($$2.b($$4) && $$7.a($$1) > 0) {
                  b($$4);
               } else {
                  c($$4);
               }

               $$0.b(kv.P, $$7.d());
               this.a($$4);
               return true;
            } else if ($$3 == csk.b && $$1.f()) {
               if ($$2.b($$4)) {
                  cwn $$8 = $$7.b();
                  if ($$8 != null) {
                     a((buj)$$4);
                     $$5.a($$8);
                  }
               }

               $$0.b(kv.P, $$7.d());
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
   public bsi a(dgg $$0, cov $$1, bsh $$2) {
      $$1.c($$2);
      return bsi.a;
   }

   private void a(dgg $$0, cov $$1, cwn $$2) {
      if (this.a($$2, $$1)) {
         a($$0, $$1);
         $$1.b(awj.c.b(this));
      }
   }

   @Override
   public boolean d(cwn $$0) {
      cyr $$1 = $$0.a(kv.P, cyr.a);
      return $$1.f().compareTo(Fraction.ZERO) > 0;
   }

   @Override
   public int e(cwn $$0) {
      cyr $$1 = $$0.a(kv.P, cyr.a);
      return Math.min(1 + ayy.a($$1.f(), 12), 13);
   }

   @Override
   public int f(cwn $$0) {
      cyr $$1 = $$0.a(kv.P, cyr.a);
      return $$1.f().compareTo(Fraction.ONE) >= 0 ? m : n;
   }

   public static void a(cwn $$0, int $$1) {
      cyr $$2 = $$0.a(kv.P);
      if ($$2 != null) {
         cyr.a $$3 = new cyr.a($$2);
         $$3.a($$1);
         $$0.b(kv.P, $$3.d());
      }
   }

   public static boolean g(cwn $$0) {
      cyr $$1 = $$0.a(kv.P);
      return $$1 != null && $$1.h() != -1;
   }

   public static int h(cwn $$0) {
      cyr $$1 = $$0.a(kv.P, cyr.a);
      return $$1.h();
   }

   public static cwn i(cwn $$0) {
      cyr $$1 = $$0.a(kv.P);
      return $$1 != null && $$1.h() != -1 ? $$1.a($$1.h()) : cwn.j;
   }

   public static int j(cwn $$0) {
      cyr $$1 = $$0.a(kv.P, cyr.a);
      return $$1.a();
   }

   private boolean a(cwn $$0, cov $$1) {
      cyr $$2 = $$0.a(kv.P);
      if ($$2 != null && !$$2.g()) {
         Optional<cwn> $$3 = a($$0, $$1, $$2);
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

   private static Optional<cwn> a(cwn $$0, cov $$1, cyr $$2) {
      cyr.a $$3 = new cyr.a($$2);
      cwn $$4 = $$3.b();
      if ($$4 != null) {
         a((buj)$$1);
         $$0.b(kv.P, $$3.d());
         return Optional.of($$4);
      } else {
         return Optional.empty();
      }
   }

   @Override
   public void a(dgg $$0, bvf $$1, cwn $$2, int $$3) {
      if ($$1 instanceof cov $$4) {
         int $$5 = this.a($$2, $$1);
         boolean $$6 = $$3 == $$5;
         if ($$6 || $$3 < $$5 - 10 && $$3 % 2 == 0) {
            this.a($$0, $$4, $$2);
         }
      }
   }

   @Override
   public int a(cwn $$0, bvf $$1) {
      return 200;
   }

   @Override
   public cwp b(cwn $$0) {
      return cwp.k;
   }

   @Override
   public Optional<cuh> k(cwn $$0) {
      return !$$0.b(kv.r) && !$$0.b(kv.q) ? Optional.ofNullable($$0.a(kv.P)).map(cug::new) : Optional.empty();
   }

   @Override
   public void a(cla $$0) {
      cyr $$1 = $$0.l().a(kv.P);
      if ($$1 != null) {
         $$0.l().b(kv.P, cyr.a);
         cwq.a($$0, $$1.d());
      }
   }

   public static List<cva> b() {
      return Stream.of(cwr.rB, cwr.rC, cwr.rD, cwr.rE, cwr.rF, cwr.rG, cwr.rH, cwr.rI, cwr.rJ, cwr.rK, cwr.rL, cwr.rR, cwr.rO, cwr.rP, cwr.rQ, cwr.rN, cwr.rM)
         .map($$0 -> (cva)$$0)
         .toList();
   }

   public static cwj a(cvk $$0) {
      return switch ($$0) {
         case a -> cwr.rC;
         case b -> cwr.rD;
         case c -> cwr.rE;
         case d -> cwr.rF;
         case e -> cwr.rG;
         case f -> cwr.rH;
         case g -> cwr.rI;
         case h -> cwr.rJ;
         case i -> cwr.rK;
         case j -> cwr.rL;
         case l -> cwr.rN;
         case m -> cwr.rO;
         case n -> cwr.rP;
         case o -> cwr.rQ;
         case p -> cwr.rR;
         case k -> cwr.rM;
      };
   }

   private static void a(buj $$0) {
      $$0.a(avz.ds, 0.8F, 0.8F + $$0.dW().H_().i() * 0.4F);
   }

   private static void b(buj $$0) {
      $$0.a(avz.dq, 0.8F, 0.8F + $$0.dW().H_().i() * 0.4F);
   }

   private static void c(buj $$0) {
      $$0.a(avz.dr, 1.0F, 1.0F);
   }

   private static void a(dgg $$0, buj $$1) {
      $$0.a(null, $$1.dw(), avz.dp, awa.h, 0.8F, 0.8F + $$1.dW().H_().i() * 0.4F);
   }

   private void a(cov $$0) {
      csa $$1 = $$0.cd;
      if ($$1 != null) {
         $$1.a($$0.gi());
      }
   }
}
