import com.google.common.annotations.VisibleForTesting;
import java.util.EnumSet;
import javax.annotation.Nullable;

public class ckn extends bts implements cjw {
   private static final akk<Integer> bZ = ako.a(ckn.class, akm.b);
   public static final int b = 1;
   public static final int c = 127;
   public static final int d = 4;
   public float e;
   public float bX;
   public float bY;
   private boolean ca;

   public ckn(btb<? extends ckn> $$0, dbz $$1) {
      super($$0, $$1);
      this.cG();
      this.bP = new ckn.d(this);
   }

   @Override
   protected void z() {
      this.bS.a(1, new ckn.b(this));
      this.bS.a(2, new ckn.a(this));
      this.bS.a(3, new ckn.e(this));
      this.bS.a(5, new ckn.c(this));
      this.bT.a(1, new cch<>(this, cmy.class, 10, true, false, $$0 -> Math.abs($$0.dw() - this.dw()) <= 4.0));
      this.bT.a(3, new cch<>(this, cfs.class, true));
   }

   @Override
   public awb de() {
      return awb.f;
   }

   @Override
   protected void a(ako.a $$0) {
      super.a($$0);
      $$0.a(bZ, 1);
   }

   @VisibleForTesting
   public void a(int $$0, boolean $$1) {
      int $$2 = ayz.a($$0, 1, 127);
      this.ao.a(bZ, $$2);
      this.at();
      this.j_();
      this.f(buy.q).a((double)($$2 * $$2));
      this.f(buy.r).a((double)(0.2F + 0.1F * (float)$$2));
      this.f(buy.c).a((double)$$2);
      if ($$1) {
         this.t(this.eR());
      }

      this.bN = $$2;
   }

   public int gr() {
      return this.ao.a(bZ);
   }

   @Override
   public void b(us $$0) {
      super.b($$0);
      $$0.a("Size", this.gr() - 1);
      $$0.a("wasOnGround", this.ca);
   }

   @Override
   public void a(us $$0) {
      this.a($$0.h("Size") + 1, false);
      super.a($$0);
      this.ca = $$0.q("wasOnGround");
   }

   public boolean gs() {
      return this.gr() <= 1;
   }

   protected lg u() {
      return li.U;
   }

   @Override
   protected boolean X() {
      return this.gr() > 0;
   }

   @Override
   public void l() {
      this.bX = this.bX + (this.e - this.bX) * 0.5F;
      this.bY = this.bX;
      super.l();
      if (this.aE() && !this.ca) {
         float $$0 = this.a(this.ar()).a() * 2.0F;
         float $$1 = $$0 / 2.0F;

         for (int $$2 = 0; (float)$$2 < $$0 * 16.0F; $$2++) {
            float $$3 = this.ah.i() * (float) (Math.PI * 2);
            float $$4 = this.ah.i() * 0.5F + 0.5F;
            float $$5 = ayz.a($$3) * $$1 * $$4;
            float $$6 = ayz.b($$3) * $$1 * $$4;
            this.dP().a(this.u(), this.du() + (double)$$5, this.dw(), this.dA() + (double)$$6, 0.0, 0.0, 0.0);
         }

         this.a(this.gp(), this.fe(), ((this.ah.i() - this.ah.i()) * 0.2F + 1.0F) / 0.8F);
         this.e = -0.5F;
      } else if (!this.aE() && this.ca) {
         this.e = 1.0F;
      }

      this.ca = this.aE();
      this.gm();
   }

   @Override
   protected void gm() {
      this.e *= 0.6F;
   }

   protected int y() {
      return this.ah.a(20) + 10;
   }

   @Override
   public void j_() {
      double $$0 = this.du();
      double $$1 = this.dw();
      double $$2 = this.dA();
      super.j_();
      this.a_($$0, $$1, $$2);
   }

   @Override
   public void a(akk<?> $$0) {
      if (bZ.equals($$0)) {
         this.j_();
         this.r(this.ba);
         this.aY = this.ba;
         if (this.be() && this.ah.a(20) == 0) {
            this.bn();
         }
      }

      super.a($$0);
   }

   @Override
   public btb<? extends ckn> ak() {
      return (btb<? extends ckn>)super.ak();
   }

