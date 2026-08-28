import javax.annotation.Nullable;

public class cgx extends cgv implements bub<che> {
   private static final ajp<Integer> ca = ajt.a(cgx.class, ajr.b);
   private static final bsj cb = bsm.ab.n().a(bsi.a().a(bsh.a, 0.0F, bsm.ab.m() + 0.125F, 0.0F)).a(0.5F);

   public cgx(bsm<? extends cgx> $$0, dcf $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(ayo $$0) {
      this.f(buj.s).a((double)a($$0::a));
      this.f(buj.v).a(b($$0::j));
      this.f(buj.o).a(a($$0::j));
   }

   @Override
   protected void a(ajt.a $$0) {
      super.a($$0);
      $$0.a(ca, 0);
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      $$0.a("Variant", this.go());
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      this.w($$0.h("Variant"));
   }

   private void w(int $$0) {
      this.ao.a(ca, $$0);
   }

   private int go() {
      return this.ao.a(ca);
   }

   private void a(che $$0, cgz $$1) {
      this.w($$0.a() & 0xFF | $$1.a() << 8 & 0xFF00);
   }

   public che s() {
      return che.a(this.go() & 0xFF);
   }

   public void a(che $$0) {
      this.w($$0.a() & 0xFF | this.go() & -256);
   }

   public cgz u() {
      return cgz.a((this.go() & 0xFF00) >> 8);
   }

   @Override
   public void a(bpz $$0) {
      cuc $$1 = this.fO();
      super.a($$0);
      cuc $$2 = this.fO();
      if (this.ai > 20 && this.l($$2) && $$1 != $$2) {
         this.a(avh.mI, 0.5F, 1.0F);
      }
   }

   @Override
   protected void a(dmu $$0) {
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
   protected avg o_() {
      return avh.mK;
   }

   @Nullable
   @Override
   protected avg gv() {
      return avh.mL;
   }

   @Override
   protected avg d(bqz $$0) {
      return avh.mN;
   }

   @Override
   protected avg gM() {
      return avh.mH;
   }

   @Override
   public bqg b(cmk $$0, bqf $$1) {
      boolean $$2 = !this.p_() && this.gD() && $$0.fO();
      if (!this.bT() && !$$2) {
         cuc $$3 = $$0.b($$1);
         if (!$$3.e()) {
            if (this.o($$3)) {
               return this.c($$0, $$3);
            }

            if (!this.gD()) {
               this.gT();
               return bqg.a(this.dQ().B);
            }
         }

         return super.b($$0, $$1);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public boolean a(cer $$0) {
      if ($$0 == this) {
         return false;
      } else {
         return !($$0 instanceof cgw) && !($$0 instanceof cgx) ? false : this.gV() && ((cgv)$$0).gV();
      }
   }

   @Nullable
   @Override
   public bsa a(aqm $$0, bsa $$1) {
      if ($$1 instanceof cgw) {
         cha $$2 = bsm.at.a((dcf)$$0);
         if ($$2 != null) {
            this.a($$1, $$2);
         }

         return $$2;
      } else {
         cgx $$3 = (cgx)$$1;
         cgx $$4 = bsm.ab.a((dcf)$$0);
         if ($$4 != null) {
            int $$5 = this.ah.a(9);
            che $$6;
            if ($$5 < 4) {
               $$6 = this.s();
            } else if ($$5 < 8) {
               $$6 = $$3.s();
            } else {
               $$6 = ac.a(che.values(), this.ah);
            }

            int $$9 = this.ah.a(5);
            cgz $$10;
            if ($$9 < 2) {
               $$10 = this.u();
            } else if ($$9 < 4) {
               $$10 = $$3.u();
            } else {
               $$10 = ac.a(cgz.values(), this.ah);
            }

            $$4.a($$6, $$10);
            this.a($$1, $$4);
         }

         return $$4;
      }
   }

   @Override
   public boolean fP() {
      return true;
   }

   @Override
   public boolean l(cuc $$0) {
      if ($$0.g() instanceof crr $$1 && $$1.d() == crr.a.a) {
         return true;
      }

      return false;
   }

   @Nullable
   @Override
   public btu a(dcu $$0, bqe $$1, btf $$2, @Nullable btu $$3) {
      ayo $$4 = $$0.E_();
      che $$5;
      if ($$3 instanceof cgx.a) {
         $$5 = ((cgx.a)$$3).a;
      } else {
         $$5 = ac.a(che.values(), $$4);
         $$3 = new cgx.a($$5);
      }

      this.a($$5, ac.a(cgz.values(), $$4));
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public bsj e(btn $$0) {
      return this.p_() ? cb : super.e($$0);
   }

   public static class a extends bsa.a {
      public final che a;

      public a(che $$0) {
         super(true);
         this.a = $$0;
      }
   }
}
