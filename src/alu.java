public class alu implements aeb {
   private static final tm a = tm.c("multiplayer.status.request_handled");
   private final aea b;
   private final sn c;
   private boolean d;

   public alu(aea $$0, sn $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public void a(tm $$0) {
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
