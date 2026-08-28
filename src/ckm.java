import com.google.common.annotations.VisibleForTesting;
import java.util.EnumSet;
import javax.annotation.Nullable;

public class ckm extends btp implements cjv {
   private static final ajw<Integer> cb = aka.a(ckm.class, ajy.b);
   public static final int b = 1;
   public static final int c = 127;
   public static final int d = 4;
   public float e;
   public float bZ;
   public float ca;
   private boolean cc;

   public ckm(bsx<? extends ckm> $$0, dcw $$1) {
      super($$0, $$1);
      this.cG();
      this.bR = new ckm.d(this);
   }

   @Override
   protected void B() {
      this.bU.a(1, new ckm.b(this));
      this.bU.a(2, new ckm.a(this));
      this.bU.a(3, new ckm.e(this));
      this.bU.a(5, new ckm.c(this));
      this.bV.a(1, new ccf<>(this, cmx.class, 10, true, false, $$0 -> Math.abs($$0.dv() - this.dv()) <= 4.0));
      this.bV.a(3, new ccf<>(this, cfq.class, true));
   }

   @Override
   public avq de() {
      return avq.f;
   }

   @Override
   protected void a(aka.a $$0) {
      super.a($$0);
      $$0.a(cb, 1);
   }

   @VisibleForTesting
   public void a(int $$0, boolean $$1) {
      int $$2 = ayo.a($$0, 1, 127);
      this.ao.a(cb, $$2);
      this.av();
      this.i_();
      this.f(buw.s).a((double)($$2 * $$2));
      this.f(buw.v).a((double)(0.2F + 0.1F * (float)$$2));
      this.f(buw.c).a((double)$$2);
      if ($$1) {
         this.v(this.eN());
      }

      this.bP = $$2;
   }

   public int gl() {
      return this.ao.a(cb);
   }

   @Override
   public void b(ub $$0) {
      super.b($$0);
      $$0.a("Size", this.gl() - 1);
      $$0.a("wasOnGround", this.cc);
   }

   @Override
   public void a(ub $$0) {
      this.a($$0.h("Size") + 1, false);
      super.a($$0);
      this.cc = $$0.q("wasOnGround");
   }

   public boolean gm() {
      return this.gl() <= 1;
   }

   protected lk t() {
      return lm.U;
   }

   @Override
   protected boolean Z() {
      return this.gl() > 0;
   }

   @Override
   public void l() {
      this.bZ = this.bZ + (this.e - this.bZ) * 0.5F;
      this.ca = this.bZ;
      super.l();
      if (this.aF() && !this.cc) {
         float $$0 = this.a(this.at()).a() * 2.0F;
         float $$1 = $$0 / 2.0F;

         for (int $$2 = 0; (float)$$2 < $$0 * 16.0F; $$2++) {
            float $$3 = this.ah.i() * (float) (Math.PI * 2);
            float $$4 = this.ah.i() * 0.5F + 0.5F;
            float $$5 = ayo.a($$3) * $$1 * $$4;
            float $$6 = ayo.b($$3) * $$1 * $$4;
            this.dO().a(this.t(), this.dt() + (double)$$5, this.dv(), this.dz() + (double)$$6, 0.0, 0.0, 0.0);
         }

         this.a(this.gj(), this.fa(), ((this.ah.i() - this.ah.i()) * 0.2F + 1.0F) / 0.8F);
         this.e = -0.5F;
      } else if (!this.aF() && this.cc) {
         this.e = 1.0F;
      }

      this.cc = this.aF();
      this.gg();
   }

   protected void gg() {
      this.e *= 0.6F;
   }

   protected int x() {
      return this.ah.a(20) + 10;
   }

   @Override
   public void i_() {
      double $$0 = this.dt();
      double $$1 = this.dv();
      double $$2 = this.dz();
      super.i_();
      this.a_($$0, $$1, $$2);
   }

   @Override
   public void a(ajw<?> $$0) {
      if (cb.equals($$0)) {
         this.i_();
         this.t(this.ba);
         this.aY = this.ba;
         if (this.bf() && this.ah.a(20) == 0) {
            this.bo();
         }
      }

      super.a($$0);
   }

   @Override
   public bsx<? extends ckm> am() {
      return (bsx<? extends ckm>)super.am();
   }

