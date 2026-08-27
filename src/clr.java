public class clr extends cks {
   private static final ajk<Boolean> e = ajo.a(clr.class, ajm.k);

   public clr(bqr<? extends clr> $$0, czu $$1) {
      super($$0, $$1);
   }

   public clr(czu $$0, bre $$1, double $$2, double $$3, double $$4) {
      super(bqr.bq, $$1, $$2, $$3, $$4, $$0);
   }

   @Override
   protected float w() {
      return this.y() ? 0.73F : super.w();
   }

   @Override
   public boolean bO() {
      return false;
   }

   @Override
   public float a(czm $$0, cza $$1, im $$2, dpy $$3, elr $$4, float $$5) {
      return this.y() && cgj.d($$3) ? Math.min(0.8F, $$5) : $$5;
   }

   @Override
   protected void a(etc $$0) {
      super.a($$0);
      if (!this.dN().B) {
         bql $$1 = $$0.a();
         boolean $$4;
         if (this.u() instanceof bre $$3) {
            $$4 = $$1.a(this.dO().a(this, $$3), 8.0F);
            if ($$4) {
               if ($$1.bB()) {
                  this.a($$3, $$1);
               } else {
                  $$3.c(5.0F);
               }
            }
         } else {
            $$4 = $$1.a(this.dO().o(), 5.0F);
         }

         if ($$4 && $$1 instanceof bre $$6) {
            int $$7 = 0;
            if (this.dN().ak() == bon.c) {
               $$7 = 10;
            } else if (this.dN().ak() == bon.d) {
               $$7 = 40;
            }

            if ($$7 > 0) {
               $$6.b(new bpx(bpz.t, 20 * $$7, 1), this.I());
            }
         }
      }
   }

   @Override
   protected void a(etd $$0) {
      super.a($$0);
      if (!this.dN().B) {
         this.dN().a(this, this.ds(), this.du(), this.dy(), 1.0F, false, czu.a.c);
         this.am();
      }
   }

   @Override
   public boolean bx() {
      return false;
   }

   @Override
   public boolean a(bpj $$0, float $$1) {
      return false;
   }

   @Override
   protected void a(ajo.a $$0) {
      $$0.a(e, false);
   }

   public boolean y() {
      return this.ao.a(e);
   }

   public void a(boolean $$0) {
      this.ao.a(e, $$0);
   }

   @Override
   protected boolean r() {
      return false;
   }

   @Override
   public void b(ty $$0) {
      super.b($$0);
      $$0.a("dangerous", this.y());
   }

   @Override
   public void a(ty $$0) {
      super.a($$0);
      this.a($$0.q("dangerous"));
   }
}
