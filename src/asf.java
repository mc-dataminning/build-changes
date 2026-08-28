public class asf implements akb {
   private static final xl a = xl.c("multiplayer.status.request_handled");
   private final aka b;
   private final wj c;
   private boolean d;

   public asf(aka $$0, wj $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public void a(xl $$0) {
   }

   @Override
   public boolean c() {
      return this.c.i();
   }

   @Override
   public void a(akc $$0) {
      if (this.d) {
         this.c.a(a);
      } else {
         this.d = true;
         this.c.a(new ajz(this.b));
      }
   }

   @Override
   public void a(ajw $$0) {
      this.c.a(new ajt($$0.b()));
      this.c.a(a);
   }
}
