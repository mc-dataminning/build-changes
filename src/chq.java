import com.google.common.collect.UnmodifiableIterator;
import javax.annotation.Nullable;

public class chq extends cgz implements bvf, bvy {
   private static final ajy<Boolean> bY = akc.a(chq.class, aka.k);
   private static final ajy<Integer> bZ = akc.a(chq.class, aka.b);
   private final bve ca = new bve(this.al, bZ, bY);

   public chq(but<? extends chq> $$0, dgj $$1) {
      super($$0, $$1);
   }

   @Override
   protected void E() {
      this.bS.a(0, new cca(this));
      this.bS.a(1, new ccz(this, 1.25));
      this.bS.a(3, new cbs(this, 1.0));
      this.bS.a(4, new cdo(this, 1.2, $$0 -> $$0.a(cwu.ot), false));
      this.bS.a(4, new cdo(this, 1.2, $$0 -> $$0.a(awy.av), false));
      this.bS.a(5, new ccf(this, 1.1));
      this.bS.a(6, new cdt(this, 1.0));
      this.bS.a(7, new cco(this, coy.class, 6.0F));
      this.bS.a(8, new cdb(this));
   }

   public static bwp.a p() {
      return cgz.gx().a(bwq.s, 10.0).a(bwq.v, 0.25);
   }

   @Nullable
   @Override
   public bvi cW() {
      return (bvi)(this.j() && this.cZ() instanceof coy $$0 && $$0.b(cwu.ot) ? $$0 : super.cW());
   }

   @Override
   public void a(ajy<?> $$0) {
      if (bZ.equals($$0) && this.dV().C) {
         this.ca.a();
      }

      super.a($$0);
   }

   @Override
   protected void a(akc.a $$0) {
      super.a($$0);
      $$0.a(bY, false);
      $$0.a(bZ, 0);
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      this.ca.a($$0);
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      this.ca.b($$0);
   }

   @Override
   protected avz u() {
      return awa.ua;
   }

   @Override
   protected avz e(btc $$0) {
      return awa.uc;
   }

   @Override
   protected avz o_() {
      return awa.ub;
   }

   @Override
   protected void b(ji $$0, dwy $$1) {
      this.a(awa.ue, 0.15F, 1.0F);
   }

   @Override
   public bsl b(coy $$0, bsk $$1) {
      boolean $$2 = this.j($$0.b($$1));
      if (!$$2 && this.j() && !this.ca() && !$$0.fY()) {
         if (!this.dV().C) {
            $$0.n(this);
         }

         return bsl.a;
      } else {
         bsl $$3 = super.b($$0, $$1);
         if (!$$3.a()) {
            cwq $$4 = $$0.b($$1);
            return (bsl)($$4.a(cwu.on) ? $$4.a($$0, this, $$1) : bsl.e);
         } else {
            return $$3;
         }
      }
   }

   @Override
   public boolean f() {
      return this.bL() && !this.e_();
   }

   @Override
   protected void f(ard $$0) {
      super.f($$0);
      if (this.j()) {
         this.a($$0, cwu.on);
      }
   }

   @Override
   public boolean j() {
      return this.ca.d();
   }

   @Override
   public void a(cwq $$0, @Nullable awb $$1) {
      this.ca.a(true);
      if ($$1 != null) {
         this.dV().a(null, this, awa.ud, $$1, 0.5F, 1.0F);
      }
   }

   @Override
   public fbb b(bvi $$0) {
      jn $$1 = this.cP();
      if ($$1.o() == jn.a.b) {
         return super.b($$0);
      } else {
         int[][] $$2 = crd.a($$1);
         ji $$3 = this.dv();
         ji.a $$4 = new ji.a();
         UnmodifiableIterator var6 = $$0.fO().iterator();

         while (var6.hasNext()) {
            bvu $$5 = (bvu)var6.next();
            faw $$6 = $$0.f($$5);

            for (int[] $$7 : $$2) {
               $$4.d($$3.u() + $$7[0], $$3.v(), $$3.w() + $$7[1]);
               double $$8 = this.dV().j($$4);
               if (crd.a($$8)) {
                  fbb $$9 = fbb.a($$4, $$8);
                  if (crd.a(this.dV(), $$0, $$6.c($$9))) {
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
   public void a(ard $$0, bvh $$1) {
      if ($$0.am() != bsi.a) {
         cmu $$2 = this.a(but.bQ, buh.a(this, false, true), $$0x -> {
            if (this.eZ().f()) {
               $$0x.a(buu.a, new cwq(cwu.pB));
            }

            $$0x.fY();
         });
         if ($$2 == null) {
            super.a($$0, $$1);
         }
      } else {
         super.a($$0, $$1);
      }
   }

   @Override
   protected void a(coy $$0, fbb $$1) {
      super.a($$0, $$1);
      this.b($$0.dL(), $$0.dN() * 0.5F);
      this.N = this.aX = this.aZ = this.dL();
      this.ca.b();
   }

   @Override
   protected fbb b(coy $$0, fbb $$1) {
      return new fbb(0.0, 0.0, 1.0);
   }

   @Override
   protected float e(coy $$0) {
      return (float)(this.h(bwq.v) * 0.225 * (double)this.ca.c());
   }

   @Override
   public boolean a() {
      return this.ca.a(this.dY());
   }

   @Nullable
   public chq b(ard $$0, bud $$1) {
      return but.aQ.a($$0, bus.e);
   }

   @Override
   public boolean j(cwq $$0) {
      return $$0.a(awy.av);
   }

   @Override
   public fbb cT() {
      return new fbb(0.0, (double)(0.6F * this.cS()), (double)(this.dq() * 0.4F));
   }
}
