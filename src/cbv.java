import com.google.common.collect.UnmodifiableIterator;
import javax.annotation.Nullable;

public class cbv extends cbe implements bpm, bqe {
   private static final aim<Boolean> bX = aiq.a(cbv.class, aio.k);
   private static final aim<Integer> bY = aiq.a(cbv.class, aio.b);
   private static final ctm ca = ctm.a(cqp.ud, cqp.ue, cqp.vi);
   private final bpl cb = new bpl(this.an, bY, bX);

   public cbv(bpd<? extends cbv> $$0, cxb $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.bR.a(0, new bwg(this));
      this.bR.a(1, new bxf(this, 1.25));
      this.bR.a(3, new bvy(this, 1.0));
      this.bR.a(4, new bxu(this, 1.2, ctm.a(cqp.nQ), false));
      this.bR.a(4, new bxu(this, 1.2, ca, false));
      this.bR.a(5, new bwl(this, 1.1));
      this.bR.a(6, new bxz(this, 1.0));
      this.bR.a(7, new bwu(this, ciu.class, 6.0F));
      this.bR.a(8, new bxh(this));
   }

   public static bqv.a r() {
      return bpr.A().a(bqw.q, 10.0).a(bqw.r, 0.25);
   }

   @Nullable
   @Override
   public bpp cN() {
      return (bpp)(this.i() && this.cQ() instanceof ciu $$0 && $$0.b(cqp.nQ) ? $$0 : super.cN());
   }

   @Override
   public void a(aim<?> $$0) {
      if (bY.equals($$0) && this.dM().B) {
         this.cb.a();
      }

      super.a($$0);
   }

   @Override
   protected void a(aiq.a $$0) {
      super.a($$0);
      $$0.a(bX, false);
      $$0.a(bY, 0);
   }

   @Override
   public void b(ta $$0) {
      super.b($$0);
      this.cb.a($$0);
   }

   @Override
   public void a(ta $$0) {
      super.a($$0);
      this.cb.b($$0);
   }

   @Override
   protected atx v() {
      return aty.tb;
   }

   @Override
   protected atx d(bnw $$0) {
      return aty.td;
   }

   @Override
   protected atx n_() {
      return aty.tc;
   }

   @Override
   protected void b(ib $$0, dnb $$1) {
      this.a(aty.tf, 0.15F, 1.0F);
   }

   @Override
   public bnd b(ciu $$0, bnc $$1) {
      boolean $$2 = this.o($$0.b($$1));
      if (!$$2 && this.i() && !this.bP() && !$$0.fO()) {
         if (!this.dM().B) {
            $$0.n(this);
         }

         return bnd.a(this.dM().B);
      } else {
         bnd $$3 = super.b($$0, $$1);
         if (!$$3.a()) {
            cqm $$4 = $$0.b($$1);
            return $$4.a(cqp.nK) ? $$4.a($$0, this, $$1) : bnd.d;
         } else {
            return $$3;
         }
      }
   }

   @Override
   public boolean f() {
      return this.bA() && !this.o_();
   }

   @Override
   protected void eA() {
      super.eA();
      if (this.i()) {
         this.a(cqp.nK);
      }
   }

   @Override
   public boolean i() {
      return this.cb.d();
   }

   @Override
   public void a(@Nullable atz $$0) {
      this.cb.a(true);
      if ($$0 != null) {
         this.dM().a(null, this, aty.te, $$0, 0.5F, 1.0F);
      }
   }

   @Override
   public ept b(bpp $$0) {
      ih $$1 = this.cF();
      if ($$1.o() == ih.a.b) {
         return super.b($$0);
      } else {
         int[][] $$2 = cku.a($$1);
         ib $$3 = this.dm();
         ib.a $$4 = new ib.a();
         UnmodifiableIterator var6 = $$0.fF().iterator();

         while (var6.hasNext()) {
            bqa $$5 = (bqa)var6.next();
            epo $$6 = $$0.f($$5);

            for (int[] $$7 : $$2) {
               $$4.d($$3.u() + $$7[0], $$3.v(), $$3.w() + $$7[1]);
               double $$8 = this.dM().j($$4);
               if (cku.a($$8)) {
                  ept $$9 = ept.a($$4, $$8);
                  if (cku.a(this.dM(), $$0, $$6.c($$9))) {
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
   public void a(apf $$0, bpo $$1) {
      if ($$0.aj() != bna.a) {
         cgv $$2 = bpd.bx.a((cxb)$$0);
         if ($$2 != null) {
            $$2.a(bpe.a, new cqm(cqp.oU));
            $$2.b(this.dr(), this.dt(), this.dx(), this.dC(), this.dE());
            $$2.t(this.gd());
            $$2.a(this.o_());
            if (this.ae()) {
               $$2.b(this.af());
               $$2.n(this.cB());
            }

            $$2.fS();
            $$0.b($$2);
            this.am();
         } else {
            super.a($$0, $$1);
         }
      } else {
         super.a($$0, $$1);
      }
   }

   @Override
   protected void a(ciu $$0, ept $$1) {
      super.a($$0, $$1);
      this.a($$0.dC(), $$0.dE() * 0.5F);
      this.N = this.aX = this.aZ = this.dC();
      this.cb.b();
   }

   @Override
   protected ept b(ciu $$0, ept $$1) {
      return new ept(0.0, 0.0, 1.0);
   }

   @Override
   protected float e(ciu $$0) {
      return (float)(this.g(bqw.r) * 0.225 * (double)this.cb.c());
   }

   @Override
   public boolean a() {
      return this.cb.a(this.ei());
   }

   @Nullable
   public cbv b(apf $$0, bos $$1) {
      return bpd.az.a((cxb)$$0);
   }

   @Override
   public boolean o(cqm $$0) {
      return ca.a($$0);
   }

   @Override
   public ept cJ() {
      return new ept(0.0, (double)(0.6F * this.cI()), (double)(this.dg() * 0.4F));
   }
}
