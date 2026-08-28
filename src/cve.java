public class cve extends cxc {
   private final cve.a a;

   public cve(dfg $$0, cve.a $$1, cxc.a $$2) {
      super($$0.a($$2, $$1.d));
      this.a = $$1;
   }

   public cve(dfg $$0, cve.a $$1, jq<awu> $$2, boolean $$3, cxc.a $$4) {
      super($$0.a($$4, $$2, $$3, $$1.d));
      this.a = $$1;
   }

   @Override
   public awu a() {
      return this.a.c;
   }

   public static enum a {
      a(awv.nZ, bvi.am),
      b(awv.Dx, bvi.bM);

      final awu c;
      final ju<bvi<?>> d;

      private a(final awu $$0, final bvi<?>... $$1) {
         this.c = $$0;
         this.d = ju.a(bvi::r, $$1);
      }
   }
}
