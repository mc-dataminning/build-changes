import com.google.common.collect.Sets;
import com.google.common.collect.UnmodifiableIterator;
import java.util.Set;
import javax.annotation.Nullable;

public class cmj extends cgw implements bvc, bvv {
   private static final aku bY = aku.b("suffocating");
   private static final bwl bZ = new bwl(bY, -0.34F, bwl.a.b);
   private static final float ca = 0.35F;
   private static final float cc = 0.55F;
   private static final ajx<Integer> cd = akb.a(cmj.class, ajz.b);
   private static final ajx<Boolean> ce = akb.a(cmj.class, ajz.k);
   private static final ajx<Boolean> cf = akb.a(cmj.class, ajz.k);
   private final bvb cg = new bvb(this.al, cd, cf);
   @Nullable
   private cdl ch;

   public cmj(buq<? extends cmj> $$0, dgg $$1) {
      super($$0, $$1);
      this.I = true;
      this.a(eto.j, -1.0F);
      this.a(eto.i, 0.0F);
      this.a(eto.n, 0.0F);
      this.a(eto.o, 0.0F);
   }

   public static boolean c(buq<cmj> $$0, dgh $$1, bup $$2, ji $$3, azg $$4) {
      ji.a $$5 = $$3.k();

      do {
         $$5.c(jn.b);
      } while ($$1.b_($$5).a(awu.b));

      return $$1.a_($$5).l();
   }

   @Override
   public void a(ajx<?> $$0) {
      if (cd.equals($$0) && this.dW().C) {
         this.cg.a();
      }

      super.a($$0);
   }

   @Override
   protected void a(akb.a $$0) {
      super.a($$0);
      $$0.a(cd, 0);
      $$0.a(ce, false);
      $$0.a(cf, false);
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      this.cg.a($$0);
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      this.cg.b($$0);
   }

   @Override
   public boolean j() {
      return this.cg.d();
   }

   @Override
   public boolean f() {
      return this.bL() && !this.e_();
   }

   @Override
   public void a(cwn $$0, @Nullable awa $$1) {
      this.cg.a(true);
      if ($$1 != null) {
         this.dW().a(null, this, avz.yS, $$1, 0.5F, 1.0F);
      }
   }

   @Override
   protected void B() {
      this.bS.a(1, new ccw(this, 1.65));
      this.bS.a(2, new cbp(this, 1.0));
      this.ch = new cdl(this, 1.4, $$0 -> $$0.a(awx.ay), false);
      this.bS.a(3, this.ch);
      this.bS.a(4, new cmj.a(this, 1.0));
      this.bS.a(5, new ccc(this, 1.0));
      this.bS.a(7, new cda(this, 1.0, 60));
      this.bS.a(8, new ccl(this, cov.class, 8.0F));
      this.bS.a(8, new ccy(this));
      this.bS.a(9, new ccl(this, cmj.class, 8.0F));
   }

   public void x(boolean $$0) {
      this.al.a(ce, $$0);
      bwj $$1 = this.g(bwn.v);
      if ($$1 != null) {
         if ($$0) {
            $$1.a(bZ);
         } else {
            $$1.c(bY);
         }
      }
   }

   public boolean p() {
      return this.al.a(ce);
   }

   @Override
   public boolean a(esx $$0) {
      return $$0.a(awu.b);
   }

   @Override
   protected fay a(buj $$0, bum $$1, float $$2) {
      float $$3 = Math.min(0.25F, this.aT.b());
      float $$4 = this.aT.c();
      float $$5 = 0.12F * ayy.b($$4 * 1.5F) * 2.0F * $$3;
      return super.a($$0, $$1, $$2).b(0.0, (double)($$5 * $$2), 0.0);
   }

   @Override
   public boolean a(dgj $$0) {
      return $$0.f(this);
   }

   @Nullable
   @Override
   public bvf cX() {
      return (bvf)(this.j() && this.da() instanceof cov $$0 && $$0.b(cwr.ou) ? $$0 : super.cX());
   }

