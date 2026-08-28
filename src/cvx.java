import java.util.Optional;
import org.apache.commons.lang3.math.Fraction;

public class cvx extends cxg {
   public static final int a = 4;
   public static final int b = 3;
   public static final int c = 12;
   public static final int d = 11;
   private static final int l = ayp.a(1.0F, 1.0F, 0.33F, 0.33F);
   private static final int m = ayp.a(1.0F, 0.44F, 0.53F, 1.0F);
   private static final int n = 10;
   private static final int o = 2;
   private static final int p = 60;
   private final alz q;
   private final alz r;

   public cvx(alz $$0, alz $$1, cxg.a $$2) {
      super($$2);
      this.q = $$0;
      this.r = $$1;
   }

   public static float c(cxk $$0) {
      czo $$1 = $$0.a(ku.P, czo.a);
      return $$1.f().floatValue();
   }

   public alz b() {
      return this.q;
   }

   public alz c() {
      return this.r;
   }

   @Override
   public boolean a(cxk $$0, cuu $$1, cth $$2, cps $$3) {
      czo $$4 = $$0.a(ku.P);
      if ($$4 == null) {
         return false;
      } else {
         cxk $$5 = $$1.g();
         czo.a $$6 = new czo.a($$4);
         if ($$2 == cth.a && !$$5.f()) {
            if ($$6.a($$1, $$3) > 0) {
               b($$3);
            } else {
               c($$3);
            }

            $$0.b(ku.P, $$6.d());
            this.a($$3);
            return true;
         } else if ($$2 == cth.b && $$5.f()) {
            cxk $$7 = $$6.b();
            if ($$7 != null) {
               cxk $$8 = $$1.d($$7);
               if ($$8.L() > 0) {
                  $$6.a($$8);
               } else {
                  a((bvf)$$3);
               }
            }

            $$0.b(ku.P, $$6.d());
            this.a($$3);
            return true;
         } else {
            return false;
         }
      }
   }

   @Override
   public boolean a(cxk $$0, cxk $$1, cuu $$2, cth $$3, cps $$4, bwt $$5) {
      if ($$3 == cth.a && $$1.f()) {
         a($$0, -1);
         return false;
      } else {
         czo $$6 = $$0.a(ku.P);
         if ($$6 == null) {
            return false;
         } else {
            czo.a $$7 = new czo.a($$6);
            if ($$3 == cth.a && !$$1.f()) {
               if ($$2.b($$4) && $$7.a($$1) > 0) {
                  b($$4);
               } else {
                  c($$4);
               }

               $$0.b(ku.P, $$7.d());
               this.a($$4);
               return true;
            } else if ($$3 == cth.b && $$1.f()) {
               if ($$2.b($$4)) {
                  cxk $$8 = $$7.b();
                  if ($$8 != null) {
                     a((bvf)$$4);
                     $$5.a($$8);
                  }
               }

               $$0.b(ku.P, $$7.d());
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
   public bte a(dha $$0, cps $$1, btd $$2) {
      if ($$0.C) {
         return bte.c;
      } else {
         $$1.c($$2);
         return bte.b;
      }
   }

   private void a(dha $$0, cps $$1, cxk $$2) {
      if (this.a($$2, $$1)) {
         a($$0, $$1);
         $$1.b(axp.c.b(this));
      }
   }

   @Override
   public boolean d(cxk $$0) {
      czo $$1 = $$0.a(ku.P, czo.a);
      return $$1.f().compareTo(Fraction.ZERO) > 0;
   }

   @Override
   public int e(cxk $$0) {
      czo $$1 = $$0.a(ku.P, czo.a);
      return Math.min(1 + bae.a($$1.f(), 12), 13);
   }

   @Override
   public int f(cxk $$0) {
      czo $$1 = $$0.a(ku.P, czo.a);
      return $$1.f().compareTo(Fraction.ONE) >= 0 ? l : m;
   }

   public static void a(cxk $$0, int $$1) {
      czo $$2 = $$0.a(ku.P);
      if ($$2 != null) {
         czo.a $$3 = new czo.a($$2);
         $$3.a($$1);
         $$0.b(ku.P, $$3.d());
      }
   }

   public static boolean g(cxk $$0) {
      czo $$1 = $$0.a(ku.P, czo.a);
      return $$1.h() != -1;
   }

   public static int h(cxk $$0) {
      czo $$1 = $$0.a(ku.P, czo.a);
      return $$1.h();
   }

   public static cxk i(cxk $$0) {
      czo $$1 = $$0.a(ku.P, czo.a);
      return $$1.a($$1.h());
   }

   public static int j(cxk $$0) {
      czo $$1 = $$0.a(ku.P, czo.a);
      return $$1.a();
   }

   private boolean a(cxk $$0, cps $$1) {
      czo $$2 = $$0.a(ku.P);
      if ($$2 != null && !$$2.g()) {
         Optional<cxk> $$3 = a($$0, $$1, $$2);
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

   private static Optional<cxk> a(cxk $$0, cps $$1, czo $$2) {
      czo.a $$3 = new czo.a($$2);
      cxk $$4 = $$3.b();
      if ($$4 != null) {
         a((bvf)$$1);
         $$0.b(ku.P, $$3.d());
         return Optional.of($$4);
      } else {
         return Optional.empty();
      }
   }

   @Override
   public void a(dha $$0, bwb $$1, cxk $$2, int $$3) {
      if (!$$0.C && $$1 instanceof cps $$4) {
         int $$5 = this.a($$2, $$1);
         boolean $$6 = $$3 == $$5;
         if ($$6 || $$3 < $$5 - 10 && $$3 % 2 == 0) {
            this.a($$0, $$4, $$2);
         }
      }
   }

   @Override
   public int a(cxk $$0, bwb $$1) {
      return 60;
   }

   @Override
   public Optional<cve> k(cxk $$0) {
      return !$$0.b(ku.r) && !$$0.b(ku.q) ? Optional.ofNullable($$0.a(ku.P)).map(cvd::new) : Optional.empty();
   }

   @Override
   public void a(clw $$0) {
      czo $$1 = $$0.l().a(ku.P);
      if ($$1 != null) {
         $$0.l().b(ku.P, czo.a);
         cxn.a($$0, $$1.d());
      }
   }

   public static cxg a(cwh $$0) {
      return switch ($$0) {
         case a -> cxo.rt;
         case b -> cxo.ru;
         case c -> cxo.rv;
         case d -> cxo.rw;
         case e -> cxo.rx;
         case f -> cxo.ry;
         case g -> cxo.rz;
         case h -> cxo.rA;
         case i -> cxo.rB;
         case j -> cxo.rC;
         case l -> cxo.rE;
         case m -> cxo.rF;
         case n -> cxo.rG;
         case o -> cxo.rH;
         case p -> cxo.rI;
         case k -> cxo.rD;
      };
   }

   private static void a(bvf $$0) {
      $$0.a(axf.dr, 0.8F, 0.8F + $$0.dV().H_().i() * 0.4F);
   }

   private static void b(bvf $$0) {
      $$0.a(axf.dp, 0.8F, 0.8F + $$0.dV().H_().i() * 0.4F);
   }

   private static void c(bvf $$0) {
      $$0.a(axf.dq, 1.0F, 1.0F);
   }

   private static void a(dha $$0, bvf $$1) {
      $$0.a(null, $$1.dv(), axf.do, axg.h, 0.8F, 0.8F + $$1.dV().H_().i() * 0.4F);
   }

   private void a(cps $$0) {
      csx $$1 = $$0.cd;
      if ($$1 != null) {
         $$1.a($$0.gg());
      }
   }
}
