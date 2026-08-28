import java.util.Optional;
import org.apache.commons.lang3.math.Fraction;

public class cts extends cvg {
   public static final int a = 4;
   public static final int b = 2;
   public static final int c = 8;
   public static final int d = 7;
   private static final int k = axn.a(1.0F, 1.0F, 0.33F, 0.33F);
   private static final int l = axn.a(1.0F, 0.44F, 0.53F, 1.0F);
   private final String m;
   private final String n;

   public cts(String $$0, String $$1, cvg.a $$2) {
      super($$2);
      this.m = $$0;
      this.n = $$1;
   }

   public static float c(cvl $$0) {
      cxy $$1 = $$0.a(kr.H, cxy.a);
      return $$1.f().floatValue();
   }

   public String b() {
      return this.m;
   }

   public String c() {
      return this.n;
   }

   @Override
   public boolean a(cvl $$0, csn $$1, cra $$2, cnp $$3) {
      cxy $$4 = $$0.a(kr.H);
      if ($$4 == null) {
         return false;
      } else {
         cvl $$5 = $$1.g();
         cxy.a $$6 = new cxy.a($$4);
         if ($$2 == cra.a && !$$5.f()) {
            if ($$6.a($$1, $$3) > 0) {
               this.b($$3);
            } else {
               c($$3);
            }

            $$0.b(kr.H, $$6.d());
            return true;
         } else if ($$2 == cra.b && $$5.f()) {
            cvl $$7 = $$6.b();
            if ($$7 != null) {
               cvl $$8 = $$1.d($$7);
               if ($$8.J() > 0) {
                  $$6.a($$8);
               } else {
                  this.a($$3);
               }
            }

            $$0.b(kr.H, $$6.d());
            return true;
         } else {
            return false;
         }
      }
   }

   @Override
   public boolean a(cvl $$0, cvl $$1, csn $$2, cra $$3, cnp $$4, buw $$5) {
      if ($$3 == cra.a && $$1.f()) {
         a($$0, -1);
         return false;
      } else {
         cxy $$6 = $$0.a(kr.H);
         if ($$6 == null) {
            return false;
         } else {
            cxy.a $$7 = new cxy.a($$6);
            if ($$3 == cra.a && !$$1.f()) {
               if ($$2.b($$4) && $$7.a($$1) > 0) {
                  this.b($$4);
               } else {
                  c($$4);
               }

               $$0.b(kr.H, $$7.d());
               return true;
            } else if ($$3 == cra.b && $$1.f()) {
               if ($$2.b($$4)) {
                  cvl $$8 = $$7.b();
                  if ($$8 != null) {
                     this.a($$4);
                     $$5.a($$8);
                  }
               }

               $$0.b(kr.H, $$7.d());
               return true;
            } else {
               return false;
            }
         }
      }
   }

   @Override
   public brk a(dds $$0, cnp $$1, brj $$2) {
      cvl $$3 = $$1.b($$2);
      if (a($$3, $$1)) {
         this.d($$1);
         $$1.b(awn.c.b(this));
         return brk.a;
      } else {
         return brk.d;
      }
   }

   @Override
   public boolean d(cvl $$0) {
      cxy $$1 = $$0.a(kr.H, cxy.a);
      return $$1.f().compareTo(Fraction.ZERO) > 0;
   }

   @Override
   public int e(cvl $$0) {
      cxy $$1 = $$0.a(kr.H, cxy.a);
      return Math.min(1 + azc.a($$1.f(), 12), 13);
   }

   @Override
   public int f(cvl $$0) {
      cxy $$1 = $$0.a(kr.H, cxy.a);
      return a($$1.f());
   }

   public static int a(Fraction $$0) {
      return $$0.compareTo(Fraction.ONE) >= 0 ? k : l;
   }

   public static void a(cvl $$0, int $$1) {
      cxy $$2 = $$0.a(kr.H);
      if ($$2 != null) {
         cxy.a $$3 = new cxy.a($$2);
         $$3.a($$1);
         $$0.b(kr.H, $$3.d());
      }
   }

   public static boolean g(cvl $$0) {
      cxy $$1 = $$0.a(kr.H, cxy.a);
      return $$1.h() != -1;
   }

   public static int h(cvl $$0) {
      cxy $$1 = $$0.a(kr.H, cxy.a);
      return $$1.h();
   }

   public static cvl i(cvl $$0) {
      cxy $$1 = $$0.a(kr.H, cxy.a);
      return $$1.a($$1.h());
   }

   public static int j(cvl $$0) {
      cxy $$1 = $$0.a(kr.H, cxy.a);
      return $$1.a();
   }

   private static boolean a(cvl $$0, cnp $$1) {
      cxy $$2 = $$0.a(kr.H);
      if ($$2 != null && !$$2.g()) {
         $$0.b(kr.H, cxy.a);
         if ($$1 instanceof arh) {
            $$2.d().forEach($$1x -> $$1.a($$1x, true));
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   public Optional<csx> k(cvl $$0) {
      return !$$0.b(kr.q) && !$$0.b(kr.p) ? Optional.ofNullable($$0.a(kr.H)).map(csw::new) : Optional.empty();
   }

   @Override
   public void a(cjz $$0) {
      cxy $$1 = $$0.m().a(kr.H);
      if ($$1 != null) {
         $$0.m().b(kr.H, cxy.a);
         cvn.a($$0, $$1.d());
      }
   }

   private void a(btj $$0) {
      $$0.a(awd.dr, 0.8F, 0.8F + $$0.dS().C_().i() * 0.4F);
   }

   private void b(btj $$0) {
      $$0.a(awd.dp, 0.8F, 0.8F + $$0.dS().C_().i() * 0.4F);
   }

   private static void c(btj $$0) {
      $$0.a(awd.dq, 1.0F, 1.0F);
   }

   private void d(btj $$0) {
      $$0.a(awd.do, 0.8F, 0.8F + $$0.dS().C_().i() * 0.4F);
   }
}
