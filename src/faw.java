public class faw extends fba {
   private static final tf b = tf.c("title.32bit.deprecation.realms.header").a(n.r);
   private static final tf c = tf.c("title.32bit.deprecation.realms");
   private static final tf k = tf.c("title.32bit.deprecation.realms.check");
   private static final tf l = b.e().f("\n").b(c);
   private final exz m;

   public faw(exz $$0) {
      super(b, c, k, l);
      this.m = $$0;
   }

   @Override
   protected void a(int $$0) {
      this.d(esh.a(te.d, $$0x -> {
         if (this.a.a()) {
            this.f.m.w = true;
            this.f.m.aq();
         }

         this.f.a(this.m);
      }).a(this.g / 2 - 75, 100 + $$0, 150, 20).a());
   }
}
