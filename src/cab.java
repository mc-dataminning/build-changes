import com.google.common.collect.Sets;
import com.google.common.collect.UnmodifiableIterator;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class cab extends bux implements bjj, bkc {
   private static final UUID bT = UUID.fromString("9e362924-01de-4ddd-a2b2-d0f7a405a174");
   private static final bkq bU = new bkq(bT, "Strider suffocating modifier", -0.34F, bkq.a.b);
   private static final float bW = 0.35F;
   private static final float bX = 0.55F;
   private static final cmm bY = cmm.a(cjo.dh);
   private static final cmm bZ = cmm.a(cjo.dh, cjo.ng);
   private static final aef<Integer> ca = aei.a(cab.class, aeh.b);
   private static final aef<Boolean> cb = aei.a(cab.class, aeh.k);
   private static final aef<Boolean> cc = aei.a(cab.class, aeh.k);
   private final bji cd = new bji(this.an, ca, cc);
   @Nullable
   private brp ce;

   public cab(bja<? extends cab> $$0, cqb $$1) {
      super($$0, $$1);
      this.I = true;
      this.a(ear.j, -1.0F);
      this.a(ear.i, 0.0F);
      this.a(ear.n, 0.0F);
      this.a(ear.o, 0.0F);
   }

   public static boolean c(bja<cab> $$0, cqc $$1, bjq $$2, gw $$3, ash $$4) {
      gw.a $$5 = $$3.j();

      do {
         $$5.c(ha.b);
      } while ($$1.b_($$5).a(aqa.b));

      return $$1.a_($$5).i();
   }

   @Override
   public void a(aef<?> $$0) {
      if (ca.equals($$0) && this.dL().B) {
         this.cd.a();
      }

      super.a($$0);
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(ca, 0);
      this.an.a(cb, false);
      this.an.a(cc, false);
   }

   @Override
   public void b(qw $$0) {
      super.b($$0);
      this.cd.a($$0);
   }

   @Override
   public void a(qw $$0) {
      super.a($$0);
      this.cd.b($$0);
   }

   @Override
   public boolean i() {
      return this.cd.d();
   }

   @Override
   public boolean g() {
      return this.bv() && !this.m_();
   }

   @Override
   public void a(@Nullable aph $$0) {
      this.cd.a(true);
      if ($$0 != null) {
         this.dL().a(null, this, apg.wr, $$0, 0.5F, 1.0F);
      }
   }

   @Override
   protected void z() {
      this.bO.a(1, new bra(this, 1.65));
      this.bO.a(2, new bpt(this, 1.0));
      this.ce = new brp(this, 1.4, bZ, false);
      this.bO.a(3, this.ce);
      this.bO.a(4, new cab.a(this, 1.0));
      this.bO.a(5, new bqg(this, 1.0));
      this.bO.a(7, new bre(this, 1.0, 60));
      this.bO.a(8, new bqp(this, cca.class, 8.0F));
      this.bO.a(8, new brc(this));
      this.bO.a(9, new bqp(this, cab.class, 8.0F));
   }

   public void w(boolean $$0) {
      this.an.b(cb, $$0);
      bko $$1 = this.a(bks.m);
      if ($$1 != null) {
         $$1.b(bT);
         if ($$0) {
            $$1.b(bU);
         }
      }
   }

   public boolean s() {
      return this.an.b(cb);
   }

   @Override
   public boolean a(eag $$0) {
      return $$0.a(aqa.b);
   }

   @Override
   protected Vector3f a(biw $$0, bix $$1, float $$2) {
      float $$3 = Math.min(0.25F, this.aQ.a());
      float $$4 = this.aQ.b();
      float $$5 = 0.12F * asb.b($$4 * 1.5F) * 2.0F * $$3;
      return new Vector3f(0.0F, $$1.b + $$5 * $$2, 0.0F);
   }

   @Override
   public boolean a(cqe $$0) {
      return $$0.f(this);
   }

   @Nullable
   @Override
   public bjm cN() {
      return (bjm)(this.i() && this.cQ() instanceof cca $$0 && $$0.b(cjo.ng) ? $$0 : super.cN());
   }

   @Override
   public ehh b(bjm $$0) {
      ehh[] $$1 = new ehh[]{
         a((double)this.df(), (double)$$0.df(), $$0.dB()),
         a((double)this.df(), (double)$$0.df(), $$0.dB() - 22.5F),
         a((double)this.df(), (double)$$0.df(), $$0.dB() + 22.5F),
         a((double)this.df(), (double)$$0.df(), $$0.dB() - 45.0F),
         a((double)this.df(), (double)$$0.df(), $$0.dB() + 45.0F)
      };
      Set<gw> $$2 = Sets.newLinkedHashSet();
      double $$3 = this.cG().e;
      double $$4 = this.cG().b - 0.5;
      gw.a $$5 = new gw.a();

      for (ehh $$6 : $$1) {
         $$5.b(this.dq() + $$6.c, $$3, this.dw() + $$6.e);

         for (double $$7 = $$3; $$7 > $$4; $$7--) {
            $$2.add($$5.i());
            $$5.c(ha.a);
         }
      }

      for (gw $$8 : $$2) {
         if (!this.dL().b_($$8).a(aqa.b)) {
            double $$9 = this.dL().i($$8);
            if (cdw.a($$9)) {
               ehh $$10 = ehh.a($$8, $$9);
               UnmodifiableIterator var14 = $$0.fA().iterator();

               while (var14.hasNext()) {
                  bjy $$11 = (bjy)var14.next();
                  ehc $$12 = $$0.e($$11);
                  if (cdw.a(this.dL(), $$0, $$12.c($$10))) {
                     $$0.b($$11);
                     return $$10;
                  }
               }
            }
         }
      }

      return new ehh(this.dq(), this.cG().e, this.dw());
   }

   @Override
   protected void a(cca $$0, ehh $$1) {
      this.a($$0.dB(), $$0.dD() * 0.5F);
      this.N = this.aU = this.aW = this.dB();
      this.cd.b();
      super.a($$0, $$1);
   }

   @Override
   protected ehh b(cca $$0, ehh $$1) {
      return new ehh(0.0, 0.0, 1.0);
   }

   @Override
   protected float e(cca $$0) {
      return (float)(this.b(bks.m) * (double)(this.s() ? 0.35F : 0.55F) * (double)this.cd.c());
   }

   @Override
   protected float aK() {
      return this.Z + 0.6F;
   }

   @Override
   protected void b(gw $$0, dfd $$1) {
      this.a(this.bl() ? apg.wp : apg.wo, 1.0F, 1.0F);
   }

   @Override
   public boolean a() {
      return this.cd.a(this.ef());
   }

   @Override
   protected void a(double $$0, boolean $$1, dfd $$2, gw $$3) {
      this.aO();
      if (this.bl()) {
         this.n();
      } else {
         super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public void l() {
      if (this.y() && this.ag.a(140) == 0) {
         this.a(apg.wk, 1.0F, this.eW());
      } else if (this.gb() && this.ag.a(60) == 0) {
         this.a(apg.wl, 1.0F, this.eW());
      }

      if (!this.fU()) {
         boolean $$2;
         boolean var10000;
         label36: {
            dfd $$0 = this.dL().a_(this.dl());
            dfd $$1 = this.bh();
            $$2 = $$0.a(apv.aT) || $$1.a(apv.aT) || this.b(aqa.b) > 0.0;
            if (this.cY() instanceof cab $$3 && $$3.s()) {
               var10000 = true;
               break label36;
            }

            var10000 = false;
         }

         boolean $$4 = var10000;
         this.w(!$$2 || $$4);
      }

      super.l();
      this.ge();
      this.aO();
   }

   private boolean y() {
      return this.ce != null && this.ce.i();
   }

   @Override
   protected boolean B() {
      return true;
   }

   private void ge() {
      if (this.bl()) {
         ehm $$0 = ehm.a(this);
         if ($$0.a(cxq.d, this.dl(), true) && !this.dL().b_(this.dl().c()).a(aqa.b)) {
            this.c(true);
         } else {
            this.f(this.do().a(0.5).b(0.0, 0.05, 0.0));
         }
      }
   }

   public static bkr.a t() {
      return bjo.A().a(bks.m, 0.175F).a(bks.g, 16.0);
   }

   @Override
   protected apf w() {
      return !this.gb() && !this.y() ? apg.wj : null;
   }

   @Override
   protected apf d(bhu $$0) {
      return apg.wn;
   }

   @Override
   protected apf l_() {
      return apg.wm;
   }

   @Override
   protected boolean r(biw $$0) {
      return !this.bO() && !this.a(aqa.b);
   }

   @Override
   public boolean fg() {
      return true;
   }

   @Override
   public boolean bM() {
      return false;
   }

   @Override
   protected bsv b(cqb $$0) {
      return new cab.b(this, $$0);
   }

   @Override
   public float a(gw $$0, cqe $$1) {
      if ($$1.a_($$0).u().a(aqa.b)) {
         return 10.0F;
      } else {
         return this.bl() ? Float.NEGATIVE_INFINITY : 0.0F;
      }
   }

   @Nullable
   public cab b(akt $$0, bir $$1) {
      return bja.aV.a((cqb)$$0);
   }

   @Override
   public boolean m(cjl $$0) {
      return bY.a($$0);
   }

   @Override
   protected void ex() {
      super.ex();
      if (this.i()) {
         this.a(cjo.mZ);
      }
   }

   @Override
   public bhe b(cca $$0, bhd $$1) {
      boolean $$2 = this.m($$0.b($$1));
      if (!$$2 && this.i() && !this.bO() && !$$0.fI()) {
         if (!this.dL().B) {
            $$0.n(this);
         }

         return bhe.a(this.dL().B);
      } else {
         bhe $$3 = super.b($$0, $$1);
         if (!$$3.a()) {
            cjl $$4 = $$0.b($$1);
            return $$4.a(cjo.mZ) ? $$4.a($$0, this, $$1) : bhe.d;
         } else {
            if ($$2 && !this.aS()) {
               this.dL().a(null, this.dq(), this.ds(), this.dw(), apg.wq, this.da(), 1.0F, 1.0F + (this.ag.i() - this.ag.i()) * 0.2F);
            }

            return $$3;
         }
      }
   }

   @Override
   public ehh cI() {
      return new ehh(0.0, (double)(0.6F * this.cH()), (double)(this.df() * 0.4F));
   }

   @Nullable
   @Override
   public bkf a(cqq $$0, bhc $$1, bjq $$2, @Nullable bkf $$3, @Nullable qw $$4) {
      if (this.m_()) {
         return super.a($$0, $$1, $$2, $$3, $$4);
      } else {
         ash $$5 = $$0.D_();
         if ($$5.a(30) == 0) {
            bjo $$6 = bja.bs.a((cqb)$$0.C());
            if ($$6 != null) {
               $$3 = this.a($$0, $$1, $$6, new cah.b(cah.a($$5), false));
               $$6.a(bjb.a, new cjl(cjo.ng));
               this.a(null);
            }
         } else if ($$5.a(10) == 0) {
            bir $$7 = bja.aV.a((cqb)$$0.C());
            if ($$7 != null) {
               $$7.c_(-24000);
               $$3 = this.a($$0, $$1, $$7, null);
            }
         } else {
            $$3 = new bir.a(0.5F);
         }

         return super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   private bkf a(cqq $$0, bhc $$1, bjo $$2, @Nullable bkf $$3) {
      $$2.b(this.dq(), this.ds(), this.dw(), this.dB(), 0.0F);
      $$2.a($$0, $$1, bjq.g, $$3, null);
      $$2.a(this, true);
      return new bir.a(0.0F);
   }

   static class a extends bqu {
      private final cab g;

      a(cab $$0, double $$1) {
         super($$0, $$1, 8, 2);
         this.g = $$0;
      }

      @Override
      public gw k() {
         return this.e;
      }

      @Override
      public boolean b() {
         return !this.g.bl() && this.a(this.g.dL(), this.e);
      }

      @Override
      public boolean a() {
         return !this.g.bl() && super.a();
      }

      @Override
      public boolean l() {
         return this.d % 20 == 0;
      }

      @Override
      protected boolean a(cqe $$0, gw $$1) {
         return $$0.a_($$1).a(cte.H) && $$0.a_($$1.c()).a($$0, $$1, eaw.a);
      }
   }

   static class b extends bsu {
      b(cab $$0, cqb $$1) {
         super($$0, $$1);
      }

      @Override
      protected eax a(int $$0) {
         this.o = new eba();
         this.o.a(true);
         return new eax(this.o, $$0);
      }

      @Override
      protected boolean a(ear $$0) {
         return $$0 != ear.i && $$0 != ear.o && $$0 != ear.n ? super.a($$0) : true;
      }

      @Override
      public boolean a(gw $$0) {
         return this.b.a_($$0).a(cte.H) || super.a($$0);
      }
   }
}
