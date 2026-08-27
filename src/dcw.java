public class dcw extends dcl {
   private int a;

   public dcw(gu $$0, dez $$1) {
      super(dcn.s, $$0, $$1);
   }

   @Override
   protected void b(qr $$0) {
      super.b($$0);
      $$0.a("OutputSignal", this.a);
   }

   @Override
   public void a(qr $$0) {
      super.a($$0);
      this.a = $$0.h("OutputSignal");
   }

   public int c() {
      return this.a;
   }

   public void a(int $$0) {
      this.a = $$0;
   }
}
