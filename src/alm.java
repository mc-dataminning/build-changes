public class alm implements adv {
   private static final tf a = tf.c("multiplayer.status.request_handled");
   private final adu b;
   private final sg c;
   private boolean d;

   public alm(adu $$0, sg $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public void a(tf $$0) {
   }

   @Override
   public boolean c() {
      return this.c.k();
   }

   @Override
   public void a(adx $$0) {
      if (this.d) {
         this.c.a(a);
      } else {
         this.d = true;
         this.c.a(new adt(this.b));
      }
   }

   @Override
   public void a(adw $$0) {
      this.c.a(new ads($$0.a()));
      this.c.a(a);
   }
}
