public class aqi implements aih {
   private static final vu a = vu.c("multiplayer.status.request_handled");
   private final aig b;
   private final us c;
   private boolean d;

   public aqi(aig $$0, us $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public void a(vu $$0) {
   }

   @Override
   public boolean c() {
      return this.c.i();
   }

   @Override
   public void a(aii $$0) {
      if (this.d) {
         this.c.a(a);
      } else {
         this.d = true;
         this.c.a(new aif(this.b));
      }
   }

   @Override
   public void a(aic $$0) {
      this.c.a(new ahz($$0.b()));
      this.c.a(a);
   }
}
