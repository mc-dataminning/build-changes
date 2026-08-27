import javax.annotation.Nullable;

public class cwp extends csl implements czm {
   public static final dfq a = dfp.j;
   public static final dfq b = dfp.C;
   protected static final ehw c = eht.a(csl.a(5.0, 0.0, 5.0, 11.0, 7.0, 11.0), csl.a(6.0, 7.0, 6.0, 10.0, 9.0, 10.0));
   protected static final ehw d = eht.a(csl.a(5.0, 1.0, 5.0, 11.0, 8.0, 11.0), csl.a(6.0, 8.0, 6.0, 10.0, 10.0, 10.0));

   public cwp(dey.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, Boolean.valueOf(false)).a(b, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public dez a(clf $$0) {
      eac $$1 = $$0.q().b_($$0.a());

      for (ha $$2 : $$0.f()) {
         if ($$2.o() == ha.a.b) {
            dez $$3 = this.n().a(a, Boolean.valueOf($$2 == ha.b));
            if ($$3.a((cpo)$$0.q(), $$0.a())) {
               return $$3.a(b, Boolean.valueOf($$1.a() == ead.c));
            }
         }
      }

      return null;
   }

   @Override
   public ehw a(dez $$0, cor $$1, gu $$2, ehi $$3) {
      return $$0.c(a) ? d : c;
   }

   @Override
   protected void a(dfa.a<csl, dez> $$0) {
      $$0.a(a, b);
   }

   @Override
   public boolean a(dez $$0, cpo $$1, gu $$2) {
      ha $$3 = h($$0).g();
      return csl.a($$1, $$2.a($$3), $$3.g());
   }

   protected static ha h(dez $$0) {
      return $$0.c(a) ? ha.a : ha.b;
   }

   @Override
   public dez a(dez $$0, ha $$1, dez $$2, cpm $$3, gu $$4, gu $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, ead.c, ead.c.a($$3));
      }

      return h($$0).g() == $$1 && !$$0.a($$3, $$4) ? csm.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public eac c_(dez $$0) {
      return $$0.c(b) ? ead.c.a(false) : super.c_($$0);
   }

   @Override
   public boolean a(dez $$0, cor $$1, gu $$2, eas $$3) {
      return false;
   }
}
