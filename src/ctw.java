import javax.annotation.Nullable;

public class ctw extends czi implements czy {
   public static final dgc a = dgb.C;
   protected static final float b = 6.5F;
   protected static final float c = 9.5F;
   protected static final eii d = csx.a(6.5, 0.0, 6.5, 9.5, 16.0, 9.5);
   protected static final eii e = csx.a(6.5, 6.5, 0.0, 9.5, 9.5, 16.0);
   protected static final eii f = csx.a(0.0, 6.5, 6.5, 16.0, 9.5, 9.5);

   public ctw(dfk.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, Boolean.valueOf(false)).a(g, hc.a.b));
   }

   @Override
   public eii a(dfl $$0, cpd $$1, gw $$2, ehu $$3) {
      switch ((hc.a)$$0.c(g)) {
         case a:
         default:
            return f;
         case c:
            return e;
         case b:
            return d;
      }
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
   protected void a(dfm.a<csx, dfl> $$0) {
      $$0.a(a).a(g);
   }

   @Override
   public eao c_(dfl $$0) {
      return $$0.c(a) ? eap.c.a(false) : super.c_($$0);
   }

   @Override
   public boolean a(dfl $$0, cpd $$1, gw $$2, ebe $$3) {
      return false;
   }
}