   @Override
   public void a(bsv.c $$0) {
      int $$1 = this.gr();
      if (!this.dP().B && $$1 > 1 && this.eB()) {
         xp $$2 = this.ah();
         boolean $$3 = this.gg();
         float $$4 = this.a(this.ar()).a();
         float $$5 = $$4 / 2.0F;
         int $$6 = $$1 / 2;
         int $$7 = 2 + this.ah.a(3);

         for (int $$8 = 0; $$8 < $$7; $$8++) {
            float $$9 = ((float)($$8 % 2) - 0.5F) * $$5;
            float $$10 = ((float)($$8 / 2) - 0.5F) * $$5;
            ckn $$11 = this.ak().a(this.dP());
            if ($$11 != null) {
               if (this.fW()) {
                  $$11.fU();
               }

               $$11.b($$2);
               $$11.t($$3);
               $$11.n(this.cu());
               $$11.a($$6, true);
               $$11.b(this.du() + (double)$$9, this.dw() + 0.5, this.dA() + (double)$$10, this.ah.i() * 360.0F, 0.0F);
               this.dP().b($$11);
            }
         }
      }

      super.a($$0);
   }

   @Override
   public void h(bsv $$0) {
      super.h($$0);
      if ($$0 instanceof cfs && this.gn()) {
         this.j((btq)$$0);
      }
   }

   @Override
   public void b_(cmy $$0) {
      if (this.gn()) {
         this.j($$0);
      }
   }

   protected void j(btq $$0) {
      if (this.bD()) {
         int $$1 = this.gr();
         if (this.g((bsv)$$0) < 0.6 * (double)$$1 * 0.6 * (double)$$1 && this.E($$0) && $$0.a(this.dQ().b((btq)this), this.go())) {
            this.a(awa.xm, 1.0F, (this.ah.i() - this.ah.i()) * 0.2F + 1.0F);
            this.a(this, $$0);
         }
      }
   }

   @Override
   protected evs a(bsv $$0, bsy $$1, float $$2) {
      return new evs(0.0, (double)$$1.b() - 0.015625 * (double)this.gr() * (double)$$2, 0.0);
   }

   protected boolean gn() {
      return !this.gs() && this.db();
   }

   protected float go() {
      return (float)this.g(buy.c);
   }

   @Override
   protected avz d(bro $$0) {
      return this.gs() ? awa.yd : awa.xo;
   }

   @Override
   protected avz o_() {
      return this.gs() ? awa.yc : awa.xn;
   }

   protected avz gp() {
      return this.gs() ? awa.yf : awa.xq;
   }

   public static boolean c(btb<ckn> $$0, dca $$1, btu $$2, iz $$3, azh $$4) {
      if (btu.a($$2)) {
         return a($$0, $$1, $$2, $$3, $$4);
      } else {
         if ($$1.al() != bqs.a) {
            if ($$2 == btu.c) {
               return a($$0, $$1, $$2, $$3, $$4);
            }

            if ($$1.t($$3).a(awo.aq) && $$3.v() > 50 && $$3.v() < 70 && $$4.i() < 0.5F && $$4.i() < $$1.aq() && $$1.A($$3) <= $$4.a(8)) {
               return a($$0, $$1, $$2, $$3, $$4);
            }

            if (!($$1 instanceof dcu)) {
               return false;
            }

            dbg $$5 = new dbg($$3);
            boolean $$6 = dyu.a($$5.e, $$5.f, ((dcu)$$1).C(), 987234911L).a(10) == 0;
            if ($$4.a(10) == 0 && $$6 && $$3.v() < 40) {
               return a($$0, $$1, $$2, $$3, $$4);
            }
         }

         return false;
      }
   }

   @Override
   protected float fe() {
      return 0.4F * (float)this.gr();
   }

   @Override
   public int aa() {
      return 0;
   }

   protected boolean gt() {
      return this.gr() > 0;
   }

   @Override
   protected void fj() {
      evs $$0 = this.ds();
      this.o($$0.c, (double)this.fh(), $$0.e);
      this.av = true;
   }

   @Nullable
   @Override
   public buj a(dco $$0, bqt $$1, btu $$2, @Nullable buj $$3) {
      azh $$4 = $$0.E_();
      int $$5 = $$4.a(3);
      if ($$5 < 2 && $$4.i() < 0.5F * $$1.d()) {
         $$5++;
      }

      int $$6 = 1 << $$5;
      this.a($$6, true);
      return super.a($$0, $$1, $$2, $$3);
   }

   float s() {
      float $$0 = this.gs() ? 1.4F : 0.8F;
      return ((this.ah.i() - this.ah.i()) * 0.2F + 1.0F) * $$0;
   }