   @Override
   public void a(bsr.c $$0) {
      int $$1 = this.gl();
      if (!this.dO().B && $$1 > 1 && this.ex()) {
         wz $$2 = this.aj();
         boolean $$3 = this.fZ();
         float $$4 = this.a(this.at()).a();
         float $$5 = $$4 / 2.0F;
         int $$6 = $$1 / 2;
         int $$7 = 2 + this.ah.a(3);

         for (int $$8 = 0; $$8 < $$7; $$8++) {
            float $$9 = ((float)($$8 % 2) - 0.5F) * $$5;
            float $$10 = ((float)($$8 / 2) - 0.5F) * $$5;
            ckm $$11 = this.am().a(this.dO());
            if ($$11 != null) {
               if (this.fT()) {
                  $$11.fR();
               }

               $$11.b($$2);
               $$11.u($$3);
               $$11.n(this.cv());
               $$11.a($$6, true);
               $$11.b(this.dt() + (double)$$9, this.dv() + 0.5, this.dz() + (double)$$10, this.ah.i() * 360.0F, 0.0F);
               this.dO().b($$11);
            }
         }
      }

      super.a($$0);
   }

   @Override
   public void h(bsr $$0) {
      super.h($$0);
      if ($$0 instanceof cfq && this.gh()) {
         this.j((btn)$$0);
      }
   }

   @Override
   public void b_(cmx $$0) {
      if (this.gh()) {
         this.j($$0);
      }
   }

   protected void j(btn $$0) {
      if (this.bE() && this.i($$0) && this.F($$0)) {
         brk $$1 = this.dP().b((btn)this);
         if ($$0.a($$1, this.gi())) {
            this.a(avp.xp, 1.0F, (this.ah.i() - this.ah.i()) * 0.2F + 1.0F);
            if (this.dO() instanceof aqu $$2) {
               dae.a($$2, (bsr)$$0, $$1);
            }
         }
      }
   }

   @Override
   protected exc a(bsr $$0, bsu $$1, float $$2) {
      return new exc(0.0, (double)$$1.b() - 0.015625 * (double)this.gl() * (double)$$2, 0.0);
   }

   protected boolean gh() {
      return !this.gm() && this.db();
   }

   protected float gi() {
      return (float)this.g(buw.c);
   }

   @Override
   protected avo d(brk $$0) {
      return this.gm() ? avp.yg : avp.xr;
   }

   @Override
   protected avo n_() {
      return this.gm() ? avp.yf : avp.xq;
   }

   protected avo gj() {
      return this.gm() ? avp.yi : avp.xt;
   }

   public static boolean c(bsx<ckm> $$0, dcx $$1, btr $$2, jd $$3, ayw $$4) {
      if (btr.a($$2)) {
         return a($$0, $$1, $$2, $$3, $$4);
      } else {
         if ($$1.al() != bqo.a) {
            if ($$2 == btr.c) {
               return a($$0, $$1, $$2, $$3, $$4);
            }

            if ($$1.t($$3).a(awd.aq) && $$3.v() > 50 && $$3.v() < 70 && $$4.i() < 0.5F && $$4.i() < $$1.aq() && $$1.A($$3) <= $$4.a(8)) {
               return a($$0, $$1, $$2, $$3, $$4);
            }

            if (!($$1 instanceof dds)) {
               return false;
            }

            dcd $$5 = new dcd($$3);
            boolean $$6 = dzx.a($$5.e, $$5.f, ((dds)$$1).C(), 987234911L).a(10) == 0;
            if ($$4.a(10) == 0 && $$6 && $$3.v() < 40) {
               return a($$0, $$1, $$2, $$3, $$4);
            }
         }

         return false;
      }
   }

   @Override
   protected float fa() {
      return 0.4F * (float)this.gl();
   }

   @Override
   public int ac() {
      return 0;
   }

   protected boolean gn() {
      return this.gl() > 0;
   }

   @Override
   protected void ff() {
      exc $$0 = this.dr();
      this.n($$0.c, (double)this.fd(), $$0.e);
      this.av = true;
   }

   @Nullable
   @Override
   public buh a(ddl $$0, bqp $$1, btr $$2, @Nullable buh $$3) {
      ayw $$4 = $$0.E_();
      int $$5 = $$4.a(3);
      if ($$5 < 2 && $$4.i() < 0.5F * $$1.d()) {
         $$5++;
      }

      int $$6 = 1 << $$5;
      this.a($$6, true);
      return super.a($$0, $$1, $$2, $$3);
   }

