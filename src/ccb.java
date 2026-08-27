import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class ccb extends cco implements bph, bpm {
   public static final csp bV = csp.a(cpt.eV);
   public static final float bW = 0.45F;
   public static final int bY = 55;
   public static final int bZ = 30;
   private static final float cx = 0.1F;
   private static final float cy = 1.4285F;
   private static final float cz = 22.2222F;
   private static final int cA = 5;
   private static final int cB = 40;
   private static final int cC = 52;
   private static final int cD = 80;
   private static final float cE = 1.43F;
   public static final aii<Boolean> ca = ail.a(ccb.class, aik.k);
   public static final aii<Long> cb = ail.a(ccb.class, aik.c);
   public final bob cc = new bob();
   public final bob cd = new bob();
   public final bob ce = new bob();
   public final bob cf = new bob();
   public final bob cg = new bob();
   private static final boi cF = boi.b(bol.n.k(), bol.n.l() - 1.43F).b(0.845F);
   private int cG = 0;
   private int cH = 0;

   public ccb(bol<? extends ccb> $$0, cwe $$1) {
      super($$0, $$1);
      this.bM = new ccb.c();
      this.bL = new ccb.b();
      byh $$2 = (byh)this.N();
      $$2.a(true);
      $$2.e(true);
   }

   @Override
   public void b(sy $$0) {
      super.b($$0);
      $$0.a("LastPoseTick", this.am.b(cb));
   }

   @Override
   public void a(sy $$0) {
      super.a($$0);
      long $$1 = $$0.i("LastPoseTick");
      if ($$1 < 0L) {
         this.b(bpi.k);
      }

      this.a($$1);
   }

   public static bqd.a u() {
      return gL().a(bqe.n, 32.0).a(bqe.o, 0.09F).a(bqe.j, 0.42F).a(bqe.r, 1.5);
   }

   @Override
   protected void c_() {
      super.c_();
      this.am.a(ca, false);
      this.am.a(cb, 0L);
   }

   @Override
   public bpp a(cwt $$0, bmj $$1, bpb $$2, @Nullable bpp $$3) {
      ccc.a(this, $$0.F_());
      this.b($$0.E().X());
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected bpy.b<ccb> dN() {
      return ccc.a();
   }

   @Override
   protected void B() {
   }

   @Override
   protected bpy<?> a(Dynamic<?> $$0) {
      return ccc.a(this.dN().a($$0));
   }

   @Override
   public boi e(bpi $$0) {
      return $$0 == bpi.k ? cF.a(this.dX()) : super.e($$0);
   }

   @Override
   protected void aa() {
      this.dJ().ae().a("camelBrain");
      bpy<?> $$0 = this.dM();
      ((bpy<ccb>)$$0).a((apa)this.dJ(), this);
      this.dJ().ae().c();
      this.dJ().ae().a("camelActivityUpdate");
      ccc.a(this);
      this.dJ().ae().c();
      super.aa();
   }

   @Override
   public void l() {
      super.l();
      if (this.A() && this.cG < 50 && (this.aC() || this.bd() || this.bL())) {
         this.w(false);
      }

      if (this.cG > 0) {
         this.cG--;
         if (this.cG == 0) {
            this.dJ().a(null, this.dj(), atp.dr, atq.g, 1.0F, 1.0F);
         }
      }

      if (this.dJ().y_()) {
         this.gW();
      }

      if (this.w()) {
         this.fK();
      }

      if (this.gt() && this.aZ()) {
         this.gy();
      }
   }

   private void gW() {
      if (this.cH <= 0) {
         this.cH = this.af.a(40) + 80;
         this.cf.a(this.ag);
      } else {
         this.cH--;
      }

      if (this.gu()) {
         this.ce.a();
         this.cg.a();
         if (this.gX()) {
            this.cc.b(this.ag);
            this.cd.a();
         } else {
            this.cc.a();
            this.cd.b(this.ag);
         }
      } else {
         this.cc.a();
         this.cd.a();
         this.cg.a(this.A(), this.ag);
         this.ce.a(this.gv() && this.gz() >= 0L, this.ag);
      }
   }

   @Override
   protected void v(float $$0) {
      float $$1;
      if (this.ap() == bpi.a && !this.cg.c()) {
         $$1 = Math.min($$0 * 6.0F, 1.0F);
      } else {
         $$1 = 0.0F;
      }

      this.aR.a($$1, 0.2F);
   }

   @Override
   public void a(eov $$0) {
      if (this.w() && this.aC()) {
         this.g(this.dm().d(0.0, 1.0, 0.0));
         $$0 = $$0.d(0.0, 1.0, 0.0);
      }

      super.a($$0);
   }

   @Override
   protected void a(cia $$0, eov $$1) {
      super.a($$0, $$1);
      if ($$0.bn > 0.0F && this.gt() && !this.gv()) {
         this.gx();
      }
   }

   public boolean w() {
      return this.gt() || this.gv();
   }

   @Override
   protected float e(cia $$0) {
      float $$1 = $$0.bV() && this.ad_() == 0 ? 0.1F : 0.0F;
      return (float)this.g(bqe.o) + $$1;
   }

   @Override
   protected eou j(box $$0) {
      return this.w() ? new eou(this.dB(), this.dz()) : super.j($$0);
   }

   @Override
   protected eov b(cia $$0, eov $$1) {
      return this.w() ? eov.b : super.b($$0, $$1);
   }

   @Override
   public boolean a() {
      return !this.w() && super.a();
   }

   @Override
   public void b(int $$0) {
      if (this.i() && this.cG <= 0 && this.aC()) {
         super.b($$0);
      }
   }

   @Override
   public boolean dC() {
      return true;
   }

   @Override
   protected void b(float $$0, eov $$1) {
      double $$2 = this.g(bqe.j) * (double)this.aK() + (double)this.fc();
      this.h(this.bF().d(1.0, 0.0, 1.0).d().a((double)(22.2222F * $$0) * this.g(bqe.o) * (double)this.aL()).b(0.0, (double)(1.4285F * $$0) * $$2, 0.0));
      this.cG = 55;
      this.w(true);
      this.at = true;
   }

   public boolean A() {
      return this.am.b(ca);
   }

   public void w(boolean $$0) {
      this.am.b(ca, $$0);
   }

   @Override
   public void c(int $$0) {
      this.b(atp.dq);
      this.b(dqr.u);
      this.w(true);
   }

   @Override
   public void b() {
   }

   @Override
   public int ad_() {
      return this.cG;
   }

   @Override
   protected ato y() {
      return atp.dp;
   }

   @Override
   protected ato n_() {
      return atp.ds;
   }

   @Override
   protected ato d(bne $$0) {
      return atp.du;
   }

   @Override
   protected void b(ib $$0, dme $$1) {
      if ($$1.a(aue.bo)) {
         this.a(atp.dz, 1.0F, 1.0F);
      } else {
         this.a(atp.dy, 1.0F, 1.0F);
      }
   }

   @Override
   public boolean o(cpq $$0) {
      return bV.a($$0);
   }

   @Override
   public bml b(cia $$0, bmk $$1) {
      cpq $$2 = $$0.b($$1);
      if ($$0.fK() && !this.o_()) {
         this.b($$0);
         return bml.a(this.dJ().B);
      } else {
         bml $$3 = $$2.a($$0, this, $$1);
         if ($$3.a()) {
            return $$3;
         } else if (this.o($$2)) {
            return this.c($$0, $$2);
         } else {
            if (this.cM().size() < 2 && !this.o_()) {
               this.f($$0);
            }

            return bml.a(this.dJ().B);
         }
      }
   }

   @Override
   protected void D(float $$0) {
      if ($$0 > 6.0F && this.gt() && !this.gv() && this.gl()) {
         this.gx();
      }
   }

   public boolean gl() {
      return this.g(this.gt() ? bpi.a : bpi.k);
   }

   @Override
   protected boolean a(cia $$0, cpq $$1) {
      if (!this.o($$1)) {
         return false;
      } else {
         boolean $$2 = this.eu() < this.eL();
         if ($$2) {
            this.c(2.0F);
         }

         boolean $$3 = this.gA() && this.h() == 0 && this.gm();
         if ($$3) {
            this.g($$0);
         }

         boolean $$4 = this.o_();
         if ($$4) {
            this.dJ().a(kb.M, this.d(1.0), this.dr() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
            if (!this.dJ().B) {
               this.b_(10);
            }
         }

         if (!$$2 && !$$3 && !$$4) {
            return false;
         } else {
            if (!this.aU()) {
               ato $$5 = this.gs();
               if ($$5 != null) {
                  this.dJ().a(null, this.do(), this.dq(), this.du(), $$5, this.cY(), 1.0F, 1.0F + (this.af.i() - this.af.i()) * 0.2F);
               }
            }

            this.b(dqr.m);
            return true;
         }
      }
   }

   @Override
   protected boolean gr() {
      return false;
   }

   @Override
   public boolean a(cam $$0) {
      if ($$0 != this && $$0 instanceof ccb $$1 && this.gT() && $$1.gT()) {
         return true;
      }

      return false;
   }

   @Nullable
   public ccb b(apa $$0, boa $$1) {
      return bol.n.a((cwe)$$0);
   }

   @Nullable
   @Override
   protected ato gs() {
      return atp.dt;
   }

   @Override
   protected void f(bne $$0, float $$1) {
      this.gy();
      super.f($$0, $$1);
   }

   @Override
   protected eov a(bof $$0, boi $$1, float $$2) {
      int $$3 = Math.max(this.cM().indexOf($$0), 0);
      boolean $$4 = $$3 == 0;
      float $$5 = 0.5F;
      float $$6 = (float)(this.dE() ? 0.01F : this.a($$4, 0.0F, $$1, $$2));
      if (this.cM().size() > 1) {
         if (!$$4) {
            $$5 = -0.7F;
         }

         if ($$0 instanceof cam) {
            $$5 += 0.2F;
         }
      }

      return new eov(0.0, (double)$$6, (double)($$5 * $$2)).b(-this.dz() * (float) (Math.PI / 180.0));
   }

   @Override
   public float dX() {
      return this.o_() ? 0.45F : 1.0F;
   }

   private double a(boolean $$0, float $$1, boi $$2, float $$3) {
      double $$4 = (double)($$2.b() - 0.375F * $$3);
      float $$5 = $$3 * 1.43F;
      float $$6 = $$5 - $$3 * 0.2F;
      float $$7 = $$5 - $$6;
      boolean $$8 = this.gv();
      boolean $$9 = this.gt();
      if ($$8) {
         int $$10 = $$9 ? 40 : 52;
         int $$11;
         float $$12;
         if ($$9) {
            $$11 = 28;
            $$12 = $$0 ? 0.5F : 0.1F;
         } else {
            $$11 = $$0 ? 24 : 32;
            $$12 = $$0 ? 0.6F : 0.35F;
         }

         float $$15 = awm.a((float)this.gz() + $$1, 0.0F, (float)$$10);
         boolean $$16 = $$15 < (float)$$11;
         float $$17 = $$16 ? $$15 / (float)$$11 : ($$15 - (float)$$11) / (float)($$10 - $$11);
         float $$18 = $$5 - $$12 * $$6;
         $$4 += $$9 ? (double)awm.i($$17, $$16 ? $$5 : $$18, $$16 ? $$18 : $$7) : (double)awm.i($$17, $$16 ? $$7 - $$5 : $$7 - $$18, $$16 ? $$7 - $$18 : 0.0F);
      }

      if ($$9 && !$$8) {
         $$4 += (double)$$7;
      }

      return $$4;
   }

   @Override
   public eov p(float $$0) {
      boi $$1 = this.a(this.ap());
      float $$2 = this.dX();
      return new eov(0.0, this.a(true, $$0, $$1, $$2) - (double)(0.2F * $$2), (double)($$1.a() * 0.56F));
   }

   @Override
   public int fJ() {
      return 30;
   }

   @Override
   protected boolean q(bof $$0) {
      return this.cM().size() <= 2;
   }

   @Override
   protected void Z() {
      super.Z();
      aes.a(this);
   }

   public boolean gt() {
      return this.am.b(cb) < 0L;
   }

   public boolean gu() {
      return this.gz() < 0L != this.gt();
   }

   public boolean gv() {
      long $$0 = this.gz();
      return $$0 < (long)(this.gt() ? 40 : 52);
   }

   private boolean gX() {
      return this.gt() && this.gz() < 40L && this.gz() >= 0L;
   }

   public void gw() {
      if (!this.gt()) {
         this.b(atp.dw);
         this.b(bpi.k);
         this.b(dqr.u);
         this.a(-this.dJ().X());
      }
   }

   public void gx() {
      if (this.gt()) {
         this.b(atp.dx);
         this.b(bpi.a);
         this.b(dqr.u);
         this.a(this.dJ().X());
      }
   }

   public void gy() {
      this.b(bpi.a);
      this.b(dqr.u);
      this.b(this.dJ().X());
   }

   @VisibleForTesting
   public void a(long $$0) {
      this.am.b(cb, $$0);
   }

   private void b(long $$0) {
      this.a(Math.max(0L, $$0 - 52L - 1L));
   }

   public long gz() {
      return this.dJ().X() - Math.abs(this.am.b(cb));
   }

   @Override
   public ato Z_() {
      return atp.dv;
   }

   @Override
   public void a(aii<?> $$0) {
      if (!this.al && ca.equals($$0)) {
         this.cG = this.cG == 0 ? 55 : this.cG;
      }

      super.a($$0);
   }

   @Override
   public boolean gA() {
      return true;
   }

   @Override
   public void b(cia $$0) {
      if (!this.dJ().B) {
         $$0.a(this, this.cq);
      }
   }

   @Override
   protected bus H() {
      return new ccb.a(this);
   }

   class a extends bus {
      public a(ccb $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (!ccb.this.w()) {
            super.a();
         }
      }
   }

   class b extends buw {
      b() {
         super(ccb.this);
      }

      @Override
      public void a() {
         if (!ccb.this.cL()) {
            super.a();
         }
      }
   }

   class c extends bux {
      public c() {
         super(ccb.this);
      }

      @Override
      public void a() {
         if (this.k == bux.a.b && !ccb.this.fZ() && ccb.this.gt() && !ccb.this.gv() && ccb.this.gl()) {
            ccb.this.gx();
         }

         super.a();
      }
   }
}
