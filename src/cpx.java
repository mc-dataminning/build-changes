import javax.annotation.Nullable;

public class cpx extends coy {
   private static final ako<Byte> g = aks.a(cpx.class, akq.a);
   private static final ako<Boolean> h = aks.a(cpx.class, akq.k);
   private boolean i;
   public int f;

   public cpx(bup<? extends cpx> $$0, dff $$1) {
      super($$0, $$1);
   }

   public cpx(dff $$0, bve $$1, cwf $$2) {
      super(bup.bf, $$1, $$0, $$2, null);
      this.am.a(g, this.c($$2));
      this.am.a(h, $$2.B());
   }

   public cpx(dff $$0, double $$1, double $$2, double $$3, cwf $$4) {
      super(bup.bf, $$1, $$2, $$3, $$0, $$4, $$4);
      this.am.a(g, this.c($$4));
      this.am.a(h, $$4.B());
   }

   @Override
   protected void a(aks.a $$0) {
      super.a($$0);
      $$0.a(g, (byte)0);
      $$0.a(h, false);
   }

   @Override
   public void l() {
      if (this.c > 4) {
         this.i = true;
      }

      bui $$0 = this.s();
      int $$1 = this.am.a(g);
      if ($$1 > 0 && (this.i || this.B()) && $$0 != null) {
         if (!this.G()) {
            if (!this.dY().C && this.d == coy.a.b) {
               this.a(this.t(), 0.1F);
            }

            this.av();
         } else {
            this.b(true);
            ezr $$2 = $$0.bH().d(this.dw());
            this.o(this.dD(), this.dF() + $$2.e * 0.015 * (double)$$1, this.dJ());
            double $$3 = 0.05 * (double)$$1;
            this.h(this.dB().c(0.95).e($$2.d().c($$3)));
            if (this.f == 0) {
               this.a(awo.zG, 10.0F, 1.0F);
            }

            this.f++;
         }
      }

      super.l();
   }

   private boolean G() {
      bui $$0 = this.s();
      return $$0 == null || !$$0.bN() ? false : !($$0 instanceof arr) || !$$0.R_();
   }

   public boolean D() {
      return this.am.a(h);
   }

   @Nullable
   @Override
   protected ezo c(ezr $$0, ezr $$1) {
      return this.i ? null : super.c($$0, $$1);
   }

   @Override
   protected void a(ezo $$0) {
      bui $$1 = $$0.a();
      float $$2 = 8.0F;
      bui $$3 = this.s();
      bsy $$4 = this.dZ().a(this, (bui)($$3 == null ? this : $$3));
      if (this.dY() instanceof arq $$5) {
         $$2 = dby.a($$5, this.ec(), $$1, $$4, $$2);
      }

      this.i = true;
      if ($$1.a($$4, $$2)) {
         if ($$1.ar() == bup.H) {
            return;
         }

         if (this.dY() instanceof arq $$6) {
            dby.a($$6, $$1, $$4, this.ec(), $$0x -> this.au());
         }

         if ($$1 instanceof bve $$7) {
            this.a($$7, $$4);
            this.a($$7);
         }
      }

      this.a(cpl.b, $$1, this.s(), false);
      this.h(this.dB().d(0.02, 0.2, 0.02));
      this.a(awo.zE, 1.0F, 1.0F);
   }

   @Override
   protected void a(arq $$0, ezn $$1, cwf $$2) {
      ezr $$3 = $$1.b().a($$1.g());
      dby.a($$0, $$2, this.s() instanceof bve $$4 ? $$4 : null, this, null, $$3, $$0.a_($$1.b()), $$0x -> this.au());
   }

   @Override
   public cwf ec() {
      return this.w();
   }

   @Override
   protected boolean a(cor $$0) {
      return super.a($$0) || this.B() && this.e($$0) && $$0.gl().f(this.t());
   }

   @Override
   protected cwf v() {
      return new cwf(cwj.wk);
   }

   @Override
   protected awn o() {
      return awo.zF;
   }

   @Override
   public void b_(cor $$0) {
      if (this.e($$0) || this.s() == null) {
         super.b_($$0);
      }
   }

   @Override
   public void a(un $$0) {
      super.a($$0);
      this.i = $$0.q("DealtDamage");
      this.am.a(g, this.c(this.w()));
   }

   @Override
   public void b(un $$0) {
      super.b($$0);
      $$0.a("DealtDamage", this.i);
   }

   private byte c(cwf $$0) {
      return this.dY() instanceof arq $$1 ? (byte)azn.a(dby.c($$1, $$0, this), 0, 127) : 0;
   }

   @Override
   public void m() {
      int $$0 = this.am.a(g);
      if (this.d != coy.a.b || $$0 <= 0) {
         super.m();
      }
   }

   @Override
   protected float A() {
      return 0.99F;
   }

   @Override
   public boolean k(double $$0, double $$1, double $$2) {
      return true;
   }
}
