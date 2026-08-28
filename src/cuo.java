import java.util.Optional;
import org.apache.commons.lang3.math.Fraction;

public class cuo extends cvx {
   public static final int a = 4;
   public static final int b = 3;
   public static final int c = 12;
   public static final int d = 11;
   private static final int l = axv.a(1.0F, 1.0F, 0.33F, 0.33F);
   private static final int m = axv.a(1.0F, 0.44F, 0.53F, 1.0F);
   private static final int n = 10;
   private static final int o = 2;
   private static final int p = 60;
   private final ali q;
   private final ali r;

   public cuo(ali $$0, ali $$1, cvx.a $$2) {
      super($$2);
      this.q = $$0;
      this.r = $$1;
   }

   public static float c(cwb $$0) {
      cyf $$1 = $$0.a(ku.P, cyf.a);
      return $$1.f().floatValue();
   }

   public ali b() {
      return this.q;
   }

   public ali c() {
      return this.r;
   }

   @Override
   public boolean a(cwb $$0, ctl $$1, cry $$2, com $$3) {
      cyf $$4 = $$0.a(ku.P);
      if ($$4 == null) {
         return false;
      } else {
         cwb $$5 = $$1.g();
         cyf.a $$6 = new cyf.a($$4);
         if ($$2 == cry.a && !$$5.f()) {
            if ($$6.a($$1, $$3) > 0) {
               b($$3);
            } else {
               c($$3);
            }

            $$0.b(ku.P, $$6.d());
            return true;
         } else if ($$2 == cry.b && $$5.f()) {
            cwb $$7 = $$6.b();
            if ($$7 != null) {
               cwb $$8 = $$1.d($$7);
               if ($$8.L() > 0) {
                  $$6.a($$8);
               } else {
                  a($$3);
               }
            }

            $$0.b(ku.P, $$6.d());
            return true;
         } else {
            return false;
         }
      }
   }

   @Override
   public boolean a(cwb $$0, cwb $$1, ctl $$2, cry $$3, com $$4, bvs $$5) {
      if ($$3 == cry.a && $$1.f()) {
         a($$0, -1);
         return false;
      } else {
         cyf $$6 = $$0.a(ku.P);
         if ($$6 == null) {
            return false;
         } else {
            cyf.a $$7 = new cyf.a($$6);
            if ($$3 == cry.a && !$$1.f()) {
               if ($$2.b($$4) && $$7.a($$1) > 0) {
                  b($$4);
               } else {
                  c($$4);
               }

               $$0.b(ku.P, $$7.d());
               return true;
            } else if ($$3 == cry.b && $$1.f()) {
               if ($$2.b($$4)) {
                  cwb $$8 = $$7.b();
                  if ($$8 != null) {
                     a($$4);
                     $$5.a($$8);
                  }
               }

               $$0.b(ku.P, $$7.d());
               return true;
            } else {
               a($$0, -1);
               return false;
            }
         }
      }
   }

   @Override
   public bsd a(dfb $$0, com $$1, bsc $$2) {
      if ($$0.C) {
         return bsd.c;
      } else {
         $$1.c($$2);
         return bsd.b;
      }
   }

   private void a(com $$0, cwb $$1) {
      if (this.a($$1, $$0)) {
         d($$0);
         $$0.b(awv.c.b(this));
      }
   }

   @Override
   public boolean d(cwb $$0) {
      cyf $$1 = $$0.a(ku.P, cyf.a);
      return $$1.f().compareTo(Fraction.ZERO) > 0;
   }

   @Override
   public int e(cwb $$0) {
      cyf $$1 = $$0.a(ku.P, cyf.a);
      return Math.min(1 + azk.a($$1.f(), 12), 13);
   }

   @Override
   public int f(cwb $$0) {
      cyf $$1 = $$0.a(ku.P, cyf.a);
      return $$1.f().compareTo(Fraction.ONE) >= 0 ? l : m;
   }

   public static void a(cwb $$0, int $$1) {
      cyf $$2 = $$0.a(ku.P);
      if ($$2 != null) {
         cyf.a $$3 = new cyf.a($$2);
         $$3.a($$1);
         $$0.b(ku.P, $$3.d());
      }
   }

   public static boolean g(cwb $$0) {
      cyf $$1 = $$0.a(ku.P, cyf.a);
      return $$1.h() != -1;
   }

   public static int h(cwb $$0) {
      cyf $$1 = $$0.a(ku.P, cyf.a);
      return $$1.h();
   }

   public static cwb i(cwb $$0) {
      cyf $$1 = $$0.a(ku.P, cyf.a);
      return $$1.a($$1.h());
   }

   public static int j(cwb $$0) {
      cyf $$1 = $$0.a(ku.P, cyf.a);
      return $$1.a();
   }

   private boolean a(cwb $$0, com $$1) {
      cyf $$2 = $$0.a(ku.P);
      if ($$2 != null && !$$2.g()) {
         Optional<cwb> $$3 = a($$0, $$1, $$2);
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

   private static Optional<cwb> a(cwb $$0, com $$1, cyf $$2) {
      cyf.a $$3 = new cyf.a($$2);
      cwb $$4 = $$3.b();
      if ($$4 != null) {
         a($$1);
         $$0.b(ku.P, $$3.d());
         return Optional.of($$4);
      } else {
         return Optional.empty();
      }
   }

   @Override
   public void a(dfb $$0, bva $$1, cwb $$2, int $$3) {
      if (!$$0.C && $$1 instanceof com $$4) {
         int $$5 = this.a($$2, $$1);
         boolean $$6 = $$3 == $$5;
         if ($$6 || $$3 < $$5 - 10 && $$3 % 2 == 0) {
            this.a($$4, $$2);
         }
      }
   }

   @Override
   public int a(cwb $$0, bva $$1) {
      return 60;
   }

   @Override
   public Optional<ctv> k(cwb $$0) {
      return !$$0.b(ku.r) && !$$0.b(ku.q) ? Optional.ofNullable($$0.a(ku.P)).map(ctu::new) : Optional.empty();
   }

   @Override
   public void a(ckv $$0) {
      cyf $$1 = $$0.m().a(ku.P);
      if ($$1 != null) {
         $$0.m().b(ku.P, cyf.a);
         cwe.a($$0, $$1.d());
      }
   }

   private static void a(bue $$0) {
      $$0.a(awl.dr, 0.8F, 0.8F + $$0.dX().E_().i() * 0.4F);
   }

   private static void b(bue $$0) {
      $$0.a(awl.dp, 0.8F, 0.8F + $$0.dX().E_().i() * 0.4F);
   }

   private static void c(bue $$0) {
      $$0.a(awl.dq, 1.0F, 1.0F);
   }

   private static void d(bue $$0) {
      $$0.a(awl.do, 0.8F, 0.8F + $$0.dX().E_().i() * 0.4F);
   }
}
