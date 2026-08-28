import com.mojang.serialization.Dynamic;
import java.util.Optional;
import javax.annotation.Nullable;

public class cmt extends clx {
   private static final int ca = 20;
   private static final int cb = 1;
   private static final int cc = 20;
   private static final int cd = 3;
   private static final int ce = 5;
   private static final int cf = 10;
   private static final float cg = 3.0F;
   private static final int ch = 1;
   private static final int ci = 80;
   public buc a = new buc();
   public buc b = new buc();
   public buc c = new buc();
   public buc d = new buc();
   public buc bY = new buc();
   public buc bZ = new buc();
   private int cj = 0;
   private int ck = 0;
   private static final cpr cl = ($$0, $$1, $$2) -> {
      $$1.dW().a(null, $$1, awa.cF, $$1.dn(), 1.0F, 1.0F);
      cpr.b.deflect($$0, $$1, $$2);
   };

   public static bwn.a m() {
      return bvi.C().a(bwo.v, 0.63F).a(bwo.s, 30.0).a(bwo.m, 24.0).a(bwo.c, 3.0);
   }

   public cmt(bur<? extends clx> $$0, dgi $$1) {
      super($$0, $$1);
      this.a(etq.z, -1.0F);
      this.a(etq.o, -1.0F);
      this.bN = 10;
   }

   @Override
   protected bwi<?> a(Dynamic<?> $$0) {
      return cmu.a(this, this.ed().a($$0));
   }

   @Override
   public bwi<cmt> ec() {
      return (bwi<cmt>)super.ec();
   }

   @Override
   protected bwi.b<cmt> ed() {
      return bwi.a(cmu.f, cmu.e);
   }

   @Override
   public void a(ajx<?> $$0) {
      if (this.dW().B_() && aq.equals($$0)) {
         this.gr();
         bvs $$1 = this.aw();
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
      bvs $$0 = this.aw();
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

      if ($$0 != bvs.p && this.b.b()) {
         this.c.a(this.af);
         this.b.a();
      }

      if ($$0 == bvs.a) {
         this.a.b(this.af);
      }

      this.ck = this.ck == 0 ? this.ae.a(1, 80) : this.ck - 1;
      if (this.ck == 0) {
         this.x();
      }

      super.h();
   }

   public cmt p() {
      this.cj = 0;
      return this;
   }

   public void t() {
      if (++this.cj <= 5) {
         dwx $$0 = !this.dx().l() ? this.dx() : this.bu();
         fba $$1 = this.dz();
         fba $$2 = this.du().e($$1).b(0.0, 0.1F, 0.0);

         for (int $$3 = 0; $$3 < 3; $$3++) {
            this.dW().a(new ll(lt.b, $$0), $$2.d, $$2.e, $$2.f, 0.0, 0.0, 0.0);
         }
      }
   }

   public void b(int $$0) {
      if (!this.bZ()) {
         fba $$1 = this.cR().f();
         fba $$2 = new fba($$1.d, this.du().e, $$1.f);
         dwx $$3 = !this.dx().l() ? this.dx() : this.bu();
         if ($$3.o() != dpx.a) {
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
      this.dW().a(this, awa.cP, this.dn(), $$1, $$0);
   }

   @Override
   public cpr a(cpq $$0) {
      if ($$0.aq() != bur.s && $$0.aq() != bur.bH) {
         return this.aq().a(awt.r) ? cl : cpr.a;
      } else {
         return cpr.a;
      }
   }

   @Override
   public awb dn() {
      return awb.f;
   }

   @Override
   protected avz o_() {
      return awa.cN;
   }

   @Override
   protected avz e(bta $$0) {
      return awa.cO;
   }

   @Override
   protected avz u() {
      return this.aJ() ? awa.cH : awa.cI;
   }

   public Optional<bvg> gp() {
      return this.ec().c(cek.x).map(bta::d).filter($$0 -> $$0 instanceof bvg).map($$0 -> (bvg)$$0);
   }

   public boolean k(fba $$0) {
      fba $$1 = this.dw().b();
      return $$0.a($$1, 4.0, 10.0);
   }

   @Override
   protected void a(arc $$0) {
      bos $$1 = bor.a();
      $$1.a("breezeBrain");
      this.ec().a($$0, this);
      $$1.b("breezeActivityUpdate");
      cmu.a(this);
      $$1.c();
      super.a($$0);
   }

   @Override
   protected void Z() {
      super.Z();
      agc.a((bvg)this);
      agc.a(this);
   }

   @Override
   public boolean a(bur<?> $$0) {
      return $$0 == bur.bS || $$0 == bur.aq;
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
   public boolean a(arc $$0, bta $$1) {
      return $$1.d() instanceof cmt || super.a($$0, $$1);
   }

   @Override
   public double dq() {
      return (double)this.cS();
   }

   @Override
   public boolean a(float $$0, float $$1, bta $$2) {
      if ($$0 > 3.0F) {
         this.a(awa.cL, 1.0F, 1.0F);
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   protected buk.c bg() {
      return buk.c.c;
   }

   @Nullable
   @Override
   public bvg O_() {
      return this.O();
   }
}
