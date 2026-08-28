public class ast implements akf {
   private static final xh b = xh.c("multiplayer.status.request_handled");
   private final ake c;
   private final wb d;
   private boolean e;

   public ast(ake $$0, wb $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(wd $$0) {
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
