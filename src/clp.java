import java.util.List;
import javax.annotation.Nullable;

public class clp extends cmg {
   @Nullable
   private chs a;

   public clp(buq<? extends clp> $$0, dgg $$1) {
      super($$0, $$1);
      this.bN = 10;
   }

   @Override
   protected void B() {
      super.B();
      this.bS.a(0, new cbx(this));
      this.bS.a(1, new clp.b());
      this.bS.a(2, new cbk<>(this, cov.class, 8.0F, 0.6, 1.0));
      this.bS.a(3, new cbk<>(this, cna.class, 8.0F, 0.6, 1.0));
      this.bS.a(4, new clp.c());
      this.bS.a(5, new clp.a());
      this.bS.a(6, new clp.d());
      this.bS.a(8, new cda(this, 0.6));
      this.bS.a(9, new ccl(this, cov.class, 3.0F, 1.0F));
      this.bS.a(10, new ccl(this, bvh.class, 8.0F));
      this.bT.a(1, new cdv(this, cqj.class).a());
      this.bT.a(2, new cdw<>(this, cov.class, true).c(300));
      this.bT.a(3, new cdw<>(this, cob.class, false).c(300));
      this.bT.a(3, new cdw<>(this, chi.class, false));
   }

   public static bwm.a p() {
      return clw.gu().a(bwn.v, 0.5).a(bwn.m, 12.0).a(bwn.s, 24.0);
   }

   @Override
   protected void a(akb.a $$0) {
      super.a($$0);
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
   }

   @Override
   public avy aj_() {
      return avz.iU;
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
   }

   @Override
   protected boolean t(buj $$0) {
      if ($$0 == this) {
         return true;
      } else if (super.t($$0)) {
         return true;
      } else {
         if ($$0 instanceof cmk $$1 && $$1.t() != null) {
            return this.t($$1.t());
         }

         return false;
      }
   }

   @Override
   protected avy u() {
      return avz.iS;
   }

   @Override
   protected avy o_() {
      return avz.iV;
   }

   @Override
   protected avy e(bsz $$0) {
      return avz.iX;
   }

   void a(@Nullable chs $$0) {
      this.a = $$0;
   }

   @Nullable
   chs gJ() {
      return this.a;
   }

   @Override
   protected avy x() {
      return avz.iT;
   }

   @Override
   public void a(arc $$0, int $$1, boolean $$2) {
   }

   class a extends cmg.c {
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
         bvf $$0 = clp.this.O_();
         double $$1 = Math.min($$0.dD(), clp.this.dD());
         double $$2 = Math.max($$0.dD(), clp.this.dD()) + 1.0;
         float $$3 = (float)ayy.d($$0.dH() - clp.this.dH(), $$0.dB() - clp.this.dB());
         if (clp.this.g((buj)$$0) < 9.0) {
            for (int $$4 = 0; $$4 < 5; $$4++) {
               float $$5 = $$3 + (float)$$4 * (float) Math.PI * 0.4F;
               this.a(clp.this.dB() + (double)ayy.b($$5) * 1.5, clp.this.dH() + (double)ayy.a($$5) * 1.5, $$1, $$2, $$5, 0);
            }

            for (int $$6 = 0; $$6 < 8; $$6++) {
               float $$7 = $$3 + (float)$$6 * (float) Math.PI * 2.0F / 8.0F + (float) (Math.PI * 2.0 / 5.0);
               this.a(clp.this.dB() + (double)ayy.b($$7) * 2.5, clp.this.dH() + (double)ayy.a($$7) * 2.5, $$1, $$2, $$7, 3);
            }
         } else {
            for (int $$8 = 0; $$8 < 16; $$8++) {
               double $$9 = 1.25 * (double)($$8 + 1);
               int $$10 = 1 * $$8;
               this.a(clp.this.dB() + (double)ayy.b($$3) * $$9, clp.this.dH() + (double)ayy.a($$3) * $$9, $$1, $$2, $$3, $$10);
            }
         }
      }

