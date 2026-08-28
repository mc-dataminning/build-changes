import java.util.Collection;
import javax.annotation.Nullable;

public class clh extends clv {
   private static final ako<Integer> b = aks.a(clh.class, akq.b);
   private static final ako<Boolean> c = aks.a(clh.class, akq.k);
   private static final ako<Boolean> d = aks.a(clh.class, akq.k);
   private int e;
   private int bY;
   private int bZ = 30;
   private int ca = 3;
   private int cb;

   public clh(bup<? extends clh> $$0, dff $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      this.bS.a(1, new cbw(this));
      this.bS.a(2, new cdj(this));
      this.bS.a(3, new cbj<>(this, chj.class, 6.0F, 1.0, 1.2));
      this.bS.a(3, new cbj<>(this, cgy.class, 6.0F, 1.0, 1.2));
      this.bS.a(4, new ccm(this, 1.0, false));
      this.bS.a(5, new cdp(this, 0.8));
      this.bS.a(6, new cck(this, cor.class, 8.0F));
      this.bS.a(6, new ccx(this));
      this.bT.a(1, new cdv<>(this, cor.class, true));
      this.bT.a(2, new cdu(this));
   }

   public static bwl.a q() {
      return clv.gB().a(bwm.v, 0.25);
   }

   @Override
   public int cG() {
      return this.m() == null ? this.y(0.0F) : this.y(this.eH() - 1.0F);
   }

   @Override
   public boolean a(float $$0, float $$1, bsy $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      this.bY += (int)($$0 * 1.5F);
      if (this.bY > this.bZ - 5) {
         this.bY = this.bZ - 5;
      }

      return $$3;
   }

   @Override
   protected void a(aks.a $$0) {
      super.a($$0);
      $$0.a(b, -1);
      $$0.a(c, false);
      $$0.a(d, false);
   }

   @Override
   public void b(un $$0) {
      super.b($$0);
      if (this.am.a(c)) {
         $$0.a("powered", true);
      }

      $$0.a("Fuse", (short)this.bZ);
      $$0.a("ExplosionRadius", (byte)this.ca);
      $$0.a("ignited", this.gv());
   }

   @Override
   public void a(un $$0) {
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
      if (this.bN()) {
         this.e = this.bY;
         if (this.gv()) {
            this.b(1);
         }

         int $$0 = this.y();
         if ($$0 > 0 && this.bY == 0) {
            this.a(awo.gl, 1.0F, 0.5F);
            this.a(eak.I);
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
   public void h(@Nullable bve $$0) {
      if (!($$0 instanceof civ)) {
         super.h($$0);
      }
   }

   @Override
   protected awn d(bsy $$0) {
      return awo.gk;
   }

   @Override
   protected awn o_() {
      return awo.gj;
   }

   @Override
   protected void a(arq $$0, bsy $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      bui $$3 = $$1.d();
      if ($$3 != this && $$3 instanceof clh $$4 && $$4.gx()) {
         $$4.gy();
         this.a(cwj.uH);
      }
   }

   @Override
   public boolean E(bui $$0) {
      return true;
   }

   public boolean t() {
      return this.am.a(c);
   }

   public float J(float $$0) {
      return azn.h($$0, (float)this.e, (float)this.bY) / (float)(this.bZ - 2);
   }

   public int y() {
      return this.am.a(b);
   }

   public void b(int $$0) {
      this.am.a(b, $$0);
   }

   @Override
   public void a(arq $$0, bvd $$1) {
      super.a($$0, $$1);
      this.am.a(c, true);
   }

   @Override
   protected bsh b(cor $$0, bsg $$1) {
      cwf $$2 = $$0.b($$1);
      if ($$2.a(axm.bw)) {
         awn $$3 = $$2.a(cwj.uo) ? awo.iL : awo.ja;
         this.dY().a($$0, this.dD(), this.dF(), this.dJ(), $$3, this.do(), 1.0F, this.af.i() * 0.4F + 0.8F);
         if (!this.dY().C) {
            this.gw();
            if (!$$2.m()) {
               $$2.h(1);
            } else {
               $$2.a(1, $$0, d($$1));
            }
         }

         return bsh.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   private void gz() {
      if (!this.dY().C) {
         float $$0 = this.t() ? 2.0F : 1.0F;
         this.be = true;
         this.dY().a(this, this.dD(), this.dF(), this.dJ(), (float)this.ca * $$0, dff.a.c);
         this.gC();
         this.c(bui.c.a);
         this.av();
      }
   }

   private void gC() {
      Collection<btn> $$0 = this.eE();
      if (!$$0.isEmpty()) {
         bub $$1 = new bub(this.dY(), this.dD(), this.dF(), this.dJ());
         $$1.a(2.5F);
         $$1.b(-0.5F);
         $$1.c(10);
         $$1.a($$1.j() / 2);
         $$1.c(-$$1.g() / (float)$$1.j());

         for (btn $$2 : $$0) {
            $$1.a(new btn($$2));
         }

         this.dY().b($$1);
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
