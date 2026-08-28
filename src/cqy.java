public class cqy extends cpz {
   private static final ajx<Boolean> d = akb.a(cqy.class, ajz.k);

   public cqy(bvi<? extends cqy> $$0, dgz $$1) {
      super($$0, $$1);
   }

   public cqy(dgz $$0, bvy $$1, fbx $$2) {
      super(bvi.bK, $$1, $$2, $$0);
   }

   @Override
   protected float m() {
      return this.o() ? 0.73F : super.m();
   }

   @Override
   public boolean bX() {
      return false;
   }

   @Override
   public float a(dgs $$0, dgf $$1, ji $$2, dxq $$3, etw $$4, float $$5) {
      return this.o() && clj.c($$3) ? Math.min(0.8F, $$5) : $$5;
   }

   @Override
   protected void a(fbu $$0) {
      super.a($$0);
      if (this.dU() instanceof ard $$1) {
         bva var8 = $$0.a();
         boolean $$7;
         if (this.q() instanceof bvy $$5) {
            btp $$6 = this.dV().a(this, $$5);
            $$7 = var8.a($$1, $$6, 8.0F);
            if ($$7) {
               if (var8.bJ()) {
                  ddt.a($$1, var8, $$6);
               } else {
                  $$5.c(5.0F);
               }
            }
         } else {
            $$7 = var8.a($$1, this.dV().q(), 5.0F);
         }

         if ($$7 && var8 instanceof bvy $$9) {
            int $$10 = 0;
            if (this.dU().an() == bsv.c) {
               $$10 = 10;
            } else if (this.dU().an() == bsv.d) {
               $$10 = 40;
            }

            if ($$10 > 0) {
               $$9.b(new bue(bug.t, 20 * $$10, 1), this.z());
            }
         }
      }
   }

   @Override
   protected void a(fbv $$0) {
      super.a($$0);
      if (!this.dU().C) {
         this.dU().a(this, this.dz(), this.dB(), this.dF(), 1.0F, false, dgz.a.c);
         this.at();
      }
   }

   @Override
   protected void a(akb.a $$0) {
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
   public void b(tq $$0) {
      super.b($$0);
      $$0.a("dangerous", this.o());
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      this.a($$0.q("dangerous"));
   }
}
