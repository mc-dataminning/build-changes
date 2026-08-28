import com.google.common.annotations.VisibleForTesting;
import java.util.EnumSet;
import javax.annotation.Nullable;

public class cmx extends bvz implements cmg {
   private static final aks<Integer> ca = akw.a(cmx.class, aku.b);
   public static final int a = 1;
   public static final int b = 127;
   public static final int c = 4;
   public float d;
   public float bY;
   public float bZ;
   private boolean cb;

   public cmx(bvi<? extends cmx> $$0, dgz $$1) {
      super($$0, $$1);
      this.cN();
      this.bQ = new cmx.d(this);
   }

   @Override
   protected void B() {
      this.bT.a(1, new cmx.b(this));
      this.bT.a(2, new cmx.a(this));
      this.bT.a(3, new cmx.e(this));
      this.bT.a(5, new cmx.c(this));
      this.bU.a(1, new ceo<>(this, cpo.class, 10, true, false, ($$0, $$1) -> Math.abs($$0.dD() - this.dD()) <= 4.0));
      this.bU.a(3, new ceo<>(this, cia.class, true));
   }

   @Override
   public aww dn() {
      return aww.f;
   }

   @Override
   protected void a(akw.a $$0) {
      super.a($$0);
      $$0.a(ca, 1);
   }

   @VisibleForTesting
   public void a(int $$0, boolean $$1) {
      int $$2 = azu.a($$0, 1, 127);
      this.al.a(ca, $$2);
      this.ay();
      this.m_();
      this.g(bxf.s).a((double)($$2 * $$2));
      this.g(bxf.v).a((double)(0.2F + 0.1F * (float)$$2));
      this.g(bxf.c).a((double)$$2);
      if ($$1) {
         this.x(this.eS());
      }

      this.bO = $$2;
   }

   public int go() {
      return this.al.a(ca);
   }

   @Override
   public void b(um $$0) {
      super.b($$0);
      $$0.a("Size", this.go() - 1);
      $$0.a("wasOnGround", this.cb);
   }

   @Override
   public void a(um $$0) {
      this.a($$0.h("Size") + 1, false);
      super.a($$0);
      this.cb = $$0.q("wasOnGround");
   }

   public boolean gp() {
      return this.go() <= 1;
   }

   protected lq p() {
      return ls.W;
   }

   @Override
   protected boolean X() {
      return this.go() > 0;
   }

   @Override
   public void h() {
      this.bZ = this.bY;
      this.bY = this.bY + (this.d - this.bY) * 0.5F;
      super.h();
      if (this.aJ() && !this.cb) {
         float $$0 = this.a(this.aw()).a() * 2.0F;
         float $$1 = $$0 / 2.0F;

         for (int $$2 = 0; (float)$$2 < $$0 * 16.0F; $$2++) {
            float $$3 = this.ae.i() * (float) (Math.PI * 2);
            float $$4 = this.ae.i() * 0.5F + 0.5F;
            float $$5 = azu.a($$3) * $$1 * $$4;
            float $$6 = azu.b($$3) * $$1 * $$4;
            this.dW().a(this.p(), this.dB() + (double)$$5, this.dD(), this.dH() + (double)$$6, 0.0, 0.0, 0.0);
         }

         this.a(this.gm(), this.fg(), ((this.ae.i() - this.ae.i()) * 0.2F + 1.0F) / 0.8F);
         this.d = -0.5F;
      } else if (!this.aJ() && this.cb) {
         this.d = 1.0F;
      }

      this.cb = this.aJ();
      this.x();
   }

   protected void x() {
      this.d *= 0.6F;
   }

   protected int t() {
      return this.ae.a(20) + 10;
   }

   @Override
   public void m_() {
      double $$0 = this.dB();
      double $$1 = this.dD();
      double $$2 = this.dH();
      super.m_();
      this.a_($$0, $$1, $$2);
   }

   @Override
   public void a(aks<?> $$0) {
      if (ca.equals($$0)) {
         this.m_();
         this.v(this.aZ);
         this.aX = this.aZ;
         if (this.bj() && this.ae.a(20) == 0) {
            this.bs();
         }
      }

      super.a($$0);
   }

   @Override
   public bvi<? extends cmx> aq() {
      return (bvi<? extends cmx>)super.aq();
   }

