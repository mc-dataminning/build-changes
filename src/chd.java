import com.google.common.collect.UnmodifiableIterator;
import javax.annotation.Nullable;

public class chd extends cgm implements bus, bvl {
   private static final akk<Boolean> bY = ako.a(chd.class, akm.k);
   private static final akk<Integer> bZ = ako.a(chd.class, akm.b);
   private final bur ca = new bur(this.am, bZ, bY);

   public chd(bug<? extends chd> $$0, dev $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      this.bS.a(0, new cbn(this));
      this.bS.a(1, new ccm(this, 1.25));
      this.bS.a(3, new cbf(this, 1.0));
      this.bS.a(4, new cdb(this, 1.2, $$0 -> $$0.a(cwb.nR), false));
      this.bS.a(4, new cdb(this, 1.2, $$0 -> $$0.a(axi.as), false));
      this.bS.a(5, new cbs(this, 1.1));
      this.bS.a(6, new cdg(this, 1.0));
      this.bS.a(7, new ccb(this, coh.class, 6.0F));
      this.bS.a(8, new cco(this));
   }

   public static bwc.a q() {
      return cgm.gA().a(bwd.s, 10.0).a(bwd.v, 0.25);
   }

   @Nullable
   @Override
   public buv cY() {
      return (buv)(this.i() && this.db() instanceof coh $$0 && $$0.b(cwb.nR) ? $$0 : super.cY());
   }

   @Override
   public void a(akk<?> $$0) {
      if (bZ.equals($$0) && this.dX().C) {
         this.ca.a();
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
   public void b(uj $$0) {
      super.b($$0);
      this.ca.a($$0);
   }

   @Override
   public void a(uj $$0) {
      super.a($$0);
      this.ca.b($$0);
   }

   @Override
   protected awj w() {
      return awk.tz;
   }

   @Override
   protected awj d(bsp $$0) {
      return awk.tB;
   }

   @Override
   protected awj o_() {
      return awk.tA;
   }

   @Override
   protected void b(jg $$0, dvd $$1) {
      this.a(awk.tD, 0.15F, 1.0F);
   }

   @Override
   public bry b(coh $$0, brx $$1) {
      boolean $$2 = this.l($$0.b($$1));
      if (!$$2 && this.i() && !this.cb() && !$$0.ga()) {
         if (!this.dX().C) {
            $$0.n(this);
         }

         return bry.a;
      } else {
         bry $$3 = super.b($$0, $$1);
         if (!$$3.a()) {
            cvx $$4 = $$0.b($$1);
            return (bry)($$4.a(cwb.nL) ? $$4.a($$0, this, $$1) : bry.e);
         } else {
            return $$3;
         }
      }
   }

   @Override
   public boolean f() {
      return this.bM() && !this.p_();
   }

   @Override
   protected void eJ() {
      super.eJ();
      if (this.i()) {
         this.a(cwb.nL);
      }
   }

   @Override
   public boolean i() {
      return this.ca.d();
   }

   @Override
   public void a(cvx $$0, @Nullable awl $$1) {
      this.ca.a(true);
      if ($$1 != null) {
         this.dX().a(null, this, awk.tC, $$1, 0.5F, 1.0F);
      }
   }

   @Override
   public ezh b(buv $$0) {
      jl $$1 = this.cQ();
      if ($$1.o() == jl.a.b) {
         return super.b($$0);
      } else {
         int[][] $$2 = cqk.a($$1);
         jg $$3 = this.dx();
         jg.a $$4 = new jg.a();
         UnmodifiableIterator var6 = $$0.fQ().iterator();

         while (var6.hasNext()) {
            bvh $$5 = (bvh)var6.next();
            ezc $$6 = $$0.f($$5);

            for (int[] $$7 : $$2) {
               $$4.d($$3.u() + $$7[0], $$3.v(), $$3.w() + $$7[1]);
               double $$8 = this.dX().j($$4);
               if (cqk.a($$8)) {
                  ezh $$9 = ezh.a($$4, $$8);
                  if (cqk.a(this.dX(), $$0, $$6.c($$9))) {
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
   public void a(arm $$0, buu $$1) {
      if ($$0.am() != brv.a) {
         cmh $$2 = this.a(bug.bx, btu.a(this, false, true), $$0x -> {
            if (this.fb().f()) {
               $$0x.a(buh.a, new cvx(cwb.oX));
            }

            $$0x.gb();
         });
         if ($$2 == null) {
            super.a($$0, $$1);
         }
      } else {
         super.a($$0, $$1);
      }
   }

   @Override
   protected void a(coh $$0, ezh $$1) {
      super.a($$0, $$1);
      this.a($$0.dN(), $$0.dP() * 0.5F);
      this.O = this.aU = this.aW = this.dN();
      this.ca.b();
   }

   @Override
   protected ezh b(coh $$0, ezh $$1) {
      return new ezh(0.0, 0.0, 1.0);
   }

   @Override
   protected float e(coh $$0) {
      return (float)(this.h(bwd.v) * 0.225 * (double)this.ca.c());
   }

   @Override
   public boolean a() {
      return this.ca.a(this.ea());
   }

   @Nullable
   public chd b(arm $$0, btq $$1) {
      return bug.az.a($$0, buf.e);
   }

   @Override
   public boolean l(cvx $$0) {
      return $$0.a(axi.as);
   }

   @Override
   public ezh cU() {
      return new ezh(0.0, (double)(0.6F * this.cT()), (double)(this.ds() * 0.4F));
   }
}
