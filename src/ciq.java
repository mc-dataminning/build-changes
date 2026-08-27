import java.util.Collection;
import javax.annotation.Nullable;

public class ciq extends cje implements btd {
   private static final ajs<Integer> b = ajw.a(ciq.class, aju.b);
   private static final ajs<Boolean> c = ajw.a(ciq.class, aju.k);
   private static final ajs<Boolean> d = ajw.a(ciq.class, aju.k);
   private int e;
   private int bY;
   private int bZ = 30;
   private int ca = 3;
   private int cb;

   public ciq(bsc<? extends ciq> $$0, daz $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.bS.a(1, new bzi(this));
      this.bS.a(2, new cav(this));
      this.bS.a(3, new byv<>(this, ceu.class, 6.0F, 1.0, 1.2));
      this.bS.a(3, new byv<>(this, cej.class, 6.0F, 1.0, 1.2));
      this.bS.a(4, new bzy(this, 1.0, false));
      this.bS.a(5, new cbb(this, 0.8));
      this.bS.a(6, new bzw(this, cly.class, 8.0F));
      this.bS.a(6, new caj(this));
      this.bT.a(1, new cbh<>(this, cly.class, true));
      this.bT.a(2, new cbg(this));
   }

   public static btx.a s() {
      return cje.gv().a(bty.r, 0.25);
   }

   @Override
   public int cx() {
      return this.p() == null ? this.u(0.0F) : this.u(this.eA() - 1.0F);
   }

   @Override
   public boolean a(float $$0, float $$1, bqp $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      this.bY += (int)($$0 * 1.5F);
      if (this.bY > this.bZ - 5) {
         this.bY = this.bZ - 5;
      }

      return $$3;
   }

   @Override
   protected void a(ajw.a $$0) {
      super.a($$0);
      $$0.a(b, -1);
      $$0.a(c, false);
      $$0.a(d, false);
   }

   @Override
   public void b(ud $$0) {
      super.b($$0);
      if (this.ao.a(c)) {
         $$0.a("powered", true);
      }

      $$0.a("Fuse", (short)this.bZ);
      $$0.a("ExplosionRadius", (byte)this.ca);
      $$0.a("ignited", this.y());
   }

   @Override
   public void a(ud $$0) {
      super.a($$0);
      this.ao.a(c, $$0.q("powered"));
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
      if (this.bD()) {
         this.e = this.bY;
         if (this.y()) {
            this.b(1);
         }

         int $$0 = this.u();
         if ($$0 > 0 && this.bY == 0) {
            this.a(avi.gk, 1.0F, 0.5F);
            this.a(dvw.I);
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
   public void h(@Nullable bsq $$0) {
      if (!($$0 instanceof cgg)) {
         super.h($$0);
      }
   }

   @Override
   protected avh d(bqp $$0) {
      return avi.gj;
   }

   @Override
   protected avh o_() {
      return avi.gi;
   }

   @Override
   protected void a(bqp $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      brw $$3 = $$0.d();
      if ($$3 != this && $$3 instanceof ciq $$4 && $$4.gq()) {
         $$4.gr();
         this.a(ctt.up);
      }
   }

   @Override
   public boolean C(brw $$0) {
      return true;
   }

   @Override
   public boolean a() {
      return this.ao.a(c);
   }

   public float G(float $$0) {
      return ayf.i($$0, (float)this.e, (float)this.bY) / (float)(this.bZ - 2);
   }

   public int u() {
      return this.ao.a(b);
   }

   public void b(int $$0) {
      this.ao.a(b, $$0);
   }

   @Override
   public void a(aqn $$0, bsp $$1) {
      super.a($$0, $$1);
      this.ao.a(c, true);
   }

   @Override
   protected bpw b(cly $$0, bpv $$1) {
      ctq $$2 = $$0.b($$1);
      if ($$2.a(awf.bf)) {
         avh $$3 = $$2.a(ctt.tX) ? avi.iK : avi.iZ;
         this.dP().a($$0, this.du(), this.dw(), this.dA(), $$3, this.de(), 1.0F, this.ah.i() * 0.4F + 0.8F);
         if (!this.dP().B) {
            this.gp();
            if (!$$2.l()) {
               $$2.h(1);
            } else {
               $$2.a(1, $$0, d($$1));
            }
         }

         return bpw.a(this.dP().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   private void gs() {
      if (!this.dP().B) {
         float $$0 = this.a() ? 2.0F : 1.0F;
         this.be = true;
         this.dP().a(this, this.du(), this.dw(), this.dA(), (float)this.ca * $$0, daz.a.c);
         this.ao();
         this.gt();
      }
   }

   private void gt() {
      Collection<bre> $$0 = this.ex();
      if (!$$0.isEmpty()) {
         brs $$1 = new brs(this.dP(), this.du(), this.dw(), this.dA());
         $$1.a(2.5F);
         $$1.b(-0.5F);
         $$1.c(10);
         $$1.a($$1.j() / 2);
         $$1.c(-$$1.g() / (float)$$1.j());

         for (bre $$2 : $$0) {
            $$1.a(new bre($$2));
         }

         this.dP().b($$1);
      }
   }

   public boolean y() {
      return this.ao.a(d);
   }

   public void gp() {
      this.ao.a(d, true);
   }

   public boolean gq() {
      return this.a() && this.cb < 1;
   }

   public void gr() {
      this.cb++;
   }
}
