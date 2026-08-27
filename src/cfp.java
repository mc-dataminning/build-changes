import com.google.common.annotations.VisibleForTesting;
import java.util.EnumSet;
import javax.annotation.Nullable;

public class cfp extends boz implements cey {
   private static final aii<Integer> bV = ail.a(cfp.class, aik.b);
   public static final int b = 1;
   public static final int c = 127;
   public float d;
   public float e;
   public float bU;
   private boolean bW;

   public cfp(bol<? extends cfp> $$0, cwe $$1) {
      super($$0, $$1);
      this.cA();
      this.bM = new cfp.d(this);
   }

   @Override
   protected void B() {
      this.bP.a(1, new cfp.b(this));
      this.bP.a(2, new cfp.a(this));
      this.bP.a(3, new cfp.e(this));
      this.bP.a(5, new cfp.c(this));
      this.bQ.a(1, new bxn<>(this, cia.class, 10, true, false, $$0 -> Math.abs($$0.dq() - this.dq()) <= 4.0));
      this.bQ.a(3, new bxn<>(this, cay.class, true));
   }

   @Override
   public atq cY() {
      return atq.f;
   }

   @Override
   protected void c_() {
      super.c_();
      this.am.a(bV, 1);
   }

   @VisibleForTesting
   public void a(int $$0, boolean $$1) {
      int $$2 = awm.a($$0, 1, 127);
      this.am.b(bV, $$2);
      this.ar();
      this.k_();
      this.f(bqe.n).a((double)($$2 * $$2));
      this.f(bqe.o).a((double)(0.2F + 0.1F * (float)$$2));
      this.f(bqe.c).a((double)$$2);
      if ($$1) {
         this.t(this.eL());
      }

      this.bK = $$2;
   }

   public int gm() {
      return this.am.b(bV);
   }

   @Override
   public void b(sy $$0) {
      super.b($$0);
      $$0.a("Size", this.gm() - 1);
      $$0.a("wasOnGround", this.bW);
   }

   @Override
   public void a(sy $$0) {
      this.a($$0.h("Size") + 1, false);
      super.a($$0);
      this.bW = $$0.q("wasOnGround");
   }

   public boolean gn() {
      return this.gm() <= 1;
   }

   protected jz w() {
      return kb.S;
   }

   @Override
   protected boolean Y() {
      return this.gm() > 0;
   }

   @Override
   public void l() {
      this.e = this.e + (this.d - this.e) * 0.5F;
      this.bU = this.e;
      super.l();
      if (this.aC() && !this.bW) {
         float $$0 = this.a(this.ap()).a() * 2.0F;
         float $$1 = $$0 / 2.0F;

         for (int $$2 = 0; (float)$$2 < $$0 * 16.0F; $$2++) {
            float $$3 = this.af.i() * (float) (Math.PI * 2);
            float $$4 = this.af.i() * 0.5F + 0.5F;
            float $$5 = awm.a($$3) * $$1 * $$4;
            float $$6 = awm.b($$3) * $$1 * $$4;
            this.dJ().a(this.w(), this.do() + (double)$$5, this.dq(), this.du() + (double)$$6, 0.0, 0.0, 0.0);
         }

         this.a(this.gk(), this.eY(), ((this.af.i() - this.af.i()) * 0.2F + 1.0F) / 0.8F);
         this.d = -0.5F;
      } else if (!this.aC() && this.bW) {
         this.d = 1.0F;
      }

      this.bW = this.aC();
      this.gh();
   }

   @Override
   protected void gh() {
      this.d *= 0.6F;
   }

   protected int A() {
      return this.af.a(20) + 10;
   }

   @Override
   public void k_() {
      double $$0 = this.do();
      double $$1 = this.dq();
      double $$2 = this.du();
      super.k_();
      this.a_($$0, $$1, $$2);
   }

   @Override
   public void a(aii<?> $$0) {
      if (bV.equals($$0)) {
         this.k_();
         this.r(this.aX);
         this.aV = this.aX;
         if (this.aZ() && this.af.a(20) == 0) {
            this.bi();
         }
      }

      super.a($$0);
   }

   @Override
   public bol<? extends cfp> ai() {
      return (bol<? extends cfp>)super.ai();
   }

