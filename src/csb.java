public class csb extends cra {
   private static final akh<Boolean> d = akl.a(csb.class, akj.k);

   public csb(bwj<? extends csb> $$0, dip $$1) {
      super($$0, $$1);
   }

   public csb(dip $$0, bwz $$1, fdw $$2) {
      super(bwj.bL, $$1, $$2, $$0);
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
   public float a(dii $$0, dhv $$1, iu $$2, dzo $$3, evv $$4, float $$5) {
      return this.o() && cmk.c($$3) ? Math.min(0.8F, $$5) : $$5;
   }

   @Override
   protected void a(fdt $$0) {
      super.a($$0);
      if (this.dV() instanceof aro $$1) {
         bwa var8 = $$0.a();
         boolean $$7;
         if (this.q() instanceof bwz $$5) {
            bup $$6 = this.dW().a(this, $$5);
            $$7 = var8.a($$1, $$6, 8.0F);
            if ($$7) {
               if (var8.bK()) {
                  dfh.a($$1, var8, $$6);
               } else {
                  $$5.c(5.0F);
               }
            }
         } else {
            $$7 = var8.a($$1, this.dW().q(), 5.0F);
         }

         if ($$7 && var8 instanceof bwz $$9) {
            int $$10 = 0;
            if (this.dV().an() == btv.c) {
               $$10 = 10;
            } else if (this.dV().an() == btv.d) {
               $$10 = 40;
            }

            if ($$10 > 0) {
               $$9.b(new bve(bvg.t, 20 * $$10, 1), this.z());
            }
         }
      }
   }

   @Override
   protected void a(fdu $$0) {
      super.a($$0);
      if (!this.dV().C) {
         this.dV().a(this, this.dA(), this.dC(), this.dG(), 1.0F, false, dip.a.c);
         this.at();
      }
   }

   @Override
   protected void a(akl.a $$0) {
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
   public void b(tx $$0) {
      super.b($$0);
      $$0.a("dangerous", this.o());
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      this.a($$0.q("dangerous"));
   }
}
