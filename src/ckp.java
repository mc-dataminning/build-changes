import java.util.Collection;
import javax.annotation.Nullable;

public class ckp extends cld {
   private static final akh<Integer> b = akl.a(ckp.class, akj.b);
   private static final akh<Boolean> c = akl.a(ckp.class, akj.k);
   private static final akh<Boolean> d = akl.a(ckp.class, akj.k);
   private int e;
   private int bY;
   private int bZ = 30;
   private int ca = 3;
   private int cb;

   public ckp(bty<? extends ckp> $$0, dej $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      this.bS.a(1, new cbe(this));
      this.bS.a(2, new ccr(this));
      this.bS.a(3, new car<>(this, cgr.class, 6.0F, 1.0, 1.2));
      this.bS.a(3, new car<>(this, cgg.class, 6.0F, 1.0, 1.2));
      this.bS.a(4, new cbu(this, 1.0, false));
      this.bS.a(5, new ccx(this, 0.8));
      this.bS.a(6, new cbs(this, cnx.class, 8.0F));
      this.bS.a(6, new ccf(this));
      this.bT.a(1, new cdd<>(this, cnx.class, true));
      this.bT.a(2, new cdc(this));
   }

   public static bvt.a q() {
      return cld.gu().a(bvu.v, 0.25);
   }

   @Override
   public int cB() {
      return this.m() == null ? this.y(0.0F) : this.y(this.eB() - 1.0F);
   }

   @Override
   public boolean a(float $$0, float $$1, bsj $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      this.bY += (int)($$0 * 1.5F);
      if (this.bY > this.bZ - 5) {
         this.bY = this.bZ - 5;
      }

      return $$3;
   }

   @Override
   protected void a(akl.a $$0) {
      super.a($$0);
      $$0.a(b, -1);
      $$0.a(c, false);
      $$0.a(d, false);
   }

   @Override
   public void b(ug $$0) {
      super.b($$0);
      if (this.am.a(c)) {
         $$0.a("powered", true);
      }

      $$0.a("Fuse", (short)this.bZ);
      $$0.a("ExplosionRadius", (byte)this.ca);
      $$0.a("ignited", this.go());
   }

   @Override
   public void a(ug $$0) {
      super.a($$0);
      this.am.a(c, $$0.q("powered"));
      if ($$0.b("Fuse", 99)) {
         this.bZ = $$0.g("Fuse");
      }

      if ($$0.b("ExplosionRadius", 99)) {
         this.ca = $$0.f("ExplosionRadius");
      }

      if ($$0.q("ignited")) {
         this.gp();
      }
   }

   @Override
   public void l() {
      if (this.bI()) {
         this.e = this.bY;
         if (this.go()) {
            this.b(1);
         }

         int $$0 = this.y();
         if ($$0 > 0 && this.bY == 0) {
            this.a(awg.gl, 1.0F, 0.5F);
            this.a(dzp.I);
         }

         this.bY += $$0;
         if (this.bY < 0) {
            this.bY = 0;
         }

         if (this.bY >= this.bZ) {
            this.bY = this.bZ;
            this.gs();
         }
      }

      super.l();
   }

   @Override
   public void h(@Nullable bun $$0) {
      if (!($$0 instanceof cid)) {
         super.h($$0);
      }
   }

   @Override
   protected awf d(bsj $$0) {
      return awg.gk;
   }

   @Override
   protected awf o_() {
      return awg.gj;
   }

   @Override
   protected void a(arj $$0, bsj $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      btr $$3 = $$1.d();
      if ($$3 != this && $$3 instanceof ckp $$4 && $$4.gq()) {
         $$4.gr();
         this.a(cvw.ur);
      }
   }

   @Override
   public boolean E(btr $$0) {
      return true;
   }

   public boolean t() {
      return this.am.a(c);
   }

   public float J(float $$0) {
      return azf.h($$0, (float)this.e, (float)this.bY) / (float)(this.bZ - 2);
   }

   public int y() {
      return this.am.a(b);
   }

   public void b(int $$0) {
      this.am.a(b, $$0);
   }

   @Override
   public void a(arj $$0, bum $$1) {
      super.a($$0, $$1);
      this.am.a(c, true);
   }

   @Override
   protected brs b(cnx $$0, brr $$1) {
      cvs $$2 = $$0.b($$1);
      if ($$2.a(axe.bj)) {
         awf $$3 = $$2.a(cvw.tY) ? awg.iL : awg.ja;
         this.dS().a($$0, this.dx(), this.dz(), this.dD(), $$3, this.di(), 1.0F, this.af.i() * 0.4F + 0.8F);
         if (!this.dS().B) {
            this.gp();
            if (!$$2.m()) {
               $$2.h(1);
            } else {
               $$2.a(1, $$0, d($$1));
            }
         }

         return brs.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   private void gs() {
      if (!this.dS().B) {
         float $$0 = this.t() ? 2.0F : 1.0F;
         this.ba = true;
         this.dS().a(this, this.dx(), this.dz(), this.dD(), (float)this.ca * $$0, dej.a.c);
         this.gv();
         this.c(btr.c.a);
         this.as();
      }
   }

   private void gv() {
      Collection<bsy> $$0 = this.ey();
      if (!$$0.isEmpty()) {
         btm $$1 = new btm(this.dS(), this.dx(), this.dz(), this.dD());
         $$1.a(2.5F);
         $$1.b(-0.5F);
         $$1.c(10);
         $$1.a($$1.j() / 2);
         $$1.c(-$$1.g() / (float)$$1.j());

         for (bsy $$2 : $$0) {
            $$1.a(new bsy($$2));
         }

         this.dS().b($$1);
      }
   }

   public boolean go() {
      return this.am.a(d);
   }

   public void gp() {
      this.am.a(d, true);
   }

   public boolean gq() {
      return this.t() && this.cb < 1;
   }

   public void gr() {
      this.cb++;
   }
}
