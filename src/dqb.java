public class dqb extends dpq {
   private int a;

   public dqb(ja $$0, dsl $$1) {
      super(dps.s, $$0, $$1);
   }

   @Override
   protected void b(tx $$0, jl.a $$1) {
      super.b($$0, $$1);
      $$0.a("OutputSignal", this.a);
   }

   @Override
   protected void a(tx $$0, jl.a $$1) {
      super.a($$0, $$1);
      this.a = $$0.h("OutputSignal");
   }

   public int b() {
      return this.a;
   }

   public void a(int $$0) {
      this.a = $$0;
   }
}
