public class cmn extends clo {
   private static final ajm<Boolean> e = ajq.a(cmn.class, ajo.k);

   public cmn(brn<? extends cmn> $$0, dad $$1) {
      super($$0, $$1);
   }

   public cmn(dad $$0, bsa $$1, double $$2, double $$3, double $$4) {
      super(brn.bq, $$1, $$2, $$3, $$4, $$0);
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
   public float a(czv $$0, czj $$1, in $$2, dqh $$3, ema $$4, float $$5) {
      return this.y() && chf.d($$3) ? Math.min(0.8F, $$5) : $$5;
   }

   @Override
   protected void a(etm $$0) {
      super.a($$0);
      if (!this.dN().B) {
         brh $$1 = $$0.a();
         boolean $$4;
         if (this.u() instanceof bsa $$3) {
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

         if ($$4 && $$1 instanceof bsa $$6) {
            int $$7 = 0;
            if (this.dN().ak() == bpj.c) {
               $$7 = 10;
            } else if (this.dN().ak() == bpj.d) {
               $$7 = 40;
            }

            if ($$7 > 0) {
               $$6.b(new bqt(bqv.t, 20 * $$7, 1), this.I());
            }
         }
      }
   }

   @Override
   protected void a(etn $$0) {
      super.a($$0);
      if (!this.dN().B) {
         this.dN().a(this, this.ds(), this.du(), this.dy(), 1.0F, false, dad.a.c);
         this.am();
      }
   }

   @Override
   public boolean bx() {
      return false;
   }

   @Override
   public boolean a(bqf $$0, float $$1) {
      return false;
   }

   @Override
   protected void a(ajq.a $$0) {
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
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("dangerous", this.y());
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      this.a($$0.q("dangerous"));
   }
}
