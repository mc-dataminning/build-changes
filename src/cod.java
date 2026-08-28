public class cod extends cne {
   private static final ajw<Boolean> e = aka.a(cod.class, ajy.k);

   public cod(bsx<? extends cod> $$0, dcw $$1) {
      super($$0, $$1);
   }

   public cod(dcw $$0, btn $$1, exc $$2) {
      super(bsx.br, $$1, $$2, $$0);
   }

   @Override
   protected float w() {
      return this.y() ? 0.73F : super.w();
   }

   @Override
   public boolean bR() {
      return false;
   }

   @Override
   public float a(dco $$0, dcc $$1, jd $$2, dtc $$3, epe $$4, float $$5) {
      return this.y() && ciu.c($$3) ? Math.min(0.8F, $$5) : $$5;
   }

   @Override
   protected void a(ewz $$0) {
      super.a($$0);
      if (this.dO() instanceof aqu $$1) {
         bsr var8 = $$0.a();
         boolean $$7;
         if (this.s() instanceof btn $$5) {
            brk $$6 = this.dP().a(this, $$5);
            $$7 = var8.a($$6, 8.0F);
            if ($$7) {
               if (var8.bE()) {
                  dae.a($$1, var8, $$6);
               } else {
                  $$5.c(5.0F);
               }
            }
         } else {
            $$7 = var8.a(this.dP().p(), 5.0F);
         }

         if ($$7 && var8 instanceof btn $$9) {
            int $$10 = 0;
            if (this.dO().al() == bqo.c) {
               $$10 = 10;
            } else if (this.dO().al() == bqo.d) {
               $$10 = 40;
            }

            if ($$10 > 0) {
               $$9.b(new brz(bsb.t, 20 * $$10, 1), this.H());
            }
         }
      }
   }

   @Override
   protected void a(exa $$0) {
      super.a($$0);
      if (!this.dO().B) {
         this.dO().a(this, this.dt(), this.dv(), this.dz(), 1.0F, false, dcw.a.c);
         this.aq();
      }
   }

   @Override
   public boolean a(brk $$0, float $$1) {
      return false;
   }

   @Override
   protected void a(aka.a $$0) {
      $$0.a(e, false);
   }

   public boolean y() {
      return this.ao.a(e);
   }

   public void a(boolean $$0) {
      this.ao.a(e, $$0);
   }

   @Override
   protected boolean t() {
      return false;
   }

   @Override
   public void b(ub $$0) {
      super.b($$0);
      $$0.a("dangerous", this.y());
   }

   @Override
   public void a(ub $$0) {
      super.a($$0);
      this.a($$0.q("dangerous"));
   }
}
