import javax.annotation.Nullable;

public class cpq extends cpa {
   public static final dcs[] a = new dcs[]{dcr.k, dcr.l, dcr.m};
   protected static final efb b = eey.a(cpn.a(1.0, 0.0, 1.0, 15.0, 2.0, 15.0), cpn.a(7.0, 0.0, 7.0, 9.0, 14.0, 9.0));

   public cpq(dca.d $$0) {
      super($$0);
      this.k(this.C.b().a(a[0], Boolean.valueOf(false)).a(a[1], Boolean.valueOf(false)).a(a[2], Boolean.valueOf(false)));
   }

   @Override
   public cvs b_(dcb $$0) {
      return cvs.c;
   }

   @Override
   public czn a(gu $$0, dcb $$1) {
      return new czq($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends czn> czo<T> a(cmm $$0, dcb $$1, czp<T> $$2) {
      return $$0.B ? null : a($$2, czp.l, czq::a);
   }

   @Override
   public efb a(dcb $$0, cls $$1, gu $$2, een $$3) {
      return b;
   }

   @Override
   public bdx a(dcb $$0, cmm $$1, gu $$2, byo $$3, bdw $$4, eee $$5) {
      if ($$1.B) {
         return bdx.a;
      } else {
         czn $$6 = $$1.c_($$2);
         if ($$6 instanceof czq) {
            $$3.a((czq)$$6);
            $$3.a(amr.aa);
         }

         return bdx.b;
      }
   }

   @Override
   public void a(cmm $$0, gu $$1, dcb $$2, bfz $$3, cfz $$4) {
      if ($$4.A()) {
         czn $$5 = $$0.c_($$1);
         if ($$5 instanceof czq) {
            ((czq)$$5).a($$4.y());
         }
      }
   }

   @Override
   public void a(dcb $$0, cmm $$1, gu $$2, apf $$3) {
      double $$4 = (double)$$2.u() + 0.4 + (double)$$3.i() * 0.2;
      double $$5 = (double)$$2.v() + 0.7 + (double)$$3.i() * 0.3;
      double $$6 = (double)$$2.w() + 0.4 + (double)$$3.i() * 0.2;
      $$1.a(iv.Z, $$4, $$5, $$6, 0.0, 0.0, 0.0);
   }

   @Override
   public void a(dcb $$0, cmm $$1, gu $$2, dcb $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         czn $$5 = $$1.c_($$2);
         if ($$5 instanceof czq) {
            bdt.a($$1, $$2, (czq)$$5);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public boolean d_(dcb $$0) {
      return true;
   }

   @Override
   public int a(dcb $$0, cmm $$1, gu $$2) {
      return cbf.a($$1.c_($$2));
   }

   @Override
   protected void a(dcc.a<cpn, dcb> $$0) {
      $$0.a(a[0], a[1], a[2]);
   }

   @Override
   public boolean a(dcb $$0, cls $$1, gu $$2, dxu $$3) {
      return false;
   }
}
