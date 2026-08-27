import com.google.common.collect.UnmodifiableIterator;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bxz extends bxi implements bls, bml {
   private static final afz<Boolean> bT = agc.a(bxz.class, agb.k);
   private static final afz<Integer> bU = agc.a(bxz.class, agb.b);
   private static final cpi bW = cpi.a(cmk.tY, cmk.tZ, cmk.vd);
   private final blr bX = new blr(this.an, bU, bT);

   public bxz(blj<? extends bxz> $$0, csy $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      this.bO.a(0, new bsl(this));
      this.bO.a(1, new btk(this, 1.25));
      this.bO.a(3, new bsd(this, 1.0));
      this.bO.a(4, new btz(this, 1.2, cpi.a(cmk.nQ), false));
      this.bO.a(4, new btz(this, 1.2, bW, false));
      this.bO.a(5, new bsq(this, 1.1));
      this.bO.a(6, new bue(this, 1.0));
      this.bO.a(7, new bsz(this, cer.class, 6.0F));
      this.bO.a(8, new btm(this));
   }

   public static bna.a u() {
      return blx.C().a(bnb.l, 10.0).a(bnb.m, 0.25);
   }

   @Nullable
   @Override
   public blv cN() {
      return (blv)(this.i() && this.cQ() instanceof cer $$0 && $$0.b(cmk.nQ) ? $$0 : super.cN());
   }

   @Override
   public void a(afz<?> $$0) {
      if (bU.equals($$0) && this.dM().B) {
         this.bX.a();
      }

      super.a($$0);
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(bT, false);
      this.an.a(bU, 0);
   }

   @Override
   public void b(sj $$0) {
      super.b($$0);
      this.bX.a($$0);
   }

   @Override
   public void a(sj $$0) {
      super.a($$0);
      this.bX.b($$0);
   }

   @Override
   protected arb y() {
      return arc.sD;
   }

   @Override
   protected arb d(bkd $$0) {
      return arc.sF;
   }

   @Override
   protected arb n_() {
      return arc.sE;
   }

   @Override
   protected void b(hv $$0, dip $$1) {
      this.a(arc.sH, 0.15F, 1.0F);
   }

   @Override
   public bjl b(cer $$0, bjk $$1) {
      boolean $$2 = this.m($$0.b($$1));
      if (!$$2 && this.i() && !this.bP() && !$$0.fI()) {
         if (!this.dM().B) {
            $$0.n(this);
         }

         return bjl.a(this.dM().B);
      } else {
         bjl $$3 = super.b($$0, $$1);
         if (!$$3.a()) {
            cmh $$4 = $$0.b($$1);
            return $$4.a(cmk.nK) ? $$4.a($$0, this, $$1) : bjl.d;
         } else {
            return $$3;
         }
      }
   }

   @Override
   public boolean g() {
      return this.bx() && !this.o_();
   }

   @Override
   protected void ey() {
      super.ey();
      if (this.i()) {
         this.a(cmk.nK);
      }
   }

   @Override
   public boolean i() {
      return this.bX.d();
   }

   @Override
   public void a(@Nullable ard $$0) {
      this.bX.a(true);
      if ($$0 != null) {
         this.dM().a(null, this, arc.sG, $$0, 0.5F, 1.0F);
      }
   }

   @Override
   public elb b(blv $$0) {
      ia $$1 = this.cF();
      if ($$1.o() == ia.a.b) {
         return super.b($$0);
      } else {
         int[][] $$2 = cgo.a($$1);
         hv $$3 = this.dm();
         hv.a $$4 = new hv.a();
         UnmodifiableIterator var6 = $$0.fA().iterator();

         while (var6.hasNext()) {
            bmh $$5 = (bmh)var6.next();
            ekw $$6 = $$0.e($$5);

            for (int[] $$7 : $$2) {
               $$4.d($$3.u() + $$7[0], $$3.v(), $$3.w() + $$7[1]);
               double $$8 = this.dM().i($$4);
               if (cgo.a($$8)) {
                  elb $$9 = elb.a($$4, $$8);
                  if (cgo.a(this.dM(), $$0, $$6.c($$9))) {
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
   public void a(amp $$0, blu $$1) {
      if ($$0.aj() != bji.a) {
         ccu $$2 = blj.bu.a((csy)$$0);
         if ($$2 != null) {
            $$2.a(blk.a, new cmh(cmk.oS));
            $$2.b(this.dr(), this.dt(), this.dx(), this.dC(), this.dE());
            $$2.t(this.fU());
            $$2.a(this.o_());
            if (this.ae()) {
               $$2.b(this.af());
               $$2.n(this.cB());
            }

            $$2.fJ();
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
   protected void a(cer $$0, elb $$1) {
      super.a($$0, $$1);
      this.a($$0.dC(), $$0.dE() * 0.5F);
      this.N = this.aU = this.aW = this.dC();
      this.bX.b();
   }

   @Override
   protected elb b(cer $$0, elb $$1) {
      return new elb(0.0, 0.0, 1.0);
   }

   @Override
   protected float e(cer $$0) {
      return (float)(this.b(bnb.m) * 0.225 * (double)this.bX.c());
   }

   @Override
   public boolean a() {
      return this.bX.a(this.eg());
   }

   @Nullable
   public bxz b(amp $$0, bla $$1) {
      return blj.aw.a((csy)$$0);
   }

   @Override
   public boolean m(cmh $$0) {
      return bW.a($$0);
   }

   @Override
   public elb cJ() {
      return new elb(0.0, (double)(0.6F * this.cI()), (double)(this.dg() * 0.4F));
   }

   @Override
   protected Vector3f a(blf $$0, blg $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - 0.03125F * $$2, 0.0F);
   }
}
