public class alt implements aea {
   private static final tl a = tl.c("multiplayer.status.request_handled");
   private final adz b;
   private final sm c;
   private boolean d;

   public alt(adz $$0, sm $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public void a(tl $$0) {
   }

   @Override
   public boolean c() {
      return this.c.k();
   }

   @Override
   public void a(aec $$0) {
      if (this.d) {
         this.c.a(a);
      } else {
         this.d = true;
         this.c.a(new ady(this.b));
      }
   }

   @Override
   public void a(aeb $$0) {
      this.c.a(new adx($$0.a()));
      this.c.a(a);
   }
}
