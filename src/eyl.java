public class eyl extends eym {
   private static final tn a = tn.c("multiplayer.downloadingTerrain");
   private static final long b = 30000L;
   private boolean c = false;
   private boolean k = false;
   private final long l = System.currentTimeMillis();

   public eyl() {
      super(eqp.a);
   }

   @Override
   public boolean ay_() {
      return false;
   }

   @Override
   protected boolean aG_() {
      return false;
   }

   @Override
   public void a(esh $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, a, this.g / 2, this.h / 2 - 50, 16777215);
   }

   @Override
   public void b(esh $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
   }

   @Override
   public void c() {
      if (System.currentTimeMillis() > this.l + 30000L) {
         this.az_();
      } else {
         if (this.k) {
            if (this.f.s == null) {
               return;
            }

            gw $$0 = this.f.s.dl();
            boolean $$1 = this.f.r != null && this.f.r.d($$0.v());
            if ($$1 || this.f.f.a($$0) || this.f.s.M_() || !this.f.s.bv()) {
               this.az_();
            }
         } else {
            this.k = this.c;
         }
      }
   }

   @Override
   public void az_() {
      this.f.aV().c(tn.c("narrator.ready_to_play"));
      super.az_();
   }

   public void l() {
      this.c = true;
   }

   @Override
   public boolean j() {
      return false;
   }
}
