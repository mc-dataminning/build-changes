import javax.annotation.Nullable;

public class csa extends cqz {
   private static final akh<Byte> e = akl.a(csa.class, akj.a);
   private static final akh<Boolean> f = akl.a(csa.class, akj.k);
   private static final float g = 0.99F;
   private boolean h;
   public int d;

   public csa(bwj<? extends csa> $$0, dip $$1) {
      super($$0, $$1);
   }

   public csa(dip $$0, bwz $$1, cys $$2) {
      super(bwj.bz, $$1, $$0, $$2, null);
      this.al.a(e, this.b($$2));
      this.al.a(f, $$2.C());
   }

   public csa(dip $$0, double $$1, double $$2, double $$3, cys $$4) {
      super(bwj.bz, $$1, $$2, $$3, $$0, $$4, $$4);
      this.al.a(e, this.b($$4));
      this.al.a(f, $$4.C());
   }

   @Override
   protected void a(akl.a $$0) {
      super.a($$0);
      $$0.a(e, (byte)0);
      $$0.a(f, false);
   }

   @Override
   public void h() {
      if (this.a > 4) {
         this.h = true;
      }

      bwa $$0 = this.q();
      int $$1 = this.al.a(e);
      if ($$1 > 0 && (this.h || this.w()) && $$0 != null) {
         if (!this.B()) {
            if (this.dV() instanceof aro $$2 && this.b == cqz.a.b) {
               this.a($$2, this.n(), 0.1F);
            }

            this.at();
         } else {
            if (!($$0 instanceof cqs) && this.dt().f($$0.bE()) < (double)$$0.dq() + 1.0) {
               this.at();
               return;
            }

            this.q(true);
            fdw $$3 = $$0.bE().d(this.dt());
            this.o(this.dA(), this.dC() + $$3.e * 0.015 * (double)$$1, this.dG());
            double $$4 = 0.05 * (double)$$1;
            this.i(this.dy().c(0.95).e($$3.d().c($$4)));
            if (this.d == 0) {
               this.a(awl.AA, 10.0F, 1.0F);
            }

            this.d++;
         }
      }

      super.h();
   }

   private boolean B() {
      bwa $$0 = this.q();
      return $$0 == null || !$$0.bK() ? false : !($$0 instanceof arp) || !$$0.U_();
   }

   @Override
   public boolean y() {
      return this.al.a(f);
   }

   @Nullable
   @Override
   protected fdt c(fdw $$0, fdw $$1) {
      return this.h ? null : super.c($$0, $$1);
   }

   @Override
   protected void a(fdt $$0) {
      bwa $$1 = $$0.a();
      float $$2 = 8.0F;
      bwa $$3 = this.q();
      bup $$4 = this.dW().a(this, (bwa)($$3 == null ? this : $$3));
      if (this.dV() instanceof aro $$5) {
         $$2 = dfh.a($$5, this.dZ(), $$1, $$4, $$2);
      }

      this.h = true;
      if ($$1.b($$4, $$2)) {
         if ($$1.aq() == bwj.N) {
            return;
         }

         if (this.dV() instanceof aro $$6) {
            dfh.a($$6, $$1, $$4, this.dZ(), $$1x -> this.c($$6));
         }

         if ($$1 instanceof bwz $$7) {
            this.a($$7, $$4);
            this.a($$7);
         }
      }

      this.a(crn.b, $$1, this.q(), false);
      this.i(this.dy().d(0.02, 0.2, 0.02));
      this.a(awl.Ay, 1.0F, 1.0F);
   }

   @Override
   protected void a(aro $$0, fds $$1, cys $$2) {
      fdw $$3 = $$1.b().a($$1.g());
      dfh.a($$0, $$2, this.q() instanceof bwz $$4 ? $$4 : null, this, null, $$3, $$0.a_($$1.b()), $$1x -> this.c($$0));
   }

   @Override
   public cys dZ() {
      return this.s();
   }

   @Override
   protected boolean a(cqs $$0) {
      return super.a($$0) || this.w() && this.e($$0) && $$0.gi().f(this.n());
   }

   @Override
   protected cys o() {
      return new cys(cyw.wW);
   }

   @Override
   protected awk j() {
      return awl.Az;
   }

   @Override
   public void a_(cqs $$0) {
      if (this.e($$0) || this.q() == null) {
         super.a_($$0);
      }
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      this.h = $$0.q("DealtDamage");
      this.al.a(e, this.b(this.s()));
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      $$0.a("DealtDamage", this.h);
   }

   private byte b(cys $$0) {
      return this.dV() instanceof aro $$1 ? (byte)azk.a(dfh.c($$1, $$0, this), 0, 127) : 0;
   }

   @Override
   public void g() {
      int $$0 = this.al.a(e);
      if (this.b != cqz.a.b || $$0 <= 0) {
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
