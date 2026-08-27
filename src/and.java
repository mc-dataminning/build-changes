public class and implements afi {
   private static final ur a = ur.c("multiplayer.status.request_handled");
   private final afh b;
   private final ts c;
   private boolean d;

   public and(afh $$0, ts $$1) {
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
   public void a(afk $$0) {
      if (this.d) {
         this.c.a(a);
      } else {
         this.d = true;
         this.c.a(new afg(this.b));
      }
   }

   @Override
   public void a(afj $$0) {
      this.c.a(new aff($$0.a()));
      this.c.a(a);
   }
}
