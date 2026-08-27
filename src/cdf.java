import com.google.common.annotations.VisibleForTesting;
import java.util.EnumSet;
import javax.annotation.Nullable;

public class cdf extends bmq implements cco {
   private static final agn<Integer> bU = agq.a(cdf.class, agp.b);
   public static final int b = 1;
   public static final int c = 127;
   public float d;
   public float e;
   public float bT;
   private boolean bV;

   public cdf(bmc<? extends cdf> $$0, ctx $$1) {
      super($$0, $$1);
      this.cD();
      this.bM = new cdf.d(this);
   }

   @Override
   protected void B() {
      this.bP.a(1, new cdf.b(this));
      this.bP.a(2, new cdf.a(this));
      this.bP.a(3, new cdf.e(this));
      this.bP.a(5, new cdf.c(this));
      this.bQ.a(1, new bvd<>(this, cfq.class, 10, true, false, $$0 -> Math.abs($$0.ds() - this.ds()) <= 4.0));
      this.bQ.a(3, new bvd<>(this, byo.class, true));
   }

   @Override
   public aru db() {
      return aru.f;
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(bU, 1);
   }

   @VisibleForTesting
   public void a(int $$0, boolean $$1) {
      int $$2 = aup.a($$0, 1, 127);
      this.an.b(bU, $$2);
      this.ar();
      this.k_();
      this.f(bnu.n).a((double)($$2 * $$2));
      this.f(bnu.o).a((double)(0.2F + 0.1F * (float)$$2));
      this.f(bnu.c).a((double)$$2);
      if ($$1) {
         this.c(this.eM());
      }

      this.bK = $$2;
   }

   public int gg() {
      return this.an.b(bU);
   }

   @Override
   public void b(so $$0) {
      super.b($$0);
      $$0.a("Size", this.gg() - 1);
      $$0.a("wasOnGround", this.bV);
   }

   @Override
   public void a(so $$0) {
      this.a($$0.h("Size") + 1, false);
      super.a($$0);
      this.bV = $$0.q("wasOnGround");
   }

   public boolean gh() {
      return this.gg() <= 1;
   }

   protected jv w() {
      return jx.S;
   }

   @Override
   protected boolean Y() {
      return this.gg() > 0;
   }

   @Override
   public void l() {
      this.e = this.e + (this.d - this.e) * 0.5F;
      this.bT = this.e;
      super.l();
      if (this.aC() && !this.bV) {
         int $$0 = this.gg();

         for (int $$1 = 0; $$1 < $$0 * 8; $$1++) {
            float $$2 = this.ag.i() * (float) (Math.PI * 2);
            float $$3 = this.ag.i() * 0.5F + 0.5F;
            float $$4 = aup.a($$2) * (float)$$0 * 0.5F * $$3;
            float $$5 = aup.b($$2) * (float)$$0 * 0.5F * $$3;
            this.dL().a(this.w(), this.dq() + (double)$$4, this.ds(), this.dw() + (double)$$5, 0.0, 0.0, 0.0);
         }

         this.a(this.ge(), this.eW(), ((this.ag.i() - this.ag.i()) * 0.2F + 1.0F) / 0.8F);
         this.d = -0.5F;
      } else if (!this.aC() && this.bV) {
         this.d = 1.0F;
      }

      this.bV = this.aC();
      this.gb();
   }

   @Override
   protected void gb() {
      this.d *= 0.6F;
   }

   protected int A() {
      return this.ag.a(20) + 10;
   }

   @Override
   public void k_() {
      double $$0 = this.dq();
      double $$1 = this.ds();
      double $$2 = this.dw();
      super.k_();
      this.a_($$0, $$1, $$2);
   }

   @Override
   public void a(agn<?> $$0) {
      if (bU.equals($$0)) {
         this.k_();
         this.r(this.aW);
         this.aU = this.aW;
         if (this.aZ() && this.ag.a(20) == 0) {
            this.bi();
         }
      }

      super.a($$0);
   }

   @Override
   public bmc<? extends cdf> ai() {
      return (bmc<? extends cdf>)super.ai();
   }

