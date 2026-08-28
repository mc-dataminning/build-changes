import javax.annotation.Nullable;

public class chi extends chg implements bum<chp> {
   private static final ajv<Integer> ca = ajz.a(chi.class, ajx.b);
   private static final bst cb = bsw.ab.n().a(bss.a().a(bsr.a, 0.0F, bsw.ab.m() + 0.125F, 0.0F)).a(0.5F);

   public chi(bsw<? extends chi> $$0, dcu $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(ayv $$0) {
      this.f(buu.s).a((double)a($$0::a));
      this.f(buu.v).a(b($$0::j));
      this.f(buu.o).a(a($$0::j));
   }

   @Override
   protected void a(ajz.a $$0) {
      super.a($$0);
      $$0.a(ca, 0);
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("Variant", this.gm());
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      this.w($$0.h("Variant"));
   }

   private void w(int $$0) {
      this.ao.a(ca, $$0);
   }

   private int gm() {
      return this.ao.a(ca);
   }

   private void a(chp $$0, chk $$1) {
      this.w($$0.a() & 0xFF | $$1.a() << 8 & 0xFF00);
   }

   public chp s() {
      return chp.a(this.gm() & 0xFF);
   }

   public void a(chp $$0) {
      this.w($$0.a() & 0xFF | this.gm() & -256);
   }

   public chk t() {
      return chk.a((this.gm() & 0xFF00) >> 8);
   }

   @Override
   public void a(bqj $$0) {
      cuo $$1 = this.fN();
      super.a($$0);
      cuo $$2 = this.fN();
      if (this.ai > 20 && this.l($$2) && $$1 != $$2) {
         this.a(avo.mI, 0.5F, 1.0F);
      }
   }

   @Override
   protected void a(dnk $$0) {
      super.a($$0);
      if (this.ah.a(10) == 0) {
         this.a(avo.mJ, $$0.a() * 0.6F, $$0.b());
      }
   }

   @Override
   protected avn v() {
      return avo.mG;
   }

   @Override
   protected avn n_() {
      return avo.mK;
   }

   @Nullable
   @Override
   protected avn go() {
      return avo.mL;
   }

   @Override
   protected avn d(brj $$0) {
      return avo.mN;
   }

   @Override
   protected avn gK() {
      return avo.mH;
   }

   @Override
   public bqq b(cmv $$0, bqp $$1) {
      boolean $$2 = !this.o_() && this.gB() && $$0.fO();
      if (!this.bT() && !$$2) {
         cuo $$3 = $$0.b($$1);
         if (!$$3.e()) {
            if (this.o($$3)) {
               return this.c($$0, $$3);
            }

            if (!this.gB()) {
               this.gR();
               return bqq.a(this.dQ().B);
            }
         }

         return super.b($$0, $$1);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public boolean a(cfc $$0) {
      if ($$0 == this) {
         return false;
      } else {
         return !($$0 instanceof chh) && !($$0 instanceof chi) ? false : this.gT() && ((chg)$$0).gT();
      }
   }

   @Nullable
   @Override
   public bsk a(aqt $$0, bsk $$1) {
      if ($$1 instanceof chh) {
         chl $$2 = bsw.at.a((dcu)$$0);
         if ($$2 != null) {
            this.a($$1, $$2);
         }

         return $$2;
      } else {
         chi $$3 = (chi)$$1;
         chi $$4 = bsw.ab.a((dcu)$$0);
         if ($$4 != null) {
            int $$5 = this.ah.a(9);
            chp $$6;
            if ($$5 < 4) {
               $$6 = this.s();
            } else if ($$5 < 8) {
               $$6 = $$3.s();
            } else {
               $$6 = ad.a(chp.values(), this.ah);
            }

            int $$9 = this.ah.a(5);
            chk $$10;
            if ($$9 < 2) {
               $$10 = this.t();
            } else if ($$9 < 4) {
               $$10 = $$3.t();
            } else {
               $$10 = ad.a(chk.values(), this.ah);
            }

            $$4.a($$6, $$10);
            this.a($$1, $$4);
         }

         return $$4;
      }
   }

   @Override
   public boolean d(bsx $$0) {
      return true;
   }

   @Override
   public boolean l(cuo $$0) {
      if ($$0.g() instanceof csc $$1 && $$1.d() == csc.a.a) {
         return true;
      }

      return false;
   }

   @Nullable
   @Override
   public buf a(ddj $$0, bqo $$1, btp $$2, @Nullable buf $$3) {
      ayv $$4 = $$0.E_();
      chp $$5;
      if ($$3 instanceof chi.a) {
         $$5 = ((chi.a)$$3).a;
      } else {
         $$5 = ad.a(chp.values(), $$4);
         $$3 = new chi.a($$5);
      }

      this.a($$5, ad.a(chk.values(), $$4));
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public bst e(bty $$0) {
      return this.o_() ? cb : super.e($$0);
   }

   public static class a extends bsk.a {
      public final chp a;

      public a(chp $$0) {
         super(true);
         this.a = $$0;
      }
   }
}
