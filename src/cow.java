import javax.annotation.Nullable;

public class cow extends cnw {
   private static final akg<Byte> g = akk.a(cow.class, aki.a);
   private static final akg<Boolean> h = akk.a(cow.class, aki.k);
   private boolean i;
   public int f;

   public cow(btq<? extends cow> $$0, dds $$1) {
      super($$0, $$1);
   }

   public cow(dds $$0, buf $$1, cvl $$2) {
      super(btq.bf, $$1, $$0, $$2, null);
      this.am.a(g, this.c($$2));
      this.am.a(h, $$2.z());
   }

   public cow(dds $$0, double $$1, double $$2, double $$3, cvl $$4) {
      super(btq.bf, $$1, $$2, $$3, $$0, $$4, $$4);
      this.am.a(g, this.c($$4));
      this.am.a(h, $$4.z());
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(g, (byte)0);
      $$0.a(h, false);
   }

   @Override
   public void l() {
      if (this.c > 4) {
         this.i = true;
      }

      btj $$0 = this.s();
      int $$1 = this.am.a(g);
      if ($$1 > 0 && (this.i || this.C()) && $$0 != null) {
         if (!this.G()) {
            if (!this.dS().B && this.d == cnw.a.b) {
               this.a(this.t(), 0.1F);
            }

            this.as();
         } else {
            this.b(true);
            eye $$2 = $$0.bC().d(this.dq());
            this.o(this.dx(), this.dz() + $$2.e * 0.015 * (double)$$1, this.dD());
            if (this.dS().B) {
               this.ac = this.dz();
            }

            double $$3 = 0.05 * (double)$$1;
            this.h(this.dv().c(0.95).e($$2.d().c($$3)));
            if (this.f == 0) {
               this.a(awd.zI, 10.0F, 1.0F);
            }

            this.f++;
         }
      }

      super.l();
   }

   private boolean G() {
      btj $$0 = this.s();
      return $$0 == null || !$$0.bI() ? false : !($$0 instanceof arh) || !$$0.P_();
   }

   @Override
   public boolean D() {
      return this.am.a(h);
   }

   @Nullable
   @Override
   protected eyb a(eye $$0, eye $$1) {
      return this.i ? null : super.a($$0, $$1);
   }

   @Override
   protected void a(eyb $$0) {
      btj $$1 = $$0.a();
      float $$2 = 8.0F;
      btj $$3 = this.s();
      bsb $$4 = this.dT().a(this, (btj)($$3 == null ? this : $$3));
      if (this.dS() instanceof arg $$5) {
         $$2 = day.a($$5, this.dW(), $$1, $$4, $$2);
      }

      this.i = true;
      if ($$1.a($$4, $$2)) {
         if ($$1.ao() == btq.H) {
            return;
         }

         if (this.dS() instanceof arg $$6) {
            day.a($$6, $$1, $$4, this.dW());
         }

         if ($$1 instanceof buf $$7) {
            this.a($$7, $$4);
            this.a($$7);
         }
      }

      this.h(this.dv().d(-0.01, -0.1, -0.01));
      this.a(awd.zG, 1.0F, 1.0F);
   }

   @Override
   protected void a(arg $$0, eya $$1, cvl $$2) {
      eye $$3 = $$1.a().a($$1.e());
      day.a($$0, $$2, this.s() instanceof buf $$4 ? $$4 : null, this, null, $$3, $$0.a_($$1.a()), $$0x -> this.ar());
   }

   @Override
   public cvl dW() {
      return this.w();
   }

   @Override
   protected boolean a(cnp $$0) {
      return super.a($$0) || this.C() && this.e($$0) && $$0.gc().f(this.t());
   }

   @Override
   protected cvl v() {
      return new cvl(cvo.vU);
   }

   @Override
   protected awc o() {
      return awd.zH;
   }

   @Override
   public void b_(cnp $$0) {
      if (this.e($$0) || this.s() == null) {
         super.b_($$0);
      }
   }

   @Override
   public void a(uf $$0) {
      super.a($$0);
      this.i = $$0.q("DealtDamage");
      this.am.a(g, this.c(this.w()));
   }

   @Override
   public void b(uf $$0) {
      super.b($$0);
      $$0.a("DealtDamage", this.i);
   }

   private byte c(cvl $$0) {
      return this.dS() instanceof arg $$1 ? (byte)azc.a(day.c($$1, $$0, this), 0, 127) : 0;
   }

   @Override
   public void m() {
      int $$0 = this.am.a(g);
      if (this.d != cnw.a.b || $$0 <= 0) {
         super.m();
      }
   }

   @Override
   protected float B() {
      return 0.99F;
   }

   @Override
   public boolean k(double $$0, double $$1, double $$2) {
      return true;
   }
}
