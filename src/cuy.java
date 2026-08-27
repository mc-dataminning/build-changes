import javax.annotation.Nullable;

public class cuy extends crf<ddf> implements czm {
   public static final dft b = cwe.aC;
   public static final dfq c = dfp.C;
   protected static final ehw d = csl.a(1.0, 0.0, 1.0, 15.0, 14.0, 15.0);
   private static final tf e = tf.c("container.enderchest");

   protected cuy(dey.d $$0) {
      super($$0, () -> dcn.d);
      this.k(this.C.b().a(b, ha.c).a(c, Boolean.valueOf(false)));
   }

   @Override
   public cuo.c<? extends dcs> a(dez $$0, cpl $$1, gu $$2, boolean $$3) {
      return cuo.b::b;
   }

   @Override
   public ehw a(dez $$0, cor $$1, gu $$2, ehi $$3) {
      return d;
   }

   @Override
   public cyq b_(dez $$0) {
      return cyq.b;
   }

   @Override
   public dez a(clf $$0) {
      eac $$1 = $$0.q().b_($$0.a());
      return this.n().a(b, $$0.g().g()).a(c, Boolean.valueOf($$1.a() == ead.c));
   }

   @Override
   public bgq a(dez $$0, cpl $$1, gu $$2, cbm $$3, bgp $$4, egz $$5) {
      cfm $$6 = $$3.gd();
      dcl $$7 = $$1.c_($$2);
      if ($$6 != null && $$7 instanceof ddf) {
         gu $$8 = $$2.c();
         if ($$1.a_($$8).g($$1, $$8)) {
            return bgq.a($$1.B);
         } else if ($$1.B) {
            return bgq.a;
         } else {
            ddf $$9 = (ddf)$$7;
            $$6.a($$9);
            $$3.a(new bgy(($$1x, $$2x, $$3x) -> cek.a($$1x, $$2x, $$6), e));
            $$3.a(apg.aj);
            cad.a($$3, true);
            return bgq.b;
         }
      } else {
         return bgq.a($$1.B);
      }
   }

   @Override
   public dcl a(gu $$0, dez $$1) {
      return new ddf($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dcl> dcm<T> a(cpl $$0, dez $$1, dcn<T> $$2) {
      return $$0.B ? a($$2, dcn.d, ddf::a) : null;
   }

   @Override
   public void a(dez $$0, cpl $$1, gu $$2, aru $$3) {
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
   public dez a(dez $$0, cyx $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dez a(dez $$0, cxg $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dfa.a<csl, dez> $$0) {
      $$0.a(b, c);
   }

   @Override
   public eac c_(dez $$0) {
      return $$0.c(c) ? ead.c.a(false) : super.c_($$0);
   }

   @Override
   public dez a(dez $$0, ha $$1, dez $$2, cpm $$3, gu $$4, gu $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, ead.c, ead.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(dez $$0, cor $$1, gu $$2, eas $$3) {
      return false;
   }

   @Override
   public void a(dez $$0, akk $$1, gu $$2, aru $$3) {
      dcl $$4 = $$1.c_($$2);
      if ($$4 instanceof ddf) {
         ((ddf)$$4).c();
      }
   }
}