   @Override
   public fay b(bvf $$0) {
      fay[] $$1 = new fay[]{
         a((double)this.dr(), (double)$$0.dr(), $$0.dM()),
         a((double)this.dr(), (double)$$0.dr(), $$0.dM() - 22.5F),
         a((double)this.dr(), (double)$$0.dr(), $$0.dM() + 22.5F),
         a((double)this.dr(), (double)$$0.dr(), $$0.dM() - 45.0F),
         a((double)this.dr(), (double)$$0.dr(), $$0.dM() + 45.0F)
      };
      Set<ji> $$2 = Sets.newLinkedHashSet();
      double $$3 = this.cR().e;
      double $$4 = this.cR().b - 0.5;
      ji.a $$5 = new ji.a();

      for (fay $$6 : $$1) {
         $$5.b(this.dB() + $$6.d, $$3, this.dH() + $$6.f);

         for (double $$7 = $$3; $$7 > $$4; $$7--) {
            $$2.add($$5.j());
            $$5.c(jn.a);
         }
      }

      for (ji $$8 : $$2) {
         if (!this.dW().b_($$8).a(awu.b)) {
            double $$9 = this.dW().j($$8);
            if (cra.a($$9)) {
               fay $$10 = fay.a($$8, $$9);
               UnmodifiableIterator var14 = $$0.fO().iterator();

               while (var14.hasNext()) {
                  bvr $$11 = (bvr)var14.next();
                  fat $$12 = $$0.f($$11);
                  if (cra.a(this.dW(), $$0, $$12.c($$10))) {
                     $$0.b($$11);
                     return $$10;
                  }
               }
            }
         }
      }

      return new fay(this.dB(), this.cR().e, this.dH());
   }

   @Override
   protected void a(cov $$0, fay $$1) {
      this.b($$0.dM(), $$0.dO() * 0.5F);
      this.N = this.aX = this.aZ = this.dM();
      this.cg.b();
      super.a($$0, $$1);
   }

   @Override
   protected fay b(cov $$0, fay $$1) {
      return new fay(0.0, 0.0, 1.0);
   }

   @Override
   protected float e(cov $$0) {
      return (float)(this.h(bwn.v) * (double)(this.p() ? 0.35F : 0.55F) * (double)this.cg.c());
   }

   @Override
   protected float aU() {
      return this.X + 0.6F;
   }

   @Override
   protected void b(ji $$0, dwv $$1) {
      this.a(this.bx() ? avz.yQ : avz.yP, 1.0F, 1.0F);
   }

   @Override
   public boolean a() {
      return this.cg.a(this.dZ());
   }

