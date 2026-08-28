public class csj extends bxi {
   private final csi b;

   public csj(csi $$0) {
      this.b = $$0;
   }

   @Override
   public dak a(bxo $$0, dak $$1) {
      return $$0 == bxo.a ? this.b.gj().b($$1) : super.a($$0, $$1);
   }

   @Override
   public dak a(bxo $$0) {
      return $$0 == bxo.a ? this.b.gj().g() : super.a($$0);
   }

   @Override
   public boolean a() {
      return this.b.gj().g().f() && super.a();
   }
}