      private void a(double $$0, double $$1, double $$2, double $$3, float $$4, int $$5) {
         ji $$6 = ji.a($$0, $$3, $$1);
         boolean $$7 = false;
         double $$8 = 0.0;

         do {
            ji $$9 = $$6.e();
            dwv $$10 = clp.this.dW().a_($$9);
            if ($$10.c(clp.this.dW(), $$9, jn.b)) {
               if (!clp.this.dW().u($$6)) {
                  dwv $$11 = clp.this.dW().a_($$6);
                  fbs $$12 = $$11.g(clp.this.dW(), $$6);
                  if (!$$12.c()) {
                     $$8 = $$12.c(jn.a.b);
                  }
               }

               $$7 = true;
               break;
            }

            $$6 = $$6.e();
         } while ($$6.v() >= ayy.a($$2) - 1);

         if ($$7) {
            clp.this.dW().b(new cpg(clp.this.dW(), $$0, (double)$$6.v() + $$8, $$1, $$4, $$5, clp.this));
            clp.this.dW().a(ebr.t, new fay($$0, (double)$$6.v() + $$8, $$1), ebr.a.a(clp.this));
         }
      }

      @Override
      protected avy l() {
         return avz.iY;
      }

      @Override
      protected cmg.a m() {
         return cmg.a.c;
      }
   }

   class b extends cmg.b {
      @Override
      public void a() {
         if (clp.this.O_() != null) {
            clp.this.H().a(clp.this.O_(), (float)clp.this.ab(), (float)clp.this.aa());
         } else if (clp.this.gJ() != null) {
            clp.this.H().a(clp.this.gJ(), (float)clp.this.ab(), (float)clp.this.aa());
         }
      }
   }

   class c extends cmg.c {
      private final cfw e = cfw.b().a(16.0).d().e();

      @Override
      public boolean b() {
         if (!super.b()) {
            return false;
         } else {
            int $$0 = a(clp.this.dW()).a(cmk.class, this.e, clp.this, clp.this.cR().g(16.0)).size();
            return clp.this.ae.a(8) + 1 > $$0;
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
         arc $$0 = (arc)clp.this.dW();
         fby $$1 = clp.this.cr();

         for (int $$2 = 0; $$2 < 3; $$2++) {
            ji $$3 = clp.this.dw().b(-2 + clp.this.ae.a(5), 1, -2 + clp.this.ae.a(5));
            cmk $$4 = buq.bB.a(clp.this.dW(), bup.f);
            if ($$4 != null) {
               $$4.a($$3, 0.0F, 0.0F);
               $$4.a($$0, clp.this.dW().d_($$3), bup.f, null);
               $$4.a(clp.this);
               $$4.h($$3);
               $$4.b(20 * (30 + clp.this.ae.a(90)));
               if ($$1 != null) {
                  $$0.g().a($$4.cI(), $$1);
               }

               $$0.a_($$4);
               $$0.a(ebr.t, $$3, ebr.a.a(clp.this));
            }
         }
      }

      @Override
      protected avy l() {
         return avz.iZ;
      }

      @Override
      protected cmg.a m() {
         return cmg.a.b;
      }
   }

   public class d extends cmg.c {
      private final cfw e = cfw.b().a(16.0).a(($$0x, $$1) -> ((chs)$$0x).t() == cvk.l);

      @Override
      public boolean b() {
         if (clp.this.O_() != null) {
            return false;
         } else if (clp.this.gy()) {
            return false;
         } else if (clp.this.af < this.c) {
            return false;
         } else {
            arc $$0 = a(clp.this.dW());
            if (!$$0.O().b(dgc.c)) {
               return false;
            } else {
               List<chs> $$1 = $$0.a(chs.class, this.e, clp.this, clp.this.cR().c(16.0, 4.0, 16.0));
               if ($$1.isEmpty()) {
                  return false;
               } else {
                  clp.this.a($$1.get(clp.this.ae.a($$1.size())));
                  return true;
               }
            }
         }
      }

      @Override
      public boolean c() {
         return clp.this.gJ() != null && this.b > 0;
      }

      @Override
      public void e() {
         super.e();
         clp.this.a(null);
      }

      @Override
      protected void k() {
         chs $$0 = clp.this.gJ();
         if ($$0 != null && $$0.bL()) {
            $$0.b(cvk.o);
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
      protected avy l() {
         return avz.ja;
      }

      @Override
      protected cmg.a m() {
         return cmg.a.d;
      }
   }
}
