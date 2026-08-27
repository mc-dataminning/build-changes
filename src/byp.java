import java.util.Collection;
import javax.annotation.Nullable;

public class byp extends bzd implements bjo {
   private static final aec<Integer> b = aef.a(byp.class, aee.b);
   private static final aec<Boolean> c = aef.a(byp.class, aee.k);
   private static final aec<Boolean> d = aef.a(byp.class, aee.k);
   private int e;
   private int bT;
   private int bU = 30;
   private int bV = 3;
   private int bW;

   public byp(bip<? extends byp> $$0, cpq $$1) {
      super($$0, $$1);
   }

   @Override
   protected void w() {
      this.bO.a(1, new bpq(this));
      this.bO.a(2, new brd(this));
      this.bO.a(3, new bpd<>(this, bva.class, 6.0F, 1.0, 1.2));
      this.bO.a(3, new bpd<>(this, bup.class, 6.0F, 1.0, 1.2));
      this.bO.a(4, new bqg(this, 1.0, false));
      this.bO.a(5, new brj(this, 0.8));
      this.bO.a(6, new bqe(this, cbp.class, 8.0F));
      this.bO.a(6, new bqr(this));
      this.bP.a(1, new brp<>(this, cbp.class, true));
      this.bP.a(2, new bro(this));
   }

   public static bkg.a p() {
      return bzd.gg().a(bkh.d, 0.25);
   }

   @Override
   public int ct() {
      return this.j() == null ? 3 : 3 + (int)(this.et() - 1.0F);
   }

   @Override
   public boolean a(float $$0, float $$1, bhj $$2) {
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
   public void b(qu $$0) {
      super.b($$0);
      if (this.an.b(c)) {
         $$0.a("powered", true);
      }

      $$0.a("Fuse", (short)this.bU);
      $$0.a("ExplosionRadius", (byte)this.bV);
      $$0.a("ignited", this.t());
   }

   @Override
   public void a(qu $$0) {
      super.a($$0);
      this.an.b(c, $$0.q("powered"));
      if ($$0.b("Fuse", 99)) {
         this.bU = $$0.g("Fuse");
      }

      if ($$0.b("ExplosionRadius", 99)) {
         this.bV = $$0.f("ExplosionRadius");
      }

      if ($$0.q("ignited")) {
         this.ga();
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
            this.a(aoz.fg, 1.0F, 0.5F);
            this.a(djo.I);
         }

         this.bT += $$0;
         if (this.bT < 0) {
            this.bT = 0;
         }

         if (this.bT >= this.bU) {
            this.bT = this.bU;
            this.gd();
         }
      }

      super.l();
   }

   @Override
   public void h(@Nullable bjb $$0) {
      if (!($$0 instanceof bwh)) {
         super.h($$0);
      }
   }

   @Override
   protected aoy d(bhj $$0) {
      return aoz.ff;
   }

   @Override
   protected aoy h_() {
      return aoz.fe;
   }

   @Override
   protected void a(bhj $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      bil $$3 = $$0.d();
      if ($$3 != this && $$3 instanceof byp $$4 && $$4.gb()) {
         $$4.gc();
         this.a(cjd.tv);
      }
   }

   @Override
   public boolean C(bil $$0) {
      return true;
   }

   @Override
   public boolean a() {
      return this.an.b(c);
   }

   public float E(float $$0) {
      return ars.i($$0, (float)this.e, (float)this.bT) / (float)(this.bU - 2);
   }

   public int q() {
      return this.an.b(b);
   }

   public void b(int $$0) {
      this.an.b(b, $$0);
   }

   @Override
   public void a(akn $$0, bja $$1) {
      super.a($$0, $$1);
      this.an.b(c, true);
   }

   @Override
   protected bgt b(cbp $$0, bgs $$1) {
      cja $$2 = $$0.b($$1);
      if ($$2.a(apw.aF)) {
         aoy $$3 = $$2.a(cjd.tf) ? aoz.hD : aoz.hS;
         this.dK().a($$0, this.dp(), this.dr(), this.dv(), $$3, this.da(), 1.0F, this.ag.i() * 0.4F + 0.8F);
         if (!this.dK().B) {
            this.ga();
            if (!$$2.i()) {
               $$2.h(1);
            } else {
               $$2.a(1, $$0, $$1x -> $$1x.d($$1));
            }
         }

         return bgt.a(this.dK().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   private void gd() {
      if (!this.dK().B) {
         float $$0 = this.a() ? 2.0F : 1.0F;
         this.ba = true;
         this.dK().a(this, this.dp(), this.dr(), this.dv(), (float)this.bV * $$0, cpq.a.c);
         this.ak();
         this.ge();
      }
   }

   private void ge() {
      Collection<bhy> $$0 = this.eq();
      if (!$$0.isEmpty()) {
         bii $$1 = new bii(this.dK(), this.dp(), this.dr(), this.dv());
         $$1.a(2.5F);
         $$1.b(-0.5F);
         $$1.d(10);
         $$1.b($$1.m() / 2);
         $$1.c(-$$1.h() / (float)$$1.m());

         for (bhy $$2 : $$0) {
            $$1.a(new bhy($$2));
         }

         this.dK().b($$1);
      }
   }

   public boolean t() {
      return this.an.b(d);
   }

   public void ga() {
      this.an.b(d, true);
   }

   public boolean gb() {
      return this.a() && this.bW < 1;
   }

   public void gc() {
      this.bW++;
   }
}
