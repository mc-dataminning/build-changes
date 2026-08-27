import java.util.Collection;
import javax.annotation.Nullable;

public class cbv extends ccj implements bms {
   private static final agj<Integer> b = agm.a(cbv.class, agl.b);
   private static final agj<Boolean> c = agm.a(cbv.class, agl.k);
   private static final agj<Boolean> d = agm.a(cbv.class, agl.k);
   private int e;
   private int bT;
   private int bU = 30;
   private int bV = 3;
   private int bW;

   public cbv(blt<? extends cbv> $$0, cti $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      this.bO.a(1, new bsv(this));
      this.bO.a(2, new bui(this));
      this.bO.a(3, new bsi<>(this, byg.class, 6.0F, 1.0, 1.2));
      this.bO.a(3, new bsi<>(this, bxv.class, 6.0F, 1.0, 1.2));
      this.bO.a(4, new btl(this, 1.0, false));
      this.bO.a(5, new buo(this, 0.8));
      this.bO.a(6, new btj(this, cfb.class, 8.0F));
      this.bO.a(6, new btw(this));
      this.bP.a(1, new buu<>(this, cfb.class, true));
      this.bP.a(2, new but(this));
   }

   public static bnk.a u() {
      return ccj.gk().a(bnl.m, 0.25);
   }

   @Override
   public int cu() {
      return this.q() == null ? 3 : 3 + (int)(this.ev() - 1.0F);
   }

   @Override
   public boolean a(float $$0, float $$1, bkn $$2) {
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
      this.an.a(b, -1);
      this.an.a(c, false);
      this.an.a(d, false);
   }

   @Override
   public void b(sl $$0) {
      super.b($$0);
      if (this.an.b(c)) {
         $$0.a("powered", true);
      }

      $$0.a("Fuse", (short)this.bU);
      $$0.a("ExplosionRadius", (byte)this.bV);
      $$0.a("ignited", this.A());
   }

   @Override
   public void a(sl $$0) {
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
      if (this.bx()) {
         this.e = this.bT;
         if (this.A()) {
            this.b(1);
         }

         int $$0 = this.w();
         if ($$0 > 0 && this.bT == 0) {
            this.a(arm.fH, 1.0F, 0.5F);
            this.a(dnk.I);
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
   public void h(@Nullable bmf $$0) {
      if (!($$0 instanceof bzn)) {
         super.h($$0);
      }
   }

   @Override
   protected arl d(bkn $$0) {
      return arm.fG;
   }

   @Override
   protected arl n_() {
      return arm.fF;
   }

   @Override
   protected void a(bkn $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      blp $$3 = $$0.d();
      if ($$3 != this && $$3 instanceof cbv $$4 && $$4.gf()) {
         $$4.gg();
         this.a(cmu.ui);
      }
   }

   @Override
   public boolean C(blp $$0) {
      return true;
   }

   @Override
   public boolean a() {
      return this.an.b(c);
   }

   public float E(float $$0) {
      return aui.i($$0, (float)this.e, (float)this.bT) / (float)(this.bU - 2);
   }

   public int w() {
      return this.an.b(b);
   }

   public void b(int $$0) {
      this.an.b(b, $$0);
   }

   @Override
   public void a(amz $$0, bme $$1) {
      super.a($$0, $$1);
      this.an.b(c, true);
   }

   @Override
   protected bjv b(cfb $$0, bju $$1) {
      cmr $$2 = $$0.b($$1);
      if ($$2.a(asj.aF)) {
         arl $$3 = $$2.a(cmu.tS) ? arm.ig : arm.iv;
         this.dM().a($$0, this.dr(), this.dt(), this.dx(), $$3, this.db(), 1.0F, this.ag.i() * 0.4F + 0.8F);
         if (!this.dM().B) {
            this.ge();
            if (!$$2.i()) {
               $$2.h(1);
            } else {
               $$2.a(1, $$0, $$1x -> $$1x.d($$1));
            }
         }

         return bjv.a(this.dM().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   private void gh() {
      if (!this.dM().B) {
         float $$0 = this.a() ? 2.0F : 1.0F;
         this.ba = true;
         this.dM().a(this, this.dr(), this.dt(), this.dx(), (float)this.bV * $$0, cti.a.c);
         this.am();
         this.gi();
      }
   }

   private void gi() {
      Collection<blc> $$0 = this.es();
      if (!$$0.isEmpty()) {
         blm $$1 = new blm(this.dM(), this.dr(), this.dt(), this.dx());
         $$1.a(2.5F);
         $$1.b(-0.5F);
         $$1.d(10);
         $$1.b($$1.m() / 2);
         $$1.c(-$$1.h() / (float)$$1.m());

         for (blc $$2 : $$0) {
            $$1.a(new blc($$2));
         }

         this.dM().b($$1);
      }
   }

   public boolean A() {
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
