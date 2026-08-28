import java.util.List;
import javax.annotation.Nullable;

public class ckt extends clk {
   @Nullable
   private cgw b;

   public ckt(btv<? extends ckt> $$0, deg $$1) {
      super($$0, $$1);
      this.bN = 10;
   }

   @Override
   protected void D() {
      super.D();
      this.bS.a(0, new cbb(this));
      this.bS.a(1, new ckt.b());
      this.bS.a(2, new cao<>(this, cnu.class, 8.0F, 0.6, 1.0));
      this.bS.a(4, new ckt.c());
      this.bS.a(5, new ckt.a());
      this.bS.a(6, new ckt.d());
      this.bS.a(8, new cce(this, 0.6));
      this.bS.a(9, new cbp(this, cnu.class, 3.0F, 1.0F));
      this.bS.a(10, new cbp(this, bum.class, 8.0F));
      this.bT.a(1, new ccz(this, cpj.class).a());
      this.bT.a(2, new cda<>(this, cnu.class, true).c(300));
      this.bT.a(3, new cda<>(this, cnc.class, false).c(300));
      this.bT.a(3, new cda<>(this, cgm.class, false));
   }

   public static bvq.a t() {
      return cla.gv().a(bvr.v, 0.5).a(bvr.m, 12.0).a(bvr.s, 24.0);
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
   }

   @Override
   public void a(uf $$0) {
      super.a($$0);
   }

   @Override
   public awd ah_() {
      return awe.iA;
   }

   @Override
   public void b(uf $$0) {
      super.b($$0);
   }

   @Override
   protected void ad() {
      super.ad();
   }

   @Override
   protected boolean t(bto $$0) {
      if ($$0 == this) {
         return true;
      } else if (super.t($$0)) {
         return true;
      } else {
         if ($$0 instanceof clo $$1 && $$1.t() != null) {
            return this.t($$1.t());
         }

         return false;
      }
   }

   @Override
   protected awd w() {
      return awe.iy;
   }

   @Override
   protected awd n_() {
      return awe.iB;
   }

   @Override
   protected awd d(bsg $$0) {
      return awe.iD;
   }

   void a(@Nullable cgw $$0) {
      this.b = $$0;
   }

   @Nullable
   cgw gK() {
      return this.b;
   }

   @Override
   protected awd gp() {
      return awe.iz;
   }

   @Override
   public void a(arh $$0, int $$1, boolean $$2) {
   }

   class a extends clk.c {
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
         buk $$0 = ckt.this.m();
         double $$1 = Math.min($$0.dz(), ckt.this.dz());
         double $$2 = Math.max($$0.dz(), ckt.this.dz()) + 1.0;
         float $$3 = (float)azd.d($$0.dD() - ckt.this.dD(), $$0.dx() - ckt.this.dx());
         if (ckt.this.g((bto)$$0) < 9.0) {
            for (int $$4 = 0; $$4 < 5; $$4++) {
               float $$5 = $$3 + (float)$$4 * (float) Math.PI * 0.4F;
               this.a(ckt.this.dx() + (double)azd.b($$5) * 1.5, ckt.this.dD() + (double)azd.a($$5) * 1.5, $$1, $$2, $$5, 0);
            }

            for (int $$6 = 0; $$6 < 8; $$6++) {
               float $$7 = $$3 + (float)$$6 * (float) Math.PI * 2.0F / 8.0F + (float) (Math.PI * 2.0 / 5.0);
               this.a(ckt.this.dx() + (double)azd.b($$7) * 2.5, ckt.this.dD() + (double)azd.a($$7) * 2.5, $$1, $$2, $$7, 3);
            }
         } else {
            for (int $$8 = 0; $$8 < 16; $$8++) {
               double $$9 = 1.25 * (double)($$8 + 1);
               int $$10 = 1 * $$8;
               this.a(ckt.this.dx() + (double)azd.b($$3) * $$9, ckt.this.dD() + (double)azd.a($$3) * $$9, $$1, $$2, $$3, $$10);
            }
         }
      }

