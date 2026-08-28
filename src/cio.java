import com.google.common.collect.UnmodifiableIterator;
import javax.annotation.Nullable;

public class cio extends chx implements bwd, bww {
   private static final alc<Boolean> bZ = alg.a(cio.class, ale.k);
   private static final alc<Integer> ca = alg.a(cio.class, ale.b);
   private final bwc cb = new bwc(this.al, ca, bZ);

   public cio(bvr<? extends cio> $$0, dhi $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      this.bT.a(0, new ccy(this));
      this.bT.a(1, new cdx(this, 1.25));
      this.bT.a(3, new ccq(this, 1.0));
      this.bT.a(4, new cem(this, 1.2, $$0 -> $$0.a(cxt.ok), false));
      this.bT.a(4, new cem(this, 1.2, $$0 -> $$0.a(ayd.ax), false));
      this.bT.a(5, new cdd(this, 1.1));
      this.bT.a(6, new cer(this, 1.0));
      this.bT.a(7, new cdm(this, cpx.class, 6.0F));
      this.bT.a(8, new cdz(this));
   }

   public static bxn.a p() {
      return chx.gt().a(bxo.s, 10.0).a(bxo.v, 0.25);
   }

   @Nullable
   @Override
   public bwg cX() {
      return (bwg)(this.j() && this.da() instanceof cpx $$0 && $$0.b(cxt.ok) ? $$0 : super.cX());
   }

   @Override
   public void a(alc<?> $$0) {
      if (ca.equals($$0) && this.dW().C) {
         this.cb.a();
      }

      super.a($$0);
   }

   @Override
   protected void a(alg.a $$0) {
      super.a($$0);
      $$0.a(bZ, false);
      $$0.a(ca, 0);
   }

   @Override
   public void b(ux $$0) {
      super.b($$0);
      this.cb.a($$0);
   }

   @Override
   public void a(ux $$0) {
      super.a($$0);
      this.cb.b($$0);
   }

   @Override
   protected axe u() {
      return axf.tU;
   }

   @Override
   protected axe e(bua $$0) {
      return axf.tW;
   }

   @Override
   protected axe o_() {
      return axf.tV;
   }

   @Override
   protected void b(jh $$0, dxv $$1) {
      this.a(axf.tY, 0.15F, 1.0F);
   }

   @Override
   public btj b(cpx $$0, bti $$1) {
      boolean $$2 = this.j($$0.b($$1));
      if (!$$2 && this.j() && !this.ca() && !$$0.fY()) {
         if (!this.dW().C) {
            $$0.n(this);
         }

         return btj.a;
      } else {
         btj $$3 = super.b($$0, $$1);
         if (!$$3.a()) {
            cxp $$4 = $$0.b($$1);
            return (btj)($$4.a(cxt.oe) ? $$4.a($$0, this, $$1) : btj.e);
         } else {
            return $$3;
         }
      }
   }

   @Override
   public boolean f() {
      return this.bL() && !this.e_();
   }

   @Override
   protected void f(ash $$0) {
      super.f($$0);
      if (this.j()) {
         this.a($$0, cxt.oe);
      }
   }

   @Override
   public boolean j() {
      return this.cb.d();
   }

   @Override
   public void a(cxp $$0, @Nullable axg $$1) {
      this.cb.a(true);
      if ($$1 != null) {
         this.dW().a(null, this, axf.tX, $$1, 0.5F, 1.0F);
      }
   }

   @Override
   public fby b(bwg $$0) {
      jm $$1 = this.cP();
      if ($$1.o() == jm.a.b) {
         return super.b($$0);
      } else {
         int[][] $$2 = csc.a($$1);
         jh $$3 = this.dw();
         jh.a $$4 = new jh.a();
         UnmodifiableIterator var6 = $$0.fO().iterator();

         while (var6.hasNext()) {
            bws $$5 = (bws)var6.next();
            fbt $$6 = $$0.f($$5);

            for (int[] $$7 : $$2) {
               $$4.d($$3.u() + $$7[0], $$3.v(), $$3.w() + $$7[1]);
               double $$8 = this.dW().j($$4);
               if (csc.a($$8)) {
                  fby $$9 = fby.a($$4, $$8);
                  if (csc.a(this.dW(), $$0, $$6.c($$9))) {
                     $$0.b($$5);
                     return $$9;
                  }
               }
            }
         }

         return super.b($$0);
      }
   }

   @Override
   public void a(ash $$0, bwf $$1) {
      if ($$0.al() != btg.a) {
         cns $$2 = this.a(bvr.bR, bvf.a(this, false, true), $$0x -> {
            if (this.eZ().f()) {
               $$0x.a(bvs.a, new cxp(cxt.ps));
            }

            $$0x.ai();
         });
         if ($$2 == null) {
            super.a($$0, $$1);
         }
      } else {
         super.a($$0, $$1);
      }
   }

   @Override
   protected void a(cpx $$0, fby $$1) {
      super.a($$0, $$1);
      this.b($$0.dM(), $$0.dO() * 0.5F);
      this.N = this.aX = this.aZ = this.dM();
      this.cb.b();
   }

   @Override
   protected fby b(cpx $$0, fby $$1) {
      return new fby(0.0, 0.0, 1.0);
   }

   @Override
   protected float e(cpx $$0) {
      return (float)(this.h(bxo.v) * 0.225 * (double)this.cb.c());
   }

   @Override
   public boolean a() {
      return this.cb.a(this.dZ());
   }

   @Nullable
   public cio b(ash $$0, bvb $$1) {
      return bvr.aR.a($$0, bvq.e);
   }

   @Override
   public boolean j(cxp $$0) {
      return $$0.a(ayd.ax);
   }

   @Override
   public fby cT() {
      return new fby(0.0, (double)(0.6F * this.cS()), (double)(this.dr() * 0.4F));
   }
}
