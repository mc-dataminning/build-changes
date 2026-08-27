import com.google.common.collect.UnmodifiableIterator;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class byp extends bxy implements bmi, bnb {
   private static final agm<Boolean> bT = agp.a(byp.class, ago.k);
   private static final agm<Integer> bU = agp.a(byp.class, ago.b);
   private static final cpz bW = cpz.a(cnb.tY, cnb.tZ, cnb.vd);
   private final bmh bX = new bmh(this.an, bU, bT);

   public byp(blz<? extends byp> $$0, ctp $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      this.bO.a(0, new btb(this));
      this.bO.a(1, new bua(this, 1.25));
      this.bO.a(3, new bst(this, 1.0));
      this.bO.a(4, new bup(this, 1.2, cpz.a(cnb.nQ), false));
      this.bO.a(4, new bup(this, 1.2, bW, false));
      this.bO.a(5, new btg(this, 1.1));
      this.bO.a(6, new buu(this, 1.0));
      this.bO.a(7, new btp(this, cfi.class, 6.0F));
      this.bO.a(8, new buc(this));
   }

   public static bnq.a u() {
      return bmn.C().a(bnr.l, 10.0).a(bnr.m, 0.25);
   }

   @Nullable
   @Override
   public bml cN() {
      return (bml)(this.i() && this.cQ() instanceof cfi $$0 && $$0.b(cnb.nQ) ? $$0 : super.cN());
   }

   @Override
   public void a(agm<?> $$0) {
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
   public void b(sn $$0) {
      super.b($$0);
      this.bX.a($$0);
   }

   @Override
   public void a(sn $$0) {
      super.a($$0);
      this.bX.b($$0);
   }

   @Override
   protected arr y() {
      return ars.sD;
   }

   @Override
   protected arr d(bkt $$0) {
      return ars.sF;
   }

   @Override
   protected arr n_() {
      return ars.sE;
   }

   @Override
   protected void b(hx $$0, djh $$1) {
      this.a(ars.sH, 0.15F, 1.0F);
   }

   @Override
   public bkb b(cfi $$0, bka $$1) {
      boolean $$2 = this.m($$0.b($$1));
      if (!$$2 && this.i() && !this.bP() && !$$0.fI()) {
         if (!this.dM().B) {
            $$0.n(this);
         }

         return bkb.a(this.dM().B);
      } else {
         bkb $$3 = super.b($$0, $$1);
         if (!$$3.a()) {
            cmy $$4 = $$0.b($$1);
            return $$4.a(cnb.nK) ? $$4.a($$0, this, $$1) : bkb.d;
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
         this.a(cnb.nK);
      }
   }

   @Override
   public boolean i() {
      return this.bX.d();
   }

   @Override
   public void a(@Nullable art $$0) {
      this.bX.a(true);
      if ($$0 != null) {
         this.dM().a(null, this, ars.sG, $$0, 0.5F, 1.0F);
      }
   }

   @Override
   public elt b(bml $$0) {
      ic $$1 = this.cF();
      if ($$1.o() == ic.a.b) {
         return super.b($$0);
      } else {
         int[][] $$2 = chf.a($$1);
         hx $$3 = this.dm();
         hx.a $$4 = new hx.a();
         UnmodifiableIterator var6 = $$0.fA().iterator();

         while (var6.hasNext()) {
            bmx $$5 = (bmx)var6.next();
            elo $$6 = $$0.e($$5);

            for (int[] $$7 : $$2) {
               $$4.d($$3.u() + $$7[0], $$3.v(), $$3.w() + $$7[1]);
               double $$8 = this.dM().j($$4);
               if (chf.a($$8)) {
                  elt $$9 = elt.a($$4, $$8);
                  if (chf.a(this.dM(), $$0, $$6.c($$9))) {
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
   public void a(and $$0, bmk $$1) {
      if ($$0.ak() != bjy.a) {
         cdk $$2 = blz.bu.a((ctp)$$0);
         if ($$2 != null) {
            $$2.a(bma.a, new cmy(cnb.oS));
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
   protected void a(cfi $$0, elt $$1) {
      super.a($$0, $$1);
      this.a($$0.dC(), $$0.dE() * 0.5F);
      this.N = this.aU = this.aW = this.dC();
      this.bX.b();
   }

   @Override
   protected elt b(cfi $$0, elt $$1) {
      return new elt(0.0, 0.0, 1.0);
   }

   @Override
   protected float e(cfi $$0) {
      return (float)(this.b(bnr.m) * 0.225 * (double)this.bX.c());
   }

   @Override
   public boolean a() {
      return this.bX.a(this.eg());
   }

   @Nullable
   public byp b(and $$0, blq $$1) {
      return blz.aw.a((ctp)$$0);
   }

   @Override
   public boolean m(cmy $$0) {
      return bW.a($$0);
   }

   @Override
   public elt cJ() {
      return new elt(0.0, (double)(0.6F * this.cI()), (double)(this.dg() * 0.4F));
   }

   @Override
   protected Vector3f a(blv $$0, blw $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - 0.03125F * $$2, 0.0F);
   }
}
