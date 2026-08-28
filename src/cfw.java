import com.google.common.collect.UnmodifiableIterator;
import javax.annotation.Nullable;

public class cfw extends cff implements btm, buf {
   private static final akk<Boolean> bY = ako.a(cfw.class, akm.k);
   private static final akk<Integer> bZ = ako.a(cfw.class, akm.b);
   private final btl cb = new btl(this.ao, bZ, bY);

   public cfw(bta<? extends cfw> $$0, dby $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.bS.a(0, new cah(this));
      this.bS.a(1, new cbg(this, 1.25));
      this.bS.a(3, new bzz(this, 1.0));
      this.bS.a(4, new cbv(this, 1.2, $$0 -> $$0.a(cus.nR), false));
      this.bS.a(4, new cbv(this, 1.2, $$0 -> $$0.a(awy.ar), false));
      this.bS.a(5, new cam(this, 1.1));
      this.bS.a(6, new cca(this, 1.0));
      this.bS.a(7, new cav(this, cmx.class, 6.0F));
      this.bS.a(8, new cbi(this));
   }

   public static buw.a s() {
      return btr.A().a(bux.q, 10.0).a(bux.r, 0.25);
   }

   @Nullable
   @Override
   public btp cQ() {
      return (btp)(this.i() && this.cT() instanceof cmx $$0 && $$0.b(cus.nR) ? $$0 : super.cQ());
   }

   @Override
   public void a(akk<?> $$0) {
      if (bZ.equals($$0) && this.dP().B) {
         this.cb.a();
      }

      super.a($$0);
   }

   @Override
   protected void a(ako.a $$0) {
      super.a($$0);
      $$0.a(bY, false);
      $$0.a(bZ, 0);
   }

   @Override
   public void b(us $$0) {
      super.b($$0);
      this.cb.a($$0);
   }

   @Override
   public void a(us $$0) {
      super.a($$0);
      this.cb.b($$0);
   }

   @Override
   protected avz v() {
      return awa.tx;
   }

   @Override
   protected avz d(brn $$0) {
      return awa.tz;
   }

   @Override
   protected avz o_() {
      return awa.ty;
   }

   @Override
   protected void b(iz $$0, dsc $$1) {
      this.a(awa.tB, 0.15F, 1.0F);
   }

   @Override
   public bqu b(cmx $$0, bqt $$1) {
      boolean $$2 = this.o($$0.b($$1));
      if (!$$2 && this.i() && !this.bS() && !$$0.fR()) {
         if (!this.dP().B) {
            $$0.n(this);
         }

         return bqu.a(this.dP().B);
      } else {
         bqu $$3 = super.b($$0, $$1);
         if (!$$3.a()) {
            cup $$4 = $$0.b($$1);
            return $$4.a(cus.nL) ? $$4.a($$0, this, $$1) : bqu.e;
         } else {
            return $$3;
         }
      }
   }

   @Override
   public boolean f() {
      return this.bD() && !this.p_();
   }

   @Override
   protected void eD() {
      super.eD();
      if (this.i()) {
         this.a(cus.nL);
      }
   }

   @Override
   public boolean i() {
      return this.cb.d();
   }

   @Override
   public void a(@Nullable awb $$0) {
      this.cb.a(true);
      if ($$0 != null) {
         this.dP().a(null, this, awa.tA, $$0, 0.5F, 1.0F);
      }
   }

   @Override
   public evr b(btp $$0) {
      je $$1 = this.cI();
      if ($$1.o() == je.a.b) {
         return super.b($$0);
      } else {
         int[][] $$2 = coy.a($$1);
         iz $$3 = this.dp();
         iz.a $$4 = new iz.a();
         UnmodifiableIterator var6 = $$0.fI().iterator();

         while (var6.hasNext()) {
            bub $$5 = (bub)var6.next();
            evm $$6 = $$0.f($$5);

            for (int[] $$7 : $$2) {
               $$4.d($$3.u() + $$7[0], $$3.v(), $$3.w() + $$7[1]);
               double $$8 = this.dP().j($$4);
               if (coy.a($$8)) {
                  evr $$9 = evr.a($$4, $$8);
                  if (coy.a(this.dP(), $$0, $$6.c($$9))) {
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
   public void a(arf $$0, bto $$1) {
      if ($$0.al() != bqr.a) {
         cky $$2 = bta.bx.a((dby)$$0);
         if ($$2 != null) {
            $$2.a(btb.a, new cup(cus.oV));
            $$2.b(this.du(), this.dw(), this.dA(), this.dF(), this.dH());
            $$2.t(this.gg());
            $$2.a(this.p_());
            if (this.ag()) {
               $$2.b(this.ah());
               $$2.o(this.cE());
            }

            $$2.fU();
            $$0.b($$2);
            this.ao();
         } else {
            super.a($$0, $$1);
         }
      } else {
         super.a($$0, $$1);
      }
   }

   @Override
   protected void a(cmx $$0, evr $$1) {
      super.a($$0, $$1);
      this.a($$0.dF(), $$0.dH() * 0.5F);
      this.O = this.aY = this.ba = this.dF();
      this.cb.b();
   }

   @Override
   protected evr b(cmx $$0, evr $$1) {
      return new evr(0.0, 0.0, 1.0);
   }

   @Override
   protected float e(cmx $$0) {
      return (float)(this.g(bux.r) * 0.225 * (double)this.cb.c());
   }

   @Override
   public boolean a() {
      return this.cb.a(this.el());
   }

   @Nullable
   public cfw b(arf $$0, bso $$1) {
      return bta.az.a((dby)$$0);
   }

   @Override
   public boolean o(cup $$0) {
      return $$0.a(awy.ar);
   }

   @Override
   public evr cM() {
      return new evr(0.0, (double)(0.6F * this.cL()), (double)(this.dj() * 0.4F));
   }
}
