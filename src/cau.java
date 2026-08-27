import java.util.Collection;
import javax.annotation.Nullable;

public class cau extends cbi implements blt {
   private static final afo<Integer> b = afr.a(cau.class, afq.b);
   private static final afo<Boolean> c = afr.a(cau.class, afq.k);
   private static final afo<Boolean> d = afr.a(cau.class, afq.k);
   private int e;
   private int bT;
   private int bU = 30;
   private int bV = 3;
   private int bW;

   public cau(bku<? extends cau> $$0, csa $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      this.bO.a(1, new brv(this));
      this.bO.a(2, new bti(this));
      this.bO.a(3, new bri<>(this, bxf.class, 6.0F, 1.0, 1.2));
      this.bO.a(3, new bri<>(this, bwu.class, 6.0F, 1.0, 1.2));
      this.bO.a(4, new bsl(this, 1.0, false));
      this.bO.a(5, new bto(this, 0.8));
      this.bO.a(6, new bsj(this, cdu.class, 8.0F));
      this.bO.a(6, new bsw(this));
      this.bP.a(1, new btu<>(this, cdu.class, true));
      this.bP.a(2, new btt(this));
   }

   public static bml.a u() {
      return cbi.gl().a(bmm.m, 0.25);
   }

   @Override
   public int cu() {
      return this.q() == null ? 3 : 3 + (int)(this.ew() - 1.0F);
   }

   @Override
   public boolean a(float $$0, float $$1, bjo $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      this.bT += (int)($$0 * 1.5F);
      if (this.bT > this.bU - 5) {
         this.bT = this.bU - 5;
      }

      return $$3;
   }

   @Override
   protected void b_() {
      super.b_();
      this.an.a(b, -1);
      this.an.a(c, false);
      this.an.a(d, false);
   }

   @Override
   public void b(rz $$0) {
      super.b($$0);
      if (this.an.b(c)) {
         $$0.a("powered", true);
      }

      $$0.a("Fuse", (short)this.bU);
      $$0.a("ExplosionRadius", (byte)this.bV);
      $$0.a("ignited", this.A());
   }

   @Override
   public void a(rz $$0) {
      super.a($$0);
      this.an.b(c, $$0.q("powered"));
      if ($$0.b("Fuse", 99)) {
         this.bU = $$0.g("Fuse");
      }

      if ($$0.b("ExplosionRadius", 99)) {
         this.bV = $$0.f("ExplosionRadius");
      }

      if ($$0.q("ignited")) {
         this.gf();
      }
   }

   @Override
   public void l() {
      if (this.bx()) {
         this.e = this.bT;
         if (this.A()) {
            this.b(1);
         }

         int $$0 = this.w();
         if ($$0 > 0 && this.bT == 0) {
            this.a(aqr.fy, 1.0F, 0.5F);
            this.a(dls.I);
         }

         this.bT += $$0;
         if (this.bT < 0) {
            this.bT = 0;
         }

         if (this.bT >= this.bU) {
            this.bT = this.bU;
            this.gi();
         }
      }

      super.l();
   }

   @Override
   public void h(@Nullable blg $$0) {
      if (!($$0 instanceof bym)) {
         super.h($$0);
      }
   }

   @Override
   protected aqq d(bjo $$0) {
      return aqr.fx;
   }

   @Override
   protected aqq m_() {
      return aqr.fw;
   }

   @Override
   protected void a(bjo $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      bkq $$3 = $$0.d();
      if ($$3 != this && $$3 instanceof cau $$4 && $$4.gg()) {
         $$4.gh();
         this.a(clm.uh);
      }
   }

   @Override
   public boolean C(bkq $$0) {
      return true;
   }

   @Override
   public boolean a() {
      return this.an.b(c);
   }

   public float E(float $$0) {
      return atm.i($$0, (float)this.e, (float)this.bT) / (float)(this.bU - 2);
   }

   public int w() {
      return this.an.b(b);
   }

   public void b(int $$0) {
      this.an.b(b, $$0);
   }

   @Override
   public void a(ame $$0, blf $$1) {
      super.a($$0, $$1);
      this.an.b(c, true);
   }

   @Override
   protected bix b(cdu $$0, biw $$1) {
      clj $$2 = $$0.b($$1);
      if ($$2.a(aro.aF)) {
         aqq $$3 = $$2.a(clm.tR) ? aqr.hX : aqr.im;
         this.dN().a($$0, this.ds(), this.du(), this.dy(), $$3, this.dc(), 1.0F, this.ag.i() * 0.4F + 0.8F);
         if (!this.dN().B) {
            this.gf();
            if (!$$2.i()) {
               $$2.h(1);
            } else {
               $$2.a(1, $$0, $$1x -> $$1x.d($$1));
            }
         }

         return bix.a(this.dN().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   private void gi() {
      if (!this.dN().B) {
         float $$0 = this.a() ? 2.0F : 1.0F;
         this.ba = true;
         this.dN().a(this, this.ds(), this.du(), this.dy(), (float)this.bV * $$0, csa.a.c);
         this.am();
         this.gj();
      }
   }

   private void gj() {
      Collection<bkd> $$0 = this.et();
      if (!$$0.isEmpty()) {
         bkn $$1 = new bkn(this.dN(), this.ds(), this.du(), this.dy());
         $$1.a(2.5F);
         $$1.b(-0.5F);
         $$1.d(10);
         $$1.b($$1.m() / 2);
         $$1.c(-$$1.h() / (float)$$1.m());

         for (bkd $$2 : $$0) {
            $$1.a(new bkd($$2));
         }

         this.dN().b($$1);
      }
   }

   public boolean A() {
      return this.an.b(d);
   }

   public void gf() {
      this.an.b(d, true);
   }

   public boolean gg() {
      return this.a() && this.bW < 1;
   }

   public void gh() {
      this.bW++;
   }
}
