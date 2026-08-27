import javax.annotation.Nullable;

public class cwa extends csl implements czm {
   private static final dfq b = dfp.C;
   protected static final ehw a = csl.a(2.0, 10.0, 2.0, 14.0, 16.0, 14.0);

   protected cwa(dey.d $$0) {
      super($$0);
      this.k(this.C.b().a(b, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dfa.a<csl, dez> $$0) {
      $$0.a(b);
   }

   @Override
   public eac c_(dez $$0) {
      return $$0.c(b) ? ead.c.a(false) : super.c_($$0);
   }

   @Nullable
   @Override
   public dez a(clf $$0) {
      dez $$1 = super.a($$0);
      if ($$1 != null) {
         eac $$2 = $$0.q().b_($$0.a());
         return $$1.a(b, Boolean.valueOf($$2.a() == ead.c));
      } else {
         return null;
      }
   }

   @Override
   public boolean a(dez $$0, cpo $$1, gu $$2) {
      gu $$3 = $$2.c();
      dez $$4 = $$1.a_($$3);
      return $$4.d($$1, $$3, ha.a);
   }

   @Override
   public ehw a(dez $$0, cor $$1, gu $$2, ehi $$3) {
      return a;
   }

   @Override
   public dez a(dez $$0, ha $$1, dez $$2, cpm $$3, gu $$4, gu $$5) {
      if ($$1 == ha.b && !this.a($$0, $$3, $$4)) {
         return csm.a.n();
      } else {
         if ($$0.c(b)) {
            $$3.a($$4, ead.c, ead.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }
}