   @Override
   public void a(bvb.d $$0) {
      int $$1 = this.go();
      if (!this.dW().C && $$1 > 1 && this.eF()) {
         float $$2 = this.a(this.aw()).a();
         float $$3 = $$2 / 2.0F;
         int $$4 = $$1 / 2;
         int $$5 = 2 + this.ae.a(3);
         fcr $$6 = this.cr();

         for (int $$7 = 0; $$7 < $$5; $$7++) {
            float $$8 = ((float)($$7 % 2) - 0.5F) * $$3;
            float $$9 = ((float)($$7 / 2) - 0.5F) * $$3;
            this.a(this.aq(), new buw(bux.b, false, false, $$6), bvh.k, $$3x -> {
               $$3x.a($$4, true);
               $$3x.b(this.dB() + (double)$$8, this.dD() + 0.5, this.dH() + (double)$$9, this.ae.i() * 360.0F, 0.0F);
            });
         }
      }

      super.a($$0);
   }

   @Override
   public void h(bvb $$0) {
      super.h($$0);
      if ($$0 instanceof cia && this.gk()) {
         this.j((bvx)$$0);
      }
   }

   @Override
   public void a_(cpo $$0) {
      if (this.gk()) {
         this.j($$0);
      }
   }

   protected void j(bvx $$0) {
      if (this.dW() instanceof arx $$1 && this.bL() && this.i($$0) && this.E($$0)) {
         btr $$2 = this.dX().b((bvx)this);
         if ($$0.a($$1, $$2, this.gl())) {
            this.a(awv.xP, 1.0F, (this.ae.i() - this.ae.i()) * 0.2F + 1.0F);
            dds.a($$1, (bvb)$$0, $$2);
         }
      }
   }

   @Override
   protected fbr a(bvb $$0, bve $$1, float $$2) {
      return new fbr(0.0, (double)$$1.b() - 0.015625 * (double)this.go() * (double)$$2, 0.0);
   }

   protected boolean gk() {
      return !this.gp() && this.dk();
   }

   protected float gl() {
      return (float)this.h(bxf.c);
   }

   @Override
   protected awu e(btr $$0) {
      return this.gp() ? awv.yV : awv.xR;
   }

   @Override
   protected awu o_() {
      return this.gp() ? awv.yU : awv.xQ;
   }

   protected awu gm() {
      return this.gp() ? awv.yX : awv.xT;
   }

   public static boolean c(bvi<cmx> $$0, dha $$1, bvh $$2, jh $$3, bac $$4) {
      if ($$1.am() != bsx.a) {
         if (bvh.a($$2)) {
            return a($$0, $$1, $$2, $$3, $$4);
         }

         if ($$1.t($$3).a(axj.aq) && $$3.v() > 50 && $$3.v() < 70 && $$4.i() < 0.5F && $$4.i() < $$1.ar() && $$1.A($$3) <= $$4.a(8)) {
            return a($$0, $$1, $$2, $$3, $$4);
         }

         if (!($$1 instanceof dhx)) {
            return false;
         }

         dgf $$5 = new dgf($$3);
         boolean $$6 = eei.a($$5.h, $$5.i, ((dhx)$$1).E(), 987234911L).a(10) == 0;
         if ($$4.a(10) == 0 && $$6 && $$3.v() < 40) {
            return a($$0, $$1, $$2, $$3, $$4);
         }
      }

      return false;
   }

   @Override
   protected float fg() {
      return 0.4F * (float)this.go();
   }

   @Override
   public int Z() {
      return 0;
   }

   protected boolean gq() {
      return this.go() > 0;
   }

   @Override
   public void s() {
      fbr $$0 = this.dz();
      this.n($$0.d, (double)this.fj(), $$0.f);
      this.ar = true;
   }

   @Nullable
   @Override
   public bwq a(dhq $$0, bsy $$1, bvh $$2, @Nullable bwq $$3) {
      bac $$4 = $$0.H_();
      int $$5 = $$4.a(3);
      if ($$5 < 2 && $$4.i() < 0.5F * $$1.d()) {
         $$5++;
      }

      int $$6 = 1 << $$5;
      this.a($$6, true);
      return super.a($$0, $$1, $$2, $$3);
   }

   float m() {
      float $$0 = this.gp() ? 1.4F : 0.8F;
      return ((this.ae.i() - this.ae.i()) * 0.2F + 1.0F) * $$0;
   }

   protected awu gn() {
      return this.gp() ? awv.yW : awv.xS;
   }

