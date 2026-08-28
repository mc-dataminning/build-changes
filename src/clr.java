import java.util.List;
import javax.annotation.Nullable;

public class clr extends cmi {
   @Nullable
   private chu a;

   public clr(bus<? extends clr> $$0, dgi $$1) {
      super($$0, $$1);
      this.bN = 10;
   }

   @Override
   protected void E() {
      super.E();
      this.bS.a(0, new cbz(this));
      this.bS.a(1, new clr.b());
      this.bS.a(2, new cbm<>(this, cox.class, 8.0F, 0.6, 1.0));
      this.bS.a(3, new cbm<>(this, cnc.class, 8.0F, 0.6, 1.0));
      this.bS.a(4, new clr.c());
      this.bS.a(5, new clr.a());
      this.bS.a(6, new clr.d());
      this.bS.a(8, new cdc(this, 0.6));
      this.bS.a(9, new ccn(this, cox.class, 3.0F, 1.0F));
      this.bS.a(10, new ccn(this, bvj.class, 8.0F));
      this.bT.a(1, new cdx(this, cql.class).a());
      this.bT.a(2, new cdy<>(this, cox.class, true).c(300));
      this.bT.a(3, new cdy<>(this, cod.class, false).c(300));
      this.bT.a(3, new cdy<>(this, chk.class, false));
   }

