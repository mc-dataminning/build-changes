import com.google.common.collect.UnmodifiableIterator;
import javax.annotation.Nullable;

public class cgr extends cga implements buh, buz {
   private static final akg<Boolean> bY = akk.a(cgr.class, aki.k);
   private static final akg<Integer> bZ = akk.a(cgr.class, aki.b);
   private final bug ca = new bug(this.am, bZ, bY);

   public cgr(btv<? extends cgr> $$0, deg $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      this.bS.a(0, new cbb(this));
      this.bS.a(1, new cca(this, 1.25));
      this.bS.a(3, new cat(this, 1.0));
      this.bS.a(4, new ccp(this, 1.2, $$0 -> $$0.a(cvt.nR), false));
      this.bS.a(4, new ccp(this, 1.2, $$0 -> $$0.a(axc.ar), false));
      this.bS.a(5, new cbg(this, 1.1));
      this.bS.a(6, new ccu(this, 1.0));
      this.bS.a(7, new cbp(this, cnu.class, 6.0F));
      this.bS.a(8, new ccc(this));
   }

   public static bvq.a q() {
      return cga.gu().a(bvr.s, 10.0).a(bvr.v, 0.25);
   }

   @Nullable
   @Override
   public buk cU() {
      return (buk)(this.i() && this.cX() instanceof cnu $$0 && $$0.b(cvt.nR) ? $$0 : super.cU());
   }

   @Override
   public void a(akg<?> $$0) {
      if (bZ.equals($$0) && this.dS().B) {
         this.ca.a();
      }

      super.a($$0);
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(bY, false);
      $$0.a(bZ, 0);
   }

   @Override
   public void b(uf $$0) {
      super.b($$0);
      this.ca.a($$0);
   }

   @Override
   public void a(uf $$0) {
      super.a($$0);
      this.ca.b($$0);
   }

   @Override
   protected awd w() {
      return awe.tB;
   }

   @Override
   protected awd d(bsg $$0) {
      return awe.tD;
   }

   @Override
   protected awd n_() {
      return awe.tC;
   }

   @Override
   protected void b(je $$0, duo $$1) {
      this.a(awe.tF, 0.15F, 1.0F);
   }

   @Override
   public brp b(cnu $$0, bro $$1) {
      boolean $$2 = this.n($$0.b($$1));
      if (!$$2 && this.i() && !this.bX() && !$$0.fS()) {
         if (!this.dS().B) {
            $$0.n(this);
         }

         return brp.a;
      } else {
         brp $$3 = super.b($$0, $$1);
         if (!$$3.a()) {
            cvp $$4 = $$0.b($$1);
            return (brp)($$4.a(cvt.nL) ? $$4.a($$0, this, $$1) : brp.e);
         } else {
            return $$3;
         }
      }
   }

   @Override
   public boolean f() {
      return this.bI() && !this.o_();
   }

   @Override
   protected void eD() {
      super.eD();
      if (this.i()) {
         this.a(cvt.nL);
      }
   }

   @Override
   public boolean i() {
      return this.ca.d();
   }

   @Override
   public void a(cvp $$0, @Nullable awf $$1) {
      this.ca.a(true);
      if ($$1 != null) {
         this.dS().a(null, this, awe.tE, $$1, 0.5F, 1.0F);
      }
   }

   @Override
   public eys b(buk $$0) {
      jj $$1 = this.cM();
      if ($$1.o() == jj.a.b) {
         return super.b($$0);
      } else {
         int[][] $$2 = cpx.a($$1);
         je $$3 = this.ds();
         je.a $$4 = new je.a();
         UnmodifiableIterator var6 = $$0.fJ().iterator();

         while (var6.hasNext()) {
            buw $$5 = (buw)var6.next();
            eyn $$6 = $$0.f($$5);

            for (int[] $$7 : $$2) {
               $$4.d($$3.u() + $$7[0], $$3.v(), $$3.w() + $$7[1]);
               double $$8 = this.dS().j($$4);
               if (cpx.a($$8)) {
                  eys $$9 = eys.a($$4, $$8);
                  if (cpx.a(this.dS(), $$0, $$6.c($$9))) {
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
   public void a(arh $$0, buj $$1) {
      if ($$0.am() != brm.a) {
         clv $$2 = btv.bx.a($$0, btu.i);
         if ($$2 != null) {
            $$2.a(btw.a, new cvp(cvt.oX));
            $$2.b(this.dx(), this.dz(), this.dD(), this.dI(), this.dK());
            $$2.u(this.ge());
            $$2.a(this.o_());
            if (this.ak()) {
               $$2.b(this.al());
               $$2.p(this.cI());
            }

            $$2.fW();
            $$0.b($$2);
            this.as();
         } else {
            super.a($$0, $$1);
         }
      } else {
         super.a($$0, $$1);
      }
   }

   @Override
   protected void a(cnu $$0, eys $$1) {
      super.a($$0, $$1);
      this.a($$0.dI(), $$0.dK() * 0.5F);
      this.O = this.aT = this.aV = this.dI();
      this.ca.b();
   }

   @Override
   protected eys b(cnu $$0, eys $$1) {
      return new eys(0.0, 0.0, 1.0);
   }

   @Override
   protected float e(cnu $$0) {
      return (float)(this.h(bvr.v) * 0.225 * (double)this.ca.c());
   }

   @Override
   public boolean a() {
      return this.ca.a(this.dV());
   }

   @Nullable
   public cgr b(arh $$0, bth $$1) {
      return btv.az.a($$0, btu.e);
   }

   @Override
   public boolean n(cvp $$0) {
      return $$0.a(axc.ar);
   }

   @Override
   public eys cQ() {
      return new eys(0.0, (double)(0.6F * this.cP()), (double)(this.dn() * 0.4F));
   }
}
