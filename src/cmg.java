import javax.annotation.Nullable;

public class cmg extends cme {
   private static final aku<Integer> bI = aky.a(cmg.class, akw.b);
   private static final bxh bJ = bxn.am.n().a(bxg.a().a(bxf.a, 0.0F, bxn.am.m() + 0.125F, 0.0F)).a(0.5F);
   private static final int bK = 0;

   public cmg(bxn<? extends cmg> $$0, dkj $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(bai $$0) {
      this.g(bzl.s).a((double)a($$0::a));
      this.g(bzl.v).a(b($$0::j));
      this.g(bzl.o).a(a($$0::j));
   }

   @Override
   protected void a(aky.a $$0) {
      super.a($$0);
      $$0.a(bI, 0);
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("Variant", this.u());
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      this.w($$0.b("Variant", 0));
   }

   private void w(int $$0) {
      this.al.a(bI, $$0);
   }

   private int u() {
      return this.al.a(bI);
   }

   private void a(cmn $$0, cmi $$1) {
      this.w($$0.a() & 0xFF | $$1.a() << 8 & 0xFF00);
   }

   public cmn m() {
      return cmn.a(this.u() & 0xFF);
   }

   private void a(cmn $$0) {
      this.w($$0.a() & 0xFF | this.u() & -256);
   }

   @Nullable
   @Override
   public <T> T a(kk<? extends T> $$0) {
      return $$0 == kl.aL ? c((kk<T>)$$0, this.m()) : super.a($$0);
   }

   @Override
   protected void a(kg $$0) {
      this.a($$0, kl.aL);
      super.a($$0);
   }

   @Override
   protected <T> boolean b(kk<T> $$0, T $$1) {
      if ($$0 == kl.aL) {
         this.a(c(kl.aL, $$1));
         return true;
      } else {
         return super.b($$0, $$1);
      }
   }

   public cmi p() {
      return cmi.a((this.u() & 0xFF00) >> 8);
   }

   @Override
   protected void a(dvl $$0) {
      super.a($$0);
      if (this.ae.a(10) == 0) {
         this.a(awy.nl, $$0.a() * 0.6F, $$0.b());
      }
   }

   @Override
   protected awx s() {
      return awy.ni;
   }

   @Override
   protected awx j_() {
      return awy.nm;
   }

   @Nullable
   @Override
   protected awx gw() {
      return awy.nn;
   }

   @Override
   protected awx e(bvt $$0) {
      return awy.np;
   }

   @Override
   protected awx gU() {
      return awy.nj;
   }

   @Override
   public bvc b(csi $$0, bvb $$1) {
      boolean $$2 = !this.e_() && this.gL() && $$0.fY();
      if (!this.bZ() && !$$2) {
         dak $$3 = $$0.b($$1);
         if (!$$3.f()) {
            if (this.i($$3)) {
               return this.c($$0, $$3);
            }

            if (!this.gL()) {
               this.ha();
               return bvc.a;
            }
         }

         return super.b($$0, $$1);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public boolean a(cjv $$0) {
      if ($$0 == this) {
         return false;
      } else {
         return !($$0 instanceof cmf) && !($$0 instanceof cmg) ? false : this.hc() && ((cme)$$0).hc();
      }
   }

   @Nullable
   @Override
   public bwu a(asb $$0, bwu $$1) {
      if ($$1 instanceof cmf) {
         cmj $$2 = bxn.aG.a($$0, bxm.e);
         if ($$2 != null) {
            this.a($$1, $$2);
         }

         return $$2;
      } else {
         cmg $$3 = (cmg)$$1;
         cmg $$4 = bxn.am.a($$0, bxm.e);
         if ($$4 != null) {
            int $$5 = this.ae.a(9);
            cmn $$6;
            if ($$5 < 4) {
               $$6 = this.m();
            } else if ($$5 < 8) {
               $$6 = $$3.m();
            } else {
               $$6 = ag.a(cmn.values(), this.ae);
            }

            int $$9 = this.ae.a(5);
            cmi $$10;
            if ($$9 < 2) {
               $$10 = this.p();
            } else if ($$9 < 4) {
               $$10 = $$3.p();
            } else {
               $$10 = ag.a(cmi.values(), this.ae);
            }

            $$4.a($$6, $$10);
            this.a($$1, $$4);
         }

         return $$4;
      }
   }

   @Override
   public boolean e(bxo $$0) {
      return true;
   }

   @Override
   protected void c(bvt $$0, float $$1) {
      this.a($$0, $$1, new bxo[]{bxo.g});
   }

   @Nullable
   @Override
   public byx a(dla $$0, bva $$1, bxm $$2, @Nullable byx $$3) {
      bai $$4 = $$0.G_();
      cmn $$5;
      if ($$3 instanceof cmg.a) {
         $$5 = ((cmg.a)$$3).a;
      } else {
         $$5 = ag.a(cmn.values(), $$4);
         $$3 = new cmg.a($$5);
      }

      this.a($$5, ag.a(cmi.values(), $$4));
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public bxh e(byr $$0) {
      return this.e_() ? bJ : super.e($$0);
   }

   public static class a extends bwu.a {
      public final cmn a;

      public a(cmn $$0) {
         super(true);
         this.a = $$0;
      }
   }
}
