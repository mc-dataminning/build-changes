import com.google.common.annotations.VisibleForTesting;
import java.util.EnumSet;
import javax.annotation.Nullable;

public class cmh extends bvj implements clq {
   private static final ajy<Integer> bZ = akc.a(cmh.class, aka.b);
   public static final int a = 1;
   public static final int b = 127;
   public static final int c = 4;
   public float d;
   public float bX;
   public float bY;
   private boolean ca;

   public cmh(bus<? extends cmh> $$0, dgi $$1) {
      super($$0, $$1);
      this.cN();
      this.bP = new cmh.d(this);
   }

   @Override
   protected void E() {
      this.bS.a(1, new cmh.b(this));
      this.bS.a(2, new cmh.a(this));
      this.bS.a(3, new cmh.e(this));
      this.bS.a(5, new cmh.c(this));
      this.bT.a(1, new cdy<>(this, cox.class, 10, true, false, ($$0, $$1) -> Math.abs($$0.dC() - this.dC()) <= 4.0));
      this.bT.a(3, new cdy<>(this, chk.class, true));
   }

   @Override
   public awb dm() {
      return awb.f;
   }

   @Override
   protected void a(akc.a $$0) {
      super.a($$0);
      $$0.a(bZ, 1);
   }

   @VisibleForTesting
   public void a(int $$0, boolean $$1) {
      int $$2 = ayz.a($$0, 1, 127);
      this.al.a(bZ, $$2);
      this.ay();
      this.m_();
      this.g(bwp.s).a((double)($$2 * $$2));
      this.g(bwp.v).a((double)(0.2F + 0.1F * (float)$$2));
      this.g(bwp.c).a((double)$$2);
      if ($$1) {
         this.x(this.eS());
      }

      this.bN = $$2;
   }

   public int gs() {
      return this.al.a(bZ);
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      $$0.a("Size", this.gs() - 1);
      $$0.a("wasOnGround", this.ca);
   }

   @Override
   public void a(tq $$0) {
      this.a($$0.h("Size") + 1, false);
      super.a($$0);
      this.ca = $$0.q("wasOnGround");
   }

   public boolean gt() {
      return this.gs() <= 1;
   }

   protected lr p() {
      return lt.W;
   }

   @Override
   protected boolean ab() {
      return this.gs() > 0;
   }

   @Override
   public void h() {
      this.bY = this.bX;
      this.bX = this.bX + (this.d - this.bX) * 0.5F;
      super.h();
      if (this.aJ() && !this.ca) {
         float $$0 = this.a(this.aw()).a() * 2.0F;
         float $$1 = $$0 / 2.0F;

         for (int $$2 = 0; (float)$$2 < $$0 * 16.0F; $$2++) {
            float $$3 = this.ae.i() * (float) (Math.PI * 2);
            float $$4 = this.ae.i() * 0.5F + 0.5F;
            float $$5 = ayz.a($$3) * $$1 * $$4;
            float $$6 = ayz.b($$3) * $$1 * $$4;
            this.dV().a(this.p(), this.dA() + (double)$$5, this.dC(), this.dG() + (double)$$6, 0.0, 0.0, 0.0);
         }

         this.a(this.gq(), this.fg(), ((this.ae.i() - this.ae.i()) * 0.2F + 1.0F) / 0.8F);
         this.d = -0.5F;
      } else if (!this.aJ() && this.ca) {
         this.d = 1.0F;
      }

      this.ca = this.aJ();
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
      double $$0 = this.dA();
      double $$1 = this.dC();
      double $$2 = this.dG();
      super.m_();
      this.a_($$0, $$1, $$2);
   }

