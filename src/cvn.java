import javax.annotation.Nullable;

public class cvn extends cwq {
   public static final dgj<dfw> I = dgb.U;

   protected cvn(dfk.d $$0) {
      super($$0);
   }

   @Override
   public boolean a(dfl $$0, cqa $$1, gw $$2) {
      return b($$1, $$2, h($$0).g());
   }

   public static boolean b(cqa $$0, gw $$1, hc $$2) {
      gw $$3 = $$1.a($$2);
      return $$0.a_($$3).d($$0, $$3, $$2.g());
   }

   @Nullable
   @Override
   public dfl a(clp $$0) {
      for (hc $$1 : $$0.f()) {
         dfl $$2;
         if ($$1.o() == hc.a.b) {
            $$2 = this.n().a(I, $$1 == hc.b ? dfw.c : dfw.a).a(aC, $$0.g());
         } else {
            $$2 = this.n().a(I, dfw.b).a(aC, $$1.g());
         }

         if ($$2.a((cqa)$$0.q(), $$0.a())) {
            return $$2;
         }
      }

      return null;
   }

   @Override
   public dfl a(dfl $$0, hc $$1, dfl $$2, cpy $$3, gw $$4, gw $$5) {
      return h($$0).g() == $$1 && !$$0.a($$3, $$4) ? csy.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected static hc h(dfl $$0) {
      switch ((dfw)$$0.c(I)) {
         case c:
            return hc.a;
         case a:
            return hc.b;
         default:
            return $$0.c(aC);
      }
   }
}
