public class exu extends exv {
   private static final te a = te.c("multiplayer.downloadingTerrain");
   private static final long b = 30000L;
   private boolean c = false;
   private boolean k = false;
   private final long l = System.currentTimeMillis();

   public exu() {
      super(eqf.a);
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
   public void a(erx $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, a, this.g / 2, this.h / 2 - 50, 16777215);
   }

   @Override
   public void b(erx $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
   }

   @Override
   public void c() {
      if (System.currentTimeMillis() > this.l + 30000L) {
         this.au_();
      } else {
         if (this.k) {
            if (this.f.t == null) {
               return;
            }

            gv $$0 = this.f.t.dk();
            boolean $$1 = this.f.s != null && this.f.s.d($$0.v());
            if ($$1 || this.f.f.a($$0) || this.f.t.G_() || !this.f.t.bv()) {
               this.au_();
            }
         } else {
            this.k = this.c;
         }
      }
   }

   @Override
   public void au_() {
      this.f.aU().c(te.c("narrator.ready_to_play"));
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
