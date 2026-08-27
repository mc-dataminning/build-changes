import javax.annotation.Nullable;

public class crx extends crw implements czy {
   public static final dgc a = dgb.C;
   public static final dgf b = dgb.P;
   protected final eii c;
   protected final eii d;
   protected final eii e;
   protected final eii f;
   protected final eii g;
   protected final eii h;

   public crx(int $$0, int $$1, dfk.d $$2) {
      super($$2);
      this.k(this.n().a(a, Boolean.valueOf(false)).a(b, hc.b));
      this.g = csx.a((double)$$1, 0.0, (double)$$1, (double)(16 - $$1), (double)$$0, (double)(16 - $$1));
      this.h = csx.a((double)$$1, (double)(16 - $$0), (double)$$1, (double)(16 - $$1), 16.0, (double)(16 - $$1));
      this.c = csx.a((double)$$1, (double)$$1, (double)(16 - $$0), (double)(16 - $$1), (double)(16 - $$1), 16.0);
      this.d = csx.a((double)$$1, (double)$$1, 0.0, (double)(16 - $$1), (double)(16 - $$1), (double)$$0);
      this.e = csx.a(0.0, (double)$$1, (double)$$1, (double)$$0, (double)(16 - $$1), (double)(16 - $$1));
      this.f = csx.a((double)(16 - $$0), (double)$$1, (double)$$1, 16.0, (double)(16 - $$1), (double)(16 - $$1));
   }

   @Override
   public eii a(dfl $$0, cpd $$1, gw $$2, ehu $$3) {
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
   public boolean a(dfl $$0, cqa $$1, gw $$2) {
      hc $$3 = $$0.c(b);
      gw $$4 = $$2.a($$3.g());
      return $$1.a_($$4).d($$1, $$4, $$3);
   }

   @Override
   public dfl a(dfl $$0, hc $$1, dfl $$2, cpy $$3, gw $$4, gw $$5) {
      if ($$0.c(a)) {
         $$3.a($$4, eap.c, eap.c.a($$3));
      }

      return $$1 == $$0.c(b).g() && !$$0.a($$3, $$4) ? csy.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public dfl a(clp $$0) {
      cpy $$1 = $$0.q();
      gw $$2 = $$0.a();
      return this.n().a(a, Boolean.valueOf($$1.b_($$2).a() == eap.c)).a(b, $$0.k());
   }

   @Override
   public dfl a(dfl $$0, czj $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dfl a(dfl $$0, cxs $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   public eao c_(dfl $$0) {
      return $$0.c(a) ? eap.c.a(false) : super.c_($$0);
   }

   @Override
   protected void a(dfm.a<csx, dfl> $$0) {
      $$0.a(a, b);
   }
}
