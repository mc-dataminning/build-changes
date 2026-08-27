import com.google.common.collect.UnmodifiableIterator;
import javax.annotation.Nullable;

public class cao extends bzx implements bof, box {
   private static final aie<Boolean> bT = aih.a(cao.class, aig.k);
   private static final aie<Integer> bU = aih.a(cao.class, aig.b);
   private static final csc bW = csc.a(cpg.ub, cpg.uc, cpg.vg);
   private final boe bX = new boe(this.am, bU, bT);

   public cao(bnw<? extends cao> $$0, cvr $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      this.bO.a(0, new buz(this));
      this.bO.a(1, new bvy(this, 1.25));
      this.bO.a(3, new bur(this, 1.0));
      this.bO.a(4, new bwn(this, 1.2, csc.a(cpg.nQ), false));
      this.bO.a(4, new bwn(this, 1.2, bW, false));
      this.bO.a(5, new bve(this, 1.1));
      this.bO.a(6, new bws(this, 1.0));
      this.bO.a(7, new bvn(this, chl.class, 6.0F));
      this.bO.a(8, new bwa(this));
   }

   public static bpo.a u() {
      return bok.C().a(bpp.n, 10.0).a(bpp.o, 0.25);
   }

   @Nullable
   @Override
   public boi cN() {
      return (boi)(this.i() && this.cQ() instanceof chl $$0 && $$0.b(cpg.nQ) ? $$0 : super.cN());
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
   protected atk y() {
      return atl.sT;
   }

   @Override
   protected atk d(bmp $$0) {
      return atl.sV;
   }

   @Override
   protected atk n_() {
      return atl.sU;
   }

   @Override
   protected void b(hz $$0, dlj $$1) {
      this.a(atl.sX, 0.15F, 1.0F);
   }

   @Override
   public blw b(chl $$0, blv $$1) {
      boolean $$2 = this.m($$0.b($$1));
      if (!$$2 && this.i() && !this.bP() && !$$0.fI()) {
         if (!this.dM().B) {
            $$0.m(this);
         }

         return blw.a(this.dM().B);
      } else {
         blw $$3 = super.b($$0, $$1);
         if (!$$3.a()) {
            cpd $$4 = $$0.b($$1);
            return $$4.a(cpg.nK) ? $$4.a($$0, this, $$1) : blw.d;
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
         this.a(cpg.nK);
      }
   }

   @Override
   public boolean i() {
      return this.bX.d();
   }

   @Override
   public void a(@Nullable atm $$0) {
      this.bX.a(true);
      if ($$0 != null) {
         this.dM().a(null, this, atl.sW, $$0, 0.5F, 1.0F);
      }
   }

   @Override
   public enz b(boi $$0) {
      ie $$1 = this.cF();
      if ($$1.o() == ie.a.b) {
         return super.b($$0);
      } else {
         int[][] $$2 = cjj.a($$1);
         hz $$3 = this.dm();
         hz.a $$4 = new hz.a();
         UnmodifiableIterator var6 = $$0.fA().iterator();

         while (var6.hasNext()) {
            bot $$5 = (bot)var6.next();
            enu $$6 = $$0.f($$5);

            for (int[] $$7 : $$2) {
               $$4.d($$3.u() + $$7[0], $$3.v(), $$3.w() + $$7[1]);
               double $$8 = this.dM().j($$4);
               if (cjj.a($$8)) {
                  enz $$9 = enz.a($$4, $$8);
                  if (cjj.a(this.dM(), $$0, $$6.c($$9))) {
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
   public void a(aow $$0, boh $$1) {
      if ($$0.aj() != blt.a) {
         cfm $$2 = bnw.bv.a((cvr)$$0);
         if ($$2 != null) {
            $$2.a(bnx.a, new cpd(cpg.oU));
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
   protected void a(chl $$0, enz $$1) {
      super.a($$0, $$1);
      this.a($$0.dC(), $$0.dE() * 0.5F);
      this.M = this.aU = this.aW = this.dC();
      this.bX.b();
   }

   @Override
   protected enz b(chl $$0, enz $$1) {
      return new enz(0.0, 0.0, 1.0);
   }

   @Override
   protected float e(chl $$0) {
      return (float)(this.g(bpp.o) * 0.225 * (double)this.bX.c());
   }

   @Override
   public boolean a() {
      return this.bX.a(this.eh());
   }

   @Nullable
   public cao b(aow $$0, bnl $$1) {
      return bnw.ax.a((cvr)$$0);
   }

   @Override
   public boolean m(cpd $$0) {
      return bW.a($$0);
   }

   @Override
   public enz cJ() {
      return new enz(0.0, (double)(0.6F * this.cI()), (double)(this.dg() * 0.4F));
   }
}
