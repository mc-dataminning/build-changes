import javax.annotation.Nullable;

public class dba extends csq {
   public static final dfv a = dfu.B;

   public dba(dfd.d $$0) {
      super($$0);
      this.k(this.n().a(a, Boolean.valueOf(false)));
   }

   @Override
   public void b(dfe $$0, cpq $$1, gw $$2, dfe $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         if ($$1.B($$2)) {
            a($$1, $$2);
            $$1.a($$2, false);
         }
      }
   }

   @Override
   public void a(dfe $$0, cpq $$1, gw $$2, csq $$3, gw $$4, boolean $$5) {
      if ($$1.B($$2)) {
         a($$1, $$2);
         $$1.a($$2, false);
      }
   }

   @Override
   public void a(cpq $$0, gw $$1, dfe $$2, cbp $$3) {
      if (!$$0.r_() && !$$3.f() && $$2.c(a)) {
         a($$0, $$1);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(cpq $$0, gw $$1, cpi $$2) {
      if (!$$0.B) {
         byj $$3 = new byj($$0, (double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, $$2.e());
         int $$4 = $$3.m();
         $$3.b((short)($$0.z.a($$4 / 4) + $$4 / 8));
         $$0.b($$3);
      }
   }

   public static void a(cpq $$0, gw $$1) {
      a($$0, $$1, null);
   }

   private static void a(cpq $$0, gw $$1, @Nullable bjb $$2) {
      if (!$$0.B) {
         byj $$3 = new byj($$0, (double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, $$2);
         $$0.b($$3);
         $$0.a(null, $$3.dp(), $$3.dr(), $$3.dv(), aoz.xL, apa.e, 1.0F, 1.0F);
         $$0.a($$2, djo.I, $$1);
      }
   }

   @Override
   public bgt a(dfe $$0, cpq $$1, gw $$2, cbp $$3, bgs $$4, ehe $$5) {
      cja $$6 = $$3.b($$4);
      if (!$$6.a(cjd.nE) && !$$6.a(cjd.tf)) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         a($$1, $$2, $$3);
         $$1.a($$2, csr.a.n(), 11);
         civ $$7 = $$6.d();
         if (!$$3.f()) {
            if ($$6.a(cjd.nE)) {
               $$6.a(1, $$3, $$1x -> $$1x.d($$4));
            } else {
               $$6.h(1);
            }
         }

         $$3.b(apj.c.b($$7));
         return bgt.a($$1.B);
      }
   }

   @Override
   public void a(cpq $$0, dfe $$1, ehe $$2, cch $$3) {
      if (!$$0.B) {
         gw $$4 = $$2.a();
         bil $$5 = $$3.v();
         if ($$3.bM() && $$3.a($$0, $$4)) {
            a($$0, $$4, $$5 instanceof bjb ? (bjb)$$5 : null);
            $$0.a($$4, false);
         }
      }
   }

   @Override
   public boolean a(cpi $$0) {
      return false;
   }

   @Override
   protected void a(dff.a<csq, dfe> $$0) {
      $$0.a(a);
   }
}
