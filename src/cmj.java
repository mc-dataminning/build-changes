import java.util.Collection;
import javax.annotation.Nullable;

public class cmj extends cmx {
   private static final alc<Integer> a = alg.a(cmj.class, ale.b);
   private static final alc<Boolean> b = alg.a(cmj.class, ale.k);
   private static final alc<Boolean> c = alg.a(cmj.class, ale.k);
   private int d;
   private int bZ;
   private int ca = 30;
   private int cb = 3;
   private int cc;

   public cmj(bvr<? extends cmj> $$0, dhi $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      this.bT.a(1, new ccy(this));
      this.bT.a(2, new cel(this));
      this.bT.a(3, new ccl<>(this, cil.class, 6.0F, 1.0, 1.2));
      this.bT.a(3, new ccl<>(this, cia.class, 6.0F, 1.0, 1.2));
      this.bT.a(4, new cdo(this, 1.0, false));
      this.bT.a(5, new cer(this, 0.8));
      this.bT.a(6, new cdm(this, cpx.class, 8.0F));
      this.bT.a(6, new cdz(this));
      this.bU.a(1, new cex<>(this, cpx.class, true));
      this.bU.a(2, new cew(this));
   }

   public static bxn.a m() {
      return cmx.gt().a(bxo.v, 0.25);
   }

   @Override
   public int cE() {
      return this.O_() == null ? this.y(0.0F) : this.y(this.eE() - 1.0F);
   }

   @Override
   public boolean a(float $$0, float $$1, bua $$2) {
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
         this.go();
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
            this.a(axf.gE, 1.0F, 0.5F);
            this.a(ecr.I);
         }

         this.bZ += $$0;
         if (this.bZ < 0) {
            this.bZ = 0;
         }

         if (this.bZ >= this.ca) {
            this.bZ = this.ca;
            this.gr();
         }
      }

      super.h();
   }

   @Override
   public void h(@Nullable bwg $$0) {
      if (!($$0 instanceof cjx)) {
         super.h($$0);
      }
   }

   @Override
   protected axe e(bua $$0) {
      return axf.gD;
   }

   @Override
   protected axe o_() {
      return axf.gC;
   }

   @Override
   protected void a(ash $$0, bua $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      bvk $$3 = $$1.d();
      if ($$3 != this && $$3 instanceof cmj $$4 && $$4.gp()) {
         $$4.gq();
         this.a($$0, cxt.vf);
      }
   }

   @Override
   public boolean c(ash $$0, bvk $$1) {
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
   public void a(ash $$0, bwf $$1) {
      super.a($$0, $$1);
      this.al.a(b, true);
   }

   @Override
   protected btj b(cpx $$0, bti $$1) {
      cxp $$2 = $$0.b($$1);
      if ($$2.a(ayd.bx)) {
         axe $$3 = $$2.a(cxt.uM) ? axf.je : axf.jt;
         this.dW().a($$0, this.dB(), this.dD(), this.dH(), $$3, this.dn(), 1.0F, this.ae.i() * 0.4F + 0.8F);
         if (!this.dW().C) {
            this.go();
            if (!$$2.m()) {
               $$2.h(1);
            } else {
               $$2.a(1, $$0, d($$1));
            }
         }

         return btj.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   private void gr() {
      if (this.dW() instanceof ash $$0) {
         float $$1 = this.p() ? 2.0F : 1.0F;
         this.be = true;
         $$0.a(this, this.dB(), this.dD(), this.dH(), (float)this.cb * $$1, dhi.a.c);
         this.gu();
         this.a($$0, bvk.d.a);
         this.at();
      }
   }

   private void gu() {
      Collection<bup> $$0 = this.eB();
      if (!$$0.isEmpty()) {
         bvd $$1 = new bvd(this.dW(), this.dB(), this.dD(), this.dH());
         $$1.a(2.5F);
         $$1.b(-0.5F);
         $$1.c(10);
         $$1.a($$1.g() / 2);
         $$1.c(-$$1.c() / (float)$$1.g());

         for (bup $$2 : $$0) {
            $$1.a(new bup($$2));
         }

         this.dW().b($$1);
      }
   }

   public boolean x() {
      return this.al.a(c);
   }

   public void go() {
      this.al.a(c, true);
   }

   public boolean gp() {
      return this.p() && this.cc < 1;
   }

   public void gq() {
      this.cc++;
   }
}
