import java.util.Collection;
import javax.annotation.Nullable;

public class cmv extends cnj {
   private static final akg<Integer> a = akk.a(cmv.class, aki.b);
   private static final akg<Boolean> b = akk.a(cmv.class, aki.k);
   private static final akg<Boolean> c = akk.a(cmv.class, aki.k);
   private int d;
   private int bE;
   private int bF = 30;
   private int bG = 3;
   private int bH;

   public cmv(bwb<? extends cmv> $$0, dhp $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      this.bB.a(1, new cdh(this));
      this.bB.a(2, new ceu(this));
      this.bB.a(3, new ccu<>(this, ciu.class, 6.0F, 1.0, 1.2));
      this.bB.a(3, new ccu<>(this, cij.class, 6.0F, 1.0, 1.2));
      this.bB.a(4, new cdx(this, 1.0, false));
      this.bB.a(5, new cfa(this, 0.8));
      this.bB.a(6, new cdv(this, cqi.class, 8.0F));
      this.bB.a(6, new cei(this));
      this.bC.a(1, new cfg<>(this, cqi.class, true));
      this.bC.a(2, new cff(this));
   }

   public static bxw.a j() {
      return cnj.gt().a(bxx.v, 0.25);
   }

   @Override
   public int cE() {
      return this.f() == null ? this.y(0.0F) : this.y(this.eF() - 1.0F);
   }

   @Override
   public boolean a(double $$0, float $$1, buh $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      this.bE += (int)($$0 * 1.5);
      if (this.bE > this.bF - 5) {
         this.bE = this.bF - 5;
      }

      return $$3;
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(a, -1);
      $$0.a(b, false);
      $$0.a(c, false);
   }

   @Override
   public void b(tw $$0) {
      super.b($$0);
      if (this.al.a(b)) {
         $$0.a("powered", true);
      }

      $$0.a("Fuse", (short)this.bF);
      $$0.a("ExplosionRadius", (byte)this.bG);
      $$0.a("ignited", this.q());
   }

   @Override
   public void a(tw $$0) {
      super.a($$0);
      this.al.a(b, $$0.q("powered"));
      if ($$0.b("Fuse", 99)) {
         this.bF = $$0.g("Fuse");
      }

      if ($$0.b("ExplosionRadius", 99)) {
         this.bG = $$0.f("ExplosionRadius");
      }

      if ($$0.q("ignited")) {
         this.t();
      }
   }

   @Override
   public void h() {
      if (this.bK()) {
         this.d = this.bE;
         if (this.q()) {
            this.b(1);
         }

         int $$0 = this.n();
         if ($$0 > 0 && this.bE == 0) {
            this.a(awk.gF, 1.0F, 0.5F);
            this.a(edm.I);
         }

         this.bE += $$0;
         if (this.bE < 0) {
            this.bE = 0;
         }

         if (this.bE >= this.bF) {
            this.bE = this.bF;
            this.gr();
         }
      }

      super.h();
   }

   @Override
   public void h(@Nullable bwr $$0) {
      if (!($$0 instanceof ckj)) {
         super.h($$0);
      }
   }

   @Override
   protected awj e(buh $$0) {
      return awk.gE;
   }

   @Override
   protected awj l_() {
      return awk.gD;
   }

   @Override
   protected void a(arn $$0, buh $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      bvs $$3 = $$1.d();
      if ($$3 != this && $$3 instanceof cmv $$4 && $$4.x()) {
         $$4.gq();
         this.a($$0, cyc.vs);
      }
   }

   @Override
   public boolean c(arn $$0, bvs $$1) {
      return true;
   }

   public boolean m() {
      return this.al.a(b);
   }

   public float K(float $$0) {
      return azk.h($$0, (float)this.d, (float)this.bE) / (float)(this.bF - 2);
   }

   public int n() {
      return this.al.a(a);
   }

   public void b(int $$0) {
      this.al.a(a, $$0);
   }

   @Override
   public void a(arn $$0, bwq $$1) {
      super.a($$0, $$1);
      this.al.a(b, true);
   }

   @Override
   protected btq b(cqi $$0, btp $$1) {
      cxy $$2 = $$0.b($$1);
      if ($$2.a(axi.bv)) {
         awj $$3 = $$2.a(cyc.uZ) ? awk.jk : awk.jz;
         this.dV().a($$0, this.dA(), this.dC(), this.dG(), $$3, this.dm(), 1.0F, this.ae.i() * 0.4F + 0.8F);
         if (!this.dV().C) {
            this.t();
            if (!$$2.m()) {
               $$2.h(1);
            } else {
               $$2.a(1, $$0, d($$1));
            }
         }

         return btq.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   private void gr() {
      if (this.dV() instanceof arn $$0) {
         float $$1 = this.m() ? 2.0F : 1.0F;
         this.bb = true;
         $$0.a(this, this.dA(), this.dC(), this.dG(), (float)this.bG * $$1, dhp.a.c);
         this.gu();
         this.a($$0, bvs.e.a);
         this.at();
      }
   }

   private void gu() {
      Collection<buw> $$0 = this.eC();
      if (!$$0.isEmpty()) {
         bvk $$1 = new bvk(this.dV(), this.dA(), this.dC(), this.dG());
         $$1.a(2.5F);
         $$1.c(-0.5F);
         $$1.c(10);
         $$1.a($$1.i() / 2);
         $$1.b(0.25F);
         $$1.d(-$$1.e() / (float)$$1.i());

         for (buw $$2 : $$0) {
            $$1.a(new buw($$2));
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
      return this.m() && this.bH < 1;
   }

   public void gq() {
      this.bH++;
   }
}
