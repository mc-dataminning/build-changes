import com.google.common.annotations.VisibleForTesting;
import java.util.EnumSet;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bzj extends bja implements bys {
   private static final adz<Integer> bT = aec.a(bzj.class, aeb.b);
   public static final int b = 1;
   public static final int c = 127;
   public float d;
   public float e;
   public float bS;
   private boolean bU;

   public bzj(bim<? extends bzj> $$0, cpl $$1) {
      super($$0, $$1);
      this.cC();
      this.bL = new bzj.d(this);
   }

   @Override
   protected void w() {
      this.bO.a(1, new bzj.b(this));
      this.bO.a(2, new bzj.a(this));
      this.bO.a(3, new bzj.e(this));
      this.bO.a(5, new bzj.c(this));
      this.bP.a(1, new brm<>(this, cbm.class, 10, true, false, $$0 -> Math.abs($$0.dr() - this.dr()) <= 4.0));
      this.bP.a(3, new brm<>(this, buv.class, true));
   }

   @Override
   public aox da() {
      return aox.f;
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(bT, 1);
   }

   @VisibleForTesting
   public void a(int $$0, boolean $$1) {
      int $$2 = arp.a($$0, 1, 127);
      this.an.b(bT, $$2);
      this.ap();
      this.e_();
      this.a(bke.a).a((double)($$2 * $$2));
      this.a(bke.d).a((double)(0.2F + 0.1F * (float)$$2));
      this.a(bke.f).a((double)$$2);
      if ($$1) {
         this.c(this.eK());
      }

      this.bJ = $$2;
   }

   public int gb() {
      return this.an.b(bT);
   }

   @Override
   public void b(qr $$0) {
      super.b($$0);
      $$0.a("Size", this.gb() - 1);
      $$0.a("wasOnGround", this.bU);
   }

   @Override
   public void a(qr $$0) {
      this.a($$0.h("Size") + 1, false);
      super.a($$0);
      this.bU = $$0.q("wasOnGround");
   }

   public boolean gc() {
      return this.gb() <= 1;
   }

   protected it q() {
      return iv.Q;
   }

   @Override
   protected boolean S() {
      return this.gb() > 0;
   }

   @Override
   public void l() {
      this.e = this.e + (this.d - this.e) * 0.5F;
      this.bS = this.e;
      super.l();
      if (this.aA() && !this.bU) {
         int $$0 = this.gb();

         for (int $$1 = 0; $$1 < $$0 * 8; $$1++) {
            float $$2 = this.ag.i() * (float) (Math.PI * 2);
            float $$3 = this.ag.i() * 0.5F + 0.5F;
            float $$4 = arp.a($$2) * (float)$$0 * 0.5F * $$3;
            float $$5 = arp.b($$2) * (float)$$0 * 0.5F * $$3;
            this.dK().a(this.q(), this.dp() + (double)$$4, this.dr(), this.dv() + (double)$$5, 0.0, 0.0, 0.0);
         }

         this.a(this.fZ(), this.eU(), ((this.ag.i() - this.ag.i()) * 0.2F + 1.0F) / 0.8F);
         this.d = -0.5F;
      } else if (!this.aA() && this.bU) {
         this.d = 1.0F;
      }

      this.bU = this.aA();
      this.fW();
   }

   @Override
   protected void fW() {
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
   public void a(adz<?> $$0) {
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
   public bim<? extends bzj> ag() {
      return (bim<? extends bzj>)super.ag();
   }

   @Override
   public void a(bii.c $$0) {
      int $$1 = this.gb();
      if (!this.dK().B && $$1 > 1 && this.eu()) {
         tf $$2 = this.ad();
         boolean $$3 = this.fQ();
         float $$4 = (float)$$1 / 4.0F;
         int $$5 = $$1 / 2;
         int $$6 = 2 + this.ag.a(3);

         for (int $$7 = 0; $$7 < $$6; $$7++) {
            float $$8 = ((float)($$7 % 2) - 0.5F) * $$4;
            float $$9 = ((float)($$7 / 2) - 0.5F) * $$4;
            bzj $$10 = this.ag().a(this.dK());
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
   public void g(bii $$0) {
      super.g($$0);
      if ($$0 instanceof buv && this.fX()) {
         this.j((biy)$$0);
      }
   }

   @Override
   public void b_(cbm $$0) {
      if (this.fX()) {
         this.j($$0);
      }
   }

   protected void j(biy $$0) {
      if (this.bv()) {
         int $$1 = this.gb();
         if (this.f((bii)$$0) < 0.6 * (double)$$1 * 0.6 * (double)$$1 && this.E($$0) && $$0.a(this.dL().b((biy)this), this.fY())) {
            this.a(aow.vC, 1.0F, (this.ag.i() - this.ag.i()) * 0.2F + 1.0F);
            this.a(this, $$0);
         }
      }
   }

   @Override
   protected float b(bjk $$0, bij $$1) {
      return 0.625F * $$1.b;
   }

   @Override
   protected Vector3f a(bii $$0, bij $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - 0.015625F * (float)this.gb() * $$2, 0.0F);
   }

   protected boolean fX() {
      return !this.gc() && this.cX();
   }

   protected float fY() {
      return (float)this.b(bke.f);
   }

   @Override
   protected aov d(bhg $$0) {
      return this.gc() ? aow.wt : aow.vE;
   }

   @Override
   protected aov h_() {
      return this.gc() ? aow.ws : aow.vD;
   }

   protected aov fZ() {
      return this.gc() ? aow.wv : aow.vG;
   }

   public static boolean c(bim<bzj> $$0, cpm $$1, bjc $$2, gu $$3, aru $$4) {
      if ($$1.ai() != bgn.a) {
         if ($$1.s($$3).a(apk.ap) && $$3.v() > 50 && $$3.v() < 70 && $$4.i() < 0.5F && $$4.i() < $$1.an() && $$1.z($$3) <= $$4.a(8)) {
            return a($$0, $$1, $$2, $$3, $$4);
         }

         if (!($$1 instanceof cqf)) {
            return false;
         }

         cos $$5 = new cos($$3);
         boolean $$6 = dlh.a($$5.e, $$5.f, ((cqf)$$1).A(), 987234911L).a(10) == 0;
         if ($$4.a(10) == 0 && $$6 && $$3.v() < 40) {
            return a($$0, $$1, $$2, $$3, $$4);
         }
      }

      return false;
   }

   @Override
   protected float eU() {
      return 0.4F * (float)this.gb();
   }

   @Override
   public int W() {
      return 0;
   }

   protected boolean gd() {
      return this.gb() > 0;
   }

   @Override
   protected void eZ() {
      ehd $$0 = this.dn();
      this.o($$0.c, (double)this.eX(), $$0.e);
      this.au = true;
   }

   @Nullable
   @Override
   public bjr a(cqa $$0, bgo $$1, bjc $$2, @Nullable bjr $$3, @Nullable qr $$4) {
      aru $$5 = $$0.y_();
      int $$6 = $$5.a(3);
      if ($$6 < 2 && $$5.i() < 0.5F * $$1.d()) {
         $$6++;
      }

      int $$7 = 1 << $$6;
      this.a($$7, true);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   float p() {
      float $$0 = this.gc() ? 1.4F : 0.8F;
      return ((this.ag.i() - this.ag.i()) * 0.2F + 1.0F) * $$0;
   }

   protected aov ga() {
      return this.gc() ? aow.wu : aow.vF;
   }

   @Override
   public bij a(bjk $$0) {
      return super.a($$0).a(0.255F * (float)this.gb());
   }

   static class a extends bpt {
      private final bzj a;
      private int b;

      public a(bzj $$0) {
         this.a = $$0;
         this.a(EnumSet.of(bpt.a.b));
      }

      @Override
      public boolean a() {
         biy $$0 = this.a.j();
         if ($$0 == null) {
            return false;
         } else {
            return !this.a.c($$0) ? false : this.a.E() instanceof bzj.d;
         }
      }

      @Override
      public void c() {
         this.b = b(300);
         super.c();
      }

      @Override
      public boolean b() {
         biy $$0 = this.a.j();
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
         biy $$0 = this.a.j();
         if ($$0 != null) {
            this.a.a($$0, 10.0F, 10.0F);
         }

         if (this.a.E() instanceof bzj.d $$1) {
            $$1.a(this.a.dA(), this.a.fX());
         }
      }
   }

   static class b extends bpt {
      private final bzj a;

      public b(bzj $$0) {
         this.a = $$0;
         this.a(EnumSet.of(bpt.a.c, bpt.a.a));
         $$0.H().a(true);
      }

      @Override
      public boolean a() {
         return (this.a.aX() || this.a.bl()) && this.a.E() instanceof bzj.d;
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

         if (this.a.E() instanceof bzj.d $$0) {
            $$0.a(1.2);
         }
      }
   }

   static class c extends bpt {
      private final bzj a;

      public c(bzj $$0) {
         this.a = $$0;
         this.a(EnumSet.of(bpt.a.c, bpt.a.a));
      }

      @Override
      public boolean a() {
         return !this.a.bN();
      }

      @Override
      public void e() {
         if (this.a.E() instanceof bzj.d $$0) {
            $$0.a(1.0);
         }
      }
   }

   static class d extends bow {
      private float l;
      private int m;
      private final bzj n;
      private boolean o;

      public d(bzj $$0) {
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
         this.k = bow.a.b;
      }

      @Override
      public void a() {
         this.d.r(this.a(this.d.dA(), this.l, 90.0F));
         this.d.aW = this.d.dA();
         this.d.aU = this.d.dA();
         if (this.k != bow.a.b) {
            this.d.A(0.0F);
         } else {
            this.k = bow.a.a;
            if (this.d.aA()) {
               this.d.w((float)(this.h * this.d.b(bke.d)));
               if (this.m-- <= 0) {
                  this.m = this.n.t();
                  if (this.o) {
                     this.m /= 3;
                  }

                  this.n.F().a();
                  if (this.n.gd()) {
                     this.n.a(this.n.ga(), this.n.eU(), this.n.p());
                  }
               } else {
                  this.n.bk = 0.0F;
                  this.n.bm = 0.0F;
                  this.d.w(0.0F);
               }
            } else {
               this.d.w((float)(this.h * this.d.b(bke.d)));
            }
         }
      }
   }

   static class e extends bpt {
      private final bzj a;
      private float b;
      private int c;

      public e(bzj $$0) {
         this.a = $$0;
         this.a(EnumSet.of(bpt.a.b));
      }

      @Override
      public boolean a() {
         return this.a.j() == null && (this.a.aA() || this.a.aX() || this.a.bl() || this.a.a(bhx.y)) && this.a.E() instanceof bzj.d;
      }

      @Override
      public void e() {
         if (--this.c <= 0) {
            this.c = this.a(40 + this.a.ee().a(60));
            this.b = (float)this.a.ee().a(360);
         }

         if (this.a.E() instanceof bzj.d $$0) {
            $$0.a(this.b, false);
         }
      }
   }
}
