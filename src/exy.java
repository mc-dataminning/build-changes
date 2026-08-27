public class exy extends exz {
   private static final tf a = tf.c("multiplayer.downloadingTerrain");
   private static final long b = 30000L;
   private boolean c = false;
   private boolean k = false;
   private final long l = System.currentTimeMillis();

   public exy() {
      super(eqe.a);
   }

   @Override
   public boolean aA_() {
      return false;
   }

   @Override
   protected boolean aD_() {
      return false;
   }

   @Override
   public void a(erw $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, a, this.g / 2, this.h / 2 - 50, 16777215);
   }

   @Override
   public void b(erw $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
   }

   @Override
   public void c() {
      if (System.currentTimeMillis() > this.l + 30000L) {
         this.au_();
      } else {
         if (this.k) {
            if (this.f.v == null) {
               return;
            }

            gu $$0 = this.f.v.dk();
            boolean $$1 = this.f.u != null && this.f.u.d($$0.v());
            if ($$1 || this.f.f.a($$0) || this.f.v.G_() || !this.f.v.bv()) {
               this.au_();
            }
         } else {
            this.k = this.c;
         }
      }
   }

   @Override
   public void au_() {
      this.f.aV().c(tf.c("narrator.ready_to_play"));
      super.au_();
   }

   public void l() {
      this.c = true;
   }

   @Override
   public boolean j() {
      return false;
   }
}
