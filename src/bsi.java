public class bsi implements bsg {
   private final bmn b;
   protected boolean a;

   public bsi(bmn $$0) {
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
