import com.google.common.collect.UnmodifiableIterator;
import javax.annotation.Nullable;

public class chn extends cgw implements bvc, bvv {
   private static final ajx<Boolean> bY = akb.a(chn.class, ajz.k);
   private static final ajx<Integer> bZ = akb.a(chn.class, ajz.b);
   private final bvb ca = new bvb(this.al, bZ, bY);

   public chn(buq<? extends chn> $$0, dgg $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      this.bS.a(0, new cbx(this));
      this.bS.a(1, new ccw(this, 1.25));
      this.bS.a(3, new cbp(this, 1.0));
      this.bS.a(4, new cdl(this, 1.2, $$0 -> $$0.a(cwr.ot), false));
      this.bS.a(4, new cdl(this, 1.2, $$0 -> $$0.a(awx.av), false));
      this.bS.a(5, new ccc(this, 1.1));
      this.bS.a(6, new cdq(this, 1.0));
      this.bS.a(7, new ccl(this, cov.class, 6.0F));
      this.bS.a(8, new ccy(this));
   }

   public static bwm.a p() {
      return cgw.gu().a(bwn.s, 10.0).a(bwn.v, 0.25);
   }

   @Nullable
   @Override
   public bvf cX() {
      return (bvf)(this.j() && this.da() instanceof cov $$0 && $$0.b(cwr.ot) ? $$0 : super.cX());
   }

   @Override
   public void a(ajx<?> $$0) {
      if (bZ.equals($$0) && this.dW().C) {
         this.ca.a();
      }

      super.a($$0);
   }

   @Override
   protected void a(akb.a $$0) {
      super.a($$0);
      $$0.a(bY, false);
      $$0.a(bZ, 0);
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      this.ca.a($$0);
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      this.ca.b($$0);
   }

   @Override
   protected avy u() {
      return avz.ua;
   }

   @Override
   protected avy e(bsz $$0) {
      return avz.uc;
   }

   @Override
   protected avy o_() {
      return avz.ub;
   }

   @Override
   protected void b(ji $$0, dwv $$1) {
      this.a(avz.ue, 0.15F, 1.0F);
   }

   @Override
   public bsi b(cov $$0, bsh $$1) {
      boolean $$2 = this.j($$0.b($$1));
      if (!$$2 && this.j() && !this.ca() && !$$0.fY()) {
         if (!this.dW().C) {
            $$0.n(this);
         }

         return bsi.a;
      } else {
         bsi $$3 = super.b($$0, $$1);
         if (!$$3.a()) {
            cwn $$4 = $$0.b($$1);
            return (bsi)($$4.a(cwr.on) ? $$4.a($$0, this, $$1) : bsi.e);
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
   protected void f(arc $$0) {
      super.f($$0);
      if (this.j()) {
         this.a($$0, cwr.on);
      }
   }

   @Override
   public boolean j() {
      return this.ca.d();
   }

   @Override
   public void a(cwn $$0, @Nullable awa $$1) {
      this.ca.a(true);
      if ($$1 != null) {
         this.dW().a(null, this, avz.ud, $$1, 0.5F, 1.0F);
      }
   }

   @Override
   public fay b(bvf $$0) {
      jn $$1 = this.cP();
      if ($$1.o() == jn.a.b) {
         return super.b($$0);
      } else {
         int[][] $$2 = cra.a($$1);
         ji $$3 = this.dw();
         ji.a $$4 = new ji.a();
         UnmodifiableIterator var6 = $$0.fO().iterator();

         while (var6.hasNext()) {
            bvr $$5 = (bvr)var6.next();
            fat $$6 = $$0.f($$5);

            for (int[] $$7 : $$2) {
               $$4.d($$3.u() + $$7[0], $$3.v(), $$3.w() + $$7[1]);
               double $$8 = this.dW().j($$4);
               if (cra.a($$8)) {
                  fay $$9 = fay.a($$4, $$8);
                  if (cra.a(this.dW(), $$0, $$6.c($$9))) {
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
   public void a(arc $$0, bve $$1) {
      if ($$0.am() != bsf.a) {
         cmr $$2 = this.a(buq.bQ, bue.a(this, false, true), $$0x -> {
            if (this.eZ().f()) {
               $$0x.a(bur.a, new cwn(cwr.pB));
            }

            $$0x.aj();
         });
         if ($$2 == null) {
            super.a($$0, $$1);
         }
      } else {
         super.a($$0, $$1);
      }
   }

   @Override
   protected void a(cov $$0, fay $$1) {
      super.a($$0, $$1);
      this.b($$0.dM(), $$0.dO() * 0.5F);
      this.N = this.aX = this.aZ = this.dM();
      this.ca.b();
   }

   @Override
   protected fay b(cov $$0, fay $$1) {
      return new fay(0.0, 0.0, 1.0);
   }

   @Override
   protected float e(cov $$0) {
      return (float)(this.h(bwn.v) * 0.225 * (double)this.ca.c());
   }

   @Override
   public boolean a() {
      return this.ca.a(this.dZ());
   }

   @Nullable
   public chn b(arc $$0, bua $$1) {
      return buq.aQ.a($$0, bup.e);
   }

   @Override
   public boolean j(cwn $$0) {
      return $$0.a(awx.av);
   }

   @Override
   public fay cT() {
      return new fay(0.0, (double)(0.6F * this.cS()), (double)(this.dr() * 0.4F));
   }
}
