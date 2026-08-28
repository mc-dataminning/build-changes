import javax.annotation.Nullable;

public class cgy extends cgw implements buc<chf> {
   private static final ajp<Integer> ca = ajt.a(cgy.class, ajr.b);
   private static final bsk cb = bsn.ab.n().a(bsj.a().a(bsi.a, 0.0F, bsn.ab.m() + 0.125F, 0.0F)).a(0.5F);

   public cgy(bsn<? extends cgy> $$0, dcg $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(ayo $$0) {
      this.f(buk.s).a((double)a($$0::a));
      this.f(buk.v).a(b($$0::j));
      this.f(buk.o).a(a($$0::j));
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

   private void a(chf $$0, cha $$1) {
      this.w($$0.a() & 0xFF | $$1.a() << 8 & 0xFF00);
   }

   public chf s() {
      return chf.a(this.gn() & 0xFF);
   }

   public void a(chf $$0) {
      this.w($$0.a() & 0xFF | this.gn() & -256);
   }

   public cha t() {
      return cha.a((this.gn() & 0xFF00) >> 8);
   }

   @Override
   public void a(bqa $$0) {
      cud $$1 = this.fO();
      super.a($$0);
      cud $$2 = this.fO();
      if (this.ai > 20 && this.l($$2) && $$1 != $$2) {
         this.a(avh.mI, 0.5F, 1.0F);
      }
   }

   @Override
   protected void a(dmv $$0) {
      super.a($$0);
      if (this.ah.a(10) == 0) {
         this.a(avh.mJ, $$0.a() * 0.6F, $$0.b());
      }
   }

   @Override
   protected avg v() {
      return avh.mG;
   }

   @Override
   protected avg n_() {
      return avh.mK;
   }

   @Nullable
   @Override
   protected avg gu() {
      return avh.mL;
   }

   @Override
   protected avg d(bra $$0) {
      return avh.mN;
   }

   @Override
   protected avg gL() {
      return avh.mH;
   }

   @Override
   public bqh b(cml $$0, bqg $$1) {
      boolean $$2 = !this.o_() && this.gC() && $$0.fP();
      if (!this.bU() && !$$2) {
         cud $$3 = $$0.b($$1);
         if (!$$3.e()) {
            if (this.o($$3)) {
               return this.c($$0, $$3);
            }

            if (!this.gC()) {
               this.gS();
               return bqh.a(this.dR().B);
            }
         }

         return super.b($$0, $$1);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public boolean a(ces $$0) {
      if ($$0 == this) {
         return false;
      } else {
         return !($$0 instanceof cgx) && !($$0 instanceof cgy) ? false : this.gU() && ((cgw)$$0).gU();
      }
   }

   @Nullable
   @Override
   public bsb a(aqm $$0, bsb $$1) {
      if ($$1 instanceof cgx) {
         chb $$2 = bsn.at.a((dcg)$$0);
         if ($$2 != null) {
            this.a($$1, $$2);
         }

         return $$2;
      } else {
         cgy $$3 = (cgy)$$1;
         cgy $$4 = bsn.ab.a((dcg)$$0);
         if ($$4 != null) {
            int $$5 = this.ah.a(9);
            chf $$6;
            if ($$5 < 4) {
               $$6 = this.s();
            } else if ($$5 < 8) {
               $$6 = $$3.s();
            } else {
               $$6 = ac.a(chf.values(), this.ah);
            }

            int $$9 = this.ah.a(5);
            cha $$10;
            if ($$9 < 2) {
               $$10 = this.t();
            } else if ($$9 < 4) {
               $$10 = $$3.t();
            } else {
               $$10 = ac.a(cha.values(), this.ah);
            }

            $$4.a($$6, $$10);
            this.a($$1, $$4);
         }

         return $$4;
      }
   }

   @Override
   public boolean d(bso $$0) {
      return true;
   }

   @Override
   public boolean l(cud $$0) {
      if ($$0.g() instanceof crs $$1 && $$1.d() == crs.a.a) {
         return true;
      }

      return false;
   }

   @Nullable
   @Override
   public btv a(dcv $$0, bqf $$1, btg $$2, @Nullable btv $$3) {
      ayo $$4 = $$0.E_();
      chf $$5;
      if ($$3 instanceof cgy.a) {
         $$5 = ((cgy.a)$$3).a;
      } else {
         $$5 = ac.a(chf.values(), $$4);
         $$3 = new cgy.a($$5);
      }

      this.a($$5, ac.a(cha.values(), $$4));
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public bsk e(bto $$0) {
      return this.o_() ? cb : super.e($$0);
   }

   public static class a extends bsb.a {
      public final chf a;

      public a(chf $$0) {
         super(true);
         this.a = $$0;
      }
   }
}
