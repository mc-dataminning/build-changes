import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class cuw extends cwm {
   @Deprecated
   private final djn a;

   public cuw(djn $$0, cwm.a $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   public bsl a(daj $$0) {
      bsl $$1 = this.a(new dah($$0));
      return !$$1.a() && $$0.n().b(kv.x) ? super.a($$0.q(), $$0.o(), $$0.p()) : $$1;
   }

   public bsl a(dah $$0) {
      if (!this.d().a($$0.q().K())) {
         return bsl.d;
      } else if (!$$0.b()) {
         return bsl.d;
      } else {
         dah $$1 = this.b($$0);
         if ($$1 == null) {
            return bsl.d;
         } else {
            dwy $$2 = this.c($$1);
            if ($$2 == null) {
               return bsl.d;
            } else if (!this.a($$1, $$2)) {
               return bsl.d;
            } else {
               ji $$3 = $$1.a();
               dgj $$4 = $$1.q();
               coy $$5 = $$1.o();
               cwq $$6 = $$1.n();
               dwy $$7 = $$4.a_($$3);
               if ($$7.a($$2.b())) {
                  $$7 = this.a($$3, $$4, $$6, $$7);
                  this.a($$3, $$4, $$5, $$6, $$7);
                  a($$4, $$3, $$6);
                  $$7.b().a($$4, $$3, $$7, $$5, $$6);
                  if ($$5 instanceof are) {
                     ap.z.a((are)$$5, $$3, $$6);
                  }
               }

               drf $$8 = $$7.A();
               $$4.a($$5, $$3, this.a($$7), awb.e, ($$8.a() + 1.0F) / 2.0F, $$8.b() * 0.8F);
               $$4.a(ebu.i, $$3, ebu.a.a($$5, $$7));
               $$6.a(1, $$5);
               return bsl.a;
            }
         }
      }
   }

   protected avz a(dwy $$0) {
      return $$0.A().e();
   }

   @Nullable
   public dah b(dah $$0) {
      return $$0;
   }

   private static void a(dgj $$0, ji $$1, cwq $$2) {
      dua $$3 = $$0.c_($$1);
      if ($$3 != null) {
         $$3.a($$2);
         $$3.e();
      }
   }

   protected boolean a(ji $$0, dgj $$1, @Nullable coy $$2, cwq $$3, dwy $$4) {
      return a($$1, $$2, $$0, $$3);
   }

   @Nullable
   protected dwy c(dah $$0) {
      dwy $$1 = this.d().a($$0);
      return $$1 != null && this.b($$0, $$1) ? $$1 : null;
   }

   private dwy a(ji $$0, dgj $$1, cwq $$2, dwy $$3) {
      cys $$4 = $$2.a(kv.am, cys.a);
      if ($$4.a()) {
         return $$3;
      } else {
         dwy $$5 = $$4.a($$3);
         if ($$5 != $$3) {
            $$1.a($$0, $$5, 2);
         }

         return $$5;
      }
   }

   protected boolean b(dah $$0, dwy $$1) {
      coy $$2 = $$0.o();
      fbg $$3 = $$2 == null ? fbg.a() : fbg.a($$2);
      return (!this.c() || $$1.a((dgm)$$0.q(), $$0.a())) && $$0.q().a($$1, $$0.a(), $$3);
   }

   protected boolean c() {
      return true;
   }

   protected boolean a(dah $$0, dwy $$1) {
      return $$0.q().a($$0.a(), $$1, 11);
   }

   public static boolean a(dgj $$0, @Nullable coy $$1, ji $$2, cwq $$3) {
      if ($$0.C) {
         return false;
      } else {
         cyz $$4 = $$3.a(kv.Y, cyz.a);
         if (!$$4.c()) {
            duc<?> $$5 = $$4.a($$0.K_(), mc.h);
            if ($$5 == null) {
               return false;
            }

            dua $$6 = $$0.c_($$2);
            if ($$6 != null) {
               duc<?> $$7 = $$6.p();
               if ($$7 != $$5) {
                  return false;
               }

               if (!$$7.b() || $$1 != null && $$1.gG()) {
                  return $$4.a($$6, $$0.K_());
               }

               return false;
            }
         }

         return false;
      }
   }

   @Override
   public void a(cwq $$0, cwm.b $$1, List<wp> $$2, cyi $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.d().a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean a(cwq $$0, @Nullable coy $$1) {
      if ($$1 != null && $$1.G() >= 2) {
         cyz $$2 = $$0.a(kv.Y);
         if ($$2 != null) {
            duc<?> $$3 = $$2.a($$1.dV().K_(), mc.h);
            return $$3 != null && $$3.b();
         }
      }

      return false;
   }

   public djn d() {
      return this.a;
   }

   public void a(Map<djn, cwm> $$0, cwm $$1) {
      $$0.put(this.d(), $$1);
   }

   @Override
   public boolean e() {
      return !(this.d() instanceof dqr);
   }

   @Override
   public void a(cld $$0) {
      czi $$1 = $$0.l().b(kv.al, czi.a);
      if ($$1 != null) {
         cwt.a($$0, $$1.e());
      }
   }

   public static void a(cwq $$0, duc<?> $$1, tq $$2) {
      $$2.r("id");
      if ($$2.g()) {
         $$0.d(kv.Y);
      } else {
         dua.a($$2, $$1);
         $$0.b(kv.Y, cyz.a($$2));
      }
   }

   @Override
   public cru i() {
      return this.d().i();
   }
}
