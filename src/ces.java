import java.util.Collection;
import javax.annotation.Nullable;

public class ces extends cfg implements bpj {
   private static final aii<Integer> b = ail.a(ces.class, aik.b);
   private static final aii<Boolean> c = ail.a(ces.class, aik.k);
   private static final aii<Boolean> d = ail.a(ces.class, aik.k);
   private int e;
   private int bV;
   private int bW = 30;
   private int bX = 3;
   private int bY;

   public ces(bol<? extends ces> $$0, cwe $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      this.bP.a(1, new bvo(this));
      this.bP.a(2, new bxb(this));
      this.bP.a(3, new bvb<>(this, cba.class, 6.0F, 1.0, 1.2));
      this.bP.a(3, new bvb<>(this, cap.class, 6.0F, 1.0, 1.2));
      this.bP.a(4, new bwe(this, 1.0, false));
      this.bP.a(5, new bxh(this, 0.8));
      this.bP.a(6, new bwc(this, cia.class, 8.0F));
      this.bP.a(6, new bwp(this));
      this.bQ.a(1, new bxn<>(this, cia.class, true));
      this.bQ.a(2, new bxm(this));
   }

   public static bqd.a u() {
      return cfg.gr().a(bqe.o, 0.25);
   }

   @Override
   public int cr() {
      return this.q() == null ? 3 : 3 + (int)(this.eu() - 1.0F);
   }

   @Override
   public boolean a(float $$0, float $$1, bne $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      this.bV += (int)($$0 * 1.5F);
      if (this.bV > this.bW - 5) {
         this.bV = this.bW - 5;
      }

      return $$3;
   }

   @Override
   protected void c_() {
      super.c_();
      this.am.a(b, -1);
      this.am.a(c, false);
      this.am.a(d, false);
   }

   @Override
   public void b(sy $$0) {
      super.b($$0);
      if (this.am.b(c)) {
         $$0.a("powered", true);
      }

      $$0.a("Fuse", (short)this.bW);
      $$0.a("ExplosionRadius", (byte)this.bX);
      $$0.a("ignited", this.A());
   }

   @Override
   public void a(sy $$0) {
      super.a($$0);
      this.am.b(c, $$0.q("powered"));
      if ($$0.b("Fuse", 99)) {
         this.bW = $$0.g("Fuse");
      }

      if ($$0.b("ExplosionRadius", 99)) {
         this.bX = $$0.f("ExplosionRadius");
      }

      if ($$0.q("ignited")) {
         this.gl();
      }
   }

   @Override
   public void l() {
      if (this.bx()) {
         this.e = this.bV;
         if (this.A()) {
            this.b(1);
         }

         int $$0 = this.w();
         if ($$0 > 0 && this.bV == 0) {
            this.a(atp.fX, 1.0F, 0.5F);
            this.b(dqr.I);
         }

         this.bV += $$0;
         if (this.bV < 0) {
            this.bV = 0;
         }

         if (this.bV >= this.bW) {
            this.bV = this.bW;
            this.go();
         }
      }

      super.l();
   }

   @Override
   public void h(@Nullable box $$0) {
      if (!($$0 instanceof cck)) {
         super.h($$0);
      }
   }

   @Override
   protected ato d(bne $$0) {
      return atp.fW;
   }

   @Override
   protected ato n_() {
      return atp.fV;
   }

   @Override
   protected void a(bne $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      bof $$3 = $$0.d();
      if ($$3 != this && $$3 instanceof ces $$4 && $$4.gm()) {
         $$4.gn();
         this.a(cpt.ul);
      }
   }

   @Override
   public boolean B(bof $$0) {
      return true;
   }

   @Override
   public boolean a() {
      return this.am.b(c);
   }

   public float E(float $$0) {
      return awm.i($$0, (float)this.e, (float)this.bV) / (float)(this.bW - 2);
   }

   public int w() {
      return this.am.b(b);
   }

   public void b(int $$0) {
      this.am.b(b, $$0);
   }

   @Override
   public void a(apa $$0, bow $$1) {
      super.a($$0, $$1);
      this.am.b(c, true);
   }

   @Override
   protected bml b(cia $$0, bmk $$1) {
      cpq $$2 = $$0.b($$1);
      if ($$2.a(aum.aF)) {
         ato $$3 = $$2.a(cpt.tV) ? atp.iw : atp.iL;
         this.dJ().a($$0, this.do(), this.dq(), this.du(), $$3, this.cY(), 1.0F, this.af.i() * 0.4F + 0.8F);
         if (!this.dJ().B) {
            this.gl();
            if (!$$2.i()) {
               $$2.h(1);
            } else {
               $$2.a(1, $$0, d($$1));
            }
         }

         return bml.a(this.dJ().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   private void go() {
      if (!this.dJ().B) {
         float $$0 = this.a() ? 2.0F : 1.0F;
         this.bb = true;
         this.dJ().a(this, this.do(), this.dq(), this.du(), (float)this.bX * $$0, cwe.a.c);
         this.am();
         this.gp();
      }
   }

   private void gp() {
      Collection<bns> $$0 = this.er();
      if (!$$0.isEmpty()) {
         boc $$1 = new boc(this.dJ(), this.do(), this.dq(), this.du());
         $$1.a(2.5F);
         $$1.b(-0.5F);
         $$1.d(10);
         $$1.b($$1.m() / 2);
         $$1.c(-$$1.h() / (float)$$1.m());

         for (bns $$2 : $$0) {
            $$1.a(new bns($$2));
         }

         this.dJ().b($$1);
      }
   }

   public boolean A() {
      return this.am.b(d);
   }

   public void gl() {
      this.am.b(d, true);
   }

   public boolean gm() {
      return this.a() && this.bY < 1;
   }

   public void gn() {
      this.bY++;
   }
}
