import javax.annotation.Nullable;

public class chk extends chi implements buo<chr> {
   private static final ajw<Integer> ca = aka.a(chk.class, ajy.b);
   private static final bsu cb = bsx.ab.n().a(bst.a().a(bss.a, 0.0F, bsx.ab.m() + 0.125F, 0.0F)).a(0.5F);

   public chk(bsx<? extends chk> $$0, dcw $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(ayw $$0) {
      this.f(buw.s).a((double)a($$0::a));
      this.f(buw.v).a(b($$0::j));
      this.f(buw.o).a(a($$0::j));
   }

   @Override
   protected void a(aka.a $$0) {
      super.a($$0);
      $$0.a(ca, 0);
   }

   @Override
   public void b(ub $$0) {
      super.b($$0);
      $$0.a("Variant", this.x());
   }

   @Override
   public void a(ub $$0) {
      super.a($$0);
      this.x($$0.h("Variant"));
   }

   private void x(int $$0) {
      this.ao.a(ca, $$0);
   }

   private int x() {
      return this.ao.a(ca);
   }

   private void a(chr $$0, chm $$1) {
      this.x($$0.a() & 0xFF | $$1.a() << 8 & 0xFF00);
   }

   public chr s() {
      return chr.a(this.x() & 0xFF);
   }

   public void a(chr $$0) {
      this.x($$0.a() & 0xFF | this.x() & -256);
   }

   public chm t() {
      return chm.a((this.x() & 0xFF00) >> 8);
   }

   @Override
   public void a(bqk $$0) {
      cuq $$1 = this.fO();
      super.a($$0);
      cuq $$2 = this.fO();
      if (this.ai > 20 && this.l($$2) && $$1 != $$2) {
         this.a(avp.mI, 0.5F, 1.0F);
      }
   }

   @Override
   protected void a(dnm $$0) {
      super.a($$0);
      if (this.ah.a(10) == 0) {
         this.a(avp.mJ, $$0.a() * 0.6F, $$0.b());
      }
   }

   @Override
   protected avo v() {
      return avp.mG;
   }

   @Override
   protected avo n_() {
      return avp.mK;
   }

   @Nullable
   @Override
   protected avo gm() {
      return avp.mL;
   }

   @Override
   protected avo d(brk $$0) {
      return avp.mN;
   }

   @Override
   protected avo gJ() {
      return avp.mH;
   }

   @Override
   public bqr b(cmx $$0, bqq $$1) {
      boolean $$2 = !this.o_() && this.gz() && $$0.fN();
      if (!this.bT() && !$$2) {
         cuq $$3 = $$0.b($$1);
         if (!$$3.e()) {
            if (this.o($$3)) {
               return this.c($$0, $$3);
            }

            if (!this.gz()) {
               this.gQ();
               return bqr.a(this.dO().B);
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
         return !($$0 instanceof chj) && !($$0 instanceof chk) ? false : this.gS() && ((chi)$$0).gS();
      }
   }

   @Nullable
   @Override
   public bsl a(aqu $$0, bsl $$1) {
      if ($$1 instanceof chj) {
         chn $$2 = bsx.at.a((dcw)$$0);
         if ($$2 != null) {
            this.a($$1, $$2);
         }

         return $$2;
      } else {
         chk $$3 = (chk)$$1;
         chk $$4 = bsx.ab.a((dcw)$$0);
         if ($$4 != null) {
            int $$5 = this.ah.a(9);
            chr $$6;
            if ($$5 < 4) {
               $$6 = this.s();
            } else if ($$5 < 8) {
               $$6 = $$3.s();
            } else {
               $$6 = ad.a(chr.values(), this.ah);
            }

            int $$9 = this.ah.a(5);
            chm $$10;
            if ($$9 < 2) {
               $$10 = this.t();
            } else if ($$9 < 4) {
               $$10 = $$3.t();
            } else {
               $$10 = ad.a(chm.values(), this.ah);
            }

            $$4.a($$6, $$10);
            this.a($$1, $$4);
         }

         return $$4;
      }
   }

   @Override
   public boolean d(bsy $$0) {
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
   public buh a(ddl $$0, bqp $$1, btr $$2, @Nullable buh $$3) {
      ayw $$4 = $$0.E_();
      chr $$5;
      if ($$3 instanceof chk.a) {
         $$5 = ((chk.a)$$3).a;
      } else {
         $$5 = ad.a(chr.values(), $$4);
         $$3 = new chk.a($$5);
      }

      this.a($$5, ad.a(chm.values(), $$4));
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public bsu e(bua $$0) {
      return this.o_() ? cb : super.e($$0);
   }

   public static class a extends bsl.a {
      public final chr a;

      public a(chr $$0) {
         super(true);
         this.a = $$0;
      }
   }
}
