import javax.annotation.Nullable;

public class cou extends cpa {
   public static final dcv a = dcr.P;
   public static final dcs b = dcr.u;

   public cou(dca.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, ha.c).a(b, Boolean.valueOf(false)));
   }

   @Override
   public bdx a(dcb $$0, cmm $$1, gu $$2, byo $$3, bdw $$4, eee $$5) {
      if ($$1.B) {
         return bdx.a;
      } else {
         czn $$6 = $$1.c_($$2);
         if ($$6 instanceof czg) {
            $$3.a((czg)$$6);
            $$3.a(amr.ar);
            bxf.a($$3, true);
         }

         return bdx.b;
      }
   }

   @Override
   public void a(dcb $$0, cmm $$1, gu $$2, dcb $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         czn $$5 = $$1.c_($$2);
         if ($$5 instanceof bdq) {
            bdt.a($$1, $$2, (bdq)$$5);
            $$1.c($$2, this);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public void a(dcb $$0, aif $$1, gu $$2, apf $$3) {
      czn $$4 = $$1.c_($$2);
      if ($$4 instanceof czg) {
         ((czg)$$4).i();
      }
   }

   @Nullable
   @Override
   public czn a(gu $$0, dcb $$1) {
      return new czg($$0, $$1);
   }

   @Override
   public cvs b_(dcb $$0) {
      return cvs.c;
   }

   @Override
   public void a(cmm $$0, gu $$1, dcb $$2, @Nullable bfz $$3, cfz $$4) {
      if ($$4.A()) {
         czn $$5 = $$0.c_($$1);
         if ($$5 instanceof czg) {
            ((czg)$$5).a($$4.y());
         }
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
   public dcb a(dcb $$0, cvz $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   public dcb a(dcb $$0, cui $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dcc.a<cpn, dcb> $$0) {
      $$0.a(a, b);
   }

   @Override
   public dcb a(cih $$0) {
      return this.n().a(a, $$0.d().g());
   }
}
