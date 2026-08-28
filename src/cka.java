import com.google.common.annotations.VisibleForTesting;
import java.util.EnumSet;
import javax.annotation.Nullable;

public class cka extends bte implements cjj {
   private static final ajp<Integer> cb = ajt.a(cka.class, ajr.b);
   public static final int b = 1;
   public static final int c = 127;
   public static final int d = 4;
   public float e;
   public float bZ;
   public float ca;
   private boolean cc;

   public cka(bsn<? extends cka> $$0, dcg $$1) {
      super($$0, $$1);
      this.cI();
      this.bR = new cka.d(this);
   }

   @Override
   protected void z() {
      this.bU.a(1, new cka.b(this));
      this.bU.a(2, new cka.a(this));
      this.bU.a(3, new cka.e(this));
      this.bU.a(5, new cka.c(this));
      this.bV.a(1, new cbt<>(this, cml.class, 10, true, false, $$0 -> Math.abs($$0.dy() - this.dy()) <= 4.0));
      this.bV.a(3, new cbt<>(this, cfe.class, true));
   }

   @Override
   public avi dg() {
      return avi.f;
   }

   @Override
   protected void a(ajt.a $$0) {
      super.a($$0);
      $$0.a(cb, 1);
   }

   @VisibleForTesting
   public void a(int $$0, boolean $$1) {
      int $$2 = ayg.a($$0, 1, 127);
      this.ao.a(cb, $$2);
      this.av();
      this.i_();
      this.f(buk.s).a((double)($$2 * $$2));
      this.f(buk.v).a((double)(0.2F + 0.1F * (float)$$2));
      this.f(buk.c).a((double)$$2);
      if ($$1) {
         this.u(this.eP());
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

   protected lh t() {
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
      if (this.aG() && !this.cc) {
         float $$0 = this.a(this.at()).a() * 2.0F;
         float $$1 = $$0 / 2.0F;

         for (int $$2 = 0; (float)$$2 < $$0 * 16.0F; $$2++) {
            float $$3 = this.ah.i() * (float) (Math.PI * 2);
            float $$4 = this.ah.i() * 0.5F + 0.5F;
            float $$5 = ayg.a($$3) * $$1 * $$4;
            float $$6 = ayg.b($$3) * $$1 * $$4;
            this.dR().a(this.t(), this.dw() + (double)$$5, this.dy(), this.dC() + (double)$$6, 0.0, 0.0, 0.0);
         }

         this.a(this.gm(), this.fc(), ((this.ah.i() - this.ah.i()) * 0.2F + 1.0F) / 0.8F);
         this.e = -0.5F;
      } else if (!this.aG() && this.cc) {
         this.e = 1.0F;
      }

      this.cc = this.aG();
      this.gj();
   }

   @Override
   protected void gj() {
      this.e *= 0.6F;
   }

   protected int x() {
      return this.ah.a(20) + 10;
   }

   @Override
   public void i_() {
      double $$0 = this.dw();
      double $$1 = this.dy();
      double $$2 = this.dC();
      super.i_();
      this.a_($$0, $$1, $$2);
   }

   @Override
   public void a(ajp<?> $$0) {
      if (cb.equals($$0)) {
         this.i_();
         this.s(this.bb);
         this.aZ = this.bb;
         if (this.bg() && this.ah.a(20) == 0) {
            this.bp();
         }
      }

      super.a($$0);
   }

   @Override
   public bsn<? extends cka> am() {
      return (bsn<? extends cka>)super.am();
   }

   @Override
   public void a(bsh.d $$0) {
      int $$1 = this.go();
      if (!this.dR().B && $$1 > 1 && this.ez()) {
         wu $$2 = this.aj();
         boolean $$3 = this.gc();
         float $$4 = this.a(this.at()).a();
         float $$5 = $$4 / 2.0F;
         int $$6 = $$1 / 2;
         int $$7 = 2 + this.ah.a(3);

         for (int $$8 = 0; $$8 < $$7; $$8++) {
            float $$9 = ((float)($$8 % 2) - 0.5F) * $$5;
            float $$10 = ((float)($$8 / 2) - 0.5F) * $$5;
            cka $$11 = this.am().a(this.dR());
            if ($$11 != null) {
               if (this.fS()) {
                  $$11.fQ();
               }

               $$11.b($$2);
               $$11.c($$3);
               $$11.o(this.cw());
               $$11.a($$6, true);
               $$11.b(this.dw() + (double)$$9, this.dy() + 0.5, this.dC() + (double)$$10, this.ah.i() * 360.0F, 0.0F);
               this.dR().b($$11);
            }
         }
      }

      super.a($$0);
   }

   @Override
   public void h(bsh $$0) {
      super.h($$0);
      if ($$0 instanceof cfe && this.gk()) {
         this.j((btc)$$0);
      }
   }

   @Override
   public void b_(cml $$0) {
      if (this.gk()) {
         this.j($$0);
      }
   }

   protected void j(btc $$0) {
      if (this.bF()) {
         int $$1 = this.go();
         if (this.g((bsh)$$0) < 0.6 * (double)$$1 * 0.6 * (double)$$1 && this.F($$0)) {
            bra $$2 = this.dS().b((btc)this);
            if ($$0.a($$2, this.gl())) {
               this.a(avh.xp, 1.0F, (this.ah.i() - this.ah.i()) * 0.2F + 1.0F);
               if (this.dR() instanceof aqm $$3) {
                  czo.a($$3, (bsh)$$0, $$2);
               }
            }
         }
      }
   }

   @Override
   protected ewh a(bsh $$0, bsk $$1, float $$2) {
      return new ewh(0.0, (double)$$1.b() - 0.015625 * (double)this.go() * (double)$$2, 0.0);
   }

   protected boolean gk() {
      return !this.gp() && this.dd();
   }

   protected float gl() {
      return (float)this.g(buk.c);
   }

   @Override
   protected avg d(bra $$0) {
      return this.gp() ? avh.yg : avh.xr;
   }

   @Override
   protected avg n_() {
      return this.gp() ? avh.yf : avh.xq;
   }

   protected avg gm() {
      return this.gp() ? avh.yi : avh.xt;
   }

   public static boolean c(bsn<cka> $$0, dch $$1, btg $$2, ja $$3, ayo $$4) {
      if (btg.a($$2)) {
         return a($$0, $$1, $$2, $$3, $$4);
      } else {
         if ($$1.al() != bqe.a) {
            if ($$2 == btg.c) {
               return a($$0, $$1, $$2, $$3, $$4);
            }

            if ($$1.t($$3).a(avv.aq) && $$3.v() > 50 && $$3.v() < 70 && $$4.i() < 0.5F && $$4.i() < $$1.aq() && $$1.A($$3) <= $$4.a(8)) {
               return a($$0, $$1, $$2, $$3, $$4);
            }

            if (!($$1 instanceof ddc)) {
               return false;
            }

            dbn $$5 = new dbn($$3);
            boolean $$6 = dzf.a($$5.e, $$5.f, ((ddc)$$1).C(), 987234911L).a(10) == 0;
            if ($$4.a(10) == 0 && $$6 && $$3.v() < 40) {
               return a($$0, $$1, $$2, $$3, $$4);
            }
         }

         return false;
      }
   }

   @Override
   protected float fc() {
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
   protected void fh() {
      ewh $$0 = this.du();
      this.o($$0.c, (double)this.ff(), $$0.e);
      this.av = true;
   }

   @Nullable
   @Override
   public btv a(dcv $$0, bqf $$1, btg $$2, @Nullable btv $$3) {
      ayo $$4 = $$0.E_();
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

   protected avg gn() {
      return this.gp() ? avh.yh : avh.xs;
   }

   @Override
   public bsk e(bto $$0) {
      return super.e($$0).a((float)this.go());
   }

   static class a extends caa {
      private final cka a;
      private int b;

      public a(cka $$0) {
         this.a = $$0;
         this.a(EnumSet.of(caa.a.b));
      }

      @Override
      public boolean a() {
         btc $$0 = this.a.p();
         if ($$0 == null) {
            return false;
         } else {
            return !this.a.c($$0) ? false : this.a.H() instanceof cka.d;
         }
      }

      @Override
      public void c() {
         this.b = b(300);
         super.c();
      }

      @Override
      public boolean b() {
         btc $$0 = this.a.p();
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
         btc $$0 = this.a.p();
         if ($$0 != null) {
            this.a.a($$0, 10.0F, 10.0F);
         }

         if (this.a.H() instanceof cka.d $$1) {
            $$1.a(this.a.dH(), this.a.gk());
         }
      }
   }

   static class b extends caa {
      private final cka a;

      public b(cka $$0) {
         this.a = $$0;
         this.a(EnumSet.of(caa.a.c, caa.a.a));
         $$0.J().a(true);
      }

      @Override
      public boolean a() {
         return (this.a.bg() || this.a.bu()) && this.a.H() instanceof cka.d;
      }

      @Override
      public boolean R_() {
         return true;
      }

      @Override
      public void e() {
         if (this.a.dU().i() < 0.8F) {
            this.a.I().a();
         }

         if (this.a.H() instanceof cka.d $$0) {
            $$0.a(1.2);
         }
      }
   }

   static class c extends caa {
      private final cka a;

      public c(cka $$0) {
         this.a = $$0;
         this.a(EnumSet.of(caa.a.c, caa.a.a));
      }

      @Override
      public boolean a() {
         return !this.a.bT();
      }

      @Override
      public void e() {
         if (this.a.H() instanceof cka.d $$0) {
            $$0.a(1.0);
         }
      }
   }

   static class d extends bzd {
      private float l;
      private int m;
      private final cka n;
      private boolean o;

      public d(cka $$0) {
         super($$0);
         this.n = $$0;
         this.l = 180.0F * $$0.dH() / (float) Math.PI;
      }

      public void a(float $$0, boolean $$1) {
         this.l = $$0;
         this.o = $$1;
      }

      public void a(double $$0) {
         this.h = $$0;
         this.k = bzd.a.b;
      }

      @Override
      public void a() {
         this.d.s(this.a(this.d.dH(), this.l, 90.0F));
         this.d.bb = this.d.dH();
         this.d.aZ = this.d.dH();
         if (this.k != bzd.a.b) {
            this.d.D(0.0F);
         } else {
            this.k = bzd.a.a;
            if (this.d.aG()) {
               this.d.z((float)(this.h * this.d.g(buk.v)));
               if (this.m-- <= 0) {
                  this.m = this.n.x();
                  if (this.o) {
                     this.m /= 3;
                  }

                  this.n.I().a();
                  if (this.n.gq()) {
                     this.n.a(this.n.gn(), this.n.fc(), this.n.s());
                  }
               } else {
                  this.n.bp = 0.0F;
                  this.n.br = 0.0F;
                  this.d.z(0.0F);
               }
            } else {
               this.d.z((float)(this.h * this.d.g(buk.v)));
            }
         }
      }
   }

   static class e extends caa {
      private final cka a;
      private float b;
      private int c;

      public e(cka $$0) {
         this.a = $$0;
         this.a(EnumSet.of(caa.a.b));
      }

      @Override
      public boolean a() {
         return this.a.p() == null && (this.a.aG() || this.a.bg() || this.a.bu() || this.a.b(brr.y)) && this.a.H() instanceof cka.d;
      }

      @Override
      public void e() {
         if (--this.c <= 0) {
            this.c = this.a(40 + this.a.dU().a(60));
            this.b = (float)this.a.dU().a(360);
         }

         if (this.a.H() instanceof cka.d $$0) {
            $$0.a(this.b, false);
         }
      }
   }
}
