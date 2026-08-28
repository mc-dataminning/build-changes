import javax.annotation.Nullable;

public class chj extends chh implements bun<chq> {
   private static final akj<Integer> bY = akn.a(chj.class, akl.b);
   private static final bsv bZ = bsy.ab.n().a(bsu.a().a(bst.a, 0.0F, bsy.ab.m() + 0.125F, 0.0F)).a(0.5F);

   public chj(bsy<? extends chj> $$0, dbw $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(azf $$0) {
      this.f(buv.q).a((double)a($$0::a));
      this.f(buv.r).a(b($$0::j));
      this.f(buv.m).a(a($$0::j));
   }

   @Override
   protected void a(akn.a $$0) {
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

   private void a(chq $$0, chl $$1) {
      this.x($$0.a() & 0xFF | $$1.a() << 8 & 0xFF00);
   }

   public chq s() {
      return chq.a(this.gq() & 0xFF);
   }

   public void a(chq $$0) {
      this.x($$0.a() & 0xFF | this.gq() & -256);
   }

   public chl u() {
      return chl.a((this.gq() & 0xFF00) >> 8);
   }

   @Override
   public void a(bql $$0) {
      cun $$1 = this.fR();
      super.a($$0);
      cun $$2 = this.fR();
      if (this.ai > 20 && this.l($$2) && $$1 != $$2) {
         this.a(avz.mI, 0.5F, 1.0F);
      }
   }

   @Override
   protected void a(dmk $$0) {
      super.a($$0);
      if (this.ah.a(10) == 0) {
         this.a(avz.mJ, $$0.a() * 0.6F, $$0.b());
      }
   }

   @Override
   protected avy v() {
      return avz.mG;
   }

   @Override
   protected avy o_() {
      return avz.mK;
   }

   @Nullable
   @Override
   protected avy gx() {
      return avz.mL;
   }

   @Override
   protected avy d(brl $$0) {
      return avz.mN;
   }

   @Override
   protected avy gO() {
      return avz.mH;
   }

   @Override
   public bqs b(cmv $$0, bqr $$1) {
      boolean $$2 = !this.p_() && this.gF() && $$0.fR();
      if (!this.bS() && !$$2) {
         cun $$3 = $$0.b($$1);
         if (!$$3.e()) {
            if (this.o($$3)) {
               return this.c($$0, $$3);
            }

            if (!this.gF()) {
               this.gV();
               return bqs.a(this.dP().B);
            }
         }

         return super.b($$0, $$1);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public boolean a(cfd $$0) {
      if ($$0 == this) {
         return false;
      } else {
         return !($$0 instanceof chi) && !($$0 instanceof chj) ? false : this.gX() && ((chh)$$0).gX();
      }
   }

   @Nullable
   @Override
   public bsm a(are $$0, bsm $$1) {
      if ($$1 instanceof chi) {
         chm $$2 = bsy.at.a((dbw)$$0);
         if ($$2 != null) {
            this.a($$1, $$2);
         }

         return $$2;
      } else {
         chj $$3 = (chj)$$1;
         chj $$4 = bsy.ab.a((dbw)$$0);
         if ($$4 != null) {
            int $$5 = this.ah.a(9);
            chq $$6;
            if ($$5 < 4) {
               $$6 = this.s();
            } else if ($$5 < 8) {
               $$6 = $$3.s();
            } else {
               $$6 = ac.a(chq.values(), this.ah);
            }

            int $$9 = this.ah.a(5);
            chl $$10;
            if ($$9 < 2) {
               $$10 = this.u();
            } else if ($$9 < 4) {
               $$10 = $$3.u();
            } else {
               $$10 = ac.a(chl.values(), this.ah);
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
   public boolean l(cun $$0) {
      if ($$0.g() instanceof csb $$1 && $$1.d() == csb.a.a) {
         return true;
      }

      return false;
   }

   @Nullable
   @Override
   public bug a(dcl $$0, bqq $$1, btr $$2, @Nullable bug $$3) {
      azf $$4 = $$0.E_();
      chq $$5;
      if ($$3 instanceof chj.a) {
         $$5 = ((chj.a)$$3).a;
      } else {
         $$5 = ac.a(chq.values(), $$4);
         $$3 = new chj.a($$5);
      }

      this.a($$5, ac.a(chl.values(), $$4));
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public bsv e(btz $$0) {
      return this.p_() ? bZ : super.e($$0);
   }

   public static class a extends bsm.a {
      public final chq a;

      public a(chq $$0) {
         super(true);
         this.a = $$0;
      }
   }
}
