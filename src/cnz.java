import java.util.Collection;
import javax.annotation.Nullable;

public class cnz extends coo {
   private static final akj<Integer> a = akn.a(cnz.class, akl.b);
   private static final akj<Boolean> b = akn.a(cnz.class, akl.k);
   private static final akj<Boolean> c = akn.a(cnz.class, akl.k);
   private int d;
   private int bG;
   private int bH = 30;
   private int bI = 3;
   private int bJ;

   public cnz(bwr<? extends cnz> $$0, djm $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      this.bD.a(1, new cdz(this));
      this.bD.a(2, new cfm(this));
      this.bD.a(3, new cdm<>(this, cjr.class, 6.0F, 1.0, 1.2));
      this.bD.a(3, new cdm<>(this, cjc.class, 6.0F, 1.0, 1.2));
      this.bD.a(4, new cep(this, 1.0, false));
      this.bD.a(5, new cfs(this, 0.8));
      this.bD.a(6, new cen(this, crm.class, 8.0F));
      this.bD.a(6, new cfa(this));
      this.bE.a(1, new cfy<>(this, crm.class, true));
      this.bE.a(2, new cfx(this));
   }

   public static byo.a j() {
      return coo.gw().a(byp.v, 0.25);
   }

   @Override
   public int cD() {
      return this.f() == null ? this.y(0.0F) : this.y(this.eF() - 1.0F);
   }

   @Override
   public boolean a(double $$0, float $$1, bux $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      this.bG += (int)($$0 * 1.5);
      if (this.bG > this.bH - 5) {
         this.bG = this.bH - 5;
      }

      return $$3;
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(a, -1);
      $$0.a(b, false);
      $$0.a(c, false);
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      if (this.al.a(b)) {
         $$0.a("powered", true);
      }

      $$0.a("Fuse", (short)this.bH);
      $$0.a("ExplosionRadius", (byte)this.bI);
      $$0.a("ignited", this.q());
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      this.al.a(b, $$0.o("powered"));
      if ($$0.b("Fuse", 99)) {
         this.bH = $$0.e("Fuse");
      }

      if ($$0.b("ExplosionRadius", 99)) {
         this.bI = $$0.d("ExplosionRadius");
      }

      if ($$0.o("ignited")) {
         this.t();
      }
   }

   @Override
   public void h() {
      if (this.bI()) {
         this.d = this.bG;
         if (this.q()) {
            this.b(1);
         }

         int $$0 = this.n();
         if ($$0 > 0 && this.bG == 0) {
            this.a(awn.gH, 1.0F, 0.5F);
            this.a(eft.I);
         }

         this.bG += $$0;
         if (this.bG < 0) {
            this.bG = 0;
         }

         if (this.bG >= this.bH) {
            this.bG = this.bH;
            this.gu();
         }
      }

      super.h();
   }

   @Override
   public void g(@Nullable bxj $$0) {
      if (!($$0 instanceof cle)) {
         super.g($$0);
      }
   }

   @Override
   protected awm e(bux $$0) {
      return awn.gG;
   }

   @Override
   protected awm l_() {
      return awn.gF;
   }

   @Override
   protected void a(arq $$0, bux $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      bwi $$3 = $$1.d();
      if ($$3 != this && $$3 instanceof cnz $$4 && $$4.x()) {
         $$4.gt();
         this.a($$0, czr.vz);
      }
   }

   @Override
   public boolean c(arq $$0, bwi $$1) {
      return true;
   }

   public boolean m() {
      return this.al.a(b);
   }

   public float J(float $$0) {
      return azm.h($$0, (float)this.d, (float)this.bG) / (float)(this.bH - 2);
   }

   public int n() {
      return this.al.a(a);
   }

   public void b(int $$0) {
      this.al.a(a, $$0);
   }

   @Override
   public void a(arq $$0, bxi $$1) {
      super.a($$0, $$1);
      this.al.a(b, true);
   }

   @Override
   protected bug b(crm $$0, buf $$1) {
      czn $$2 = $$0.b($$1);
      if ($$2.a(axk.bw)) {
         awm $$3 = $$2.a(czr.vg) ? awn.jn : awn.jD;
         this.dU().a($$0, this.dz(), this.dB(), this.dF(), $$3, this.dl(), 1.0F, this.ae.i() * 0.4F + 0.8F);
         if (!this.dU().C) {
            this.t();
            if (!$$2.m()) {
               $$2.h(1);
            } else {
               $$2.a(1, $$0, d($$1));
            }
         }

         return bug.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   private void gu() {
      if (this.dU() instanceof arq $$0) {
         float $$1 = this.m() ? 2.0F : 1.0F;
         this.bc = true;
         $$0.a(this, this.dz(), this.dB(), this.dF(), (float)this.bI * $$1, djm.a.c);
         this.gx();
         this.a($$0, bwi.d.a);
         this.aq();
      }
   }

   private void gx() {
      Collection<bvm> $$0 = this.eC();
      if (!$$0.isEmpty()) {
         bwa $$1 = new bwa(this.dU(), this.dz(), this.dB(), this.dF());
         $$1.a(2.5F);
         $$1.c(-0.5F);
         $$1.c(10);
         $$1.a($$1.i() / 2);
         $$1.b(0.25F);
         $$1.d(-$$1.e() / (float)$$1.i());

         for (bvm $$2 : $$0) {
            $$1.a(new bvm($$2));
         }

         this.dU().b($$1);
      }
   }

   public boolean q() {
      return this.al.a(c);
   }

   public void t() {
      this.al.a(c, true);
   }

   public boolean x() {
      return this.m() && this.bJ < 1;
   }

   public void gt() {
      this.bJ++;
   }
}
