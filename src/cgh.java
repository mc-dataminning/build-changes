import com.google.common.annotations.VisibleForTesting;
import java.util.EnumSet;
import javax.annotation.Nullable;

public class cgh extends bpq implements cfq {
   private static final aim<Integer> bX = aiq.a(cgh.class, aio.b);
   public static final int b = 1;
   public static final int c = 127;
   public float d;
   public float e;
   public float bW;
   private boolean bY;

   public cgh(bpc<? extends cgh> $$0, cwz $$1) {
      super($$0, $$1);
      this.cD();
      this.bO = new cgh.d(this);
   }

   @Override
   protected void z() {
      this.bR.a(1, new cgh.b(this));
      this.bR.a(2, new cgh.a(this));
      this.bR.a(3, new cgh.e(this));
      this.bR.a(5, new cgh.c(this));
      this.bS.a(1, new bye<>(this, cis.class, 10, true, false, $$0 -> Math.abs($$0.dt() - this.dt()) <= 4.0));
      this.bS.a(3, new bye<>(this, cbp.class, true));
   }

   @Override
   public atz db() {
      return atz.f;
   }

   @Override
   protected void a(aiq.a $$0) {
      super.a($$0);
      $$0.a(bX, 1);
   }

   @VisibleForTesting
   public void a(int $$0, boolean $$1) {
      int $$2 = aww.a($$0, 1, 127);
      this.an.a(bX, $$2);
      this.ar();
      this.j_();
      this.f(bqv.q).a((double)($$2 * $$2));
      this.f(bqv.r).a((double)(0.2F + 0.1F * (float)$$2));
      this.f(bqv.c).a((double)$$2);
      if ($$1) {
         this.t(this.eO());
      }

      this.bM = $$2;
   }

   public int go() {
      return this.an.a(bX);
   }

   @Override
   public void b(ta $$0) {
      super.b($$0);
      $$0.a("Size", this.go() - 1);
      $$0.a("wasOnGround", this.bY);
   }

   @Override
   public void a(ta $$0) {
      this.a($$0.h("Size") + 1, false);
      super.a($$0);
      this.bY = $$0.q("wasOnGround");
   }

   public boolean gp() {
      return this.go() <= 1;
   }

   protected ka s() {
      return kc.T;
   }

   @Override
   protected boolean W() {
      return this.go() > 0;
   }

   @Override
   public void l() {
      this.e = this.e + (this.d - this.e) * 0.5F;
      this.bW = this.e;
      super.l();
      if (this.aC() && !this.bY) {
         float $$0 = this.a(this.ap()).a() * 2.0F;
         float $$1 = $$0 / 2.0F;

         for (int $$2 = 0; (float)$$2 < $$0 * 16.0F; $$2++) {
            float $$3 = this.ag.i() * (float) (Math.PI * 2);
            float $$4 = this.ag.i() * 0.5F + 0.5F;
            float $$5 = aww.a($$3) * $$1 * $$4;
            float $$6 = aww.b($$3) * $$1 * $$4;
            this.dM().a(this.s(), this.dr() + (double)$$5, this.dt(), this.dx() + (double)$$6, 0.0, 0.0, 0.0);
         }

         this.a(this.gm(), this.fb(), ((this.ag.i() - this.ag.i()) * 0.2F + 1.0F) / 0.8F);
         this.d = -0.5F;
      } else if (!this.aC() && this.bY) {
         this.d = 1.0F;
      }

      this.bY = this.aC();
      this.gj();
   }

   @Override
   protected void gj() {
      this.d *= 0.6F;
   }

   protected int y() {
      return this.ag.a(20) + 10;
   }

   @Override
   public void j_() {
      double $$0 = this.dr();
      double $$1 = this.dt();
      double $$2 = this.dx();
      super.j_();
      this.a_($$0, $$1, $$2);
   }

   @Override
   public void a(aim<?> $$0) {
      if (bX.equals($$0)) {
         this.j_();
         this.r(this.aZ);
         this.aX = this.aZ;
         if (this.bc() && this.ag.a(20) == 0) {
            this.bl();
         }
      }

      super.a($$0);
   }

   @Override
   public bpc<? extends cgh> ai() {
      return (bpc<? extends cgh>)super.ai();
   }

