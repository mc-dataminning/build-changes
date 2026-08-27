import javax.annotation.Nullable;

public class czq extends cup implements csn, czm {
   private static final dfq e = dfp.C;
   public static final dft b = dfp.R;
   protected static final float c = 6.0F;
   protected static final ehw d = csl.a(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

   public czq(dey.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, dfv.b).a(e, Boolean.valueOf(false)).a(b, ha.c));
   }

   @Override
   public ehw a(dez $$0, cor $$1, gu $$2, ehi $$3) {
      return d;
   }

   @Override
   protected boolean d(dez $$0, cor $$1, gu $$2) {
      return $$0.a(apl.bw) || $$1.b_($$2.c()).a(ead.c) && super.d($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public dez a(clf $$0) {
      dez $$1 = super.a($$0);
      return $$1 != null ? b($$0.q(), $$0.a(), $$1.a(b, $$0.g().g())) : null;
   }

   @Override
   public void a(cpl $$0, gu $$1, dez $$2, biy $$3, cix $$4) {
      if (!$$0.r_()) {
         gu $$5 = $$1.c();
         dez $$6 = cup.b($$0, $$5, this.n().a(a, dfv.a).a(b, $$2.c(b)));
         $$0.a($$5, $$6, 3);
      }
   }

   @Override
   public eac c_(dez $$0) {
      return $$0.c(e) ? ead.c.a(false) : super.c_($$0);
   }

   @Override
   public boolean a(dez $$0, cpo $$1, gu $$2) {
      if ($$0.c(a) == dfv.a) {
         return super.a($$0, $$1, $$2);
      } else {
         gu $$3 = $$2.d();
         dez $$4 = $$1.a_($$3);
         return this.d($$4, $$1, $$3);
      }
   }

   @Override
   public dez a(dez $$0, ha $$1, dez $$2, cpm $$3, gu $$4, gu $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, ead.c, ead.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dfa.a<csl, dez> $$0) {
      $$0.a(a, e, b);
   }

   @Override
   public boolean a(cpo $$0, gu $$1, dez $$2) {
      return true;
   }

   @Override
   public boolean a(cpl $$0, aru $$1, gu $$2, dez $$3) {
      return true;
   }

   @Override
   public void a(akk $$0, aru $$1, gu $$2, dez $$3) {
      if ($$3.c(cup.a) == dfv.b) {
         gu $$4 = $$2.c();
         $$0.a($$4, $$0.b_($$4).g(), 18);
         csi.a($$0, $$1, $$2, $$3.c(b));
      } else {
         gu $$5 = $$2.d();
         this.a($$0, $$1, $$5, $$0.a_($$5));
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
   public float am_() {
      return 0.1F;
   }
}
