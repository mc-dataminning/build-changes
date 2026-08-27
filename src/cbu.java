import com.google.common.collect.UnmodifiableIterator;
import javax.annotation.Nullable;

public class cbu extends cbd implements bpl, bqd {
   private static final aim<Boolean> bX = aiq.a(cbu.class, aio.k);
   private static final aim<Integer> bY = aiq.a(cbu.class, aio.b);
   private static final ctk ca = ctk.a(cqn.uc, cqn.ud, cqn.vh);
   private final bpk cb = new bpk(this.an, bY, bX);

   public cbu(bpc<? extends cbu> $$0, cwz $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.bR.a(0, new bwf(this));
      this.bR.a(1, new bxe(this, 1.25));
      this.bR.a(3, new bvx(this, 1.0));
      this.bR.a(4, new bxt(this, 1.2, ctk.a(cqn.nQ), false));
      this.bR.a(4, new bxt(this, 1.2, ca, false));
      this.bR.a(5, new bwk(this, 1.1));
      this.bR.a(6, new bxy(this, 1.0));
      this.bR.a(7, new bwt(this, cis.class, 6.0F));
      this.bR.a(8, new bxg(this));
   }

   public static bqu.a r() {
      return bpq.A().a(bqv.q, 10.0).a(bqv.r, 0.25);
   }

   @Nullable
   @Override
   public bpo cN() {
      return (bpo)(this.i() && this.cQ() instanceof cis $$0 && $$0.b(cqn.nQ) ? $$0 : super.cN());
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
      return aty.sW;
   }

   @Override
   protected atx d(bnv $$0) {
      return aty.sY;
   }

   @Override
   protected atx n_() {
      return aty.sX;
   }

   @Override
   protected void b(ib $$0, dmz $$1) {
      this.a(aty.ta, 0.15F, 1.0F);
   }

   @Override
   public bnc b(cis $$0, bnb $$1) {
      boolean $$2 = this.o($$0.b($$1));
      if (!$$2 && this.i() && !this.bP() && !$$0.fO()) {
         if (!this.dM().B) {
            $$0.n(this);
         }

         return bnc.a(this.dM().B);
      } else {
         bnc $$3 = super.b($$0, $$1);
         if (!$$3.a()) {
            cqk $$4 = $$0.b($$1);
            return $$4.a(cqn.nK) ? $$4.a($$0, this, $$1) : bnc.d;
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
         this.a(cqn.nK);
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
         this.dM().a(null, this, aty.sZ, $$0, 0.5F, 1.0F);
      }
   }

   @Override
   public epr b(bpo $$0) {
      ih $$1 = this.cF();
      if ($$1.o() == ih.a.b) {
         return super.b($$0);
      } else {
         int[][] $$2 = cks.a($$1);
         ib $$3 = this.dm();
         ib.a $$4 = new ib.a();
         UnmodifiableIterator var6 = $$0.fF().iterator();

         while (var6.hasNext()) {
            bpz $$5 = (bpz)var6.next();
            epm $$6 = $$0.f($$5);

            for (int[] $$7 : $$2) {
               $$4.d($$3.u() + $$7[0], $$3.v(), $$3.w() + $$7[1]);
               double $$8 = this.dM().j($$4);
               if (cks.a($$8)) {
                  epr $$9 = epr.a($$4, $$8);
                  if (cks.a(this.dM(), $$0, $$6.c($$9))) {
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
   public void a(apf $$0, bpn $$1) {
      if ($$0.aj() != bmz.a) {
         cgt $$2 = bpc.bw.a((cwz)$$0);
         if ($$2 != null) {
            $$2.a(bpd.a, new cqk(cqn.oU));
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
   protected void a(cis $$0, epr $$1) {
      super.a($$0, $$1);
      this.a($$0.dC(), $$0.dE() * 0.5F);
      this.N = this.aX = this.aZ = this.dC();
      this.cb.b();
   }

   @Override
   protected epr b(cis $$0, epr $$1) {
      return new epr(0.0, 0.0, 1.0);
   }

   @Override
   protected float e(cis $$0) {
      return (float)(this.g(bqv.r) * 0.225 * (double)this.cb.c());
   }

   @Override
   public boolean a() {
      return this.cb.a(this.ei());
   }

   @Nullable
   public cbu b(apf $$0, bor $$1) {
      return bpc.ay.a((cwz)$$0);
   }

   @Override
   public boolean o(cqk $$0) {
      return ca.a($$0);
   }

   @Override
   public epr cJ() {
      return new epr(0.0, (double)(0.6F * this.cI()), (double)(this.dg() * 0.4F));
   }
}
