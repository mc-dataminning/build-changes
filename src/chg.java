import javax.annotation.Nullable;

public class chg extends che implements buk<chn> {
   private static final akg<Integer> bY = akk.a(chg.class, aki.b);
   private static final bss bZ = bsv.ab.n().a(bsr.a().a(bsq.a, 0.0F, bsv.ab.m() + 0.125F, 0.0F)).a(0.5F);

   public chg(bsv<? extends chg> $$0, dbt $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(azc $$0) {
      this.f(bus.q).a((double)a($$0::a));
      this.f(bus.r).a(b($$0::j));
      this.f(bus.m).a(a($$0::j));
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(bY, 0);
   }

   @Override
   public void b(ur $$0) {
      super.b($$0);
      $$0.a("Variant", this.gq());
   }

   @Override
   public void a(ur $$0) {
      super.a($$0);
      this.x($$0.h("Variant"));
   }

   private void x(int $$0) {
      this.ao.a(bY, $$0);
   }

   private int gq() {
      return this.ao.a(bY);
   }

   private void a(chn $$0, chi $$1) {
      this.x($$0.a() & 0xFF | $$1.a() << 8 & 0xFF00);
   }

   public chn s() {
      return chn.a(this.gq() & 0xFF);
   }

   public void a(chn $$0) {
      this.x($$0.a() & 0xFF | this.gq() & -256);
   }

   public chi u() {
      return chi.a((this.gq() & 0xFF00) >> 8);
   }

   @Override
   public void a(bqi $$0) {
      cuk $$1 = this.fR();
      super.a($$0);
      cuk $$2 = this.fR();
      if (this.ai > 20 && this.l($$2) && $$1 != $$2) {
         this.a(avw.mI, 0.5F, 1.0F);
      }
   }

   @Override
   protected void a(dmh $$0) {
      super.a($$0);
      if (this.ah.a(10) == 0) {
         this.a(avw.mJ, $$0.a() * 0.6F, $$0.b());
      }
   }

   @Override
   protected avv v() {
      return avw.mG;
   }

   @Override
   protected avv o_() {
      return avw.mK;
   }

   @Nullable
   @Override
   protected avv gx() {
      return avw.mL;
   }

   @Override
   protected avv d(bri $$0) {
      return avw.mN;
   }

   @Override
   protected avv gO() {
      return avw.mH;
   }

   @Override
   public bqp b(cms $$0, bqo $$1) {
      boolean $$2 = !this.p_() && this.gF() && $$0.fR();
      if (!this.bS() && !$$2) {
         cuk $$3 = $$0.b($$1);
         if (!$$3.e()) {
            if (this.o($$3)) {
               return this.c($$0, $$3);
            }

            if (!this.gF()) {
               this.gV();
               return bqp.a(this.dP().B);
            }
         }

         return super.b($$0, $$1);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public boolean a(cfa $$0) {
      if ($$0 == this) {
         return false;
      } else {
         return !($$0 instanceof chf) && !($$0 instanceof chg) ? false : this.gX() && ((che)$$0).gX();
      }
   }

   @Nullable
   @Override
   public bsj a(arb $$0, bsj $$1) {
      if ($$1 instanceof chf) {
         chj $$2 = bsv.at.a((dbt)$$0);
         if ($$2 != null) {
            this.a($$1, $$2);
         }

         return $$2;
      } else {
         chg $$3 = (chg)$$1;
         chg $$4 = bsv.ab.a((dbt)$$0);
         if ($$4 != null) {
            int $$5 = this.ah.a(9);
            chn $$6;
            if ($$5 < 4) {
               $$6 = this.s();
            } else if ($$5 < 8) {
               $$6 = $$3.s();
            } else {
               $$6 = ac.a(chn.values(), this.ah);
            }

            int $$9 = this.ah.a(5);
            chi $$10;
            if ($$9 < 2) {
               $$10 = this.u();
            } else if ($$9 < 4) {
               $$10 = $$3.u();
            } else {
               $$10 = ac.a(chi.values(), this.ah);
            }

            $$4.a($$6, $$10);
            this.a($$1, $$4);
         }

         return $$4;
      }
   }

   @Override
   public boolean fS() {
      return true;
   }

   @Override
   public boolean l(cuk $$0) {
      if ($$0.g() instanceof cry $$1 && $$1.d() == cry.a.a) {
         return true;
      }

      return false;
   }

   @Nullable
   @Override
   public bud a(dci $$0, bqn $$1, bto $$2, @Nullable bud $$3) {
      azc $$4 = $$0.E_();
      chn $$5;
      if ($$3 instanceof chg.a) {
         $$5 = ((chg.a)$$3).a;
      } else {
         $$5 = ac.a(chn.values(), $$4);
         $$3 = new chg.a($$5);
      }

      this.a($$5, ac.a(chi.values(), $$4));
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public bss e(btw $$0) {
      return this.p_() ? bZ : super.e($$0);
   }

   public static class a extends bsj.a {
      public final chn a;

      public a(chn $$0) {
         super(true);
         this.a = $$0;
      }
   }
}
