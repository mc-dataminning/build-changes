import javax.annotation.Nullable;

public class cwm extends csx implements czy {
   private static final dgc b = dgb.C;
   protected static final eii a = csx.a(2.0, 10.0, 2.0, 14.0, 16.0, 14.0);

   protected cwm(dfk.d $$0) {
      super($$0);
      this.k(this.C.b().a(b, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dfm.a<csx, dfl> $$0) {
      $$0.a(b);
   }

   @Override
   public eao c_(dfl $$0) {
      return $$0.c(b) ? eap.c.a(false) : super.c_($$0);
   }

   @Nullable
   @Override
   public dfl a(clp $$0) {
      dfl $$1 = super.a($$0);
      if ($$1 != null) {
         eao $$2 = $$0.q().b_($$0.a());
         return $$1.a(b, Boolean.valueOf($$2.a() == eap.c));
      } else {
         return null;
      }
   }

   @Override
   public boolean a(dfl $$0, cqa $$1, gw $$2) {
      gw $$3 = $$2.c();
      dfl $$4 = $$1.a_($$3);
      return $$4.d($$1, $$3, hc.a);
   }

   @Override
   public eii a(dfl $$0, cpd $$1, gw $$2, ehu $$3) {
      return a;
   }

   @Override
   public dfl a(dfl $$0, hc $$1, dfl $$2, cpy $$3, gw $$4, gw $$5) {
      if ($$1 == hc.b && !this.a($$0, $$3, $$4)) {
         return csy.a.n();
      } else {
         if ($$0.c(b)) {
            $$3.a($$4, eap.c, eap.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }
}
