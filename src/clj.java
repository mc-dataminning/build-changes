import java.util.Collection;
import javax.annotation.Nullable;

public class clj extends clx {
   private static final ajx<Integer> a = akb.a(clj.class, ajz.b);
   private static final ajx<Boolean> b = akb.a(clj.class, ajz.k);
   private static final ajx<Boolean> c = akb.a(clj.class, ajz.k);
   private int d;
   private int bY;
   private int bZ = 30;
   private int ca = 3;
   private int cb;

   public clj(bur<? extends clj> $$0, dgi $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      this.bS.a(1, new cby(this));
      this.bS.a(2, new cdl(this));
      this.bS.a(3, new cbl<>(this, chl.class, 6.0F, 1.0, 1.2));
      this.bS.a(3, new cbl<>(this, cha.class, 6.0F, 1.0, 1.2));
      this.bS.a(4, new cco(this, 1.0, false));
      this.bS.a(5, new cdr(this, 0.8));
      this.bS.a(6, new ccm(this, cox.class, 8.0F));
      this.bS.a(6, new ccz(this));
      this.bT.a(1, new cdx<>(this, cox.class, true));
      this.bT.a(2, new cdw(this));
   }

   public static bwn.a m() {
      return clx.gu().a(bwo.v, 0.25);
   }

   @Override
   public int cE() {
      return this.O_() == null ? this.y(0.0F) : this.y(this.eE() - 1.0F);
   }

   @Override
   public boolean a(float $$0, float $$1, bta $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      this.bY += (int)($$0 * 1.5F);
      if (this.bY > this.bZ - 5) {
         this.bY = this.bZ - 5;
      }

      return $$3;
   }

   @Override
   protected void a(akb.a $$0) {
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
         this.gp();
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
            this.a(ebt.I);
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

      super.h();
   }

   @Override
   public void h(@Nullable bvg $$0) {
      if (!($$0 instanceof cix)) {
         super.h($$0);
      }
   }

   @Override
   protected avz e(bta $$0) {
      return awa.gE;
   }

   @Override
   protected avz o_() {
      return awa.gD;
   }

   @Override
   protected void a(arc $$0, bta $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      buk $$3 = $$1.d();
      if ($$3 != this && $$3 instanceof clj $$4 && $$4.gq()) {
         $$4.gr();
         this.a($$0, cwt.vo);
      }
   }

   @Override
   public boolean c(arc $$0, buk $$1) {
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
   public void a(arc $$0, bvf $$1) {
      super.a($$0, $$1);
      this.al.a(b, true);
   }

   @Override
   protected bsj b(cox $$0, bsi $$1) {
      cwp $$2 = $$0.b($$1);
      if ($$2.a(awy.bv)) {
         avz $$3 = $$2.a(cwt.uV) ? awa.jk : awa.jz;
         this.dW().a($$0, this.dB(), this.dD(), this.dH(), $$3, this.dn(), 1.0F, this.ae.i() * 0.4F + 0.8F);
         if (!this.dW().C) {
            this.gp();
            if (!$$2.m()) {
               $$2.h(1);
            } else {
               $$2.a(1, $$0, d($$1));
            }
         }

         return bsj.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   private void gs() {
      if (this.dW() instanceof arc $$0) {
         float $$1 = this.p() ? 2.0F : 1.0F;
         this.be = true;
         $$0.a(this, this.dB(), this.dD(), this.dH(), (float)this.ca * $$1, dgi.a.c);
         this.gv();
         this.a($$0, buk.d.a);
         this.at();
      }
   }

   private void gv() {
      Collection<btp> $$0 = this.eB();
      if (!$$0.isEmpty()) {
         bud $$1 = new bud(this.dW(), this.dB(), this.dD(), this.dH());
         $$1.a(2.5F);
         $$1.b(-0.5F);
         $$1.c(10);
         $$1.a($$1.g() / 2);
         $$1.c(-$$1.c() / (float)$$1.g());

         for (btp $$2 : $$0) {
            $$1.a(new btp($$2));
         }

         this.dW().b($$1);
      }
   }

   public boolean x() {
      return this.al.a(c);
   }

   public void gp() {
      this.al.a(c, true);
   }

   public boolean gq() {
      return this.p() && this.cb < 1;
   }

   public void gr() {
      this.cb++;
   }
}
