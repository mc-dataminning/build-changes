import javax.annotation.Nullable;

public class clv extends clt {
   private static final akl<Integer> bI = akp.a(clv.class, akn.b);
   private static final bww bJ = bxc.am.n().a(bwv.a().a(bwu.a, 0.0F, bxc.am.m() + 0.125F, 0.0F)).a(0.5F);
   private static final int bK = 0;

   public clv(bxc<? extends clv> $$0, djx $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(azx $$0) {
      this.g(bza.s).a((double)a($$0::a));
      this.g(bza.v).a(b($$0::j));
      this.g(bza.o).a(a($$0::j));
   }

   @Override
   protected void a(akp.a $$0) {
      super.a($$0);
      $$0.a(bI, 0);
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      $$0.a("Variant", this.x());
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      this.w($$0.b("Variant", 0));
   }

   private void w(int $$0) {
      this.al.a(bI, $$0);
   }

   private int x() {
      return this.al.a(bI);
   }

   private void a(cmc $$0, clx $$1) {
      this.w($$0.a() & 0xFF | $$1.a() << 8 & 0xFF00);
   }

   public cmc q() {
      return cmc.a(this.x() & 0xFF);
   }

   private void a(cmc $$0) {
      this.w($$0.a() & 0xFF | this.x() & -256);
   }

   @Nullable
   @Override
   public <T> T a(kj<? extends T> $$0) {
      return $$0 == kk.aL ? c((kj<T>)$$0, this.q()) : super.a($$0);
   }

   @Override
   protected void a(kf $$0) {
      this.a($$0, kk.aL);
      super.a($$0);
   }

   @Override
   protected <T> boolean b(kj<T> $$0, T $$1) {
      if ($$0 == kk.aL) {
         this.a(c(kk.aL, $$1));
         return true;
      } else {
         return super.b($$0, $$1);
      }
   }

   public clx t() {
      return clx.a((this.x() & 0xFF00) >> 8);
   }

   @Override
   protected void a(duz $$0) {
      super.a($$0);
      if (this.ae.a(10) == 0) {
         this.a(awp.nl, $$0.a() * 0.6F, $$0.b());
      }
   }

   @Override
   protected awo u() {
      return awp.ni;
   }

   @Override
   protected awo l_() {
      return awp.nm;
   }

   @Nullable
   @Override
   protected awo gw() {
      return awp.nn;
   }

   @Override
   protected awo e(bvi $$0) {
      return awp.np;
   }

   @Override
   protected awo gU() {
      return awp.nj;
   }

   @Override
   public bur b(crx $$0, buq $$1) {
      boolean $$2 = !this.n_() && this.gL() && $$0.fY();
      if (!this.bZ() && !$$2) {
         czy $$3 = $$0.b($$1);
         if (!$$3.f()) {
            if (this.i($$3)) {
               return this.c($$0, $$3);
            }

            if (!this.gL()) {
               this.ha();
               return bur.a;
            }
         }

         return super.b($$0, $$1);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public boolean a(cjk $$0) {
      if ($$0 == this) {
         return false;
      } else {
         return !($$0 instanceof clu) && !($$0 instanceof clv) ? false : this.hc() && ((clt)$$0).hc();
      }
   }

   @Nullable
   @Override
   public bwj a(ars $$0, bwj $$1) {
      if ($$1 instanceof clu) {
         cly $$2 = bxc.aG.a($$0, bxb.e);
         if ($$2 != null) {
            this.a($$1, $$2);
         }

         return $$2;
      } else {
         clv $$3 = (clv)$$1;
         clv $$4 = bxc.am.a($$0, bxb.e);
         if ($$4 != null) {
            int $$5 = this.ae.a(9);
            cmc $$6;
            if ($$5 < 4) {
               $$6 = this.q();
            } else if ($$5 < 8) {
               $$6 = $$3.q();
            } else {
               $$6 = ag.a(cmc.values(), this.ae);
            }

            int $$9 = this.ae.a(5);
            clx $$10;
            if ($$9 < 2) {
               $$10 = this.t();
            } else if ($$9 < 4) {
               $$10 = $$3.t();
            } else {
               $$10 = ag.a(clx.values(), this.ae);
            }

            $$4.a($$6, $$10);
            this.a($$1, $$4);
         }

         return $$4;
      }
   }

   @Override
   public boolean e(bxd $$0) {
      return true;
   }

   @Override
   protected void c(bvi $$0, float $$1) {
      this.a($$0, $$1, new bxd[]{bxd.g});
   }

   @Nullable
   @Override
   public bym a(dko $$0, bup $$1, bxb $$2, @Nullable bym $$3) {
      azx $$4 = $$0.G_();
      cmc $$5;
      if ($$3 instanceof clv.a) {
         $$5 = ((clv.a)$$3).a;
      } else {
         $$5 = ag.a(cmc.values(), $$4);
         $$3 = new clv.a($$5);
      }

      this.a($$5, ag.a(clx.values(), $$4));
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public bww e(byg $$0) {
      return this.n_() ? bJ : super.e($$0);
   }

   public static class a extends bwj.a {
      public final cmc a;

      public a(cmc $$0) {
         super(true);
         this.a = $$0;
      }
   }
}
