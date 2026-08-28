import javax.annotation.Nullable;

public class crc extends cqd {
   private static final alc<Byte> f = alg.a(crc.class, ale.a);
   private static final alc<Boolean> g = alg.a(crc.class, ale.k);
   private boolean h;
   public int e;

   public crc(bvq<? extends crc> $$0, dhh $$1) {
      super($$0, $$1);
   }

   public crc(dhh $$0, bwf $$1, cxo $$2) {
      super(bvq.bz, $$1, $$0, $$2, null);
      this.al.a(f, this.b($$2));
      this.al.a(g, $$2.B());
   }

   public crc(dhh $$0, double $$1, double $$2, double $$3, cxo $$4) {
      super(bvq.bz, $$1, $$2, $$3, $$0, $$4, $$4);
      this.al.a(f, this.b($$4));
      this.al.a(g, $$4.B());
   }

   @Override
   protected void a(alg.a $$0) {
      super.a($$0);
      $$0.a(f, (byte)0);
      $$0.a(g, false);
   }

   @Override
   public void h() {
      if (this.b > 4) {
         this.h = true;
      }

      bvj $$0 = this.p();
      int $$1 = this.al.a(f);
      if ($$1 > 0 && (this.h || this.B()) && $$0 != null) {
         if (!this.G()) {
            if (this.dW() instanceof ash $$2 && this.c == cqd.a.b) {
               this.a($$2, this.u(), 0.1F);
            }

            this.at();
         } else {
            if (!($$0 instanceof cpw) && this.du().f($$0.bF()) < (double)$$0.dr() + 1.0) {
               this.at();
               return;
            }

            this.r(true);
            fbx $$3 = $$0.bF().d(this.du());
            this.o(this.dB(), this.dD() + $$3.e * 0.015 * (double)$$1, this.dH());
            double $$4 = 0.05 * (double)$$1;
            this.h(this.dz().c(0.95).e($$3.d().c($$4)));
            if (this.e == 0) {
               this.a(axf.Ab, 10.0F, 1.0F);
            }

            this.e++;
         }
      }

      super.h();
   }

   private boolean G() {
      bvj $$0 = this.p();
      return $$0 == null || !$$0.bL() ? false : !($$0 instanceof asi) || !$$0.aa_();
   }

   public boolean D() {
      return this.al.a(g);
   }

   @Nullable
   @Override
   protected fbu c(fbx $$0, fbx $$1) {
      return this.h ? null : super.c($$0, $$1);
   }

   @Override
   protected void a(fbu $$0) {
      bvj $$1 = $$0.a();
      float $$2 = 8.0F;
      bvj $$3 = this.p();
      btz $$4 = this.dX().a(this, (bvj)($$3 == null ? this : $$3));
      if (this.dW() instanceof ash $$5) {
         $$2 = dea.a($$5, this.ea(), $$1, $$4, $$2);
      }

      this.h = true;
      if ($$1.b($$4, $$2)) {
         if ($$1.aq() == bvq.O) {
            return;
         }

         if (this.dW() instanceof ash $$6) {
            dea.a($$6, $$1, $$4, this.ea(), $$1x -> this.c($$6));
         }

         if ($$1 instanceof bwf $$7) {
            this.a($$7, $$4);
            this.a($$7);
         }
      }

      this.a(cqq.b, $$1, this.p(), false);
      this.h(this.dz().d(0.02, 0.2, 0.02));
      this.a(axf.zZ, 1.0F, 1.0F);
   }

   @Override
   protected void a(ash $$0, fbt $$1, cxo $$2) {
      fbx $$3 = $$1.b().a($$1.g());
      dea.a($$0, $$2, this.p() instanceof bwf $$4 ? $$4 : null, this, null, $$3, $$0.a_($$1.b()), $$1x -> this.c($$0));
   }

   @Override
   public cxo ea() {
      return this.w();
   }

   @Override
   protected boolean a(cpw $$0) {
      return super.a($$0) || this.B() && this.e($$0) && $$0.gi().f(this.u());
   }

   @Override
   protected cxo v() {
      return new cxo(cxs.wI);
   }

   @Override
   protected axe s() {
      return axf.Aa;
   }

   @Override
   public void a_(cpw $$0) {
      if (this.e($$0) || this.p() == null) {
         super.a_($$0);
      }
   }

   @Override
   public void a(ux $$0) {
      super.a($$0);
      this.h = $$0.q("DealtDamage");
      this.al.a(f, this.b(this.w()));
   }

   @Override
   public void b(ux $$0) {
      super.b($$0);
      $$0.a("DealtDamage", this.h);
   }

   private byte b(cxo $$0) {
      return this.dW() instanceof ash $$1 ? (byte)bae.a(dea.c($$1, $$0, this), 0, 127) : 0;
   }

   @Override
   public void m() {
      int $$0 = this.al.a(f);
      if (this.c != cqd.a.b || $$0 <= 0) {
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
