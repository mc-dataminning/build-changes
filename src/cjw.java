import com.google.common.annotations.VisibleForTesting;
import java.util.EnumSet;
import javax.annotation.Nullable;

public class cjw extends bta implements cjf {
   private static final ajp<Integer> cb = ajt.a(cjw.class, ajr.b);
   public static final int b = 1;
   public static final int c = 127;
   public static final int d = 4;
   public float e;
   public float bZ;
   public float ca;
   private boolean cc;

   public cjw(bsj<? extends cjw> $$0, dcd $$1) {
      super($$0, $$1);
      this.cG();
      this.bR = new cjw.d(this);
   }

   @Override
   protected void z() {
      this.bU.a(1, new cjw.b(this));
      this.bU.a(2, new cjw.a(this));
      this.bU.a(3, new cjw.e(this));
      this.bU.a(5, new cjw.c(this));
      this.bV.a(1, new cbp<>(this, cmh.class, 10, true, false, $$0 -> Math.abs($$0.dw() - this.dw()) <= 4.0));
      this.bV.a(3, new cbp<>(this, cfa.class, true));
   }

   @Override
   public avg de() {
      return avg.f;
   }

   @Override
   protected void a(ajt.a $$0) {
      super.a($$0);
      $$0.a(cb, 1);
   }

   @VisibleForTesting
   public void a(int $$0, boolean $$1) {
      int $$2 = aye.a($$0, 1, 127);
      this.ao.a(cb, $$2);
      this.at();
      this.j_();
      this.f(bug.s).a((double)($$2 * $$2));
      this.f(bug.v).a((double)(0.2F + 0.1F * (float)$$2));
      this.f(bug.c).a((double)$$2);
      if ($$1) {
         this.u(this.eN());
      }

      this.bP = $$2;
   }

   public int go() {
      return this.ao.a(cb);
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      $$0.a("Size", this.go() - 1);
      $$0.a("wasOnGround", this.cc);
   }

   @Override
   public void a(tx $$0) {
      this.a($$0.h("Size") + 1, false);
      super.a($$0);
      this.cc = $$0.q("wasOnGround");
   }

   public boolean gp() {
      return this.go() <= 1;
   }

   protected lh u() {
      return lj.U;
   }

   @Override
   protected boolean X() {
      return this.go() > 0;
   }

   @Override
   public void l() {
      this.bZ = this.bZ + (this.e - this.bZ) * 0.5F;
      this.ca = this.bZ;
      super.l();
      if (this.aE() && !this.cc) {
         float $$0 = this.a(this.ar()).a() * 2.0F;
         float $$1 = $$0 / 2.0F;

         for (int $$2 = 0; (float)$$2 < $$0 * 16.0F; $$2++) {
            float $$3 = this.ah.i() * (float) (Math.PI * 2);
            float $$4 = this.ah.i() * 0.5F + 0.5F;
            float $$5 = aye.a($$3) * $$1 * $$4;
            float $$6 = aye.b($$3) * $$1 * $$4;
            this.dP().a(this.u(), this.du() + (double)$$5, this.dw(), this.dA() + (double)$$6, 0.0, 0.0, 0.0);
         }

         this.a(this.gm(), this.fa(), ((this.ah.i() - this.ah.i()) * 0.2F + 1.0F) / 0.8F);
         this.e = -0.5F;
      } else if (!this.aE() && this.cc) {
         this.e = 1.0F;
      }

      this.cc = this.aE();
      this.gj();
   }

