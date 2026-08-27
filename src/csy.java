import javax.annotation.Nullable;

public class csy extends csi {
   public static final dga[] a = new dga[]{dfz.k, dfz.l, dfz.m};
   protected static final eig b = eid.a(csv.a(1.0, 0.0, 1.0, 15.0, 2.0, 15.0), csv.a(7.0, 0.0, 7.0, 9.0, 14.0, 9.0));

   public csy(dfi.d $$0) {
      super($$0);
      this.k(this.C.b().a(a[0], Boolean.valueOf(false)).a(a[1], Boolean.valueOf(false)).a(a[2], Boolean.valueOf(false)));
   }

   @Override
   public cza b_(dfj $$0) {
      return cza.c;
   }

   @Override
   public dcv a(gw $$0, dfj $$1) {
      return new dcy($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dcv> dcw<T> a(cpv $$0, dfj $$1, dcx<T> $$2) {
      return $$0.B ? null : a($$2, dcx.l, dcy::a);
   }

   @Override
   public eig a(dfj $$0, cpb $$1, gw $$2, ehs $$3) {
      return b;
   }

   @Override
   public bgy a(dfj $$0, cpv $$1, gw $$2, cbu $$3, bgx $$4, ehj $$5) {
      if ($$1.B) {
         return bgy.a;
      } else {
         dcv $$6 = $$1.c_($$2);
         if ($$6 instanceof dcy) {
            $$3.a((dcy)$$6);
            $$3.a(apn.aa);
         }

         return bgy.b;
      }
   }

   @Override
   public void a(cpv $$0, gw $$1, dfj $$2, bjg $$3, cjf $$4) {
      if ($$4.A()) {
         dcv $$5 = $$0.c_($$1);
         if ($$5 instanceof dcy) {
            ((dcy)$$5).a($$4.y());
         }
      }
   }

   @Override
   public void a(dfj $$0, cpv $$1, gw $$2, asc $$3) {
      double $$4 = (double)$$2.u() + 0.4 + (double)$$3.i() * 0.2;
      double $$5 = (double)$$2.v() + 0.7 + (double)$$3.i() * 0.3;
      double $$6 = (double)$$2.w() + 0.4 + (double)$$3.i() * 0.2;
      $$1.a(iv.Z, $$4, $$5, $$6, 0.0, 0.0, 0.0);
   }

   @Override
   public void a(dfj $$0, cpv $$1, gw $$2, dfj $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dcv $$5 = $$1.c_($$2);
         if ($$5 instanceof dcy) {
            bgu.a($$1, $$2, (dcy)$$5);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public boolean d_(dfj $$0) {
      return true;
   }

   @Override
   public int a(dfj $$0, cpv $$1, gw $$2) {
      return cel.a($$1.c_($$2));
   }

   @Override
   protected void a(dfk.a<csv, dfj> $$0) {
      $$0.a(a[0], a[1], a[2]);
   }

   @Override
   public boolean a(dfj $$0, cpb $$1, gw $$2, ebc $$3) {
      return false;
   }
}
