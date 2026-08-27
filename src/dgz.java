public class dgz extends dgo {
   private int a;

   public dgz(hx $$0, dja $$1) {
      super(dgq.s, $$0, $$1);
   }

   @Override
   protected void b(sl $$0) {
      super.b($$0);
      $$0.a("OutputSignal", this.a);
   }

   @Override
   public void a(sl $$0) {
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
