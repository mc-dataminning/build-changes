import javax.annotation.Nullable;

public class ckc extends cka implements bxf<ckj> {
   private static final alc<Integer> bZ = alg.a(ckc.class, ale.b);
   private static final bvm ca = bvq.am.n().a(bvl.a().a(bvk.a, 0.0F, bvq.am.m() + 0.125F, 0.0F)).a(0.5F);

   public ckc(bvq<? extends ckc> $$0, dhh $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(bam $$0) {
      this.g(bxn.s).a((double)a($$0::a));
      this.g(bxn.v).a(b($$0::j));
      this.g(bxn.o).a(a($$0::j));
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

   private void a(ckj $$0, cke $$1) {
      this.w($$0.a() & 0xFF | $$1.a() << 8 & 0xFF00);
   }

   public ckj p() {
      return ckj.a(this.x() & 0xFF);
   }

   public void a(ckj $$0) {
      this.w($$0.a() & 0xFF | this.x() & -256);
   }

   public cke t() {
      return cke.a((this.x() & 0xFF00) >> 8);
   }

   @Override
   protected void a(dsb $$0) {
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
   protected axe go() {
      return axf.nd;
   }

   @Override
   protected axe e(btz $$0) {
      return axf.nf;
   }

   @Override
   protected axe gN() {
      return axf.mZ;
   }

   @Override
   public bti b(cpw $$0, bth $$1) {
      boolean $$2 = !this.e_() && this.gD() && $$0.fW();
      if (!this.ca() && !$$2) {
         cxo $$3 = $$0.b($$1);
         if (!$$3.f()) {
            if (this.j($$3)) {
               return this.c($$0, $$3);
            }

            if (!this.gD()) {
               this.gT();
               return bti.a;
            }
         }

         return super.b($$0, $$1);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public boolean a(chw $$0) {
      if ($$0 == this) {
         return false;
      } else {
         return !($$0 instanceof ckb) && !($$0 instanceof ckc) ? false : this.gV() && ((cka)$$0).gV();
      }
   }

   @Nullable
   @Override
   public bva a(ash $$0, bva $$1) {
      if ($$1 instanceof ckb) {
         ckf $$2 = bvq.aG.a($$0, bvp.e);
         if ($$2 != null) {
            this.a($$1, $$2);
         }

         return $$2;
      } else {
         ckc $$3 = (ckc)$$1;
         ckc $$4 = bvq.am.a($$0, bvp.e);
         if ($$4 != null) {
            int $$5 = this.ae.a(9);
            ckj $$6;
            if ($$5 < 4) {
               $$6 = this.p();
            } else if ($$5 < 8) {
               $$6 = $$3.p();
            } else {
               $$6 = ae.a(ckj.values(), this.ae);
            }

            int $$9 = this.ae.a(5);
            cke $$10;
            if ($$9 < 2) {
               $$10 = this.t();
            } else if ($$9 < 4) {
               $$10 = $$3.t();
            } else {
               $$10 = ae.a(cke.values(), this.ae);
            }

            $$4.a($$6, $$10);
            this.a($$1, $$4);
         }

         return $$4;
      }
   }

   @Override
   public boolean e(bvr $$0) {
      return true;
   }

   @Override
   protected void c(btz $$0, float $$1) {
      this.a($$0, $$1, new bvr[]{bvr.g});
   }

   @Nullable
   @Override
   public bwy a(dhy $$0, btg $$1, bvp $$2, @Nullable bwy $$3) {
      bam $$4 = $$0.H_();
      ckj $$5;
      if ($$3 instanceof ckc.a) {
         $$5 = ((ckc.a)$$3).a;
      } else {
         $$5 = ae.a(ckj.values(), $$4);
         $$3 = new ckc.a($$5);
      }

      this.a($$5, ae.a(cke.values(), $$4));
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public bvm e(bwr $$0) {
      return this.e_() ? ca : super.e($$0);
   }

   public static class a extends bva.a {
      public final ckj a;

      public a(ckj $$0) {
         super(true);
         this.a = $$0;
      }
   }
}
