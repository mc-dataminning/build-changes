import javax.annotation.Nullable;

public class cix extends civ implements bwa<cje> {
   private static final akl<Integer> bY = akp.a(cix.class, akn.b);
   private static final buh bZ = bul.ab.n().a(bug.a().a(buf.a, 0.0F, bul.ab.m() + 0.125F, 0.0F)).a(0.5F);

   public cix(bul<? extends cix> $$0, dfb $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(azs $$0) {
      this.g(bwi.s).a((double)a($$0::a));
      this.g(bwi.v).a(b($$0::j));
      this.g(bwi.o).a(a($$0::j));
   }

   @Override
   protected void a(akp.a $$0) {
      super.a($$0);
      $$0.a(bY, 0);
   }

   @Override
   public void b(uk $$0) {
      super.b($$0);
      $$0.a("Variant", this.y());
   }

   @Override
   public void a(uk $$0) {
      super.a($$0);
      this.x($$0.h("Variant"));
   }

   private void x(int $$0) {
      this.am.a(bY, $$0);
   }

   private int y() {
      return this.am.a(bY);
   }

   private void a(cje $$0, ciz $$1) {
      this.x($$0.a() & 0xFF | $$1.a() << 8 & 0xFF00);
   }

   public cje q() {
      return cje.a(this.y() & 0xFF);
   }

   public void a(cje $$0) {
      this.x($$0.a() & 0xFF | this.y() & -256);
   }

   public ciz t() {
      return ciz.a((this.y() & 0xFF00) >> 8);
   }

   @Override
   public void a(brw $$0) {
      cwb $$1 = this.ak();
      super.a($$0);
      cwb $$2 = this.ak();
      if (this.ag > 20 && this.a($$2, bum.g) && $$1 != $$2) {
         this.a(awl.mH, 0.5F, 1.0F);
      }
   }

   @Override
   protected void a(dpr $$0) {
      super.a($$0);
      if (this.af.a(10) == 0) {
         this.a(awl.mI, $$0.a() * 0.6F, $$0.b());
      }
   }

   @Override
   protected awk w() {
      return awl.mF;
   }

   @Override
   protected awk o_() {
      return awl.mJ;
   }

   @Nullable
   @Override
   protected awk gw() {
      return awl.mK;
   }

   @Override
   protected awk d(bsu $$0) {
      return awl.mM;
   }

   @Override
   protected awk gV() {
      return awl.mG;
   }

   @Override
   public bsd b(com $$0, bsc $$1) {
      boolean $$2 = !this.p_() && this.gL() && $$0.ga();
      if (!this.cb() && !$$2) {
         cwb $$3 = $$0.b($$1);
         if (!$$3.f()) {
            if (this.l($$3)) {
               return this.c($$0, $$3);
            }

            if (!this.gL()) {
               this.hc();
               return bsd.a;
            }
         }

         return super.b($$0, $$1);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public boolean a(cgr $$0) {
      if ($$0 == this) {
         return false;
      } else {
         return !($$0 instanceof ciw) && !($$0 instanceof cix) ? false : this.he() && ((civ)$$0).he();
      }
   }

   @Nullable
   @Override
   public btv a(arn $$0, btv $$1) {
      if ($$1 instanceof ciw) {
         cja $$2 = bul.at.a($$0, buk.e);
         if ($$2 != null) {
            this.a($$1, $$2);
         }

         return $$2;
      } else {
         cix $$3 = (cix)$$1;
         cix $$4 = bul.ab.a($$0, buk.e);
         if ($$4 != null) {
            int $$5 = this.af.a(9);
            cje $$6;
            if ($$5 < 4) {
               $$6 = this.q();
            } else if ($$5 < 8) {
               $$6 = $$3.q();
            } else {
               $$6 = ae.a(cje.values(), this.af);
            }

            int $$9 = this.af.a(5);
            ciz $$10;
            if ($$9 < 2) {
               $$10 = this.t();
            } else if ($$9 < 4) {
               $$10 = $$3.t();
            } else {
               $$10 = ae.a(ciz.values(), this.af);
            }

            $$4.a($$6, $$10);
            this.a($$1, $$4);
         }

         return $$4;
      }
   }

   @Override
   public boolean e(bum $$0) {
      return true;
   }

   @Nullable
   @Override
   public bvt a(dfr $$0, bsb $$1, buk $$2, @Nullable bvt $$3) {
      azs $$4 = $$0.E_();
      cje $$5;
      if ($$3 instanceof cix.a) {
         $$5 = ((cix.a)$$3).a;
      } else {
         $$5 = ae.a(cje.values(), $$4);
         $$3 = new cix.a($$5);
      }

      this.a($$5, ae.a(ciz.values(), $$4));
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public buh e(bvm $$0) {
      return this.p_() ? bZ : super.e($$0);
   }

   public static class a extends btv.a {
      public final cje a;

      public a(cje $$0) {
         super(true);
         this.a = $$0;
      }
   }
}
