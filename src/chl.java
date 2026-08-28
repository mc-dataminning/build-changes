import javax.annotation.Nullable;

public class chl extends chj implements bup<chs> {
   private static final akk<Integer> bY = ako.a(chl.class, akm.b);
   private static final bsx bZ = bta.ab.n().a(bsw.a().a(bsv.a, 0.0F, bta.ab.m() + 0.125F, 0.0F)).a(0.5F);

   public chl(bta<? extends chl> $$0, dby $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(azh $$0) {
      this.f(bux.q).a((double)a($$0::a));
      this.f(bux.r).a(b($$0::j));
      this.f(bux.m).a(a($$0::j));
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

   private void a(chs $$0, chn $$1) {
      this.x($$0.a() & 0xFF | $$1.a() << 8 & 0xFF00);
   }

   public chs s() {
      return chs.a(this.gq() & 0xFF);
   }

   public void a(chs $$0) {
      this.x($$0.a() & 0xFF | this.gq() & -256);
   }

   public chn u() {
      return chn.a((this.gq() & 0xFF00) >> 8);
   }

   @Override
   public void a(bqn $$0) {
      cup $$1 = this.fR();
      super.a($$0);
      cup $$2 = this.fR();
      if (this.ai > 20 && this.l($$2) && $$1 != $$2) {
         this.a(awa.mI, 0.5F, 1.0F);
      }
   }

   @Override
   protected void a(dmm $$0) {
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
   protected avz d(brn $$0) {
      return awa.mN;
   }

   @Override
   protected avz gO() {
      return awa.mH;
   }

   @Override
   public bqu b(cmx $$0, bqt $$1) {
      boolean $$2 = !this.p_() && this.gF() && $$0.fR();
      if (!this.bS() && !$$2) {
         cup $$3 = $$0.b($$1);
         if (!$$3.e()) {
            if (this.o($$3)) {
               return this.c($$0, $$3);
            }

            if (!this.gF()) {
               this.gV();
               return bqu.a(this.dP().B);
            }
         }

         return super.b($$0, $$1);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public boolean a(cff $$0) {
      if ($$0 == this) {
         return false;
      } else {
         return !($$0 instanceof chk) && !($$0 instanceof chl) ? false : this.gX() && ((chj)$$0).gX();
      }
   }

   @Nullable
   @Override
   public bso a(arf $$0, bso $$1) {
      if ($$1 instanceof chk) {
         cho $$2 = bta.at.a((dby)$$0);
         if ($$2 != null) {
            this.a($$1, $$2);
         }

         return $$2;
      } else {
         chl $$3 = (chl)$$1;
         chl $$4 = bta.ab.a((dby)$$0);
         if ($$4 != null) {
            int $$5 = this.ah.a(9);
            chs $$6;
            if ($$5 < 4) {
               $$6 = this.s();
            } else if ($$5 < 8) {
               $$6 = $$3.s();
            } else {
               $$6 = ac.a(chs.values(), this.ah);
            }

            int $$9 = this.ah.a(5);
            chn $$10;
            if ($$9 < 2) {
               $$10 = this.u();
            } else if ($$9 < 4) {
               $$10 = $$3.u();
            } else {
               $$10 = ac.a(chn.values(), this.ah);
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
   public boolean l(cup $$0) {
      if ($$0.g() instanceof csd $$1 && $$1.d() == csd.a.a) {
         return true;
      }

      return false;
   }

   @Nullable
   @Override
   public bui a(dcn $$0, bqs $$1, btt $$2, @Nullable bui $$3) {
      azh $$4 = $$0.E_();
      chs $$5;
      if ($$3 instanceof chl.a) {
         $$5 = ((chl.a)$$3).a;
      } else {
         $$5 = ac.a(chs.values(), $$4);
         $$3 = new chl.a($$5);
      }

      this.a($$5, ac.a(chn.values(), $$4));
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public bsx e(bub $$0) {
      return this.p_() ? bZ : super.e($$0);
   }

   public static class a extends bso.a {
      public final chs a;

      public a(chs $$0) {
         super(true);
         this.a = $$0;
      }
   }
}