   @Override
   public void a(bof.c $$0) {
      int $$1 = this.gm();
      if (!this.dJ().B && $$1 > 1 && this.ev()) {
         vs $$2 = this.af();
         boolean $$3 = this.gb();
         float $$4 = this.a(this.ap()).a();
         float $$5 = $$4 / 2.0F;
         int $$6 = $$1 / 2;
         int $$7 = 2 + this.af.a(3);

         for (int $$8 = 0; $$8 < $$7; $$8++) {
            float $$9 = ((float)($$8 % 2) - 0.5F) * $$5;
            float $$10 = ((float)($$8 / 2) - 0.5F) * $$5;
            cfp $$11 = this.ai().a(this.dJ());
            if ($$11 != null) {
               if (this.fS()) {
                  $$11.fQ();
               }

               $$11.b($$2);
               $$11.t($$3);
               $$11.m(this.co());
               $$11.a($$6, true);
               $$11.b(this.do() + (double)$$9, this.dq() + 0.5, this.du() + (double)$$10, this.af.i() * 360.0F, 0.0F);
               this.dJ().b($$11);
            }
         }
      }

      super.a($$0);
   }

   @Override
   public void g(bof $$0) {
      super.g($$0);
      if ($$0 instanceof cay && this.gi()) {
         this.j((box)$$0);
      }
   }

   @Override
   public void b_(cia $$0) {
      if (this.gi()) {
         this.j($$0);
      }
   }

   protected void j(box $$0) {
      if (this.bx()) {
         int $$1 = this.gm();
         if (this.f((bof)$$0) < 0.6 * (double)$$1 * 0.6 * (double)$$1 && this.D($$0) && $$0.a(this.dK().b((box)this), this.gj())) {
            this.a(atp.wI, 1.0F, (this.af.i() - this.af.i()) * 0.2F + 1.0F);
            this.a(this, $$0);
         }
      }
   }

   @Override
   protected eov a(bof $$0, boi $$1, float $$2) {
      return new eov(0.0, (double)$$1.b() - 0.015625 * (double)this.gm() * (double)$$2, 0.0);
   }

   protected boolean gi() {
      return !this.gn() && this.cV();
   }

   protected float gj() {
      return (float)this.g(bqe.c);
   }

   @Override
   protected ato d(bne $$0) {
      return this.gn() ? atp.xz : atp.wK;
   }

   @Override
   protected ato n_() {
      return this.gn() ? atp.xy : atp.wJ;
   }

   protected ato gk() {
      return this.gn() ? atp.xB : atp.wM;
   }

   public static boolean c(bol<cfp> $$0, cwf $$1, bpb $$2, ib $$3, awt $$4) {
      if (bpb.a($$2)) {
         return a($$0, $$1, $$2, $$3, $$4);
      } else {
         if ($$1.aj() != bmi.a) {
            if ($$2 == bpb.c) {
               return a($$0, $$1, $$2, $$3, $$4);
            }

            if ($$1.t($$3).a(aud.aq) && $$3.v() > 50 && $$3.v() < 70 && $$4.i() < 0.5F && $$4.i() < $$1.ao() && $$1.A($$3) <= $$4.a(8)) {
               return a($$0, $$1, $$2, $$3, $$4);
            }

            if (!($$1 instanceof cwz)) {
               return false;
            }

            cvl $$5 = new cvl($$3);
            boolean $$6 = dsp.a($$5.e, $$5.f, ((cwz)$$1).C(), 987234911L).a(10) == 0;
            if ($$4.a(10) == 0 && $$6 && $$3.v() < 40) {
               return a($$0, $$1, $$2, $$3, $$4);
            }
         }

         return false;
      }
   }

   @Override
   protected float eY() {
      return 0.4F * (float)this.gm();
   }

   @Override
   public int ab() {
      return 0;
   }

   protected boolean go() {
      return this.gm() > 0;
   }

   @Override
   protected void fd() {
      eov $$0 = this.dm();
      this.o($$0.c, (double)this.fb(), $$0.e);
      this.at = true;
   }

   @Nullable
   @Override
   public bpp a(cwt $$0, bmj $$1, bpb $$2, @Nullable bpp $$3) {
      awt $$4 = $$0.F_();
      int $$5 = $$4.a(3);
      if ($$5 < 2 && $$4.i() < 0.5F * $$1.d()) {
         $$5++;
      }

      int $$6 = 1 << $$5;
      this.a($$6, true);
      return super.a($$0, $$1, $$2, $$3);
   }

