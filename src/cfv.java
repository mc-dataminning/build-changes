import com.google.common.collect.UnmodifiableIterator;
import javax.annotation.Nullable;

public class cfv extends cfe implements btj, bue {
   private static final ajw<Boolean> cc = aka.a(cfv.class, ajy.k);
   private static final ajw<Integer> cd = aka.a(cfv.class, ajy.b);
   private final bti ce = new bti(this.ao, cd, cc);

   public cfv(bsx<? extends cfv> $$0, dcw $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      this.bW.a(0, new cag(this));
      this.bW.a(1, new cbf(this, 1.25));
      this.bW.a(3, new bzy(this, 1.0));
      this.bW.a(4, new cbu(this, 1.2, $$0 -> $$0.a(cut.nR), false));
      this.bW.a(4, new cbu(this, 1.2, $$0 -> $$0.a(awn.ar), false));
      this.bW.a(5, new cal(this, 1.1));
      this.bW.a(6, new cbz(this, 1.0));
      this.bW.a(7, new cau(this, cmx.class, 6.0F));
      this.bW.a(8, new cbh(this));
   }

   public static buv.a s() {
      return btp.C().a(buw.s, 10.0).a(buw.v, 0.25);
   }

   @Nullable
   @Override
   public btn cQ() {
      return (btn)(this.i() && this.cT() instanceof cmx $$0 && $$0.b(cut.nR) ? $$0 : super.cQ());
   }

   @Override
   public void a(ajw<?> $$0) {
      if (cd.equals($$0) && this.dO().B) {
         this.ce.a();
      }

      super.a($$0);
   }

   @Override
   protected void a(aka.a $$0) {
      super.a($$0);
      $$0.a(cc, false);
      $$0.a(cd, 0);
   }

   @Override
   public void b(ub $$0) {
      super.b($$0);
      this.ce.a($$0);
   }

   @Override
   public void a(ub $$0) {
      super.a($$0);
      this.ce.b($$0);
   }

   @Override
   protected avo v() {
      return avp.tA;
   }

   @Override
   protected avo d(brk $$0) {
      return avp.tC;
   }

   @Override
   protected avo n_() {
      return avp.tB;
   }

   @Override
   protected void b(jd $$0, dtc $$1) {
      this.a(avp.tE, 0.15F, 1.0F);
   }

   @Override
   public bqr b(cmx $$0, bqq $$1) {
      boolean $$2 = this.o($$0.b($$1));
      if (!$$2 && this.i() && !this.bT() && !$$0.fN()) {
         if (!this.dO().B) {
            $$0.n(this);
         }

         return bqr.a(this.dO().B);
      } else {
         bqr $$3 = super.b($$0, $$1);
         if (!$$3.a()) {
            cuq $$4 = $$0.b($$1);
            return $$4.a(cut.nL) ? $$4.a($$0, this, $$1) : bqr.e;
         } else {
            return $$3;
         }
      }
   }

   @Override
   public boolean f() {
      return this.bE() && !this.o_();
   }

   @Override
   protected void ez() {
      super.ez();
      if (this.i()) {
         this.a(cut.nL);
      }
   }

   @Override
   public boolean i() {
      return this.ce.d();
   }

   @Override
   public void a(cuq $$0, @Nullable avq $$1) {
      this.ce.a(true);
      if ($$1 != null) {
         this.dO().a(null, this, avp.tD, $$1, 0.5F, 1.0F);
      }
   }

   @Override
   public exc b(btn $$0) {
      ji $$1 = this.cI();
      if ($$1.o() == ji.a.b) {
         return super.b($$0);
      } else {
         int[][] $$2 = coy.a($$1);
         jd $$3 = this.do();
         jd.a $$4 = new jd.a();
         UnmodifiableIterator var6 = $$0.fE().iterator();

         while (var6.hasNext()) {
            bua $$5 = (bua)var6.next();
            ewx $$6 = $$0.f($$5);

            for (int[] $$7 : $$2) {
               $$4.d($$3.u() + $$7[0], $$3.v(), $$3.w() + $$7[1]);
               double $$8 = this.dO().j($$4);
               if (coy.a($$8)) {
                  exc $$9 = exc.a($$4, $$8);
                  if (coy.a(this.dO(), $$0, $$6.c($$9))) {
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
   public void a(aqu $$0, btm $$1) {
      if ($$0.al() != bqo.a) {
         cky $$2 = bsx.bx.a((dcw)$$0);
         if ($$2 != null) {
            $$2.a(bsy.a, new cuq(cut.oW));
            $$2.b(this.dt(), this.dv(), this.dz(), this.dE(), this.dG());
            $$2.u(this.fZ());
            $$2.a(this.o_());
            if (this.ai()) {
               $$2.b(this.aj());
               $$2.p(this.cE());
            }

            $$2.fR();
            $$0.b($$2);
            this.aq();
         } else {
            super.a($$0, $$1);
         }
      } else {
         super.a($$0, $$1);
      }
   }

   @Override
   protected void a(cmx $$0, exc $$1) {
      super.a($$0, $$1);
      this.a($$0.dE(), $$0.dG() * 0.5F);
      this.O = this.aY = this.ba = this.dE();
      this.ce.b();
   }

   @Override
   protected exc b(cmx $$0, exc $$1) {
      return new exc(0.0, 0.0, 1.0);
   }

   @Override
   protected float e(cmx $$0) {
      return (float)(this.g(buw.v) * 0.225 * (double)this.ce.c());
   }

   @Override
   public boolean a() {
      return this.ce.a(this.dR());
   }

   @Nullable
   public cfv b(aqu $$0, bsl $$1) {
      return bsx.az.a((dcw)$$0);
   }

   @Override
   public boolean o(cuq $$0) {
      return $$0.a(awn.ar);
   }

   @Override
   public exc cM() {
      return new exc(0.0, (double)(0.6F * this.cL()), (double)(this.dj() * 0.4F));
   }
}
