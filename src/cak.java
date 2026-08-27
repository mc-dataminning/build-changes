import com.google.common.collect.UnmodifiableIterator;
import javax.annotation.Nullable;

public class cak extends bzt implements bod, bov {
   private static final aie<Boolean> bT = aih.a(cak.class, aig.k);
   private static final aie<Integer> bU = aih.a(cak.class, aig.b);
   private static final cry bW = cry.a(cpc.ub, cpc.uc, cpc.vg);
   private final boc bX = new boc(this.am, bU, bT);

   public cak(bnu<? extends cak> $$0, cvn $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      this.bO.a(0, new buv(this));
      this.bO.a(1, new bvu(this, 1.25));
      this.bO.a(3, new bun(this, 1.0));
      this.bO.a(4, new bwj(this, 1.2, cry.a(cpc.nQ), false));
      this.bO.a(4, new bwj(this, 1.2, bW, false));
      this.bO.a(5, new bva(this, 1.1));
      this.bO.a(6, new bwo(this, 1.0));
      this.bO.a(7, new bvj(this, chh.class, 6.0F));
      this.bO.a(8, new bvw(this));
   }

   public static bpk.a u() {
      return boi.C().a(bpl.n, 10.0).a(bpl.o, 0.25);
   }

   @Nullable
   @Override
   public bog cN() {
      return (bog)(this.i() && this.cQ() instanceof chh $$0 && $$0.b(cpc.nQ) ? $$0 : super.cN());
   }

   @Override
   public void a(aie<?> $$0) {
      if (bU.equals($$0) && this.dM().B) {
         this.bX.a();
      }

      super.a($$0);
   }

   @Override
   protected void c_() {
      super.c_();
      this.am.a(bT, false);
      this.am.a(bU, 0);
   }

   @Override
   public void b(sw $$0) {
      super.b($$0);
      this.bX.a($$0);
   }

   @Override
   public void a(sw $$0) {
      super.a($$0);
      this.bX.b($$0);
   }

   @Override
   protected atj y() {
      return atk.sS;
   }

   @Override
   protected atj d(bmn $$0) {
      return atk.sU;
   }

   @Override
   protected atj n_() {
      return atk.sT;
   }

   @Override
   protected void b(hz $$0, dlf $$1) {
      this.a(atk.sW, 0.15F, 1.0F);
   }

   @Override
   public blu b(chh $$0, blt $$1) {
      boolean $$2 = this.m($$0.b($$1));
      if (!$$2 && this.i() && !this.bP() && !$$0.fI()) {
         if (!this.dM().B) {
            $$0.m(this);
         }

         return blu.a(this.dM().B);
      } else {
         blu $$3 = super.b($$0, $$1);
         if (!$$3.a()) {
            coz $$4 = $$0.b($$1);
            return $$4.a(cpc.nK) ? $$4.a($$0, this, $$1) : blu.d;
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
   protected void ez() {
      super.ez();
      if (this.i()) {
         this.a(cpc.nK);
      }
   }

   @Override
   public boolean i() {
      return this.bX.d();
   }

   @Override
   public void a(@Nullable atl $$0) {
      this.bX.a(true);
      if ($$0 != null) {
         this.dM().a(null, this, atk.sV, $$0, 0.5F, 1.0F);
      }
   }

   @Override
   public ens b(bog $$0) {
      ie $$1 = this.cF();
      if ($$1.o() == ie.a.b) {
         return super.b($$0);
      } else {
         int[][] $$2 = cjf.a($$1);
         hz $$3 = this.dm();
         hz.a $$4 = new hz.a();
         UnmodifiableIterator var6 = $$0.fA().iterator();

         while (var6.hasNext()) {
            bor $$5 = (bor)var6.next();
            enn $$6 = $$0.f($$5);

            for (int[] $$7 : $$2) {
               $$4.d($$3.u() + $$7[0], $$3.v(), $$3.w() + $$7[1]);
               double $$8 = this.dM().j($$4);
               if (cjf.a($$8)) {
                  ens $$9 = ens.a($$4, $$8);
                  if (cjf.a(this.dM(), $$0, $$6.c($$9))) {
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
   public void a(aov $$0, bof $$1) {
      if ($$0.ak() != blr.a) {
         cfi $$2 = bnu.bv.a((cvn)$$0);
         if ($$2 != null) {
            $$2.a(bnv.a, new coz(cpc.oU));
            $$2.b(this.dr(), this.dt(), this.dx(), this.dC(), this.dE());
            $$2.t(this.fW());
            $$2.a(this.o_());
            if (this.ae()) {
               $$2.b(this.af());
               $$2.n(this.cB());
            }

            $$2.fL();
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
   protected void a(chh $$0, ens $$1) {
      super.a($$0, $$1);
      this.a($$0.dC(), $$0.dE() * 0.5F);
      this.M = this.aU = this.aW = this.dC();
      this.bX.b();
   }

   @Override
   protected ens b(chh $$0, ens $$1) {
      return new ens(0.0, 0.0, 1.0);
   }

   @Override
   protected float e(chh $$0) {
      return (float)(this.g(bpl.o) * 0.225 * (double)this.bX.c());
   }

   @Override
   public boolean a() {
      return this.bX.a(this.eh());
   }

   @Nullable
   public cak b(aov $$0, bnj $$1) {
      return bnu.ax.a((cvn)$$0);
   }

   @Override
   public boolean m(coz $$0) {
      return bW.a($$0);
   }

   @Override
   public ens cJ() {
      return new ens(0.0, (double)(0.6F * this.cI()), (double)(this.dg() * 0.4F));
   }
}
