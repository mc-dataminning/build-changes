import javax.annotation.Nullable;

public class cxb extends csx implements czy {
   public static final dgc a = dgb.j;
   public static final dgc b = dgb.C;
   protected static final eii c = eif.a(csx.a(5.0, 0.0, 5.0, 11.0, 7.0, 11.0), csx.a(6.0, 7.0, 6.0, 10.0, 9.0, 10.0));
   protected static final eii d = eif.a(csx.a(5.0, 1.0, 5.0, 11.0, 8.0, 11.0), csx.a(6.0, 8.0, 6.0, 10.0, 10.0, 10.0));

   public cxb(dfk.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, Boolean.valueOf(false)).a(b, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public dfl a(clp $$0) {
      eao $$1 = $$0.q().b_($$0.a());

      for (hc $$2 : $$0.f()) {
         if ($$2.o() == hc.a.b) {
            dfl $$3 = this.n().a(a, Boolean.valueOf($$2 == hc.b));
            if ($$3.a((cqa)$$0.q(), $$0.a())) {
               return $$3.a(b, Boolean.valueOf($$1.a() == eap.c));
            }
         }
      }

      return null;
   }

   @Override
   public eii a(dfl $$0, cpd $$1, gw $$2, ehu $$3) {
      return $$0.c(a) ? d : c;
   }

   @Override
   protected void a(dfm.a<csx, dfl> $$0) {
      $$0.a(a, b);
   }

   @Override
   public boolean a(dfl $$0, cqa $$1, gw $$2) {
      hc $$3 = h($$0).g();
      return csx.a($$1, $$2.a($$3), $$3.g());
   }

   protected static hc h(dfl $$0) {
      return $$0.c(a) ? hc.a : hc.b;
   }

   @Override
   public dfl a(dfl $$0, hc $$1, dfl $$2, cpy $$3, gw $$4, gw $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, eap.c, eap.c.a($$3));
      }

      return h($$0).g() == $$1 && !$$0.a($$3, $$4) ? csy.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public eao c_(dfl $$0) {
      return $$0.c(b) ? eap.c.a(false) : super.c_($$0);
   }

   @Override
   public boolean a(dfl $$0, cpd $$1, gw $$2, ebe $$3) {
      return false;
   }
}
