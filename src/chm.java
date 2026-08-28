import javax.annotation.Nullable;

public class chm extends chk implements buq<cht> {
   private static final akk<Integer> bY = ako.a(chm.class, akm.b);
   private static final bsy bZ = btb.ab.n().a(bsx.a().a(bsw.a, 0.0F, btb.ab.m() + 0.125F, 0.0F)).a(0.5F);

   public chm(btb<? extends chm> $$0, dbz $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(azh $$0) {
      this.f(buy.q).a((double)a($$0::a));
      this.f(buy.r).a(b($$0::j));
      this.f(buy.m).a(a($$0::j));
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

   private void a(cht $$0, cho $$1) {
      this.x($$0.a() & 0xFF | $$1.a() << 8 & 0xFF00);
   }

   public cht s() {
      return cht.a(this.gq() & 0xFF);
   }

   public void a(cht $$0) {
      this.x($$0.a() & 0xFF | this.gq() & -256);
   }

   public cho u() {
      return cho.a((this.gq() & 0xFF00) >> 8);
   }

   @Override
   public void a(bqo $$0) {
      cuq $$1 = this.fR();
      super.a($$0);
      cuq $$2 = this.fR();
      if (this.ai > 20 && this.l($$2) && $$1 != $$2) {
         this.a(awa.mI, 0.5F, 1.0F);
      }
   }

   @Override
   protected void a(dmn $$0) {
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
   protected avz d(bro $$0) {
      return awa.mN;
   }

   @Override
   protected avz gO() {
      return awa.mH;
   }

   @Override
   public bqv b(cmy $$0, bqu $$1) {
      boolean $$2 = !this.p_() && this.gF() && $$0.fR();
      if (!this.bS() && !$$2) {
         cuq $$3 = $$0.b($$1);
         if (!$$3.e()) {
            if (this.o($$3)) {
               return this.c($$0, $$3);
            }

            if (!this.gF()) {
               this.gV();
               return bqv.a(this.dP().B);
            }
         }

         return super.b($$0, $$1);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public boolean a(cfg $$0) {
      if ($$0 == this) {
         return false;
      } else {
         return !($$0 instanceof chl) && !($$0 instanceof chm) ? false : this.gX() && ((chk)$$0).gX();
      }
   }

   @Nullable
   @Override
   public bsp a(arf $$0, bsp $$1) {
      if ($$1 instanceof chl) {
         chp $$2 = btb.at.a((dbz)$$0);
         if ($$2 != null) {
            this.a($$1, $$2);
         }

         return $$2;
      } else {
         chm $$3 = (chm)$$1;
         chm $$4 = btb.ab.a((dbz)$$0);
         if ($$4 != null) {
            int $$5 = this.ah.a(9);
            cht $$6;
            if ($$5 < 4) {
               $$6 = this.s();
            } else if ($$5 < 8) {
               $$6 = $$3.s();
            } else {
               $$6 = ac.a(cht.values(), this.ah);
            }

            int $$9 = this.ah.a(5);
            cho $$10;
            if ($$9 < 2) {
               $$10 = this.u();
            } else if ($$9 < 4) {
               $$10 = $$3.u();
            } else {
               $$10 = ac.a(cho.values(), this.ah);
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
   public boolean l(cuq $$0) {
      if ($$0.g() instanceof cse $$1 && $$1.d() == cse.a.a) {
         return true;
      }

      return false;
   }

   @Nullable
   @Override
   public buj a(dco $$0, bqt $$1, btu $$2, @Nullable buj $$3) {
      azh $$4 = $$0.E_();
      cht $$5;
      if ($$3 instanceof chm.a) {
         $$5 = ((chm.a)$$3).a;
      } else {
         $$5 = ac.a(cht.values(), $$4);
         $$3 = new chm.a($$5);
      }

      this.a($$5, ac.a(cho.values(), $$4));
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public bsy e(buc $$0) {
      return this.p_() ? bZ : super.e($$0);
   }

   public static class a extends bsp.a {
      public final cht a;

      public a(cht $$0) {
         super(true);
         this.a = $$0;
      }
   }
}
