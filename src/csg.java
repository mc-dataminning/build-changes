import javax.annotation.Nullable;

public class csg extends crf {
   private static final akj<Byte> e = akn.a(csg.class, akl.a);
   private static final akj<Boolean> f = akn.a(csg.class, akl.k);
   private static final float g = 0.99F;
   private boolean h;
   public int d;

   public csg(bwm<? extends csg> $$0, div $$1) {
      super($$0, $$1);
   }

   public csg(div $$0, bxc $$1, cyy $$2) {
      super(bwm.bz, $$1, $$0, $$2, null);
      this.al.a(e, this.b($$2));
      this.al.a(f, $$2.C());
   }

   public csg(div $$0, double $$1, double $$2, double $$3, cyy $$4) {
      super(bwm.bz, $$1, $$2, $$3, $$0, $$4, $$4);
      this.al.a(e, this.b($$4));
      this.al.a(f, $$4.C());
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(e, (byte)0);
      $$0.a(f, false);
   }

   @Override
   public void h() {
      if (this.a > 4) {
         this.h = true;
      }

      bwd $$0 = this.q();
      int $$1 = this.al.a(e);
      if ($$1 > 0 && (this.h || this.w()) && $$0 != null) {
         if (!this.B()) {
            if (this.dV() instanceof arq $$2 && this.b == crf.a.b) {
               this.a($$2, this.n(), 0.1F);
            }

            this.at();
         } else {
            if (!($$0 instanceof cqy) && this.dt().f($$0.bE()) < (double)$$0.dq() + 1.0) {
               this.at();
               return;
            }

            this.q(true);
            fei $$3 = $$0.bE().d(this.dt());
            this.o(this.dA(), this.dC() + $$3.e * 0.015 * (double)$$1, this.dG());
            double $$4 = 0.05 * (double)$$1;
            this.i(this.dy().c(0.95).e($$3.d().c($$4)));
            if (this.d == 0) {
               this.a(awn.AD, 10.0F, 1.0F);
            }

            this.d++;
         }
      }

      super.h();
   }

   private boolean B() {
      bwd $$0 = this.q();
      return $$0 == null || !$$0.bK() ? false : !($$0 instanceof arr) || !$$0.U_();
   }

   @Override
   public boolean y() {
      return this.al.a(f);
   }

   @Nullable
   @Override
   protected fef c(fei $$0, fei $$1) {
      return this.h ? null : super.c($$0, $$1);
   }

   @Override
   protected void a(fef $$0) {
      bwd $$1 = $$0.a();
      float $$2 = 8.0F;
      bwd $$3 = this.q();
      bus $$4 = this.dW().a(this, (bwd)($$3 == null ? this : $$3));
      if (this.dV() instanceof arq $$5) {
         $$2 = dfn.a($$5, this.dZ(), $$1, $$4, $$2);
      }

      this.h = true;
      if ($$1.b($$4, $$2)) {
         if ($$1.aq() == bwm.N) {
            return;
         }

         if (this.dV() instanceof arq $$6) {
            dfn.a($$6, $$1, $$4, this.dZ(), $$1x -> this.c($$6));
         }

         if ($$1 instanceof bxc $$7) {
            this.a($$7, $$4);
            this.a($$7);
         }
      }

      this.a(crt.b, $$1, this.q(), false);
      this.i(this.dy().d(0.02, 0.2, 0.02));
      this.a(awn.AB, 1.0F, 1.0F);
   }

   @Override
   protected void a(arq $$0, fee $$1, cyy $$2) {
      fei $$3 = $$1.b().a($$1.g());
      dfn.a($$0, $$2, this.q() instanceof bxc $$4 ? $$4 : null, this, null, $$3, $$0.a_($$1.b()), $$1x -> this.c($$0));
   }

   @Override
   public cyy dZ() {
      return this.s();
   }

   @Override
   protected boolean a(cqy $$0) {
      return super.a($$0) || this.w() && this.e($$0) && $$0.gi().f(this.n());
   }

   @Override
   protected cyy o() {
      return new cyy(czc.wY);
   }

   @Override
   protected awm j() {
      return awn.AC;
   }

   @Override
   public void a_(cqy $$0) {
      if (this.e($$0) || this.q() == null) {
         super.a_($$0);
      }
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      this.h = $$0.q("DealtDamage");
      this.al.a(e, this.b(this.s()));
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      $$0.a("DealtDamage", this.h);
   }

   private byte b(cyy $$0) {
      return this.dV() instanceof arq $$1 ? (byte)azm.a(dfn.c($$1, $$0, this), 0, 127) : 0;
   }

   @Override
   public void g() {
      int $$0 = this.al.a(e);
      if (this.b != crf.a.b || $$0 <= 0) {
         super.g();
      }
   }

   @Override
   protected float v() {
      return 0.99F;
   }

   @Override
   public boolean k(double $$0, double $$1, double $$2) {
      return true;
   }
}
