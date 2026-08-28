import com.google.common.collect.UnmodifiableIterator;
import javax.annotation.Nullable;

public class cfx extends cfg implements btn, bug {
   private static final akk<Boolean> bY = ako.a(cfx.class, akm.k);
   private static final akk<Integer> bZ = ako.a(cfx.class, akm.b);
   private final btm cb = new btm(this.ao, bZ, bY);

   public cfx(btb<? extends cfx> $$0, dbz $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.bS.a(0, new cai(this));
      this.bS.a(1, new cbh(this, 1.25));
      this.bS.a(3, new caa(this, 1.0));
      this.bS.a(4, new cbw(this, 1.2, $$0 -> $$0.a(cut.nR), false));
      this.bS.a(4, new cbw(this, 1.2, $$0 -> $$0.a(awy.ar), false));
      this.bS.a(5, new can(this, 1.1));
      this.bS.a(6, new ccb(this, 1.0));
      this.bS.a(7, new caw(this, cmy.class, 6.0F));
      this.bS.a(8, new cbj(this));
   }

   public static bux.a s() {
      return bts.A().a(buy.q, 10.0).a(buy.r, 0.25);
   }

   @Nullable
   @Override
   public btq cQ() {
      return (btq)(this.i() && this.cT() instanceof cmy $$0 && $$0.b(cut.nR) ? $$0 : super.cQ());
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
   protected avz d(bro $$0) {
      return awa.tz;
   }

   @Override
   protected avz o_() {
      return awa.ty;
   }

   @Override
   protected void b(iz $$0, dsd $$1) {
      this.a(awa.tB, 0.15F, 1.0F);
   }

   @Override
   public bqv b(cmy $$0, bqu $$1) {
      boolean $$2 = this.o($$0.b($$1));
      if (!$$2 && this.i() && !this.bS() && !$$0.fR()) {
         if (!this.dP().B) {
            $$0.n(this);
         }

         return bqv.a(this.dP().B);
      } else {
         bqv $$3 = super.b($$0, $$1);
         if (!$$3.a()) {
            cuq $$4 = $$0.b($$1);
            return $$4.a(cut.nL) ? $$4.a($$0, this, $$1) : bqv.e;
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
         this.a(cut.nL);
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
   public evs b(btq $$0) {
      je $$1 = this.cI();
      if ($$1.o() == je.a.b) {
         return super.b($$0);
      } else {
         int[][] $$2 = coz.a($$1);
         iz $$3 = this.dp();
         iz.a $$4 = new iz.a();
         UnmodifiableIterator var6 = $$0.fI().iterator();

         while (var6.hasNext()) {
            buc $$5 = (buc)var6.next();
            evn $$6 = $$0.f($$5);

            for (int[] $$7 : $$2) {
               $$4.d($$3.u() + $$7[0], $$3.v(), $$3.w() + $$7[1]);
               double $$8 = this.dP().j($$4);
               if (coz.a($$8)) {
                  evs $$9 = evs.a($$4, $$8);
                  if (coz.a(this.dP(), $$0, $$6.c($$9))) {
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
   public void a(arf $$0, btp $$1) {
      if ($$0.al() != bqs.a) {
         ckz $$2 = btb.bx.a((dbz)$$0);
         if ($$2 != null) {
            $$2.a(btc.a, new cuq(cut.oV));
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
   protected void a(cmy $$0, evs $$1) {
      super.a($$0, $$1);
      this.a($$0.dF(), $$0.dH() * 0.5F);
      this.O = this.aY = this.ba = this.dF();
      this.cb.b();
   }

   @Override
   protected evs b(cmy $$0, evs $$1) {
      return new evs(0.0, 0.0, 1.0);
   }

   @Override
   protected float e(cmy $$0) {
      return (float)(this.g(buy.r) * 0.225 * (double)this.cb.c());
   }

   @Override
   public boolean a() {
      return this.cb.a(this.el());
   }

   @Nullable
   public cfx b(arf $$0, bsp $$1) {
      return btb.az.a((dbz)$$0);
   }

   @Override
   public boolean o(cuq $$0) {
      return $$0.a(awy.ar);
   }

   @Override
   public evs cM() {
      return new evs(0.0, (double)(0.6F * this.cL()), (double)(this.dj() * 0.4F));
   }
}
