public class crp extends cqq {
   private static final akg<Boolean> d = akk.a(crp.class, aki.k);

   public crp(bwb<? extends crp> $$0, dhp $$1) {
      super($$0, $$1);
   }

   public crp(dhp $$0, bwr $$1, fcu $$2) {
      super(bwb.bK, $$1, $$2, $$0);
   }

   @Override
   protected float m() {
      return this.o() ? 0.73F : super.m();
   }

   @Override
   public boolean bY() {
      return false;
   }

   @Override
   public float a(dhi $$0, dgv $$1, jj $$2, dym $$3, eut $$4, float $$5) {
      return this.o() && cma.c($$3) ? Math.min(0.8F, $$5) : $$5;
   }

   @Override
   protected void a(fcr $$0) {
      super.a($$0);
      if (this.dV() instanceof arn $$1) {
         bvs var8 = $$0.a();
         boolean $$7;
         if (this.q() instanceof bwr $$5) {
            buh $$6 = this.dW().a(this, $$5);
            $$7 = var8.a($$1, $$6, 8.0F);
            if ($$7) {
               if (var8.bK()) {
                  dej.a($$1, var8, $$6);
               } else {
                  $$5.c(5.0F);
               }
            }
         } else {
            $$7 = var8.a($$1, this.dW().q(), 5.0F);
         }

         if ($$7 && var8 instanceof bwr $$9) {
            int $$10 = 0;
            if (this.dV().an() == btn.c) {
               $$10 = 10;
            } else if (this.dV().an() == btn.d) {
               $$10 = 40;
            }

            if ($$10 > 0) {
               $$9.b(new buw(buy.t, 20 * $$10, 1), this.z());
            }
         }
      }
   }

   @Override
   protected void a(fcs $$0) {
      super.a($$0);
      if (!this.dV().C) {
         this.dV().a(this, this.dA(), this.dC(), this.dG(), 1.0F, false, dhp.a.c);
         this.at();
      }
   }

   @Override
   protected void a(akk.a $$0) {
      $$0.a(d, false);
   }

   public boolean o() {
      return this.al.a(d);
   }

   public void a(boolean $$0) {
      this.al.a(d, $$0);
   }

   @Override
   protected boolean g() {
      return false;
   }

   @Override
   public void b(tw $$0) {
      super.b($$0);
      $$0.a("dangerous", this.o());
   }

   @Override
   public void a(tw $$0) {
      super.a($$0);
      this.a($$0.q("dangerous"));
   }
}
