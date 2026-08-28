import com.mojang.serialization.Dynamic;
import java.util.Optional;
import javax.annotation.Nullable;

public class clz extends cld {
   private static final int ca = 20;
   private static final int cb = 1;
   private static final int cc = 20;
   private static final int cd = 3;
   private static final int ce = 5;
   private static final int cf = 10;
   private static final float cg = 3.0F;
   private static final int ch = 1;
   private static final int ci = 80;
   public btl b = new btl();
   public btl c = new btl();
   public btl d = new btl();
   public btl e = new btl();
   public btl bY = new btl();
   public btl bZ = new btl();
   private int cj = 0;
   private int ck = 0;
   private static final cos cl = ($$0, $$1, $$2) -> {
      $$1.dS().a(null, $$1, awg.cF, $$1.di(), 1.0F, 1.0F);
      cos.b.deflect($$0, $$1, $$2);
   };

   public static bvt.a q() {
      return bup.E().a(bvu.v, 0.63F).a(bvu.s, 30.0).a(bvu.m, 24.0).a(bvu.c, 3.0);
   }

   public clz(bty<? extends cld> $$0, dej $$1) {
      super($$0, $$1);
      this.a(erk.z, -1.0F);
      this.a(erk.o, -1.0F);
      this.bN = 10;
   }

   @Override
   protected bvo<?> a(Dynamic<?> $$0) {
      return cma.a(this, this.dZ().a($$0));
   }

   @Override
   public bvo<clz> dY() {
      return (bvo<clz>)super.dY();
   }

   @Override
   protected bvo.b<clz> dZ() {
      return bvo.a(cma.f, cma.e);
   }

   @Override
   public void a(akh<?> $$0) {
      if (this.dS().x_() && ar.equals($$0)) {
         this.gr();
         buz $$1 = this.av();
         switch ($$1) {
            case q:
               this.bY.b(this.ag);
               break;
            case r:
               this.bZ.b(this.ag);
               break;
            case p:
               this.c.b(this.ag);
         }
      }

      super.a($$0);
   }

   private void gr() {
      this.bY.a();
      this.b.a();
      this.bZ.a();
      this.e.a();
   }

   @Override
   public void l() {
      buz $$0 = this.av();
      switch ($$0) {
         case q:
         case r:
         case a:
            this.t().b(1 + this.dV().a(1));
            break;
         case p:
            this.b(20);
            break;
         case g:
            this.e.b(this.ag);
            this.y();
      }

      if ($$0 != buz.p && this.c.b()) {
         this.d.a(this.ag);
         this.c.a();
      }

      this.ck = this.ck == 0 ? this.af.a(1, 80) : this.ck - 1;
      if (this.ck == 0) {
         this.go();
      }

      super.l();
   }

   public clz t() {
      this.cj = 0;
      return this;
   }

   public void y() {
      if (++this.cj <= 5) {
         dus $$0 = !this.dt().l() ? this.dt() : this.bt();
         eyw $$1 = this.dv();
         eyw $$2 = this.dq().e($$1).b(0.0, 0.1F, 0.0);

         for (int $$3 = 0; $$3 < 3; $$3++) {
            this.dS().a(new lg(lo.b, $$0), $$2.d, $$2.e, $$2.f, 0.0, 0.0, 0.0);
         }
      }
   }

   public void b(int $$0) {
      if (!this.bW()) {
         eyw $$1 = this.cO().f();
         eyw $$2 = new eyw($$1.d, this.dq().e, $$1.f);
         dus $$3 = !this.dt().l() ? this.dt() : this.bt();
         if ($$3.o() != dnt.a) {
            for (int $$4 = 0; $$4 < $$0; $$4++) {
               this.dS().a(new lg(lo.b, $$3), $$2.d, $$2.e, $$2.f, 0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public void U() {
      if (this.m() == null || !this.aH()) {
         this.dS().a(this, this.w(), this.di(), 1.0F, 1.0F);
      }
   }

   public void go() {
      float $$0 = 0.7F + 0.4F * this.af.i();
      float $$1 = 0.8F + 0.2F * this.af.i();
      this.dS().a(this, awg.cP, this.di(), $$1, $$0);
   }

   @Override
   public cos a(cor $$0) {
      if ($$0.ao() != bty.n && $$0.ao() != bty.bn) {
         return this.ao().a(awz.r) ? cl : cos.a;
      } else {
         return cos.a;
      }
   }

   @Override
   public awh di() {
      return awh.f;
   }

   @Override
   protected awf o_() {
      return awg.cN;
   }

   @Override
   protected awf d(bsj $$0) {
      return awg.cO;
   }

   @Override
   protected awf w() {
      return this.aH() ? awg.cH : awg.cI;
   }

   public Optional<bun> gp() {
      return this.dY().c(cdq.x).map(bsj::d).filter($$0 -> $$0 instanceof bun).map($$0 -> (bun)$$0);
   }

   public boolean k(eyw $$0) {
      eyw $$1 = this.ds().b();
      return $$0.a($$1, 4.0, 10.0);
   }

   @Override
   protected void ac() {
      this.dS().ah().a("breezeBrain");
      this.dY().a((arj)this.dS(), this);
      this.dS().ah().b("breezeActivityUpdate");
      cma.a(this);
      this.dS().ah().c();
      super.ac();
   }

   @Override
   protected void ab() {
      super.ab();
      ago.a((bun)this);
      ago.a(this);
   }

   @Override
   public boolean a(bty<?> $$0) {
      return $$0 == bty.by || $$0 == bty.af;
   }

   @Override
   public int ae() {
      return 30;
   }

   @Override
   public int ah() {
      return 25;
   }

   public double gq() {
      return this.dz() + (double)(this.do() / 2.0F) + 0.3F;
   }

   @Override
   public boolean b(bsj $$0) {
      return $$0.d() instanceof clz || super.b($$0);
   }

   @Override
   public double dm() {
      return (double)this.cP();
   }

   @Override
   public boolean a(float $$0, float $$1, bsj $$2) {
      if ($$0 > 3.0F) {
         this.a(awg.cL, 1.0F, 1.0F);
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   protected btr.b bf() {
      return btr.b.c;
   }

   @Nullable
   @Override
   public bun m() {
      return this.R();
   }
}
