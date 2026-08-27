import javax.annotation.Nullable;

public class cta extends csk {
   public static final dgc[] a = new dgc[]{dgb.k, dgb.l, dgb.m};
   protected static final eii b = eif.a(csx.a(1.0, 0.0, 1.0, 15.0, 2.0, 15.0), csx.a(7.0, 0.0, 7.0, 9.0, 14.0, 9.0));

   public cta(dfk.d $$0) {
      super($$0);
      this.k(this.C.b().a(a[0], Boolean.valueOf(false)).a(a[1], Boolean.valueOf(false)).a(a[2], Boolean.valueOf(false)));
   }

   @Override
   public czc b_(dfl $$0) {
      return czc.c;
   }

   @Override
   public dcx a(gw $$0, dfl $$1) {
      return new dda($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dcx> dcy<T> a(cpx $$0, dfl $$1, dcz<T> $$2) {
      return $$0.B ? null : a($$2, dcz.l, dda::a);
   }

   @Override
   public eii a(dfl $$0, cpd $$1, gw $$2, ehu $$3) {
      return b;
   }

   @Override
   public bha a(dfl $$0, cpx $$1, gw $$2, cbw $$3, bgz $$4, ehl $$5) {
      if ($$1.B) {
         return bha.a;
      } else {
         dcx $$6 = $$1.c_($$2);
         if ($$6 instanceof dda) {
            $$3.a((dda)$$6);
            $$3.a(app.aa);
         }

         return bha.b;
      }
   }

   @Override
   public void a(cpx $$0, gw $$1, dfl $$2, bji $$3, cjh $$4) {
      if ($$4.A()) {
         dcx $$5 = $$0.c_($$1);
         if ($$5 instanceof dda) {
            ((dda)$$5).a($$4.y());
         }
      }
   }

   @Override
   public void a(dfl $$0, cpx $$1, gw $$2, ase $$3) {
      double $$4 = (double)$$2.u() + 0.4 + (double)$$3.i() * 0.2;
      double $$5 = (double)$$2.v() + 0.7 + (double)$$3.i() * 0.3;
      double $$6 = (double)$$2.w() + 0.4 + (double)$$3.i() * 0.2;
      $$1.a(ix.Z, $$4, $$5, $$6, 0.0, 0.0, 0.0);
   }

   @Override
   public void a(dfl $$0, cpx $$1, gw $$2, dfl $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dcx $$5 = $$1.c_($$2);
         if ($$5 instanceof dda) {
            bgw.a($$1, $$2, (dda)$$5);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public boolean d_(dfl $$0) {
      return true;
   }

   @Override
   public int a(dfl $$0, cpx $$1, gw $$2) {
      return cen.a($$1.c_($$2));
   }

   @Override
   protected void a(dfm.a<csx, dfl> $$0) {
      $$0.a(a[0], a[1], a[2]);
   }

   @Override
   public boolean a(dfl $$0, cpd $$1, gw $$2, ebe $$3) {
      return false;
   }
}
