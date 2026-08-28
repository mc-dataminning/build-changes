import javax.annotation.Nullable;

public class cjy extends cjw implements bxb<ckf> {
   private static final alc<Integer> bZ = alg.a(cjy.class, ale.b);
   private static final bvi ca = bvm.am.n().a(bvh.a().a(bvg.a, 0.0F, bvm.am.m() + 0.125F, 0.0F)).a(0.5F);

   public cjy(bvm<? extends cjy> $$0, dha $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(bam $$0) {
      this.g(bxj.s).a((double)a($$0::a));
      this.g(bxj.v).a(b($$0::j));
      this.g(bxj.o).a(a($$0::j));
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

   private void a(ckf $$0, cka $$1) {
      this.w($$0.a() & 0xFF | $$1.a() << 8 & 0xFF00);
   }

   public ckf p() {
      return ckf.a(this.x() & 0xFF);
   }

   public void a(ckf $$0) {
      this.w($$0.a() & 0xFF | this.x() & -256);
   }

   public cka t() {
      return cka.a((this.x() & 0xFF00) >> 8);
   }

   @Override
   protected void a(dru $$0) {
      super.a($$0);
      if (this.ae.a(10) == 0) {
         this.a(axf.na, $$0.a() * 0.6F, $$0.b());
      }
   }

   @Override
   protected axe u() {
      return axf.mX;
   }

   @Override
   protected axe o_() {
      return axf.nb;
   }

   @Nullable
   @Override
   protected axe go() {
      return axf.nc;
   }

   @Override
   protected axe e(btv $$0) {
      return axf.ne;
   }

   @Override
   protected axe gN() {
      return axf.mY;
   }

   @Override
   public bte b(cps $$0, btd $$1) {
      boolean $$2 = !this.e_() && this.gD() && $$0.fW();
      if (!this.ca() && !$$2) {
         cxk $$3 = $$0.b($$1);
         if (!$$3.f()) {
            if (this.j($$3)) {
               return this.c($$0, $$3);
            }

            if (!this.gD()) {
               this.gT();
               return bte.a;
            }
         }

         return super.b($$0, $$1);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public boolean a(chs $$0) {
      if ($$0 == this) {
         return false;
      } else {
         return !($$0 instanceof cjx) && !($$0 instanceof cjy) ? false : this.gV() && ((cjw)$$0).gV();
      }
   }

   @Nullable
   @Override
   public buw a(ash $$0, buw $$1) {
      if ($$1 instanceof cjx) {
         ckb $$2 = bvm.aG.a($$0, bvl.e);
         if ($$2 != null) {
            this.a($$1, $$2);
         }

         return $$2;
      } else {
         cjy $$3 = (cjy)$$1;
         cjy $$4 = bvm.am.a($$0, bvl.e);
         if ($$4 != null) {
            int $$5 = this.ae.a(9);
            ckf $$6;
            if ($$5 < 4) {
               $$6 = this.p();
            } else if ($$5 < 8) {
               $$6 = $$3.p();
            } else {
               $$6 = ae.a(ckf.values(), this.ae);
            }

            int $$9 = this.ae.a(5);
            cka $$10;
            if ($$9 < 2) {
               $$10 = this.t();
            } else if ($$9 < 4) {
               $$10 = $$3.t();
            } else {
               $$10 = ae.a(cka.values(), this.ae);
            }

            $$4.a($$6, $$10);
            this.a($$1, $$4);
         }

         return $$4;
      }
   }

   @Override
   public boolean e(bvn $$0) {
      return true;
   }

   @Override
   protected void c(btv $$0, float $$1) {
      this.a($$0, $$1, new bvn[]{bvn.g});
   }

   @Nullable
   @Override
   public bwu a(dhr $$0, btc $$1, bvl $$2, @Nullable bwu $$3) {
      bam $$4 = $$0.H_();
      ckf $$5;
      if ($$3 instanceof cjy.a) {
         $$5 = ((cjy.a)$$3).a;
      } else {
         $$5 = ae.a(ckf.values(), $$4);
         $$3 = new cjy.a($$5);
      }

      this.a($$5, ae.a(cka.values(), $$4));
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public bvi e(bwn $$0) {
      return this.e_() ? ca : super.e($$0);
   }

   public static class a extends buw.a {
      public final ckf a;

      public a(ckf $$0) {
         super(true);
         this.a = $$0;
      }
   }
}
