public class cvi extends cxg {
   private final cvi.a a;

   public cvi(dfh $$0, cvi.a $$1, cxg.a $$2) {
      super($$0.a($$2, $$1.d));
      this.a = $$1;
   }

   public cvi(dfh $$0, cvi.a $$1, axe $$2, boolean $$3, cxg.a $$4) {
      super($$0.a($$4, $$2, $$3, $$1.d));
      this.a = $$1;
   }

   @Override
   public axe a() {
      return this.a.c;
   }

   public static enum a {
      a(axf.nS, bvm.am),
      b(axf.Dg, bvm.bM);

      final axe c;
      final ju<bvm<?>> d;

      private a(final axe $$0, final bvm<?>... $$1) {
         this.c = $$0;
         this.d = ju.a(bvm::r, $$1);
      }
   }
}
