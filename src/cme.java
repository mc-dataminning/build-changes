import java.util.Collection;
import javax.annotation.Nullable;

public class cme extends cms {
   private static final alc<Integer> a = alg.a(cme.class, ale.b);
   private static final alc<Boolean> b = alg.a(cme.class, ale.k);
   private static final alc<Boolean> c = alg.a(cme.class, ale.k);
   private int d;
   private int bZ;
   private int ca = 30;
   private int cb = 3;
   private int cc;

   public cme(bvm<? extends cme> $$0, dha $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      this.bT.a(1, new cct(this));
      this.bT.a(2, new ceg(this));
      this.bT.a(3, new ccg<>(this, cig.class, 6.0F, 1.0, 1.2));
      this.bT.a(3, new ccg<>(this, chv.class, 6.0F, 1.0, 1.2));
      this.bT.a(4, new cdj(this, 1.0, false));
      this.bT.a(5, new cem(this, 0.8));
      this.bT.a(6, new cdh(this, cps.class, 8.0F));
      this.bT.a(6, new cdu(this));
      this.bU.a(1, new ces<>(this, cps.class, true));
      this.bU.a(2, new cer(this));
   }

   public static bxi.a m() {
      return cms.gr().a(bxj.v, 0.25);
   }

   @Override
   public int cE() {
      return this.O_() == null ? this.y(0.0F) : this.y(this.eD() - 1.0F);
   }

   @Override
   public boolean a(float $$0, float $$1, btv $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      this.bZ += (int)($$0 * 1.5F);
      if (this.bZ > this.ca - 5) {
         this.bZ = this.ca - 5;
      }

      return $$3;
   }

   @Override
   protected void a(alg.a $$0) {
      super.a($$0);
      $$0.a(a, -1);
      $$0.a(b, false);
      $$0.a(c, false);
   }

   @Override
   public void b(ux $$0) {
      super.b($$0);
      if (this.al.a(b)) {
         $$0.a("powered", true);
      }

      $$0.a("Fuse", (short)this.ca);
      $$0.a("ExplosionRadius", (byte)this.cb);
      $$0.a("ignited", this.x());
   }

   @Override
   public void a(ux $$0) {
      super.a($$0);
      this.al.a(b, $$0.q("powered"));
      if ($$0.b("Fuse", 99)) {
         this.ca = $$0.g("Fuse");
      }

      if ($$0.b("ExplosionRadius", 99)) {
         this.cb = $$0.f("ExplosionRadius");
      }

      if ($$0.q("ignited")) {
         this.gm();
      }
   }

   @Override
   public void h() {
      if (this.bL()) {
         this.d = this.bZ;
         if (this.x()) {
            this.b(1);
         }

         int $$0 = this.t();
         if ($$0 > 0 && this.bZ == 0) {
            this.a(axf.gD, 1.0F, 0.5F);
            this.a(ecj.I);
         }

         this.bZ += $$0;
         if (this.bZ < 0) {
            this.bZ = 0;
         }

         if (this.bZ >= this.ca) {
            this.bZ = this.ca;
            this.gp();
         }
      }

      super.h();
   }

   @Override
   public void h(@Nullable bwb $$0) {
      if (!($$0 instanceof cjs)) {
         super.h($$0);
      }
   }

   @Override
   protected axe e(btv $$0) {
      return axf.gC;
   }

   @Override
   protected axe o_() {
      return axf.gB;
   }

   @Override
   protected void a(ash $$0, btv $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      bvf $$3 = $$1.d();
      if ($$3 != this && $$3 instanceof cme $$4 && $$4.gn()) {
         $$4.go();
         this.a($$0, cxo.vf);
      }
   }

   @Override
   public boolean c(ash $$0, bvf $$1) {
      return true;
   }

   public boolean p() {
      return this.al.a(b);
   }

   public float J(float $$0) {
      return bae.h($$0, (float)this.d, (float)this.bZ) / (float)(this.ca - 2);
   }

   public int t() {
      return this.al.a(a);
   }

   public void b(int $$0) {
      this.al.a(a, $$0);
   }

   @Override
   public void a(ash $$0, bwa $$1) {
      super.a($$0, $$1);
      this.al.a(b, true);
   }

   @Override
   protected bte b(cps $$0, btd $$1) {
      cxk $$2 = $$0.b($$1);
      if ($$2.a(ayd.bx)) {
         axe $$3 = $$2.a(cxo.uM) ? axf.jd : axf.js;
         this.dV().a($$0, this.dA(), this.dC(), this.dG(), $$3, this.dm(), 1.0F, this.ae.i() * 0.4F + 0.8F);
         if (!this.dV().C) {
            this.gm();
            if (!$$2.m()) {
               $$2.h(1);
            } else {
               $$2.a(1, $$0, d($$1));
            }
         }

         return bte.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   private void gp() {
      if (this.dV() instanceof ash $$0) {
         float $$1 = this.p() ? 2.0F : 1.0F;
         this.be = true;
         $$0.a(this, this.dA(), this.dC(), this.dG(), (float)this.cb * $$1, dha.a.c);
         this.gs();
         this.a($$0, bvf.c.a);
         this.at();
      }
   }

   private void gs() {
      Collection<buk> $$0 = this.eA();
      if (!$$0.isEmpty()) {
         buy $$1 = new buy(this.dV(), this.dA(), this.dC(), this.dG());
         $$1.a(2.5F);
         $$1.b(-0.5F);
         $$1.c(10);
         $$1.a($$1.g() / 2);
         $$1.c(-$$1.c() / (float)$$1.g());

         for (buk $$2 : $$0) {
            $$1.a(new buk($$2));
         }

         this.dV().b($$1);
      }
   }

   public boolean x() {
      return this.al.a(c);
   }

   public void gm() {
      this.al.a(c, true);
   }

   public boolean gn() {
      return this.p() && this.cc < 1;
   }

   public void go() {
      this.cc++;
   }
}
