import java.util.List;
import javax.annotation.Nullable;

public class cls extends cmj {
   @Nullable
   private chv a;

   public cls(but<? extends cls> $$0, dgj $$1) {
      super($$0, $$1);
      this.bN = 10;
   }

   @Override
   protected void E() {
      super.E();
      this.bS.a(0, new cca(this));
      this.bS.a(1, new cls.b());
      this.bS.a(2, new cbn<>(this, coy.class, 8.0F, 0.6, 1.0));
      this.bS.a(3, new cbn<>(this, cnd.class, 8.0F, 0.6, 1.0));
      this.bS.a(4, new cls.c());
      this.bS.a(5, new cls.a());
      this.bS.a(6, new cls.d());
      this.bS.a(8, new cdd(this, 0.6));
      this.bS.a(9, new cco(this, coy.class, 3.0F, 1.0F));
      this.bS.a(10, new cco(this, bvk.class, 8.0F));
      this.bT.a(1, new cdy(this, cqm.class).a());
      this.bT.a(2, new cdz<>(this, coy.class, true).c(300));
      this.bT.a(3, new cdz<>(this, coe.class, false).c(300));
      this.bT.a(3, new cdz<>(this, chl.class, false));
   }

   public static bwp.a p() {
      return clz.gx().a(bwq.v, 0.5).a(bwq.m, 12.0).a(bwq.s, 24.0);
   }

   @Override
   protected void a(akc.a $$0) {
      super.a($$0);
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
   }

   @Override
   public avz aj_() {
      return awa.iU;
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
   }

   @Override
   protected boolean t(bum $$0) {
      if ($$0 == this) {
         return true;
      } else if (super.t($$0)) {
         return true;
      } else {
         if ($$0 instanceof cmn $$1 && $$1.t() != null) {
            return this.t($$1.t());
         }

         return false;
      }
   }

   @Override
   protected avz u() {
      return awa.iS;
   }

   @Override
   protected avz o_() {
      return awa.iV;
   }

   @Override
   protected avz e(btc $$0) {
      return awa.iX;
   }

   void a(@Nullable chv $$0) {
      this.a = $$0;
   }

   @Nullable
   chv gM() {
      return this.a;
   }

   @Override
   protected avz x() {
      return awa.iT;
   }

   @Override
   public void a(ard $$0, int $$1, boolean $$2) {
   }

   class a extends cmj.c {
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
         bvi $$0 = cls.this.O_();
         double $$1 = Math.min($$0.dC(), cls.this.dC());
         double $$2 = Math.max($$0.dC(), cls.this.dC()) + 1.0;
         float $$3 = (float)ayz.d($$0.dG() - cls.this.dG(), $$0.dA() - cls.this.dA());
         if (cls.this.g((bum)$$0) < 9.0) {
            for (int $$4 = 0; $$4 < 5; $$4++) {
               float $$5 = $$3 + (float)$$4 * (float) Math.PI * 0.4F;
               this.a(cls.this.dA() + (double)ayz.b($$5) * 1.5, cls.this.dG() + (double)ayz.a($$5) * 1.5, $$1, $$2, $$5, 0);
            }

            for (int $$6 = 0; $$6 < 8; $$6++) {
               float $$7 = $$3 + (float)$$6 * (float) Math.PI * 2.0F / 8.0F + (float) (Math.PI * 2.0 / 5.0);
               this.a(cls.this.dA() + (double)ayz.b($$7) * 2.5, cls.this.dG() + (double)ayz.a($$7) * 2.5, $$1, $$2, $$7, 3);
            }
         } else {
            for (int $$8 = 0; $$8 < 16; $$8++) {
               double $$9 = 1.25 * (double)($$8 + 1);
               int $$10 = 1 * $$8;
               this.a(cls.this.dA() + (double)ayz.b($$3) * $$9, cls.this.dG() + (double)ayz.a($$3) * $$9, $$1, $$2, $$3, $$10);
            }
         }
      }

