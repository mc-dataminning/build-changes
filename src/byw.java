import java.util.Collection;
import javax.annotation.Nullable;

public class byw extends bzk implements bjv {
   private static final aeg<Integer> b = aej.a(byw.class, aei.b);
   private static final aeg<Boolean> c = aej.a(byw.class, aei.k);
   private static final aeg<Boolean> d = aej.a(byw.class, aei.k);
   private int e;
   private int bT;
   private int bU = 30;
   private int bV = 3;
   private int bW;

   public byw(biw<? extends byw> $$0, cpx $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.bO.a(1, new bpx(this));
      this.bO.a(2, new brk(this));
      this.bO.a(3, new bpk<>(this, bvh.class, 6.0F, 1.0, 1.2));
      this.bO.a(3, new bpk<>(this, buw.class, 6.0F, 1.0, 1.2));
      this.bO.a(4, new bqn(this, 1.0, false));
      this.bO.a(5, new brq(this, 0.8));
      this.bO.a(6, new bql(this, cbw.class, 8.0F));
      this.bO.a(6, new bqy(this));
      this.bP.a(1, new brw<>(this, cbw.class, true));
      this.bP.a(2, new brv(this));
   }

   public static bkn.a s() {
      return bzk.gj().a(bko.d, 0.25);
   }

   @Override
   public int ct() {
      return this.q() == null ? 3 : 3 + (int)(this.eu() - 1.0F);
   }

   @Override
   public boolean a(float $$0, float $$1, bhq $$2) {
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
   public void b(qy $$0) {
      super.b($$0);
      if (this.an.b(c)) {
         $$0.a("powered", true);
      }

      $$0.a("Fuse", (short)this.bU);
      $$0.a("ExplosionRadius", (byte)this.bV);
      $$0.a("ignited", this.y());
   }

   @Override
   public void a(qy $$0) {
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
      if (this.bv()) {
         this.e = this.bT;
         if (this.y()) {
            this.b(1);
         }

         int $$0 = this.t();
         if ($$0 > 0 && this.bT == 0) {
            this.a(apf.fg, 1.0F, 0.5F);
            this.a(djv.I);
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
   public void h(@Nullable bji $$0) {
      if (!($$0 instanceof bwo)) {
         super.h($$0);
      }
   }

   @Override
   protected ape d(bhq $$0) {
      return apf.ff;
   }

   @Override
   protected ape l_() {
      return apf.fe;
   }

   @Override
   protected void a(bhq $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      bis $$3 = $$0.d();
      if ($$3 != this && $$3 instanceof byw $$4 && $$4.ge()) {
         $$4.gf();
         this.a(cjk.tv);
      }
   }

   @Override
   public boolean C(bis $$0) {
      return true;
   }

   @Override
   public boolean a() {
      return this.an.b(c);
   }

   public float E(float $$0) {
      return ary.i($$0, (float)this.e, (float)this.bT) / (float)(this.bU - 2);
   }

   public int t() {
      return this.an.b(b);
   }

   public void b(int $$0) {
      this.an.b(b, $$0);
   }

   @Override
   public void a(aks $$0, bjh $$1) {
      super.a($$0, $$1);
      this.an.b(c, true);
   }

   @Override
   protected bha b(cbw $$0, bgz $$1) {
      cjh $$2 = $$0.b($$1);
      if ($$2.a(aqc.aF)) {
         ape $$3 = $$2.a(cjk.tf) ? apf.hD : apf.hS;
         this.dL().a($$0, this.dq(), this.ds(), this.dw(), $$3, this.da(), 1.0F, this.ag.i() * 0.4F + 0.8F);
         if (!this.dL().B) {
            this.gd();
            if (!$$2.i()) {
               $$2.h(1);
            } else {
               $$2.a(1, $$0, $$1x -> $$1x.d($$1));
            }
         }

         return bha.a(this.dL().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   private void gg() {
      if (!this.dL().B) {
         float $$0 = this.a() ? 2.0F : 1.0F;
         this.ba = true;
         this.dL().a(this, this.dq(), this.ds(), this.dw(), (float)this.bV * $$0, cpx.a.c);
         this.ak();
         this.gh();
      }
   }

   private void gh() {
      Collection<bif> $$0 = this.er();
      if (!$$0.isEmpty()) {
         bip $$1 = new bip(this.dL(), this.dq(), this.ds(), this.dw());
         $$1.a(2.5F);
         $$1.b(-0.5F);
         $$1.d(10);
         $$1.b($$1.m() / 2);
         $$1.c(-$$1.h() / (float)$$1.m());

         for (bif $$2 : $$0) {
            $$1.a(new bif($$2));
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
