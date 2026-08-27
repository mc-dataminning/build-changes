import javax.annotation.Nullable;

public class cvg extends cwj {
   public static final dgc<dfp> I = dfu.U;

   protected cvg(dfd.d $$0) {
      super($$0);
   }

   @Override
   public boolean a(dfe $$0, cpt $$1, gw $$2) {
      return b($$1, $$2, h($$0).g());
   }

   public static boolean b(cpt $$0, gw $$1, hc $$2) {
      gw $$3 = $$1.a($$2);
      return $$0.a_($$3).d($$0, $$3, $$2.g());
   }

   @Nullable
   @Override
   public dfe a(cli $$0) {
      for (hc $$1 : $$0.f()) {
         dfe $$2;
         if ($$1.o() == hc.a.b) {
            $$2 = this.n().a(I, $$1 == hc.b ? dfp.c : dfp.a).a(aC, $$0.g());
         } else {
            $$2 = this.n().a(I, dfp.b).a(aC, $$1.g());
         }

         if ($$2.a((cpt)$$0.q(), $$0.a())) {
            return $$2;
         }
      }

      return null;
   }

   @Override
   public dfe a(dfe $$0, hc $$1, dfe $$2, cpr $$3, gw $$4, gw $$5) {
      return h($$0).g() == $$1 && !$$0.a($$3, $$4) ? csr.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected static hc h(dfe $$0) {
      switch ((dfp)$$0.c(I)) {
         case c:
            return hc.a;
         case a:
            return hc.b;
         default:
            return $$0.c(aC);
      }
   }
}