   @Override
   public void a(bow.c $$0) {
      int $$1 = this.go();
      if (!this.dM().B && $$1 > 1 && this.ey()) {
         vu $$2 = this.af();
         boolean $$3 = this.gd();
         float $$4 = this.a(this.ap()).a();
         float $$5 = $$4 / 2.0F;
         int $$6 = $$1 / 2;
         int $$7 = 2 + this.ag.a(3);

         for (int $$8 = 0; $$8 < $$7; $$8++) {
            float $$9 = ((float)($$8 % 2) - 0.5F) * $$5;
            float $$10 = ((float)($$8 / 2) - 0.5F) * $$5;
            cgh $$11 = this.ai().a(this.dM());
            if ($$11 != null) {
               if (this.fU()) {
                  $$11.fS();
               }

               $$11.b($$2);
               $$11.t($$3);
               $$11.m(this.cr());
               $$11.a($$6, true);
               $$11.b(this.dr() + (double)$$9, this.dt() + 0.5, this.dx() + (double)$$10, this.ag.i() * 360.0F, 0.0F);
               this.dM().b($$11);
            }
         }
      }

      super.a($$0);
   }

   @Override
   public void h(bow $$0) {
      super.h($$0);
      if ($$0 instanceof cbp && this.gk()) {
         this.j((bpo)$$0);
      }
   }

   @Override
   public void b_(cis $$0) {
      if (this.gk()) {
         this.j($$0);
      }
   }

   protected void j(bpo $$0) {
      if (this.bA()) {
         int $$1 = this.go();
         if (this.g((bow)$$0) < 0.6 * (double)$$1 * 0.6 * (double)$$1 && this.E($$0) && $$0.a(this.dN().b((bpo)this), this.gl())) {
            this.a(aty.wL, 1.0F, (this.ag.i() - this.ag.i()) * 0.2F + 1.0F);
            this.a(this, $$0);
         }
      }
   }

   @Override
   protected epr a(bow $$0, boz $$1, float $$2) {
      return new epr(0.0, (double)$$1.b() - 0.015625 * (double)this.go() * (double)$$2, 0.0);
   }

   protected boolean gk() {
      return !this.gp() && this.cY();
   }

   protected float gl() {
      return (float)this.g(bqv.c);
   }

   @Override
   protected atx d(bnv $$0) {
      return this.gp() ? aty.xC : aty.wN;
   }

   @Override
   protected atx n_() {
      return this.gp() ? aty.xB : aty.wM;
   }

   protected atx gm() {
      return this.gp() ? aty.xE : aty.wP;
   }

   public static boolean c(bpc<cgh> $$0, cxa $$1, bps $$2, ib $$3, axd $$4) {
      if (bps.a($$2)) {
         return a($$0, $$1, $$2, $$3, $$4);
      } else {
         if ($$1.aj() != bmz.a) {
            if ($$2 == bps.c) {
               return a($$0, $$1, $$2, $$3, $$4);
            }

            if ($$1.t($$3).a(aum.aq) && $$3.v() > 50 && $$3.v() < 70 && $$4.i() < 0.5F && $$4.i() < $$1.ao() && $$1.A($$3) <= $$4.a(8)) {
               return a($$0, $$1, $$2, $$3, $$4);
            }

            if (!($$1 instanceof cxu)) {
               return false;
            }

            cwg $$5 = new cwg($$3);
            boolean $$6 = dtl.a($$5.e, $$5.f, ((cxu)$$1).C(), 987234911L).a(10) == 0;
            if ($$4.a(10) == 0 && $$6 && $$3.v() < 40) {
               return a($$0, $$1, $$2, $$3, $$4);
            }
         }

         return false;
      }
   }

