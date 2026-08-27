public class dgo extends dgd {
   private int a;

   public dgo(hv $$0, dip $$1) {
      super(dgf.s, $$0, $$1);
   }

   @Override
   protected void b(sj $$0) {
      super.b($$0);
      $$0.a("OutputSignal", this.a);
   }

   @Override
   public void a(sj $$0) {
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
