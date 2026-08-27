public class alk implements adt {
   private static final te a = te.c("multiplayer.status.request_handled");
   private final ads b;
   private final sf c;
   private boolean d;

   public alk(ads $$0, sf $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public void a(te $$0) {
   }

   @Override
   public boolean c() {
      return this.c.k();
   }

   @Override
   public void a(adv $$0) {
      if (this.d) {
         this.c.a(a);
      } else {
         this.d = true;
         this.c.a(new adr(this.b));
      }
   }

   @Override
   public void a(adu $$0) {
      this.c.a(new adq($$0.a()));
      this.c.a(a);
   }
}
