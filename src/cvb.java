import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import org.apache.commons.lang3.math.Fraction;

public class cvb extends cwk {
   public static final int a = 4;
   public static final int b = 3;
   public static final int c = 12;
   public static final int d = 11;
   private static final int m = axk.a(1.0F, 1.0F, 0.33F, 0.33F);
   private static final int n = axk.a(1.0F, 0.44F, 0.53F, 1.0F);
   private static final int o = 10;
   private static final int p = 2;
   private static final int q = 200;

   public cvb(cwk.a $$0) {
      super($$0);
   }

   public static float c(cwo $$0) {
      cys $$1 = $$0.a(kv.P, cys.a);
      return $$1.f().floatValue();
   }

   @Override
   public boolean a(cwo $$0, cty $$1, csl $$2, cow $$3) {
      cys $$4 = $$0.a(kv.P);
      if ($$4 == null) {
         return false;
      } else {
         cwo $$5 = $$1.g();
         cys.a $$6 = new cys.a($$4);
         if ($$2 == csl.a && !$$5.f()) {
            if ($$6.a($$1, $$3) > 0) {
               b($$3);
            } else {
               c($$3);
            }

            $$0.b(kv.P, $$6.d());
            this.a($$3);
            return true;
         } else if ($$2 == csl.b && $$5.f()) {
            cwo $$7 = $$6.b();
            if ($$7 != null) {
               cwo $$8 = $$1.d($$7);
               if ($$8.M() > 0) {
                  $$6.a($$8);
               } else {
                  a((buk)$$3);
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
   public boolean a(cwo $$0, cwo $$1, cty $$2, csl $$3, cow $$4, bvy $$5) {
      if ($$3 == csl.a && $$1.f()) {
         a($$0, -1);
         return false;
      } else {
         cys $$6 = $$0.a(kv.P);
         if ($$6 == null) {
            return false;
         } else {
            cys.a $$7 = new cys.a($$6);
            if ($$3 == csl.a && !$$1.f()) {
               if ($$2.b($$4) && $$7.a($$1) > 0) {
                  b($$4);
               } else {
                  c($$4);
               }

               $$0.b(kv.P, $$7.d());
               this.a($$4);
               return true;
            } else if ($$3 == csl.b && $$1.f()) {
               if ($$2.b($$4)) {
                  cwo $$8 = $$7.b();
                  if ($$8 != null) {
                     a((buk)$$4);
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
   public bsj a(dgh $$0, cow $$1, bsi $$2) {
      $$1.c($$2);
      return bsj.a;
   }

   private void a(dgh $$0, cow $$1, cwo $$2) {
      if (this.b($$2, $$1)) {
         a($$0, $$1);
         $$1.b(awk.c.b(this));
      }
   }

   @Override
   public boolean d(cwo $$0) {
      cys $$1 = $$0.a(kv.P, cys.a);
      return $$1.f().compareTo(Fraction.ZERO) > 0;
   }

   @Override
   public int e(cwo $$0) {
      cys $$1 = $$0.a(kv.P, cys.a);
      return Math.min(1 + ayz.a($$1.f(), 12), 13);
   }

   @Override
   public int f(cwo $$0) {
      cys $$1 = $$0.a(kv.P, cys.a);
      return $$1.f().compareTo(Fraction.ONE) >= 0 ? m : n;
   }

   public static void a(cwo $$0, int $$1) {
      cys $$2 = $$0.a(kv.P);
      if ($$2 != null) {
         cys.a $$3 = new cys.a($$2);
         $$3.a($$1);
         $$0.b(kv.P, $$3.d());
      }
   }

   public static boolean g(cwo $$0) {
      cys $$1 = $$0.a(kv.P);
      return $$1 != null && $$1.h() != -1;
   }

   public static int h(cwo $$0) {
      cys $$1 = $$0.a(kv.P, cys.a);
      return $$1.h();
   }

   public static cwo i(cwo $$0) {
      cys $$1 = $$0.a(kv.P);
      return $$1 != null && $$1.h() != -1 ? $$1.a($$1.h()) : cwo.j;
   }

   public static int j(cwo $$0) {
      cys $$1 = $$0.a(kv.P, cys.a);
      return $$1.a();
   }

   private boolean b(cwo $$0, cow $$1) {
      cys $$2 = $$0.a(kv.P);
      if ($$2 != null && !$$2.g()) {
         Optional<cwo> $$3 = a($$0, $$1, $$2);
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

   private static Optional<cwo> a(cwo $$0, cow $$1, cys $$2) {
      cys.a $$3 = new cys.a($$2);
      cwo $$4 = $$3.b();
      if ($$4 != null) {
         a((buk)$$1);
         $$0.b(kv.P, $$3.d());
         return Optional.of($$4);
      } else {
         return Optional.empty();
      }
   }

   @Override
   public void a(dgh $$0, bvg $$1, cwo $$2, int $$3) {
      if ($$1 instanceof cow $$4) {
         int $$5 = this.a($$2, $$1);
         boolean $$6 = $$3 == $$5;
         if ($$6 || $$3 < $$5 - 10 && $$3 % 2 == 0) {
            this.a($$0, $$4, $$2);
         }
      }
   }

   @Override
   public int a(cwo $$0, bvg $$1) {
      return 200;
   }

   @Override
   public cwq b(cwo $$0) {
      return cwq.k;
   }

   @Override
   public Optional<cui> k(cwo $$0) {
      return !$$0.b(kv.r) && !$$0.b(kv.q) ? Optional.ofNullable($$0.a(kv.P)).map(cuh::new) : Optional.empty();
   }

   @Override
   public void a(clb $$0) {
      cys $$1 = $$0.l().a(kv.P);
      if ($$1 != null) {
         $$0.l().b(kv.P, cys.a);
         cwr.a($$0, $$1.d());
      }
   }

   public static List<cvb> b() {
      return Stream.of(cws.rB, cws.rC, cws.rD, cws.rE, cws.rF, cws.rG, cws.rH, cws.rI, cws.rJ, cws.rK, cws.rL, cws.rR, cws.rO, cws.rP, cws.rQ, cws.rN, cws.rM)
         .map($$0 -> (cvb)$$0)
         .toList();
   }

   public static cwk a(cvl $$0) {
      return switch ($$0) {
         case a -> cws.rC;
         case b -> cws.rD;
         case c -> cws.rE;
         case d -> cws.rF;
         case e -> cws.rG;
         case f -> cws.rH;
         case g -> cws.rI;
         case h -> cws.rJ;
         case i -> cws.rK;
         case j -> cws.rL;
         case l -> cws.rN;
         case m -> cws.rO;
         case n -> cws.rP;
         case o -> cws.rQ;
         case p -> cws.rR;
         case k -> cws.rM;
      };
   }

   private static void a(buk $$0) {
      $$0.a(awa.ds, 0.8F, 0.8F + $$0.dV().H_().i() * 0.4F);
   }

   private static void b(buk $$0) {
      $$0.a(awa.dq, 0.8F, 0.8F + $$0.dV().H_().i() * 0.4F);
   }

   private static void c(buk $$0) {
      $$0.a(awa.dr, 1.0F, 1.0F);
   }

   private static void a(dgh $$0, buk $$1) {
      $$0.a(null, $$1.dv(), awa.dp, awb.h, 0.8F, 0.8F + $$1.dV().H_().i() * 0.4F);
   }

   private void a(cow $$0) {
      csb $$1 = $$0.cd;
      if ($$1 != null) {
         $$1.a($$0.gi());
      }
   }
}
