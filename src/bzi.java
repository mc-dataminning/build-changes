import com.google.common.annotations.VisibleForTesting;
import java.util.EnumSet;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bzi extends biy implements byr {
   private static final adx<Integer> bT = aea.a(bzi.class, adz.b);
   public static final int b = 1;
   public static final int c = 127;
   public float d;
   public float e;
   public float bS;
   private boolean bU;

   public bzi(bik<? extends bzi> $$0, cpk $$1) {
      super($$0, $$1);
      this.cC();
      this.bL = new bzi.d(this);
   }

   @Override
   protected void w() {
      this.bO.a(1, new bzi.b(this));
      this.bO.a(2, new bzi.a(this));
      this.bO.a(3, new bzi.e(this));
      this.bO.a(5, new bzi.c(this));
      this.bP.a(1, new brl<>(this, cbl.class, 10, true, false, $$0 -> Math.abs($$0.dr() - this.dr()) <= 4.0));
      this.bP.a(3, new brl<>(this, buu.class, true));
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(bT, 1);
   }

   @VisibleForTesting
   public void a(int $$0, boolean $$1) {
      int $$2 = aro.a($$0, 1, 127);
      this.an.b(bT, $$2);
      this.ap();
      this.e_();
      this.a(bkd.a).a((double)($$2 * $$2));
      this.a(bkd.d).a((double)(0.2F + 0.1F * (float)$$2));
      this.a(bkd.f).a((double)$$2);
      if ($$1) {
         this.c(this.eK());
      }

      this.bJ = $$2;
   }

   public int ga() {
      return this.an.b(bT);
   }

   @Override
   public void b(qs $$0) {
      super.b($$0);
      $$0.a("Size", this.ga() - 1);
      $$0.a("wasOnGround", this.bU);
   }

   @Override
   public void a(qs $$0) {
      this.a($$0.h("Size") + 1, false);
      super.a($$0);
      this.bU = $$0.q("wasOnGround");
   }

   public boolean gb() {
      return this.ga() <= 1;
   }

   protected iu q() {
      return iw.Q;
   }

   @Override
   protected boolean S() {
      return this.ga() > 0;
   }

   @Override
   public void l() {
      this.e = this.e + (this.d - this.e) * 0.5F;
      this.bS = this.e;
      super.l();
      if (this.aA() && !this.bU) {
         int $$0 = this.ga();

         for (int $$1 = 0; $$1 < $$0 * 8; $$1++) {
            float $$2 = this.ag.i() * (float) (Math.PI * 2);
            float $$3 = this.ag.i() * 0.5F + 0.5F;
            float $$4 = aro.a($$2) * (float)$$0 * 0.5F * $$3;
            float $$5 = aro.b($$2) * (float)$$0 * 0.5F * $$3;
            this.dK().a(this.q(), this.dp() + (double)$$4, this.dr(), this.dv() + (double)$$5, 0.0, 0.0, 0.0);
         }

         this.a(this.fY(), this.eU(), ((this.ag.i() - this.ag.i()) * 0.2F + 1.0F) / 0.8F);
         this.d = -0.5F;
      } else if (!this.aA() && this.bU) {
         this.d = 1.0F;
      }

      this.bU = this.aA();
      this.fV();
   }

   @Override
   protected void fV() {
      this.d *= 0.6F;
   }

   protected int t() {
      return this.ag.a(20) + 10;
   }

   @Override
   public void e_() {
      double $$0 = this.dp();
      double $$1 = this.dr();
      double $$2 = this.dv();
      super.e_();
      this.e($$0, $$1, $$2);
   }

   @Override
   public void a(adx<?> $$0) {
      if (bT.equals($$0)) {
         this.e_();
         this.r(this.aW);
         this.aU = this.aW;
         if (this.aX() && this.ag.a(20) == 0) {
            this.bg();
         }
      }

      super.a($$0);
   }

   @Override
   public bik<? extends bzi> ag() {
      return (bik<? extends bzi>)super.ag();
   }

   @Override
   public void a(big.c $$0) {
      int $$1 = this.ga();
      if (!this.dK().B && $$1 > 1 && this.eu()) {
         te $$2 = this.ad();
         boolean $$3 = this.fQ();
         float $$4 = (float)$$1 / 4.0F;
         int $$5 = $$1 / 2;
         int $$6 = 2 + this.ag.a(3);

         for (int $$7 = 0; $$7 < $$6; $$7++) {
            float $$8 = ((float)($$7 % 2) - 0.5F) * $$4;
            float $$9 = ((float)($$7 / 2) - 0.5F) * $$4;
            bzi $$10 = this.ag().a(this.dK());
            if ($$10 != null) {
               if (this.fH()) {
                  $$10.fF();
               }

               $$10.b($$2);
               $$10.t($$3);
               $$10.m(this.cq());
               $$10.a($$5, true);
               $$10.b(this.dp() + (double)$$8, this.dr() + 0.5, this.dv() + (double)$$9, this.ag.i() * 360.0F, 0.0F);
               this.dK().b($$10);
            }
         }
      }

      super.a($$0);
   }

   @Override
   public void g(big $$0) {
      super.g($$0);
      if ($$0 instanceof buu && this.fW()) {
         this.l((biw)$$0);
      }
   }

   @Override
   public void b_(cbl $$0) {
      if (this.fW()) {
         this.l($$0);
      }
   }

   protected void l(biw $$0) {
      if (this.bv()) {
         int $$1 = this.ga();
         if (this.f((big)$$0) < 0.6 * (double)$$1 * 0.6 * (double)$$1 && this.E($$0) && $$0.a(this.dL().b((biw)this), this.fX())) {
            this.a(aou.vC, 1.0F, (this.ag.i() - this.ag.i()) * 0.2F + 1.0F);
            this.a(this, $$0);
         }
      }
   }

   @Override
   protected float b(bji $$0, bih $$1) {
      return 0.625F * $$1.b;
   }

   @Override
   protected Vector3f a(big $$0, bih $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - 0.015625F * (float)this.ga() * $$2, 0.0F);
   }

   protected boolean fW() {
      return !this.gb() && this.cX();
   }

   protected float fX() {
      return (float)this.b(bkd.f);
   }

   @Override
   protected aot d(bhe $$0) {
      return this.gb() ? aou.wt : aou.vE;
   }

   @Override
   protected aot h_() {
      return this.gb() ? aou.ws : aou.vD;
   }

   protected aot fY() {
      return this.gb() ? aou.wv : aou.vG;
   }

   public static boolean c(bik<bzi> $$0, cpl $$1, bja $$2, gv $$3, art $$4) {
      if ($$1.ai() != bgl.a) {
         if ($$1.s($$3).a(api.ap) && $$3.v() > 50 && $$3.v() < 70 && $$4.i() < 0.5F && $$4.i() < $$1.an() && $$1.z($$3) <= $$4.a(8)) {
            return a($$0, $$1, $$2, $$3, $$4);
         }

         if (!($$1 instanceof cqe)) {
            return false;
         }

         cor $$5 = new cor($$3);
         boolean $$6 = dlg.a($$5.e, $$5.f, ((cqe)$$1).A(), 987234911L).a(10) == 0;
         if ($$4.a(10) == 0 && $$6 && $$3.v() < 40) {
            return a($$0, $$1, $$2, $$3, $$4);
         }
      }

      return false;
   }

   @Override
   protected float eU() {
      return 0.4F * (float)this.ga();
   }

   @Override
   public int W() {
      return 0;
   }

   protected boolean gc() {
      return this.ga() > 0;
   }

   @Override
   protected void eZ() {
      ehf $$0 = this.dn();
      this.o($$0.c, (double)this.eX(), $$0.e);
      this.au = true;
   }

   @Nullable
   @Override
   public bjq a(cpz $$0, bgm $$1, bja $$2, @Nullable bjq $$3, @Nullable qs $$4) {
      art $$5 = $$0.y_();
      int $$6 = $$5.a(3);
      if ($$6 < 2 && $$5.i() < 0.5F * $$1.d()) {
         $$6++;
      }

      int $$7 = 1 << $$6;
      this.a($$7, true);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   float p() {
      float $$0 = this.gb() ? 1.4F : 0.8F;
      return ((this.ag.i() - this.ag.i()) * 0.2F + 1.0F) * $$0;
   }

   protected aot fZ() {
      return this.gb() ? aou.wu : aou.vF;
   }

   @Override
   public bih a(bji $$0) {
      return super.a($$0).a(0.255F * (float)this.ga());
   }

   static class a extends bps {
      private final bzi a;
      private int b;

      public a(bzi $$0) {
         this.a = $$0;
         this.a(EnumSet.of(bps.a.b));
      }

      @Override
      public boolean a() {
         biw $$0 = this.a.j();
         if ($$0 == null) {
            return false;
         } else {
            return !this.a.c($$0) ? false : this.a.E() instanceof bzi.d;
         }
      }

      @Override
      public void c() {
         this.b = b(300);
         super.c();
      }

      @Override
      public boolean b() {
         biw $$0 = this.a.j();
         if ($$0 == null) {
            return false;
         } else {
            return !this.a.c($$0) ? false : --this.b > 0;
         }
      }

      @Override
      public boolean K_() {
         return true;
      }

      @Override
      public void e() {
         biw $$0 = this.a.j();
         if ($$0 != null) {
            this.a.a($$0, 10.0F, 10.0F);
         }

         if (this.a.E() instanceof bzi.d $$1) {
            $$1.a(this.a.dA(), this.a.fW());
         }
      }
   }

   static class b extends bps {
      private final bzi a;

      public b(bzi $$0) {
         this.a = $$0;
         this.a(EnumSet.of(bps.a.c, bps.a.a));
         $$0.H().a(true);
      }

      @Override
      public boolean a() {
         return (this.a.aX() || this.a.bl()) && this.a.E() instanceof bzi.d;
      }

      @Override
      public boolean K_() {
         return true;
      }

      @Override
      public void e() {
         if (this.a.ee().i() < 0.8F) {
            this.a.F().a();
         }

         if (this.a.E() instanceof bzi.d $$0) {
            $$0.a(1.2);
         }
      }
   }

   static class c extends bps {
      private final bzi a;

      public c(bzi $$0) {
         this.a = $$0;
         this.a(EnumSet.of(bps.a.c, bps.a.a));
      }

      @Override
      public boolean a() {
         return !this.a.bN();
      }

      @Override
      public void e() {
         if (this.a.E() instanceof bzi.d $$0) {
            $$0.a(1.0);
         }
      }
   }

   static class d extends bov {
      private float l;
      private int m;
      private final bzi n;
      private boolean o;

      public d(bzi $$0) {
         super($$0);
         this.n = $$0;
         this.l = 180.0F * $$0.dA() / (float) Math.PI;
      }

      public void a(float $$0, boolean $$1) {
         this.l = $$0;
         this.o = $$1;
      }

      public void a(double $$0) {
         this.h = $$0;
         this.k = bov.a.b;
      }

      @Override
      public void a() {
         this.d.r(this.a(this.d.dA(), this.l, 90.0F));
         this.d.aW = this.d.dA();
         this.d.aU = this.d.dA();
         if (this.k != bov.a.b) {
            this.d.A(0.0F);
         } else {
            this.k = bov.a.a;
            if (this.d.aA()) {
               this.d.w((float)(this.h * this.d.b(bkd.d)));
               if (this.m-- <= 0) {
                  this.m = this.n.t();
                  if (this.o) {
                     this.m /= 3;
                  }

                  this.n.F().a();
                  if (this.n.gc()) {
                     this.n.a(this.n.fZ(), this.n.eU(), this.n.p());
                  }
               } else {
                  this.n.bk = 0.0F;
                  this.n.bm = 0.0F;
                  this.d.w(0.0F);
               }
            } else {
               this.d.w((float)(this.h * this.d.b(bkd.d)));
            }
         }
      }
   }

   static class e extends bps {
      private final bzi a;
      private float b;
      private int c;

      public e(bzi $$0) {
         this.a = $$0;
         this.a(EnumSet.of(bps.a.b));
      }

      @Override
      public boolean a() {
         return this.a.j() == null && (this.a.aA() || this.a.aX() || this.a.bl() || this.a.a(bhv.y)) && this.a.E() instanceof bzi.d;
      }

      @Override
      public void e() {
         if (--this.c <= 0) {
            this.c = this.a(40 + this.a.ee().a(60));
            this.b = (float)this.a.ee().a(360);
         }

         if (this.a.E() instanceof bzi.d $$0) {
            $$0.a(this.b, false);
         }
      }
   }
}
