public class cvm extends cxk {
   private final cvm.a a;

   public cvm(dfo $$0, cvm.a $$1, cxk.a $$2) {
      super($$0.a($$2, $$1.d));
      this.a = $$1;
   }

   public cvm(dfo $$0, cvm.a $$1, axe $$2, boolean $$3, cxk.a $$4) {
      super($$0.a($$4, $$2, $$3, $$1.d));
      this.a = $$1;
   }

   @Override
   public axe a() {
      return this.a.c;
   }

   public static enum a {
      a(axf.nT, bvq.am),
      b(axf.Dh, bvq.bM);

      final axe c;
      final ju<bvq<?>> d;

      private a(final axe $$0, final bvq<?>... $$1) {
         this.c = $$0;
         this.d = ju.a(bvq::r, $$1);
      }
   }
}
