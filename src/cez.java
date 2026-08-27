public class cez extends ceb {
   private static final afo<Boolean> e = afr.a(cez.class, afq.k);

   public cez(bku<? extends cez> $$0, csa $$1) {
      super($$0, $$1);
   }

   public cez(csa $$0, blg $$1, double $$2, double $$3, double $$4) {
      super(bku.bm, $$1, $$2, $$3, $$4, $$0);
   }

   @Override
   protected float u() {
      return this.x() ? 0.73F : super.u();
   }

   @Override
   public boolean bN() {
      return false;
   }

   @Override
   public float a(crs $$0, crg $$1, ht $$2, dhi $$3, ecs $$4, float $$5) {
      return this.x() && cab.d($$3) ? Math.min(0.8F, $$5) : $$5;
   }

   @Override
   protected void a(ejr $$0) {
      super.a($$0);
      if (!this.dN().B) {
         bkq $$1 = $$0.a();
         boolean $$4;
         if (this.w() instanceof blg $$3) {
            $$4 = $$1.a(this.dO().a(this, $$3), 8.0F);
            if ($$4) {
               if ($$1.bx()) {
                  this.a($$3, $$1);
               } else {
                  $$3.b(5.0F);
               }
            }
         } else {
            $$4 = $$1.a(this.dO().o(), 5.0F);
         }

         if ($$4 && $$1 instanceof blg $$6) {
            int $$7 = 0;
            if (this.dN().aj() == biu.c) {
               $$7 = 10;
            } else if (this.dN().aj() == biu.d) {
               $$7 = 40;
            }

            if ($$7 > 0) {
               $$6.b(new bkd(bkf.t, 20 * $$7, 1), this.I());
            }
         }
      }
   }

   @Override
   protected void a(ejs $$0) {
      super.a($$0);
      if (!this.dN().B) {
         this.dN().a(this, this.ds(), this.du(), this.dy(), 1.0F, false, csa.a.c);
         this.am();
      }
   }

   @Override
   public boolean bt() {
      return false;
   }

   @Override
   public boolean a(bjo $$0, float $$1) {
      return false;
   }

   @Override
   protected void b_() {
      this.an.a(e, false);
   }

   @Override
   public boolean x() {
      return this.an.b(e);
   }

   public void a(boolean $$0) {
      this.an.b(e, $$0);
   }

   @Override
   protected boolean af_() {
      return false;
   }

   @Override
   public void b(rz $$0) {
      super.b($$0);
      $$0.a("dangerous", this.x());
   }

   @Override
   public void a(rz $$0) {
      super.a($$0);
      this.a($$0.q("dangerous"));
   }
}
