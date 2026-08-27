public class exz extends eya {
   private static final tf a = tf.c("multiplayer.downloadingTerrain");
   private static final long b = 30000L;
   private boolean c = false;
   private boolean k = false;
   private final long l = System.currentTimeMillis();

   public exz() {
      super(eqd.a);
   }

   @Override
   public boolean ay_() {
      return false;
   }

   @Override
   protected boolean aB_() {
      return false;
   }

   @Override
   public void a(erv $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, a, this.g / 2, this.h / 2 - 50, 16777215);
   }

   @Override
   public void b(erv $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
   }

   @Override
   public void c() {
      if (System.currentTimeMillis() > this.l + 30000L) {
         this.at_();
      } else {
         if (this.k) {
            if (this.f.s == null) {
               return;
            }

            gu $$0 = this.f.s.dk();
            boolean $$1 = this.f.r != null && this.f.r.d($$0.v());
            if ($$1 || this.f.f.a($$0) || this.f.s.G_() || !this.f.s.bv()) {
               this.at_();
            }
         } else {
            this.k = this.c;
         }
      }
   }

   @Override
   public void at_() {
      this.f.aV().c(tf.c("narrator.ready_to_play"));
      super.at_();
   }

   public void l() {
      this.c = true;
   }

   @Override
   public boolean j() {
      return false;
   }
}