   float u() {
      float $$0 = this.gn() ? 1.4F : 0.8F;
      return ((this.af.i() - this.af.i()) * 0.2F + 1.0F) * $$0;
   }

   protected ato gl() {
      return this.gn() ? atp.xA : atp.wL;
   }

   @Override
   public boi e(bpi $$0) {
      return super.e($$0).a((float)this.gm());
   }

   static class a extends bvu {
      private final cfp a;
      private int b;

      public a(cfp $$0) {
         this.a = $$0;
         this.a(EnumSet.of(bvu.a.b));
      }

      @Override
      public boolean a() {
         box $$0 = this.a.q();
         if ($$0 == null) {
            return false;
         } else {
            return !this.a.c($$0) ? false : this.a.K() instanceof cfp.d;
         }
      }

      @Override
      public void c() {
         this.b = b(300);
         super.c();
      }

      @Override
      public boolean b() {
         box $$0 = this.a.q();
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
         box $$0 = this.a.q();
         if ($$0 != null) {
            this.a.a($$0, 10.0F, 10.0F);
         }

         if (this.a.K() instanceof cfp.d $$1) {
            $$1.a(this.a.dz(), this.a.gi());
         }
      }
   }

   static class b extends bvu {
      private final cfp a;

      public b(cfp $$0) {
         this.a = $$0;
         this.a(EnumSet.of(bvu.a.c, bvu.a.a));
         $$0.N().a(true);
      }

      @Override
      public boolean a() {
         return (this.a.aZ() || this.a.bn()) && this.a.K() instanceof cfp.d;
      }

      @Override
      public boolean T_() {
         return true;
      }

      @Override
      public void e() {
         if (this.a.ef().i() < 0.8F) {
            this.a.M().a();
         }

         if (this.a.K() instanceof cfp.d $$0) {
            $$0.a(1.2);
         }
      }
   }

   static class c extends bvu {
      private final cfp a;

      public c(cfp $$0) {
         this.a = $$0;
         this.a(EnumSet.of(bvu.a.c, bvu.a.a));
      }

      @Override
      public boolean a() {
         return !this.a.bL();
      }

      @Override
      public void e() {
         if (this.a.K() instanceof cfp.d $$0) {
            $$0.a(1.0);
         }
      }
   }

   static class d extends bux {
      private float l;
      private int m;
      private final cfp n;
      private boolean o;

      public d(cfp $$0) {
         super($$0);
         this.n = $$0;
         this.l = 180.0F * $$0.dz() / (float) Math.PI;
      }

      public void a(float $$0, boolean $$1) {
         this.l = $$0;
         this.o = $$1;
      }

      public void a(double $$0) {
         this.h = $$0;
         this.k = bux.a.b;
      }

      @Override
      public void a() {
         this.d.r(this.a(this.d.dz(), this.l, 90.0F));
         this.d.aX = this.d.dz();
         this.d.aV = this.d.dz();
         if (this.k != bux.a.b) {
            this.d.A(0.0F);
         } else {
            this.k = bux.a.a;
            if (this.d.aC()) {
               this.d.w((float)(this.h * this.d.g(bqe.o)));
               if (this.m-- <= 0) {
                  this.m = this.n.A();
                  if (this.o) {
                     this.m /= 3;
                  }

                  this.n.M().a();
                  if (this.n.go()) {
                     this.n.a(this.n.gl(), this.n.eY(), this.n.u());
                  }
               } else {
                  this.n.bl = 0.0F;
                  this.n.bn = 0.0F;
                  this.d.w(0.0F);
               }
            } else {
               this.d.w((float)(this.h * this.d.g(bqe.o)));
            }
         }
      }
   }

   static class e extends bvu {
      private final cfp a;
      private float b;
      private int c;

      public e(cfp $$0) {
         this.a = $$0;
         this.a(EnumSet.of(bvu.a.b));
      }

      @Override
      public boolean a() {
         return this.a.q() == null && (this.a.aC() || this.a.aZ() || this.a.bn() || this.a.a(bnu.y)) && this.a.K() instanceof cfp.d;
      }

      @Override
      public void e() {
         if (--this.c <= 0) {
            this.c = this.a(40 + this.a.ef().a(60));
            this.b = (float)this.a.ef().a(360);
         }

         if (this.a.K() instanceof cfp.d $$0) {
            $$0.a(this.b, false);
         }
      }
   }
}
