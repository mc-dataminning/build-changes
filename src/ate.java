public class ate implements akn {
   private static final xk b = xk.c("multiplayer.status.request_handled");
   private final akm c;
   private final we d;
   private boolean e;

   public ate(akm $$0, we $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(wg $$0) {
   }

   @Override
   public boolean c() {
      return this.d.i();
   }

   @Override
   public void a(ako $$0) {
      if (this.e) {
         this.d.a(b);
      } else {
         this.e = true;
         this.d.a(new akl(this.c));
      }
   }

   @Override
   public void a(aki $$0) {
      this.d.a(new akf($$0.b()));
      this.d.a(b);
   }
}
