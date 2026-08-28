public class coe extends cnf {
   private static final akk<Boolean> g = ako.a(coe.class, akm.k);

   public coe(btb<? extends coe> $$0, dbz $$1) {
      super($$0, $$1);
   }

   public coe(dbz $$0, btq $$1, double $$2, double $$3, double $$4) {
      super(btb.br, $$1, $$2, $$3, $$4, $$0);
   }

   @Override
   protected float w() {
      return this.y() ? 0.73F : super.w();
   }

   @Override
   public boolean bQ() {
      return false;
   }

   @Override
   public float a(dbr $$0, dbf $$1, iz $$2, dsd $$3, enw $$4, float $$5) {
      return this.y() && ciw.d($$3) ? Math.min(0.8F, $$5) : $$5;
   }

   @Override
   protected void a(evp $$0) {
      super.a($$0);
      if (!this.dP().B) {
         bsv $$1 = $$0.a();
         boolean $$4;
         if (this.s() instanceof btq $$3) {
            $$4 = $$1.a(this.dQ().a(this, $$3), 8.0F);
            if ($$4) {
               if ($$1.bD()) {
                  this.a($$3, $$1);
               } else {
                  $$3.c(5.0F);
               }
            }
         } else {
            $$4 = $$1.a(this.dQ().o(), 5.0F);
         }

         if ($$4 && $$1 instanceof btq $$6) {
            int $$7 = 0;
            if (this.dP().al() == bqs.c) {
               $$7 = 10;
            } else if (this.dP().al() == bqs.d) {
               $$7 = 40;
            }

            if ($$7 > 0) {
               $$6.b(new bsd(bsf.t, 20 * $$7, 1), this.I());
            }
         }
      }
   }

   @Override
   protected void a(evq $$0) {
      super.a($$0);
      if (!this.dP().B) {
         this.dP().a(this, this.du(), this.dw(), this.dA(), 1.0F, false, dbz.a.c);
         this.ao();
      }
   }

   @Override
   public boolean a(bro $$0, float $$1) {
      return false;
   }

   @Override
   protected void a(ako.a $$0) {
      $$0.a(g, false);
   }

   public boolean y() {
      return this.ao.a(g);
   }

   public void a(boolean $$0) {
      this.ao.a(g, $$0);
   }

   @Override
   protected boolean u() {
      return false;
   }

   @Override
   public void b(us $$0) {
      super.b($$0);
      $$0.a("dangerous", this.y());
   }

   @Override
   public void a(us $$0) {
      super.a($$0);
      this.a($$0.q("dangerous"));
   }
}
