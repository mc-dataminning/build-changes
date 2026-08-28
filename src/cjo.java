import java.util.Collection;
import javax.annotation.Nullable;

public class cjo extends ckc implements bub {
   private static final akj<Integer> b = akn.a(cjo.class, akl.b);
   private static final akj<Boolean> c = akn.a(cjo.class, akl.k);
   private static final akj<Boolean> d = akn.a(cjo.class, akl.k);
   private int e;
   private int bY;
   private int bZ = 30;
   private int ca = 3;
   private int cb;

   public cjo(bsz<? extends cjo> $$0, dbx $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.bS.a(1, new cag(this));
      this.bS.a(2, new cbt(this));
      this.bS.a(3, new bzt<>(this, cfs.class, 6.0F, 1.0, 1.2));
      this.bS.a(3, new bzt<>(this, cfh.class, 6.0F, 1.0, 1.2));
      this.bS.a(4, new caw(this, 1.0, false));
      this.bS.a(5, new cbz(this, 0.8));
      this.bS.a(6, new cau(this, cmw.class, 8.0F));
      this.bS.a(6, new cbh(this));
      this.bT.a(1, new ccf<>(this, cmw.class, true));
      this.bT.a(2, new cce(this));
   }

   public static buv.a s() {
      return ckc.gw().a(buw.r, 0.25);
   }

   @Override
   public int cx() {
      return this.p() == null ? this.u(0.0F) : this.u(this.eA() - 1.0F);
   }

   @Override
   public boolean a(float $$0, float $$1, brm $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      this.bY += (int)($$0 * 1.5F);
      if (this.bY > this.bZ - 5) {
         this.bY = this.bZ - 5;
      }

      return $$3;
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(b, -1);
      $$0.a(c, false);
      $$0.a(d, false);
   }

   @Override
   public void b(ur $$0) {
      super.b($$0);
      if (this.ao.a(c)) {
         $$0.a("powered", true);
      }

      $$0.a("Fuse", (short)this.bZ);
      $$0.a("ExplosionRadius", (byte)this.ca);
      $$0.a("ignited", this.y());
   }

   @Override
   public void a(ur $$0) {
      super.a($$0);
      this.ao.a(c, $$0.q("powered"));
      if ($$0.b("Fuse", 99)) {
         this.bZ = $$0.g("Fuse");
      }

      if ($$0.b("ExplosionRadius", 99)) {
         this.ca = $$0.f("ExplosionRadius");
      }

      if ($$0.q("ignited")) {
         this.gq();
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
            this.a(avz.gk, 1.0F, 0.5F);
            this.a(dwu.I);
         }

         this.bY += $$0;
         if (this.bY < 0) {
            this.bY = 0;
         }

         if (this.bY >= this.bZ) {
            this.bY = this.bZ;
            this.gt();
         }
      }

      super.l();
   }

   @Override
   public void h(@Nullable bto $$0) {
      if (!($$0 instanceof che)) {
         super.h($$0);
      }
   }

   @Override
   protected avy d(brm $$0) {
      return avz.gj;
   }

   @Override
   protected avy o_() {
      return avz.gi;
   }

   @Override
   protected void a(brm $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      bst $$3 = $$0.d();
      if ($$3 != this && $$3 instanceof cjo $$4 && $$4.gr()) {
         $$4.gs();
         this.a(cur.up);
      }
   }

   @Override
   public boolean C(bst $$0) {
      return true;
   }

   @Override
   public boolean a() {
      return this.ao.a(c);
   }

   public float G(float $$0) {
      return ayy.i($$0, (float)this.e, (float)this.bY) / (float)(this.bZ - 2);
   }

   public int u() {
      return this.ao.a(b);
   }

   public void b(int $$0) {
      this.ao.a(b, $$0);
   }

   @Override
   public void a(are $$0, btn $$1) {
      super.a($$0, $$1);
      this.ao.a(c, true);
   }

   @Override
   protected bqt b(cmw $$0, bqs $$1) {
      cuo $$2 = $$0.b($$1);
      if ($$2.a(awx.bf)) {
         avy $$3 = $$2.a(cur.tX) ? avz.iK : avz.iZ;
         this.dP().a($$0, this.du(), this.dw(), this.dA(), $$3, this.de(), 1.0F, this.ah.i() * 0.4F + 0.8F);
         if (!this.dP().B) {
            this.gq();
            if (!$$2.l()) {
               $$2.h(1);
            } else {
               $$2.a(1, $$0, d($$1));
            }
         }

         return bqt.a(this.dP().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   private void gt() {
      if (!this.dP().B) {
         float $$0 = this.a() ? 2.0F : 1.0F;
         this.be = true;
         this.dP().a(this, this.du(), this.dw(), this.dA(), (float)this.ca * $$0, dbx.a.c);
         this.ao();
         this.gu();
      }
   }

   private void gu() {
      Collection<bsb> $$0 = this.ex();
      if (!$$0.isEmpty()) {
         bsp $$1 = new bsp(this.dP(), this.du(), this.dw(), this.dA());
         $$1.a(2.5F);
         $$1.b(-0.5F);
         $$1.c(10);
         $$1.a($$1.j() / 2);
         $$1.c(-$$1.g() / (float)$$1.j());

         for (bsb $$2 : $$0) {
            $$1.a(new bsb($$2));
         }

         this.dP().b($$1);
      }
   }

   public boolean y() {
      return this.ao.a(d);
   }

   public void gq() {
      this.ao.a(d, true);
   }

   public boolean gr() {
      return this.a() && this.cb < 1;
   }

   public void gs() {
      this.cb++;
   }
}
