import javax.annotation.Nullable;

public class ckz extends ckx {
   private static final akh<Integer> bF = akl.a(ckz.class, akj.b);
   private static final bwd bG = bwj.al.n().a(bwc.a().a(bwb.a, 0.0F, bwj.al.m() + 0.125F, 0.0F)).a(0.5F);

   public ckz(bwj<? extends ckz> $$0, dip $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(azt $$0) {
      this.g(byf.s).a((double)a($$0::a));
      this.g(byf.v).a(b($$0::j));
      this.g(byf.o).a(a($$0::j));
   }

   @Override
   protected void a(akl.a $$0) {
      super.a($$0);
      $$0.a(bF, 0);
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      $$0.a("Variant", this.x());
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      this.w($$0.h("Variant"));
   }

   private void w(int $$0) {
      this.al.a(bF, $$0);
   }

   private int x() {
      return this.al.a(bF);
   }

   private void a(clg $$0, clb $$1) {
      this.w($$0.a() & 0xFF | $$1.a() << 8 & 0xFF00);
   }

   public clg q() {
      return clg.a(this.x() & 0xFF);
   }

   private void a(clg $$0) {
      this.w($$0.a() & 0xFF | this.x() & -256);
   }

   @Nullable
   @Override
   public <T> T a(ki<? extends T> $$0) {
      return $$0 == kj.aI ? c((ki<T>)$$0, this.q()) : super.a($$0);
   }

   @Override
   protected void a(ke $$0) {
      this.a($$0, kj.aI);
      super.a($$0);
   }

   @Override
   protected <T> boolean b(ki<T> $$0, T $$1) {
      if ($$0 == kj.aI) {
         this.a(c(kj.aI, $$1));
         return true;
      } else {
         return super.b($$0, $$1);
      }
   }

   public clb t() {
      return clb.a((this.x() & 0xFF00) >> 8);
   }

   @Override
   protected void a(dtn $$0) {
      super.a($$0);
      if (this.ae.a(10) == 0) {
         this.a(awl.nh, $$0.a() * 0.6F, $$0.b());
      }
   }

   @Override
   protected awk u() {
      return awl.ne;
   }

   @Override
   protected awk l_() {
      return awl.ni;
   }

   @Nullable
   @Override
   protected awk gs() {
      return awl.nj;
   }

   @Override
   protected awk e(bup $$0) {
      return awl.nl;
   }

   @Override
   protected awk gQ() {
      return awl.nf;
   }

   @Override
   public bty b(cqs $$0, btx $$1) {
      boolean $$2 = !this.n_() && this.gH() && $$0.fX();
      if (!this.ca() && !$$2) {
         cys $$3 = $$0.b($$1);
         if (!$$3.f()) {
            if (this.k($$3)) {
               return this.c($$0, $$3);
            }

            if (!this.gH()) {
               this.gW();
               return bty.a;
            }
         }

         return super.b($$0, $$1);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public boolean a(cio $$0) {
      if ($$0 == this) {
         return false;
      } else {
         return !($$0 instanceof cky) && !($$0 instanceof ckz) ? false : this.gY() && ((ckx)$$0).gY();
      }
   }

   @Nullable
   @Override
   public bvq a(aro $$0, bvq $$1) {
      if ($$1 instanceof cky) {
         clc $$2 = bwj.aF.a($$0, bwi.e);
         if ($$2 != null) {
            this.a($$1, $$2);
         }

         return $$2;
      } else {
         ckz $$3 = (ckz)$$1;
         ckz $$4 = bwj.al.a($$0, bwi.e);
         if ($$4 != null) {
            int $$5 = this.ae.a(9);
            clg $$6;
            if ($$5 < 4) {
               $$6 = this.q();
            } else if ($$5 < 8) {
               $$6 = $$3.q();
            } else {
               $$6 = af.a(clg.values(), this.ae);
            }

            int $$9 = this.ae.a(5);
            clb $$10;
            if ($$9 < 2) {
               $$10 = this.t();
            } else if ($$9 < 4) {
               $$10 = $$3.t();
            } else {
               $$10 = af.a(clb.values(), this.ae);
            }

            $$4.a($$6, $$10);
            this.a($$1, $$4);
         }

         return $$4;
      }
   }

   @Override
   public boolean e(bwk $$0) {
      return true;
   }

   @Override
   protected void c(bup $$0, float $$1) {
      this.a($$0, $$1, new bwk[]{bwk.g});
   }

   @Nullable
   @Override
   public bxr a(djg $$0, btw $$1, bwi $$2, @Nullable bxr $$3) {
      azt $$4 = $$0.C_();
      clg $$5;
      if ($$3 instanceof ckz.a) {
         $$5 = ((ckz.a)$$3).a;
      } else {
         $$5 = af.a(clg.values(), $$4);
         $$3 = new ckz.a($$5);
      }

      this.a($$5, af.a(clb.values(), $$4));
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public bwd e(bxl $$0) {
      return this.n_() ? bG : super.e($$0);
   }

   public static class a extends bvq.a {
      public final clg a;

      public a(clg $$0) {
         super(true);
         this.a = $$0;
      }
   }
}
