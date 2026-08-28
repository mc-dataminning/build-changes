public class ati implements akp {
   private static final xg b = xg.c("multiplayer.status.request_handled");
   private final ako c;
   private final vv d;
   private boolean e;

   public ati(ako $$0, vv $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(vx $$0) {
   }

   @Override
   public boolean c() {
      return this.d.i();
   }

   @Override
   public void a(akq $$0) {
      if (this.e) {
         this.d.a(b);
      } else {
         this.e = true;
         this.d.a(new akn(this.c));
      }
   }

   @Override
   public void a(akk $$0) {
      this.d.a(new akh($$0.b()));
      this.d.a(b);
   }
}
