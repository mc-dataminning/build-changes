public class dcv extends dck {
   private int a;

   public dcv(gv $$0, dey $$1) {
      super(dcm.s, $$0, $$1);
   }

   @Override
   protected void b(qs $$0) {
      super.b($$0);
      $$0.a("OutputSignal", this.a);
   }

   @Override
   public void a(qs $$0) {
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
