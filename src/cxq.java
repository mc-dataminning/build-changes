import javax.annotation.Nullable;

public class cxq extends csx implements czy {
   public static final dgc a = dgb.C;

   protected cxq(dfk.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, Boolean.valueOf(false)));
   }

   @Override
   public boolean a(dfl $$0, dfl $$1, hc $$2) {
      return $$1.a(csy.ac) && $$2.o() == hc.a.b;
   }

   @Nullable
   @Override
   public dfl a(clp $$0) {
      eao $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == eap.c;
      return super.a($$0).a(a, Boolean.valueOf($$2));
   }

   @Override
   public dfl a(dfl $$0, hc $$1, dfl $$2, cpy $$3, gw $$4, gw $$5) {
      if ($$0.c(a)) {
         $$3.a($$4, eap.c, eap.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public eao c_(dfl $$0) {
      return $$0.c(a) ? eap.c.a(false) : super.c_($$0);
   }

   @Override
   protected void a(dfm.a<csx, dfl> $$0) {
      $$0.a(a);
   }
}