   public static bwo.a p() {
      return cly.gx().a(bwp.v, 0.5).a(bwp.m, 12.0).a(bwp.s, 24.0);
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
   protected boolean t(bul $$0) {
      if ($$0 == this) {
         return true;
      } else if (super.t($$0)) {
         return true;
      } else {
         if ($$0 instanceof cmm $$1 && $$1.t() != null) {
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
   protected avz e(btb $$0) {
      return awa.iX;
   }

   void a(@Nullable chu $$0) {
      this.a = $$0;
   }

   @Nullable
   chu gM() {
      return this.a;
   }

   @Override
   protected avz x() {
      return awa.iT;
   }

   @Override
   public void a(ard $$0, int $$1, boolean $$2) {
   }

   class a extends cmi.c {
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
         bvh $$0 = clr.this.O_();
         double $$1 = Math.min($$0.dC(), clr.this.dC());
         double $$2 = Math.max($$0.dC(), clr.this.dC()) + 1.0;
         float $$3 = (float)ayz.d($$0.dG() - clr.this.dG(), $$0.dA() - clr.this.dA());
         if (clr.this.g((bul)$$0) < 9.0) {
            for (int $$4 = 0; $$4 < 5; $$4++) {
               float $$5 = $$3 + (float)$$4 * (float) Math.PI * 0.4F;
               this.a(clr.this.dA() + (double)ayz.b($$5) * 1.5, clr.this.dG() + (double)ayz.a($$5) * 1.5, $$1, $$2, $$5, 0);
            }

            for (int $$6 = 0; $$6 < 8; $$6++) {
               float $$7 = $$3 + (float)$$6 * (float) Math.PI * 2.0F / 8.0F + (float) (Math.PI * 2.0 / 5.0);
               this.a(clr.this.dA() + (double)ayz.b($$7) * 2.5, clr.this.dG() + (double)ayz.a($$7) * 2.5, $$1, $$2, $$7, 3);
            }
         } else {
            for (int $$8 = 0; $$8 < 16; $$8++) {
               double $$9 = 1.25 * (double)($$8 + 1);
               int $$10 = 1 * $$8;
               this.a(clr.this.dA() + (double)ayz.b($$3) * $$9, clr.this.dG() + (double)ayz.a($$3) * $$9, $$1, $$2, $$3, $$10);
            }
         }
      }

      private void a(double $$0, double $$1, double $$2, double $$3, float $$4, int $$5) {
         ji $$6 = ji.a($$0, $$3, $$1);
         boolean $$7 = false;
         double $$8 = 0.0;

         do {
            ji $$9 = $$6.e();
            dwx $$10 = clr.this.dV().a_($$9);
            if ($$10.c(clr.this.dV(), $$9, jn.b)) {
               if (!clr.this.dV().u($$6)) {
                  dwx $$11 = clr.this.dV().a_($$6);
                  fbu $$12 = $$11.g(clr.this.dV(), $$6);
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
            clr.this.dV().b(new cpi(clr.this.dV(), $$0, (double)$$6.v() + $$8, $$1, $$4, $$5, clr.this));
            clr.this.dV().a(ebt.t, new fba($$0, (double)$$6.v() + $$8, $$1), ebt.a.a(clr.this));
         }
      }

      @Override
      protected avz l() {
         return awa.iY;
      }

      @Override
      protected cmi.a m() {
         return cmi.a.c;
      }
   }

   class b extends cmi.b {
      @Override
      public void a() {
         if (clr.this.O_() != null) {
            clr.this.L().a(clr.this.O_(), (float)clr.this.af(), (float)clr.this.ad());
         } else if (clr.this.gM() != null) {
            clr.this.L().a(clr.this.gM(), (float)clr.this.af(), (float)clr.this.ad());
         }
      }
   }

   class c extends cmi.c {
      private final cfy e = cfy.b().a(16.0).d().e();

      @Override
      public boolean b() {
         if (!super.b()) {
            return false;
         } else {
            int $$0 = a(clr.this.dV()).a(cmm.class, this.e, clr.this, clr.this.cR().g(16.0)).size();
            return clr.this.ae.a(8) + 1 > $$0;
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
         ard $$0 = (ard)clr.this.dV();
         fca $$1 = clr.this.cr();

         for (int $$2 = 0; $$2 < 3; $$2++) {
            ji $$3 = clr.this.dv().b(-2 + clr.this.ae.a(5), 1, -2 + clr.this.ae.a(5));
            cmm $$4 = bus.bB.a(clr.this.dV(), bur.f);
            if ($$4 != null) {
               $$4.a($$3, 0.0F, 0.0F);
               $$4.a($$0, clr.this.dV().d_($$3), bur.f, null);
               $$4.a(clr.this);
               $$4.h($$3);
               $$4.b(20 * (30 + clr.this.ae.a(90)));
               if ($$1 != null) {
                  $$0.g().a($$4.cI(), $$1);
               }

               $$0.a_($$4);
               $$0.a(ebt.t, $$3, ebt.a.a(clr.this));
            }
         }
      }

      @Override
      protected avz l() {
         return awa.iZ;
      }

      @Override
      protected cmi.a m() {
         return cmi.a.b;
      }
   }

   public class d extends cmi.c {
      private final cfy e = cfy.b().a(16.0).a(($$0x, $$1) -> ((chu)$$0x).t() == cvm.l);

      @Override
      public boolean b() {
         if (clr.this.O_() != null) {
            return false;
         } else if (clr.this.gB()) {
            return false;
         } else if (clr.this.af < this.c) {
            return false;
         } else {
            ard $$0 = a(clr.this.dV());
            if (!$$0.O().b(dge.c)) {
               return false;
            } else {
               List<chu> $$1 = $$0.a(chu.class, this.e, clr.this, clr.this.cR().c(16.0, 4.0, 16.0));
               if ($$1.isEmpty()) {
                  return false;
               } else {
                  clr.this.a($$1.get(clr.this.ae.a($$1.size())));
                  return true;
               }
            }
         }
      }

      @Override
      public boolean c() {
         return clr.this.gM() != null && this.b > 0;
      }

      @Override
      public void e() {
         super.e();
         clr.this.a(null);
      }

      @Override
      protected void k() {
         chu $$0 = clr.this.gM();
         if ($$0 != null && $$0.bL()) {
            $$0.b(cvm.o);
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
      protected cmi.a m() {
         return cmi.a.d;
      }
   }
}
