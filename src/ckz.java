public class ckz extends cka {
   private static final aiy<Boolean> e = ajc.a(ckz.class, aja.k);

   public ckz(bqb<? extends ckz> $$0, cyx $$1) {
      super($$0, $$1);
   }

   public ckz(cyx $$0, bqo $$1, double $$2, double $$3, double $$4) {
      super(bqb.bq, $$1, $$2, $$3, $$4, $$0);
   }

   @Override
   protected float w() {
      return this.y() ? 0.73F : super.w();
   }

   @Override
   public boolean bN() {
      return false;
   }

   @Override
   public float a(cyp $$0, cyd $$1, ib $$2, doz $$3, eks $$4, float $$5) {
      return this.y() && cfr.d($$3) ? Math.min(0.8F, $$5) : $$5;
   }

   @Override
   protected void a(erx $$0) {
      super.a($$0);
      if (!this.dM().B) {
         bpv $$1 = $$0.a();
         boolean $$4;
         if (this.u() instanceof bqo $$3) {
            $$4 = $$1.a(this.dN().a(this, $$3), 8.0F);
            if ($$4) {
               if ($$1.bA()) {
                  this.a($$3, $$1);
               } else {
                  $$3.c(5.0F);
               }
            }
         } else {
            $$4 = $$1.a(this.dN().o(), 5.0F);
         }

         if ($$4 && $$1 instanceof bqo $$6) {
            int $$7 = 0;
            if (this.dM().ak() == bnx.c) {
               $$7 = 10;
            } else if (this.dM().ak() == bnx.d) {
               $$7 = 40;
            }

            if ($$7 > 0) {
               $$6.b(new bph(bpj.t, 20 * $$7, 1), this.I());
            }
         }
      }
   }

   @Override
   protected void a(ery $$0) {
      super.a($$0);
      if (!this.dM().B) {
         this.dM().a(this, this.dr(), this.dt(), this.dx(), 1.0F, false, cyx.a.c);
         this.am();
      }
   }

   @Override
   public boolean bw() {
      return false;
   }

   @Override
   public boolean a(bot $$0, float $$1) {
      return false;
   }

   @Override
   protected void a(ajc.a $$0) {
      $$0.a(e, false);
   }

   public boolean y() {
      return this.an.a(e);
   }

   public void a(boolean $$0) {
      this.an.a(e, $$0);
   }

   @Override
   protected boolean r() {
      return false;
   }

   @Override
   public void b(tm $$0) {
      super.b($$0);
      $$0.a("dangerous", this.y());
   }

   @Override
   public void a(tm $$0) {
      super.a($$0);
      this.a($$0.q("dangerous"));
   }
}
