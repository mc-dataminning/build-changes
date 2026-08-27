public class aqw implements ait {
   private static final wg a = wg.c("multiplayer.status.request_handled");
   private final ais b;
   private final ve c;
   private boolean d;

   public aqw(ais $$0, ve $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public void a(wg $$0) {
   }

   @Override
   public boolean c() {
      return this.c.i();
   }

   @Override
   public void a(aiu $$0) {
      if (this.d) {
         this.c.a(a);
      } else {
         this.d = true;
         this.c.a(new air(this.b));
      }
   }

   @Override
   public void a(aio $$0) {
      this.c.a(new ail($$0.b()));
      this.c.a(a);
   }
}
