public class cuk extends cwi {
   private final cuk.a a;

   public cuk(ddt $$0, cuk.a $$1, cwi.a $$2) {
      super($$0.a($$2, $$1.d));
      this.a = $$1;
   }

   public cuk(ddt $$0, cuk.a $$1, awm $$2, cwi.a $$3) {
      super($$0.a($$3, $$2, $$1.d));
      this.a = $$1;
   }

   @Override
   public awm a() {
      return this.a.c;
   }

   public static enum a {
      a(awn.nA, bus.ak),
      b(awn.CM, bus.bI);

      final awm c;
      final ju<bus<?>> d;

      private a(final awm $$0, final bus<?>... $$1) {
         this.c = $$0;
         this.d = ju.a(bus::r, $$1);
      }
   }
}