   @Override
   public void a(blw.c $$0) {
      int $$1 = this.gg();
      if (!this.dL().B && $$1 > 1 && this.ew()) {
         vg $$2 = this.af();
         boolean $$3 = this.fV();
         float $$4 = (float)$$1 / 4.0F;
         int $$5 = $$1 / 2;
         int $$6 = 2 + this.ag.a(3);

         for (int $$7 = 0; $$7 < $$6; $$7++) {
            float $$8 = ((float)($$7 % 2) - 0.5F) * $$4;
            float $$9 = ((float)($$7 / 2) - 0.5F) * $$4;
            cdf $$10 = this.ai().a(this.dL());
            if ($$10 != null) {
               if (this.fM()) {
                  $$10.fK();
               }

               $$10.b($$2);
               $$10.t($$3);
               $$10.m(this.cr());
               $$10.a($$5, true);
               $$10.b(this.dq() + (double)$$8, this.ds() + 0.5, this.dw() + (double)$$9, this.ag.i() * 360.0F, 0.0F);
               this.dL().b($$10);
            }
         }
      }

      super.a($$0);
   }

   @Override
   public void g(blw $$0) {
      super.g($$0);
      if ($$0 instanceof byo && this.gc()) {
         this.j((bmo)$$0);
      }
   }

   @Override
   public void b_(cfq $$0) {
      if (this.gc()) {
         this.j($$0);
      }
   }

   protected void j(bmo $$0) {
      if (this.bx()) {
         int $$1 = this.gg();
         if (this.f((blw)$$0) < 0.6 * (double)$$1 * 0.6 * (double)$$1 && this.D($$0) && $$0.a(this.dM().b((bmo)this), this.gd())) {
            this.a(art.wH, 1.0F, (this.ag.i() - this.ag.i()) * 0.2F + 1.0F);
            this.a(this, $$0);
         }
      }
   }

   @Override
   protected emc a(blw $$0, blz $$1, float $$2) {
      return new emc(0.0, (double)$$1.b() - 0.015625 * (double)this.gg() * (double)$$2, 0.0);
   }

   protected boolean gc() {
      return !this.gh() && this.cY();
   }

   protected float gd() {
      return (float)this.g(bnu.c);
   }

   @Override
   protected ars d(bkv $$0) {
      return this.gh() ? art.xy : art.wJ;
   }

   @Override
   protected ars n_() {
      return this.gh() ? art.xx : art.wI;
   }

   protected ars ge() {
      return this.gh() ? art.xA : art.wL;
   }

   public static boolean c(bmc<cdf> $$0, cty $$1, bms $$2, hx $$3, auw $$4) {
      if (bms.a($$2)) {
         return a($$0, $$1, $$2, $$3, $$4);
      } else {
         if ($$1.ak() != bjz.a) {
            if ($$2 == bms.c) {
               return a($$0, $$1, $$2, $$3, $$4);
            }

            if ($$1.t($$3).a(ash.aq) && $$3.v() > 50 && $$3.v() < 70 && $$4.i() < 0.5F && $$4.i() < $$1.ap() && $$1.A($$3) <= $$4.a(8)) {
               return a($$0, $$1, $$2, $$3, $$4);
            }

            if (!($$1 instanceof cus)) {
               return false;
            }

            cte $$5 = new cte($$3);
            boolean $$6 = dpx.a($$5.e, $$5.f, ((cus)$$1).C(), 987234911L).a(10) == 0;
            if ($$4.a(10) == 0 && $$6 && $$3.v() < 40) {
               return a($$0, $$1, $$2, $$3, $$4);
            }
         }

         return false;
      }
   }

   @Override
   protected float eW() {
      return 0.4F * (float)this.gg();
   }

   @Override
   public int ab() {
      return 0;
   }

   protected boolean gi() {
      return this.gg() > 0;
   }

   @Override
   protected void fb() {
      emc $$0 = this.do();
      this.o($$0.c, (double)this.eZ(), $$0.e);
      this.au = true;
   }

