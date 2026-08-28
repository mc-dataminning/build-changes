import com.google.common.collect.UnmodifiableIterator;
import javax.annotation.Nullable;

public class cho extends cgx implements bvd, bvw {
   private static final ajy<Boolean> bY = akc.a(cho.class, aka.k);
   private static final ajy<Integer> bZ = akc.a(cho.class, aka.b);
   private final bvc ca = new bvc(this.al, bZ, bY);

   public cho(bur<? extends cho> $$0, dgh $$1) {
      super($$0, $$1);
   }

   @Override
   protected void E() {
      this.bS.a(0, new cby(this));
      this.bS.a(1, new ccx(this, 1.25));
      this.bS.a(3, new cbq(this, 1.0));
      this.bS.a(4, new cdm(this, 1.2, $$0 -> $$0.a(cws.ot), false));
      this.bS.a(4, new cdm(this, 1.2, $$0 -> $$0.a(awy.av), false));
      this.bS.a(5, new ccd(this, 1.1));
      this.bS.a(6, new cdr(this, 1.0));
      this.bS.a(7, new ccm(this, cow.class, 6.0F));
      this.bS.a(8, new ccz(this));
   }

   public static bwn.a p() {
      return cgx.gx().a(bwo.s, 10.0).a(bwo.v, 0.25);
   }

   @Nullable
   @Override
   public bvg cW() {
      return (bvg)(this.j() && this.cZ() instanceof cow $$0 && $$0.b(cws.ot) ? $$0 : super.cW());
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
   protected avz e(bta $$0) {
      return awa.uc;
   }

   @Override
   protected avz o_() {
      return awa.ub;
   }

   @Override
   protected void b(ji $$0, dww $$1) {
      this.a(awa.ue, 0.15F, 1.0F);
   }

   @Override
   public bsj b(cow $$0, bsi $$1) {
      boolean $$2 = this.j($$0.b($$1));
      if (!$$2 && this.j() && !this.ca() && !$$0.fY()) {
         if (!this.dV().C) {
            $$0.n(this);
         }

         return bsj.a;
      } else {
         bsj $$3 = super.b($$0, $$1);
         if (!$$3.a()) {
            cwo $$4 = $$0.b($$1);
            return (bsj)($$4.a(cws.on) ? $$4.a($$0, this, $$1) : bsj.e);
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
         this.a($$0, cws.on);
      }
   }

   @Override
   public boolean j() {
      return this.ca.d();
   }

   @Override
   public void a(cwo $$0, @Nullable awb $$1) {
      this.ca.a(true);
      if ($$1 != null) {
         this.dV().a(null, this, awa.ud, $$1, 0.5F, 1.0F);
      }
   }

   @Override
   public faz b(bvg $$0) {
      jn $$1 = this.cP();
      if ($$1.o() == jn.a.b) {
         return super.b($$0);
      } else {
         int[][] $$2 = crb.a($$1);
         ji $$3 = this.dv();
         ji.a $$4 = new ji.a();
         UnmodifiableIterator var6 = $$0.fO().iterator();

         while (var6.hasNext()) {
            bvs $$5 = (bvs)var6.next();
            fau $$6 = $$0.f($$5);

            for (int[] $$7 : $$2) {
               $$4.d($$3.u() + $$7[0], $$3.v(), $$3.w() + $$7[1]);
               double $$8 = this.dV().j($$4);
               if (crb.a($$8)) {
                  faz $$9 = faz.a($$4, $$8);
                  if (crb.a(this.dV(), $$0, $$6.c($$9))) {
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
   public void a(ard $$0, bvf $$1) {
      if ($$0.am() != bsg.a) {
         cms $$2 = this.a(bur.bQ, buf.a(this, false, true), $$0x -> {
            if (this.eZ().f()) {
               $$0x.a(bus.a, new cwo(cws.pB));
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
   protected void a(cow $$0, faz $$1) {
      super.a($$0, $$1);
      this.b($$0.dL(), $$0.dN() * 0.5F);
      this.N = this.aX = this.aZ = this.dL();
      this.ca.b();
   }

   @Override
   protected faz b(cow $$0, faz $$1) {
      return new faz(0.0, 0.0, 1.0);
   }

   @Override
   protected float e(cow $$0) {
      return (float)(this.h(bwo.v) * 0.225 * (double)this.ca.c());
   }

   @Override
   public boolean a() {
      return this.ca.a(this.dY());
   }

   @Nullable
   public cho b(ard $$0, bub $$1) {
      return bur.aQ.a($$0, buq.e);
   }

   @Override
   public boolean j(cwo $$0) {
      return $$0.a(awy.av);
   }

   @Override
   public faz cT() {
      return new faz(0.0, (double)(0.6F * this.cS()), (double)(this.dq() * 0.4F));
   }
}
