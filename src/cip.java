import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class cip extends cjc {
   public static final float bY = 0.45F;
   public static final int bZ = 55;
   public static final int ca = 30;
   private static final float cB = 0.1F;
   private static final float cC = 1.4285F;
   private static final float cD = 22.2222F;
   private static final int cE = 5;
   private static final int cF = 40;
   private static final int cG = 52;
   private static final int cH = 80;
   private static final float cI = 1.43F;
   public static final akm<Boolean> cc = akq.a(cip.class, ako.k);
   public static final akm<Long> cd = akq.a(cip.class, ako.c);
   public final bud ce = new bud();
   public final bud cf = new bud();
   public final bud cg = new bud();
   public final bud ch = new bud();
   public final bud ci = new bud();
   private static final buo cJ = buo.b(bus.t.l(), bus.t.m() - 1.43F).b(0.845F);
   private int cK = 0;
   private int cL = 0;

   public cip(bus<? extends cip> $$0, dfm $$1) {
      super($$0, $$1);
      this.bP = new cip.c();
      this.bO = new cip.b();
      ces $$2 = (ces)this.L();
      $$2.a(true);
      $$2.e(true);
   }

   @Override
   public void b(ul $$0) {
      super.b($$0);
      $$0.a("LastPoseTick", this.al.a(cd));
   }

   @Override
   public void a(ul $$0) {
      super.a($$0);
      long $$1 = $$0.i("LastPoseTick");
      if ($$1 < 0L) {
         this.b(bvt.k);
      }

      this.a($$1);
   }

   public static bwo.a n() {
      return gO().a(bwp.s, 32.0).a(bwp.v, 0.09F).a(bwp.o, 0.42F).a(bwp.B, 1.5);
   }

   @Override
   protected void a(akq.a $$0) {
      super.a($$0);
      $$0.a(cc, false);
      $$0.a(cd, 0L);
   }

   @Override
   public bwa a(dgd $$0, bsi $$1, bur $$2, @Nullable bwa $$3) {
      ciq.a(this, $$0.G_());
      this.b($$0.a().ab());
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected bwj.b<cip> ec() {
      return ciq.a();
   }

   @Override
   protected void B() {
   }

   @Override
   protected bwj<?> a(Dynamic<?> $$0) {
      return ciq.a(this.ec().a($$0));
   }

   @Override
   public buo e(bvt $$0) {
      return $$0 == bvt.k ? cJ.a(this.ei()) : super.e($$0);
   }

   @Override
   protected void a(arp $$0) {
      bou $$1 = bot.a();
      $$1.a("camelBrain");
      bwj<?> $$2 = this.eb();
      ((bwj<cip>)$$2).a($$0, this);
      $$1.c();
      $$1.a("camelActivityUpdate");
      ciq.a(this);
      $$1.c();
      super.a($$0);
   }

   @Override
   public void h() {
      super.h();
      if (this.v() && this.cK < 50 && (this.aJ() || this.bn() || this.bZ())) {
         this.x(false);
      }

      if (this.cK > 0) {
         this.cK--;
         if (this.cK == 0) {
            this.dV().a(null, this.dv(), awn.dA, awo.g, 1.0F, 1.0F);
         }
      }

      if (this.dV().A_()) {
         this.gY();
      }

      if (this.q()) {
         this.ab();
      }

      if (this.gp() && this.bj()) {
         this.gB();
      }
   }

   private void gY() {
      if (this.cL <= 0) {
         this.cL = this.ae.a(40) + 80;
         this.ch.a(this.af);
      } else {
         this.cL--;
      }

      if (this.gq()) {
         this.cg.a();
         this.ci.a();
         if (this.gZ()) {
            this.ce.b(this.af);
            this.cf.a();
         } else {
            this.ce.a();
            this.cf.b(this.af);
         }
      } else {
         this.ce.a();
         this.cf.a();
         this.ci.a(this.v(), this.af);
         this.cg.a(this.gy() && this.gC() >= 0L, this.af);
      }
   }

   @Override
   protected void B(float $$0) {
      float $$1;
      if (this.aw() == bvt.a && !this.ci.b()) {
         $$1 = Math.min($$0 * 6.0F, 1.0F);
      } else {
         $$1 = 0.0F;
      }

      this.aS.a($$1, 0.2F, this.e_() ? 3.0F : 1.0F);
   }

   @Override
   public void a_(ezy $$0) {
      if (this.q() && this.aJ()) {
         this.h(this.dy().d(0.0, 1.0, 0.0));
         $$0 = $$0.d(0.0, 1.0, 0.0);
      }

      super.a_($$0);
   }

   @Override
   protected void a(cou $$0, ezy $$1) {
      super.a($$0, $$1);
      if ($$0.bp > 0.0F && this.gp() && !this.gy()) {
         this.gA();
      }
   }

   public boolean q() {
      return this.gp() || this.gy();
   }

   @Override
   protected float e(cou $$0) {
      float $$1 = $$0.cj() && this.c() == 0 ? 0.1F : 0.0F;
      return (float)this.h(bwp.v) + $$1;
   }

   @Override
   protected ezx j(bvh $$0) {
      return this.q() ? new ezx(this.dN(), this.dL()) : super.j($$0);
   }

   @Override
   protected ezy b(cou $$0, ezy $$1) {
      return this.q() ? ezy.c : super.b($$0, $$1);
   }

   @Override
   public boolean a() {
      return !this.q() && super.a();
   }

   @Override
   public void b(int $$0) {
      if (this.j() && this.cK <= 0 && this.aJ()) {
         super.b($$0);
      }
   }

   @Override
   public boolean dO() {
      return true;
   }

   @Override
   protected void b(float $$0, ezy $$1) {
      double $$2 = (double)this.fh();
      this.i(this.bT().d(1.0, 0.0, 1.0).d().c((double)(22.2222F * $$0) * this.h(bwp.v) * (double)this.aT()).b(0.0, (double)(1.4285F * $$0) * $$2, 0.0));
      this.cK = 55;
      this.x(true);
      this.ar = true;
   }

   public boolean v() {
      return this.al.a(cc);
   }

   public void x(boolean $$0) {
      this.al.a(cc, $$0);
   }

   @Override
   public void c(int $$0) {
      this.b(awn.dz);
      this.a(ear.u);
      this.x(true);
   }

   @Override
   public void b() {
   }

   @Override
   public int c() {
      return this.cK;
   }

   @Override
   protected awm t() {
      return awn.dy;
   }

   @Override
   protected awm n_() {
      return awn.dB;
   }

   @Override
   protected awm e(btb $$0) {
      return awn.dD;
   }

   @Override
   protected void b(jh $$0, dvv $$1) {
      if ($$1.a(axc.bq)) {
         this.a(awn.dI, 1.0F, 1.0F);
      } else {
         this.a(awn.dH, 1.0F, 1.0F);
      }
   }

   @Override
   public boolean j(cwm $$0) {
      return $$0.a(axl.al);
   }

   @Override
   public bsk b(cou $$0, bsj $$1) {
      cwm $$2 = $$0.b($$1);
      if ($$0.fW() && !this.e_()) {
         this.b($$0);
         return bsk.a;
      } else {
         bsk $$3 = $$2.a($$0, this, $$1);
         if ($$3.a()) {
            return $$3;
         } else if (this.j($$2)) {
            return this.c($$0, $$2);
         } else {
            if (this.cZ().size() < 2 && !this.e_()) {
               this.a($$0);
            }

            return bsk.a;
         }
      }
   }

   @Override
   public boolean a(bul $$0, float $$1) {
      if ($$1 > 6.0F && this.gp() && !this.gy() && this.gm()) {
         this.gA();
      }

      return true;
   }

   public boolean gm() {
      return this.g(this.gp() ? bvt.a : bvt.k);
   }

   @Override
   protected boolean a(cou $$0, cwm $$1) {
      if (!this.j($$1)) {
         return false;
      } else {
         boolean $$2 = this.eD() < this.eR();
         if ($$2) {
            this.c(2.0F);
         }

         boolean $$3 = this.gD() && this.X_() == 0 && this.gt();
         if ($$3) {
            this.f($$0);
         }

         boolean $$4 = this.e_();
         if ($$4) {
            this.dV().a(ls.O, this.d(1.0), this.dD() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
            if (!this.dV().C) {
               this.b_(10);
            }
         }

         if (!$$2 && !$$3 && !$$4) {
            return false;
         } else {
            if (!this.bb()) {
               awm $$5 = this.go();
               if ($$5 != null) {
                  this.dV().a(null, this.dA(), this.dC(), this.dG(), $$5, this.dm(), 1.0F, 1.0F + (this.ae.i() - this.ae.i()) * 0.2F);
               }
            }

            this.a(ear.m);
            return true;
         }
      }
   }

   @Override
   protected boolean gn() {
      return false;
   }

   @Override
   public boolean a(cgy $$0) {
      if ($$0 != this && $$0 instanceof cip $$1 && this.gV() && $$1.gV()) {
         return true;
      }

      return false;
   }

   @Nullable
   public cip b(arp $$0, buc $$1) {
      return bus.t.a($$0, bur.e);
   }

   @Nullable
   @Override
   protected awm go() {
      return awn.dC;
   }

   @Override
   protected void b(arp $$0, btb $$1, float $$2) {
      this.gB();
      super.b($$0, $$1, $$2);
   }

   @Override
   protected ezy a(bul $$0, buo $$1, float $$2) {
      int $$3 = Math.max(this.cZ().indexOf($$0), 0);
      boolean $$4 = $$3 == 0;
      float $$5 = 0.5F;
      float $$6 = (float)(this.dQ() ? 0.01F : this.a($$4, 0.0F, $$1, $$2));
      if (this.cZ().size() > 1) {
         if (!$$4) {
            $$5 = -0.7F;
         }

         if ($$0 instanceof cgy) {
            $$5 += 0.2F;
         }
      }

      return new ezy(0.0, (double)$$6, (double)($$5 * $$2)).b(-this.dL() * (float) (Math.PI / 180.0));
   }

   @Override
   public float ei() {
      return this.e_() ? 0.45F : 1.0F;
   }

   private double a(boolean $$0, float $$1, buo $$2, float $$3) {
      double $$4 = (double)($$2.b() - 0.375F * $$3);
      float $$5 = $$3 * 1.43F;
      float $$6 = $$5 - $$3 * 0.2F;
      float $$7 = $$5 - $$6;
      boolean $$8 = this.gy();
      boolean $$9 = this.gp();
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

         float $$15 = azm.a((float)this.gC() + $$1, 0.0F, (float)$$10);
         boolean $$16 = $$15 < (float)$$11;
         float $$17 = $$16 ? $$15 / (float)$$11 : ($$15 - (float)$$11) / (float)($$10 - $$11);
         float $$18 = $$5 - $$12 * $$6;
         $$4 += $$9 ? (double)azm.h($$17, $$16 ? $$5 : $$18, $$16 ? $$18 : $$7) : (double)azm.h($$17, $$16 ? $$7 - $$5 : $$7 - $$18, $$16 ? $$7 - $$18 : 0.0F);
      }

      if ($$9 && !$$8) {
         $$4 += (double)$$7;
      }

      return $$4;
   }

   @Override
   public ezy s(float $$0) {
      buo $$1 = this.a(this.aw());
      float $$2 = this.ei();
      return new ezy(0.0, this.a(true, $$0, $$1, $$2) - (double)(0.2F * $$2), (double)($$1.a() * 0.56F));
   }

   @Override
   public int aa() {
      return 30;
   }

   @Override
   protected boolean r(bul $$0) {
      return this.cZ().size() <= 2;
   }

   @Override
   protected void Y() {
      super.Y();
      agt.a(this);
   }

   public boolean gp() {
      return this.al.a(cd) < 0L;
   }

   public boolean gq() {
      return this.gC() < 0L != this.gp();
   }

   public boolean gy() {
      long $$0 = this.gC();
      return $$0 < (long)(this.gp() ? 40 : 52);
   }

   private boolean gZ() {
      return this.gp() && this.gC() < 40L && this.gC() >= 0L;
   }

   public void gz() {
      if (!this.gp()) {
         this.b(awn.dF);
         this.b(bvt.k);
         this.a(ear.u);
         this.a(-this.dV().ab());
      }
   }

   public void gA() {
      if (this.gp()) {
         this.b(awn.dG);
         this.b(bvt.a);
         this.a(ear.u);
         this.a(this.dV().ab());
      }
   }

   public void gB() {
      this.b(bvt.a);
      this.a(ear.u);
      this.b(this.dV().ab());
   }

   @VisibleForTesting
   public void a(long $$0) {
      this.al.a(cd, $$0);
   }

   private void b(long $$0) {
      this.a(Math.max(0L, $$0 - 52L - 1L));
   }

   public long gC() {
      return this.dV().ab() - Math.abs(this.al.a(cd));
   }

   @Override
   public awm ab_() {
      return awn.dE;
   }

   @Override
   public void a(akm<?> $$0) {
      if (!this.ak && cc.equals($$0)) {
         this.cK = this.cK == 0 ? 55 : this.cK;
      }

      super.a($$0);
   }

   @Override
   public boolean gD() {
      return true;
   }

   @Override
   public void b(cou $$0) {
      if (!this.dV().C) {
         $$0.a(this, this.ct);
      }
   }

   @Override
   protected cbd G() {
      return new cip.a(this);
   }

   class a extends cbd {
      public a(final cip $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (!cip.this.q()) {
            super.a();
         }
      }
   }

   class b extends cbh {
      b() {
         super(cip.this);
      }

      @Override
      public void a() {
         if (!cip.this.cY()) {
            super.a();
         }
      }
   }

   class c extends cbi {
      public c() {
         super(cip.this);
      }

      @Override
      public void a() {
         if (this.k == cbi.a.b && !cip.this.N_() && cip.this.gp() && !cip.this.gy() && cip.this.gm()) {
            cip.this.gA();
         }

         super.a();
      }
   }
}
