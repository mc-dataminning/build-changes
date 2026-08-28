import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class cvo extends cxd {
   @Deprecated
   private final dke a;

   public cvo(dke $$0, cxd.a $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   public bsy a(daz $$0) {
      bsy $$1 = this.a(new dax($$0));
      return !$$1.a() && $$0.n().b(kv.x) ? super.a($$0.q(), $$0.o(), $$0.p()) : $$1;
   }

   public bsy a(dax $$0) {
      if (!this.d().a($$0.q().K())) {
         return bsy.d;
      } else if (!$$0.b()) {
         return bsy.d;
      } else {
         dax $$1 = this.b($$0);
         if ($$1 == null) {
            return bsy.d;
         } else {
            dxq $$2 = this.c($$1);
            if ($$2 == null) {
               return bsy.d;
            } else if (!this.a($$1, $$2)) {
               return bsy.d;
            } else {
               ji $$3 = $$1.a();
               dgz $$4 = $$1.q();
               cpr $$5 = $$1.o();
               cxh $$6 = $$1.n();
               dxq $$7 = $$4.a_($$3);
               if ($$7.a($$2.b())) {
                  $$7 = this.a($$3, $$4, $$6, $$7);
                  this.a($$3, $$4, $$5, $$6, $$7);
                  a($$4, $$3, $$6);
                  $$7.b().a($$4, $$3, $$7, $$5, $$6);
                  if ($$5 instanceof are) {
                     ap.z.a((are)$$5, $$3, $$6);
                  }
               }

               drx $$8 = $$7.A();
               $$4.a($$5, $$3, this.a($$7), awb.e, ($$8.a() + 1.0F) / 2.0F, $$8.b() * 0.8F);
               $$4.a(ecp.i, $$3, ecp.a.a($$5, $$7));
               $$6.a(1, $$5);
               return bsy.a;
            }
         }
      }
   }

   protected avz a(dxq $$0) {
      return $$0.A().e();
   }

   @Nullable
   public dax b(dax $$0) {
      return $$0;
   }

   private static void a(dgz $$0, ji $$1, cxh $$2) {
      dus $$3 = $$0.c_($$1);
      if ($$3 != null) {
         $$3.a($$2);
         $$3.e();
      }
   }

   protected boolean a(ji $$0, dgz $$1, @Nullable cpr $$2, cxh $$3, dxq $$4) {
      return a($$1, $$2, $$0, $$3);
   }

   @Nullable
   protected dxq c(dax $$0) {
      dxq $$1 = this.d().a($$0);
      return $$1 != null && this.b($$0, $$1) ? $$1 : null;
   }

   private dxq a(ji $$0, dgz $$1, cxh $$2, dxq $$3) {
      czh $$4 = $$2.a(kv.ao, czh.a);
      if ($$4.a()) {
         return $$3;
      } else {
         dxq $$5 = $$4.a($$3);
         if ($$5 != $$3) {
            $$1.a($$0, $$5, 2);
         }

         return $$5;
      }
   }

   protected boolean b(dax $$0, dxq $$1) {
      return (!this.c() || $$1.a((dhc)$$0.q(), $$0.a())) && $$0.q().a($$1, $$0.a(), fcc.a());
   }

   protected boolean c() {
      return true;
   }

   protected boolean a(dax $$0, dxq $$1) {
      return $$0.q().a($$0.a(), $$1, 11);
   }

   public static boolean a(dgz $$0, @Nullable cpr $$1, ji $$2, cxh $$3) {
      if ($$0.C) {
         return false;
      } else {
         czo $$4 = $$3.a(kv.aa, czo.a);
         if (!$$4.c()) {
            duu<?> $$5 = $$4.a($$0.F_(), mc.h);
            if ($$5 == null) {
               return false;
            }

            dus $$6 = $$0.c_($$2);
            if ($$6 != null) {
               duu<?> $$7 = $$6.p();
               if ($$7 != $$5) {
                  return false;
               }

               if (!$$7.b() || $$1 != null && $$1.gI()) {
                  return $$4.a($$6, $$0.F_());
               }

               return false;
            }
         }

         return false;
      }
   }

   @Override
   public void a(cxh $$0, cxd.b $$1, List<wp> $$2, cyx $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.d().a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean a(cxh $$0, @Nullable cpr $$1) {
      if ($$1 != null && $$1.G() >= 2) {
         czo $$2 = $$0.a(kv.aa);
         if ($$2 != null) {
            duu<?> $$3 = $$2.a($$1.dU().F_(), mc.h);
            return $$3 != null && $$3.b();
         }
      }

      return false;
   }

   public dke d() {
      return this.a;
   }

   public void a(Map<dke, cxd> $$0, cxd $$1) {
      $$0.put(this.d(), $$1);
   }

   @Override
   public boolean e() {
      return !(this.d() instanceof drj);
   }

   @Override
   public void a(clw $$0) {
      czx $$1 = $$0.f().b(kv.an, czx.a);
      if ($$1 != null) {
         cxk.a($$0, $$1.e());
      }
   }

   public static void a(cxh $$0, duu<?> $$1, tq $$2) {
      $$2.r("id");
      if ($$2.g()) {
         $$0.d(kv.aa);
      } else {
         dus.a($$2, $$1);
         $$0.b(kv.aa, czo.a($$2));
      }
   }

   @Override
   public csn k() {
      return this.d().k();
   }
}
