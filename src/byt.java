import com.google.common.collect.UnmodifiableIterator;
import javax.annotation.Nullable;

public class byt extends byc implements bml, bne {
   private static final agn<Boolean> bU = agq.a(byt.class, agp.k);
   private static final agn<Integer> bV = agq.a(byt.class, agp.b);
   private static final cqh bX = cqh.a(cnj.ub, cnj.uc, cnj.vg);
   private final bmk bY = new bmk(this.an, bV, bU);

   public byt(bmc<? extends byt> $$0, ctx $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      this.bP.a(0, new bte(this));
      this.bP.a(1, new bud(this, 1.25));
      this.bP.a(3, new bsw(this, 1.0));
      this.bP.a(4, new bus(this, 1.2, cqh.a(cnj.nQ), false));
      this.bP.a(4, new bus(this, 1.2, bX, false));
      this.bP.a(5, new btj(this, 1.1));
      this.bP.a(6, new bux(this, 1.0));
      this.bP.a(7, new bts(this, cfq.class, 6.0F));
      this.bP.a(8, new buf(this));
   }

   public static bnt.a u() {
      return bmq.C().a(bnu.n, 10.0).a(bnu.o, 0.25);
   }

   @Nullable
   @Override
   public bmo cN() {
      return (bmo)(this.i() && this.cQ() instanceof cfq $$0 && $$0.b(cnj.nQ) ? $$0 : super.cN());
   }

   @Override
   public void a(agn<?> $$0) {
      if (bV.equals($$0) && this.dL().B) {
         this.bY.a();
      }

      super.a($$0);
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(bU, false);
      this.an.a(bV, 0);
   }

   @Override
   public void b(so $$0) {
      super.b($$0);
      this.bY.a($$0);
   }

   @Override
   public void a(so $$0) {
      super.a($$0);
      this.bY.b($$0);
   }

   @Override
   protected ars y() {
      return art.sS;
   }

   @Override
   protected ars d(bkv $$0) {
      return art.sU;
   }

   @Override
   protected ars n_() {
      return art.sT;
   }

   @Override
   protected void b(hx $$0, djp $$1) {
      this.a(art.sW, 0.15F, 1.0F);
   }

   @Override
   public bkc b(cfq $$0, bkb $$1) {
      boolean $$2 = this.m($$0.b($$1));
      if (!$$2 && this.i() && !this.bP() && !$$0.fI()) {
         if (!this.dL().B) {
            $$0.m(this);
         }

         return bkc.a(this.dL().B);
      } else {
         bkc $$3 = super.b($$0, $$1);
         if (!$$3.a()) {
            cng $$4 = $$0.b($$1);
            return $$4.a(cnj.nK) ? $$4.a($$0, this, $$1) : bkc.d;
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
         this.a(cnj.nK);
      }
   }

   @Override
   public boolean i() {
      return this.bY.d();
   }

   @Override
   public void a(@Nullable aru $$0) {
      this.bY.a(true);
      if ($$0 != null) {
         this.dL().a(null, this, art.sV, $$0, 0.5F, 1.0F);
      }
   }

   @Override
   public emc b(bmo $$0) {
      ic $$1 = this.cF();
      if ($$1.o() == ic.a.b) {
         return super.b($$0);
      } else {
         int[][] $$2 = chn.a($$1);
         hx $$3 = this.dl();
         hx.a $$4 = new hx.a();
         UnmodifiableIterator var6 = $$0.fA().iterator();

         while (var6.hasNext()) {
            bna $$5 = (bna)var6.next();
            elx $$6 = $$0.f($$5);

            for (int[] $$7 : $$2) {
               $$4.d($$3.u() + $$7[0], $$3.v(), $$3.w() + $$7[1]);
               double $$8 = this.dL().j($$4);
               if (chn.a($$8)) {
                  emc $$9 = emc.a($$4, $$8);
                  if (chn.a(this.dL(), $$0, $$6.c($$9))) {
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
   public void a(ane $$0, bmn $$1) {
      if ($$0.ak() != bjz.a) {
         cdr $$2 = bmc.bv.a((ctx)$$0);
         if ($$2 != null) {
            $$2.a(bmd.a, new cng(cnj.oU));
            $$2.b(this.dq(), this.ds(), this.dw(), this.dB(), this.dD());
            $$2.t(this.fV());
            $$2.a(this.o_());
            if (this.ae()) {
               $$2.b(this.af());
               $$2.n(this.cB());
            }

            $$2.fK();
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
   protected void a(cfq $$0, emc $$1) {
      super.a($$0, $$1);
      this.a($$0.dB(), $$0.dD() * 0.5F);
      this.N = this.aU = this.aW = this.dB();
      this.bY.b();
   }

   @Override
   protected emc b(cfq $$0, emc $$1) {
      return new emc(0.0, 0.0, 1.0);
   }

   @Override
   protected float e(cfq $$0) {
      return (float)(this.g(bnu.o) * 0.225 * (double)this.bY.c());
   }

   @Override
   public boolean a() {
      return this.bY.a(this.eg());
   }

   @Nullable
   public byt b(ane $$0, blr $$1) {
      return bmc.ax.a((ctx)$$0);
   }

   @Override
   public boolean m(cng $$0) {
      return bX.a($$0);
   }

   @Override
   public emc cJ() {
      return new emc(0.0, (double)(0.6F * this.cI()), (double)(this.dg() * 0.4F));
   }
}
