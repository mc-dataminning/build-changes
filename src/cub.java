import java.util.Optional;
import org.apache.commons.lang3.math.Fraction;

public class cub extends cvn {
   public static final int a = 4;
   public static final int b = 3;
   public static final int c = 12;
   public static final int d = 11;
   private static final int k = axq.a(1.0F, 1.0F, 0.33F, 0.33F);
   private static final int l = axq.a(1.0F, 0.44F, 0.53F, 1.0F);
   private final String m;
   private final String n;

   public cub(String $$0, String $$1, cvn.a $$2) {
      super($$2);
      this.m = $$0;
      this.n = $$1;
   }

   public static float b(cvs $$0) {
      cyc $$1 = $$0.a(ks.K, cyc.a);
      return $$1.f().floatValue();
   }

   public String b() {
      return this.m;
   }

   public String c() {
      return this.n;
   }

   @Override
   public boolean a(cvs $$0, csw $$1, crj $$2, cnx $$3) {
      cyc $$4 = $$0.a(ks.K);
      if ($$4 == null) {
         return false;
      } else {
         cvs $$5 = $$1.g();
         cyc.a $$6 = new cyc.a($$4);
         if ($$2 == crj.a && !$$5.f()) {
            if ($$6.a($$1, $$3) > 0) {
               this.b($$3);
            } else {
               c($$3);
            }

            $$0.b(ks.K, $$6.d());
            return true;
         } else if ($$2 == crj.b && $$5.f()) {
            cvs $$7 = $$6.b();
            if ($$7 != null) {
               cvs $$8 = $$1.d($$7);
               if ($$8.K() > 0) {
                  $$6.a($$8);
               } else {
                  this.a($$3);
               }
            }

            $$0.b(ks.K, $$6.d());
            return true;
         } else {
            return false;
         }
      }
   }

   @Override
   public boolean a(cvs $$0, cvs $$1, csw $$2, crj $$3, cnx $$4, bve $$5) {
      if ($$3 == crj.a && $$1.f()) {
         a($$0, -1);
         return false;
      } else {
         cyc $$6 = $$0.a(ks.K);
         if ($$6 == null) {
            return false;
         } else {
            cyc.a $$7 = new cyc.a($$6);
            if ($$3 == crj.a && !$$1.f()) {
               if ($$2.b($$4) && $$7.a($$1) > 0) {
                  this.b($$4);
               } else {
                  c($$4);
               }

               $$0.b(ks.K, $$7.d());
               return true;
            } else if ($$3 == crj.b && $$1.f()) {
               if ($$2.b($$4)) {
                  cvs $$8 = $$7.b();
                  if ($$8 != null) {
                     this.a($$4);
                     $$5.a($$8);
                  }
               }

               $$0.b(ks.K, $$7.d());
               return true;
            } else {
               return false;
            }
         }
      }
   }

   @Override
   public brs a(dej $$0, cnx $$1, brr $$2) {
      cvs $$3 = $$1.b($$2);
      if (a($$3, $$1)) {
         this.d($$1);
         $$1.b(awq.c.b(this));
         return brs.a;
      } else {
         return brs.d;
      }
   }

   @Override
   public boolean c(cvs $$0) {
      cyc $$1 = $$0.a(ks.K, cyc.a);
      return $$1.f().compareTo(Fraction.ZERO) > 0;
   }

   @Override
   public int d(cvs $$0) {
      cyc $$1 = $$0.a(ks.K, cyc.a);
      return Math.min(1 + azf.a($$1.f(), 12), 13);
   }

   @Override
   public int e(cvs $$0) {
      cyc $$1 = $$0.a(ks.K, cyc.a);
      return $$1.f().compareTo(Fraction.ONE) >= 0 ? k : l;
   }

   public static void a(cvs $$0, int $$1) {
      cyc $$2 = $$0.a(ks.K);
      if ($$2 != null) {
         cyc.a $$3 = new cyc.a($$2);
         $$3.a($$1);
         $$0.b(ks.K, $$3.d());
      }
   }

   public static boolean f(cvs $$0) {
      cyc $$1 = $$0.a(ks.K, cyc.a);
      return $$1.h() != -1;
   }

   public static int g(cvs $$0) {
      cyc $$1 = $$0.a(ks.K, cyc.a);
      return $$1.h();
   }

   public static cvs h(cvs $$0) {
      cyc $$1 = $$0.a(ks.K, cyc.a);
      return $$1.a($$1.h());
   }

   public static int i(cvs $$0) {
      cyc $$1 = $$0.a(ks.K, cyc.a);
      return $$1.a();
   }

   private static boolean a(cvs $$0, cnx $$1) {
      cyc $$2 = $$0.a(ks.K);
      if ($$2 != null && !$$2.g()) {
         $$0.b(ks.K, cyc.a);
         if ($$1 instanceof ark) {
            $$2.d().forEach($$1x -> $$1.a($$1x, true));
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   public Optional<ctg> j(cvs $$0) {
      return !$$0.b(ks.q) && !$$0.b(ks.p) ? Optional.ofNullable($$0.a(ks.K)).map(ctf::new) : Optional.empty();
   }

   @Override
   public void a(ckh $$0) {
      cyc $$1 = $$0.m().a(ks.K);
      if ($$1 != null) {
         $$0.m().b(ks.K, cyc.a);
         cvv.a($$0, $$1.d());
      }
   }

   private void a(btr $$0) {
      $$0.a(awg.dr, 0.8F, 0.8F + $$0.dS().D_().i() * 0.4F);
   }

   private void b(btr $$0) {
      $$0.a(awg.dp, 0.8F, 0.8F + $$0.dS().D_().i() * 0.4F);
   }

   private static void c(btr $$0) {
      $$0.a(awg.dq, 1.0F, 1.0F);
   }

   private void d(btr $$0) {
      $$0.a(awg.do, 0.8F, 0.8F + $$0.dS().D_().i() * 0.4F);
   }
}
