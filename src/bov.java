public class bov implements bot {
   private final bja b;
   protected boolean a;

   public bov(bja $$0) {
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
