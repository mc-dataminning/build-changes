import com.google.common.collect.UnmodifiableIterator;
import javax.annotation.Nullable;

public class ccu extends ccd implements bql, brd {
   private static final aiy<Boolean> bX = ajc.a(ccu.class, aja.k);
   private static final aiy<Integer> bY = ajc.a(ccu.class, aja.b);
   private static final cvg ca = cvg.a(crm.ud, crm.ue, crm.vi);
   private final bqk cb = new bqk(this.an, bY, bX);

   public ccu(bqb<? extends ccu> $$0, cyx $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.bR.a(0, new bxf(this));
      this.bR.a(1, new bye(this, 1.25));
      this.bR.a(3, new bwx(this, 1.0));
      this.bR.a(4, new byt(this, 1.2, cvg.a(crm.nQ), false));
      this.bR.a(4, new byt(this, 1.2, ca, false));
      this.bR.a(5, new bxk(this, 1.1));
      this.bR.a(6, new byy(this, 1.0));
      this.bR.a(7, new bxt(this, cjt.class, 6.0F));
      this.bR.a(8, new byg(this));
   }

   public static bru.a r() {
      return bqq.A().a(brv.q, 10.0).a(brv.r, 0.25);
   }

   @Nullable
   @Override
   public bqo cN() {
      return (bqo)(this.i() && this.cQ() instanceof cjt $$0 && $$0.b(crm.nQ) ? $$0 : super.cN());
   }

   @Override
   public void a(aiy<?> $$0) {
      if (bY.equals($$0) && this.dM().B) {
         this.cb.a();
      }

      super.a($$0);
   }

   @Override
   protected void a(ajc.a $$0) {
      super.a($$0);
      $$0.a(bX, false);
      $$0.a(bY, 0);
   }

   @Override
   public void b(tm $$0) {
      super.b($$0);
      this.cb.a($$0);
   }

   @Override
   public void a(tm $$0) {
      super.a($$0);
      this.cb.b($$0);
   }

   @Override
   protected aul v() {
      return aum.te;
   }

   @Override
   protected aul d(bot $$0) {
      return aum.tg;
   }

   @Override
   protected aul o_() {
      return aum.tf;
   }

   @Override
   protected void b(ib $$0, doz $$1) {
      this.a(aum.ti, 0.15F, 1.0F);
   }

   @Override
   public boa b(cjt $$0, bnz $$1) {
      boolean $$2 = this.o($$0.b($$1));
      if (!$$2 && this.i() && !this.bP() && !$$0.fO()) {
         if (!this.dM().B) {
            $$0.n(this);
         }

         return boa.a(this.dM().B);
      } else {
         boa $$3 = super.b($$0, $$1);
         if (!$$3.a()) {
            crj $$4 = $$0.b($$1);
            return $$4.a(crm.nK) ? $$4.a($$0, this, $$1) : boa.d;
         } else {
            return $$3;
         }
      }
   }

   @Override
   public boolean f() {
      return this.bA() && !this.p_();
   }

   @Override
   protected void eA() {
      super.eA();
      if (this.i()) {
         this.a(crm.nK);
      }
   }

   @Override
   public boolean i() {
      return this.cb.d();
   }

   @Override
   public void a(@Nullable aun $$0) {
      this.cb.a(true);
      if ($$0 != null) {
         this.dM().a(null, this, aum.th, $$0, 0.5F, 1.0F);
      }
   }

   @Override
   public esa b(bqo $$0) {
      ih $$1 = this.cF();
      if ($$1.o() == ih.a.b) {
         return super.b($$0);
      } else {
         int[][] $$2 = clt.a($$1);
         ib $$3 = this.dm();
         ib.a $$4 = new ib.a();
         UnmodifiableIterator var6 = $$0.fF().iterator();

         while (var6.hasNext()) {
            bqz $$5 = (bqz)var6.next();
            erv $$6 = $$0.f($$5);

            for (int[] $$7 : $$2) {
               $$4.d($$3.u() + $$7[0], $$3.v(), $$3.w() + $$7[1]);
               double $$8 = this.dM().j($$4);
               if (clt.a($$8)) {
                  esa $$9 = esa.a($$4, $$8);
                  if (clt.a(this.dM(), $$0, $$6.c($$9))) {
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
   public void a(aps $$0, bqn $$1) {
      if ($$0.ak() != bnx.a) {
         chu $$2 = bqb.bw.a((cyx)$$0);
         if ($$2 != null) {
            $$2.a(bqc.a, new crj(crm.oU));
            $$2.b(this.dr(), this.dt(), this.dx(), this.dC(), this.dE());
            $$2.t(this.gd());
            $$2.a(this.p_());
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
   protected void a(cjt $$0, esa $$1) {
      super.a($$0, $$1);
      this.a($$0.dC(), $$0.dE() * 0.5F);
      this.N = this.aX = this.aZ = this.dC();
      this.cb.b();
   }

   @Override
   protected esa b(cjt $$0, esa $$1) {
      return new esa(0.0, 0.0, 1.0);
   }

   @Override
   protected float e(cjt $$0) {
      return (float)(this.g(brv.r) * 0.225 * (double)this.cb.c());
   }

   @Override
   public boolean a() {
      return this.cb.a(this.ei());
   }

   @Nullable
   public ccu b(aps $$0, bpp $$1) {
      return bqb.ay.a((cyx)$$0);
   }

   @Override
   public boolean o(crj $$0) {
      return ca.a($$0);
   }

   @Override
   public esa cJ() {
      return new esa(0.0, (double)(0.6F * this.cI()), (double)(this.dg() * 0.4F));
   }
}
