import com.google.common.collect.UnmodifiableIterator;
import javax.annotation.Nullable;

public class cif extends cho implements bvu, bwn {
   private static final aks<Boolean> bZ = akw.a(cif.class, aku.k);
   private static final aks<Integer> ca = akw.a(cif.class, aku.b);
   private final bvt cb = new bvt(this.al, ca, bZ);

   public cif(bvi<? extends cif> $$0, dgz $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      this.bT.a(0, new ccp(this));
      this.bT.a(1, new cdo(this, 1.25));
      this.bT.a(3, new cch(this, 1.0));
      this.bT.a(4, new ced(this, 1.2, $$0 -> $$0.a(cxk.ot), false));
      this.bT.a(4, new ced(this, 1.2, $$0 -> $$0.a(axt.ax), false));
      this.bT.a(5, new ccu(this, 1.1));
      this.bT.a(6, new cei(this, 1.0));
      this.bT.a(7, new cdd(this, cpo.class, 6.0F));
      this.bT.a(8, new cdq(this));
   }

   public static bxe.a p() {
      return cho.gt().a(bxf.s, 10.0).a(bxf.v, 0.25);
   }

   @Nullable
   @Override
   public bvx cX() {
      return (bvx)(this.j() && this.da() instanceof cpo $$0 && $$0.b(cxk.ot) ? $$0 : super.cX());
   }

   @Override
   public void a(aks<?> $$0) {
      if (ca.equals($$0) && this.dW().C) {
         this.cb.a();
      }

      super.a($$0);
   }

   @Override
   protected void a(akw.a $$0) {
      super.a($$0);
      $$0.a(bZ, false);
      $$0.a(ca, 0);
   }

   @Override
   public void b(um $$0) {
      super.b($$0);
      this.cb.a($$0);
   }

   @Override
   public void a(um $$0) {
      super.a($$0);
      this.cb.b($$0);
   }

   @Override
   protected awu u() {
      return awv.ua;
   }

   @Override
   protected awu e(btr $$0) {
      return awv.uc;
   }

   @Override
   protected awu o_() {
      return awv.ub;
   }

   @Override
   protected void b(jh $$0, dxo $$1) {
      this.a(awv.ue, 0.15F, 1.0F);
   }

   @Override
   public bta b(cpo $$0, bsz $$1) {
      boolean $$2 = this.j($$0.b($$1));
      if (!$$2 && this.j() && !this.ca() && !$$0.fY()) {
         if (!this.dW().C) {
            $$0.n(this);
         }

         return bta.a;
      } else {
         bta $$3 = super.b($$0, $$1);
         if (!$$3.a()) {
            cxg $$4 = $$0.b($$1);
            return (bta)($$4.a(cxk.on) ? $$4.a($$0, this, $$1) : bta.e);
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
   protected void f(arx $$0) {
      super.f($$0);
      if (this.j()) {
         this.a($$0, cxk.on);
      }
   }

   @Override
   public boolean j() {
      return this.cb.d();
   }

   @Override
   public void a(cxg $$0, @Nullable aww $$1) {
      this.cb.a(true);
      if ($$1 != null) {
         this.dW().a(null, this, awv.ud, $$1, 0.5F, 1.0F);
      }
   }

   @Override
   public fbr b(bvx $$0) {
      jm $$1 = this.cP();
      if ($$1.o() == jm.a.b) {
         return super.b($$0);
      } else {
         int[][] $$2 = crt.a($$1);
         jh $$3 = this.dw();
         jh.a $$4 = new jh.a();
         UnmodifiableIterator var6 = $$0.fO().iterator();

         while (var6.hasNext()) {
            bwj $$5 = (bwj)var6.next();
            fbm $$6 = $$0.f($$5);

            for (int[] $$7 : $$2) {
               $$4.d($$3.u() + $$7[0], $$3.v(), $$3.w() + $$7[1]);
               double $$8 = this.dW().j($$4);
               if (crt.a($$8)) {
                  fbr $$9 = fbr.a($$4, $$8);
                  if (crt.a(this.dW(), $$0, $$6.c($$9))) {
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
   public void a(arx $$0, bvw $$1) {
      if ($$0.am() != bsx.a) {
         cnj $$2 = this.a(bvi.bR, buw.a(this, false, true), $$0x -> {
            if (this.eZ().f()) {
               $$0x.a(bvj.a, new cxg(cxk.pB));
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
   protected void a(cpo $$0, fbr $$1) {
      super.a($$0, $$1);
      this.b($$0.dM(), $$0.dO() * 0.5F);
      this.N = this.aX = this.aZ = this.dM();
      this.cb.b();
   }

   @Override
   protected fbr b(cpo $$0, fbr $$1) {
      return new fbr(0.0, 0.0, 1.0);
   }

   @Override
   protected float e(cpo $$0) {
      return (float)(this.h(bxf.v) * 0.225 * (double)this.cb.c());
   }

   @Override
   public boolean a() {
      return this.cb.a(this.dZ());
   }

   @Nullable
   public cif b(arx $$0, bus $$1) {
      return bvi.aR.a($$0, bvh.e);
   }

   @Override
   public boolean j(cxg $$0) {
      return $$0.a(axt.ax);
   }

   @Override
   public fbr cT() {
      return new fbr(0.0, (double)(0.6F * this.cS()), (double)(this.dr() * 0.4F));
   }
}
