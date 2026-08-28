import javax.annotation.Nullable;

public class chn extends chl implements bur<chu> {
   private static final akk<Integer> bY = ako.a(chn.class, akm.b);
   private static final bsz bZ = btc.ab.n().a(bsy.a().a(bsx.a, 0.0F, btc.ab.m() + 0.125F, 0.0F)).a(0.5F);

   public chn(btc<? extends chn> $$0, dca $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(azh $$0) {
      this.f(buz.q).a((double)a($$0::a));
      this.f(buz.r).a(b($$0::j));
      this.f(buz.m).a(a($$0::j));
   }

   @Override
   protected void a(ako.a $$0) {
      super.a($$0);
      $$0.a(bY, 0);
   }

   @Override
   public void b(us $$0) {
      super.b($$0);
      $$0.a("Variant", this.gq());
   }

   @Override
   public void a(us $$0) {
      super.a($$0);
      this.x($$0.h("Variant"));
   }

   private void x(int $$0) {
      this.ao.a(bY, $$0);
   }

   private int gq() {
      return this.ao.a(bY);
   }

   private void a(chu $$0, chp $$1) {
      this.x($$0.a() & 0xFF | $$1.a() << 8 & 0xFF00);
   }

   public chu s() {
      return chu.a(this.gq() & 0xFF);
   }

   public void a(chu $$0) {
      this.x($$0.a() & 0xFF | this.gq() & -256);
   }

   public chp u() {
      return chp.a((this.gq() & 0xFF00) >> 8);
   }

   @Override
   public void a(bqp $$0) {
      cur $$1 = this.fR();
      super.a($$0);
      cur $$2 = this.fR();
      if (this.ai > 20 && this.l($$2) && $$1 != $$2) {
         this.a(awa.mI, 0.5F, 1.0F);
      }
   }

   @Override
   protected void a(dmo $$0) {
      super.a($$0);
      if (this.ah.a(10) == 0) {
         this.a(awa.mJ, $$0.a() * 0.6F, $$0.b());
      }
   }

   @Override
   protected avz v() {
      return awa.mG;
   }

   @Override
   protected avz o_() {
      return awa.mK;
   }

   @Nullable
   @Override
   protected avz gx() {
      return awa.mL;
   }

   @Override
   protected avz d(brp $$0) {
      return awa.mN;
   }

   @Override
   protected avz gO() {
      return awa.mH;
   }

   @Override
   public bqw b(cmz $$0, bqv $$1) {
      boolean $$2 = !this.p_() && this.gF() && $$0.fR();
      if (!this.bS() && !$$2) {
         cur $$3 = $$0.b($$1);
         if (!$$3.e()) {
            if (this.o($$3)) {
               return this.c($$0, $$3);
            }

            if (!this.gF()) {
               this.gV();
               return bqw.a(this.dP().B);
            }
         }

         return super.b($$0, $$1);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public boolean a(cfh $$0) {
      if ($$0 == this) {
         return false;
      } else {
         return !($$0 instanceof chm) && !($$0 instanceof chn) ? false : this.gX() && ((chl)$$0).gX();
      }
   }

   @Nullable
   @Override
   public bsq a(arf $$0, bsq $$1) {
      if ($$1 instanceof chm) {
         chq $$2 = btc.at.a((dca)$$0);
         if ($$2 != null) {
            this.a($$1, $$2);
         }

         return $$2;
      } else {
         chn $$3 = (chn)$$1;
         chn $$4 = btc.ab.a((dca)$$0);
         if ($$4 != null) {
            int $$5 = this.ah.a(9);
            chu $$6;
            if ($$5 < 4) {
               $$6 = this.s();
            } else if ($$5 < 8) {
               $$6 = $$3.s();
            } else {
               $$6 = ac.a(chu.values(), this.ah);
            }

            int $$9 = this.ah.a(5);
            chp $$10;
            if ($$9 < 2) {
               $$10 = this.u();
            } else if ($$9 < 4) {
               $$10 = $$3.u();
            } else {
               $$10 = ac.a(chp.values(), this.ah);
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
   public boolean l(cur $$0) {
      if ($$0.g() instanceof csf $$1 && $$1.d() == csf.a.a) {
         return true;
      }

      return false;
   }

   @Nullable
   @Override
   public buk a(dcp $$0, bqu $$1, btv $$2, @Nullable buk $$3) {
      azh $$4 = $$0.E_();
      chu $$5;
      if ($$3 instanceof chn.a) {
         $$5 = ((chn.a)$$3).a;
      } else {
         $$5 = ac.a(chu.values(), $$4);
         $$3 = new chn.a($$5);
      }

      this.a($$5, ac.a(chp.values(), $$4));
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public bsz e(bud $$0) {
      return this.p_() ? bZ : super.e($$0);
   }

   public static class a extends bsq.a {
      public final chu a;

      public a(chu $$0) {
         super(true);
         this.a = $$0;
      }
   }
}
