import java.util.Collection;
import javax.annotation.Nullable;

public class clk extends cly {
   private static final akm<Integer> a = akq.a(clk.class, ako.b);
   private static final akm<Boolean> b = akq.a(clk.class, ako.k);
   private static final akm<Boolean> c = akq.a(clk.class, ako.k);
   private int d;
   private int bY;
   private int bZ = 30;
   private int ca = 3;
   private int cb;

   public clk(bus<? extends clk> $$0, dfm $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      this.bS.a(1, new cbz(this));
      this.bS.a(2, new cdm(this));
      this.bS.a(3, new cbm<>(this, chm.class, 6.0F, 1.0, 1.2));
      this.bS.a(3, new cbm<>(this, chb.class, 6.0F, 1.0, 1.2));
      this.bS.a(4, new ccp(this, 1.0, false));
      this.bS.a(5, new cds(this, 0.8));
      this.bS.a(6, new ccn(this, cou.class, 8.0F));
      this.bS.a(6, new cda(this));
      this.bT.a(1, new cdy<>(this, cou.class, true));
      this.bT.a(2, new cdx(this));
   }

   public static bwo.a n() {
      return cly.gs().a(bwp.v, 0.25);
   }

   @Override
   public int cE() {
      return this.aa_() == null ? this.y(0.0F) : this.y(this.eD() - 1.0F);
   }

   @Override
   public boolean a(float $$0, float $$1, btb $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      this.bY += (int)($$0 * 1.5F);
      if (this.bY > this.bZ - 5) {
         this.bY = this.bZ - 5;
      }

      return $$3;
   }

   @Override
   protected void a(akq.a $$0) {
      super.a($$0);
      $$0.a(a, -1);
      $$0.a(b, false);
      $$0.a(c, false);
   }

   @Override
   public void b(ul $$0) {
      super.b($$0);
      if (this.al.a(b)) {
         $$0.a("powered", true);
      }

      $$0.a("Fuse", (short)this.bZ);
      $$0.a("ExplosionRadius", (byte)this.ca);
      $$0.a("ignited", this.gm());
   }

   @Override
   public void a(ul $$0) {
      super.a($$0);
      this.al.a(b, $$0.q("powered"));
      if ($$0.b("Fuse", 99)) {
         this.bZ = $$0.g("Fuse");
      }

      if ($$0.b("ExplosionRadius", 99)) {
         this.ca = $$0.f("ExplosionRadius");
      }

      if ($$0.q("ignited")) {
         this.gn();
      }
   }

   @Override
   public void h() {
      if (this.bL()) {
         this.d = this.bY;
         if (this.gm()) {
            this.b(1);
         }

         int $$0 = this.v();
         if ($$0 > 0 && this.bY == 0) {
            this.a(awn.gl, 1.0F, 0.5F);
            this.a(ear.I);
         }

         this.bY += $$0;
         if (this.bY < 0) {
            this.bY = 0;
         }

         if (this.bY >= this.bZ) {
            this.bY = this.bZ;
            this.gq();
         }
      }

      super.h();
   }

   @Override
   public void h(@Nullable bvh $$0) {
      if (!($$0 instanceof ciy)) {
         super.h($$0);
      }
   }

   @Override
   protected awm e(btb $$0) {
      return awn.gk;
   }

   @Override
   protected awm n_() {
      return awn.gj;
   }

   @Override
   protected void a(arp $$0, btb $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      bul $$3 = $$1.d();
      if ($$3 != this && $$3 instanceof clk $$4 && $$4.go()) {
         $$4.gp();
         this.a($$0, cwq.uH);
      }
   }

   @Override
   public boolean c(arp $$0, bul $$1) {
      return true;
   }

   public boolean q() {
      return this.al.a(b);
   }

   public float J(float $$0) {
      return azm.h($$0, (float)this.d, (float)this.bY) / (float)(this.bZ - 2);
   }

   public int v() {
      return this.al.a(a);
   }

   public void b(int $$0) {
      this.al.a(a, $$0);
   }

   @Override
   public void a(arp $$0, bvg $$1) {
      super.a($$0, $$1);
      this.al.a(b, true);
   }

   @Override
   protected bsk b(cou $$0, bsj $$1) {
      cwm $$2 = $$0.b($$1);
      if ($$2.a(axl.bw)) {
         awm $$3 = $$2.a(cwq.uo) ? awn.iL : awn.ja;
         this.dV().a($$0, this.dA(), this.dC(), this.dG(), $$3, this.dm(), 1.0F, this.ae.i() * 0.4F + 0.8F);
         if (!this.dV().C) {
            this.gn();
            if (!$$2.m()) {
               $$2.h(1);
            } else {
               $$2.a(1, $$0, d($$1));
            }
         }

         return bsk.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   private void gq() {
      if (this.dV() instanceof arp $$0) {
         float $$1 = this.q() ? 2.0F : 1.0F;
         this.bd = true;
         $$0.a(this, this.dA(), this.dC(), this.dG(), (float)this.ca * $$1, dfm.a.c);
         this.gt();
         this.a($$0, bul.c.a);
         this.at();
      }
   }

   private void gt() {
      Collection<btq> $$0 = this.eA();
      if (!$$0.isEmpty()) {
         bue $$1 = new bue(this.dV(), this.dA(), this.dC(), this.dG());
         $$1.a(2.5F);
         $$1.b(-0.5F);
         $$1.c(10);
         $$1.a($$1.g() / 2);
         $$1.c(-$$1.c() / (float)$$1.g());

         for (btq $$2 : $$0) {
            $$1.a(new btq($$2));
         }

         this.dV().b($$1);
      }
   }

   public boolean gm() {
      return this.al.a(c);
   }

   public void gn() {
      this.al.a(c, true);
   }

   public boolean go() {
      return this.q() && this.cb < 1;
   }

   public void gp() {
      this.cb++;
   }
}
