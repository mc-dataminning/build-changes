import java.util.Optional;
import org.apache.commons.lang3.math.Fraction;

public class cuj extends cvt {
   public static final int a = 4;
   public static final int b = 3;
   public static final int c = 12;
   public static final int d = 11;
   private static final int l = axu.a(1.0F, 1.0F, 0.33F, 0.33F);
   private static final int m = axu.a(1.0F, 0.44F, 0.53F, 1.0F);
   private static final int n = 10;
   private static final int o = 2;
   private static final int p = 60;
   private final alh q;
   private final alh r;

   public cuj(alh $$0, alh $$1, cvt.a $$2) {
      super($$2);
      this.q = $$0;
      this.r = $$1;
   }

   public static float b(cvx $$0) {
      cyb $$1 = $$0.a(kt.O, cyb.a);
      return $$1.f().floatValue();
   }

   public alh b() {
      return this.q;
   }

   public alh c() {
      return this.r;
   }

   @Override
   public boolean a(cvx $$0, ctg $$1, crt $$2, coh $$3) {
      cyb $$4 = $$0.a(kt.O);
      if ($$4 == null) {
         return false;
      } else {
         cvx $$5 = $$1.g();
         cyb.a $$6 = new cyb.a($$4);
         if ($$2 == crt.a && !$$5.f()) {
            if ($$6.a($$1, $$3) > 0) {
               b($$3);
            } else {
               c($$3);
            }

            $$0.b(kt.O, $$6.d());
            return true;
         } else if ($$2 == crt.b && $$5.f()) {
            cvx $$7 = $$6.b();
            if ($$7 != null) {
               cvx $$8 = $$1.d($$7);
               if ($$8.L() > 0) {
                  $$6.a($$8);
               } else {
                  a($$3);
               }
            }

            $$0.b(kt.O, $$6.d());
            return true;
         } else {
            return false;
         }
      }
   }

   @Override
   public boolean a(cvx $$0, cvx $$1, ctg $$2, crt $$3, coh $$4, bvn $$5) {
      if ($$3 == crt.a && $$1.f()) {
         a($$0, -1);
         return false;
      } else {
         cyb $$6 = $$0.a(kt.O);
         if ($$6 == null) {
            return false;
         } else {
            cyb.a $$7 = new cyb.a($$6);
            if ($$3 == crt.a && !$$1.f()) {
               if ($$2.b($$4) && $$7.a($$1) > 0) {
                  b($$4);
               } else {
                  c($$4);
               }

               $$0.b(kt.O, $$7.d());
               return true;
            } else if ($$3 == crt.b && $$1.f()) {
               if ($$2.b($$4)) {
                  cvx $$8 = $$7.b();
                  if ($$8 != null) {
                     a($$4);
                     $$5.a($$8);
                  }
               }

               $$0.b(kt.O, $$7.d());
               return true;
            } else {
               return false;
            }
         }
      }
   }

   @Override
   public bry a(dev $$0, coh $$1, brx $$2) {
      if ($$0.C) {
         return bry.c;
      } else {
         $$1.c($$2);
         return bry.b;
      }
   }

   private void a(coh $$0, cvx $$1) {
      if (this.a($$1, $$0)) {
         d($$0);
         $$0.b(awu.c.b(this));
      }
   }

   @Override
   public boolean c(cvx $$0) {
      cyb $$1 = $$0.a(kt.O, cyb.a);
      return $$1.f().compareTo(Fraction.ZERO) > 0;
   }

   @Override
   public int d(cvx $$0) {
      cyb $$1 = $$0.a(kt.O, cyb.a);
      return Math.min(1 + azj.a($$1.f(), 12), 13);
   }

   @Override
   public int e(cvx $$0) {
      cyb $$1 = $$0.a(kt.O, cyb.a);
      return $$1.f().compareTo(Fraction.ONE) >= 0 ? l : m;
   }

   public static void a(cvx $$0, int $$1) {
      cyb $$2 = $$0.a(kt.O);
      if ($$2 != null) {
         cyb.a $$3 = new cyb.a($$2);
         $$3.a($$1);
         $$0.b(kt.O, $$3.d());
      }
   }

   public static boolean f(cvx $$0) {
      cyb $$1 = $$0.a(kt.O, cyb.a);
      return $$1.h() != -1;
   }

   public static int g(cvx $$0) {
      cyb $$1 = $$0.a(kt.O, cyb.a);
      return $$1.h();
   }

   public static cvx h(cvx $$0) {
      cyb $$1 = $$0.a(kt.O, cyb.a);
      return $$1.a($$1.h());
   }

   public static int i(cvx $$0) {
      cyb $$1 = $$0.a(kt.O, cyb.a);
      return $$1.a();
   }

   private boolean a(cvx $$0, coh $$1) {
      cyb $$2 = $$0.a(kt.O);
      if ($$2 != null && !$$2.g()) {
         Optional<cvx> $$3 = a($$0, $$1, $$2);
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

   private static Optional<cvx> a(cvx $$0, coh $$1, cyb $$2) {
      cyb.a $$3 = new cyb.a($$2);
      cvx $$4 = $$3.b();
      if ($$4 != null) {
         a($$1);
         $$0.b(kt.O, $$3.d());
         return Optional.of($$4);
      } else {
         return Optional.empty();
      }
   }

   @Override
   public void a(dev $$0, buv $$1, cvx $$2, int $$3) {
      if (!$$0.C && $$1 instanceof coh $$4) {
         int $$5 = this.a($$2, $$1);
         boolean $$6 = $$3 == $$5;
         if ($$6 || $$3 < $$5 - 10 && $$3 % 2 == 0) {
            this.a($$4, $$2);
         }
      }
   }

   @Override
   public int a(cvx $$0, buv $$1) {
      return 60;
   }

   @Override
   public Optional<ctq> j(cvx $$0) {
      return !$$0.b(kt.r) && !$$0.b(kt.q) ? Optional.ofNullable($$0.a(kt.O)).map(ctp::new) : Optional.empty();
   }

   @Override
   public void a(ckq $$0) {
      cyb $$1 = $$0.m().a(kt.O);
      if ($$1 != null) {
         $$0.m().b(kt.O, cyb.a);
         cwa.a($$0, $$1.d());
      }
   }

   private static void a(btz $$0) {
      $$0.a(awk.dr, 0.8F, 0.8F + $$0.dX().E_().i() * 0.4F);
   }

   private static void b(btz $$0) {
      $$0.a(awk.dp, 0.8F, 0.8F + $$0.dX().E_().i() * 0.4F);
   }

   private static void c(btz $$0) {
      $$0.a(awk.dq, 1.0F, 1.0F);
   }

   private static void d(btz $$0) {
      $$0.a(awk.do, 0.8F, 0.8F + $$0.dX().E_().i() * 0.4F);
   }
}