   @Nullable
   @Override
   public bnh a(cum $$0, bka $$1, bms $$2, @Nullable bnh $$3, @Nullable so $$4) {
      auw $$5 = $$0.F_();
      int $$6 = $$5.a(3);
      if ($$6 < 2 && $$5.i() < 0.5F * $$1.d()) {
         $$6++;
      }

      int $$7 = 1 << $$6;
      this.a($$7, true);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   float u() {
      float $$0 = this.gh() ? 1.4F : 0.8F;
      return ((this.ag.i() - this.ag.i()) * 0.2F + 1.0F) * $$0;
   }

   protected ars gf() {
      return this.gh() ? art.xz : art.wK;
   }

   @Override
   public blz e(bna $$0) {
      return super.e($$0).a(0.255F * (float)this.gg());
   }

   static class a extends btk {
      private final cdf a;
      private int b;

      public a(cdf $$0) {
         this.a = $$0;
         this.a(EnumSet.of(btk.a.b));
      }

      @Override
      public boolean a() {
         bmo $$0 = this.a.q();
         if ($$0 == null) {
            return false;
         } else {
            return !this.a.c($$0) ? false : this.a.K() instanceof cdf.d;
         }
      }

      @Override
      public void c() {
         this.b = b(300);
         super.c();
      }

      @Override
      public boolean b() {
         bmo $$0 = this.a.q();
         if ($$0 == null) {
            return false;
         } else {
            return !this.a.c($$0) ? false : --this.b > 0;
         }
      }

      @Override
      public boolean T_() {
         return true;
      }

      @Override
      public void e() {
         bmo $$0 = this.a.q();
         if ($$0 != null) {
            this.a.a($$0, 10.0F, 10.0F);
         }

         if (this.a.K() instanceof cdf.d $$1) {
            $$1.a(this.a.dB(), this.a.gc());
         }
      }
   }

   static class b extends btk {
      private final cdf a;

      public b(cdf $$0) {
         this.a = $$0;
         this.a(EnumSet.of(btk.a.c, btk.a.a));
         $$0.N().a(true);
      }

      @Override
      public boolean a() {
         return (this.a.aZ() || this.a.bn()) && this.a.K() instanceof cdf.d;
      }

      @Override
      public boolean T_() {
         return true;
      }

      @Override
      public void e() {
         if (this.a.eg().i() < 0.8F) {
            this.a.M().a();
         }

         if (this.a.K() instanceof cdf.d $$0) {
            $$0.a(1.2);
         }
      }
   }

   static class c extends btk {
      private final cdf a;

      public c(cdf $$0) {
         this.a = $$0;
         this.a(EnumSet.of(btk.a.c, btk.a.a));
      }

      @Override
      public boolean a() {
         return !this.a.bO();
      }

      @Override
      public void e() {
         if (this.a.K() instanceof cdf.d $$0) {
            $$0.a(1.0);
         }
      }
   }

   static class d extends bsn {
      private float l;
      private int m;
      private final cdf n;
      private boolean o;

      public d(cdf $$0) {
         super($$0);
         this.n = $$0;
         this.l = 180.0F * $$0.dB() / (float) Math.PI;
      }

      public void a(float $$0, boolean $$1) {
         this.l = $$0;
         this.o = $$1;
      }

      public void a(double $$0) {
         this.h = $$0;
         this.k = bsn.a.b;
      }

      @Override
      public void a() {
         this.d.r(this.a(this.d.dB(), this.l, 90.0F));
         this.d.aW = this.d.dB();
         this.d.aU = this.d.dB();
         if (this.k != bsn.a.b) {
            this.d.z(0.0F);
         } else {
            this.k = bsn.a.a;
            if (this.d.aC()) {
               this.d.v((float)(this.h * this.d.g(bnu.o)));
               if (this.m-- <= 0) {
                  this.m = this.n.A();
                  if (this.o) {
                     this.m /= 3;
                  }

                  this.n.M().a();
                  if (this.n.gi()) {
                     this.n.a(this.n.gf(), this.n.eW(), this.n.u());
                  }
               } else {
                  this.n.bk = 0.0F;
                  this.n.bm = 0.0F;
                  this.d.v(0.0F);
               }
            } else {
               this.d.v((float)(this.h * this.d.g(bnu.o)));
            }
         }
      }
   }

   static class e extends btk {
      private final cdf a;
      private float b;
      private int c;

      public e(cdf $$0) {
         this.a = $$0;
         this.a(EnumSet.of(btk.a.b));
      }

      @Override
      public boolean a() {
         return this.a.q() == null && (this.a.aC() || this.a.aZ() || this.a.bn() || this.a.a(bll.y)) && this.a.K() instanceof cdf.d;
      }

      @Override
      public void e() {
         if (--this.c <= 0) {
            this.c = this.a(40 + this.a.eg().a(60));
            this.b = (float)this.a.eg().a(360);
         }

         if (this.a.K() instanceof cdf.d $$0) {
            $$0.a(this.b, false);
         }
      }
   }
}
