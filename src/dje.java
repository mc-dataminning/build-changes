public class dje extends dit {
   private int a;

   public dje(hz $$0, dlf $$1) {
      super(div.s, $$0, $$1);
   }

   @Override
   protected void b(sw $$0) {
      super.b($$0);
      $$0.a("OutputSignal", this.a);
   }

   @Override
   public void a(sw $$0) {
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
