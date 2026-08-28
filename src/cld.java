import java.util.Collection;
import javax.annotation.Nullable;

public class cld extends clr {
   private static final akl<Integer> b = akp.a(cld.class, akn.b);
   private static final akl<Boolean> c = akp.a(cld.class, akn.k);
   private static final akl<Boolean> d = akp.a(cld.class, akn.k);
   private int e;
   private int bY;
   private int bZ = 30;
   private int ca = 3;
   private int cb;

   public cld(bul<? extends cld> $$0, dfb $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      this.bS.a(1, new cbs(this));
      this.bS.a(2, new cdf(this));
      this.bS.a(3, new cbf<>(this, chf.class, 6.0F, 1.0, 1.2));
      this.bS.a(3, new cbf<>(this, cgu.class, 6.0F, 1.0, 1.2));
      this.bS.a(4, new cci(this, 1.0, false));
      this.bS.a(5, new cdl(this, 0.8));
      this.bS.a(6, new ccg(this, com.class, 8.0F));
      this.bS.a(6, new cct(this));
      this.bT.a(1, new cdr<>(this, com.class, true));
      this.bT.a(2, new cdq(this));
   }

   public static bwh.a q() {
      return clr.gA().a(bwi.v, 0.25);
   }

   @Override
   public int cF() {
      return this.m() == null ? this.y(0.0F) : this.y(this.eG() - 1.0F);
   }

   @Override
   public boolean a(float $$0, float $$1, bsu $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      this.bY += (int)($$0 * 1.5F);
      if (this.bY > this.bZ - 5) {
         this.bY = this.bZ - 5;
      }

      return $$3;
   }

   @Override
   protected void a(akp.a $$0) {
      super.a($$0);
      $$0.a(b, -1);
      $$0.a(c, false);
      $$0.a(d, false);
   }

   @Override
   public void b(uk $$0) {
      super.b($$0);
      if (this.am.a(c)) {
         $$0.a("powered", true);
      }

      $$0.a("Fuse", (short)this.bZ);
      $$0.a("ExplosionRadius", (byte)this.ca);
      $$0.a("ignited", this.gu());
   }

   @Override
   public void a(uk $$0) {
      super.a($$0);
      this.am.a(c, $$0.q("powered"));
      if ($$0.b("Fuse", 99)) {
         this.bZ = $$0.g("Fuse");
      }

      if ($$0.b("ExplosionRadius", 99)) {
         this.ca = $$0.f("ExplosionRadius");
      }

      if ($$0.q("ignited")) {
         this.gv();
      }
   }

   @Override
   public void l() {
      if (this.bM()) {
         this.e = this.bY;
         if (this.gu()) {
            this.b(1);
         }

         int $$0 = this.y();
         if ($$0 > 0 && this.bY == 0) {
            this.a(awl.gl, 1.0F, 0.5F);
            this.a(eag.I);
         }

         this.bY += $$0;
         if (this.bY < 0) {
            this.bY = 0;
         }

         if (this.bY >= this.bZ) {
            this.bY = this.bZ;
            this.gy();
         }
      }

      super.l();
   }

   @Override
   public void h(@Nullable bva $$0) {
      if (!($$0 instanceof cir)) {
         super.h($$0);
      }
   }

   @Override
   protected awk d(bsu $$0) {
      return awl.gk;
   }

   @Override
   protected awk o_() {
      return awl.gj;
   }

   @Override
   protected void a(arn $$0, bsu $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      bue $$3 = $$1.d();
      if ($$3 != this && $$3 instanceof cld $$4 && $$4.gw()) {
         $$4.gx();
         this.a(cwf.ur);
      }
   }

   @Override
   public boolean E(bue $$0) {
      return true;
   }

   public boolean t() {
      return this.am.a(c);
   }

   public float J(float $$0) {
      return azk.h($$0, (float)this.e, (float)this.bY) / (float)(this.bZ - 2);
   }

   public int y() {
      return this.am.a(b);
   }

   public void b(int $$0) {
      this.am.a(b, $$0);
   }

   @Override
   public void a(arn $$0, buz $$1) {
      super.a($$0, $$1);
      this.am.a(c, true);
   }

   @Override
   protected bsd b(com $$0, bsc $$1) {
      cwb $$2 = $$0.b($$1);
      if ($$2.a(axj.bv)) {
         awk $$3 = $$2.a(cwf.tY) ? awl.iL : awl.ja;
         this.dX().a($$0, this.dC(), this.dE(), this.dI(), $$3, this.dn(), 1.0F, this.af.i() * 0.4F + 0.8F);
         if (!this.dX().C) {
            this.gv();
            if (!$$2.m()) {
               $$2.h(1);
            } else {
               $$2.a(1, $$0, d($$1));
            }
         }

         return bsd.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   private void gy() {
      if (!this.dX().C) {
         float $$0 = this.t() ? 2.0F : 1.0F;
         this.be = true;
         this.dX().a(this, this.dC(), this.dE(), this.dI(), (float)this.ca * $$0, dfb.a.c);
         this.gB();
         this.c(bue.c.a);
         this.av();
      }
   }

   private void gB() {
      Collection<btj> $$0 = this.eD();
      if (!$$0.isEmpty()) {
         btx $$1 = new btx(this.dX(), this.dC(), this.dE(), this.dI());
         $$1.a(2.5F);
         $$1.b(-0.5F);
         $$1.c(10);
         $$1.a($$1.j() / 2);
         $$1.c(-$$1.g() / (float)$$1.j());

         for (btj $$2 : $$0) {
            $$1.a(new btj($$2));
         }

         this.dX().b($$1);
      }
   }

   public boolean gu() {
      return this.am.a(d);
   }

   public void gv() {
      this.am.a(d, true);
   }

   public boolean gw() {
      return this.t() && this.cb < 1;
   }

   public void gx() {
      this.cb++;
   }
}
