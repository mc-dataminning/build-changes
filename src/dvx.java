public class dvx extends dvl {
   private int a;

   public dvx(jj $$0, dym $$1) {
      super(dvn.t, $$0, $$1);
   }

   @Override
   protected void b(tw $$0, ju.a $$1) {
      super.b($$0, $$1);
      $$0.a("OutputSignal", this.a);
   }

   @Override
   protected void a(tw $$0, ju.a $$1) {
      super.a($$0, $$1);
      this.a = $$0.h("OutputSignal");
   }

   public int a() {
      return this.a;
   }

   public void a(int $$0) {
      this.a = $$0;
   }
}
