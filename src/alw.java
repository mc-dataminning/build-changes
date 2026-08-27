public class alw implements aeb {
   private static final tl a = tl.c("multiplayer.status.request_handled");
   private final aea b;
   private final sm c;
   private boolean d;

   public alw(aea $$0, sm $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public void a(tl $$0) {
   }

   @Override
   public boolean c() {
      return this.c.k();
   }

   @Override
   public void a(aed $$0) {
      if (this.d) {
         this.c.a(a);
      } else {
         this.d = true;
         this.c.a(new adz(this.b));
      }
   }

   @Override
   public void a(aec $$0) {
      this.c.a(new ady($$0.a()));
      this.c.a(a);
   }
}
