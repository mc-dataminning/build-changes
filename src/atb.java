public class atb implements aki {
   private static final xc b = xc.c("multiplayer.status.request_handled");
   private final akh c;
   private final vv d;
   private boolean e;

   public atb(akh $$0, vv $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(vx $$0) {
   }

   @Override
   public boolean c() {
      return this.d.i();
   }

   @Override
   public void a(akj $$0) {
      if (this.e) {
         this.d.a(b);
      } else {
         this.e = true;
         this.d.a(new akg(this.c));
      }
   }

   @Override
   public void a(akd $$0) {
      this.d.a(new aka($$0.b()));
      this.d.a(b);
   }
}
