import java.util.Collection;
import javax.annotation.Nullable;

public class byu extends bzi implements bjt {
   private static final aef<Integer> b = aei.a(byu.class, aeh.b);
   private static final aef<Boolean> c = aei.a(byu.class, aeh.k);
   private static final aef<Boolean> d = aei.a(byu.class, aeh.k);
   private int e;
   private int bT;
   private int bU = 30;
   private int bV = 3;
   private int bW;

   public byu(biu<? extends byu> $$0, cpv $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.bO.a(1, new bpv(this));
      this.bO.a(2, new bri(this));
      this.bO.a(3, new bpi<>(this, bvf.class, 6.0F, 1.0, 1.2));
      this.bO.a(3, new bpi<>(this, buu.class, 6.0F, 1.0, 1.2));
      this.bO.a(4, new bql(this, 1.0, false));
      this.bO.a(5, new bro(this, 0.8));
      this.bO.a(6, new bqj(this, cbu.class, 8.0F));
      this.bO.a(6, new bqw(this));
      this.bP.a(1, new bru<>(this, cbu.class, true));
      this.bP.a(2, new brt(this));
   }

   public static bkl.a s() {
      return bzi.gj().a(bkm.d, 0.25);
   }

   @Override
   public int cu() {
      return this.q() == null ? 3 : 3 + (int)(this.eu() - 1.0F);
   }

   @Override
   public boolean a(float $$0, float $$1, bho $$2) {
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
   public void b(qx $$0) {
      super.b($$0);
      if (this.an.b(c)) {
         $$0.a("powered", true);
      }

      $$0.a("Fuse", (short)this.bU);
      $$0.a("ExplosionRadius", (byte)this.bV);
      $$0.a("ignited", this.y());
   }

   @Override
   public void a(qx $$0) {
      super.a($$0);
      this.an.b(c, $$0.q("powered"));
      if ($$0.b("Fuse", 99)) {
         this.bU = $$0.g("Fuse");
      }

      if ($$0.b("ExplosionRadius", 99)) {
         this.bV = $$0.f("ExplosionRadius");
      }

      if ($$0.q("ignited")) {
         this.gd();
      }
   }

   @Override
   public void l() {
      if (this.bw()) {
         this.e = this.bT;
         if (this.y()) {
            this.b(1);
         }

         int $$0 = this.t();
         if ($$0 > 0 && this.bT == 0) {
            this.a(ape.fg, 1.0F, 0.5F);
            this.a(djt.I);
         }

         this.bT += $$0;
         if (this.bT < 0) {
            this.bT = 0;
         }

         if (this.bT >= this.bU) {
            this.bT = this.bU;
            this.gg();
         }
      }

      super.l();
   }

   @Override
   public void h(@Nullable bjg $$0) {
      if (!($$0 instanceof bwm)) {
         super.h($$0);
      }
   }

   @Override
   protected apd d(bho $$0) {
      return ape.ff;
   }

   @Override
   protected apd l_() {
      return ape.fe;
   }

   @Override
   protected void a(bho $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      biq $$3 = $$0.d();
      if ($$3 != this && $$3 instanceof byu $$4 && $$4.ge()) {
         $$4.gf();
         this.a(cji.tv);
      }
   }

   @Override
   public boolean C(biq $$0) {
      return true;
   }

   @Override
   public boolean a() {
      return this.an.b(c);
   }

   public float E(float $$0) {
      return arx.i($$0, (float)this.e, (float)this.bT) / (float)(this.bU - 2);
   }

   public int t() {
      return this.an.b(b);
   }

   public void b(int $$0) {
      this.an.b(b, $$0);
   }

   @Override
   public void a(akr $$0, bjf $$1) {
      super.a($$0, $$1);
      this.an.b(c, true);
   }

   @Override
   protected bgy b(cbu $$0, bgx $$1) {
      cjf $$2 = $$0.b($$1);
      if ($$2.a(aqb.aF)) {
         apd $$3 = $$2.a(cji.tf) ? ape.hD : ape.hS;
         this.dL().a($$0, this.dq(), this.ds(), this.dw(), $$3, this.db(), 1.0F, this.ag.i() * 0.4F + 0.8F);
         if (!this.dL().B) {
            this.gd();
            if (!$$2.i()) {
               $$2.h(1);
            } else {
               $$2.a(1, $$0, $$1x -> $$1x.d($$1));
            }
         }

         return bgy.a(this.dL().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   private void gg() {
      if (!this.dL().B) {
         float $$0 = this.a() ? 2.0F : 1.0F;
         this.ba = true;
         this.dL().a(this, this.dq(), this.ds(), this.dw(), (float)this.bV * $$0, cpv.a.c);
         this.al();
         this.gh();
      }
   }

   private void gh() {
      Collection<bid> $$0 = this.er();
      if (!$$0.isEmpty()) {
         bin $$1 = new bin(this.dL(), this.dq(), this.ds(), this.dw());
         $$1.a(2.5F);
         $$1.b(-0.5F);
         $$1.d(10);
         $$1.b($$1.m() / 2);
         $$1.c(-$$1.h() / (float)$$1.m());

         for (bid $$2 : $$0) {
            $$1.a(new bid($$2));
         }

         this.dL().b($$1);
      }
   }

   public boolean y() {
      return this.an.b(d);
   }

   public void gd() {
      this.an.b(d, true);
   }

   public boolean ge() {
      return this.a() && this.bW < 1;
   }

   public void gf() {
      this.bW++;
   }
}
