import java.util.Collection;
import javax.annotation.Nullable;

public class cnf extends cnt {
   private static final akh<Integer> a = akl.a(cnf.class, akj.b);
   private static final akh<Boolean> b = akl.a(cnf.class, akj.k);
   private static final akh<Boolean> c = akl.a(cnf.class, akj.k);
   private int d;
   private int bF;
   private int bG = 30;
   private int bH = 3;
   private int bI;

   public cnf(bwj<? extends cnf> $$0, dip $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      this.bC.a(1, new cdp(this));
      this.bC.a(2, new cfc(this));
      this.bC.a(3, new cdc<>(this, cjc.class, 6.0F, 1.0, 1.2));
      this.bC.a(3, new cdc<>(this, cir.class, 6.0F, 1.0, 1.2));
      this.bC.a(4, new cef(this, 1.0, false));
      this.bC.a(5, new cfi(this, 0.8));
      this.bC.a(6, new ced(this, cqs.class, 8.0F));
      this.bC.a(6, new ceq(this));
      this.bD.a(1, new cfo<>(this, cqs.class, true));
      this.bD.a(2, new cfn(this));
   }

   public static bye.a j() {
      return cnt.gt().a(byf.v, 0.25);
   }

   @Override
   public int cE() {
      return this.f() == null ? this.y(0.0F) : this.y(this.eF() - 1.0F);
   }

   @Override
   public boolean a(double $$0, float $$1, bup $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      this.bF += (int)($$0 * 1.5);
      if (this.bF > this.bG - 5) {
         this.bF = this.bG - 5;
      }

      return $$3;
   }

   @Override
   protected void a(akl.a $$0) {
      super.a($$0);
      $$0.a(a, -1);
      $$0.a(b, false);
      $$0.a(c, false);
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      if (this.al.a(b)) {
         $$0.a("powered", true);
      }

      $$0.a("Fuse", (short)this.bG);
      $$0.a("ExplosionRadius", (byte)this.bH);
      $$0.a("ignited", this.q());
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      this.al.a(b, $$0.q("powered"));
      if ($$0.b("Fuse", 99)) {
         this.bG = $$0.g("Fuse");
      }

      if ($$0.b("ExplosionRadius", 99)) {
         this.bH = $$0.f("ExplosionRadius");
      }

      if ($$0.q("ignited")) {
         this.t();
      }
   }

   @Override
   public void h() {
      if (this.bK()) {
         this.d = this.bF;
         if (this.q()) {
            this.b(1);
         }

         int $$0 = this.n();
         if ($$0 > 0 && this.bF == 0) {
            this.a(awl.gF, 1.0F, 0.5F);
            this.a(eeo.I);
         }

         this.bF += $$0;
         if (this.bF < 0) {
            this.bF = 0;
         }

         if (this.bF >= this.bG) {
            this.bF = this.bG;
            this.gr();
         }
      }

      super.h();
   }

   @Override
   public void g(@Nullable bwz $$0) {
      if (!($$0 instanceof ckt)) {
         super.g($$0);
      }
   }

   @Override
   protected awk e(bup $$0) {
      return awl.gE;
   }

   @Override
   protected awk l_() {
      return awl.gD;
   }

   @Override
   protected void a(aro $$0, bup $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      bwa $$3 = $$1.d();
      if ($$3 != this && $$3 instanceof cnf $$4 && $$4.x()) {
         $$4.gq();
         this.a($$0, cyw.vs);
      }
   }

   @Override
   public boolean c(aro $$0, bwa $$1) {
      return true;
   }

   public boolean m() {
      return this.al.a(b);
   }

   public float J(float $$0) {
      return azk.h($$0, (float)this.d, (float)this.bF) / (float)(this.bG - 2);
   }

   public int n() {
      return this.al.a(a);
   }

   public void b(int $$0) {
      this.al.a(a, $$0);
   }

   @Override
   public void a(aro $$0, bwy $$1) {
      super.a($$0, $$1);
      this.al.a(b, true);
   }

   @Override
   protected bty b(cqs $$0, btx $$1) {
      cys $$2 = $$0.b($$1);
      if ($$2.a(axi.bv)) {
         awk $$3 = $$2.a(cyw.uZ) ? awl.jk : awl.jz;
         this.dV().a($$0, this.dA(), this.dC(), this.dG(), $$3, this.dm(), 1.0F, this.ae.i() * 0.4F + 0.8F);
         if (!this.dV().C) {
            this.t();
            if (!$$2.m()) {
               $$2.h(1);
            } else {
               $$2.a(1, $$0, d($$1));
            }
         }

         return bty.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   private void gr() {
      if (this.dV() instanceof aro $$0) {
         float $$1 = this.m() ? 2.0F : 1.0F;
         this.bc = true;
         $$0.a(this, this.dA(), this.dC(), this.dG(), (float)this.bH * $$1, dip.a.c);
         this.gu();
         this.a($$0, bwa.e.a);
         this.at();
      }
   }

   private void gu() {
      Collection<bve> $$0 = this.eC();
      if (!$$0.isEmpty()) {
         bvs $$1 = new bvs(this.dV(), this.dA(), this.dC(), this.dG());
         $$1.a(2.5F);
         $$1.c(-0.5F);
         $$1.c(10);
         $$1.a($$1.i() / 2);
         $$1.b(0.25F);
         $$1.d(-$$1.e() / (float)$$1.i());

         for (bve $$2 : $$0) {
            $$1.a(new bve($$2));
         }

         this.dV().b($$1);
      }
   }

   public boolean q() {
      return this.al.a(c);
   }

   public void t() {
      this.al.a(c, true);
   }

   public boolean x() {
      return this.m() && this.bI < 1;
   }

   public void gq() {
      this.bI++;
   }
}
