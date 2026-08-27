import java.util.Collection;
import javax.annotation.Nullable;

public class cio extends cjd implements bta {
   private static final ajy<Integer> b = akc.a(cio.class, aka.b);
   private static final ajy<Boolean> c = akc.a(cio.class, aka.k);
   private static final ajy<Boolean> d = akc.a(cio.class, aka.k);
   private int e;
   private int ch;
   private int ci = 30;
   private int cj = 3;
   private int ck;

   public cio(bsb<? extends cio> $$0, dca $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean dW() {
      return true;
   }

   @Override
   protected void y() {
      this.cb.a(1, new bzf(this));
      this.cb.a(2, new cas(this));
      this.cb.a(3, new bys<>(this, ces.class, 6.0F, 1.0, 1.2));
      this.cb.a(3, new bys<>(this, ceh.class, 6.0F, 1.0, 1.2));
      this.cb.a(4, new bzv(this, 1.0, false));
      this.cb.a(5, new cay(this, 0.8));
      this.cb.a(6, new bzt(this, cly.class, 8.0F));
      this.cb.a(6, new cag(this));
      this.cc.a(1, new cbe<>(this, cly.class, true));
      this.cc.a(2, new cbd(this));
   }

   public static btu.a r() {
      return cjd.gG().a(btv.r, 0.25);
   }

   @Override
   public int cC() {
      return this.p() == null ? this.u(0.0F) : this.u(this.eI() - 1.0F);
   }

   @Override
   public boolean a(float $$0, float $$1, bqt $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      this.ch += (int)($$0 * 1.5F);
      if (this.ch > this.ci - 5) {
         this.ch = this.ci - 5;
      }

      return $$3;
   }

   @Override
   protected void a(akc.a $$0) {
      super.a($$0);
      $$0.a(b, -1);
      $$0.a(c, false);
      $$0.a(d, false);
   }

   @Override
   public void b(uk $$0) {
      super.b($$0);
      if (this.as.a(c)) {
         $$0.a("powered", true);
      }

      $$0.a("Fuse", (short)this.ci);
      $$0.a("ExplosionRadius", (byte)this.cj);
      $$0.a("ignited", this.x());
   }

   @Override
   public void a(uk $$0) {
      super.a($$0);
      this.as.a(c, $$0.q("powered"));
      if ($$0.b("Fuse", 99)) {
         this.ci = $$0.g("Fuse");
      }

      if ($$0.b("ExplosionRadius", 99)) {
         this.cj = $$0.f("ExplosionRadius");
      }

      if ($$0.q("ignited")) {
         this.gy();
      }
   }

   @Override
   public void l() {
      if (this.bI()) {
         this.e = this.ch;
         if (this.x()) {
            this.b(1);
         }

         int $$0 = this.t();
         if ($$0 > 0 && this.ch == 0) {
            this.a(avo.gk, 1.0F, 0.5F);
            this.a(dxv.I);
         }

         this.ch += $$0;
         if (this.ch < 0) {
            this.ch = 0;
         }

         if (this.ch >= this.ci) {
            this.ch = this.ci;
            this.gB();
         }
      }

      super.l();
   }

   @Override
   public void h(@Nullable bso $$0) {
      if (!($$0 instanceof cge)) {
         super.h($$0);
      }
   }

   @Override
   protected avn d(bqt $$0) {
      return avo.gj;
   }

   @Override
   protected avn n_() {
      return avo.gi;
   }

   @Override
   protected void a(bqt $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      brv $$3 = $$0.d();
      if ($$3 != this && $$3 instanceof cio $$4 && $$4.gz()) {
         $$4.gA();
         this.a(cuk.wa);
      }
   }

   @Override
   public boolean C(brv $$0) {
      return true;
   }

   @Override
   public boolean a() {
      return this.as.a(c);
   }

   public float G(float $$0) {
      return aym.i($$0, (float)this.e, (float)this.ch) / (float)(this.ci - 2);
   }

   public int t() {
      return this.as.a(b);
   }

   public void b(int $$0) {
      this.as.a(b, $$0);
   }

   @Override
   public void a(aqt $$0, bsn $$1) {
      super.a($$0, $$1);
      this.as.a(c, true);
   }

   @Override
   protected bqa b(cly $$0, bpz $$1) {
      cuh $$2 = $$0.b($$1);
      if ($$2.a(awm.bg)) {
         avn $$3 = $$2.a(cuk.vz) ? avo.iX : avo.jm;
         this.dU().a($$0, this.dz(), this.dB(), this.dF(), $$3, this.dj(), 1.0F, this.al.i() * 0.4F + 0.8F);
         if (!this.dU().C) {
            this.gy();
            if (!$$2.k()) {
               $$2.h(1);
            } else {
               $$2.a(1, $$0, d($$1));
            }
         }

         return bqa.a(this.dU().C);
      } else {
         return super.b($$0, $$1);
      }
   }

   private void gB() {
      if (!this.dU().C) {
         float $$0 = this.a() ? 2.0F : 1.0F;
         this.bp = true;
         this.dU().a(this, this.dz(), this.dB(), this.dF(), (float)this.cj * $$0, dca.a.c);
         this.ao();
         this.gC();
      }
   }

   private void gC() {
      Collection<brh> $$0 = this.eF();
      if (!$$0.isEmpty()) {
         brr $$1 = new brr(this.dU(), this.dz(), this.dB(), this.dF());
         $$1.a(2.5F);
         $$1.b(-0.5F);
         $$1.c(10);
         $$1.a($$1.k() / 2);
         $$1.c(-$$1.g() / (float)$$1.k());

         for (brh $$2 : $$0) {
            $$1.a(new brh($$2));
         }

         this.dU().b($$1);
      }
   }

   public boolean x() {
      return this.as.a(d);
   }

   public void gy() {
      this.as.a(d, true);
   }

   public boolean gz() {
      return this.a() && this.ck < 1;
   }

   public void gA() {
      this.ck++;
   }
}
