import java.util.Collection;
import javax.annotation.Nullable;

public class byn extends bzb implements bjl {
   private static final adz<Integer> b = aec.a(byn.class, aeb.b);
   private static final adz<Boolean> c = aec.a(byn.class, aeb.k);
   private static final adz<Boolean> d = aec.a(byn.class, aeb.k);
   private int e;
   private int bT;
   private int bU = 30;
   private int bV = 3;
   private int bW;

   public byn(bim<? extends byn> $$0, cpm $$1) {
      super($$0, $$1);
   }

   @Override
   protected void w() {
      this.bO.a(1, new bpo(this));
      this.bO.a(2, new brb(this));
      this.bO.a(3, new bpb<>(this, buy.class, 6.0F, 1.0, 1.2));
      this.bO.a(3, new bpb<>(this, bun.class, 6.0F, 1.0, 1.2));
      this.bO.a(4, new bqe(this, 1.0, false));
      this.bO.a(5, new brh(this, 0.8));
      this.bO.a(6, new bqc(this, cbn.class, 8.0F));
      this.bO.a(6, new bqp(this));
      this.bP.a(1, new brn<>(this, cbn.class, true));
      this.bP.a(2, new brm(this));
   }

   public static bke.a p() {
      return bzb.gf().a(bkf.d, 0.25);
   }

   @Override
   public int ct() {
      return this.j() == null ? 3 : 3 + (int)(this.et() - 1.0F);
   }

   @Override
   public boolean a(float $$0, float $$1, bhg $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      this.bT += (int)($$0 * 1.5F);
      if (this.bT > this.bU - 5) {
         this.bT = this.bU - 5;
      }

      return $$3;
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(b, -1);
      this.an.a(c, false);
      this.an.a(d, false);
   }

   @Override
   public void b(qr $$0) {
      super.b($$0);
      if (this.an.b(c)) {
         $$0.a("powered", true);
      }

      $$0.a("Fuse", (short)this.bU);
      $$0.a("ExplosionRadius", (byte)this.bV);
      $$0.a("ignited", this.t());
   }

   @Override
   public void a(qr $$0) {
      super.a($$0);
      this.an.b(c, $$0.q("powered"));
      if ($$0.b("Fuse", 99)) {
         this.bU = $$0.g("Fuse");
      }

      if ($$0.b("ExplosionRadius", 99)) {
         this.bV = $$0.f("ExplosionRadius");
      }

      if ($$0.q("ignited")) {
         this.fZ();
      }
   }

   @Override
   public void l() {
      if (this.bv()) {
         this.e = this.bT;
         if (this.t()) {
            this.b(1);
         }

         int $$0 = this.q();
         if ($$0 > 0 && this.bT == 0) {
            this.a(aow.fg, 1.0F, 0.5F);
            this.a(djk.I);
         }

         this.bT += $$0;
         if (this.bT < 0) {
            this.bT = 0;
         }

         if (this.bT >= this.bU) {
            this.bT = this.bU;
            this.gc();
         }
      }

      super.l();
   }

   @Override
   public void h(@Nullable biy $$0) {
      if (!($$0 instanceof bwf)) {
         super.h($$0);
      }
   }

   @Override
   protected aov d(bhg $$0) {
      return aow.ff;
   }

   @Override
   protected aov h_() {
      return aow.fe;
   }

   @Override
   protected void a(bhg $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      bii $$3 = $$0.d();
      if ($$3 != this && $$3 instanceof byn $$4 && $$4.ga()) {
         $$4.gb();
         this.a(cjb.tv);
      }
   }

   @Override
   public boolean C(bii $$0) {
      return true;
   }

   @Override
   public boolean a() {
      return this.an.b(c);
   }

   public float E(float $$0) {
      return arp.i($$0, (float)this.e, (float)this.bT) / (float)(this.bU - 2);
   }

   public int q() {
      return this.an.b(b);
   }

   public void b(int $$0) {
      this.an.b(b, $$0);
   }

   @Override
   public void a(akk $$0, bix $$1) {
      super.a($$0, $$1);
      this.an.b(c, true);
   }

   @Override
   protected bgq b(cbn $$0, bgp $$1) {
      ciy $$2 = $$0.b($$1);
      if ($$2.a(apt.aF)) {
         aov $$3 = $$2.a(cjb.tf) ? aow.hD : aow.hS;
         this.dK().a($$0, this.dp(), this.dr(), this.dv(), $$3, this.da(), 1.0F, this.ag.i() * 0.4F + 0.8F);
         if (!this.dK().B) {
            this.fZ();
            if (!$$2.i()) {
               $$2.h(1);
            } else {
               $$2.a(1, $$0, $$1x -> $$1x.d($$1));
            }
         }

         return bgq.a(this.dK().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   private void gc() {
      if (!this.dK().B) {
         float $$0 = this.a() ? 2.0F : 1.0F;
         this.ba = true;
         this.dK().a(this, this.dp(), this.dr(), this.dv(), (float)this.bV * $$0, cpm.a.c);
         this.ak();
         this.gd();
      }
   }

   private void gd() {
      Collection<bhv> $$0 = this.eq();
      if (!$$0.isEmpty()) {
         bif $$1 = new bif(this.dK(), this.dp(), this.dr(), this.dv());
         $$1.a(2.5F);
         $$1.b(-0.5F);
         $$1.d(10);
         $$1.b($$1.m() / 2);
         $$1.c(-$$1.h() / (float)$$1.m());

         for (bhv $$2 : $$0) {
            $$1.a(new bhv($$2));
         }

         this.dK().b($$1);
      }
   }

   public boolean t() {
      return this.an.b(d);
   }

   public void fZ() {
      this.an.b(d, true);
   }

   public boolean ga() {
      return this.a() && this.bW < 1;
   }

   public void gb() {
      this.bW++;
   }
}
