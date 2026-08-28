import java.util.Collection;
import javax.annotation.Nullable;

public class cma extends cmo {
   private static final aks<Integer> a = akw.a(cma.class, aku.b);
   private static final aks<Boolean> b = akw.a(cma.class, aku.k);
   private static final aks<Boolean> c = akw.a(cma.class, aku.k);
   private int d;
   private int bZ;
   private int ca = 30;
   private int cb = 3;
   private int cc;

   public cma(bvi<? extends cma> $$0, dgz $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      this.bT.a(1, new ccp(this));
      this.bT.a(2, new cec(this));
      this.bT.a(3, new ccc<>(this, cic.class, 6.0F, 1.0, 1.2));
      this.bT.a(3, new ccc<>(this, chr.class, 6.0F, 1.0, 1.2));
      this.bT.a(4, new cdf(this, 1.0, false));
      this.bT.a(5, new cei(this, 0.8));
      this.bT.a(6, new cdd(this, cpo.class, 8.0F));
      this.bT.a(6, new cdq(this));
      this.bU.a(1, new ceo<>(this, cpo.class, true));
      this.bU.a(2, new cen(this));
   }

   public static bxe.a m() {
      return cmo.gt().a(bxf.v, 0.25);
   }

   @Override
   public int cE() {
      return this.O_() == null ? this.y(0.0F) : this.y(this.eE() - 1.0F);
   }

   @Override
   public boolean a(float $$0, float $$1, btr $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      this.bZ += (int)($$0 * 1.5F);
      if (this.bZ > this.ca - 5) {
         this.bZ = this.ca - 5;
      }

      return $$3;
   }

   @Override
   protected void a(akw.a $$0) {
      super.a($$0);
      $$0.a(a, -1);
      $$0.a(b, false);
      $$0.a(c, false);
   }

   @Override
   public void b(um $$0) {
      super.b($$0);
      if (this.al.a(b)) {
         $$0.a("powered", true);
      }

      $$0.a("Fuse", (short)this.ca);
      $$0.a("ExplosionRadius", (byte)this.cb);
      $$0.a("ignited", this.x());
   }

   @Override
   public void a(um $$0) {
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
            this.a(awv.gF, 1.0F, 0.5F);
            this.a(eck.I);
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
   public void h(@Nullable bvx $$0) {
      if (!($$0 instanceof cjo)) {
         super.h($$0);
      }
   }

   @Override
   protected awu e(btr $$0) {
      return awv.gE;
   }

   @Override
   protected awu o_() {
      return awv.gD;
   }

   @Override
   protected void a(arx $$0, btr $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      bvb $$3 = $$1.d();
      if ($$3 != this && $$3 instanceof cma $$4 && $$4.gp()) {
         $$4.gq();
         this.a($$0, cxk.vo);
      }
   }

   @Override
   public boolean c(arx $$0, bvb $$1) {
      return true;
   }

   public boolean p() {
      return this.al.a(b);
   }

   public float J(float $$0) {
      return azu.h($$0, (float)this.d, (float)this.bZ) / (float)(this.ca - 2);
   }

   public int t() {
      return this.al.a(a);
   }

   public void b(int $$0) {
      this.al.a(a, $$0);
   }

   @Override
   public void a(arx $$0, bvw $$1) {
      super.a($$0, $$1);
      this.al.a(b, true);
   }

   @Override
   protected bta b(cpo $$0, bsz $$1) {
      cxg $$2 = $$0.b($$1);
      if ($$2.a(axt.bx)) {
         awu $$3 = $$2.a(cxk.uV) ? awv.jk : awv.jz;
         this.dW().a($$0, this.dB(), this.dD(), this.dH(), $$3, this.dn(), 1.0F, this.ae.i() * 0.4F + 0.8F);
         if (!this.dW().C) {
            this.go();
            if (!$$2.m()) {
               $$2.h(1);
            } else {
               $$2.a(1, $$0, d($$1));
            }
         }

         return bta.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   private void gr() {
      if (this.dW() instanceof arx $$0) {
         float $$1 = this.p() ? 2.0F : 1.0F;
         this.be = true;
         $$0.a(this, this.dB(), this.dD(), this.dH(), (float)this.cb * $$1, dgz.a.c);
         this.gu();
         this.a($$0, bvb.d.a);
         this.at();
      }
   }

   private void gu() {
      Collection<bug> $$0 = this.eB();
      if (!$$0.isEmpty()) {
         buu $$1 = new buu(this.dW(), this.dB(), this.dD(), this.dH());
         $$1.a(2.5F);
         $$1.b(-0.5F);
         $$1.c(10);
         $$1.a($$1.g() / 2);
         $$1.c(-$$1.c() / (float)$$1.g());

         for (bug $$2 : $$0) {
            $$1.a(new bug($$2));
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
