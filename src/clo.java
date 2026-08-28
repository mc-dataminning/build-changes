import java.util.List;
import javax.annotation.Nullable;

public class clo extends cmf {
   @Nullable
   private chr b;

   public clo(bup<? extends clo> $$0, dff $$1) {
      super($$0, $$1);
      this.bN = 10;
   }

   @Override
   protected void D() {
      super.D();
      this.bS.a(0, new cbw(this));
      this.bS.a(1, new clo.b());
      this.bS.a(2, new cbj<>(this, cor.class, 8.0F, 0.6, 1.0));
      this.bS.a(4, new clo.c());
      this.bS.a(5, new clo.a());
      this.bS.a(6, new clo.d());
      this.bS.a(8, new ccz(this, 0.6));
      this.bS.a(9, new cck(this, cor.class, 3.0F, 1.0F));
      this.bS.a(10, new cck(this, bvg.class, 8.0F));
      this.bT.a(1, new cdu(this, cqf.class).a());
      this.bT.a(2, new cdv<>(this, cor.class, true).c(300));
      this.bT.a(3, new cdv<>(this, cnx.class, false).c(300));
      this.bT.a(3, new cdv<>(this, chh.class, false));
   }

   public static bwl.a t() {
      return clv.gB().a(bwm.v, 0.5).a(bwm.m, 12.0).a(bwm.s, 24.0);
   }

   @Override
   protected void a(aks.a $$0) {
      super.a($$0);
   }

   @Override
   public void a(un $$0) {
      super.a($$0);
   }

   @Override
   public awn aj_() {
      return awo.iA;
   }

   @Override
   public void b(un $$0) {
      super.b($$0);
   }

   @Override
   protected void ac() {
      super.ac();
   }

   @Override
   protected boolean t(bui $$0) {
      if ($$0 == this) {
         return true;
      } else if (super.t($$0)) {
         return true;
      } else {
         if ($$0 instanceof cmj $$1 && $$1.t() != null) {
            return this.t($$1.t());
         }

         return false;
      }
   }

   @Override
   protected awn w() {
      return awo.iy;
   }

   @Override
   protected awn o_() {
      return awo.iB;
   }

   @Override
   protected awn d(bsy $$0) {
      return awo.iD;
   }

   void a(@Nullable chr $$0) {
      this.b = $$0;
   }

   @Nullable
   chr gQ() {
      return this.b;
   }

   @Override
   protected awn gv() {
      return awo.iz;
   }

   @Override
   public void a(arq $$0, int $$1, boolean $$2) {
   }

   class a extends cmf.c {
      @Override
      protected int h() {
         return 40;
      }

      @Override
      protected int i() {
         return 100;
      }

      @Override
      protected void k() {
         bve $$0 = clo.this.m();
         double $$1 = Math.min($$0.dF(), clo.this.dF());
         double $$2 = Math.max($$0.dF(), clo.this.dF()) + 1.0;
         float $$3 = (float)azn.d($$0.dJ() - clo.this.dJ(), $$0.dD() - clo.this.dD());
         if (clo.this.g((bui)$$0) < 9.0) {
            for (int $$4 = 0; $$4 < 5; $$4++) {
               float $$5 = $$3 + (float)$$4 * (float) Math.PI * 0.4F;
               this.a(clo.this.dD() + (double)azn.b($$5) * 1.5, clo.this.dJ() + (double)azn.a($$5) * 1.5, $$1, $$2, $$5, 0);
            }

            for (int $$6 = 0; $$6 < 8; $$6++) {
               float $$7 = $$3 + (float)$$6 * (float) Math.PI * 2.0F / 8.0F + (float) (Math.PI * 2.0 / 5.0);
               this.a(clo.this.dD() + (double)azn.b($$7) * 2.5, clo.this.dJ() + (double)azn.a($$7) * 2.5, $$1, $$2, $$7, 3);
            }
         } else {
            for (int $$8 = 0; $$8 < 16; $$8++) {
               double $$9 = 1.25 * (double)($$8 + 1);
               int $$10 = 1 * $$8;
               this.a(clo.this.dD() + (double)azn.b($$3) * $$9, clo.this.dJ() + (double)azn.a($$3) * $$9, $$1, $$2, $$3, $$10);
            }
         }
      }

