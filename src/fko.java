public class fko<T extends byh> extends fkz<T> {
   private float j;
   private float k;
   private float l;

   public fko(fmp $$0) {
      super($$0, true, 23.0F, 4.8F, 2.7F, 3.0F, 49);
   }

   public static fmv c() {
      fmx $$0 = new fmx();
      fmy $$1 = $$0.a();
      $$1.a(
         "head",
         fmu.c()
            .a(0, 6)
            .a(-6.5F, -5.0F, -4.0F, 13.0F, 10.0F, 9.0F)
            .a(45, 16)
            .a("nose", -3.5F, 0.0F, -6.0F, 7.0F, 5.0F, 2.0F)
            .a(52, 25)
            .a("left_ear", 3.5F, -8.0F, -1.0F, 5.0F, 4.0F, 1.0F)
            .a(52, 25)
            .a("right_ear", -8.5F, -8.0F, -1.0F, 5.0F, 4.0F, 1.0F),
         fmr.a(0.0F, 11.5F, -17.0F)
      );
      $$1.a("body", fmu.c().a(0, 25).a(-9.5F, -13.0F, -6.5F, 19.0F, 26.0F, 13.0F), fmr.a(0.0F, 10.0F, 0.0F, (float) (Math.PI / 2), 0.0F, 0.0F));
      int $$2 = 9;
      int $$3 = 6;
      fmu $$4 = fmu.c().a(40, 0).a(-3.0F, 0.0F, -3.0F, 6.0F, 9.0F, 6.0F);
      $$1.a("right_hind_leg", $$4, fmr.a(-5.5F, 15.0F, 9.0F));
      $$1.a("left_hind_leg", $$4, fmr.a(5.5F, 15.0F, 9.0F));
      $$1.a("right_front_leg", $$4, fmr.a(-5.5F, 15.0F, -9.0F));
      $$1.a("left_front_leg", $$4, fmr.a(5.5F, 15.0F, -9.0F));
      return fmv.a($$0, 64, 64);
   }

   public void a(T $$0, float $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.j = $$0.E($$3);
      this.k = $$0.F($$3);
      this.l = $$0.o_() ? 0.0F : $$0.G($$3);
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      boolean $$6 = $$0.u() > 0;
      boolean $$7 = $$0.w();
      int $$8 = $$0.gl();
      boolean $$9 = $$0.gk();
      boolean $$10 = $$0.gw();
      if ($$6) {
         this.a.f = 0.35F * aui.a(0.6F * $$3);
         this.a.g = 0.35F * aui.a(0.6F * $$3);
         this.h.e = -0.75F * aui.a(0.3F * $$3);
         this.i.e = 0.75F * aui.a(0.3F * $$3);
      } else {
         this.a.g = 0.0F;
      }

      if ($$7) {
         if ($$8 < 15) {
            this.a.e = (float) (-Math.PI / 4) * (float)$$8 / 14.0F;
         } else if ($$8 < 20) {
            float $$11 = (float)(($$8 - 15) / 5);
            this.a.e = (float) (-Math.PI / 4) + (float) (Math.PI / 4) * $$11;
         }
      }

      if (this.j > 0.0F) {
         this.b.e = fkm.a(this.b.e, 1.7407963F, this.j);
         this.a.e = fkm.a(this.a.e, (float) (Math.PI / 2), this.j);
         this.h.g = -0.27079642F;
         this.i.g = 0.27079642F;
         this.f.g = 0.5707964F;
         this.g.g = -0.5707964F;
         if ($$9) {
            this.a.e = (float) (Math.PI / 2) + 0.2F * aui.a($$3 * 0.6F);
            this.h.e = -0.4F - 0.2F * aui.a($$3 * 0.6F);
            this.i.e = -0.4F - 0.2F * aui.a($$3 * 0.6F);
         }

         if ($$10) {
            this.a.e = 2.1707964F;
            this.h.e = -0.9F;
            this.i.e = -0.9F;
         }
      } else {
         this.f.g = 0.0F;
         this.g.g = 0.0F;
         this.h.g = 0.0F;
         this.i.g = 0.0F;
      }

      if (this.k > 0.0F) {
         this.f.e = -0.6F * aui.a($$3 * 0.15F);
         this.g.e = 0.6F * aui.a($$3 * 0.15F);
         this.h.e = 0.3F * aui.a($$3 * 0.25F);
         this.i.e = -0.3F * aui.a($$3 * 0.25F);
         this.a.e = fkm.a(this.a.e, (float) (Math.PI / 2), this.k);
      }

      if (this.l > 0.0F) {
         this.a.e = fkm.a(this.a.e, 2.0561945F, this.l);
         this.f.e = -0.5F * aui.a($$3 * 0.5F);
         this.g.e = 0.5F * aui.a($$3 * 0.5F);
         this.h.e = 0.5F * aui.a($$3 * 0.5F);
         this.i.e = -0.5F * aui.a($$3 * 0.5F);
      }
   }
}
