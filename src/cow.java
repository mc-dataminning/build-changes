import java.util.Collection;
import javax.annotation.Nullable;

public class cow extends cpk {
   private static final aku<Integer> a = aky.a(cow.class, akw.b);
   private static final aku<Boolean> b = aky.a(cow.class, akw.k);
   private static final aku<Boolean> c = aky.a(cow.class, akw.k);
   private static final boolean d = false;
   private static final boolean e = false;
   private static final short f = 30;
   private static final byte bI = 3;
   private int bJ;
   private int bK;
   private int bL = 30;
   private int bM = 3;
   private int bN;

   public cow(bxn<? extends cow> $$0, dkj $$1) {
      super($$0, $$1);
   }

   @Override
   protected void C() {
      this.bF.a(1, new cev(this));
      this.bF.a(2, new cgi(this));
      this.bF.a(3, new cei<>(this, ckn.class, 6.0F, 1.0, 1.2));
      this.bF.a(3, new cei<>(this, cjy.class, 6.0F, 1.0, 1.2));
      this.bF.a(4, new cfl(this, 1.0, false));
      this.bF.a(5, new cgo(this, 0.8));
      this.bF.a(6, new cfj(this, csi.class, 8.0F));
      this.bF.a(6, new cfw(this));
      this.bG.a(1, new cgu<>(this, csi.class, true));
      this.bG.a(2, new cgt(this));
   }

   public static bzk.a m() {
      return cpk.gA().a(bzl.v, 0.25);
   }

   @Override
   public int cE() {
      return this.e() == null ? this.y(0.0F) : this.y(this.eG() - 1.0F);
   }

   @Override
   public boolean a(double $$0, float $$1, bvt $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      this.bK += (int)($$0 * 1.5);
      if (this.bK > this.bL - 5) {
         this.bK = this.bL - 5;
      }

      return $$3;
   }

   @Override
   protected void a(aky.a $$0) {
      super.a($$0);
      $$0.a(a, -1);
      $$0.a(b, false);
      $$0.a(c, false);
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("powered", this.p());
      $$0.a("Fuse", (short)this.bL);
      $$0.a("ExplosionRadius", (byte)this.bM);
      $$0.a("ignited", this.gu());
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      this.al.a(b, $$0.b("powered", false));
      this.bL = $$0.b("Fuse", (short)30);
      this.bM = $$0.b("ExplosionRadius", (byte)3);
      if ($$0.b("ignited", false)) {
         this.gv();
      }
   }

   @Override
   public void g() {
      if (this.bJ()) {
         this.bJ = this.bK;
         if (this.gu()) {
            this.b(1);
         }

         int $$0 = this.u();
         if ($$0 > 0 && this.bK == 0) {
            this.a(awy.gH, 1.0F, 0.5F);
            this.a(egq.I);
         }

         this.bK += $$0;
         if (this.bK < 0) {
            this.bK = 0;
         }

         if (this.bK >= this.bL) {
            this.bK = this.bL;
            this.gy();
         }
      }

      super.g();
   }

   @Override
   public void g(@Nullable byf $$0) {
      if (!($$0 instanceof cma)) {
         super.g($$0);
      }
   }

   @Override
   protected awx e(bvt $$0) {
      return awy.gG;
   }

   @Override
   protected awx j_() {
      return awy.gF;
   }

   @Override
   protected void a(asb $$0, bvt $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      bxe $$3 = $$1.d();
      if ($$3 != this && $$3 instanceof cow $$4 && $$4.gw()) {
         $$4.gx();
         this.a($$0, dao.vz);
      }
   }

   @Override
   public boolean c(asb $$0, bxe $$1) {
      return true;
   }

   public boolean p() {
      return this.al.a(b);
   }

   public float J(float $$0) {
      return azz.h($$0, (float)this.bJ, (float)this.bK) / (float)(this.bL - 2);
   }

   public int u() {
      return this.al.a(a);
   }

   public void b(int $$0) {
      this.al.a(a, $$0);
   }

   @Override
   public void a(asb $$0, bye $$1) {
      super.a($$0, $$1);
      this.al.a(b, true);
   }

   @Override
   protected bvc b(csi $$0, bvb $$1) {
      dak $$2 = $$0.b($$1);
      if ($$2.a(axv.bx)) {
         awx $$3 = $$2.a(dao.vg) ? awy.jn : awy.jD;
         this.dV().a($$0, this.dA(), this.dC(), this.dG(), $$3, this.dm(), 1.0F, this.ae.i() * 0.4F + 0.8F);
         if (!this.dV().C) {
            this.gv();
            if (!$$2.m()) {
               $$2.h(1);
            } else {
               $$2.a(1, $$0, d($$1));
            }
         }

         return bvc.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   private void gy() {
      if (this.dV() instanceof asb $$0) {
         float $$1 = this.p() ? 2.0F : 1.0F;
         this.bc = true;
         $$0.a(this, this.dA(), this.dC(), this.dG(), (float)this.bM * $$1, dkj.a.c);
         this.gB();
         this.a($$0, bxe.d.a);
         this.aq();
      }
   }

   private void gB() {
      Collection<bwi> $$0 = this.eD();
      if (!$$0.isEmpty()) {
         bww $$1 = new bww(this.dV(), this.dA(), this.dC(), this.dG());
         $$1.a(2.5F);
         $$1.c(-0.5F);
         $$1.c(10);
         $$1.a(300);
         $$1.b(0.25F);
         $$1.d(-$$1.c() / (float)$$1.h());

         for (bwi $$2 : $$0) {
            $$1.a(new bwi($$2));
         }

         this.dV().b($$1);
      }
   }

   public boolean gu() {
      return this.al.a(c);
   }

   public void gv() {
      this.al.a(c, true);
   }

   public boolean gw() {
      return this.p() && this.bN < 1;
   }

   public void gx() {
      this.bN++;
   }
}
