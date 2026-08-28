import com.google.common.collect.UnmodifiableIterator;
import javax.annotation.Nullable;

public class cfr extends cfa implements bth, bua {
   private static final akg<Boolean> bY = akk.a(cfr.class, aki.k);
   private static final akg<Integer> bZ = akk.a(cfr.class, aki.b);
   private final btg cb = new btg(this.ao, bZ, bY);

   public cfr(bsv<? extends cfr> $$0, dbt $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.bS.a(0, new cac(this));
      this.bS.a(1, new cbb(this, 1.25));
      this.bS.a(3, new bzu(this, 1.0));
      this.bS.a(4, new cbq(this, 1.2, $$0 -> $$0.a(cun.nR), false));
      this.bS.a(4, new cbq(this, 1.2, $$0 -> $$0.a(awu.ar), false));
      this.bS.a(5, new cah(this, 1.1));
      this.bS.a(6, new cbv(this, 1.0));
      this.bS.a(7, new caq(this, cms.class, 6.0F));
      this.bS.a(8, new cbd(this));
   }

   public static bur.a s() {
      return btm.A().a(bus.q, 10.0).a(bus.r, 0.25);
   }

   @Nullable
   @Override
   public btk cQ() {
      return (btk)(this.i() && this.cT() instanceof cms $$0 && $$0.b(cun.nR) ? $$0 : super.cQ());
   }

   @Override
   public void a(akg<?> $$0) {
      if (bZ.equals($$0) && this.dP().B) {
         this.cb.a();
      }

      super.a($$0);
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(bY, false);
      $$0.a(bZ, 0);
   }

   @Override
   public void b(ur $$0) {
      super.b($$0);
      this.cb.a($$0);
   }

   @Override
   public void a(ur $$0) {
      super.a($$0);
      this.cb.b($$0);
   }

   @Override
   protected avv v() {
      return avw.tx;
   }

   @Override
   protected avv d(bri $$0) {
      return avw.tz;
   }

   @Override
   protected avv o_() {
      return avw.ty;
   }

   @Override
   protected void b(iz $$0, drx $$1) {
      this.a(avw.tB, 0.15F, 1.0F);
   }

   @Override
   public bqp b(cms $$0, bqo $$1) {
      boolean $$2 = this.o($$0.b($$1));
      if (!$$2 && this.i() && !this.bS() && !$$0.fR()) {
         if (!this.dP().B) {
            $$0.n(this);
         }

         return bqp.a(this.dP().B);
      } else {
         bqp $$3 = super.b($$0, $$1);
         if (!$$3.a()) {
            cuk $$4 = $$0.b($$1);
            return $$4.a(cun.nL) ? $$4.a($$0, this, $$1) : bqp.e;
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
         this.a(cun.nL);
      }
   }

   @Override
   public boolean i() {
      return this.cb.d();
   }

   @Override
   public void a(@Nullable avx $$0) {
      this.cb.a(true);
      if ($$0 != null) {
         this.dP().a(null, this, avw.tA, $$0, 0.5F, 1.0F);
      }
   }

   @Override
   public evm b(btk $$0) {
      je $$1 = this.cI();
      if ($$1.o() == je.a.b) {
         return super.b($$0);
      } else {
         int[][] $$2 = cot.a($$1);
         iz $$3 = this.dp();
         iz.a $$4 = new iz.a();
         UnmodifiableIterator var6 = $$0.fI().iterator();

         while (var6.hasNext()) {
            btw $$5 = (btw)var6.next();
            evh $$6 = $$0.f($$5);

            for (int[] $$7 : $$2) {
               $$4.d($$3.u() + $$7[0], $$3.v(), $$3.w() + $$7[1]);
               double $$8 = this.dP().j($$4);
               if (cot.a($$8)) {
                  evm $$9 = evm.a($$4, $$8);
                  if (cot.a(this.dP(), $$0, $$6.c($$9))) {
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
   public void a(arb $$0, btj $$1) {
      if ($$0.al() != bqm.a) {
         ckt $$2 = bsv.bx.a((dbt)$$0);
         if ($$2 != null) {
            $$2.a(bsw.a, new cuk(cun.oV));
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
   protected void a(cms $$0, evm $$1) {
      super.a($$0, $$1);
      this.a($$0.dF(), $$0.dH() * 0.5F);
      this.O = this.aY = this.ba = this.dF();
      this.cb.b();
   }

   @Override
   protected evm b(cms $$0, evm $$1) {
      return new evm(0.0, 0.0, 1.0);
   }

   @Override
   protected float e(cms $$0) {
      return (float)(this.g(bus.r) * 0.225 * (double)this.cb.c());
   }

   @Override
   public boolean a() {
      return this.cb.a(this.el());
   }

   @Nullable
   public cfr b(arb $$0, bsj $$1) {
      return bsv.az.a((dbt)$$0);
   }

   @Override
   public boolean o(cuk $$0) {
      return $$0.a(awu.ar);
   }

   @Override
   public evm cM() {
      return new evm(0.0, (double)(0.6F * this.cL()), (double)(this.dj() * 0.4F));
   }
}
