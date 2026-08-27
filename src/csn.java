import javax.annotation.Nullable;

public class csn extends crx {
   public static final dfp[] a = new dfp[]{dfo.k, dfo.l, dfo.m};
   protected static final ehy b = ehv.a(csk.a(1.0, 0.0, 1.0, 15.0, 2.0, 15.0), csk.a(7.0, 0.0, 7.0, 9.0, 14.0, 9.0));

   public csn(dex.d $$0) {
      super($$0);
      this.k(this.C.b().a(a[0], Boolean.valueOf(false)).a(a[1], Boolean.valueOf(false)).a(a[2], Boolean.valueOf(false)));
   }

   @Override
   public cyp b_(dey $$0) {
      return cyp.c;
   }

   @Override
   public dck a(gv $$0, dey $$1) {
      return new dcn($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dck> dcl<T> a(cpk $$0, dey $$1, dcm<T> $$2) {
      return $$0.B ? null : a($$2, dcm.l, dcn::a);
   }

   @Override
   public ehy a(dey $$0, coq $$1, gv $$2, ehk $$3) {
      return b;
   }

   @Override
   public bgo a(dey $$0, cpk $$1, gv $$2, cbl $$3, bgn $$4, ehb $$5) {
      if ($$1.B) {
         return bgo.a;
      } else {
         dck $$6 = $$1.c_($$2);
         if ($$6 instanceof dcn) {
            $$3.a((dcn)$$6);
            $$3.a(ape.aa);
         }

         return bgo.b;
      }
   }

   @Override
   public void a(cpk $$0, gv $$1, dey $$2, biw $$3, ciw $$4) {
      if ($$4.A()) {
         dck $$5 = $$0.c_($$1);
         if ($$5 instanceof dcn) {
            ((dcn)$$5).a($$4.y());
         }
      }
   }

   @Override
   public void a(dey $$0, cpk $$1, gv $$2, art $$3) {
      double $$4 = (double)$$2.u() + 0.4 + (double)$$3.i() * 0.2;
      double $$5 = (double)$$2.v() + 0.7 + (double)$$3.i() * 0.3;
      double $$6 = (double)$$2.w() + 0.4 + (double)$$3.i() * 0.2;
      $$1.a(iw.Z, $$4, $$5, $$6, 0.0, 0.0, 0.0);
   }

   @Override
   public void a(dey $$0, cpk $$1, gv $$2, dey $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dck $$5 = $$1.c_($$2);
         if ($$5 instanceof dcn) {
            bgk.a($$1, $$2, (dcn)$$5);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public boolean d_(dey $$0) {
      return true;
   }

   @Override
   public int a(dey $$0, cpk $$1, gv $$2) {
      return cec.a($$1.c_($$2));
   }

   @Override
   protected void a(dez.a<csk, dey> $$0) {
      $$0.a(a[0], a[1], a[2]);
   }

   @Override
   public boolean a(dey $$0, coq $$1, gv $$2, ear $$3) {
      return false;
   }
}
