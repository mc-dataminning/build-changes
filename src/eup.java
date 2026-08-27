public class eup extends euq {
   private static final sw a = sw.c("multiplayer.downloadingTerrain");
   private static final long b = 30000L;
   private boolean c = false;
   private boolean k = false;
   private final long l = System.currentTimeMillis();

   public eup() {
      super(enf.a);
   }

   @Override
   public boolean av_() {
      return false;
   }

   @Override
   protected boolean aH_() {
      return false;
   }

   @Override
   public void a(eox $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
      $$0.a(this.i, a, this.g / 2, this.h / 2 - 50, 16777215);
      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void f() {
      if (System.currentTimeMillis() > this.l + 30000L) {
         this.aw_();
      } else {
         if (this.k) {
            if (this.f.t == null) {
               return;
            }

            gu $$0 = this.f.t.di();
            boolean $$1 = this.f.s != null && this.f.s.d($$0.v());
            if ($$1 || this.f.f.a($$0) || this.f.t.G_() || !this.f.t.bs()) {
               this.aw_();
            }
         } else {
            this.k = this.c;
         }
      }
   }

   @Override
   public void aw_() {
      this.f.aU().c(sw.c("narrator.ready_to_play"));
      super.aw_();
   }

   public void l() {
      this.c = true;
   }

   @Override
   public boolean az_() {
      return false;
   }
}
