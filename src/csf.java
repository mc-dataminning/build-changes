import javax.annotation.Nullable;

public class csf extends csx implements czy {
   public static final dgc a = dgb.C;

   protected csf(dfk.d $$0) {
      super($$0);
      this.k(this.n().a(a, Boolean.valueOf(false)));
   }

   @Override
   public boolean c(dfl $$0, cpd $$1, gw $$2) {
      return true;
   }

   @Override
   public czc b_(dfl $$0) {
      return czc.a;
   }

   @Override
   public float b(dfl $$0, cpd $$1, gw $$2) {
      return 1.0F;
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

   @Nullable
   @Override
   public dfl a(clp $$0) {
      return this.n().a(a, Boolean.valueOf($$0.q().b_($$0.a()).a() == eap.c));
   }

   @Override
   protected void a(dfm.a<csx, dfl> $$0) {
      $$0.a(a);
   }

   @Override
   public cjh a(@Nullable cbw $$0, cpy $$1, gw $$2, dfl $$3) {
      return $$0 != null && $$0.f() ? czy.super.a($$0, $$1, $$2, $$3) : cjh.b;
   }

   @Override
   public boolean a(@Nullable cbw $$0, cpd $$1, gw $$2, dfl $$3, ean $$4) {
      return $$0 != null && $$0.f() ? czy.super.a($$0, $$1, $$2, $$3, $$4) : false;
   }
}
