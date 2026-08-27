import javax.annotation.Nullable;

public class csp extends crz {
   public static final dfr[] a = new dfr[]{dfq.k, dfq.l, dfq.m};
   protected static final ehx b = ehu.a(csm.a(1.0, 0.0, 1.0, 15.0, 2.0, 15.0), csm.a(7.0, 0.0, 7.0, 9.0, 14.0, 9.0));

   public csp(dez.d $$0) {
      super($$0);
      this.k(this.C.b().a(a[0], Boolean.valueOf(false)).a(a[1], Boolean.valueOf(false)).a(a[2], Boolean.valueOf(false)));
   }

   @Override
   public cyr b_(dfa $$0) {
      return cyr.c;
   }

   @Override
   public dcm a(gu $$0, dfa $$1) {
      return new dcp($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dcm> dcn<T> a(cpm $$0, dfa $$1, dco<T> $$2) {
      return $$0.B ? null : a($$2, dco.l, dcp::a);
   }

   @Override
   public ehx a(dfa $$0, cos $$1, gu $$2, ehj $$3) {
      return b;
   }

   @Override
   public bgq a(dfa $$0, cpm $$1, gu $$2, cbn $$3, bgp $$4, eha $$5) {
      if ($$1.B) {
         return bgq.a;
      } else {
         dcm $$6 = $$1.c_($$2);
         if ($$6 instanceof dcp) {
            $$3.a((dcp)$$6);
            $$3.a(apg.aa);
         }

         return bgq.b;
      }
   }

   @Override
   public void a(cpm $$0, gu $$1, dfa $$2, biy $$3, ciy $$4) {
      if ($$4.A()) {
         dcm $$5 = $$0.c_($$1);
         if ($$5 instanceof dcp) {
            ((dcp)$$5).a($$4.y());
         }
      }
   }

   @Override
   public void a(dfa $$0, cpm $$1, gu $$2, aru $$3) {
      double $$4 = (double)$$2.u() + 0.4 + (double)$$3.i() * 0.2;
      double $$5 = (double)$$2.v() + 0.7 + (double)$$3.i() * 0.3;
      double $$6 = (double)$$2.w() + 0.4 + (double)$$3.i() * 0.2;
      $$1.a(iv.Z, $$4, $$5, $$6, 0.0, 0.0, 0.0);
   }

   @Override
   public void a(dfa $$0, cpm $$1, gu $$2, dfa $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dcm $$5 = $$1.c_($$2);
         if ($$5 instanceof dcp) {
            bgm.a($$1, $$2, (dcp)$$5);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public boolean d_(dfa $$0) {
      return true;
   }

   @Override
   public int a(dfa $$0, cpm $$1, gu $$2) {
      return cee.a($$1.c_($$2));
   }

   @Override
   protected void a(dfb.a<csm, dfa> $$0) {
      $$0.a(a[0], a[1], a[2]);
   }

   @Override
   public boolean a(dfa $$0, cos $$1, gu $$2, eat $$3) {
      return false;
   }
}
