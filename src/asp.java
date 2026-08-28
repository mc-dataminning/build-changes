public class asp implements akc {
   private static final xe b = xe.c("multiplayer.status.request_handled");
   private final akb c;
   private final vy d;
   private boolean e;

   public asp(akb $$0, vy $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(wa $$0) {
   }

   @Override
   public boolean c() {
      return this.d.i();
   }

   @Override
   public void a(akd $$0) {
      if (this.e) {
         this.d.a(b);
      } else {
         this.e = true;
         this.d.a(new aka(this.c));
      }
   }

   @Override
   public void a(ajx $$0) {
      this.d.a(new aju($$0.b()));
      this.d.a(b);
   }
}