   protected avz gq() {
      return this.gs() ? awa.ye : awa.xp;
   }

   @Override
   public bsy e(buc $$0) {
      return super.e($$0).a((float)this.gr());
   }

   static class a extends cao {
      private final ckn a;
      private int b;

      public a(ckn $$0) {
         this.a = $$0;
         this.a(EnumSet.of(cao.a.b));
      }

      @Override
      public boolean a() {
         btq $$0 = this.a.p();
         if ($$0 == null) {
            return false;
         } else {
            return !this.a.c($$0) ? false : this.a.H() instanceof ckn.d;
         }
      }

      @Override
      public void c() {
         this.b = b(300);
         super.c();
      }

      @Override
      public boolean b() {
         btq $$0 = this.a.p();
         if ($$0 == null) {
            return false;
         } else {
            return !this.a.c($$0) ? false : --this.b > 0;
         }
      }

      @Override
      public boolean R_() {
         return true;
      }

      @Override
      public void e() {
         btq $$0 = this.a.p();
         if ($$0 != null) {
            this.a.a($$0, 10.0F, 10.0F);
         }

         if (this.a.H() instanceof ckn.d $$1) {
            $$1.a(this.a.dF(), this.a.gn());
         }
      }
   }

   static class b extends cao {
      private final ckn a;

      public b(ckn $$0) {
         this.a = $$0;
         this.a(EnumSet.of(cao.a.c, cao.a.a));
         $$0.K().a(true);
      }

      @Override
      public boolean a() {
         return (this.a.be() || this.a.bs()) && this.a.H() instanceof ckn.d;
      }

      @Override
      public boolean R_() {
         return true;
      }

      @Override
      public void e() {
         if (this.a.el().i() < 0.8F) {
            this.a.I().a();
         }

         if (this.a.H() instanceof ckn.d $$0) {
            $$0.a(1.2);
         }
      }
   }

   static class c extends cao {
      private final ckn a;

      public c(ckn $$0) {
         this.a = $$0;
         this.a(EnumSet.of(cao.a.c, cao.a.a));
      }

      @Override
      public boolean a() {
         return !this.a.bR();
      }

      @Override
      public void e() {
         if (this.a.H() instanceof ckn.d $$0) {
            $$0.a(1.0);
         }
      }
   }

   static class d extends bzr {
      private float l;
      private int m;
      private final ckn n;
      private boolean o;

      public d(ckn $$0) {
         super($$0);
         this.n = $$0;
         this.l = 180.0F * $$0.dF() / (float) Math.PI;
      }

      public void a(float $$0, boolean $$1) {
         this.l = $$0;
         this.o = $$1;
      }

      public void a(double $$0) {
         this.h = $$0;
         this.k = bzr.a.b;
      }

      @Override
      public void a() {
         this.d.r(this.a(this.d.dF(), this.l, 90.0F));
         this.d.ba = this.d.dF();
         this.d.aY = this.d.dF();
         if (this.k != bzr.a.b) {
            this.d.C(0.0F);
         } else {
            this.k = bzr.a.a;
            if (this.d.aE()) {
               this.d.y((float)(this.h * this.d.g(buy.r)));
               if (this.m-- <= 0) {
                  this.m = this.n.y();
                  if (this.o) {
                     this.m /= 3;
                  }

                  this.n.I().a();
                  if (this.n.gt()) {
                     this.n.a(this.n.gq(), this.n.fe(), this.n.s());
                  }
               } else {
                  this.n.bo = 0.0F;
                  this.n.bq = 0.0F;
                  this.d.y(0.0F);
               }
            } else {
               this.d.y((float)(this.h * this.d.g(buy.r)));
            }
         }
      }
   }

   static class e extends cao {
      private final ckn a;
      private float b;
      private int c;

      public e(ckn $$0) {
         this.a = $$0;
         this.a(EnumSet.of(cao.a.b));
      }

      @Override
      public boolean a() {
         return this.a.p() == null && (this.a.aE() || this.a.be() || this.a.bs() || this.a.b(bsf.y)) && this.a.H() instanceof ckn.d;
      }

      @Override
      public void e() {
         if (--this.c <= 0) {
            this.c = this.a(40 + this.a.el().a(60));
            this.b = (float)this.a.el().a(360);
         }

         if (this.a.H() instanceof ckn.d $$0) {
            $$0.a(this.b, false);
         }
      }
   }
}
