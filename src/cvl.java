import javax.annotation.Nullable;

public class cvl extends cwo {
   public static final dgh<dfu> I = dfz.U;

   protected cvl(dfi.d $$0) {
      super($$0);
   }

   @Override
   public boolean a(dfj $$0, cpy $$1, gw $$2) {
      return b($$1, $$2, h($$0).g());
   }

   public static boolean b(cpy $$0, gw $$1, hc $$2) {
      gw $$3 = $$1.a($$2);
      return $$0.a_($$3).d($$0, $$3, $$2.g());
   }

   @Nullable
   @Override
   public dfj a(cln $$0) {
      for (hc $$1 : $$0.f()) {
         dfj $$2;
         if ($$1.o() == hc.a.b) {
            $$2 = this.n().a(I, $$1 == hc.b ? dfu.c : dfu.a).a(aC, $$0.g());
         } else {
            $$2 = this.n().a(I, dfu.b).a(aC, $$1.g());
         }

         if ($$2.a((cpy)$$0.q(), $$0.a())) {
            return $$2;
         }
      }

      return null;
   }

   @Override
   public dfj a(dfj $$0, hc $$1, dfj $$2, cpw $$3, gw $$4, gw $$5) {
      return h($$0).g() == $$1 && !$$0.a($$3, $$4) ? csw.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected static hc h(dfj $$0) {
      switch ((dfu)$$0.c(I)) {
         case c:
            return hc.a;
         case a:
            return hc.b;
         default:
            return $$0.c(aC);
      }
   }
}
