public class anh implements afk {
   private static final ur a = ur.c("multiplayer.status.request_handled");
   private final afj b;
   private final ts c;
   private boolean d;

   public anh(afj $$0, ts $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public void a(ur $$0) {
   }

   @Override
   public boolean c() {
      return this.c.k();
   }

   @Override
   public void a(afm $$0) {
      if (this.d) {
         this.c.a(a);
      } else {
         this.d = true;
         this.c.a(new afi(this.b));
      }
   }

   @Override
   public void a(afl $$0) {
      this.c.a(new afh($$0.a()));
      this.c.a(a);
   }
}
