import javax.annotation.Nullable;

public class chk extends chi implements buo<chr> {
   private static final akj<Integer> bY = akn.a(chk.class, akl.b);
   private static final bsw bZ = bsz.ab.n().a(bsv.a().a(bsu.a, 0.0F, bsz.ab.m() + 0.125F, 0.0F)).a(0.5F);

   public chk(bsz<? extends chk> $$0, dbx $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(azg $$0) {
      this.f(buw.q).a((double)a($$0::a));
      this.f(buw.r).a(b($$0::j));
      this.f(buw.m).a(a($$0::j));
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

   private void a(chr $$0, chm $$1) {
      this.x($$0.a() & 0xFF | $$1.a() << 8 & 0xFF00);
   }

   public chr s() {
      return chr.a(this.gq() & 0xFF);
   }

   public void a(chr $$0) {
      this.x($$0.a() & 0xFF | this.gq() & -256);
   }

   public chm u() {
      return chm.a((this.gq() & 0xFF00) >> 8);
   }

   @Override
   public void a(bqm $$0) {
      cuo $$1 = this.fR();
      super.a($$0);
      cuo $$2 = this.fR();
      if (this.ai > 20 && this.l($$2) && $$1 != $$2) {
         this.a(avz.mI, 0.5F, 1.0F);
      }
   }

   @Override
   protected void a(dml $$0) {
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
   protected avy d(brm $$0) {
      return avz.mN;
   }

   @Override
   protected avy gO() {
      return avz.mH;
   }

   @Override
   public bqt b(cmw $$0, bqs $$1) {
      boolean $$2 = !this.p_() && this.gF() && $$0.fR();
      if (!this.bS() && !$$2) {
         cuo $$3 = $$0.b($$1);
         if (!$$3.e()) {
            if (this.o($$3)) {
               return this.c($$0, $$3);
            }

            if (!this.gF()) {
               this.gV();
               return bqt.a(this.dP().B);
            }
         }

         return super.b($$0, $$1);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public boolean a(cfe $$0) {
      if ($$0 == this) {
         return false;
      } else {
         return !($$0 instanceof chj) && !($$0 instanceof chk) ? false : this.gX() && ((chi)$$0).gX();
      }
   }

   @Nullable
   @Override
   public bsn a(are $$0, bsn $$1) {
      if ($$1 instanceof chj) {
         chn $$2 = bsz.at.a((dbx)$$0);
         if ($$2 != null) {
            this.a($$1, $$2);
         }

         return $$2;
      } else {
         chk $$3 = (chk)$$1;
         chk $$4 = bsz.ab.a((dbx)$$0);
         if ($$4 != null) {
            int $$5 = this.ah.a(9);
            chr $$6;
            if ($$5 < 4) {
               $$6 = this.s();
            } else if ($$5 < 8) {
               $$6 = $$3.s();
            } else {
               $$6 = ac.a(chr.values(), this.ah);
            }

            int $$9 = this.ah.a(5);
            chm $$10;
            if ($$9 < 2) {
               $$10 = this.u();
            } else if ($$9 < 4) {
               $$10 = $$3.u();
            } else {
               $$10 = ac.a(chm.values(), this.ah);
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
   public boolean l(cuo $$0) {
      if ($$0.g() instanceof csc $$1 && $$1.d() == csc.a.a) {
         return true;
      }

      return false;
   }

   @Nullable
   @Override
   public buh a(dcm $$0, bqr $$1, bts $$2, @Nullable buh $$3) {
      azg $$4 = $$0.E_();
      chr $$5;
      if ($$3 instanceof chk.a) {
         $$5 = ((chk.a)$$3).a;
      } else {
         $$5 = ac.a(chr.values(), $$4);
         $$3 = new chk.a($$5);
      }

      this.a($$5, ac.a(chm.values(), $$4));
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public bsw e(bua $$0) {
      return this.p_() ? bZ : super.e($$0);
   }

   public static class a extends bsn.a {
      public final chr a;

      public a(chr $$0) {
         super(true);
         this.a = $$0;
      }
   }
}
