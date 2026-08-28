import com.google.common.collect.UnmodifiableIterator;
import javax.annotation.Nullable;

public class cin extends chw implements bwc, bwv {
   private static final alc<Boolean> bZ = alg.a(cin.class, ale.k);
   private static final alc<Integer> ca = alg.a(cin.class, ale.b);
   private final bwb cb = new bwb(this.al, ca, bZ);

   public cin(bvq<? extends cin> $$0, dhh $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      this.bT.a(0, new ccx(this));
      this.bT.a(1, new cdw(this, 1.25));
      this.bT.a(3, new ccp(this, 1.0));
      this.bT.a(4, new cel(this, 1.2, $$0 -> $$0.a(cxs.ok), false));
      this.bT.a(4, new cel(this, 1.2, $$0 -> $$0.a(ayd.ax), false));
      this.bT.a(5, new cdc(this, 1.1));
      this.bT.a(6, new ceq(this, 1.0));
      this.bT.a(7, new cdl(this, cpw.class, 6.0F));
      this.bT.a(8, new cdy(this));
   }

   public static bxm.a p() {
      return chw.gr().a(bxn.s, 10.0).a(bxn.v, 0.25);
   }

   @Nullable
   @Override
   public bwf cX() {
      return (bwf)(this.j() && this.da() instanceof cpw $$0 && $$0.b(cxs.ok) ? $$0 : super.cX());
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
      return axf.tU;
   }

   @Override
   protected axe e(btz $$0) {
      return axf.tW;
   }

   @Override
   protected axe o_() {
      return axf.tV;
   }

   @Override
   protected void b(jh $$0, dxu $$1) {
      this.a(axf.tY, 0.15F, 1.0F);
   }

   @Override
   public bti b(cpw $$0, bth $$1) {
      boolean $$2 = this.j($$0.b($$1));
      if (!$$2 && this.j() && !this.ca() && !$$0.fW()) {
         if (!this.dV().C) {
            $$0.n(this);
         }

         return bti.a;
      } else {
         bti $$3 = super.b($$0, $$1);
         if (!$$3.a()) {
            cxo $$4 = $$0.b($$1);
            return (bti)($$4.a(cxs.oe) ? $$4.a($$0, this, $$1) : bti.e);
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
         this.a($$0, cxs.oe);
      }
   }

   @Override
   public boolean j() {
      return this.cb.d();
   }

   @Override
   public void a(cxo $$0, @Nullable axg $$1) {
      this.cb.a(true);
      if ($$1 != null) {
         this.dV().a(null, this, axf.tX, $$1, 0.5F, 1.0F);
      }
   }

   @Override
   public fbx b(bwf $$0) {
      jm $$1 = this.cP();
      if ($$1.o() == jm.a.b) {
         return super.b($$0);
      } else {
         int[][] $$2 = csb.a($$1);
         jh $$3 = this.dv();
         jh.a $$4 = new jh.a();
         UnmodifiableIterator var6 = $$0.fM().iterator();

         while (var6.hasNext()) {
            bwr $$5 = (bwr)var6.next();
            fbs $$6 = $$0.f($$5);

            for (int[] $$7 : $$2) {
               $$4.d($$3.u() + $$7[0], $$3.v(), $$3.w() + $$7[1]);
               double $$8 = this.dV().j($$4);
               if (csb.a($$8)) {
                  fbx $$9 = fbx.a($$4, $$8);
                  if (csb.a(this.dV(), $$0, $$6.c($$9))) {
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
   public void a(ash $$0, bwe $$1) {
      if ($$0.al() != btf.a) {
         cnr $$2 = this.a(bvq.bR, bve.a(this, false, true), $$0x -> {
            if (this.eX().f()) {
               $$0x.a(bvr.a, new cxo(cxs.ps));
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
   protected void a(cpw $$0, fbx $$1) {
      super.a($$0, $$1);
      this.b($$0.dL(), $$0.dN() * 0.5F);
      this.N = this.aX = this.aZ = this.dL();
      this.cb.b();
   }

   @Override
   protected fbx b(cpw $$0, fbx $$1) {
      return new fbx(0.0, 0.0, 1.0);
   }

   @Override
   protected float e(cpw $$0) {
      return (float)(this.h(bxn.v) * 0.225 * (double)this.cb.c());
   }

   @Override
   public boolean a() {
      return this.cb.a(this.dY());
   }

   @Nullable
   public cin b(ash $$0, bva $$1) {
      return bvq.aR.a($$0, bvp.e);
   }

   @Override
   public boolean j(cxo $$0) {
      return $$0.a(ayd.ax);
   }

   @Override
   public fbx cT() {
      return new fbx(0.0, (double)(0.6F * this.cS()), (double)(this.dq() * 0.4F));
   }
}
