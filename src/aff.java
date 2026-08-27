public class aff implements xf<adj> {
   private final bjz a;
   private final int b;

   public aff(bjz $$0, int $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public aff(ui $$0) {
      this.a = $$0.b(bjz.class);
      this.b = $$0.n();
   }

   @Override
   public void a(ui $$0) {
      $$0.a(this.a);
      $$0.c(this.b);
   }

   public void a(adj $$0) {
      $$0.a(this);
   }

   public bjz a() {
      return this.a;
   }

   public int d() {
      return this.b;
   }
}