   @Override
   public bve e(bwj $$0) {
      return super.e($$0).a((float)this.go());
   }

   static class a extends ccv {
      private final cmx a;
      private int b;

      public a(cmx $$0) {
         this.a = $$0;
         this.a(EnumSet.of(ccv.a.b));
      }

      @Override
      public boolean b() {
         bvx $$0 = this.a.O_();
         if ($$0 == null) {
            return false;
         } else {
            return !this.a.c($$0) ? false : this.a.I() instanceof cmx.d;
         }
      }

      @Override
      public void d() {
         this.b = b(300);
         super.d();
      }

      @Override
      public boolean c() {
         bvx $$0 = this.a.O_();
         if ($$0 == null) {
            return false;
         } else {
            return !this.a.c($$0) ? false : --this.b > 0;
         }
      }

      @Override
      public boolean V_() {
         return true;
      }

      @Override
      public void a() {
         bvx $$0 = this.a.O_();
         if ($$0 != null) {
            this.a.a($$0, 10.0F, 10.0F);
         }

         if (this.a.I() instanceof cmx.d $$1) {
            $$1.a(this.a.dM(), this.a.gk());
         }
      }
   }

   static class b extends ccv {
      private final cmx a;

      public b(cmx $$0) {
         this.a = $$0;
         this.a(EnumSet.of(ccv.a.c, ccv.a.a));
         $$0.L().a(true);
      }

      @Override
      public boolean b() {
         return (this.a.bj() || this.a.bx()) && this.a.I() instanceof cmx.d;
      }

      @Override
      public boolean V_() {
         return true;
      }

      @Override
      public void a() {
         if (this.a.dZ().i() < 0.8F) {
            this.a.J().a();
         }

         if (this.a.I() instanceof cmx.d $$0) {
            $$0.a(1.2);
         }
      }
   }

   static class c extends ccv {
      private final cmx a;

      public c(cmx $$0) {
         this.a = $$0;
         this.a(EnumSet.of(ccv.a.c, ccv.a.a));
      }

      @Override
      public boolean b() {
         return !this.a.bZ();
      }

      @Override
      public void a() {
         if (this.a.I() instanceof cmx.d $$0) {
            $$0.a(1.0);
         }
      }
   }

   static class d extends cby {
      private float l;
      private int m;
      private final cmx n;
      private boolean o;

      public d(cmx $$0) {
         super($$0);
         this.n = $$0;
         this.l = 180.0F * $$0.dM() / (float) Math.PI;
      }

      public void a(float $$0, boolean $$1) {
         this.l = $$0;
         this.o = $$1;
      }

      public void a(double $$0) {
         this.h = $$0;
         this.k = cby.a.b;
      }

      @Override
      public void a() {
         this.d.v(this.b(this.d.dM(), this.l, 90.0F));
         this.d.aZ = this.d.dM();
         this.d.aX = this.d.dM();
         if (this.k != cby.a.b) {
            this.d.G(0.0F);
         } else {
            this.k = cby.a.a;
            if (this.d.aJ()) {
               this.d.C((float)(this.h * this.d.h(bxf.v)));
               if (this.m-- <= 0) {
                  this.m = this.n.t();
                  if (this.o) {
                     this.m /= 3;
                  }

                  this.n.J().a();
                  if (this.n.gq()) {
                     this.n.a(this.n.gn(), this.n.fg(), this.n.m());
                  }
               } else {
                  this.n.bo = 0.0F;
                  this.n.bq = 0.0F;
                  this.d.C(0.0F);
               }
            } else {
               this.d.C((float)(this.h * this.d.h(bxf.v)));
            }
         }
      }
   }

   static class e extends ccv {
      private final cmx a;
      private float b;
      private int c;

      public e(cmx $$0) {
         this.a = $$0;
         this.a(EnumSet.of(ccv.a.b));
      }

      @Override
      public boolean b() {
         return this.a.O_() == null && (this.a.aJ() || this.a.bj() || this.a.bx() || this.a.b(bui.y)) && this.a.I() instanceof cmx.d;
      }

      @Override
      public void a() {
         if (--this.c <= 0) {
            this.c = this.a(40 + this.a.dZ().a(60));
            this.b = (float)this.a.dZ().a(360);
         }

         if (this.a.I() instanceof cmx.d $$0) {
            $$0.a(this.b, false);
         }
      }
   }
}
