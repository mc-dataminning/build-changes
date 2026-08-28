import javax.annotation.Nullable;

public class cgu extends cgs implements bty<chb> {
   private static final ajp<Integer> ca = ajt.a(cgu.class, ajr.b);
   private static final bsg cb = bsj.ab.n().a(bsf.a().a(bse.a, 0.0F, bsj.ab.m() + 0.125F, 0.0F)).a(0.5F);

   public cgu(bsj<? extends cgu> $$0, dcd $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(aym $$0) {
      this.f(bug.s).a((double)a($$0::a));
      this.f(bug.v).a(b($$0::j));
      this.f(bug.o).a(a($$0::j));
   }

   @Override
   protected void a(ajt.a $$0) {
      super.a($$0);
      $$0.a(ca, 0);
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      $$0.a("Variant", this.gn());
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      this.w($$0.h("Variant"));
   }

   private void w(int $$0) {
      this.ao.a(ca, $$0);
   }

   private int gn() {
      return this.ao.a(ca);
   }

   private void a(chb $$0, cgw $$1) {
      this.w($$0.a() & 0xFF | $$1.a() << 8 & 0xFF00);
   }

   public chb s() {
      return chb.a(this.gn() & 0xFF);
   }

   public void a(chb $$0) {
      this.w($$0.a() & 0xFF | this.gn() & -256);
   }

   public cgw u() {
      return cgw.a((this.gn() & 0xFF00) >> 8);
   }

   @Override
   public void a(bpw $$0) {
      cua $$1 = this.fN();
      super.a($$0);
      cua $$2 = this.fN();
      if (this.ai > 20 && this.l($$2) && $$1 != $$2) {
         this.a(avf.mI, 0.5F, 1.0F);
      }
   }

   @Override
   protected void a(dms $$0) {
      super.a($$0);
      if (this.ah.a(10) == 0) {
         this.a(avf.mJ, $$0.a() * 0.6F, $$0.b());
      }
   }

   @Override
   protected ave v() {
      return avf.mG;
   }

   @Override
   protected ave o_() {
      return avf.mK;
   }

   @Nullable
   @Override
   protected ave gu() {
      return avf.mL;
   }

   @Override
   protected ave d(bqw $$0) {
      return avf.mN;
   }

   @Override
   protected ave gL() {
      return avf.mH;
   }

   @Override
   public bqd b(cmh $$0, bqc $$1) {
      boolean $$2 = !this.p_() && this.gC() && $$0.fN();
      if (!this.bS() && !$$2) {
         cua $$3 = $$0.b($$1);
         if (!$$3.e()) {
            if (this.o($$3)) {
               return this.c($$0, $$3);
            }

            if (!this.gC()) {
               this.gS();
               return bqd.a(this.dP().B);
            }
         }

         return super.b($$0, $$1);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public boolean a(ceo $$0) {
      if ($$0 == this) {
         return false;
      } else {
         return !($$0 instanceof cgt) && !($$0 instanceof cgu) ? false : this.gU() && ((cgs)$$0).gU();
      }
   }

   @Nullable
   @Override
   public brx a(aqk $$0, brx $$1) {
      if ($$1 instanceof cgt) {
         cgx $$2 = bsj.at.a((dcd)$$0);
         if ($$2 != null) {
            this.a($$1, $$2);
         }

         return $$2;
      } else {
         cgu $$3 = (cgu)$$1;
         cgu $$4 = bsj.ab.a((dcd)$$0);
         if ($$4 != null) {
            int $$5 = this.ah.a(9);
            chb $$6;
            if ($$5 < 4) {
               $$6 = this.s();
            } else if ($$5 < 8) {
               $$6 = $$3.s();
            } else {
               $$6 = ac.a(chb.values(), this.ah);
            }

            int $$9 = this.ah.a(5);
            cgw $$10;
            if ($$9 < 2) {
               $$10 = this.u();
            } else if ($$9 < 4) {
               $$10 = $$3.u();
            } else {
               $$10 = ac.a(cgw.values(), this.ah);
            }

            $$4.a($$6, $$10);
            this.a($$1, $$4);
         }

         return $$4;
      }
   }

   @Override
   public boolean fO() {
      return true;
   }

   @Override
   public boolean l(cua $$0) {
      if ($$0.g() instanceof cro $$1 && $$1.d() == cro.a.a) {
         return true;
      }

      return false;
   }

   @Nullable
   @Override
   public btr a(dcs $$0, bqb $$1, btc $$2, @Nullable btr $$3) {
      aym $$4 = $$0.E_();
      chb $$5;
      if ($$3 instanceof cgu.a) {
         $$5 = ((cgu.a)$$3).a;
      } else {
         $$5 = ac.a(chb.values(), $$4);
         $$3 = new cgu.a($$5);
      }

      this.a($$5, ac.a(cgw.values(), $$4));
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public bsg e(btk $$0) {
      return this.p_() ? cb : super.e($$0);
   }

   public static class a extends brx.a {
      public final chb a;

      public a(chb $$0) {
         super(true);
         this.a = $$0;
      }
   }
}
