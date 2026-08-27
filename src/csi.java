import javax.annotation.Nullable;

public class csi extends csx implements czy {
   public static final dgc c = dgb.C;
   private static final eii a = csx.a(2.0, 0.0, 2.0, 14.0, 4.0, 14.0);

   protected csi(dfk.d $$0) {
      super($$0);
      this.k(this.C.b().a(c, Boolean.valueOf(true)));
   }

   protected void a(dfl $$0, cpy $$1, gw $$2) {
      if (!e($$0, $$1, $$2)) {
         $$1.a($$2, this, 60 + $$1.D_().a(40));
      }
   }

   protected static boolean e(dfl $$0, cpd $$1, gw $$2) {
      if ($$0.c(c)) {
         return true;
      } else {
         for (hc $$3 : hc.values()) {
            if ($$1.b_($$2.a($$3)).a(apz.a)) {
               return true;
            }
         }

         return false;
      }
   }

   @Nullable
   @Override
   public dfl a(clp $$0) {
      eao $$1 = $$0.q().b_($$0.a());
      return this.n().a(c, Boolean.valueOf($$1.a(apz.a) && $$1.e() == 8));
   }

   @Override
   public eii a(dfl $$0, cpd $$1, gw $$2, ehu $$3) {
      return a;
   }

   @Override
   public dfl a(dfl $$0, hc $$1, dfl $$2, cpy $$3, gw $$4, gw $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, eap.c, eap.c.a($$3));
      }

      return $$1 == hc.a && !this.a($$0, (cqa)$$3, $$4) ? csy.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(dfl $$0, cqa $$1, gw $$2) {
      gw $$3 = $$2.d();
      return $$1.a_($$3).d($$1, $$3, hc.b);
   }

   @Override
   protected void a(dfm.a<csx, dfl> $$0) {
      $$0.a(c);
   }

   @Override
   public eao c_(dfl $$0) {
      return $$0.c(c) ? eap.c.a(false) : super.c_($$0);
   }
}