      private void a(double $$0, double $$1, double $$2, double $$3, float $$4, int $$5) {
         jh $$6 = jh.a($$0, $$3, $$1);
         boolean $$7 = false;
         double $$8 = 0.0;

         do {
            jh $$9 = $$6.e();
            dvo $$10 = clo.this.dY().a_($$9);
            if ($$10.c(clo.this.dY(), $$9, jm.b)) {
               if (!clo.this.dY().u($$6)) {
                  dvo $$11 = clo.this.dY().a_($$6);
                  fal $$12 = $$11.g(clo.this.dY(), $$6);
                  if (!$$12.c()) {
                     $$8 = $$12.c(jm.a.b);
                  }
               }

               $$7 = true;
               break;
            }

            $$6 = $$6.e();
         } while ($$6.v() >= azn.a($$2) - 1);

         if ($$7) {
            clo.this.dY().b(new cpc(clo.this.dY(), $$0, (double)$$6.v() + $$8, $$1, $$4, $$5, clo.this));
            clo.this.dY().a(eak.t, new ezr($$0, (double)$$6.v() + $$8, $$1), eak.a.a(clo.this));
         }
      }

      @Override
      protected awn l() {
         return awo.iE;
      }

      @Override
      protected cmf.a m() {
         return cmf.a.c;
      }
   }

   class b extends cmf.b {
      @Override
      public void a() {
         if (clo.this.m() != null) {
            clo.this.K().a(clo.this.m(), (float)clo.this.ae(), (float)clo.this.ad());
         } else if (clo.this.gQ() != null) {
            clo.this.K().a(clo.this.gQ(), (float)clo.this.ae(), (float)clo.this.ad());
         }
      }
   }

   class c extends cmf.c {
      private final cfv e = cfv.b().a(16.0).d().e();

      @Override
      public boolean b() {
         if (!super.b()) {
            return false;
         } else {
            int $$0 = clo.this.dY().a(cmj.class, this.e, clo.this, clo.this.cT().g(16.0)).size();
            return clo.this.af.a(8) + 1 > $$0;
         }
      }

      @Override
      protected int h() {
         return 100;
      }

      @Override
      protected int i() {
         return 340;
      }

      @Override
      protected void k() {
         arq $$0 = (arq)clo.this.dY();
         far $$1 = clo.this.ct();

         for (int $$2 = 0; $$2 < 3; $$2++) {
            jh $$3 = clo.this.dy().b(-2 + clo.this.af.a(5), 1, -2 + clo.this.af.a(5));
            cmj $$4 = bup.bi.a(clo.this.dY(), buo.f);
            if ($$4 != null) {
               $$4.a($$3, 0.0F, 0.0F);
               $$4.a($$0, clo.this.dY().d_($$3), buo.f, null);
               $$4.a(clo.this);
               $$4.h($$3);
               $$4.b(20 * (30 + clo.this.af.a(90)));
               if ($$1 != null) {
                  $$0.f().a($$4.cK(), $$1);
               }

               $$0.a_($$4);
               $$0.a(eak.t, $$3, eak.a.a(clo.this));
            }
         }
      }

      @Override
      protected awn l() {
         return awo.iF;
      }

      @Override
      protected cmf.a m() {
         return cmf.a.b;
      }
   }

   public class d extends cmf.c {
      private final cfv e = cfv.b().a(16.0).a($$0x -> ((chr)$$0x).t() == cvc.l);

      @Override
      public boolean b() {
         if (clo.this.m() != null) {
            return false;
         } else if (clo.this.gF()) {
            return false;
         } else if (clo.this.ag < this.c) {
            return false;
         } else if (!clo.this.dY().ac().b(dfb.c)) {
            return false;
         } else {
            List<chr> $$0 = clo.this.dY().a(chr.class, this.e, clo.this, clo.this.cT().c(16.0, 4.0, 16.0));
            if ($$0.isEmpty()) {
               return false;
            } else {
               clo.this.a($$0.get(clo.this.af.a($$0.size())));
               return true;
            }
         }
      }

      @Override
      public boolean c() {
         return clo.this.gQ() != null && this.b > 0;
      }

      @Override
      public void e() {
         super.e();
         clo.this.a(null);
      }

      @Override
      protected void k() {
         chr $$0 = clo.this.gQ();
         if ($$0 != null && $$0.bN()) {
            $$0.b(cvc.o);
         }
      }

      @Override
      protected int n() {
         return 40;
      }

      @Override
      protected int h() {
         return 60;
      }

      @Override
      protected int i() {
         return 140;
      }

      @Override
      protected awn l() {
         return awo.iG;
      }

      @Override
      protected cmf.a m() {
         return cmf.a.d;
      }
   }
}
