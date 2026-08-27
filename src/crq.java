import javax.annotation.Nullable;

public class crq extends crp implements czr {
   public static final dfv a = dfu.C;
   public static final dfy b = dfu.P;
   protected final eib c;
   protected final eib d;
   protected final eib e;
   protected final eib f;
   protected final eib g;
   protected final eib h;

   public crq(int $$0, int $$1, dfd.d $$2) {
      super($$2);
      this.k(this.n().a(a, Boolean.valueOf(false)).a(b, hc.b));
      this.g = csq.a((double)$$1, 0.0, (double)$$1, (double)(16 - $$1), (double)$$0, (double)(16 - $$1));
      this.h = csq.a((double)$$1, (double)(16 - $$0), (double)$$1, (double)(16 - $$1), 16.0, (double)(16 - $$1));
      this.c = csq.a((double)$$1, (double)$$1, (double)(16 - $$0), (double)(16 - $$1), (double)(16 - $$1), 16.0);
      this.d = csq.a((double)$$1, (double)$$1, 0.0, (double)(16 - $$1), (double)(16 - $$1), (double)$$0);
      this.e = csq.a(0.0, (double)$$1, (double)$$1, (double)$$0, (double)(16 - $$1), (double)(16 - $$1));
      this.f = csq.a((double)(16 - $$0), (double)$$1, (double)$$1, 16.0, (double)(16 - $$1), (double)(16 - $$1));
   }

   @Override
   public eib a(dfe $$0, cow $$1, gw $$2, ehn $$3) {
      hc $$4 = $$0.c(b);
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
   public boolean a(dfe $$0, cpt $$1, gw $$2) {
      hc $$3 = $$0.c(b);
      gw $$4 = $$2.a($$3.g());
      return $$1.a_($$4).d($$1, $$4, $$3);
   }

   @Override
   public dfe a(dfe $$0, hc $$1, dfe $$2, cpr $$3, gw $$4, gw $$5) {
      if ($$0.c(a)) {
         $$3.a($$4, eai.c, eai.c.a($$3));
      }

      return $$1 == $$0.c(b).g() && !$$0.a($$3, $$4) ? csr.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public dfe a(cli $$0) {
      cpr $$1 = $$0.q();
      gw $$2 = $$0.a();
      return this.n().a(a, Boolean.valueOf($$1.b_($$2).a() == eai.c)).a(b, $$0.k());
   }

   @Override
   public dfe a(dfe $$0, czc $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dfe a(dfe $$0, cxl $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   public eah c_(dfe $$0) {
      return $$0.c(a) ? eai.c.a(false) : super.c_($$0);
   }

   @Override
   protected void a(dff.a<csq, dfe> $$0) {
      $$0.a(a, b);
   }
}
