public class bvm implements bvk {
   private final bpq b;
   protected boolean a;

   public bvm(bpq $$0) {
      this.b = $$0;
   }

   public void a() {
      this.a = true;
   }

   public void b() {
      this.b.r(this.a);
      this.a = false;
   }
}
