import javax.annotation.Nullable;

public class cqa extends cpb {
   private static final akm<Byte> f = akq.a(cqa.class, ako.a);
   private static final akm<Boolean> g = akq.a(cqa.class, ako.k);
   private boolean h;
   public int e;

   public cqa(bus<? extends cqa> $$0, dfm $$1) {
      super($$0, $$1);
   }

   public cqa(dfm $$0, bvh $$1, cwm $$2) {
      super(bus.bv, $$1, $$0, $$2, null);
      this.al.a(f, this.b($$2));
      this.al.a(g, $$2.B());
   }

   public cqa(dfm $$0, double $$1, double $$2, double $$3, cwm $$4) {
      super(bus.bv, $$1, $$2, $$3, $$0, $$4, $$4);
      this.al.a(f, this.b($$4));
      this.al.a(g, $$4.B());
   }

   @Override
   protected void a(akq.a $$0) {
      super.a($$0);
      $$0.a(f, (byte)0);
      $$0.a(g, false);
   }

   @Override
   public void h() {
      if (this.b > 4) {
         this.h = true;
      }

      bul $$0 = this.p();
      int $$1 = this.al.a(f);
      if ($$1 > 0 && (this.h || this.y()) && $$0 != null) {
         if (!this.D()) {
            if (this.dV() instanceof arp $$2 && this.c == cpb.a.b) {
               this.a($$2, this.q(), 0.1F);
            }

            this.at();
         } else {
            this.b(true);
            ezy $$3 = $$0.bF().d(this.dt());
            this.o(this.dA(), this.dC() + $$3.e * 0.015 * (double)$$1, this.dG());
            double $$4 = 0.05 * (double)$$1;
            this.h(this.dy().c(0.95).e($$3.d().c($$4)));
            if (this.e == 0) {
               this.a(awn.zG, 10.0F, 1.0F);
            }

            this.e++;
         }
      }

      super.h();
   }

   private boolean D() {
      bul $$0 = this.p();
      return $$0 == null || !$$0.bL() ? false : !($$0 instanceof arq) || !$$0.Y_();
   }

   public boolean A() {
      return this.al.a(g);
   }

   @Nullable
   @Override
   protected ezv c(ezy $$0, ezy $$1) {
      return this.h ? null : super.c($$0, $$1);
   }

   @Override
   protected void a(ezv $$0) {
      bul $$1 = $$0.a();
      float $$2 = 8.0F;
      bul $$3 = this.p();
      btb $$4 = this.dW().a(this, (bul)($$3 == null ? this : $$3));
      if (this.dV() instanceof arp $$5) {
         $$2 = dcf.a($$5, this.dZ(), $$1, $$4, $$2);
      }

      this.h = true;
      if ($$1.b($$4, $$2)) {
         if ($$1.aq() == bus.M) {
            return;
         }

         if (this.dV() instanceof arp $$6) {
            dcf.a($$6, $$1, $$4, this.dZ(), $$1x -> this.c($$6));
         }

         if ($$1 instanceof bvh $$7) {
            this.a($$7, $$4);
            this.a($$7);
         }
      }

      this.a(cpo.b, $$1, this.p(), false);
      this.h(this.dy().d(0.02, 0.2, 0.02));
      this.a(awn.zE, 1.0F, 1.0F);
   }

   @Override
   protected void a(arp $$0, ezu $$1, cwm $$2) {
      ezy $$3 = $$1.b().a($$1.g());
      dcf.a($$0, $$2, this.p() instanceof bvh $$4 ? $$4 : null, this, null, $$3, $$0.a_($$1.b()), $$1x -> this.c($$0));
   }

   @Override
   public cwm dZ() {
      return this.t();
   }

   @Override
   protected boolean a(cou $$0) {
      return super.a($$0) || this.y() && this.e($$0) && $$0.gg().f(this.q());
   }

   @Override
   protected cwm s() {
      return new cwm(cwq.wk);
   }

   @Override
   protected awm l() {
      return awn.zF;
   }

   @Override
   public void a_(cou $$0) {
      if (this.e($$0) || this.p() == null) {
         super.a_($$0);
      }
   }

   @Override
   public void a(ul $$0) {
      super.a($$0);
      this.h = $$0.q("DealtDamage");
      this.al.a(f, this.b(this.t()));
   }

   @Override
   public void b(ul $$0) {
      super.b($$0);
      $$0.a("DealtDamage", this.h);
   }

   private byte b(cwm $$0) {
      return this.dV() instanceof arp $$1 ? (byte)azm.a(dcf.c($$1, $$0, this), 0, 127) : 0;
   }

   @Override
   public void j() {
      int $$0 = this.al.a(f);
      if (this.c != cpb.a.b || $$0 <= 0) {
         super.j();
      }
   }

   @Override
   protected float x() {
      return 0.99F;
   }

   @Override
   public boolean k(double $$0, double $$1, double $$2) {
      return true;
   }
}
