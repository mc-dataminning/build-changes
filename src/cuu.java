import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class cuu extends cwk {
   @Deprecated
   private final djl a;

   public cuu(djl $$0, cwk.a $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   public bsj a(dah $$0) {
      bsj $$1 = this.a(new daf($$0));
      return !$$1.a() && $$0.n().b(kv.x) ? super.a($$0.q(), $$0.o(), $$0.p()) : $$1;
   }

   public bsj a(daf $$0) {
      if (!this.d().a($$0.q().K())) {
         return bsj.d;
      } else if (!$$0.b()) {
         return bsj.d;
      } else {
         daf $$1 = this.b($$0);
         if ($$1 == null) {
            return bsj.d;
         } else {
            dww $$2 = this.c($$1);
            if ($$2 == null) {
               return bsj.d;
            } else if (!this.a($$1, $$2)) {
               return bsj.d;
            } else {
               ji $$3 = $$1.a();
               dgh $$4 = $$1.q();
               cow $$5 = $$1.o();
               cwo $$6 = $$1.n();
               dww $$7 = $$4.a_($$3);
               if ($$7.a($$2.b())) {
                  $$7 = this.a($$3, $$4, $$6, $$7);
                  this.a($$3, $$4, $$5, $$6, $$7);
                  a($$4, $$3, $$6);
                  $$7.b().a($$4, $$3, $$7, $$5, $$6);
                  if ($$5 instanceof are) {
                     ap.z.a((are)$$5, $$3, $$6);
                  }
               }

               drd $$8 = $$7.A();
               $$4.a($$5, $$3, this.a($$7), awb.e, ($$8.a() + 1.0F) / 2.0F, $$8.b() * 0.8F);
               $$4.a(ebs.i, $$3, ebs.a.a($$5, $$7));
               $$6.a(1, $$5);
               return bsj.a;
            }
         }
      }
   }

   protected avz a(dww $$0) {
      return $$0.A().e();
   }

   @Nullable
   public daf b(daf $$0) {
      return $$0;
   }

   private static void a(dgh $$0, ji $$1, cwo $$2) {
      dty $$3 = $$0.c_($$1);
      if ($$3 != null) {
         $$3.a($$2);
         $$3.e();
      }
   }

   protected boolean a(ji $$0, dgh $$1, @Nullable cow $$2, cwo $$3, dww $$4) {
      return a($$1, $$2, $$0, $$3);
   }

   @Nullable
   protected dww c(daf $$0) {
      dww $$1 = this.d().a($$0);
      return $$1 != null && this.b($$0, $$1) ? $$1 : null;
   }

   private dww a(ji $$0, dgh $$1, cwo $$2, dww $$3) {
      cyq $$4 = $$2.a(kv.am, cyq.a);
      if ($$4.a()) {
         return $$3;
      } else {
         dww $$5 = $$4.a($$3);
         if ($$5 != $$3) {
            $$1.a($$0, $$5, 2);
         }

         return $$5;
      }
   }

   protected boolean b(daf $$0, dww $$1) {
      cow $$2 = $$0.o();
      fbe $$3 = $$2 == null ? fbe.a() : fbe.a($$2);
      return (!this.c() || $$1.a((dgk)$$0.q(), $$0.a())) && $$0.q().a($$1, $$0.a(), $$3);
   }

   protected boolean c() {
      return true;
   }

   protected boolean a(daf $$0, dww $$1) {
      return $$0.q().a($$0.a(), $$1, 11);
   }

   public static boolean a(dgh $$0, @Nullable cow $$1, ji $$2, cwo $$3) {
      if ($$0.C) {
         return false;
      } else {
         cyx $$4 = $$3.a(kv.Y, cyx.a);
         if (!$$4.c()) {
            dua<?> $$5 = $$4.a($$0.K_(), mc.h);
            if ($$5 == null) {
               return false;
            }

            dty $$6 = $$0.c_($$2);
            if ($$6 != null) {
               dua<?> $$7 = $$6.p();
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
   public void a(cwo $$0, cwk.b $$1, List<wp> $$2, cyg $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.d().a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean a(cwo $$0, @Nullable cow $$1) {
      if ($$1 != null && $$1.G() >= 2) {
         cyx $$2 = $$0.a(kv.Y);
         if ($$2 != null) {
            dua<?> $$3 = $$2.a($$1.dV().K_(), mc.h);
            return $$3 != null && $$3.b();
         }
      }

      return false;
   }

   public djl d() {
      return this.a;
   }

   public void a(Map<djl, cwk> $$0, cwk $$1) {
      $$0.put(this.d(), $$1);
   }

   @Override
   public boolean e() {
      return !(this.d() instanceof dqp);
   }

   @Override
   public void a(clb $$0) {
      czg $$1 = $$0.l().b(kv.al, czg.a);
      if ($$1 != null) {
         cwr.a($$0, $$1.e());
      }
   }

   public static void a(cwo $$0, dua<?> $$1, tq $$2) {
      $$2.r("id");
      if ($$2.g()) {
         $$0.d(kv.Y);
      } else {
         dty.a($$2, $$1);
         $$0.b(kv.Y, cyx.a($$2));
      }
   }

   @Override
   public crs i() {
      return this.d().i();
   }
}
