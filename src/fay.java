public class fay extends fbb {
   private static final tf b = tf.c("multiplayerWarning.header").a(n.r);
   private static final tf c = tf.c("multiplayerWarning.message");
   private static final tf k = tf.c("multiplayerWarning.check");
   private static final tf l = b.e().f("\n").b(c);
   private final eya m;

   public fay(eya $$0) {
      super(b, c, k, l);
      this.m = $$0;
   }

   @Override
   protected void a(int $$0) {
      this.d(esg.a(te.i, $$0x -> {
         if (this.a.a()) {
            this.f.m.v = true;
            this.f.m.ar();
         }

         this.f.a(new faw(this.m));
      }).a(this.g / 2 - 155, 100 + $$0, 150, 20).a());
      this.d(esg.a(te.k, $$0x -> this.f.a(this.m)).a(this.g / 2 - 155 + 160, 100 + $$0, 150, 20).a());
   }
}