   @Override
   protected void gj() {
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
   public void a(ajp<?> $$0) {
      if (cb.equals($$0)) {
         this.j_();
         this.s(this.ba);
         this.aY = this.ba;
         if (this.be() && this.ah.a(20) == 0) {
            this.bn();
         }
      }

      super.a($$0);
   }

   @Override
   public bsj<? extends cjw> ak() {
      return (bsj<? extends cjw>)super.ak();
   }

   @Override
   public void a(bsd.c $$0) {
      int $$1 = this.go();
      if (!this.dP().B && $$1 > 1 && this.ex()) {
         wu $$2 = this.ah();
         boolean $$3 = this.gc();
         float $$4 = this.a(this.ar()).a();
         float $$5 = $$4 / 2.0F;
         int $$6 = $$1 / 2;
         int $$7 = 2 + this.ah.a(3);

         for (int $$8 = 0; $$8 < $$7; $$8++) {
            float $$9 = ((float)($$8 % 2) - 0.5F) * $$5;
            float $$10 = ((float)($$8 / 2) - 0.5F) * $$5;
            cjw $$11 = this.ak().a(this.dP());
            if ($$11 != null) {
               if (this.fS()) {
                  $$11.fQ();
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
   public void h(bsd $$0) {
      super.h($$0);
      if ($$0 instanceof cfa && this.gk()) {
         this.j((bsy)$$0);
      }
   }

   @Override
   public void b_(cmh $$0) {
      if (this.gk()) {
         this.j($$0);
      }
   }

   protected void j(bsy $$0) {
      if (this.bD()) {
         int $$1 = this.go();
         if (this.g((bsd)$$0) < 0.6 * (double)$$1 * 0.6 * (double)$$1 && this.F($$0)) {
            bqw $$2 = this.dQ().b((bsy)this);
            if ($$0.a($$2, this.gl())) {
               this.a(avf.xp, 1.0F, (this.ah.i() - this.ah.i()) * 0.2F + 1.0F);
               if (this.dP() instanceof aqk $$3) {
                  czl.a($$3, (bsd)$$0, $$2);
               }
            }
         }
      }
   }

   @Override
   protected evz a(bsd $$0, bsg $$1, float $$2) {
      return new evz(0.0, (double)$$1.b() - 0.015625 * (double)this.go() * (double)$$2, 0.0);
   }

   protected boolean gk() {
      return !this.gp() && this.db();
   }

   protected float gl() {
      return (float)this.g(bug.c);
   }

   @Override
   protected ave d(bqw $$0) {
      return this.gp() ? avf.yg : avf.xr;
   }

   @Override
   protected ave o_() {
      return this.gp() ? avf.yf : avf.xq;
   }

   protected ave gm() {
      return this.gp() ? avf.yi : avf.xt;
   }

   public static boolean c(bsj<cjw> $$0, dce $$1, btc $$2, ja $$3, aym $$4) {
      if (btc.a($$2)) {
         return a($$0, $$1, $$2, $$3, $$4);
      } else {
         if ($$1.al() != bqa.a) {
            if ($$2 == btc.c) {
               return a($$0, $$1, $$2, $$3, $$4);
            }

            if ($$1.t($$3).a(avt.aq) && $$3.v() > 50 && $$3.v() < 70 && $$4.i() < 0.5F && $$4.i() < $$1.aq() && $$1.A($$3) <= $$4.a(8)) {
               return a($$0, $$1, $$2, $$3, $$4);
            }

            if (!($$1 instanceof dcz)) {
               return false;
            }

            dbk $$5 = new dbk($$3);
            boolean $$6 = dyy.a($$5.e, $$5.f, ((dcz)$$1).C(), 987234911L).a(10) == 0;
            if ($$4.a(10) == 0 && $$6 && $$3.v() < 40) {
               return a($$0, $$1, $$2, $$3, $$4);
            }
         }

         return false;
      }
   }

   @Override
   protected float fa() {
      return 0.4F * (float)this.go();
   }

   @Override
   public int aa() {
      return 0;
   }

   protected boolean gq() {
      return this.go() > 0;
   }

   @Override
   protected void ff() {
      evz $$0 = this.ds();
      this.o($$0.c, (double)this.fd(), $$0.e);
      this.av = true;
   }

   @Nullable
   @Override
   public btr a(dcs $$0, bqb $$1, btc $$2, @Nullable btr $$3) {
      aym $$4 = $$0.E_();
      int $$5 = $$4.a(3);
      if ($$5 < 2 && $$4.i() < 0.5F * $$1.d()) {
         $$5++;
      }

      int $$6 = 1 << $$5;
      this.a($$6, true);
      return super.a($$0, $$1, $$2, $$3);
   }

   float s() {
      float $$0 = this.gp() ? 1.4F : 0.8F;
      return ((this.ah.i() - this.ah.i()) * 0.2F + 1.0F) * $$0;
   }

   protected ave gn() {
      return this.gp() ? avf.yh : avf.xs;
   }

   @Override
   public bsg e(btk $$0) {
      return super.e($$0).a((float)this.go());
   }

   static class a extends bzw {
      private final cjw a;
      private int b;

      public a(cjw $$0) {
         this.a = $$0;
         this.a(EnumSet.of(bzw.a.b));
      }

      @Override
      public boolean a() {
         bsy $$0 = this.a.p();
         if ($$0 == null) {
            return false;
         } else {
            return !this.a.c($$0) ? false : this.a.H() instanceof cjw.d;
         }
      }

      @Override
      public void c() {
         this.b = b(300);
         super.c();
      }

      @Override
      public boolean b() {
         bsy $$0 = this.a.p();
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
         bsy $$0 = this.a.p();
         if ($$0 != null) {
            this.a.a($$0, 10.0F, 10.0F);
         }

         if (this.a.H() instanceof cjw.d $$1) {
            $$1.a(this.a.dF(), this.a.gk());
         }
      }
   }

   static class b extends bzw {
      private final cjw a;

      public b(cjw $$0) {
         this.a = $$0;
         this.a(EnumSet.of(bzw.a.c, bzw.a.a));
         $$0.K().a(true);
      }

      @Override
      public boolean a() {
         return (this.a.be() || this.a.bs()) && this.a.H() instanceof cjw.d;
      }

      @Override
      public boolean R_() {
         return true;
      }

      @Override
      public void e() {
         if (this.a.dS().i() < 0.8F) {
            this.a.I().a();
         }

         if (this.a.H() instanceof cjw.d $$0) {
            $$0.a(1.2);
         }
      }
   }

   static class c extends bzw {
      private final cjw a;

      public c(cjw $$0) {
         this.a = $$0;
         this.a(EnumSet.of(bzw.a.c, bzw.a.a));
      }

      @Override
      public boolean a() {
         return !this.a.bR();
      }

      @Override
      public void e() {
         if (this.a.H() instanceof cjw.d $$0) {
            $$0.a(1.0);
         }
      }
   }

   static class d extends byz {
      private float l;
      private int m;
      private final cjw n;
      private boolean o;

      public d(cjw $$0) {
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
         this.k = byz.a.b;
      }

      @Override
      public void a() {
         this.d.s(this.a(this.d.dF(), this.l, 90.0F));
         this.d.ba = this.d.dF();
         this.d.aY = this.d.dF();
         if (this.k != byz.a.b) {
            this.d.D(0.0F);
         } else {
            this.k = byz.a.a;
            if (this.d.aE()) {
               this.d.z((float)(this.h * this.d.g(bug.v)));
               if (this.m-- <= 0) {
                  this.m = this.n.y();
                  if (this.o) {
                     this.m /= 3;
                  }

                  this.n.I().a();
                  if (this.n.gq()) {
                     this.n.a(this.n.gn(), this.n.fa(), this.n.s());
                  }
               } else {
                  this.n.bo = 0.0F;
                  this.n.bq = 0.0F;
                  this.d.z(0.0F);
               }
            } else {
               this.d.z((float)(this.h * this.d.g(bug.v)));
            }
         }
      }
   }

   static class e extends bzw {
      private final cjw a;
      private float b;
      private int c;

      public e(cjw $$0) {
         this.a = $$0;
         this.a(EnumSet.of(bzw.a.b));
      }

      @Override
      public boolean a() {
         return this.a.p() == null && (this.a.aE() || this.a.be() || this.a.bs() || this.a.b(brn.y)) && this.a.H() instanceof cjw.d;
      }

      @Override
      public void e() {
         if (--this.c <= 0) {
            this.c = this.a(40 + this.a.dS().a(60));
            this.b = (float)this.a.dS().a(360);
         }

         if (this.a.H() instanceof cjw.d $$0) {
            $$0.a(this.b, false);
         }
      }
   }
}
