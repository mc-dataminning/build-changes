import javax.annotation.Nullable;

public class cvb extends cwe {
   public static final dfx<dfk> I = dfp.U;

   protected cvb(dey.d $$0) {
      super($$0);
   }

   @Override
   public boolean a(dez $$0, cpo $$1, gu $$2) {
      return b($$1, $$2, h($$0).g());
   }

   public static boolean b(cpo $$0, gu $$1, ha $$2) {
      gu $$3 = $$1.a($$2);
      return $$0.a_($$3).d($$0, $$3, $$2.g());
   }

   @Nullable
   @Override
   public dez a(clf $$0) {
      for (ha $$1 : $$0.f()) {
         dez $$2;
         if ($$1.o() == ha.a.b) {
            $$2 = this.n().a(I, $$1 == ha.b ? dfk.c : dfk.a).a(aC, $$0.g());
         } else {
            $$2 = this.n().a(I, dfk.b).a(aC, $$1.g());
         }

         if ($$2.a((cpo)$$0.q(), $$0.a())) {
            return $$2;
         }
      }

      return null;
   }

   @Override
   public dez a(dez $$0, ha $$1, dez $$2, cpm $$3, gu $$4, gu $$5) {
      return h($$0).g() == $$1 && !$$0.a($$3, $$4) ? csm.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected static ha h(dez $$0) {
      switch ((dfk)$$0.c(I)) {
         case c:
            return ha.a;
         case a:
            return ha.b;
         default:
            return $$0.c(aC);
      }
   }
}
