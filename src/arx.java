public class arx implements ajq {
   private static final wy b = wy.c("multiplayer.status.request_handled");
   private final ajp c;
   private final vs d;
   private boolean e;

   public arx(ajp $$0, vs $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(vu $$0) {
   }

   @Override
   public boolean c() {
      return this.d.i();
   }

   @Override
   public void a(ajr $$0) {
      if (this.e) {
         this.d.a(b);
      } else {
         this.e = true;
         this.d.a(new ajo(this.c));
      }
   }

   @Override
   public void a(ajl $$0) {
      this.d.a(new aji($$0.b()));
      this.d.a(b);
   }
}
