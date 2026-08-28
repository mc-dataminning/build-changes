import javax.annotation.Nullable;

public class clf extends cld {
   private static final akj<Integer> bF = akn.a(clf.class, akl.b);
   private static final bwg bG = bwm.al.n().a(bwf.a().a(bwe.a, 0.0F, bwm.al.m() + 0.125F, 0.0F)).a(0.5F);

   public clf(bwm<? extends clf> $$0, div $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(azv $$0) {
      this.g(byi.s).a((double)a($$0::a));
      this.g(byi.v).a(b($$0::j));
      this.g(byi.o).a(a($$0::j));
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(bF, 0);
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      $$0.a("Variant", this.x());
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      this.w($$0.h("Variant"));
   }

   private void w(int $$0) {
      this.al.a(bF, $$0);
   }

   private int x() {
      return this.al.a(bF);
   }

   private void a(clm $$0, clh $$1) {
      this.w($$0.a() & 0xFF | $$1.a() << 8 & 0xFF00);
   }

   public clm q() {
      return clm.a(this.x() & 0xFF);
   }

   private void a(clm $$0) {
      this.w($$0.a() & 0xFF | this.x() & -256);
   }

   @Nullable
   @Override
   public <T> T a(ki<? extends T> $$0) {
      return $$0 == kj.aJ ? c((ki<T>)$$0, this.q()) : super.a($$0);
   }

   @Override
   protected void a(ke $$0) {
      this.a($$0, kj.aJ);
      super.a($$0);
   }

   @Override
   protected <T> boolean b(ki<T> $$0, T $$1) {
      if ($$0 == kj.aJ) {
         this.a(c(kj.aJ, $$1));
         return true;
      } else {
         return super.b($$0, $$1);
      }
   }

   public clh t() {
      return clh.a((this.x() & 0xFF00) >> 8);
   }

   @Override
   protected void a(dtv $$0) {
      super.a($$0);
      if (this.ae.a(10) == 0) {
         this.a(awn.ni, $$0.a() * 0.6F, $$0.b());
      }
   }

   @Override
   protected awm u() {
      return awn.nf;
   }

   @Override
   protected awm l_() {
      return awn.nj;
   }

   @Nullable
   @Override
   protected awm gs() {
      return awn.nk;
   }

   @Override
   protected awm e(bus $$0) {
      return awn.nm;
   }

   @Override
   protected awm gQ() {
      return awn.ng;
   }

   @Override
   public bub b(cqy $$0, bua $$1) {
      boolean $$2 = !this.n_() && this.gH() && $$0.fX();
      if (!this.ca() && !$$2) {
         cyy $$3 = $$0.b($$1);
         if (!$$3.f()) {
            if (this.j($$3)) {
               return this.c($$0, $$3);
            }

            if (!this.gH()) {
               this.gW();
               return bub.a;
            }
         }

         return super.b($$0, $$1);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public boolean a(cis $$0) {
      if ($$0 == this) {
         return false;
      } else {
         return !($$0 instanceof cle) && !($$0 instanceof clf) ? false : this.gY() && ((cld)$$0).gY();
      }
   }

   @Nullable
   @Override
   public bvt a(arq $$0, bvt $$1) {
      if ($$1 instanceof cle) {
         cli $$2 = bwm.aF.a($$0, bwl.e);
         if ($$2 != null) {
            this.a($$1, $$2);
         }

         return $$2;
      } else {
         clf $$3 = (clf)$$1;
         clf $$4 = bwm.al.a($$0, bwl.e);
         if ($$4 != null) {
            int $$5 = this.ae.a(9);
            clm $$6;
            if ($$5 < 4) {
               $$6 = this.q();
            } else if ($$5 < 8) {
               $$6 = $$3.q();
            } else {
               $$6 = af.a(clm.values(), this.ae);
            }

            int $$9 = this.ae.a(5);
            clh $$10;
            if ($$9 < 2) {
               $$10 = this.t();
            } else if ($$9 < 4) {
               $$10 = $$3.t();
            } else {
               $$10 = af.a(clh.values(), this.ae);
            }

            $$4.a($$6, $$10);
            this.a($$1, $$4);
         }

         return $$4;
      }
   }

   @Override
   public boolean e(bwn $$0) {
      return true;
   }

   @Override
   protected void c(bus $$0, float $$1) {
      this.a($$0, $$1, new bwn[]{bwn.g});
   }

   @Nullable
   @Override
   public bxu a(djm $$0, btz $$1, bwl $$2, @Nullable bxu $$3) {
      azv $$4 = $$0.C_();
      clm $$5;
      if ($$3 instanceof clf.a) {
         $$5 = ((clf.a)$$3).a;
      } else {
         $$5 = af.a(clm.values(), $$4);
         $$3 = new clf.a($$5);
      }

      this.a($$5, af.a(clh.values(), $$4));
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public bwg e(bxo $$0) {
      return this.n_() ? bG : super.e($$0);
   }

   public static class a extends bvt.a {
      public final clm a;

      public a(clm $$0) {
         super(true);
         this.a = $$0;
      }
   }
}
