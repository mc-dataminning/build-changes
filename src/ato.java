public class ato implements akx {
   private static final xv b = xv.c("multiplayer.status.request_handled");
   private final akw c;
   private final wp d;
   private boolean e;

   public ato(akw $$0, wp $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(wr $$0) {
   }

   @Override
   public boolean c() {
      return this.d.i();
   }

   @Override
   public void a(aky $$0) {
      if (this.e) {
         this.d.a(b);
      } else {
         this.e = true;
         this.d.a(new akv(this.c));
      }
   }

   @Override
   public void a(aks $$0) {
      this.d.a(new akp($$0.b()));
      this.d.a(b);
   }
}