      private void a(double $$0, double $$1, double $$2, double $$3, float $$4, int $$5) {
         je $$6 = je.a($$0, $$3, $$1);
         boolean $$7 = false;
         double $$8 = 0.0;

         do {
            je $$9 = $$6.e();
            duo $$10 = ckt.this.dS().a_($$9);
            if ($$10.c(ckt.this.dS(), $$9, jj.b)) {
               if (!ckt.this.dS().u($$6)) {
                  duo $$11 = ckt.this.dS().a_($$6);
                  ezm $$12 = $$11.g(ckt.this.dS(), $$6);
                  if (!$$12.c()) {
                     $$8 = $$12.c(jj.a.b);
                  }
               }

               $$7 = true;
               break;
            }

            $$6 = $$6.e();
         } while ($$6.v() >= azd.a($$2) - 1);

         if ($$7) {
            ckt.this.dS().b(new cof(ckt.this.dS(), $$0, (double)$$6.v() + $$8, $$1, $$4, $$5, ckt.this));
            ckt.this.dS().a(dzl.t, new eys($$0, (double)$$6.v() + $$8, $$1), dzl.a.a(ckt.this));
         }
      }

      @Override
      protected awd l() {
         return awe.iE;
      }

      @Override
      protected clk.a m() {
         return clk.a.c;
      }
   }

   class b extends clk.b {
      @Override
      public void a() {
         if (ckt.this.m() != null) {
            ckt.this.K().a(ckt.this.m(), (float)ckt.this.ag(), (float)ckt.this.ae());
         } else if (ckt.this.gK() != null) {
            ckt.this.K().a(ckt.this.gK(), (float)ckt.this.ag(), (float)ckt.this.ae());
         }
      }
   }

   class c extends clk.c {
      private final cfa e = cfa.b().a(16.0).d().e();

      @Override
      public boolean b() {
         if (!super.b()) {
            return false;
         } else {
            int $$0 = ckt.this.dS().a(clo.class, this.e, ckt.this, ckt.this.cO().g(16.0)).size();
            return ckt.this.af.a(8) + 1 > $$0;
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
         arh $$0 = (arh)ckt.this.dS();
         ezs $$1 = ckt.this.co();

         for (int $$2 = 0; $$2 < 3; $$2++) {
            je $$3 = ckt.this.ds().b(-2 + ckt.this.af.a(5), 1, -2 + ckt.this.af.a(5));
            clo $$4 = btv.bi.a(ckt.this.dS(), btu.f);
            if ($$4 != null) {
               $$4.a($$3, 0.0F, 0.0F);
               $$4.a($$0, ckt.this.dS().d_($$3), btu.f, null);
               $$4.a(ckt.this);
               $$4.h($$3);
               $$4.b(20 * (30 + ckt.this.af.a(90)));
               if ($$1 != null) {
                  $$0.f().a($$4.cF(), $$1);
               }

               $$0.a_($$4);
               $$0.a(dzl.t, $$3, dzl.a.a(ckt.this));
            }
         }
      }

      @Override
      protected awd l() {
         return awe.iF;
      }

      @Override
      protected clk.a m() {
         return clk.a.b;
      }
   }

   public class d extends clk.c {
      private final cfa e = cfa.b().a(16.0).a($$0x -> ((cgw)$$0x).t() == cuj.l);

      @Override
      public boolean b() {
         if (ckt.this.m() != null) {
            return false;
         } else if (ckt.this.gz()) {
            return false;
         } else if (ckt.this.ag < this.c) {
            return false;
         } else if (!ckt.this.dS().ac().b(dec.c)) {
            return false;
         } else {
            List<cgw> $$0 = ckt.this.dS().a(cgw.class, this.e, ckt.this, ckt.this.cO().c(16.0, 4.0, 16.0));
            if ($$0.isEmpty()) {
               return false;
            } else {
               ckt.this.a($$0.get(ckt.this.af.a($$0.size())));
               return true;
            }
         }
      }

      @Override
      public boolean c() {
         return ckt.this.gK() != null && this.b > 0;
      }

      @Override
      public void e() {
         super.e();
         ckt.this.a(null);
      }

      @Override
      protected void k() {
         cgw $$0 = ckt.this.gK();
         if ($$0 != null && $$0.bI()) {
            $$0.b(cuj.o);
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
      protected awd l() {
         return awe.iG;
      }

      @Override
      protected clk.a m() {
         return clk.a.d;
      }
   }
}