      private void a(double $$0, double $$1, double $$2, double $$3, float $$4, int $$5) {
         ji $$6 = ji.a($$0, $$3, $$1);
         boolean $$7 = false;
         double $$8 = 0.0;

         do {
            ji $$9 = $$6.e();
            dwy $$10 = cls.this.dV().a_($$9);
            if ($$10.c(cls.this.dV(), $$9, jn.b)) {
               if (!cls.this.dV().u($$6)) {
                  dwy $$11 = cls.this.dV().a_($$6);
                  fbv $$12 = $$11.g(cls.this.dV(), $$6);
                  if (!$$12.c()) {
                     $$8 = $$12.c(jn.a.b);
                  }
               }

               $$7 = true;
               break;
            }

            $$6 = $$6.e();
         } while ($$6.v() >= ayz.a($$2) - 1);

         if ($$7) {
            cls.this.dV().b(new cpj(cls.this.dV(), $$0, (double)$$6.v() + $$8, $$1, $$4, $$5, cls.this));
            cls.this.dV().a(ebu.t, new fbb($$0, (double)$$6.v() + $$8, $$1), ebu.a.a(cls.this));
         }
      }

      @Override
      protected avz l() {
         return awa.iY;
      }

      @Override
      protected cmj.a m() {
         return cmj.a.c;
      }
   }

   class b extends cmj.b {
      @Override
      public void a() {
         if (cls.this.O_() != null) {
            cls.this.L().a(cls.this.O_(), (float)cls.this.af(), (float)cls.this.ad());
         } else if (cls.this.gM() != null) {
            cls.this.L().a(cls.this.gM(), (float)cls.this.af(), (float)cls.this.ad());
         }
      }
   }

   class c extends cmj.c {
      private final cfz e = cfz.b().a(16.0).d().e();

      @Override
      public boolean b() {
         if (!super.b()) {
            return false;
         } else {
            int $$0 = a(cls.this.dV()).a(cmn.class, this.e, cls.this, cls.this.cR().g(16.0)).size();
            return cls.this.ae.a(8) + 1 > $$0;
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
         ard $$0 = (ard)cls.this.dV();
         fcb $$1 = cls.this.cr();

         for (int $$2 = 0; $$2 < 3; $$2++) {
            ji $$3 = cls.this.dv().b(-2 + cls.this.ae.a(5), 1, -2 + cls.this.ae.a(5));
            cmn $$4 = but.bB.a(cls.this.dV(), bus.f);
            if ($$4 != null) {
               $$4.a($$3, 0.0F, 0.0F);
               $$4.a($$0, cls.this.dV().d_($$3), bus.f, null);
               $$4.a(cls.this);
               $$4.h($$3);
               $$4.b(20 * (30 + cls.this.ae.a(90)));
               if ($$1 != null) {
                  $$0.g().a($$4.cI(), $$1);
               }

               $$0.a_($$4);
               $$0.a(ebu.t, $$3, ebu.a.a(cls.this));
            }
         }
      }

      @Override
      protected avz l() {
         return awa.iZ;
      }

      @Override
      protected cmj.a m() {
         return cmj.a.b;
      }
   }

   public class d extends cmj.c {
      private final cfz e = cfz.b().a(16.0).a(($$0x, $$1) -> ((chv)$$0x).t() == cvn.l);

      @Override
      public boolean b() {
         if (cls.this.O_() != null) {
            return false;
         } else if (cls.this.gB()) {
            return false;
         } else if (cls.this.af < this.c) {
            return false;
         } else {
            ard $$0 = a(cls.this.dV());
            if (!$$0.O().b(dgf.c)) {
               return false;
            } else {
               List<chv> $$1 = $$0.a(chv.class, this.e, cls.this, cls.this.cR().c(16.0, 4.0, 16.0));
               if ($$1.isEmpty()) {
                  return false;
               } else {
                  cls.this.a($$1.get(cls.this.ae.a($$1.size())));
                  return true;
               }
            }
         }
      }

      @Override
      public boolean c() {
         return cls.this.gM() != null && this.b > 0;
      }

      @Override
      public void e() {
         super.e();
         cls.this.a(null);
      }

      @Override
      protected void k() {
         chv $$0 = cls.this.gM();
         if ($$0 != null && $$0.bL()) {
            $$0.b(cvn.o);
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
      protected avz l() {
         return awa.ja;
      }

      @Override
      protected cmj.a m() {
         return cmj.a.d;
      }
   }
}
