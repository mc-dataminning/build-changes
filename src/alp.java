public class alp implements ady {
   private static final ti a = ti.c("multiplayer.status.request_handled");
   private final adx b;
   private final sj c;
   private boolean d;

   public alp(adx $$0, sj $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public void a(ti $$0) {
   }

   @Override
   public boolean c() {
      return this.c.k();
   }

   @Override
   public void a(aea $$0) {
      if (this.d) {
         this.c.a(a);
      } else {
         this.d = true;
         this.c.a(new adw(this.b));
      }
   }

   @Override
   public void a(adz $$0) {
      this.c.a(new adv($$0.a()));
      this.c.a(a);
   }
}
