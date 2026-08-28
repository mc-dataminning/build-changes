public class cpc extends coc {
   private static final akg<Boolean> e = akk.a(cpc.class, aki.k);

   public cpc(btv<? extends cpc> $$0, deg $$1) {
      super($$0, $$1);
   }

   public cpc(deg $$0, buk $$1, eys $$2) {
      super(btv.br, $$1, $$2, $$0);
   }

   @Override
   protected float t() {
      return this.w() ? 0.73F : super.t();
   }

   @Override
   public boolean bV() {
      return false;
   }

   @Override
   public float a(ddy $$0, ddl $$1, je $$2, duo $$3, eqp $$4, float $$5) {
      return this.w() && cjr.c($$3) ? Math.min(0.8F, $$5) : $$5;
   }

   @Override
   protected void a(eyp $$0) {
      super.a($$0);
      if (this.dS() instanceof arh $$1) {
         bto var8 = $$0.a();
         boolean $$7;
         if (this.s() instanceof buk $$5) {
            bsg $$6 = this.dT().a(this, $$5);
            $$7 = var8.a($$6, 8.0F);
            if ($$7) {
               if (var8.bI()) {
                  dbm.a($$1, var8, $$6);
               } else {
                  $$5.c(5.0F);
               }
            }
         } else {
            $$7 = var8.a(this.dT().q(), 5.0F);
         }

         if ($$7 && var8 instanceof buk $$9) {
            int $$10 = 0;
            if (this.dS().am() == brm.c) {
               $$10 = 10;
            } else if (this.dS().am() == brm.d) {
               $$10 = 40;
            }

            if ($$10 > 0) {
               $$9.b(new bsv(bsx.t, 20 * $$10, 1), this.F());
            }
         }
      }
   }

   @Override
   protected void a(eyq $$0) {
      super.a($$0);
      if (!this.dS().B) {
         this.dS().a(this, this.dx(), this.dz(), this.dD(), 1.0F, false, deg.a.c);
         this.as();
      }
   }

   @Override
   public boolean a(bsg $$0, float $$1) {
      return false;
   }

   @Override
   protected void a(akk.a $$0) {
      $$0.a(e, false);
   }

   public boolean w() {
      return this.am.a(e);
   }

   public void a(boolean $$0) {
      this.am.a(e, $$0);
   }

   @Override
   protected boolean o() {
      return false;
   }

   @Override
   public void b(uf $$0) {
      super.b($$0);
      $$0.a("dangerous", this.w());
   }

   @Override
   public void a(uf $$0) {
      super.a($$0);
      this.a($$0.q("dangerous"));
   }
}