   @Override
   protected float fb() {
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
   protected void fg() {
      epr $$0 = this.dp();
      this.o($$0.c, (double)this.fe(), $$0.e);
      this.au = true;
   }

   @Nullable
   @Override
   public bqg a(cxo $$0, bna $$1, bps $$2, @Nullable bqg $$3) {
      axd $$4 = $$0.E_();
      int $$5 = $$4.a(3);
      if ($$5 < 2 && $$4.i() < 0.5F * $$1.d()) {
         $$5++;
      }

      int $$6 = 1 << $$5;
      this.a($$6, true);
      return super.a($$0, $$1, $$2, $$3);
   }

   float r() {
      float $$0 = this.gp() ? 1.4F : 0.8F;
      return ((this.ag.i() - this.ag.i()) * 0.2F + 1.0F) * $$0;
   }

   protected atx gn() {
      return this.gp() ? aty.xD : aty.wO;
   }

   @Override
   public boz e(bpz $$0) {
      return super.e($$0).a((float)this.go());
   }

   static class a extends bwl {
      private final cgh a;
      private int b;

      public a(cgh $$0) {
         this.a = $$0;
         this.a(EnumSet.of(bwl.a.b));
      }

      @Override
      public boolean a() {
         bpo $$0 = this.a.p();
         if ($$0 == null) {
            return false;
         } else {
            return !this.a.c($$0) ? false : this.a.H() instanceof cgh.d;
         }
      }

      @Override
      public void c() {
         this.b = b(300);
         super.c();
      }

      @Override
      public boolean b() {
         bpo $$0 = this.a.p();
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
         bpo $$0 = this.a.p();
         if ($$0 != null) {
            this.a.a($$0, 10.0F, 10.0F);
         }

         if (this.a.H() instanceof cgh.d $$1) {
            $$1.a(this.a.dC(), this.a.gk());
         }
      }
   }

   static class b extends bwl {
      private final cgh a;

      public b(cgh $$0) {
         this.a = $$0;
         this.a(EnumSet.of(bwl.a.c, bwl.a.a));
         $$0.K().a(true);
      }

      @Override
      public boolean a() {
         return (this.a.bc() || this.a.bq()) && this.a.H() instanceof cgh.d;
      }

      @Override
      public boolean R_() {
         return true;
      }

      @Override
      public void e() {
         if (this.a.ei().i() < 0.8F) {
            this.a.I().a();
         }

         if (this.a.H() instanceof cgh.d $$0) {
            $$0.a(1.2);
         }
      }
   }

   static class c extends bwl {
      private final cgh a;

      public c(cgh $$0) {
         this.a = $$0;
         this.a(EnumSet.of(bwl.a.c, bwl.a.a));
      }

      @Override
      public boolean a() {
         return !this.a.bO();
      }

      @Override
      public void e() {
         if (this.a.H() instanceof cgh.d $$0) {
            $$0.a(1.0);
         }
      }
   }

   static class d extends bvo {
      private float l;
      private int m;
      private final cgh n;
      private boolean o;

      public d(cgh $$0) {
         super($$0);
         this.n = $$0;
         this.l = 180.0F * $$0.dC() / (float) Math.PI;
      }

      public void a(float $$0, boolean $$1) {
         this.l = $$0;
         this.o = $$1;
      }

      public void a(double $$0) {
         this.h = $$0;
         this.k = bvo.a.b;
      }

      @Override
      public void a() {
         this.d.r(this.a(this.d.dC(), this.l, 90.0F));
         this.d.aZ = this.d.dC();
         this.d.aX = this.d.dC();
         if (this.k != bvo.a.b) {
            this.d.C(0.0F);
         } else {
            this.k = bvo.a.a;
            if (this.d.aC()) {
               this.d.y((float)(this.h * this.d.g(bqv.r)));
               if (this.m-- <= 0) {
                  this.m = this.n.y();
                  if (this.o) {
                     this.m /= 3;
                  }

                  this.n.I().a();
                  if (this.n.gq()) {
                     this.n.a(this.n.gn(), this.n.fb(), this.n.r());
                  }
               } else {
                  this.n.bn = 0.0F;
                  this.n.bp = 0.0F;
                  this.d.y(0.0F);
               }
            } else {
               this.d.y((float)(this.h * this.d.g(bqv.r)));
            }
         }
      }
   }

   static class e extends bwl {
      private final cgh a;
      private float b;
      private int c;

      public e(cgh $$0) {
         this.a = $$0;
         this.a(EnumSet.of(bwl.a.b));
      }

      @Override
      public boolean a() {
         return this.a.p() == null && (this.a.aC() || this.a.bc() || this.a.bq() || this.a.a(bol.y)) && this.a.H() instanceof cgh.d;
      }

      @Override
      public void e() {
         if (--this.c <= 0) {
            this.c = this.a(40 + this.a.ei().a(60));
            this.b = (float)this.a.ei().a(360);
         }

         if (this.a.H() instanceof cgh.d $$0) {
            $$0.a(this.b, false);
         }
      }
   }
}
