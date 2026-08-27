import java.util.Collection;
import javax.annotation.Nullable;

public class ced extends cer implements bou {
   private static final aie<Integer> b = aih.a(ced.class, aig.b);
   private static final aie<Boolean> c = aih.a(ced.class, aig.k);
   private static final aie<Boolean> d = aih.a(ced.class, aig.k);
   private int e;
   private int bT;
   private int bU = 30;
   private int bV = 3;
   private int bW;

   public ced(bnw<? extends ced> $$0, cvr $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      this.bO.a(1, new buz(this));
      this.bO.a(2, new bwm(this));
      this.bO.a(3, new bum<>(this, cal.class, 6.0F, 1.0, 1.2));
      this.bO.a(3, new bum<>(this, caa.class, 6.0F, 1.0, 1.2));
      this.bO.a(4, new bvp(this, 1.0, false));
      this.bO.a(5, new bws(this, 0.8));
      this.bO.a(6, new bvn(this, chl.class, 8.0F));
      this.bO.a(6, new bwa(this));
      this.bP.a(1, new bwy<>(this, chl.class, true));
      this.bP.a(2, new bwx(this));
   }

   public static bpo.a u() {
      return cer.gm().a(bpp.o, 0.25);
   }

   @Override
   public int cu() {
      return this.q() == null ? 3 : 3 + (int)(this.ew() - 1.0F);
   }

   @Override
   public boolean a(float $$0, float $$1, bmp $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      this.bT += (int)($$0 * 1.5F);
      if (this.bT > this.bU - 5) {
         this.bT = this.bU - 5;
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
   public void b(sw $$0) {
      super.b($$0);
      if (this.am.b(c)) {
         $$0.a("powered", true);
      }

      $$0.a("Fuse", (short)this.bU);
      $$0.a("ExplosionRadius", (byte)this.bV);
      $$0.a("ignited", this.A());
   }

   @Override
   public void a(sw $$0) {
      super.a($$0);
      this.am.b(c, $$0.q("powered"));
      if ($$0.b("Fuse", 99)) {
         this.bU = $$0.g("Fuse");
      }

      if ($$0.b("ExplosionRadius", 99)) {
         this.bV = $$0.f("ExplosionRadius");
      }

      if ($$0.q("ignited")) {
         this.gg();
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
            this.a(atl.fX, 1.0F, 0.5F);
            this.b(dpw.I);
         }

         this.bT += $$0;
         if (this.bT < 0) {
            this.bT = 0;
         }

         if (this.bT >= this.bU) {
            this.bT = this.bU;
            this.gj();
         }
      }

      super.l();
   }

   @Override
   public void h(@Nullable boi $$0) {
      if (!($$0 instanceof cbv)) {
         super.h($$0);
      }
   }

   @Override
   protected atk d(bmp $$0) {
      return atl.fW;
   }

   @Override
   protected atk n_() {
      return atl.fV;
   }

   @Override
   protected void a(bmp $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      bnq $$3 = $$0.d();
      if ($$3 != this && $$3 instanceof ced $$4 && $$4.gh()) {
         $$4.gi();
         this.a(cpg.ul);
      }
   }

   @Override
   public boolean B(bnq $$0) {
      return true;
   }

   @Override
   public boolean a() {
      return this.am.b(c);
   }

   public float E(float $$0) {
      return awi.i($$0, (float)this.e, (float)this.bT) / (float)(this.bU - 2);
   }

   public int w() {
      return this.am.b(b);
   }

   public void b(int $$0) {
      this.am.b(b, $$0);
   }

   @Override
   public void a(aow $$0, boh $$1) {
      super.a($$0, $$1);
      this.am.b(c, true);
   }

   @Override
   protected blw b(chl $$0, blv $$1) {
      cpd $$2 = $$0.b($$1);
      if ($$2.a(aui.aF)) {
         atk $$3 = $$2.a(cpg.tV) ? atl.iw : atl.iL;
         this.dM().a($$0, this.dr(), this.dt(), this.dx(), $$3, this.db(), 1.0F, this.af.i() * 0.4F + 0.8F);
         if (!this.dM().B) {
            this.gg();
            if (!$$2.i()) {
               $$2.h(1);
            } else {
               $$2.a(1, $$0, d($$1));
            }
         }

         return blw.a(this.dM().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   private void gj() {
      if (!this.dM().B) {
         float $$0 = this.a() ? 2.0F : 1.0F;
         this.ba = true;
         this.dM().a(this, this.dr(), this.dt(), this.dx(), (float)this.bV * $$0, cvr.a.c);
         this.am();
         this.gk();
      }
   }

   private void gk() {
      Collection<bnd> $$0 = this.et();
      if (!$$0.isEmpty()) {
         bnn $$1 = new bnn(this.dM(), this.dr(), this.dt(), this.dx());
         $$1.a(2.5F);
         $$1.b(-0.5F);
         $$1.d(10);
         $$1.b($$1.m() / 2);
         $$1.c(-$$1.h() / (float)$$1.m());

         for (bnd $$2 : $$0) {
            $$1.a(new bnd($$2));
         }

         this.dM().b($$1);
      }
   }

   public boolean A() {
      return this.am.b(d);
   }

   public void gg() {
      this.am.b(d, true);
   }

   public boolean gh() {
      return this.a() && this.bW < 1;
   }

   public void gi() {
      this.bW++;
   }
}
