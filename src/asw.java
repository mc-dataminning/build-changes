public class asw implements akh {
   private static final xj b = xj.c("multiplayer.status.request_handled");
   private final akg c;
   private final wd d;
   private boolean e;

   public asw(akg $$0, wd $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(wf $$0) {
   }

   @Override
   public boolean c() {
      return this.d.i();
   }

   @Override
   public void a(aki $$0) {
      if (this.e) {
         this.d.a(b);
      } else {
         this.e = true;
         this.d.a(new akf(this.c));
      }
   }

   @Override
   public void a(akc $$0) {
      this.d.a(new ajz($$0.b()));
      this.d.a(b);
   }
}