   float s() {
      float $$0 = this.gm() ? 1.4F : 0.8F;
      return ((this.ah.i() - this.ah.i()) * 0.2F + 1.0F) * $$0;
   }

   protected avo gk() {
      return this.gm() ? avp.yh : avp.xs;
   }

   @Override
   public bsu e(bua $$0) {
      return super.e($$0).a((float)this.gl());
   }

   static class a extends cam {
      private final ckm a;
      private int b;

      public a(ckm $$0) {
         this.a = $$0;
         this.a(EnumSet.of(cam.a.b));
      }

      @Override
      public boolean b() {
         btn $$0 = this.a.p();
         if ($$0 == null) {
            return false;
         } else {
            return !this.a.c($$0) ? false : this.a.J() instanceof ckm.d;
         }
      }

      @Override
      public void d() {
         this.b = b(300);
         super.d();
      }

      @Override
      public boolean c() {
         btn $$0 = this.a.p();
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
         btn $$0 = this.a.p();
         if ($$0 != null) {
            this.a.a($$0, 10.0F, 10.0F);
         }

         if (this.a.J() instanceof ckm.d $$1) {
            $$1.a(this.a.dE(), this.a.gh());
         }
      }
   }

   static class b extends cam {
      private final ckm a;

      public b(ckm $$0) {
         this.a = $$0;
         this.a(EnumSet.of(cam.a.c, cam.a.a));
         $$0.N().a(true);
      }

      @Override
      public boolean b() {
         return (this.a.bf() || this.a.bt()) && this.a.J() instanceof ckm.d;
      }

      @Override
      public boolean V_() {
         return true;
      }

      @Override
      public void a() {
         if (this.a.dR().i() < 0.8F) {
            this.a.L().a();
         }

         if (this.a.J() instanceof ckm.d $$0) {
            $$0.a(1.2);
         }
      }
   }

   static class c extends cam {
      private final ckm a;

      public c(ckm $$0) {
         this.a = $$0;
         this.a(EnumSet.of(cam.a.c, cam.a.a));
      }

      @Override
      public boolean b() {
         return !this.a.bS();
      }

      @Override
      public void a() {
         if (this.a.J() instanceof ckm.d $$0) {
            $$0.a(1.0);
         }
      }
   }

   static class d extends bzp {
      private float l;
      private int m;
      private final ckm n;
      private boolean o;

      public d(ckm $$0) {
         super($$0);
         this.n = $$0;
         this.l = 180.0F * $$0.dE() / (float) Math.PI;
      }

      public void a(float $$0, boolean $$1) {
         this.l = $$0;
         this.o = $$1;
      }

      public void a(double $$0) {
         this.h = $$0;
         this.k = bzp.a.b;
      }

      @Override
      public void a() {
         this.d.t(this.a(this.d.dE(), this.l, 90.0F));
         this.d.ba = this.d.dE();
         this.d.aY = this.d.dE();
         if (this.k != bzp.a.b) {
            this.d.E(0.0F);
         } else {
            this.k = bzp.a.a;
            if (this.d.aF()) {
               this.d.A((float)(this.h * this.d.g(buw.v)));
               if (this.m-- <= 0) {
                  this.m = this.n.x();
                  if (this.o) {
                     this.m /= 3;
                  }

                  this.n.L().a();
                  if (this.n.gn()) {
                     this.n.a(this.n.gk(), this.n.fa(), this.n.s());
                  }
               } else {
                  this.n.bo = 0.0F;
                  this.n.bq = 0.0F;
                  this.d.A(0.0F);
               }
            } else {
               this.d.A((float)(this.h * this.d.g(buw.v)));
            }
         }
      }
   }

   static class e extends cam {
      private final ckm a;
      private float b;
      private int c;

      public e(ckm $$0) {
         this.a = $$0;
         this.a(EnumSet.of(cam.a.b));
      }

      @Override
      public boolean b() {
         return this.a.p() == null && (this.a.aF() || this.a.bf() || this.a.bt() || this.a.b(bsb.y)) && this.a.J() instanceof ckm.d;
      }

      @Override
      public void a() {
         if (--this.c <= 0) {
            this.c = this.a(40 + this.a.dR().a(60));
            this.b = (float)this.a.dR().a(360);
         }

         if (this.a.J() instanceof ckm.d $$0) {
            $$0.a(this.b, false);
         }
      }
   }
}
