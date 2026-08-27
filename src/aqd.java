public class aqd implements aid {
   private static final vs a = vs.c("multiplayer.status.request_handled");
   private final aic b;
   private final uq c;
   private boolean d;

   public aqd(aic $$0, uq $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public void a(vs $$0) {
   }

   @Override
   public boolean c() {
      return this.c.i();
   }

   @Override
   public void a(aie $$0) {
      if (this.d) {
         this.c.a(a);
      } else {
         this.d = true;
         this.c.a(new aib(this.b));
      }
   }

   @Override
   public void a(ahy $$0) {
      this.c.a(new ahv($$0.b()));
      this.c.a(a);
   }
}
