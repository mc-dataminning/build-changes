import java.util.Collection;
import javax.annotation.Nullable;

public class cam extends cba implements bll {
   private static final afm<Integer> b = afp.a(cam.class, afo.b);
   private static final afm<Boolean> c = afp.a(cam.class, afo.k);
   private static final afm<Boolean> d = afp.a(cam.class, afo.k);
   private int e;
   private int bT;
   private int bU = 30;
   private int bV = 3;
   private int bW;

   public cam(bkm<? extends cam> $$0, crs $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.bO.a(1, new brn(this));
      this.bO.a(2, new bta(this));
      this.bO.a(3, new bra<>(this, bwx.class, 6.0F, 1.0, 1.2));
      this.bO.a(3, new bra<>(this, bwm.class, 6.0F, 1.0, 1.2));
      this.bO.a(4, new bsd(this, 1.0, false));
      this.bO.a(5, new btg(this, 0.8));
      this.bO.a(6, new bsb(this, cdm.class, 8.0F));
      this.bO.a(6, new bso(this));
      this.bP.a(1, new btm<>(this, cdm.class, true));
      this.bP.a(2, new btl(this));
   }

   public static bmd.a s() {
      return cba.gk().a(bme.m, 0.25);
   }

   @Override
   public int ct() {
      return this.q() == null ? 3 : 3 + (int)(this.eu() - 1.0F);
   }

   @Override
   public boolean a(float $$0, float $$1, bjg $$2) {
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
      $$0.a("ignited", this.y());
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
         this.ge();
      }
   }

   @Override
   public void l() {
      if (this.bv()) {
         this.e = this.bT;
         if (this.y()) {
            this.b(1);
         }

         int $$0 = this.t();
         if ($$0 > 0 && this.bT == 0) {
            this.a(aqn.fi, 1.0F, 0.5F);
            this.a(dlg.I);
         }

         this.bT += $$0;
         if (this.bT < 0) {
            this.bT = 0;
         }

         if (this.bT >= this.bU) {
            this.bT = this.bU;
            this.gh();
         }
      }

      super.l();
   }

   @Override
   public void h(@Nullable bky $$0) {
      if (!($$0 instanceof bye)) {
         super.h($$0);
      }
   }

   @Override
   protected aqm d(bjg $$0) {
      return aqn.fh;
   }

   @Override
   protected aqm m_() {
      return aqn.fg;
   }

   @Override
   protected void a(bjg $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      bki $$3 = $$0.d();
      if ($$3 != this && $$3 instanceof cam $$4 && $$4.gf()) {
         $$4.gg();
         this.a(cle.tw);
      }
   }

   @Override
   public boolean C(bki $$0) {
      return true;
   }

   @Override
   public boolean a() {
      return this.an.b(c);
   }

   public float E(float $$0) {
      return ati.i($$0, (float)this.e, (float)this.bT) / (float)(this.bU - 2);
   }

   public int t() {
      return this.an.b(b);
   }

   public void b(int $$0) {
      this.an.b(b, $$0);
   }

   @Override
   public void a(ama $$0, bkx $$1) {
      super.a($$0, $$1);
      this.an.b(c, true);
   }

   @Override
   protected biq b(cdm $$0, bip $$1) {
      clb $$2 = $$0.b($$1);
      if ($$2.a(ark.aF)) {
         aqm $$3 = $$2.a(cle.tg) ? aqn.hH : aqn.hW;
         this.dL().a($$0, this.dq(), this.ds(), this.dw(), $$3, this.da(), 1.0F, this.ag.i() * 0.4F + 0.8F);
         if (!this.dL().B) {
            this.ge();
            if (!$$2.i()) {
               $$2.h(1);
            } else {
               $$2.a(1, $$0, $$1x -> $$1x.d($$1));
            }
         }

         return biq.a(this.dL().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   private void gh() {
      if (!this.dL().B) {
         float $$0 = this.a() ? 2.0F : 1.0F;
         this.ba = true;
         this.dL().a(this, this.dq(), this.ds(), this.dw(), (float)this.bV * $$0, crs.a.c);
         this.ak();
         this.gi();
      }
   }

   private void gi() {
      Collection<bjv> $$0 = this.er();
      if (!$$0.isEmpty()) {
         bkf $$1 = new bkf(this.dL(), this.dq(), this.ds(), this.dw());
         $$1.a(2.5F);
         $$1.b(-0.5F);
         $$1.d(10);
         $$1.b($$1.m() / 2);
         $$1.c(-$$1.h() / (float)$$1.m());

         for (bjv $$2 : $$0) {
            $$1.a(new bjv($$2));
         }

         this.dL().b($$1);
      }
   }

   public boolean y() {
      return this.an.b(d);
   }

   public void ge() {
      this.an.b(d, true);
   }

   public boolean gf() {
      return this.a() && this.bW < 1;
   }

   public void gg() {
      this.bW++;
   }
}
