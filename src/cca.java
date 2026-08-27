import java.util.Collection;
import javax.annotation.Nullable;

public class cca extends cco implements bmx {
   private static final agm<Integer> b = agp.a(cca.class, ago.b);
   private static final agm<Boolean> c = agp.a(cca.class, ago.k);
   private static final agm<Boolean> d = agp.a(cca.class, ago.k);
   private int e;
   private int bT;
   private int bU = 30;
   private int bV = 3;
   private int bW;

   public cca(bly<? extends cca> $$0, cto $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      this.bO.a(1, new bta(this));
      this.bO.a(2, new bun(this));
      this.bO.a(3, new bsn<>(this, byl.class, 6.0F, 1.0, 1.2));
      this.bO.a(3, new bsn<>(this, bya.class, 6.0F, 1.0, 1.2));
      this.bO.a(4, new btq(this, 1.0, false));
      this.bO.a(5, new but(this, 0.8));
      this.bO.a(6, new bto(this, cfh.class, 8.0F));
      this.bO.a(6, new bub(this));
      this.bP.a(1, new buz<>(this, cfh.class, true));
      this.bP.a(2, new buy(this));
   }

   public static bnp.a u() {
      return cco.gk().a(bnq.m, 0.25);
   }

   @Override
   public int cu() {
      return this.q() == null ? 3 : 3 + (int)(this.ev() - 1.0F);
   }

   @Override
   public boolean a(float $$0, float $$1, bks $$2) {
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
   public void b(sn $$0) {
      super.b($$0);
      if (this.an.b(c)) {
         $$0.a("powered", true);
      }

      $$0.a("Fuse", (short)this.bU);
      $$0.a("ExplosionRadius", (byte)this.bV);
      $$0.a("ignited", this.A());
   }

   @Override
   public void a(sn $$0) {
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
            this.a(arr.fH, 1.0F, 0.5F);
            this.a(dnq.I);
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
   public void h(@Nullable bmk $$0) {
      if (!($$0 instanceof bzs)) {
         super.h($$0);
      }
   }

   @Override
   protected arq d(bks $$0) {
      return arr.fG;
   }

   @Override
   protected arq n_() {
      return arr.fF;
   }

   @Override
   protected void a(bks $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      blu $$3 = $$0.d();
      if ($$3 != this && $$3 instanceof cca $$4 && $$4.gf()) {
         $$4.gg();
         this.a(cna.ui);
      }
   }

   @Override
   public boolean C(blu $$0) {
      return true;
   }

   @Override
   public boolean a() {
      return this.an.b(c);
   }

   public float E(float $$0) {
      return aun.i($$0, (float)this.e, (float)this.bT) / (float)(this.bU - 2);
   }

   public int w() {
      return this.an.b(b);
   }

   public void b(int $$0) {
      this.an.b(b, $$0);
   }

   @Override
   public void a(and $$0, bmj $$1) {
      super.a($$0, $$1);
      this.an.b(c, true);
   }

   @Override
   protected bka b(cfh $$0, bjz $$1) {
      cmx $$2 = $$0.b($$1);
      if ($$2.a(aso.aF)) {
         arq $$3 = $$2.a(cna.tS) ? arr.ig : arr.iv;
         this.dM().a($$0, this.dr(), this.dt(), this.dx(), $$3, this.db(), 1.0F, this.ag.i() * 0.4F + 0.8F);
         if (!this.dM().B) {
            this.ge();
            if (!$$2.i()) {
               $$2.h(1);
            } else {
               $$2.a(1, $$0, $$1x -> $$1x.d($$1));
            }
         }

         return bka.a(this.dM().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   private void gh() {
      if (!this.dM().B) {
         float $$0 = this.a() ? 2.0F : 1.0F;
         this.ba = true;
         this.dM().a(this, this.dr(), this.dt(), this.dx(), (float)this.bV * $$0, cto.a.c);
         this.am();
         this.gi();
      }
   }

   private void gi() {
      Collection<blh> $$0 = this.es();
      if (!$$0.isEmpty()) {
         blr $$1 = new blr(this.dM(), this.dr(), this.dt(), this.dx());
         $$1.a(2.5F);
         $$1.b(-0.5F);
         $$1.d(10);
         $$1.b($$1.m() / 2);
         $$1.c(-$$1.h() / (float)$$1.m());

         for (blh $$2 : $$0) {
            $$1.a(new blh($$2));
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
