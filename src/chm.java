import com.google.common.collect.UnmodifiableIterator;
import javax.annotation.Nullable;

public class chm extends cgv implements bvb, bvu {
   private static final ako<Boolean> bY = aks.a(chm.class, akq.k);
   private static final ako<Integer> bZ = aks.a(chm.class, akq.b);
   private final bva ca = new bva(this.am, bZ, bY);

   public chm(bup<? extends chm> $$0, dff $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      this.bS.a(0, new cbw(this));
      this.bS.a(1, new ccv(this, 1.25));
      this.bS.a(3, new cbo(this, 1.0));
      this.bS.a(4, new cdk(this, 1.2, $$0 -> $$0.a(cwj.nR), false));
      this.bS.a(4, new cdk(this, 1.2, $$0 -> $$0.a(axm.aw), false));
      this.bS.a(5, new ccb(this, 1.1));
      this.bS.a(6, new cdp(this, 1.0));
      this.bS.a(7, new cck(this, cor.class, 6.0F));
      this.bS.a(8, new ccx(this));
   }

   public static bwl.a q() {
      return cgv.gA().a(bwm.s, 10.0).a(bwm.v, 0.25);
   }

   @Nullable
   @Override
   public bve cZ() {
      return (bve)(this.i() && this.dc() instanceof cor $$0 && $$0.b(cwj.nR) ? $$0 : super.cZ());
   }

   @Override
   public void a(ako<?> $$0) {
      if (bZ.equals($$0) && this.dY().C) {
         this.ca.a();
      }

      super.a($$0);
   }

   @Override
   protected void a(aks.a $$0) {
      super.a($$0);
      $$0.a(bY, false);
      $$0.a(bZ, 0);
   }

   @Override
   public void b(un $$0) {
      super.b($$0);
      this.ca.a($$0);
   }

   @Override
   public void a(un $$0) {
      super.a($$0);
      this.ca.b($$0);
   }

   @Override
   protected awn w() {
      return awo.tz;
   }

   @Override
   protected awn d(bsy $$0) {
      return awo.tB;
   }

   @Override
   protected awn o_() {
      return awo.tA;
   }

   @Override
   protected void b(jh $$0, dvo $$1) {
      this.a(awo.tD, 0.15F, 1.0F);
   }

   @Override
   public bsh b(cor $$0, bsg $$1) {
      boolean $$2 = this.l($$0.b($$1));
      if (!$$2 && this.i() && !this.cc() && !$$0.gb()) {
         if (!this.dY().C) {
            $$0.n(this);
         }

         return bsh.a;
      } else {
         bsh $$3 = super.b($$0, $$1);
         if (!$$3.a()) {
            cwf $$4 = $$0.b($$1);
            return (bsh)($$4.a(cwj.nL) ? $$4.a($$0, this, $$1) : bsh.e);
         } else {
            return $$3;
         }
      }
   }

   @Override
   public boolean f() {
      return this.bN() && !this.p_();
   }

   @Override
   protected void eK() {
      super.eK();
      if (this.i()) {
         this.a(cwj.nL);
      }
   }

   @Override
   public boolean i() {
      return this.ca.d();
   }

   @Override
   public void a(cwf $$0, @Nullable awp $$1) {
      this.ca.a(true);
      if ($$1 != null) {
         this.dY().a(null, this, awo.tC, $$1, 0.5F, 1.0F);
      }
   }

   @Override
   public ezr b(bve $$0) {
      jm $$1 = this.cR();
      if ($$1.o() == jm.a.b) {
         return super.b($$0);
      } else {
         int[][] $$2 = cqt.a($$1);
         jh $$3 = this.dy();
         jh.a $$4 = new jh.a();
         UnmodifiableIterator var6 = $$0.fR().iterator();

         while (var6.hasNext()) {
            bvq $$5 = (bvq)var6.next();
            ezm $$6 = $$0.f($$5);

            for (int[] $$7 : $$2) {
               $$4.d($$3.u() + $$7[0], $$3.v(), $$3.w() + $$7[1]);
               double $$8 = this.dY().j($$4);
               if (cqt.a($$8)) {
                  ezr $$9 = ezr.a($$4, $$8);
                  if (cqt.a(this.dY(), $$0, $$6.c($$9))) {
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
   public void a(arq $$0, bvd $$1) {
      if ($$0.ak() != bse.a) {
         cmq $$2 = this.a(bup.bx, bud.a(this, false, true), $$0x -> {
            if (this.fc().f()) {
               $$0x.a(buq.a, new cwf(cwj.oX));
            }

            $$0x.gb();
         });
         if ($$2 == null) {
            super.a($$0, $$1);
         }
      } else {
         super.a($$0, $$1);
      }
   }

   @Override
   protected void a(cor $$0, ezr $$1) {
      super.a($$0, $$1);
      this.a($$0.dO(), $$0.dQ() * 0.5F);
      this.O = this.aX = this.aZ = this.dO();
      this.ca.b();
   }

   @Override
   protected ezr b(cor $$0, ezr $$1) {
      return new ezr(0.0, 0.0, 1.0);
   }

   @Override
   protected float e(cor $$0) {
      return (float)(this.h(bwm.v) * 0.225 * (double)this.ca.c());
   }

   @Override
   public boolean a() {
      return this.ca.a(this.eb());
   }

   @Nullable
   public chm b(arq $$0, btz $$1) {
      return bup.az.a($$0, buo.e);
   }

   @Override
   public boolean l(cwf $$0) {
      return $$0.a(axm.aw);
   }

   @Override
   public ezr cV() {
      return new ezr(0.0, (double)(0.6F * this.cU()), (double)(this.dt() * 0.4F));
   }
}
