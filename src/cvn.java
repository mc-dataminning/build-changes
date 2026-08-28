public class cvn extends cxl {
   private final cvn.a a;

   public cvn(dfp $$0, cvn.a $$1, cxl.a $$2) {
      super($$0.a($$2, $$1.d));
      this.a = $$1;
   }

   public cvn(dfp $$0, cvn.a $$1, jq<axe> $$2, boolean $$3, cxl.a $$4) {
      super($$0.a($$4, $$2, $$3, $$1.d));
      this.a = $$1;
   }

   @Override
   public axe a() {
      return this.a.c;
   }

   public static enum a {
      a(axf.nT, bvr.am),
      b(axf.Dh, bvr.bM);

      final axe c;
      final ju<bvr<?>> d;

      private a(final axe $$0, final bvr<?>... $$1) {
         this.c = $$0;
         this.d = ju.a(bvr::r, $$1);
      }
   }
}
