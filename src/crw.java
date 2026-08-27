import javax.annotation.Nullable;

public class crw extends csl implements czm {
   public static final dfq c = dfp.C;
   private static final ehw a = csl.a(2.0, 0.0, 2.0, 14.0, 4.0, 14.0);

   protected crw(dey.d $$0) {
      super($$0);
      this.k(this.C.b().a(c, Boolean.valueOf(true)));
   }

   protected void a(dez $$0, cpm $$1, gu $$2) {
      if (!e($$0, $$1, $$2)) {
         $$1.a($$2, this, 60 + $$1.y_().a(40));
      }
   }

   protected static boolean e(dez $$0, cor $$1, gu $$2) {
      if ($$0.c(c)) {
         return true;
      } else {
         for (ha $$3 : ha.values()) {
            if ($$1.b_($$2.a($$3)).a(apq.a)) {
               return true;
            }
         }

         return false;
      }
   }

   @Nullable
   @Override
   public dez a(clf $$0) {
      eac $$1 = $$0.q().b_($$0.a());
      return this.n().a(c, Boolean.valueOf($$1.a(apq.a) && $$1.e() == 8));
   }

   @Override
   public ehw a(dez $$0, cor $$1, gu $$2, ehi $$3) {
      return a;
   }

   @Override
   public dez a(dez $$0, ha $$1, dez $$2, cpm $$3, gu $$4, gu $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, ead.c, ead.c.a($$3));
      }

      return $$1 == ha.a && !this.a($$0, (cpo)$$3, $$4) ? csm.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(dez $$0, cpo $$1, gu $$2) {
      gu $$3 = $$2.d();
      return $$1.a_($$3).d($$1, $$3, ha.b);
   }

   @Override
   protected void a(dfa.a<csl, dez> $$0) {
      $$0.a(c);
   }

   @Override
   public eac c_(dez $$0) {
      return $$0.c(c) ? ead.c.a(false) : super.c_($$0);
   }
}
