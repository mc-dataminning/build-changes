public class cvh extends cxd {
   private final cvh.a a;

   public cvh(dfh $$0, cvh.a $$1, cxd.a $$2) {
      super($$0.a($$2, $$1.d));
      this.a = $$1;
   }

   public cvh(dfh $$0, cvh.a $$1, jr<avz> $$2, boolean $$3, cxd.a $$4) {
      super($$0.a($$4, $$2, $$3, $$1.d));
      this.a = $$1;
   }

   @Override
   public avz a() {
      return this.a.c;
   }

   public static enum a {
      a(awa.oe, bvi.al),
      b(awa.DG, bvi.bL);

      final avz c;
      final jv<bvi<?>> d;

      private a(final avz $$0, final bvi<?>... $$1) {
         this.c = $$0;
         this.d = jv.a(bvi::r, $$1);
      }
   }
}
