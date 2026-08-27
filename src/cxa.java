import javax.annotation.Nullable;

public class cxa extends csx implements czy {
   public static final dgf a = cwq.aC;
   public static final dgc b = dgb.C;
   protected static final float c = 3.0F;
   protected static final eii d = csx.a(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
   protected static final eii e = csx.a(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final eii f = csx.a(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
   protected static final eii g = csx.a(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);

   protected cxa(dfk.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, hc.c).a(b, Boolean.valueOf(false)));
   }

   @Override
   public eii a(dfl $$0, cpd $$1, gw $$2, ehu $$3) {
      switch ((hc)$$0.c(a)) {
         case c:
            return g;
         case d:
            return f;
         case e:
            return e;
         case f:
         default:
            return d;
      }
   }

   private boolean a(cpd $$0, gw $$1, hc $$2) {
      dfl $$3 = $$0.a_($$1);
      return $$3.d($$0, $$1, $$2);
   }

   @Override
   public boolean a(dfl $$0, cqa $$1, gw $$2) {
      hc $$3 = $$0.c(a);
      return this.a($$1, $$2.a($$3.g()), $$3);
   }

   @Override
   public dfl a(dfl $$0, hc $$1, dfl $$2, cpy $$3, gw $$4, gw $$5) {
      if ($$1.g() == $$0.c(a) && !$$0.a($$3, $$4)) {
         return csy.a.n();
      } else {
         if ($$0.c(b)) {
            $$3.a($$4, eap.c, eap.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Nullable
   @Override
   public dfl a(clp $$0) {
      if (!$$0.c()) {
         dfl $$1 = $$0.q().a_($$0.a().a($$0.k().g()));
         if ($$1.a(this) && $$1.c(a) == $$0.k()) {
            return null;
         }
      }

      dfl $$2 = this.n();
      cqa $$3 = $$0.q();
      gw $$4 = $$0.a();
      eao $$5 = $$0.q().b_($$0.a());

      for (hc $$6 : $$0.f()) {
         if ($$6.o().d()) {
            $$2 = $$2.a(a, $$6.g());
            if ($$2.a($$3, $$4)) {
               return $$2.a(b, Boolean.valueOf($$5.a() == eap.c));
            }
         }
      }

      return null;
   }

   @Override
   public dfl a(dfl $$0, czj $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   public dfl a(dfl $$0, cxs $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dfm.a<csx, dfl> $$0) {
      $$0.a(a, b);
   }

   @Override
   public eao c_(dfl $$0) {
      return $$0.c(b) ? eap.c.a(false) : super.c_($$0);
   }
}
