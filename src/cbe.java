public class cbe implements cbc {
   private final bvh b;
   protected boolean a;

   public cbe(bvh $$0) {
      this.b = $$0;
   }

   public void a() {
      this.a = true;
   }

   public void b() {
      this.b.t(this.a);
      this.a = false;
   }
}
