import java.util.Collection;
import javax.annotation.Nullable;

public class cky extends clm {
   private static final akk<Integer> b = ako.a(cky.class, akm.b);
   private static final akk<Boolean> c = ako.a(cky.class, akm.k);
   private static final akk<Boolean> d = ako.a(cky.class, akm.k);
   private int e;
   private int bY;
   private int bZ = 30;
   private int ca = 3;
   private int cb;

   public cky(bug<? extends cky> $$0, dev $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      this.bS.a(1, new cbn(this));
      this.bS.a(2, new cda(this));
      this.bS.a(3, new cba<>(this, cha.class, 6.0F, 1.0, 1.2));
      this.bS.a(3, new cba<>(this, cgp.class, 6.0F, 1.0, 1.2));
      this.bS.a(4, new ccd(this, 1.0, false));
      this.bS.a(5, new cdg(this, 0.8));
      this.bS.a(6, new ccb(this, coh.class, 8.0F));
      this.bS.a(6, new cco(this));
      this.bT.a(1, new cdm<>(this, coh.class, true));
      this.bT.a(2, new cdl(this));
   }

   public static bwc.a q() {
      return clm.gB().a(bwd.v, 0.25);
   }

   @Override
   public int cF() {
      return this.m() == null ? this.y(0.0F) : this.y(this.eG() - 1.0F);
   }

   @Override
   public boolean a(float $$0, float $$1, bsp $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      this.bY += (int)($$0 * 1.5F);
      if (this.bY > this.bZ - 5) {
         this.bY = this.bZ - 5;
      }

      return $$3;
   }

   @Override
   protected void a(ako.a $$0) {
      super.a($$0);
      $$0.a(b, -1);
      $$0.a(c, false);
      $$0.a(d, false);
   }

   @Override
   public void b(uj $$0) {
      super.b($$0);
      if (this.am.a(c)) {
         $$0.a("powered", true);
      }

      $$0.a("Fuse", (short)this.bZ);
      $$0.a("ExplosionRadius", (byte)this.ca);
      $$0.a("ignited", this.gv());
   }

   @Override
   public void a(uj $$0) {
      super.a($$0);
      this.am.a(c, $$0.q("powered"));
      if ($$0.b("Fuse", 99)) {
         this.bZ = $$0.g("Fuse");
      }

      if ($$0.b("ExplosionRadius", 99)) {
         this.ca = $$0.f("ExplosionRadius");
      }

      if ($$0.q("ignited")) {
         this.gw();
      }
   }

   @Override
   public void l() {
      if (this.bM()) {
         this.e = this.bY;
         if (this.gv()) {
            this.b(1);
         }

         int $$0 = this.y();
         if ($$0 > 0 && this.bY == 0) {
            this.a(awk.gl, 1.0F, 0.5F);
            this.a(eaa.I);
         }

         this.bY += $$0;
         if (this.bY < 0) {
            this.bY = 0;
         }

         if (this.bY >= this.bZ) {
            this.bY = this.bZ;
            this.gz();
         }
      }

      super.l();
   }

   @Override
   public void h(@Nullable buv $$0) {
      if (!($$0 instanceof cim)) {
         super.h($$0);
      }
   }

   @Override
   protected awj d(bsp $$0) {
      return awk.gk;
   }

   @Override
   protected awj o_() {
      return awk.gj;
   }

   @Override
   protected void a(arm $$0, bsp $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      btz $$3 = $$1.d();
      if ($$3 != this && $$3 instanceof cky $$4 && $$4.gx()) {
         $$4.gy();
         this.a(cwb.ur);
      }
   }

   @Override
   public boolean E(btz $$0) {
      return true;
   }

   public boolean t() {
      return this.am.a(c);
   }

   public float J(float $$0) {
      return azj.h($$0, (float)this.e, (float)this.bY) / (float)(this.bZ - 2);
   }

   public int y() {
      return this.am.a(b);
   }

   public void b(int $$0) {
      this.am.a(b, $$0);
   }

   @Override
   public void a(arm $$0, buu $$1) {
      super.a($$0, $$1);
      this.am.a(c, true);
   }

   @Override
   protected bry b(coh $$0, brx $$1) {
      cvx $$2 = $$0.b($$1);
      if ($$2.a(axi.bs)) {
         awj $$3 = $$2.a(cwb.tY) ? awk.iL : awk.ja;
         this.dX().a($$0, this.dC(), this.dE(), this.dI(), $$3, this.dn(), 1.0F, this.af.i() * 0.4F + 0.8F);
         if (!this.dX().C) {
            this.gw();
            if (!$$2.m()) {
               $$2.h(1);
            } else {
               $$2.a(1, $$0, d($$1));
            }
         }

         return bry.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   private void gz() {
      if (!this.dX().C) {
         float $$0 = this.t() ? 2.0F : 1.0F;
         this.bb = true;
         this.dX().a(this, this.dC(), this.dE(), this.dI(), (float)this.ca * $$0, dev.a.c);
         this.gC();
         this.c(btz.c.a);
         this.au();
      }
   }

   private void gC() {
      Collection<bte> $$0 = this.eD();
      if (!$$0.isEmpty()) {
         bts $$1 = new bts(this.dX(), this.dC(), this.dE(), this.dI());
         $$1.a(2.5F);
         $$1.b(-0.5F);
         $$1.c(10);
         $$1.a($$1.j() / 2);
         $$1.c(-$$1.g() / (float)$$1.j());

         for (bte $$2 : $$0) {
            $$1.a(new bte($$2));
         }

         this.dX().b($$1);
      }
   }

   public boolean gv() {
      return this.am.a(d);
   }

   public void gw() {
      this.am.a(d, true);
   }

   public boolean gx() {
      return this.t() && this.cb < 1;
   }

   public void gy() {
      this.cb++;
   }
}
