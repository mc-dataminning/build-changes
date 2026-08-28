import com.google.common.collect.UnmodifiableIterator;
import javax.annotation.Nullable;

public class chi extends cgr implements bux, bvq {
   private static final akl<Boolean> bY = akp.a(chi.class, akn.k);
   private static final akl<Integer> bZ = akp.a(chi.class, akn.b);
   private final buw ca = new buw(this.am, bZ, bY);

   public chi(bul<? extends chi> $$0, dfb $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      this.bS.a(0, new cbs(this));
      this.bS.a(1, new ccr(this, 1.25));
      this.bS.a(3, new cbk(this, 1.0));
      this.bS.a(4, new cdg(this, 1.2, $$0 -> $$0.a(cwf.nR), false));
      this.bS.a(4, new cdg(this, 1.2, $$0 -> $$0.a(axj.av), false));
      this.bS.a(5, new cbx(this, 1.1));
      this.bS.a(6, new cdl(this, 1.0));
      this.bS.a(7, new ccg(this, com.class, 6.0F));
      this.bS.a(8, new cct(this));
   }

   public static bwh.a q() {
      return cgr.gz().a(bwi.s, 10.0).a(bwi.v, 0.25);
   }

   @Nullable
   @Override
   public bva cY() {
      return (bva)(this.i() && this.db() instanceof com $$0 && $$0.b(cwf.nR) ? $$0 : super.cY());
   }

   @Override
   public void a(akl<?> $$0) {
      if (bZ.equals($$0) && this.dX().C) {
         this.ca.a();
      }

      super.a($$0);
   }

   @Override
   protected void a(akp.a $$0) {
      super.a($$0);
      $$0.a(bY, false);
      $$0.a(bZ, 0);
   }

   @Override
   public void b(uk $$0) {
      super.b($$0);
      this.ca.a($$0);
   }

   @Override
   public void a(uk $$0) {
      super.a($$0);
      this.ca.b($$0);
   }

   @Override
   protected awk w() {
      return awl.tz;
   }

   @Override
   protected awk d(bsu $$0) {
      return awl.tB;
   }

   @Override
   protected awk o_() {
      return awl.tA;
   }

   @Override
   protected void b(jh $$0, dvj $$1) {
      this.a(awl.tD, 0.15F, 1.0F);
   }

   @Override
   public bsd b(com $$0, bsc $$1) {
      boolean $$2 = this.l($$0.b($$1));
      if (!$$2 && this.i() && !this.cb() && !$$0.ga()) {
         if (!this.dX().C) {
            $$0.n(this);
         }

         return bsd.a;
      } else {
         bsd $$3 = super.b($$0, $$1);
         if (!$$3.a()) {
            cwb $$4 = $$0.b($$1);
            return (bsd)($$4.a(cwf.nL) ? $$4.a($$0, this, $$1) : bsd.e);
         } else {
            return $$3;
         }
      }
   }

   @Override
   public boolean f() {
      return this.bM() && !this.p_();
   }

   @Override
   protected void eJ() {
      super.eJ();
      if (this.i()) {
         this.a(cwf.nL);
      }
   }

   @Override
   public boolean i() {
      return this.ca.d();
   }

   @Override
   public void a(cwb $$0, @Nullable awm $$1) {
      this.ca.a(true);
      if ($$1 != null) {
         this.dX().a(null, this, awl.tC, $$1, 0.5F, 1.0F);
      }
   }

   @Override
   public ezn b(bva $$0) {
      jm $$1 = this.cQ();
      if ($$1.o() == jm.a.b) {
         return super.b($$0);
      } else {
         int[][] $$2 = cqp.a($$1);
         jh $$3 = this.dx();
         jh.a $$4 = new jh.a();
         UnmodifiableIterator var6 = $$0.fQ().iterator();

         while (var6.hasNext()) {
            bvm $$5 = (bvm)var6.next();
            ezi $$6 = $$0.f($$5);

            for (int[] $$7 : $$2) {
               $$4.d($$3.u() + $$7[0], $$3.v(), $$3.w() + $$7[1]);
               double $$8 = this.dX().j($$4);
               if (cqp.a($$8)) {
                  ezn $$9 = ezn.a($$4, $$8);
                  if (cqp.a(this.dX(), $$0, $$6.c($$9))) {
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
   public void a(arn $$0, buz $$1) {
      if ($$0.ak() != bsa.a) {
         cmm $$2 = this.a(bul.bx, btz.a(this, false, true), $$0x -> {
            if (this.fb().f()) {
               $$0x.a(bum.a, new cwb(cwf.oX));
            }

            $$0x.ga();
         });
         if ($$2 == null) {
            super.a($$0, $$1);
         }
      } else {
         super.a($$0, $$1);
      }
   }

   @Override
   protected void a(com $$0, ezn $$1) {
      super.a($$0, $$1);
      this.a($$0.dN(), $$0.dP() * 0.5F);
      this.O = this.aX = this.aZ = this.dN();
      this.ca.b();
   }

   @Override
   protected ezn b(com $$0, ezn $$1) {
      return new ezn(0.0, 0.0, 1.0);
   }

   @Override
   protected float e(com $$0) {
      return (float)(this.h(bwi.v) * 0.225 * (double)this.ca.c());
   }

   @Override
   public boolean a() {
      return this.ca.a(this.ea());
   }

   @Nullable
   public chi b(arn $$0, btv $$1) {
      return bul.az.a($$0, buk.e);
   }

   @Override
   public boolean l(cwb $$0) {
      return $$0.a(axj.av);
   }

   @Override
   public ezn cU() {
      return new ezn(0.0, (double)(0.6F * this.cT()), (double)(this.ds() * 0.4F));
   }
}
