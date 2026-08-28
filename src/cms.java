import com.mojang.serialization.Dynamic;
import java.util.Optional;
import javax.annotation.Nullable;

public class cms extends clw {
   private static final int ca = 20;
   private static final int cb = 1;
   private static final int cc = 20;
   private static final int cd = 3;
   private static final int ce = 5;
   private static final int cf = 10;
   private static final float cg = 3.0F;
   private static final int ch = 1;
   private static final int ci = 80;
   public bub a = new bub();
   public bub b = new bub();
   public bub c = new bub();
   public bub d = new bub();
   public bub bY = new bub();
   public bub bZ = new bub();
   private int cj = 0;
   private int ck = 0;
   private static final cpp cl = ($$0, $$1, $$2) -> {
      $$1.dW().a(null, $$1, avz.cF, $$1.dn(), 1.0F, 1.0F);
      cpp.b.deflect($$0, $$1, $$2);
   };

   public static bwm.a m() {
      return bvh.C().a(bwn.v, 0.63F).a(bwn.s, 30.0).a(bwn.m, 24.0).a(bwn.c, 3.0);
   }

   public cms(buq<? extends clw> $$0, dgg $$1) {
      super($$0, $$1);
      this.a(eto.z, -1.0F);
      this.a(eto.o, -1.0F);
      this.bN = 10;
   }

   @Override
   protected bwh<?> a(Dynamic<?> $$0) {
      return cmt.a(this, this.ed().a($$0));
   }

   @Override
   public bwh<cms> ec() {
      return (bwh<cms>)super.ec();
   }

   @Override
   protected bwh.b<cms> ed() {
      return bwh.a(cmt.f, cmt.e);
   }

   @Override
   public void a(ajx<?> $$0) {
      if (this.dW().B_() && aq.equals($$0)) {
         this.gr();
         bvr $$1 = this.aw();
         switch ($$1) {
            case q:
               this.bY.b(this.af);
               break;
            case r:
               this.bZ.b(this.af);
               break;
            case p:
               this.b.b(this.af);
         }
      }

      super.a($$0);
   }

   private void gr() {
      this.bY.a();
      this.a.a();
      this.bZ.a();
      this.d.a();
   }

   @Override
   public void h() {
      bvr $$0 = this.aw();
      switch ($$0) {
         case q:
         case r:
         case a:
            this.p().b(1 + this.dZ().a(1));
            break;
         case p:
            this.b(20);
            break;
         case g:
            this.d.b(this.af);
            this.t();
      }

      this.a.b(this.af);
      if ($$0 != bvr.p && this.b.b()) {
         this.c.a(this.af);
         this.b.a();
      }

      this.ck = this.ck == 0 ? this.ae.a(1, 80) : this.ck - 1;
      if (this.ck == 0) {
         this.x();
      }

      super.h();
   }

   public cms p() {
      this.cj = 0;
      return this;
   }

   public void t() {
      if (++this.cj <= 5) {
         dwv $$0 = !this.dx().l() ? this.dx() : this.bu();
         fay $$1 = this.dz();
         fay $$2 = this.du().e($$1).b(0.0, 0.1F, 0.0);

         for (int $$3 = 0; $$3 < 3; $$3++) {
            this.dW().a(new ll(lt.b, $$0), $$2.d, $$2.e, $$2.f, 0.0, 0.0, 0.0);
         }
      }
   }

   public void b(int $$0) {
      if (!this.bZ()) {
         fay $$1 = this.cR().f();
         fay $$2 = new fay($$1.d, this.du().e, $$1.f);
         dwv $$3 = !this.dx().l() ? this.dx() : this.bu();
         if ($$3.o() != dpv.a) {
            for (int $$4 = 0; $$4 < $$0; $$4++) {
               this.dW().a(new ll(lt.b, $$3), $$2.d, $$2.e, $$2.f, 0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public void R() {
      if (this.O_() == null || !this.aJ()) {
         this.dW().a(this, this.u(), this.dn(), 1.0F, 1.0F);
      }
   }

   public void x() {
      float $$0 = 0.7F + 0.4F * this.ae.i();
      float $$1 = 0.8F + 0.2F * this.ae.i();
      this.dW().a(this, avz.cP, this.dn(), $$1, $$0);
   }

   @Override
   public cpp a(cpo $$0) {
      if ($$0.aq() != buq.s && $$0.aq() != buq.bG) {
         return this.aq().a(aws.r) ? cl : cpp.a;
      } else {
         return cpp.a;
      }
   }

   @Override
   public awa dn() {
      return awa.f;
   }

   @Override
   protected avy o_() {
      return avz.cN;
   }

   @Override
   protected avy e(bsz $$0) {
      return avz.cO;
   }

   @Override
   protected avy u() {
      return this.aJ() ? avz.cH : avz.cI;
   }

   public Optional<bvf> gp() {
      return this.ec().c(cej.x).map(bsz::d).filter($$0 -> $$0 instanceof bvf).map($$0 -> (bvf)$$0);
   }

   public boolean k(fay $$0) {
      fay $$1 = this.dw().b();
      return $$0.a($$1, 4.0, 10.0);
   }

   @Override
   protected void a(arc $$0) {
      bor $$1 = boq.a();
      $$1.a("breezeBrain");
      this.ec().a($$0, this);
      $$1.b("breezeActivityUpdate");
      cmt.a(this);
      $$1.c();
      super.a($$0);
   }

   @Override
   protected void Z() {
      super.Z();
      agc.a((bvf)this);
      agc.a(this);
   }

   @Override
   public boolean a(buq<?> $$0) {
      return $$0 == buq.bR || $$0 == buq.ap;
   }

   @Override
   public int ab() {
      return 30;
   }

   @Override
   public int ad() {
      return 25;
   }

   public double gq() {
      return this.dD() + (double)(this.ds() / 2.0F) + 0.3F;
   }

   @Override
   public boolean a(arc $$0, bsz $$1) {
      return $$1.d() instanceof cms || super.a($$0, $$1);
   }

   @Override
   public double dq() {
      return (double)this.cS();
   }

   @Override
   public boolean a(float $$0, float $$1, bsz $$2) {
      if ($$0 > 3.0F) {
         this.a(avz.cL, 1.0F, 1.0F);
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   protected buj.c bg() {
      return buj.c.c;
   }

   @Nullable
   @Override
   public bvf O_() {
      return this.O();
   }
}