   @Override
   public void a(ajy<?> $$0) {
      if (bZ.equals($$0)) {
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
   public bus<? extends cmh> aq() {
      return (bus<? extends cmh>)super.aq();
   }

   @Override
   public void a(bul.d $$0) {
      int $$1 = this.gs();
      if (!this.dV().C && $$1 > 1 && this.eE()) {
         float $$2 = this.a(this.aw()).a();
         float $$3 = $$2 / 2.0F;
         int $$4 = $$1 / 2;
         int $$5 = 2 + this.ae.a(3);
         fca $$6 = this.cr();

         for (int $$7 = 0; $$7 < $$5; $$7++) {
            float $$8 = ((float)($$7 % 2) - 0.5F) * $$3;
            float $$9 = ((float)($$7 / 2) - 0.5F) * $$3;
            this.a(this.aq(), new bug(buh.b, false, false, $$6), bur.k, $$3x -> {
               $$3x.a($$4, true);
               $$3x.b(this.dA() + (double)$$8, this.dC() + 0.5, this.dG() + (double)$$9, this.ae.i() * 360.0F, 0.0F);
            });
         }
      }

      super.a($$0);
   }

   @Override
   public void h(bul $$0) {
      super.h($$0);
      if ($$0 instanceof chk && this.go()) {
         this.j((bvh)$$0);
      }
   }

   @Override
   public void a_(cox $$0) {
      if (this.go()) {
         this.j($$0);
      }
   }

   protected void j(bvh $$0) {
      if (this.dV() instanceof ard $$1 && this.bL() && this.i($$0) && this.E($$0)) {
         btb $$2 = this.dW().b((bvh)this);
         if ($$0.a($$1, $$2, this.gp())) {
            this.a(awa.xP, 1.0F, (this.ae.i() - this.ae.i()) * 0.2F + 1.0F);
            ddb.a($$1, (bul)$$0, $$2);
         }
      }
   }

   @Override
   protected fba a(bul $$0, buo $$1, float $$2) {
      return new fba(0.0, (double)$$1.b() - 0.015625 * (double)this.gs() * (double)$$2, 0.0);
   }

   protected boolean go() {
      return !this.gt() && this.dj();
   }

   protected float gp() {
      return (float)this.h(bwp.c);
   }

   @Override
   protected avz e(btb $$0) {
      return this.gt() ? awa.yU : awa.xR;
   }

   @Override
   protected avz o_() {
      return this.gt() ? awa.yT : awa.xQ;
   }

   protected avz gq() {
      return this.gt() ? awa.yW : awa.xT;
   }

   public static boolean c(bus<cmh> $$0, dgj $$1, bur $$2, ji $$3, azh $$4) {
      if ($$1.am() != bsh.a) {
         if (bur.a($$2)) {
            return a($$0, $$1, $$2, $$3, $$4);
         }

         if ($$1.t($$3).a(awo.aq) && $$3.v() > 50 && $$3.v() < 70 && $$4.i() < 0.5F && $$4.i() < $$1.ar() && $$1.A($$3) <= $$4.a(8)) {
            return a($$0, $$1, $$2, $$3, $$4);
         }

         if (!($$1 instanceof dhg)) {
            return false;
         }

         dfo $$5 = new dfo($$3);
         boolean $$6 = edr.a($$5.h, $$5.i, ((dhg)$$1).E(), 987234911L).a(10) == 0;
         if ($$4.a(10) == 0 && $$6 && $$3.v() < 40) {
            return a($$0, $$1, $$2, $$3, $$4);
         }
      }

      return false;
   }

   @Override
   protected float fg() {
      return 0.4F * (float)this.gs();
   }

   @Override
   public int ad() {
      return 0;
   }

   protected boolean gu() {
      return this.gs() > 0;
   }

   @Override
   public void s() {
      fba $$0 = this.dy();
      this.n($$0.d, (double)this.fj(), $$0.f);
      this.ar = true;
   }

   @Nullable
   @Override
   public bwa a(dgz $$0, bsi $$1, bur $$2, @Nullable bwa $$3) {
      azh $$4 = $$0.H_();
      int $$5 = $$4.a(3);
      if ($$5 < 2 && $$4.i() < 0.5F * $$1.d()) {
         $$5++;
      }

      int $$6 = 1 << $$5;
      this.a($$6, true);
      return super.a($$0, $$1, $$2, $$3);
   }

   float m() {
      float $$0 = this.gt() ? 1.4F : 0.8F;
      return ((this.ae.i() - this.ae.i()) * 0.2F + 1.0F) * $$0;
   }

   protected avz gr() {
      return this.gt() ? awa.yV : awa.xS;
   }

   @Override
   public buo e(bvt $$0) {
      return super.e($$0).a((float)this.gs());
   }

   static class a extends ccf {
      private final cmh a;
      private int b;

      public a(cmh $$0) {
         this.a = $$0;
         this.a(EnumSet.of(ccf.a.b));
      }

      @Override
      public boolean b() {
         bvh $$0 = this.a.O_();
         if ($$0 == null) {
            return false;
         } else {
            return !this.a.c($$0) ? false : this.a.N() instanceof cmh.d;
         }
      }

      @Override
      public void d() {
         this.b = b(300);
         super.d();
      }

      @Override
      public boolean c() {
         bvh $$0 = this.a.O_();
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
         bvh $$0 = this.a.O_();
         if ($$0 != null) {
            this.a.a($$0, 10.0F, 10.0F);
         }

         if (this.a.N() instanceof cmh.d $$1) {
            $$1.a(this.a.dL(), this.a.go());
         }
      }
   }

   static class b extends ccf {
      private final cmh a;

      public b(cmh $$0) {
         this.a = $$0;
         this.a(EnumSet.of(ccf.a.c, ccf.a.a));
         $$0.P().a(true);
      }

      @Override
      public boolean b() {
         return (this.a.bj() || this.a.bx()) && this.a.N() instanceof cmh.d;
      }

      @Override
      public boolean V_() {
         return true;
      }

      @Override
      public void a() {
         if (this.a.dY().i() < 0.8F) {
            this.a.O().a();
         }

         if (this.a.N() instanceof cmh.d $$0) {
            $$0.a(1.2);
         }
      }
   }

   static class c extends ccf {
      private final cmh a;

      public c(cmh $$0) {
         this.a = $$0;
         this.a(EnumSet.of(ccf.a.c, ccf.a.a));
      }

      @Override
      public boolean b() {
         return !this.a.bZ();
      }

      @Override
      public void a() {
         if (this.a.N() instanceof cmh.d $$0) {
            $$0.a(1.0);
         }
      }
   }

   static class d extends cbi {
      private float l;
      private int m;
      private final cmh n;
      private boolean o;

      public d(cmh $$0) {
         super($$0);
         this.n = $$0;
         this.l = 180.0F * $$0.dL() / (float) Math.PI;
      }

      public void a(float $$0, boolean $$1) {
         this.l = $$0;
         this.o = $$1;
      }

      public void a(double $$0) {
         this.h = $$0;
         this.k = cbi.a.b;
      }

      @Override
      public void a() {
         this.d.v(this.b(this.d.dL(), this.l, 90.0F));
         this.d.aZ = this.d.dL();
         this.d.aX = this.d.dL();
         if (this.k != cbi.a.b) {
            this.d.G(0.0F);
         } else {
            this.k = cbi.a.a;
            if (this.d.aJ()) {
               this.d.C((float)(this.h * this.d.h(bwp.v)));
               if (this.m-- <= 0) {
                  this.m = this.n.t();
                  if (this.o) {
                     this.m /= 3;
                  }

                  this.n.O().a();
                  if (this.n.gu()) {
                     this.n.a(this.n.gr(), this.n.fg(), this.n.m());
                  }
               } else {
                  this.n.bn = 0.0F;
                  this.n.bp = 0.0F;
                  this.d.C(0.0F);
               }
            } else {
               this.d.C((float)(this.h * this.d.h(bwp.v)));
            }
         }
      }
   }

   static class e extends ccf {
      private final cmh a;
      private float b;
      private int c;

      public e(cmh $$0) {
         this.a = $$0;
         this.a(EnumSet.of(ccf.a.b));
      }

      @Override
      public boolean b() {
         return this.a.O_() == null && (this.a.aJ() || this.a.bj() || this.a.bx() || this.a.b(bts.y)) && this.a.N() instanceof cmh.d;
      }

      @Override
      public void a() {
         if (--this.c <= 0) {
            this.c = this.a(40 + this.a.dY().a(60));
            this.b = (float)this.a.dY().a(360);
         }

         if (this.a.N() instanceof cmh.d $$0) {
            $$0.a(this.b, false);
         }
      }
   }
}
