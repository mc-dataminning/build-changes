import java.util.Map;
import javax.annotation.Nullable;

public class cxv extends czj {
   @Deprecated
   private final dmr a;

   public cxv(dmr $$0, czj.a $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   public bug a(ddi $$0) {
      bug $$1 = this.a(new ddg($$0));
      return !$$1.a() && $$0.n().c(kk.w) ? super.a($$0.q(), $$0.o(), $$0.p()) : $$1;
   }

   public bug a(ddg $$0) {
      if (!this.c().a($$0.q().K())) {
         return bug.d;
      } else if (!$$0.b()) {
         return bug.d;
      } else {
         ddg $$1 = this.b($$0);
         if ($$1 == null) {
            return bug.d;
         } else {
            eat $$2 = this.c($$1);
            if ($$2 == null) {
               return bug.d;
            } else if (!this.a($$1, $$2)) {
               return bug.d;
            } else {
               iv $$3 = $$1.a();
               djm $$4 = $$1.q();
               crm $$5 = $$1.o();
               czn $$6 = $$1.n();
               eat $$7 = $$4.a_($$3);
               if ($$7.a($$2.b())) {
                  $$7 = this.a($$3, $$4, $$6, $$7);
                  this.a($$3, $$4, $$5, $$6, $$7);
                  a($$4, $$3, $$6);
                  $$7.b().a($$4, $$3, $$7, $$5, $$6);
                  if ($$5 instanceof arr) {
                     aq.z.a((arr)$$5, $$3, $$6);
                  }
               }

               duo $$8 = $$7.A();
               $$4.a($$5, $$3, this.a($$7), awo.e, ($$8.a() + 1.0F) / 2.0F, $$8.b() * 0.8F);
               $$4.a(eft.i, $$3, eft.a.a($$5, $$7));
               $$6.a(1, $$5);
               return bug.a;
            }
         }
      }
   }

   protected awm a(eat $$0) {
      return $$0.A().e();
   }

   @Nullable
   public ddg b(ddg $$0) {
      return $$0;
   }

   private static void a(djm $$0, iv $$1, czn $$2) {
      dxr $$3 = $$0.c_($$1);
      if ($$3 != null) {
         $$3.a($$2);
         $$3.e();
      }
   }

   protected boolean a(iv $$0, djm $$1, @Nullable crm $$2, czn $$3, eat $$4) {
      return a($$1, $$2, $$0, $$3);
   }

   @Nullable
   protected eat c(ddg $$0) {
      eat $$1 = this.c().a($$0);
      return $$1 != null && this.b($$0, $$1) ? $$1 : null;
   }

   private eat a(iv $$0, djm $$1, czn $$2, eat $$3) {
      dbn $$4 = $$2.a(kk.aq, dbn.a);
      if ($$4.a()) {
         return $$3;
      } else {
         eat $$5 = $$4.a($$3);
         if ($$5 != $$3) {
            $$1.a($$0, $$5, 2);
         }

         return $$5;
      }
   }

   protected boolean b(ddg $$0, eat $$1) {
      crm $$2 = $$0.o();
      return (!this.b() || $$1.a((djp)$$0.q(), $$0.a())) && $$0.q().a($$1, $$0.a(), ffh.b($$2));
   }

   protected boolean b() {
      return true;
   }

   protected boolean a(ddg $$0, eat $$1) {
      return $$0.q().a($$0.a(), $$1, 11);
   }

   public static boolean a(djm $$0, @Nullable crm $$1, iv $$2, czn $$3) {
      if ($$0.C) {
         return false;
      } else {
         dbv $$4 = $$3.a(kk.aa, dbv.a);
         if (!$$4.c()) {
            dxt<?> $$5 = $$4.a($$0.F_(), mh.e);
            if ($$5 == null) {
               return false;
            }

            dxr $$6 = $$0.c_($$2);
            if ($$6 != null) {
               dxt<?> $$7 = $$6.p();
               if ($$7 != $$5) {
                  return false;
               }

               if (!$$7.b() || $$1 != null && $$1.gF()) {
                  return $$4.a($$6, $$0.F_());
               }

               return false;
            }
         }

         return false;
      }
   }

   @Override
   public boolean a(czn $$0, @Nullable crm $$1) {
      if ($$1 != null && $$1.G() >= 2) {
         dbv $$2 = $$0.a(kk.aa);
         if ($$2 != null) {
            dxt<?> $$3 = $$2.a($$1.dU().F_(), mh.e);
            return $$3 != null && $$3.b();
         }
      }

      return false;
   }

   public dmr c() {
      return this.a;
   }

   public void a(Map<dmr, czj> $$0, czj $$1) {
      $$0.put(this.c(), $$1);
   }

   @Override
   public boolean d() {
      return !(this.c() instanceof dua);
   }

   @Override
   public void a(cnr $$0) {
      dcf $$1 = $$0.f().b(kk.ap, dcf.a);
      if ($$1 != null) {
         czq.a($$0, $$1.e());
      }
   }

   public static void a(czn $$0, dxt<?> $$1, tz $$2) {
      $$2.p("id");
      if ($$2.g()) {
         $$0.e(kk.aa);
      } else {
         dxr.a($$2, $$1);
         $$0.b(kk.aa, dbv.a($$2));
      }
   }

   @Override
   public cuw k() {
      return this.c().k();
   }
}
