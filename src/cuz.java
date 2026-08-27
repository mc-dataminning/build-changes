import javax.annotation.Nullable;

public class cuz extends crg<ddg> implements czn {
   public static final dfu b = cwf.aC;
   public static final dfr c = dfq.C;
   protected static final ehx d = csm.a(1.0, 0.0, 1.0, 15.0, 14.0, 15.0);
   private static final tf e = tf.c("container.enderchest");

   protected cuz(dez.d $$0) {
      super($$0, () -> dco.d);
      this.k(this.C.b().a(b, ha.c).a(c, Boolean.valueOf(false)));
   }

   @Override
   public cup.c<? extends dct> a(dfa $$0, cpm $$1, gu $$2, boolean $$3) {
      return cup.b::b;
   }

   @Override
   public ehx a(dfa $$0, cos $$1, gu $$2, ehj $$3) {
      return d;
   }

   @Override
   public cyr b_(dfa $$0) {
      return cyr.b;
   }

   @Override
   public dfa a(clg $$0) {
      ead $$1 = $$0.q().b_($$0.a());
      return this.n().a(b, $$0.g().g()).a(c, Boolean.valueOf($$1.a() == eae.c));
   }

   @Override
   public bgq a(dfa $$0, cpm $$1, gu $$2, cbn $$3, bgp $$4, eha $$5) {
      cfn $$6 = $$3.gd();
      dcm $$7 = $$1.c_($$2);
      if ($$6 != null && $$7 instanceof ddg) {
         gu $$8 = $$2.c();
         if ($$1.a_($$8).g($$1, $$8)) {
            return bgq.a($$1.B);
         } else if ($$1.B) {
            return bgq.a;
         } else {
            ddg $$9 = (ddg)$$7;
            $$6.a($$9);
            $$3.a(new bgy(($$1x, $$2x, $$3x) -> cel.a($$1x, $$2x, $$6), e));
            $$3.a(apg.aj);
            cae.a($$3, true);
            return bgq.b;
         }
      } else {
         return bgq.a($$1.B);
      }
   }

   @Override
   public dcm a(gu $$0, dfa $$1) {
      return new ddg($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dcm> dcn<T> a(cpm $$0, dfa $$1, dco<T> $$2) {
      return $$0.B ? a($$2, dco.d, ddg::a) : null;
   }

   @Override
   public void a(dfa $$0, cpm $$1, gu $$2, aru $$3) {
      for (int $$4 = 0; $$4 < 3; $$4++) {
         int $$5 = $$3.a(2) * 2 - 1;
         int $$6 = $$3.a(2) * 2 - 1;
         double $$7 = (double)$$2.u() + 0.5 + 0.25 * (double)$$5;
         double $$8 = (double)((float)$$2.v() + $$3.i());
         double $$9 = (double)$$2.w() + 0.5 + 0.25 * (double)$$6;
         double $$10 = (double)($$3.i() * (float)$$5);
         double $$11 = ((double)$$3.i() - 0.5) * 0.125;
         double $$12 = (double)($$3.i() * (float)$$6);
         $$1.a(iv.X, $$7, $$8, $$9, $$10, $$11, $$12);
      }
   }

   @Override
   public dfa a(dfa $$0, cyy $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dfa a(dfa $$0, cxh $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dfb.a<csm, dfa> $$0) {
      $$0.a(b, c);
   }

   @Override
   public ead c_(dfa $$0) {
      return $$0.c(c) ? eae.c.a(false) : super.c_($$0);
   }

   @Override
   public dfa a(dfa $$0, ha $$1, dfa $$2, cpn $$3, gu $$4, gu $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, eae.c, eae.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(dfa $$0, cos $$1, gu $$2, eat $$3) {
      return false;
   }

   @Override
   public void a(dfa $$0, akk $$1, gu $$2, aru $$3) {
      dcm $$4 = $$1.c_($$2);
      if ($$4 instanceof ddg) {
         ((ddg)$$4).c();
      }
   }
}
