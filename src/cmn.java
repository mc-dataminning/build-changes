import com.mojang.serialization.Dynamic;
import java.util.Optional;
import javax.annotation.Nullable;

public class cmn extends clr {
   private static final int ca = 20;
   private static final int cb = 1;
   private static final int cc = 20;
   private static final int cd = 3;
   private static final int ce = 5;
   private static final int cf = 10;
   private static final float cg = 3.0F;
   private static final int ch = 1;
   private static final int ci = 80;
   public btw b = new btw();
   public btw c = new btw();
   public btw d = new btw();
   public btw e = new btw();
   public btw bY = new btw();
   public btw bZ = new btw();
   private int cj = 0;
   private int ck = 0;
   private static final cph cl = ($$0, $$1, $$2) -> {
      $$1.dX().a(null, $$1, awl.cF, $$1.dn(), 1.0F, 1.0F);
      cph.b.deflect($$0, $$1, $$2);
   };

   public static bwh.a q() {
      return bvc.E().a(bwi.v, 0.63F).a(bwi.s, 30.0).a(bwi.m, 24.0).a(bwi.c, 3.0);
   }

   public cmn(bul<? extends clr> $$0, dfb $$1) {
      super($$0, $$1);
      this.a(esb.z, -1.0F);
      this.a(esb.o, -1.0F);
      this.bN = 10;
   }

   @Override
   protected bwc<?> a(Dynamic<?> $$0) {
      return cmo.a(this, this.ee().a($$0));
   }

   @Override
   public bwc<cmn> ed() {
      return (bwc<cmn>)super.ed();
   }

   @Override
   protected bwc.b<cmn> ee() {
      return bwc.a(cmo.f, cmo.e);
   }

   @Override
   public void a(akl<?> $$0) {
      if (this.dX().y_() && ar.equals($$0)) {
         this.gx();
         bvm $$1 = this.ay();
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

   private void gx() {
      this.bY.a();
      this.b.a();
      this.bZ.a();
      this.e.a();
   }

   @Override
   public void l() {
      bvm $$0 = this.ay();
      switch ($$0) {
         case q:
         case r:
         case a:
            this.t().b(1 + this.ea().a(1));
            break;
         case p:
            this.b(20);
            break;
         case g:
            this.e.b(this.ag);
            this.y();
      }

      if ($$0 != bvm.p && this.c.b()) {
         this.d.a(this.ag);
         this.c.a();
      }

      this.ck = this.ck == 0 ? this.af.a(1, 80) : this.ck - 1;
      if (this.ck == 0) {
         this.gu();
      }

      super.l();
   }

   public cmn t() {
      this.cj = 0;
      return this;
   }

   public void y() {
      if (++this.cj <= 5) {
         dvj $$0 = !this.dy().l() ? this.dy() : this.bv();
         ezn $$1 = this.dA();
         ezn $$2 = this.dv().e($$1).b(0.0, 0.1F, 0.0);

         for (int $$3 = 0; $$3 < 3; $$3++) {
            this.dX().a(new lj(lr.b, $$0), $$2.d, $$2.e, $$2.f, 0.0, 0.0, 0.0);
         }
      }
   }

   public void b(int $$0) {
      if (!this.ca()) {
         ezn $$1 = this.cS().f();
         ezn $$2 = new ezn($$1.d, this.dv().e, $$1.f);
         dvj $$3 = !this.dy().l() ? this.dy() : this.bv();
         if ($$3.o() != dok.a) {
            for (int $$4 = 0; $$4 < $$0; $$4++) {
               this.dX().a(new lj(lr.b, $$3), $$2.d, $$2.e, $$2.f, 0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public void U() {
      if (this.m() == null || !this.aK()) {
         this.dX().a(this, this.w(), this.dn(), 1.0F, 1.0F);
      }
   }

   public void gu() {
      float $$0 = 0.7F + 0.4F * this.af.i();
      float $$1 = 0.8F + 0.2F * this.af.i();
      this.dX().a(this, awl.cP, this.dn(), $$1, $$0);
   }

   @Override
   public cph a(cpg $$0) {
      if ($$0.ar() != bul.n && $$0.ar() != bul.bn) {
         return this.ar().a(axe.r) ? cl : cph.a;
      } else {
         return cph.a;
      }
   }

   @Override
   public awm dn() {
      return awm.f;
   }

   @Override
   protected awk o_() {
      return awl.cN;
   }

   @Override
   protected awk d(bsu $$0) {
      return awl.cO;
   }

   @Override
   protected awk w() {
      return this.aK() ? awl.cH : awl.cI;
   }

   public Optional<bva> gv() {
      return this.ed().c(cee.x).map(bsu::d).filter($$0 -> $$0 instanceof bva).map($$0 -> (bva)$$0);
   }

   public boolean k(ezn $$0) {
      ezn $$1 = this.dx().b();
      return $$0.a($$1, 4.0, 10.0);
   }

   @Override
   protected void ac() {
      bon $$0 = bom.a();
      $$0.a("breezeBrain");
      this.ed().a((arn)this.dX(), this);
      $$0.b("breezeActivityUpdate");
      cmo.a(this);
      $$0.c();
      super.ac();
   }

   @Override
   protected void ab() {
      super.ab();
      ags.a((bva)this);
      ags.a(this);
   }

   @Override
   public boolean a(bul<?> $$0) {
      return $$0 == bul.by || $$0 == bul.af;
   }

   @Override
   public int ae() {
      return 30;
   }

   @Override
   public int ah() {
      return 25;
   }

   public double gw() {
      return this.dE() + (double)(this.dt() / 2.0F) + 0.3F;
   }

   @Override
   public boolean b(bsu $$0) {
      return $$0.d() instanceof cmn || super.b($$0);
   }

   @Override
   public double dr() {
      return (double)this.cT();
   }

   @Override
   public boolean a(float $$0, float $$1, bsu $$2) {
      if ($$0 > 3.0F) {
         this.a(awl.cL, 1.0F, 1.0F);
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   protected bue.b bh() {
      return bue.b.c;
   }

   @Nullable
   @Override
   public bva m() {
      return this.R();
   }
}
