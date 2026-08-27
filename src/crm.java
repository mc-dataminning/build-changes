import javax.annotation.Nullable;

public class crm extends crl implements czn {
   public static final dfr a = dfq.C;
   public static final dfu b = dfq.P;
   protected final ehx c;
   protected final ehx d;
   protected final ehx e;
   protected final ehx f;
   protected final ehx g;
   protected final ehx h;

   public crm(int $$0, int $$1, dez.d $$2) {
      super($$2);
      this.k(this.n().a(a, Boolean.valueOf(false)).a(b, ha.b));
      this.g = csm.a((double)$$1, 0.0, (double)$$1, (double)(16 - $$1), (double)$$0, (double)(16 - $$1));
      this.h = csm.a((double)$$1, (double)(16 - $$0), (double)$$1, (double)(16 - $$1), 16.0, (double)(16 - $$1));
      this.c = csm.a((double)$$1, (double)$$1, (double)(16 - $$0), (double)(16 - $$1), (double)(16 - $$1), 16.0);
      this.d = csm.a((double)$$1, (double)$$1, 0.0, (double)(16 - $$1), (double)(16 - $$1), (double)$$0);
      this.e = csm.a(0.0, (double)$$1, (double)$$1, (double)$$0, (double)(16 - $$1), (double)(16 - $$1));
      this.f = csm.a((double)(16 - $$0), (double)$$1, (double)$$1, 16.0, (double)(16 - $$1), (double)(16 - $$1));
   }

   @Override
   public ehx a(dfa $$0, cos $$1, gu $$2, ehj $$3) {
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
   public boolean a(dfa $$0, cpp $$1, gu $$2) {
      ha $$3 = $$0.c(b);
      gu $$4 = $$2.a($$3.g());
      return $$1.a_($$4).d($$1, $$4, $$3);
   }

   @Override
   public dfa a(dfa $$0, ha $$1, dfa $$2, cpn $$3, gu $$4, gu $$5) {
      if ($$0.c(a)) {
         $$3.a($$4, eae.c, eae.c.a($$3));
      }

      return $$1 == $$0.c(b).g() && !$$0.a($$3, $$4) ? csn.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public dfa a(clg $$0) {
      cpn $$1 = $$0.q();
      gu $$2 = $$0.a();
      return this.n().a(a, Boolean.valueOf($$1.b_($$2).a() == eae.c)).a(b, $$0.k());
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
   public ead c_(dfa $$0) {
      return $$0.c(a) ? eae.c.a(false) : super.c_($$0);
   }

   @Override
   protected void a(dfb.a<csm, dfa> $$0) {
      $$0.a(a, b);
   }
}
