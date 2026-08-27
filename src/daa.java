import javax.annotation.Nullable;

public class daa extends csx implements czy {
   public static final dgj<dgt> a = dgb.bh;
   public static final dgc b = dgb.C;
   protected static final eii c = csx.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   protected static final eii d = csx.a(0.0, 8.0, 0.0, 16.0, 16.0, 16.0);

   public daa(dfk.d $$0) {
      super($$0);
      this.k(this.n().a(a, dgt.b).a(b, Boolean.valueOf(false)));
   }

   @Override
   public boolean g_(dfl $$0) {
      return $$0.c(a) != dgt.c;
   }

   @Override
   protected void a(dfm.a<csx, dfl> $$0) {
      $$0.a(a, b);
   }

   @Override
   public eii a(dfl $$0, cpd $$1, gw $$2, ehu $$3) {
      dgt $$4 = $$0.c(a);
      switch ($$4) {
         case c:
            return eif.b();
         case a:
            return d;
         default:
            return c;
      }
   }

   @Nullable
   @Override
   public dfl a(clp $$0) {
      gw $$1 = $$0.a();
      dfl $$2 = $$0.q().a_($$1);
      if ($$2.a(this)) {
         return $$2.a(a, dgt.c).a(b, Boolean.valueOf(false));
      } else {
         eao $$3 = $$0.q().b_($$1);
         dfl $$4 = this.n().a(a, dgt.b).a(b, Boolean.valueOf($$3.a() == eap.c));
         hc $$5 = $$0.k();
         return $$5 != hc.a && ($$5 == hc.b || !($$0.l().d - (double)$$1.v() > 0.5)) ? $$4 : $$4.a(a, dgt.a);
      }
   }

   @Override
   public boolean a(dfl $$0, clp $$1) {
      cjh $$2 = $$1.n();
      dgt $$3 = $$0.c(a);
      if ($$3 == dgt.c || !$$2.a(this.k())) {
         return false;
      } else if ($$1.c()) {
         boolean $$4 = $$1.l().d - (double)$$1.a().v() > 0.5;
         hc $$5 = $$1.k();
         return $$3 == dgt.b ? $$5 == hc.b || $$4 && $$5.o().d() : $$5 == hc.a || !$$4 && $$5.o().d();
      } else {
         return true;
      }
   }

   @Override
   public eao c_(dfl $$0) {
      return $$0.c(b) ? eap.c.a(false) : super.c_($$0);
   }

   @Override
   public boolean a(cpy $$0, gw $$1, dfl $$2, eao $$3) {
      return $$2.c(a) != dgt.c ? czy.super.a($$0, $$1, $$2, $$3) : false;
   }

   @Override
   public boolean a(@Nullable cbw $$0, cpd $$1, gw $$2, dfl $$3, ean $$4) {
      return $$3.c(a) != dgt.c ? czy.super.a($$0, $$1, $$2, $$3, $$4) : false;
   }

   @Override
   public dfl a(dfl $$0, hc $$1, dfl $$2, cpy $$3, gw $$4, gw $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, eap.c, eap.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(dfl $$0, cpd $$1, gw $$2, ebe $$3) {
      switch ($$3) {
         case a:
            return false;
         case b:
            return $$1.b_($$2).a(apz.a);
         case c:
            return false;
         default:
            return false;
      }
   }
}
