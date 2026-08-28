import javax.annotation.Nullable;

public class clx extends clv {
   private static final akn<Integer> bI = akr.a(clx.class, akp.b);
   private static final bwy bJ = bxe.am.n().a(bwx.a().a(bww.a, 0.0F, bxe.am.m() + 0.125F, 0.0F)).a(0.5F);
   private static final int bK = 0;

   public clx(bxe<? extends clx> $$0, djz $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(azz $$0) {
      this.g(bzc.s).a((double)a($$0::a));
      this.g(bzc.v).a(b($$0::j));
      this.g(bzc.o).a(a($$0::j));
   }

   @Override
   protected void a(akr.a $$0) {
      super.a($$0);
      $$0.a(bI, 0);
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("Variant", this.x());
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      this.w($$0.b("Variant", 0));
   }

   private void w(int $$0) {
      this.al.a(bI, $$0);
   }

   private int x() {
      return this.al.a(bI);
   }

   private void a(cme $$0, clz $$1) {
      this.w($$0.a() & 0xFF | $$1.a() << 8 & 0xFF00);
   }

   public cme q() {
      return cme.a(this.x() & 0xFF);
   }

   private void a(cme $$0) {
      this.w($$0.a() & 0xFF | this.x() & -256);
   }

   @Nullable
   @Override
   public <T> T a(kk<? extends T> $$0) {
      return $$0 == kl.aL ? c((kk<T>)$$0, this.q()) : super.a($$0);
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

   public clz t() {
      return clz.a((this.x() & 0xFF00) >> 8);
   }

   @Override
   protected void a(dvb $$0) {
      super.a($$0);
      if (this.ae.a(10) == 0) {
         this.a(awr.nl, $$0.a() * 0.6F, $$0.b());
      }
   }

   @Override
   protected awq u() {
      return awr.ni;
   }

   @Override
   protected awq l_() {
      return awr.nm;
   }

   @Nullable
   @Override
   protected awq gw() {
      return awr.nn;
   }

   @Override
   protected awq e(bvk $$0) {
      return awr.np;
   }

   @Override
   protected awq gU() {
      return awr.nj;
   }

   @Override
   public but b(crz $$0, bus $$1) {
      boolean $$2 = !this.n_() && this.gL() && $$0.fY();
      if (!this.bZ() && !$$2) {
         daa $$3 = $$0.b($$1);
         if (!$$3.f()) {
            if (this.i($$3)) {
               return this.c($$0, $$3);
            }

            if (!this.gL()) {
               this.ha();
               return but.a;
            }
         }

         return super.b($$0, $$1);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public boolean a(cjm $$0) {
      if ($$0 == this) {
         return false;
      } else {
         return !($$0 instanceof clw) && !($$0 instanceof clx) ? false : this.hc() && ((clv)$$0).hc();
      }
   }

   @Nullable
   @Override
   public bwl a(aru $$0, bwl $$1) {
      if ($$1 instanceof clw) {
         cma $$2 = bxe.aG.a($$0, bxd.e);
         if ($$2 != null) {
            this.a($$1, $$2);
         }

         return $$2;
      } else {
         clx $$3 = (clx)$$1;
         clx $$4 = bxe.am.a($$0, bxd.e);
         if ($$4 != null) {
            int $$5 = this.ae.a(9);
            cme $$6;
            if ($$5 < 4) {
               $$6 = this.q();
            } else if ($$5 < 8) {
               $$6 = $$3.q();
            } else {
               $$6 = ag.a(cme.values(), this.ae);
            }

            int $$9 = this.ae.a(5);
            clz $$10;
            if ($$9 < 2) {
               $$10 = this.t();
            } else if ($$9 < 4) {
               $$10 = $$3.t();
            } else {
               $$10 = ag.a(clz.values(), this.ae);
            }

            $$4.a($$6, $$10);
            this.a($$1, $$4);
         }

         return $$4;
      }
   }

   @Override
   public boolean e(bxf $$0) {
      return true;
   }

   @Override
   protected void c(bvk $$0, float $$1) {
      this.a($$0, $$1, new bxf[]{bxf.g});
   }

   @Nullable
   @Override
   public byo a(dkq $$0, bur $$1, bxd $$2, @Nullable byo $$3) {
      azz $$4 = $$0.G_();
      cme $$5;
      if ($$3 instanceof clx.a) {
         $$5 = ((clx.a)$$3).a;
      } else {
         $$5 = ag.a(cme.values(), $$4);
         $$3 = new clx.a($$5);
      }

      this.a($$5, ag.a(clz.values(), $$4));
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public bwy e(byi $$0) {
      return this.n_() ? bJ : super.e($$0);
   }

   public static class a extends bwl.a {
      public final cme a;

      public a(cme $$0) {
         super(true);
         this.a = $$0;
      }
   }
}
