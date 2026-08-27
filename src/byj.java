import com.google.common.collect.UnmodifiableIterator;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class byj extends bxs implements bmc, bmv {
   private static final agj<Boolean> bT = agm.a(byj.class, agl.k);
   private static final agj<Integer> bU = agm.a(byj.class, agl.b);
   private static final cps bW = cps.a(cmu.tY, cmu.tZ, cmu.vd);
   private final bmb bX = new bmb(this.an, bU, bT);

   public byj(blt<? extends byj> $$0, cti $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      this.bO.a(0, new bsv(this));
      this.bO.a(1, new btu(this, 1.25));
      this.bO.a(3, new bsn(this, 1.0));
      this.bO.a(4, new buj(this, 1.2, cps.a(cmu.nQ), false));
      this.bO.a(4, new buj(this, 1.2, bW, false));
      this.bO.a(5, new bta(this, 1.1));
      this.bO.a(6, new buo(this, 1.0));
      this.bO.a(7, new btj(this, cfb.class, 6.0F));
      this.bO.a(8, new btw(this));
   }

   public static bnk.a u() {
      return bmh.C().a(bnl.l, 10.0).a(bnl.m, 0.25);
   }

   @Nullable
   @Override
   public bmf cN() {
      return (bmf)(this.i() && this.cQ() instanceof cfb $$0 && $$0.b(cmu.nQ) ? $$0 : super.cN());
   }

   @Override
   public void a(agj<?> $$0) {
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
   public void b(sl $$0) {
      super.b($$0);
      this.bX.a($$0);
   }

   @Override
   public void a(sl $$0) {
      super.a($$0);
      this.bX.b($$0);
   }

   @Override
   protected arl y() {
      return arm.sD;
   }

   @Override
   protected arl d(bkn $$0) {
      return arm.sF;
   }

   @Override
   protected arl n_() {
      return arm.sE;
   }

   @Override
   protected void b(hx $$0, dja $$1) {
      this.a(arm.sH, 0.15F, 1.0F);
   }

   @Override
   public bjv b(cfb $$0, bju $$1) {
      boolean $$2 = this.m($$0.b($$1));
      if (!$$2 && this.i() && !this.bP() && !$$0.fI()) {
         if (!this.dM().B) {
            $$0.n(this);
         }

         return bjv.a(this.dM().B);
      } else {
         bjv $$3 = super.b($$0, $$1);
         if (!$$3.a()) {
            cmr $$4 = $$0.b($$1);
            return $$4.a(cmu.nK) ? $$4.a($$0, this, $$1) : bjv.d;
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
         this.a(cmu.nK);
      }
   }

   @Override
   public boolean i() {
      return this.bX.d();
   }

   @Override
   public void a(@Nullable arn $$0) {
      this.bX.a(true);
      if ($$0 != null) {
         this.dM().a(null, this, arm.sG, $$0, 0.5F, 1.0F);
      }
   }

   @Override
   public elm b(bmf $$0) {
      ic $$1 = this.cF();
      if ($$1.o() == ic.a.b) {
         return super.b($$0);
      } else {
         int[][] $$2 = cgy.a($$1);
         hx $$3 = this.dm();
         hx.a $$4 = new hx.a();
         UnmodifiableIterator var6 = $$0.fA().iterator();

         while (var6.hasNext()) {
            bmr $$5 = (bmr)var6.next();
            elh $$6 = $$0.e($$5);

            for (int[] $$7 : $$2) {
               $$4.d($$3.u() + $$7[0], $$3.v(), $$3.w() + $$7[1]);
               double $$8 = this.dM().j($$4);
               if (cgy.a($$8)) {
                  elm $$9 = elm.a($$4, $$8);
                  if (cgy.a(this.dM(), $$0, $$6.c($$9))) {
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
   public void a(amz $$0, bme $$1) {
      if ($$0.ak() != bjs.a) {
         cde $$2 = blt.bu.a((cti)$$0);
         if ($$2 != null) {
            $$2.a(blu.a, new cmr(cmu.oS));
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
   protected void a(cfb $$0, elm $$1) {
      super.a($$0, $$1);
      this.a($$0.dC(), $$0.dE() * 0.5F);
      this.N = this.aU = this.aW = this.dC();
      this.bX.b();
   }

   @Override
   protected elm b(cfb $$0, elm $$1) {
      return new elm(0.0, 0.0, 1.0);
   }

   @Override
   protected float e(cfb $$0) {
      return (float)(this.b(bnl.m) * 0.225 * (double)this.bX.c());
   }

   @Override
   public boolean a() {
      return this.bX.a(this.eg());
   }

   @Nullable
   public byj b(amz $$0, blk $$1) {
      return blt.aw.a((cti)$$0);
   }

   @Override
   public boolean m(cmr $$0) {
      return bW.a($$0);
   }

   @Override
   public elm cJ() {
      return new elm(0.0, (double)(0.6F * this.cI()), (double)(this.dg() * 0.4F));
   }

   @Override
   protected Vector3f a(blp $$0, blq $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - 0.03125F * $$2, 0.0F);
   }
}
