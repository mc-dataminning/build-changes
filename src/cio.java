import java.util.Collection;
import javax.annotation.Nullable;

public class cio extends cjc implements btb {
   private static final ajr<Integer> b = ajv.a(cio.class, ajt.b);
   private static final ajr<Boolean> c = ajv.a(cio.class, ajt.k);
   private static final ajr<Boolean> d = ajv.a(cio.class, ajt.k);
   private int e;
   private int bY;
   private int bZ = 30;
   private int ca = 3;
   private int cb;

   public cio(bsa<? extends cio> $$0, dax $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.bS.a(1, new bzg(this));
      this.bS.a(2, new cat(this));
      this.bS.a(3, new byt<>(this, ces.class, 6.0F, 1.0, 1.2));
      this.bS.a(3, new byt<>(this, ceh.class, 6.0F, 1.0, 1.2));
      this.bS.a(4, new bzw(this, 1.0, false));
      this.bS.a(5, new caz(this, 0.8));
      this.bS.a(6, new bzu(this, clw.class, 8.0F));
      this.bS.a(6, new cah(this));
      this.bT.a(1, new cbf<>(this, clw.class, true));
      this.bT.a(2, new cbe(this));
   }

   public static btv.a s() {
      return cjc.gv().a(btw.r, 0.25);
   }

   @Override
   public int cx() {
      return this.p() == null ? this.u(0.0F) : this.u(this.eA() - 1.0F);
   }

   @Override
   public boolean a(float $$0, float $$1, bqn $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      this.bY += (int)($$0 * 1.5F);
      if (this.bY > this.bZ - 5) {
         this.bY = this.bZ - 5;
      }

      return $$3;
   }

   @Override
   protected void a(ajv.a $$0) {
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
            this.a(avh.gk, 1.0F, 0.5F);
            this.a(dvu.I);
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
   public void h(@Nullable bso $$0) {
      if (!($$0 instanceof cge)) {
         super.h($$0);
      }
   }

   @Override
   protected avg d(bqn $$0) {
      return avh.gj;
   }

   @Override
   protected avg o_() {
      return avh.gi;
   }

   @Override
   protected void a(bqn $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      bru $$3 = $$0.d();
      if ($$3 != this && $$3 instanceof cio $$4 && $$4.gq()) {
         $$4.gr();
         this.a(ctr.up);
      }
   }

   @Override
   public boolean C(bru $$0) {
      return true;
   }

   @Override
   public boolean a() {
      return this.ao.a(c);
   }

   public float G(float $$0) {
      return ayd.i($$0, (float)this.e, (float)this.bY) / (float)(this.bZ - 2);
   }

   public int u() {
      return this.ao.a(b);
   }

   public void b(int $$0) {
      this.ao.a(b, $$0);
   }

   @Override
   public void a(aqm $$0, bsn $$1) {
      super.a($$0, $$1);
      this.ao.a(c, true);
   }

   @Override
   protected bpu b(clw $$0, bpt $$1) {
      cto $$2 = $$0.b($$1);
      if ($$2.a(awe.bf)) {
         avg $$3 = $$2.a(ctr.tX) ? avh.iK : avh.iZ;
         this.dP().a($$0, this.du(), this.dw(), this.dA(), $$3, this.de(), 1.0F, this.ah.i() * 0.4F + 0.8F);
         if (!this.dP().B) {
            this.gp();
            if (!$$2.l()) {
               $$2.h(1);
            } else {
               $$2.a(1, $$0, d($$1));
            }
         }

         return bpu.a(this.dP().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   private void gs() {
      if (!this.dP().B) {
         float $$0 = this.a() ? 2.0F : 1.0F;
         this.bf = true;
         this.dP().a(this, this.du(), this.dw(), this.dA(), (float)this.ca * $$0, dax.a.c);
         this.ao();
         this.gt();
      }
   }

   private void gt() {
      Collection<brc> $$0 = this.ex();
      if (!$$0.isEmpty()) {
         brq $$1 = new brq(this.dP(), this.du(), this.dw(), this.dA());
         $$1.a(2.5F);
         $$1.b(-0.5F);
         $$1.c(10);
         $$1.a($$1.j() / 2);
         $$1.c(-$$1.g() / (float)$$1.j());

         for (brc $$2 : $$0) {
            $$1.a(new brc($$2));
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
