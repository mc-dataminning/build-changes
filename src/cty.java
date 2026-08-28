import java.util.Optional;
import org.apache.commons.lang3.math.Fraction;

public class cty extends cvk {
   public static final int a = 4;
   public static final int b = 3;
   public static final int c = 12;
   public static final int d = 11;
   private static final int k = axo.a(1.0F, 1.0F, 0.33F, 0.33F);
   private static final int l = axo.a(1.0F, 0.44F, 0.53F, 1.0F);
   private final String m;
   private final String n;

   public cty(String $$0, String $$1, cvk.a $$2) {
      super($$2);
      this.m = $$0;
      this.n = $$1;
   }

   public static float b(cvp $$0) {
      cxz $$1 = $$0.a(kr.K, cxz.a);
      return $$1.f().floatValue();
   }

   public String b() {
      return this.m;
   }

   public String c() {
      return this.n;
   }

   @Override
   public boolean a(cvp $$0, cst $$1, crg $$2, cnu $$3) {
      cxz $$4 = $$0.a(kr.K);
      if ($$4 == null) {
         return false;
      } else {
         cvp $$5 = $$1.g();
         cxz.a $$6 = new cxz.a($$4);
         if ($$2 == crg.a && !$$5.f()) {
            if ($$6.a($$1, $$3) > 0) {
               this.b($$3);
            } else {
               c($$3);
            }

            $$0.b(kr.K, $$6.d());
            return true;
         } else if ($$2 == crg.b && $$5.f()) {
            cvp $$7 = $$6.b();
            if ($$7 != null) {
               cvp $$8 = $$1.d($$7);
               if ($$8.J() > 0) {
                  $$6.a($$8);
               } else {
                  this.a($$3);
               }
            }

            $$0.b(kr.K, $$6.d());
            return true;
         } else {
            return false;
         }
      }
   }

   @Override
   public boolean a(cvp $$0, cvp $$1, cst $$2, crg $$3, cnu $$4, bvb $$5) {
      if ($$3 == crg.a && $$1.f()) {
         a($$0, -1);
         return false;
      } else {
         cxz $$6 = $$0.a(kr.K);
         if ($$6 == null) {
            return false;
         } else {
            cxz.a $$7 = new cxz.a($$6);
            if ($$3 == crg.a && !$$1.f()) {
               if ($$2.b($$4) && $$7.a($$1) > 0) {
                  this.b($$4);
               } else {
                  c($$4);
               }

               $$0.b(kr.K, $$7.d());
               return true;
            } else if ($$3 == crg.b && $$1.f()) {
               if ($$2.b($$4)) {
                  cvp $$8 = $$7.b();
                  if ($$8 != null) {
                     this.a($$4);
                     $$5.a($$8);
                  }
               }

               $$0.b(kr.K, $$7.d());
               return true;
            } else {
               return false;
            }
         }
      }
   }

   @Override
   public brp a(deg $$0, cnu $$1, bro $$2) {
      cvp $$3 = $$1.b($$2);
      if (a($$3, $$1)) {
         this.d($$1);
         $$1.b(awo.c.b(this));
         return brp.a;
      } else {
         return brp.d;
      }
   }

   @Override
   public boolean c(cvp $$0) {
      cxz $$1 = $$0.a(kr.K, cxz.a);
      return $$1.f().compareTo(Fraction.ZERO) > 0;
   }

   @Override
   public int d(cvp $$0) {
      cxz $$1 = $$0.a(kr.K, cxz.a);
      return Math.min(1 + azd.a($$1.f(), 12), 13);
   }

   @Override
   public int e(cvp $$0) {
      cxz $$1 = $$0.a(kr.K, cxz.a);
      return a($$1.f());
   }

   public static int a(Fraction $$0) {
      return $$0.compareTo(Fraction.ONE) >= 0 ? k : l;
   }

   public static void a(cvp $$0, int $$1) {
      cxz $$2 = $$0.a(kr.K);
      if ($$2 != null) {
         cxz.a $$3 = new cxz.a($$2);
         $$3.a($$1);
         $$0.b(kr.K, $$3.d());
      }
   }

   public static boolean f(cvp $$0) {
      cxz $$1 = $$0.a(kr.K, cxz.a);
      return $$1.h() != -1;
   }

   public static int g(cvp $$0) {
      cxz $$1 = $$0.a(kr.K, cxz.a);
      return $$1.h();
   }

   public static cvp h(cvp $$0) {
      cxz $$1 = $$0.a(kr.K, cxz.a);
      return $$1.a($$1.h());
   }

   public static int i(cvp $$0) {
      cxz $$1 = $$0.a(kr.K, cxz.a);
      return $$1.a();
   }

   private static boolean a(cvp $$0, cnu $$1) {
      cxz $$2 = $$0.a(kr.K);
      if ($$2 != null && !$$2.g()) {
         $$0.b(kr.K, cxz.a);
         if ($$1 instanceof ari) {
            $$2.d().forEach($$1x -> $$1.a($$1x, true));
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   public Optional<ctd> j(cvp $$0) {
      return !$$0.b(kr.q) && !$$0.b(kr.p) ? Optional.ofNullable($$0.a(kr.K)).map(ctc::new) : Optional.empty();
   }

   @Override
   public void a(cke $$0) {
      cxz $$1 = $$0.m().a(kr.K);
      if ($$1 != null) {
         $$0.m().b(kr.K, cxz.a);
         cvs.a($$0, $$1.d());
      }
   }

   private void a(bto $$0) {
      $$0.a(awe.dr, 0.8F, 0.8F + $$0.dS().C_().i() * 0.4F);
   }

   private void b(bto $$0) {
      $$0.a(awe.dp, 0.8F, 0.8F + $$0.dS().C_().i() * 0.4F);
   }

   private static void c(bto $$0) {
      $$0.a(awe.dq, 1.0F, 1.0F);
   }

   private void d(bto $$0) {
      $$0.a(awe.do, 0.8F, 0.8F + $$0.dS().C_().i() * 0.4F);
   }
}
