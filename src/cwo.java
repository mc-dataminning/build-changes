import javax.annotation.Nullable;

public class cwo extends csl implements czm {
   public static final dft a = cwe.aC;
   public static final dfq b = dfp.C;
   protected static final float c = 3.0F;
   protected static final ehw d = csl.a(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
   protected static final ehw e = csl.a(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final ehw f = csl.a(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
   protected static final ehw g = csl.a(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);

   protected cwo(dey.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, ha.c).a(b, Boolean.valueOf(false)));
   }

   @Override
   public ehw a(dez $$0, cor $$1, gu $$2, ehi $$3) {
      switch ((ha)$$0.c(a)) {
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

   private boolean a(cor $$0, gu $$1, ha $$2) {
      dez $$3 = $$0.a_($$1);
      return $$3.d($$0, $$1, $$2);
   }

   @Override
   public boolean a(dez $$0, cpo $$1, gu $$2) {
      ha $$3 = $$0.c(a);
      return this.a($$1, $$2.a($$3.g()), $$3);
   }

   @Override
   public dez a(dez $$0, ha $$1, dez $$2, cpm $$3, gu $$4, gu $$5) {
      if ($$1.g() == $$0.c(a) && !$$0.a($$3, $$4)) {
         return csm.a.n();
      } else {
         if ($$0.c(b)) {
            $$3.a($$4, ead.c, ead.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Nullable
   @Override
   public dez a(clf $$0) {
      if (!$$0.c()) {
         dez $$1 = $$0.q().a_($$0.a().a($$0.k().g()));
         if ($$1.a(this) && $$1.c(a) == $$0.k()) {
            return null;
         }
      }

      dez $$2 = this.n();
      cpo $$3 = $$0.q();
      gu $$4 = $$0.a();
      eac $$5 = $$0.q().b_($$0.a());

      for (ha $$6 : $$0.f()) {
         if ($$6.o().d()) {
            $$2 = $$2.a(a, $$6.g());
            if ($$2.a($$3, $$4)) {
               return $$2.a(b, Boolean.valueOf($$5.a() == ead.c));
            }
         }
      }

      return null;
   }

   @Override
   public dez a(dez $$0, cyx $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   public dez a(dez $$0, cxg $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dfa.a<csl, dez> $$0) {
      $$0.a(a, b);
   }

   @Override
   public eac c_(dez $$0) {
      return $$0.c(b) ? ead.c.a(false) : super.c_($$0);
   }
}
