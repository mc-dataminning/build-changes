public class asx implements ake {
   private static final wy b = wy.c("multiplayer.status.request_handled");
   private final akd c;
   private final vr d;
   private boolean e;

   public asx(akd $$0, vr $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(vt $$0) {
   }

   @Override
   public boolean c() {
      return this.d.i();
   }

   @Override
   public void a(akf $$0) {
      if (this.e) {
         this.d.a(b);
      } else {
         this.e = true;
         this.d.a(new akc(this.c));
      }
   }

   @Override
   public void a(ajz $$0) {
      this.d.a(new ajw($$0.b()));
      this.d.a(b);
   }
}
