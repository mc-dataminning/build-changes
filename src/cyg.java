import java.util.Map;
import javax.annotation.Nullable;

public class cyg extends czu {
   @Deprecated
   private final dnc a;

   public cyg(dnc $$0, czu.a $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   public bur a(ddt $$0) {
      bur $$1 = this.a(new ddr($$0));
      return !$$1.a() && $$0.n().c(kk.w) ? super.a($$0.q(), $$0.o(), $$0.p()) : $$1;
   }

   public bur a(ddr $$0) {
      if (!this.c().a($$0.q().K())) {
         return bur.d;
      } else if (!$$0.b()) {
         return bur.d;
      } else {
         ddr $$1 = this.b($$0);
         if ($$1 == null) {
            return bur.d;
         } else {
            ebe $$2 = this.c($$1);
            if ($$2 == null) {
               return bur.d;
            } else if (!this.a($$1, $$2)) {
               return bur.d;
            } else {
               iv $$3 = $$1.a();
               djx $$4 = $$1.q();
               crx $$5 = $$1.o();
               czy $$6 = $$1.n();
               ebe $$7 = $$4.a_($$3);
               if ($$7.a($$2.b())) {
                  $$7 = this.a($$3, $$4, $$6, $$7);
                  this.a($$3, $$4, $$5, $$6, $$7);
                  a($$4, $$3, $$6);
                  $$7.b().a($$4, $$3, $$7, $$5, $$6);
                  if ($$5 instanceof art) {
                     aq.z.a((art)$$5, $$3, $$6);
                  }
               }

               duz $$8 = $$7.A();
               $$4.a($$5, $$3, this.a($$7), awq.e, ($$8.a() + 1.0F) / 2.0F, $$8.b() * 0.8F);
               $$4.a(ege.i, $$3, ege.a.a($$5, $$7));
               $$6.a(1, $$5);
               return bur.a;
            }
         }
      }
   }

   protected awo a(ebe $$0) {
      return $$0.A().e();
   }

   @Nullable
   public ddr b(ddr $$0) {
      return $$0;
   }

   private static void a(djx $$0, iv $$1, czy $$2) {
      dyc $$3 = $$0.c_($$1);
      if ($$3 != null) {
         $$3.a($$2);
         $$3.e();
      }
   }

   protected boolean a(iv $$0, djx $$1, @Nullable crx $$2, czy $$3, ebe $$4) {
      return a($$1, $$2, $$0, $$3);
   }

   @Nullable
   protected ebe c(ddr $$0) {
      ebe $$1 = this.c().a($$0);
      return $$1 != null && this.b($$0, $$1) ? $$1 : null;
   }

   private ebe a(iv $$0, djx $$1, czy $$2, ebe $$3) {
      dby $$4 = $$2.a(kk.aq, dby.a);
      if ($$4.a()) {
         return $$3;
      } else {
         ebe $$5 = $$4.a($$3);
         if ($$5 != $$3) {
            $$1.a($$0, $$5, 2);
         }

         return $$5;
      }
   }

   protected boolean b(ddr $$0, ebe $$1) {
      crx $$2 = $$0.o();
      return (!this.b() || $$1.a((dka)$$0.q(), $$0.a())) && $$0.q().a($$1, $$0.a(), ffv.b($$2));
   }

   protected boolean b() {
      return true;
   }

   protected boolean a(ddr $$0, ebe $$1) {
      return $$0.q().a($$0.a(), $$1, 11);
   }

   public static boolean a(djx $$0, @Nullable crx $$1, iv $$2, czy $$3) {
      if ($$0.C) {
         return false;
      } else {
         dcg $$4 = $$3.a(kk.aa, dcg.a);
         if (!$$4.c()) {
            dye<?> $$5 = $$4.a($$0.J_(), mh.e);
            if ($$5 == null) {
               return false;
            }

            dyc $$6 = $$0.c_($$2);
            if ($$6 != null) {
               dye<?> $$7 = $$6.p();
               if ($$7 != $$5) {
                  return false;
               }

               if (!$$7.b() || $$1 != null && $$1.gG()) {
                  return $$4.a($$6, $$0.J_());
               }

               return false;
            }
         }

         return false;
      }
   }

   @Override
   public boolean a(czy $$0, @Nullable crx $$1) {
      if ($$1 != null && $$1.G() >= 2) {
         dcg $$2 = $$0.a(kk.aa);
         if ($$2 != null) {
            dye<?> $$3 = $$2.a($$1.dV().J_(), mh.e);
            return $$3 != null && $$3.b();
         }
      }

      return false;
   }

   public dnc c() {
      return this.a;
   }

   public void a(Map<dnc, czu> $$0, czu $$1) {
      $$0.put(this.c(), $$1);
   }

   @Override
   public boolean d() {
      return !(this.c() instanceof dul);
   }

   @Override
   public void a(coc $$0) {
      dcq $$1 = $$0.f().b(kk.ap, dcq.a);
      if ($$1 != null) {
         dab.a($$0, $$1.e());
      }
   }

   public static void a(czy $$0, dye<?> $$1, tz $$2) {
      $$2.r("id");
      if ($$2.j()) {
         $$0.e(kk.aa);
      } else {
         dyc.a($$2, $$1);
         $$0.b(kk.aa, dcg.a($$2));
      }
   }

   @Override
   public cvh k() {
      return this.c().k();
   }
}
