public class asj implements akf {
   private static final xp b = xp.c("multiplayer.status.request_handled");
   private final ake c;
   private final wk d;
   private boolean e;

   public asj(ake $$0, wk $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(xp $$0) {
   }

   @Override
   public boolean c() {
      return this.d.i();
   }

   @Override
   public void a(akg $$0) {
      if (this.e) {
         this.d.a(b);
      } else {
         this.e = true;
         this.d.a(new akd(this.c));
      }
   }

   @Override
   public void a(aka $$0) {
      this.d.a(new ajx($$0.b()));
      this.d.a(b);
   }
}
