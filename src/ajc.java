public class ajc implements abu {
   private static final sw a = sw.c("multiplayer.status.request_handled");
   private final abt b;
   private final sd c;
   private boolean d;

   public ajc(abt $$0, sd $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public void a(sw $$0) {
   }

   @Override
   public boolean a() {
      return this.c.h();
   }

   @Override
   public void a(abw $$0) {
      if (this.d) {
         this.c.a(a);
      } else {
         this.d = true;
         this.c.a(new abs(this.b));
      }
   }

   @Override
   public void a(abv $$0) {
      this.c.a(new abr($$0.a()));
      this.c.a(a);
   }
}
