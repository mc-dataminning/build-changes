import java.util.Collection;
import javax.annotation.Nullable;

public class cjr extends ckf implements bue {
   private static final akk<Integer> b = ako.a(cjr.class, akm.b);
   private static final akk<Boolean> c = ako.a(cjr.class, akm.k);
   private static final akk<Boolean> d = ako.a(cjr.class, akm.k);
   private int e;
   private int bY;
   private int bZ = 30;
   private int ca = 3;
   private int cb;

   public cjr(btc<? extends cjr> $$0, dca $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.bS.a(1, new caj(this));
      this.bS.a(2, new cbw(this));
      this.bS.a(3, new bzw<>(this, cfv.class, 6.0F, 1.0, 1.2));
      this.bS.a(3, new bzw<>(this, cfk.class, 6.0F, 1.0, 1.2));
      this.bS.a(4, new caz(this, 1.0, false));
      this.bS.a(5, new ccc(this, 0.8));
      this.bS.a(6, new cax(this, cmz.class, 8.0F));
      this.bS.a(6, new cbk(this));
      this.bT.a(1, new cci<>(this, cmz.class, true));
      this.bT.a(2, new cch(this));
   }

   public static buy.a s() {
      return ckf.gw().a(buz.r, 0.25);
   }

   @Override
   public int cx() {
      return this.p() == null ? this.u(0.0F) : this.u(this.eA() - 1.0F);
   }

   @Override
   public boolean a(float $$0, float $$1, brp $$2) {
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
   public void b(us $$0) {
      super.b($$0);
      if (this.ao.a(c)) {
         $$0.a("powered", true);
      }

      $$0.a("Fuse", (short)this.bZ);
      $$0.a("ExplosionRadius", (byte)this.ca);
      $$0.a("ignited", this.y());
   }

   @Override
   public void a(us $$0) {
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
            this.a(awa.gk, 1.0F, 0.5F);
            this.a(dwx.I);
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
   public void h(@Nullable btr $$0) {
      if (!($$0 instanceof chh)) {
         super.h($$0);
      }
   }

   @Override
   protected avz d(brp $$0) {
      return awa.gj;
   }

   @Override
   protected avz o_() {
      return awa.gi;
   }

   @Override
   protected void a(brp $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      bsw $$3 = $$0.d();
      if ($$3 != this && $$3 instanceof cjr $$4 && $$4.gr()) {
         $$4.gs();
         this.a(cuu.up);
      }
   }

   @Override
   public boolean C(bsw $$0) {
      return true;
   }

   @Override
   public boolean a() {
      return this.ao.a(c);
   }

   public float G(float $$0) {
      return ayz.i($$0, (float)this.e, (float)this.bY) / (float)(this.bZ - 2);
   }

   public int u() {
      return this.ao.a(b);
   }

   public void b(int $$0) {
      this.ao.a(b, $$0);
   }

   @Override
   public void a(arf $$0, btq $$1) {
      super.a($$0, $$1);
      this.ao.a(c, true);
   }

   @Override
   protected bqw b(cmz $$0, bqv $$1) {
      cur $$2 = $$0.b($$1);
      if ($$2.a(awy.bf)) {
         avz $$3 = $$2.a(cuu.tX) ? awa.iK : awa.iZ;
         this.dP().a($$0, this.du(), this.dw(), this.dA(), $$3, this.de(), 1.0F, this.ah.i() * 0.4F + 0.8F);
         if (!this.dP().B) {
            this.gq();
            if (!$$2.l()) {
               $$2.h(1);
            } else {
               $$2.a(1, $$0, d($$1));
            }
         }

         return bqw.a(this.dP().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   private void gt() {
      if (!this.dP().B) {
         float $$0 = this.a() ? 2.0F : 1.0F;
         this.be = true;
         this.dP().a(this, this.du(), this.dw(), this.dA(), (float)this.ca * $$0, dca.a.c);
         this.ao();
         this.gu();
      }
   }

   private void gu() {
      Collection<bse> $$0 = this.ex();
      if (!$$0.isEmpty()) {
         bss $$1 = new bss(this.dP(), this.du(), this.dw(), this.dA());
         $$1.a(2.5F);
         $$1.b(-0.5F);
         $$1.c(10);
         $$1.a($$1.j() / 2);
         $$1.c(-$$1.g() / (float)$$1.j());

         for (bse $$2 : $$0) {
            $$1.a(new bse($$2));
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
