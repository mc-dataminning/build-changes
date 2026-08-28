import com.google.common.collect.UnmodifiableIterator;
import javax.annotation.Nullable;

public class cij extends chs implements bvy, bwr {
   private static final alc<Boolean> bZ = alg.a(cij.class, ale.k);
   private static final alc<Integer> ca = alg.a(cij.class, ale.b);
   private final bvx cb = new bvx(this.al, ca, bZ);

   public cij(bvm<? extends cij> $$0, dha $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      this.bT.a(0, new cct(this));
      this.bT.a(1, new cds(this, 1.25));
      this.bT.a(3, new ccl(this, 1.0));
      this.bT.a(4, new ceh(this, 1.2, $$0 -> $$0.a(cxo.ok), false));
      this.bT.a(4, new ceh(this, 1.2, $$0 -> $$0.a(ayd.ax), false));
      this.bT.a(5, new ccy(this, 1.1));
      this.bT.a(6, new cem(this, 1.0));
      this.bT.a(7, new cdh(this, cps.class, 6.0F));
      this.bT.a(8, new cdu(this));
   }

   public static bxi.a p() {
      return chs.gr().a(bxj.s, 10.0).a(bxj.v, 0.25);
   }

   @Nullable
   @Override
   public bwb cX() {
      return (bwb)(this.j() && this.da() instanceof cps $$0 && $$0.b(cxo.ok) ? $$0 : super.cX());
   }

   @Override
   public void a(alc<?> $$0) {
      if (ca.equals($$0) && this.dV().C) {
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
      return axf.tT;
   }

   @Override
   protected axe e(btv $$0) {
      return axf.tV;
   }

   @Override
   protected axe o_() {
      return axf.tU;
   }

   @Override
   protected void b(jh $$0, dxn $$1) {
      this.a(axf.tX, 0.15F, 1.0F);
   }

   @Override
   public bte b(cps $$0, btd $$1) {
      boolean $$2 = this.j($$0.b($$1));
      if (!$$2 && this.j() && !this.ca() && !$$0.fW()) {
         if (!this.dV().C) {
            $$0.n(this);
         }

         return bte.a;
      } else {
         bte $$3 = super.b($$0, $$1);
         if (!$$3.a()) {
            cxk $$4 = $$0.b($$1);
            return (bte)($$4.a(cxo.oe) ? $$4.a($$0, this, $$1) : bte.e);
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
         this.a($$0, cxo.oe);
      }
   }

   @Override
   public boolean j() {
      return this.cb.d();
   }

   @Override
   public void a(cxk $$0, @Nullable axg $$1) {
      this.cb.a(true);
      if ($$1 != null) {
         this.dV().a(null, this, axf.tW, $$1, 0.5F, 1.0F);
      }
   }

   @Override
   public fbs b(bwb $$0) {
      jm $$1 = this.cP();
      if ($$1.o() == jm.a.b) {
         return super.b($$0);
      } else {
         int[][] $$2 = crx.a($$1);
         jh $$3 = this.dv();
         jh.a $$4 = new jh.a();
         UnmodifiableIterator var6 = $$0.fM().iterator();

         while (var6.hasNext()) {
            bwn $$5 = (bwn)var6.next();
            fbn $$6 = $$0.f($$5);

            for (int[] $$7 : $$2) {
               $$4.d($$3.u() + $$7[0], $$3.v(), $$3.w() + $$7[1]);
               double $$8 = this.dV().j($$4);
               if (crx.a($$8)) {
                  fbs $$9 = fbs.a($$4, $$8);
                  if (crx.a(this.dV(), $$0, $$6.c($$9))) {
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
   public void a(ash $$0, bwa $$1) {
      if ($$0.al() != btb.a) {
         cnn $$2 = this.a(bvm.bR, bva.a(this, false, true), $$0x -> {
            if (this.eX().f()) {
               $$0x.a(bvn.a, new cxk(cxo.ps));
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
   protected void a(cps $$0, fbs $$1) {
      super.a($$0, $$1);
      this.b($$0.dL(), $$0.dN() * 0.5F);
      this.N = this.aX = this.aZ = this.dL();
      this.cb.b();
   }

   @Override
   protected fbs b(cps $$0, fbs $$1) {
      return new fbs(0.0, 0.0, 1.0);
   }

   @Override
   protected float e(cps $$0) {
      return (float)(this.h(bxj.v) * 0.225 * (double)this.cb.c());
   }

   @Override
   public boolean a() {
      return this.cb.a(this.dY());
   }

   @Nullable
   public cij b(ash $$0, buw $$1) {
      return bvm.aR.a($$0, bvl.e);
   }

   @Override
   public boolean j(cxk $$0) {
      return $$0.a(ayd.ax);
   }

   @Override
   public fbs cT() {
      return new fbs(0.0, (double)(0.6F * this.cS()), (double)(this.dq() * 0.4F));
   }
}
