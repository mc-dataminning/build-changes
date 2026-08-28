import javax.annotation.Nullable;

public class cjy extends cjw implements bwy<ckf> {
   private static final ajx<Integer> bF = akb.a(cjy.class, ajz.b);
   private static final bvd bG = bvi.al.n().a(bvc.a().a(bvb.a, 0.0F, bvi.al.m() + 0.125F, 0.0F)).a(0.5F);

   public cjy(bvi<? extends cjy> $$0, dgz $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(azh $$0) {
      this.g(bxg.s).a((double)a($$0::a));
      this.g(bxg.v).a(b($$0::j));
      this.g(bxg.o).a(a($$0::j));
   }

   @Override
   protected void a(akb.a $$0) {
      super.a($$0);
      $$0.a(bF, 0);
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      $$0.a("Variant", this.x());
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      this.w($$0.h("Variant"));
   }

   private void w(int $$0) {
      this.al.a(bF, $$0);
   }

   private int x() {
      return this.al.a(bF);
   }

   private void a(ckf $$0, cka $$1) {
      this.w($$0.a() & 0xFF | $$1.a() << 8 & 0xFF00);
   }

   public ckf q() {
      return ckf.a(this.x() & 0xFF);
   }

   public void a(ckf $$0) {
      this.w($$0.a() & 0xFF | this.x() & -256);
   }

   public cka t() {
      return cka.a((this.x() & 0xFF00) >> 8);
   }

   @Override
   protected void a(drx $$0) {
      super.a($$0);
      if (this.ae.a(10) == 0) {
         this.a(awa.nh, $$0.a() * 0.6F, $$0.b());
      }
   }

   @Override
   protected avz u() {
      return awa.ne;
   }

   @Override
   protected avz l_() {
      return awa.ni;
   }

   @Nullable
   @Override
   protected avz gu() {
      return awa.nj;
   }

   @Override
   protected avz e(btp $$0) {
      return awa.nl;
   }

   @Override
   protected avz gT() {
      return awa.nf;
   }

   @Override
   public bsy b(cpr $$0, bsx $$1) {
      boolean $$2 = !this.n_() && this.gJ() && $$0.ga();
      if (!this.bZ() && !$$2) {
         cxh $$3 = $$0.b($$1);
         if (!$$3.f()) {
            if (this.j($$3)) {
               return this.c($$0, $$3);
            }

            if (!this.gJ()) {
               this.gZ();
               return bsy.a;
            }
         }

         return super.b($$0, $$1);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public boolean a(chp $$0) {
      if ($$0 == this) {
         return false;
      } else {
         return !($$0 instanceof cjx) && !($$0 instanceof cjy) ? false : this.hb() && ((cjw)$$0).hb();
      }
   }

   @Nullable
   @Override
   public buq a(ard $$0, buq $$1) {
      if ($$1 instanceof cjx) {
         ckb $$2 = bvi.aF.a($$0, bvh.e);
         if ($$2 != null) {
            this.a($$1, $$2);
         }

         return $$2;
      } else {
         cjy $$3 = (cjy)$$1;
         cjy $$4 = bvi.al.a($$0, bvh.e);
         if ($$4 != null) {
            int $$5 = this.ae.a(9);
            ckf $$6;
            if ($$5 < 4) {
               $$6 = this.q();
            } else if ($$5 < 8) {
               $$6 = $$3.q();
            } else {
               $$6 = af.a(ckf.values(), this.ae);
            }

            int $$9 = this.ae.a(5);
            cka $$10;
            if ($$9 < 2) {
               $$10 = this.t();
            } else if ($$9 < 4) {
               $$10 = $$3.t();
            } else {
               $$10 = af.a(cka.values(), this.ae);
            }

            $$4.a($$6, $$10);
            this.a($$1, $$4);
         }

         return $$4;
      }
   }

   @Override
   public boolean e(bvj $$0) {
      return true;
   }

   @Override
   protected void c(btp $$0, float $$1) {
      this.a($$0, $$1, new bvj[]{bvj.g});
   }

   @Nullable
   @Override
   public bwr a(dhq $$0, bsw $$1, bvh $$2, @Nullable bwr $$3) {
      azh $$4 = $$0.C_();
      ckf $$5;
      if ($$3 instanceof cjy.a) {
         $$5 = ((cjy.a)$$3).a;
      } else {
         $$5 = af.a(ckf.values(), $$4);
         $$3 = new cjy.a($$5);
      }

      this.a($$5, af.a(cka.values(), $$4));
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public bvd e(bwk $$0) {
      return this.n_() ? bG : super.e($$0);
   }

   public static class a extends buq.a {
      public final ckf a;

      public a(ckf $$0) {
         super(true);
         this.a = $$0;
      }
   }
}
