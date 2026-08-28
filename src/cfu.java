import com.google.common.collect.UnmodifiableIterator;
import javax.annotation.Nullable;

public class cfu extends cfd implements btk, bud {
   private static final akj<Boolean> bY = akn.a(cfu.class, akl.k);
   private static final akj<Integer> bZ = akn.a(cfu.class, akl.b);
   private final btj cb = new btj(this.ao, bZ, bY);

   public cfu(bsy<? extends cfu> $$0, dbw $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.bS.a(0, new caf(this));
      this.bS.a(1, new cbe(this, 1.25));
      this.bS.a(3, new bzx(this, 1.0));
      this.bS.a(4, new cbt(this, 1.2, $$0 -> $$0.a(cuq.nR), false));
      this.bS.a(4, new cbt(this, 1.2, $$0 -> $$0.a(awx.ar), false));
      this.bS.a(5, new cak(this, 1.1));
      this.bS.a(6, new cby(this, 1.0));
      this.bS.a(7, new cat(this, cmv.class, 6.0F));
      this.bS.a(8, new cbg(this));
   }

   public static buu.a s() {
      return btp.A().a(buv.q, 10.0).a(buv.r, 0.25);
   }

   @Nullable
   @Override
   public btn cQ() {
      return (btn)(this.i() && this.cT() instanceof cmv $$0 && $$0.b(cuq.nR) ? $$0 : super.cQ());
   }

   @Override
   public void a(akj<?> $$0) {
      if (bZ.equals($$0) && this.dP().B) {
         this.cb.a();
      }

      super.a($$0);
   }

   @Override
   protected void a(akn.a $$0) {
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
   protected avy v() {
      return avz.tx;
   }

   @Override
   protected avy d(brl $$0) {
      return avz.tz;
   }

   @Override
   protected avy o_() {
      return avz.ty;
   }

   @Override
   protected void b(iz $$0, dsa $$1) {
      this.a(avz.tB, 0.15F, 1.0F);
   }

   @Override
   public bqs b(cmv $$0, bqr $$1) {
      boolean $$2 = this.o($$0.b($$1));
      if (!$$2 && this.i() && !this.bS() && !$$0.fR()) {
         if (!this.dP().B) {
            $$0.n(this);
         }

         return bqs.a(this.dP().B);
      } else {
         bqs $$3 = super.b($$0, $$1);
         if (!$$3.a()) {
            cun $$4 = $$0.b($$1);
            return $$4.a(cuq.nL) ? $$4.a($$0, this, $$1) : bqs.e;
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
         this.a(cuq.nL);
      }
   }

   @Override
   public boolean i() {
      return this.cb.d();
   }

   @Override
   public void a(@Nullable awa $$0) {
      this.cb.a(true);
      if ($$0 != null) {
         this.dP().a(null, this, avz.tA, $$0, 0.5F, 1.0F);
      }
   }

   @Override
   public evp b(btn $$0) {
      je $$1 = this.cI();
      if ($$1.o() == je.a.b) {
         return super.b($$0);
      } else {
         int[][] $$2 = cow.a($$1);
         iz $$3 = this.dp();
         iz.a $$4 = new iz.a();
         UnmodifiableIterator var6 = $$0.fI().iterator();

         while (var6.hasNext()) {
            btz $$5 = (btz)var6.next();
            evk $$6 = $$0.f($$5);

            for (int[] $$7 : $$2) {
               $$4.d($$3.u() + $$7[0], $$3.v(), $$3.w() + $$7[1]);
               double $$8 = this.dP().j($$4);
               if (cow.a($$8)) {
                  evp $$9 = evp.a($$4, $$8);
                  if (cow.a(this.dP(), $$0, $$6.c($$9))) {
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
   public void a(are $$0, btm $$1) {
      if ($$0.al() != bqp.a) {
         ckw $$2 = bsy.bx.a((dbw)$$0);
         if ($$2 != null) {
            $$2.a(bsz.a, new cun(cuq.oV));
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
   protected void a(cmv $$0, evp $$1) {
      super.a($$0, $$1);
      this.a($$0.dF(), $$0.dH() * 0.5F);
      this.O = this.aY = this.ba = this.dF();
      this.cb.b();
   }

   @Override
   protected evp b(cmv $$0, evp $$1) {
      return new evp(0.0, 0.0, 1.0);
   }

   @Override
   protected float e(cmv $$0) {
      return (float)(this.g(buv.r) * 0.225 * (double)this.cb.c());
   }

   @Override
   public boolean a() {
      return this.cb.a(this.el());
   }

   @Nullable
   public cfu b(are $$0, bsm $$1) {
      return bsy.az.a((dbw)$$0);
   }

   @Override
   public boolean o(cun $$0) {
      return $$0.a(awx.ar);
   }

   @Override
   public evp cM() {
      return new evp(0.0, (double)(0.6F * this.cL()), (double)(this.dj() * 0.4F));
   }
}
