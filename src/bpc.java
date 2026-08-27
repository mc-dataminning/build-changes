public class bpc implements bpa {
   private final bji b;
   protected boolean a;

   public bpc(bji $$0) {
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
