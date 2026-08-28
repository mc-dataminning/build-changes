import javax.annotation.Nullable;

public class cju extends cjs implements bwx<ckb> {
   private static final aks<Integer> bZ = akw.a(cju.class, aku.b);
   private static final bve ca = bvi.am.n().a(bvd.a().a(bvc.a, 0.0F, bvi.am.m() + 0.125F, 0.0F)).a(0.5F);

   public cju(bvi<? extends cju> $$0, dgz $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(bac $$0) {
      this.g(bxf.s).a((double)a($$0::a));
      this.g(bxf.v).a(b($$0::j));
      this.g(bxf.o).a(a($$0::j));
   }

   @Override
   protected void a(akw.a $$0) {
      super.a($$0);
      $$0.a(bZ, 0);
   }

   @Override
   public void b(um $$0) {
      super.b($$0);
      $$0.a("Variant", this.x());
   }

   @Override
   public void a(um $$0) {
      super.a($$0);
      this.w($$0.h("Variant"));
   }

   private void w(int $$0) {
      this.al.a(bZ, $$0);
   }

   private int x() {
      return this.al.a(bZ);
   }

   private void a(ckb $$0, cjw $$1) {
      this.w($$0.a() & 0xFF | $$1.a() << 8 & 0xFF00);
   }

   public ckb p() {
      return ckb.a(this.x() & 0xFF);
   }

   public void a(ckb $$0) {
      this.w($$0.a() & 0xFF | this.x() & -256);
   }

   public cjw t() {
      return cjw.a((this.x() & 0xFF00) >> 8);
   }

   @Override
   protected void a(drv $$0) {
      super.a($$0);
      if (this.ae.a(10) == 0) {
         this.a(awv.nh, $$0.a() * 0.6F, $$0.b());
      }
   }

   @Override
   protected awu u() {
      return awv.ne;
   }

   @Override
   protected awu o_() {
      return awv.ni;
   }

   @Nullable
   @Override
   protected awu gq() {
      return awv.nj;
   }

   @Override
   protected awu e(btr $$0) {
      return awv.nl;
   }

   @Override
   protected awu gP() {
      return awv.nf;
   }

   @Override
   public bta b(cpo $$0, bsz $$1) {
      boolean $$2 = !this.e_() && this.gF() && $$0.fY();
      if (!this.ca() && !$$2) {
         cxg $$3 = $$0.b($$1);
         if (!$$3.f()) {
            if (this.j($$3)) {
               return this.c($$0, $$3);
            }

            if (!this.gF()) {
               this.gV();
               return bta.a;
            }
         }

         return super.b($$0, $$1);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public boolean a(cho $$0) {
      if ($$0 == this) {
         return false;
      } else {
         return !($$0 instanceof cjt) && !($$0 instanceof cju) ? false : this.gX() && ((cjs)$$0).gX();
      }
   }

   @Nullable
   @Override
   public bus a(arx $$0, bus $$1) {
      if ($$1 instanceof cjt) {
         cjx $$2 = bvi.aG.a($$0, bvh.e);
         if ($$2 != null) {
            this.a($$1, $$2);
         }

         return $$2;
      } else {
         cju $$3 = (cju)$$1;
         cju $$4 = bvi.am.a($$0, bvh.e);
         if ($$4 != null) {
            int $$5 = this.ae.a(9);
            ckb $$6;
            if ($$5 < 4) {
               $$6 = this.p();
            } else if ($$5 < 8) {
               $$6 = $$3.p();
            } else {
               $$6 = ae.a(ckb.values(), this.ae);
            }

            int $$9 = this.ae.a(5);
            cjw $$10;
            if ($$9 < 2) {
               $$10 = this.t();
            } else if ($$9 < 4) {
               $$10 = $$3.t();
            } else {
               $$10 = ae.a(cjw.values(), this.ae);
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
   protected void c(btr $$0, float $$1) {
      this.a($$0, $$1, new bvj[]{bvj.g});
   }

   @Nullable
   @Override
   public bwq a(dhq $$0, bsy $$1, bvh $$2, @Nullable bwq $$3) {
      bac $$4 = $$0.H_();
      ckb $$5;
      if ($$3 instanceof cju.a) {
         $$5 = ((cju.a)$$3).a;
      } else {
         $$5 = ae.a(ckb.values(), $$4);
         $$3 = new cju.a($$5);
      }

      this.a($$5, ae.a(cjw.values(), $$4));
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public bve e(bwj $$0) {
      return this.e_() ? ca : super.e($$0);
   }

   public static class a extends bus.a {
      public final ckb a;

      public a(ckb $$0) {
         super(true);
         this.a = $$0;
      }
   }
}
