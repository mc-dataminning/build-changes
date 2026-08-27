public class alv implements aec {
   private static final tn a = tn.c("multiplayer.status.request_handled");
   private final aeb b;
   private final so c;
   private boolean d;

   public alv(aeb $$0, so $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public void a(tn $$0) {
   }

   @Override
   public boolean c() {
      return this.c.k();
   }

   @Override
   public void a(aee $$0) {
      if (this.d) {
         this.c.a(a);
      } else {
         this.d = true;
         this.c.a(new aea(this.b));
      }
   }

   @Override
   public void a(aed $$0) {
      this.c.a(new adz($$0.a()));
      this.c.a(a);
   }
}
