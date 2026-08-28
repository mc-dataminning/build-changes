public class cun extends cwl {
   private final cun.a a;

   public cun(dep $$0, cun.a $$1, cwl.a $$2) {
      super($$0.a($$2, $$1.d));
      this.a = $$1;
   }

   public cun(dep $$0, cun.a $$1, jr<avz> $$2, boolean $$3, cwl.a $$4) {
      super($$0.a($$4, $$2, $$3, $$1.d));
      this.a = $$1;
   }

   @Override
   public avz a() {
      return this.a.c;
   }

   public static enum a {
      a(awa.nZ, bus.al),
      b(awa.Dw, bus.bL);

      final avz c;
      final jv<bus<?>> d;

      private a(final avz $$0, final bus<?>... $$1) {
         this.c = $$0;
         this.d = jv.a(bus::r, $$1);
      }
   }
}
