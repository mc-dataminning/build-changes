import javax.annotation.Nullable;

public class ckd extends ckb implements bxg<ckk> {
   private static final alc<Integer> bZ = alg.a(ckd.class, ale.b);
   private static final bvn ca = bvr.am.n().a(bvm.a().a(bvl.a, 0.0F, bvr.am.m() + 0.125F, 0.0F)).a(0.5F);

   public ckd(bvr<? extends ckd> $$0, dhi $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(bam $$0) {
      this.g(bxo.s).a((double)a($$0::a));
      this.g(bxo.v).a(b($$0::j));
      this.g(bxo.o).a(a($$0::j));
   }

   @Override
   protected void a(alg.a $$0) {
      super.a($$0);
      $$0.a(bZ, 0);
   }

   @Override
   public void b(ux $$0) {
      super.b($$0);
      $$0.a("Variant", this.x());
   }

   @Override
   public void a(ux $$0) {
      super.a($$0);
      this.w($$0.h("Variant"));
   }

   private void w(int $$0) {
      this.al.a(bZ, $$0);
   }

   private int x() {
      return this.al.a(bZ);
   }

   private void a(ckk $$0, ckf $$1) {
      this.w($$0.a() & 0xFF | $$1.a() << 8 & 0xFF00);
   }

   public ckk p() {
      return ckk.a(this.x() & 0xFF);
   }

   public void a(ckk $$0) {
      this.w($$0.a() & 0xFF | this.x() & -256);
   }

   public ckf t() {
      return ckf.a((this.x() & 0xFF00) >> 8);
   }

   @Override
   protected void a(dsc $$0) {
      super.a($$0);
      if (this.ae.a(10) == 0) {
         this.a(axf.nb, $$0.a() * 0.6F, $$0.b());
      }
   }

   @Override
   protected axe u() {
      return axf.mY;
   }

   @Override
   protected axe o_() {
      return axf.nc;
   }

   @Nullable
   @Override
   protected axe gq() {
      return axf.nd;
   }

   @Override
   protected axe e(bua $$0) {
      return axf.nf;
   }

   @Override
   protected axe gP() {
      return axf.mZ;
   }

   @Override
   public btj b(cpx $$0, bti $$1) {
      boolean $$2 = !this.e_() && this.gF() && $$0.fY();
      if (!this.ca() && !$$2) {
         cxp $$3 = $$0.b($$1);
         if (!$$3.f()) {
            if (this.j($$3)) {
               return this.c($$0, $$3);
            }

            if (!this.gF()) {
               this.gV();
               return btj.a;
            }
         }

         return super.b($$0, $$1);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public boolean a(chx $$0) {
      if ($$0 == this) {
         return false;
      } else {
         return !($$0 instanceof ckc) && !($$0 instanceof ckd) ? false : this.gX() && ((ckb)$$0).gX();
      }
   }

   @Nullable
   @Override
   public bvb a(ash $$0, bvb $$1) {
      if ($$1 instanceof ckc) {
         ckg $$2 = bvr.aG.a($$0, bvq.e);
         if ($$2 != null) {
            this.a($$1, $$2);
         }

         return $$2;
      } else {
         ckd $$3 = (ckd)$$1;
         ckd $$4 = bvr.am.a($$0, bvq.e);
         if ($$4 != null) {
            int $$5 = this.ae.a(9);
            ckk $$6;
            if ($$5 < 4) {
               $$6 = this.p();
            } else if ($$5 < 8) {
               $$6 = $$3.p();
            } else {
               $$6 = ae.a(ckk.values(), this.ae);
            }

            int $$9 = this.ae.a(5);
            ckf $$10;
            if ($$9 < 2) {
               $$10 = this.t();
            } else if ($$9 < 4) {
               $$10 = $$3.t();
            } else {
               $$10 = ae.a(ckf.values(), this.ae);
            }

            $$4.a($$6, $$10);
            this.a($$1, $$4);
         }

         return $$4;
      }
   }

   @Override
   public boolean e(bvs $$0) {
      return true;
   }

   @Override
   protected void c(bua $$0, float $$1) {
      this.a($$0, $$1, new bvs[]{bvs.g});
   }

   @Nullable
   @Override
   public bwz a(dhz $$0, bth $$1, bvq $$2, @Nullable bwz $$3) {
      bam $$4 = $$0.H_();
      ckk $$5;
      if ($$3 instanceof ckd.a) {
         $$5 = ((ckd.a)$$3).a;
      } else {
         $$5 = ae.a(ckk.values(), $$4);
         $$3 = new ckd.a($$5);
      }

      this.a($$5, ae.a(ckf.values(), $$4));
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public bvn e(bws $$0) {
      return this.e_() ? ca : super.e($$0);
   }

   public static class a extends bvb.a {
      public final ckk a;

      public a(ckk $$0) {
         super(true);
         this.a = $$0;
      }
   }
}
