import javax.annotation.Nullable;

public class cso extends cry {
   public static final dfq[] a = new dfq[]{dfp.k, dfp.l, dfp.m};
   protected static final ehw b = eht.a(csl.a(1.0, 0.0, 1.0, 15.0, 2.0, 15.0), csl.a(7.0, 0.0, 7.0, 9.0, 14.0, 9.0));

   public cso(dey.d $$0) {
      super($$0);
      this.k(this.C.b().a(a[0], Boolean.valueOf(false)).a(a[1], Boolean.valueOf(false)).a(a[2], Boolean.valueOf(false)));
   }

   @Override
   public cyq b_(dez $$0) {
      return cyq.c;
   }

   @Override
   public dcl a(gu $$0, dez $$1) {
      return new dco($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dcl> dcm<T> a(cpl $$0, dez $$1, dcn<T> $$2) {
      return $$0.B ? null : a($$2, dcn.l, dco::a);
   }

   @Override
   public ehw a(dez $$0, cor $$1, gu $$2, ehi $$3) {
      return b;
   }

   @Override
   public bgq a(dez $$0, cpl $$1, gu $$2, cbm $$3, bgp $$4, egz $$5) {
      if ($$1.B) {
         return bgq.a;
      } else {
         dcl $$6 = $$1.c_($$2);
         if ($$6 instanceof dco) {
            $$3.a((dco)$$6);
            $$3.a(apg.aa);
         }

         return bgq.b;
      }
   }

   @Override
   public void a(cpl $$0, gu $$1, dez $$2, biy $$3, cix $$4) {
      if ($$4.A()) {
         dcl $$5 = $$0.c_($$1);
         if ($$5 instanceof dco) {
            ((dco)$$5).a($$4.y());
         }
      }
   }

   @Override
   public void a(dez $$0, cpl $$1, gu $$2, aru $$3) {
      double $$4 = (double)$$2.u() + 0.4 + (double)$$3.i() * 0.2;
      double $$5 = (double)$$2.v() + 0.7 + (double)$$3.i() * 0.3;
      double $$6 = (double)$$2.w() + 0.4 + (double)$$3.i() * 0.2;
      $$1.a(iv.Z, $$4, $$5, $$6, 0.0, 0.0, 0.0);
   }

   @Override
   public void a(dez $$0, cpl $$1, gu $$2, dez $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dcl $$5 = $$1.c_($$2);
         if ($$5 instanceof dco) {
            bgm.a($$1, $$2, (dco)$$5);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public boolean d_(dez $$0) {
      return true;
   }

   @Override
   public int a(dez $$0, cpl $$1, gu $$2) {
      return ced.a($$1.c_($$2));
   }

   @Override
   protected void a(dfa.a<csl, dez> $$0) {
      $$0.a(a[0], a[1], a[2]);
   }

   @Override
   public boolean a(dez $$0, cor $$1, gu $$2, eas $$3) {
      return false;
   }
}
