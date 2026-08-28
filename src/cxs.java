import java.util.Map;
import javax.annotation.Nullable;

public class cxs extends czg {
   @Deprecated
   private final dmm a;

   public cxs(dmm $$0, czg.a $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   public bug a(ddf $$0) {
      bug $$1 = this.a(new ddd($$0));
      return !$$1.a() && $$0.n().c(kk.w) ? super.a($$0.q(), $$0.o(), $$0.p()) : $$1;
   }

   public bug a(ddd $$0) {
      if (!this.c().a($$0.q().K())) {
         return bug.d;
      } else if (!$$0.b()) {
         return bug.d;
      } else {
         ddd $$1 = this.b($$0);
         if ($$1 == null) {
            return bug.d;
         } else {
            eao $$2 = this.c($$1);
            if ($$2 == null) {
               return bug.d;
            } else if (!this.a($$1, $$2)) {
               return bug.d;
            } else {
               iv $$3 = $$1.a();
               djh $$4 = $$1.q();
               crj $$5 = $$1.o();
               czk $$6 = $$1.n();
               eao $$7 = $$4.a_($$3);
               if ($$7.a($$2.b())) {
                  $$7 = this.a($$3, $$4, $$6, $$7);
                  this.a($$3, $$4, $$5, $$6, $$7);
                  a($$4, $$3, $$6);
                  $$7.b().a($$4, $$3, $$7, $$5, $$6);
                  if ($$5 instanceof arr) {
                     aq.z.a((arr)$$5, $$3, $$6);
                  }
               }

               duj $$8 = $$7.A();
               $$4.a($$5, $$3, this.a($$7), awo.e, ($$8.a() + 1.0F) / 2.0F, $$8.b() * 0.8F);
               $$4.a(efo.i, $$3, efo.a.a($$5, $$7));
               $$6.a(1, $$5);
               return bug.a;
            }
         }
      }
   }

   protected awm a(eao $$0) {
      return $$0.A().e();
   }

   @Nullable
   public ddd b(ddd $$0) {
      return $$0;
   }

   private static void a(djh $$0, iv $$1, czk $$2) {
      dxm $$3 = $$0.c_($$1);
      if ($$3 != null) {
         $$3.a($$2);
         $$3.e();
      }
   }

   protected boolean a(iv $$0, djh $$1, @Nullable crj $$2, czk $$3, eao $$4) {
      return a($$1, $$2, $$0, $$3);
   }

   @Nullable
   protected eao c(ddd $$0) {
      eao $$1 = this.c().a($$0);
      return $$1 != null && this.b($$0, $$1) ? $$1 : null;
   }

   private eao a(iv $$0, djh $$1, czk $$2, eao $$3) {
      dbk $$4 = $$2.a(kk.aq, dbk.a);
      if ($$4.a()) {
         return $$3;
      } else {
         eao $$5 = $$4.a($$3);
         if ($$5 != $$3) {
            $$1.a($$0, $$5, 2);
         }

         return $$5;
      }
   }

   protected boolean b(ddd $$0, eao $$1) {
      crj $$2 = $$0.o();
      return (!this.b() || $$1.a((djk)$$0.q(), $$0.a())) && $$0.q().a($$1, $$0.a(), ffc.b($$2));
   }

   protected boolean b() {
      return true;
   }

   protected boolean a(ddd $$0, eao $$1) {
      return $$0.q().a($$0.a(), $$1, 11);
   }

   public static boolean a(djh $$0, @Nullable crj $$1, iv $$2, czk $$3) {
      if ($$0.C) {
         return false;
      } else {
         dbs $$4 = $$3.a(kk.aa, dbs.a);
         if (!$$4.c()) {
            dxo<?> $$5 = $$4.a($$0.F_(), mh.e);
            if ($$5 == null) {
               return false;
            }

            dxm $$6 = $$0.c_($$2);
            if ($$6 != null) {
               dxo<?> $$7 = $$6.p();
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
   public boolean a(czk $$0, @Nullable crj $$1) {
      if ($$1 != null && $$1.G() >= 2) {
         dbs $$2 = $$0.a(kk.aa);
         if ($$2 != null) {
            dxo<?> $$3 = $$2.a($$1.dU().F_(), mh.e);
            return $$3 != null && $$3.b();
         }
      }

      return false;
   }

   public dmm c() {
      return this.a;
   }

   public void a(Map<dmm, czg> $$0, czg $$1) {
      $$0.put(this.c(), $$1);
   }

   @Override
   public boolean d() {
      return !(this.c() instanceof dtv);
   }

   @Override
   public void a(cno $$0) {
      dcc $$1 = $$0.f().b(kk.ap, dcc.a);
      if ($$1 != null) {
         czn.a($$0, $$1.e());
      }
   }

   public static void a(czk $$0, dxo<?> $$1, tz $$2) {
      $$2.p("id");
      if ($$2.g()) {
         $$0.e(kk.aa);
      } else {
         dxm.a($$2, $$1);
         $$0.b(kk.aa, dbs.a($$2));
      }
   }

   @Override
   public cut k() {
      return this.c().k();
   }
}
