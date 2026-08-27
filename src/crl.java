import javax.annotation.Nullable;

public class crl extends crk implements czm {
   public static final dfq a = dfp.C;
   public static final dft b = dfp.P;
   protected final ehw c;
   protected final ehw d;
   protected final ehw e;
   protected final ehw f;
   protected final ehw g;
   protected final ehw h;

   public crl(int $$0, int $$1, dey.d $$2) {
      super($$2);
      this.k(this.n().a(a, Boolean.valueOf(false)).a(b, ha.b));
      this.g = csl.a((double)$$1, 0.0, (double)$$1, (double)(16 - $$1), (double)$$0, (double)(16 - $$1));
      this.h = csl.a((double)$$1, (double)(16 - $$0), (double)$$1, (double)(16 - $$1), 16.0, (double)(16 - $$1));
      this.c = csl.a((double)$$1, (double)$$1, (double)(16 - $$0), (double)(16 - $$1), (double)(16 - $$1), 16.0);
      this.d = csl.a((double)$$1, (double)$$1, 0.0, (double)(16 - $$1), (double)(16 - $$1), (double)$$0);
      this.e = csl.a(0.0, (double)$$1, (double)$$1, (double)$$0, (double)(16 - $$1), (double)(16 - $$1));
      this.f = csl.a((double)(16 - $$0), (double)$$1, (double)$$1, 16.0, (double)(16 - $$1), (double)(16 - $$1));
   }

   @Override
   public ehw a(dez $$0, cor $$1, gu $$2, ehi $$3) {
      ha $$4 = $$0.c(b);
      switch ($$4) {
         case c:
            return this.c;
         case d:
            return this.d;
         case f:
            return this.e;
         case e:
            return this.f;
         case a:
            return this.h;
         case b:
         default:
            return this.g;
      }
   }

   @Override
   public boolean a(dez $$0, cpo $$1, gu $$2) {
      ha $$3 = $$0.c(b);
      gu $$4 = $$2.a($$3.g());
      return $$1.a_($$4).d($$1, $$4, $$3);
   }

   @Override
   public dez a(dez $$0, ha $$1, dez $$2, cpm $$3, gu $$4, gu $$5) {
      if ($$0.c(a)) {
         $$3.a($$4, ead.c, ead.c.a($$3));
      }

      return $$1 == $$0.c(b).g() && !$$0.a($$3, $$4) ? csm.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public dez a(clf $$0) {
      cpm $$1 = $$0.q();
      gu $$2 = $$0.a();
      return this.n().a(a, Boolean.valueOf($$1.b_($$2).a() == ead.c)).a(b, $$0.k());
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
   public eac c_(dez $$0) {
      return $$0.c(a) ? ead.c.a(false) : super.c_($$0);
   }

   @Override
   protected void a(dfa.a<csl, dez> $$0) {
      $$0.a(a, b);
   }
}