   @Override
   protected void a(double $$0, boolean $$1, dwv $$2, ji $$3) {
      if (this.bx()) {
         this.k();
      } else {
         super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public void h() {
      if (this.x() && this.ae.a(140) == 0) {
         this.b(avz.yL);
      } else if (this.gm() && this.ae.a(60) == 0) {
         this.b(avz.yM);
      }

      if (!this.gc()) {
         boolean $$2;
         boolean var10000;
         label36: {
            dwv $$0 = this.dW().a_(this.dw());
            dwv $$1 = this.bt();
            $$2 = $$0.a(awo.aW) || $$1.a(awo.aW) || this.b(awu.b) > 0.0;
            if (this.dl() instanceof cmj $$3 && $$3.p()) {
               var10000 = true;
               break label36;
            }

            var10000 = false;
         }

         boolean $$4 = var10000;
         this.x(!$$2 || $$4);
      }

      super.h();
      this.gp();
   }

   private boolean x() {
      return this.ch != null && this.ch.i();
   }

   @Override
   protected boolean D() {
      return true;
   }

   private void gp() {
      if (this.bx()) {
         fbd $$0 = fbd.a(this);
         if ($$0.a(doc.d, this.dw(), true) && !this.dW().b_(this.dw().d()).a(awu.b)) {
            this.d(true);
         } else {
            this.h(this.dz().c(0.5).b(0.0, 0.05, 0.0));
         }
      }
   }

   public static bwm.a t() {
      return cgw.gu().a(bwn.v, 0.175F);
   }

   @Override
   protected avy u() {
      return !this.gm() && !this.x() ? avz.yK : null;
   }

   @Override
   protected avy e(bsz $$0) {
      return avz.yO;
   }

   @Override
   protected avy o_() {
      return avz.yN;
   }

   @Override
   protected boolean r(buj $$0) {
      return !this.ca() && !this.a(awu.b);
   }

   @Override
   public boolean fr() {
      return true;
   }

   @Override
   public boolean bY() {
      return false;
   }

   @Override
   protected cer b(dgg $$0) {
      return new cmj.b(this, $$0);
   }

   @Override
   public float a(ji $$0, dgj $$1) {
      if ($$1.a_($$0).y().a(awu.b)) {
         return 10.0F;
      } else {
         return this.bx() ? Float.NEGATIVE_INFINITY : 0.0F;
      }
   }

   @Nullable
   public cmj b(arc $$0, bua $$1) {
      return buq.bs.a($$0, bup.e);
   }

   @Override
   public boolean j(cwn $$0) {
      return $$0.a(awx.ax);
   }

   @Override
   protected void f(arc $$0) {
      super.f($$0);
      if (this.j()) {
         this.a($$0, cwr.on);
      }
   }

   @Override
   public bsi b(cov $$0, bsh $$1) {
      boolean $$2 = this.j($$0.b($$1));
      if (!$$2 && this.j() && !this.ca() && !$$0.fY()) {
         if (!this.dW().C) {
            $$0.n(this);
         }

         return bsi.a;
      } else {
         bsi $$3 = super.b($$0, $$1);
         if (!$$3.a()) {
            cwn $$4 = $$0.b($$1);
            return (bsi)($$4.a(cwr.on) ? $$4.a($$0, this, $$1) : bsi.e);
         } else {
            if ($$2 && !this.bb()) {
               this.dW().a(null, this.dB(), this.dD(), this.dH(), avz.yR, this.dn(), 1.0F, 1.0F + (this.ae.i() - this.ae.i()) * 0.2F);
            }

            return $$3;
         }
      }
   }

   @Override
   public fay cT() {
      return new fay(0.0, (double)(0.6F * this.cS()), (double)(this.dr() * 0.4F));
   }

   @Nullable
   @Override
   public bvy a(dgx $$0, bsg $$1, bup $$2, @Nullable bvy $$3) {
      if (this.e_()) {
         return super.a($$0, $$1, $$2, $$3);
      } else {
         azg $$4 = $$0.H_();
         if ($$4.a(30) == 0) {
            bvh $$5 = buq.bQ.a($$0.a(), bup.g);
            if ($$5 != null) {
               $$3 = this.a($$0, $$1, $$5, new cmp.b(cmp.a($$4), false));
               $$5.a(bur.a, new cwn(cwr.ou));
               this.a(new cwn(cwr.on), null);
            }
         } else if ($$4.a(10) == 0) {
            bua $$6 = buq.bs.a($$0.a(), bup.g);
            if ($$6 != null) {
               $$6.c_(-24000);
               $$3 = this.a($$0, $$1, $$6, null);
            }
         } else {
            $$3 = new bua.a(0.5F);
         }

         return super.a($$0, $$1, $$2, $$3);
      }
   }

   private bvy a(dgx $$0, bsg $$1, bvh $$2, @Nullable bvy $$3) {
      $$2.b(this.dB(), this.dD(), this.dH(), this.dM(), 0.0F);
      $$2.a($$0, $$1, bup.g, $$3);
      $$2.a(this, true);
      return new bua.a(0.0F);
   }

   static class a extends ccq {
      private final cmj g;

      a(cmj $$0, double $$1) {
         super($$0, $$1, 8, 2);
         this.g = $$0;
      }

      @Override
      public ji k() {
         return this.e;
      }

      @Override
      public boolean c() {
         return !this.g.bx() && this.a(this.g.dW(), this.e);
      }

      @Override
      public boolean b() {
         return !this.g.bx() && super.b();
      }

      @Override
      public boolean l() {
         return this.d % 20 == 0;
      }

      @Override
      protected boolean a(dgj $$0, ji $$1) {
         return $$0.a_($$1).a(djm.K) && $$0.a_($$1.d()).a(etm.a);
      }
   }

   static class b extends ceq {
      b(cmj $$0, dgg $$1) {
         super($$0, $$1);
      }

      @Override
      protected etn a(int $$0) {
         this.o = new ett();
         return new etn(this.o, $$0);
      }

      @Override
      protected boolean a(eto $$0) {
         return $$0 != eto.i && $$0 != eto.o && $$0 != eto.n ? super.a($$0) : true;
      }

      @Override
      public boolean a(ji $$0) {
         return this.b.a_($$0).a(djm.K) || super.a($$0);
      }
   }
}
