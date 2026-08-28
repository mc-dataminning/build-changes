public class dwz extends dwn {
   private int a;

   public dwz(iu $$0, dzo $$1) {
      super(dwp.t, $$0, $$1);
   }

   @Override
   protected void b(tx $$0, jg.a $$1) {
      super.b($$0, $$1);
      $$0.a("OutputSignal", this.a);
   }

   @Override
   protected void a(tx $$0, jg.a $$1) {
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
