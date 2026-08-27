import java.util.Collection;
import javax.annotation.Nullable;

public class chz extends cin implements bsm {
   private static final ajm<Integer> b = ajq.a(chz.class, ajo.b);
   private static final ajm<Boolean> c = ajq.a(chz.class, ajo.k);
   private static final ajm<Boolean> d = ajq.a(chz.class, ajo.k);
   private int e;
   private int bY;
   private int bZ = 30;
   private int ca = 3;
   private int cb;

   public chz(brn<? extends chz> $$0, dad $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.bS.a(1, new byr(this));
      this.bS.a(2, new cae(this));
      this.bS.a(3, new bye<>(this, ced.class, 6.0F, 1.0, 1.2));
      this.bS.a(3, new bye<>(this, cds.class, 6.0F, 1.0, 1.2));
      this.bS.a(4, new bzh(this, 1.0, false));
      this.bS.a(5, new cak(this, 0.8));
      this.bS.a(6, new bzf(this, clh.class, 8.0F));
      this.bS.a(6, new bzs(this));
      this.bT.a(1, new caq<>(this, clh.class, true));
      this.bT.a(2, new cap(this));
   }

   public static btg.a r() {
      return cin.gv().a(bth.r, 0.25);
   }

   @Override
   public int cv() {
      return this.p() == null ? this.u(0.0F) : this.u(this.ey() - 1.0F);
   }

   @Override
   public boolean a(float $$0, float $$1, bqf $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      this.bY += (int)($$0 * 1.5F);
      if (this.bY > this.bZ - 5) {
         this.bY = this.bZ - 5;
      }

      return $$3;
   }

   @Override
   protected void a(ajq.a $$0) {
      super.a($$0);
      $$0.a(b, -1);
      $$0.a(c, false);
      $$0.a(d, false);
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      if (this.ao.a(c)) {
         $$0.a("powered", true);
      }

      $$0.a("Fuse", (short)this.bZ);
      $$0.a("ExplosionRadius", (byte)this.ca);
      $$0.a("ignited", this.y());
   }

   @Override
   public void a(ua $$0) {
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
      if (this.bB()) {
         this.e = this.bY;
         if (this.y()) {
            this.b(1);
         }

         int $$0 = this.u();
         if ($$0 > 0 && this.bY == 0) {
            this.a(avc.gf, 1.0F, 0.5F);
            this.a(dva.I);
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
   public void h(@Nullable bsa $$0) {
      if (!($$0 instanceof cfp)) {
         super.h($$0);
      }
   }

   @Override
   protected avb d(bqf $$0) {
      return avc.ge;
   }

   @Override
   protected avb o_() {
      return avc.gd;
   }

   @Override
   protected void a(bqf $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      brh $$3 = $$0.d();
      if ($$3 != this && $$3 instanceof chz $$4 && $$4.gq()) {
         $$4.gr();
         this.a(ctc.up);
      }
   }

   @Override
   public boolean C(brh $$0) {
      return true;
   }

   @Override
   public boolean a() {
      return this.ao.a(c);
   }

   public float G(float $$0) {
      return axz.i($$0, (float)this.e, (float)this.bY) / (float)(this.bZ - 2);
   }

   public int u() {
      return this.ao.a(b);
   }

   public void b(int $$0) {
      this.ao.a(b, $$0);
   }

   @Override
   public void a(aqh $$0, brz $$1) {
      super.a($$0, $$1);
      this.ao.a(c, true);
   }

   @Override
   protected bpm b(clh $$0, bpl $$1) {
      csz $$2 = $$0.b($$1);
      if ($$2.a(avz.bf)) {
         avb $$3 = $$2.a(ctc.tX) ? avc.iF : avc.iU;
         this.dN().a($$0, this.ds(), this.du(), this.dy(), $$3, this.dc(), 1.0F, this.ah.i() * 0.4F + 0.8F);
         if (!this.dN().B) {
            this.gp();
            if (!$$2.k()) {
               $$2.h(1);
            } else {
               $$2.a(1, $$0, d($$1));
            }
         }

         return bpm.a(this.dN().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   private void gs() {
      if (!this.dN().B) {
         float $$0 = this.a() ? 2.0F : 1.0F;
         this.bf = true;
         this.dN().a(this, this.ds(), this.du(), this.dy(), (float)this.ca * $$0, dad.a.c);
         this.am();
         this.gt();
      }
   }

   private void gt() {
      Collection<bqt> $$0 = this.ev();
      if (!$$0.isEmpty()) {
         brd $$1 = new brd(this.dN(), this.ds(), this.du(), this.dy());
         $$1.a(2.5F);
         $$1.b(-0.5F);
         $$1.c(10);
         $$1.a($$1.k() / 2);
         $$1.c(-$$1.g() / (float)$$1.k());

         for (bqt $$2 : $$0) {
            $$1.a(new bqt($$2));
         }

         this.dN().b($$1);
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
