import java.util.Collection;
import javax.annotation.Nullable;

public class cll extends clz {
   private static final ajy<Integer> a = akc.a(cll.class, aka.b);
   private static final ajy<Boolean> b = akc.a(cll.class, aka.k);
   private static final ajy<Boolean> c = akc.a(cll.class, aka.k);
   private int d;
   private int bY;
   private int bZ = 30;
   private int ca = 3;
   private int cb;

   public cll(but<? extends cll> $$0, dgj $$1) {
      super($$0, $$1);
   }

   @Override
   protected void E() {
      this.bS.a(1, new cca(this));
      this.bS.a(2, new cdn(this));
      this.bS.a(3, new cbn<>(this, chn.class, 6.0F, 1.0, 1.2));
      this.bS.a(3, new cbn<>(this, chc.class, 6.0F, 1.0, 1.2));
      this.bS.a(4, new ccq(this, 1.0, false));
      this.bS.a(5, new cdt(this, 0.8));
      this.bS.a(6, new cco(this, coy.class, 8.0F));
      this.bS.a(6, new cdb(this));
      this.bT.a(1, new cdz<>(this, coy.class, true));
      this.bT.a(2, new cdy(this));
   }

   public static bwp.a m() {
      return clz.gx().a(bwq.v, 0.25);
   }

   @Override
   public int cE() {
      return this.O_() == null ? this.y(0.0F) : this.y(this.eD() - 1.0F);
   }

   @Override
   public boolean a(float $$0, float $$1, btc $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      this.bY += (int)($$0 * 1.5F);
      if (this.bY > this.bZ - 5) {
         this.bY = this.bZ - 5;
      }

      return $$3;
   }

   @Override
   protected void a(akc.a $$0) {
      super.a($$0);
      $$0.a(a, -1);
      $$0.a(b, false);
      $$0.a(c, false);
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      if (this.al.a(b)) {
         $$0.a("powered", true);
      }

      $$0.a("Fuse", (short)this.bZ);
      $$0.a("ExplosionRadius", (byte)this.ca);
      $$0.a("ignited", this.x());
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      this.al.a(b, $$0.q("powered"));
      if ($$0.b("Fuse", 99)) {
         this.bZ = $$0.g("Fuse");
      }

      if ($$0.b("ExplosionRadius", 99)) {
         this.ca = $$0.f("ExplosionRadius");
      }

      if ($$0.q("ignited")) {
         this.gs();
      }
   }

   @Override
   public void h() {
      if (this.bL()) {
         this.d = this.bY;
         if (this.x()) {
            this.b(1);
         }

         int $$0 = this.t();
         if ($$0 > 0 && this.bY == 0) {
            this.a(awa.gF, 1.0F, 0.5F);
            this.a(ebu.I);
         }

         this.bY += $$0;
         if (this.bY < 0) {
            this.bY = 0;
         }

         if (this.bY >= this.bZ) {
            this.bY = this.bZ;
            this.gv();
         }
      }

      super.h();
   }

   @Override
   public void h(@Nullable bvi $$0) {
      if (!($$0 instanceof ciz)) {
         super.h($$0);
      }
   }

   @Override
   protected avz e(btc $$0) {
      return awa.gE;
   }

   @Override
   protected avz o_() {
      return awa.gD;
   }

   @Override
   protected void a(ard $$0, btc $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      bum $$3 = $$1.d();
      if ($$3 != this && $$3 instanceof cll $$4 && $$4.gt()) {
         $$4.gu();
         this.a($$0, cwu.vo);
      }
   }

   @Override
   public boolean c(ard $$0, bum $$1) {
      return true;
   }

   public boolean p() {
      return this.al.a(b);
   }

   public float J(float $$0) {
      return ayz.h($$0, (float)this.d, (float)this.bY) / (float)(this.bZ - 2);
   }

   public int t() {
      return this.al.a(a);
   }

   public void b(int $$0) {
      this.al.a(a, $$0);
   }

   @Override
   public void a(ard $$0, bvh $$1) {
      super.a($$0, $$1);
      this.al.a(b, true);
   }

   @Override
   protected bsl b(coy $$0, bsk $$1) {
      cwq $$2 = $$0.b($$1);
      if ($$2.a(awy.bv)) {
         avz $$3 = $$2.a(cwu.uV) ? awa.jk : awa.jz;
         this.dV().a($$0, this.dA(), this.dC(), this.dG(), $$3, this.dm(), 1.0F, this.ae.i() * 0.4F + 0.8F);
         if (!this.dV().C) {
            this.gs();
            if (!$$2.m()) {
               $$2.h(1);
            } else {
               $$2.a(1, $$0, d($$1));
            }
         }

         return bsl.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   private void gv() {
      if (this.dV() instanceof ard $$0) {
         float $$1 = this.p() ? 2.0F : 1.0F;
         this.be = true;
         $$0.a(this, this.dA(), this.dC(), this.dG(), (float)this.ca * $$1, dgj.a.c);
         this.gy();
         this.a($$0, bum.d.a);
         this.at();
      }
   }

   private void gy() {
      Collection<btr> $$0 = this.eA();
      if (!$$0.isEmpty()) {
         buf $$1 = new buf(this.dV(), this.dA(), this.dC(), this.dG());
         $$1.a(2.5F);
         $$1.b(-0.5F);
         $$1.c(10);
         $$1.a($$1.g() / 2);
         $$1.c(-$$1.c() / (float)$$1.g());

         for (btr $$2 : $$0) {
            $$1.a(new btr($$2));
         }

         this.dV().b($$1);
      }
   }

   public boolean x() {
      return this.al.a(c);
   }

   public void gs() {
      this.al.a(c, true);
   }

   public boolean gt() {
      return this.p() && this.cb < 1;
   }

   public void gu() {
      this.cb++;
   }
}
