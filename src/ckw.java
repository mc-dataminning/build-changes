import java.util.List;
import javax.annotation.Nullable;

public class ckw extends cln {
   @Nullable
   private cgz b;

   public ckw(bty<? extends ckw> $$0, dej $$1) {
      super($$0, $$1);
      this.bN = 10;
   }

   @Override
   protected void D() {
      super.D();
      this.bS.a(0, new cbe(this));
      this.bS.a(1, new ckw.b());
      this.bS.a(2, new car<>(this, cnx.class, 8.0F, 0.6, 1.0));
      this.bS.a(4, new ckw.c());
      this.bS.a(5, new ckw.a());
      this.bS.a(6, new ckw.d());
      this.bS.a(8, new cch(this, 0.6));
      this.bS.a(9, new cbs(this, cnx.class, 3.0F, 1.0F));
      this.bS.a(10, new cbs(this, bup.class, 8.0F));
      this.bT.a(1, new cdc(this, cpm.class).a());
      this.bT.a(2, new cdd<>(this, cnx.class, true).c(300));
      this.bT.a(3, new cdd<>(this, cnf.class, false).c(300));
      this.bT.a(3, new cdd<>(this, cgp.class, false));
   }

   public static bvt.a t() {
      return cld.gu().a(bvu.v, 0.5).a(bvu.m, 12.0).a(bvu.s, 24.0);
   }

   @Override
   protected void a(akl.a $$0) {
      super.a($$0);
   }

   @Override
   public void a(ug $$0) {
      super.a($$0);
   }

   @Override
   public awf ai_() {
      return awg.iA;
   }

   @Override
   public void b(ug $$0) {
      super.b($$0);
   }

   @Override
   protected void ac() {
      super.ac();
   }

   @Override
   protected boolean t(btr $$0) {
      if ($$0 == this) {
         return true;
      } else if (super.t($$0)) {
         return true;
      } else {
         if ($$0 instanceof clr $$1 && $$1.t() != null) {
            return this.t($$1.t());
         }

         return false;
      }
   }

   @Override
   protected awf w() {
      return awg.iy;
   }

   @Override
   protected awf o_() {
      return awg.iB;
   }

   @Override
   protected awf d(bsj $$0) {
      return awg.iD;
   }

   void a(@Nullable cgz $$0) {
      this.b = $$0;
   }

   @Nullable
   cgz gJ() {
      return this.b;
   }

   @Override
   protected awf go() {
      return awg.iz;
   }

   @Override
   public void a(arj $$0, int $$1, boolean $$2) {
   }

   class a extends cln.c {
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
         bun $$0 = ckw.this.m();
         double $$1 = Math.min($$0.dz(), ckw.this.dz());
         double $$2 = Math.max($$0.dz(), ckw.this.dz()) + 1.0;
         float $$3 = (float)azf.d($$0.dD() - ckw.this.dD(), $$0.dx() - ckw.this.dx());
         if (ckw.this.g((btr)$$0) < 9.0) {
            for (int $$4 = 0; $$4 < 5; $$4++) {
               float $$5 = $$3 + (float)$$4 * (float) Math.PI * 0.4F;
               this.a(ckw.this.dx() + (double)azf.b($$5) * 1.5, ckw.this.dD() + (double)azf.a($$5) * 1.5, $$1, $$2, $$5, 0);
            }

            for (int $$6 = 0; $$6 < 8; $$6++) {
               float $$7 = $$3 + (float)$$6 * (float) Math.PI * 2.0F / 8.0F + (float) (Math.PI * 2.0 / 5.0);
               this.a(ckw.this.dx() + (double)azf.b($$7) * 2.5, ckw.this.dD() + (double)azf.a($$7) * 2.5, $$1, $$2, $$7, 3);
            }
         } else {
            for (int $$8 = 0; $$8 < 16; $$8++) {
               double $$9 = 1.25 * (double)($$8 + 1);
               int $$10 = 1 * $$8;
               this.a(ckw.this.dx() + (double)azf.b($$3) * $$9, ckw.this.dD() + (double)azf.a($$3) * $$9, $$1, $$2, $$3, $$10);
            }
         }
      }

      private void a(double $$0, double $$1, double $$2, double $$3, float $$4, int $$5) {
         jf $$6 = jf.a($$0, $$3, $$1);
         boolean $$7 = false;
         double $$8 = 0.0;

         do {
            jf $$9 = $$6.e();
            dus $$10 = ckw.this.dS().a_($$9);
            if ($$10.c(ckw.this.dS(), $$9, jk.b)) {
               if (!ckw.this.dS().u($$6)) {
                  dus $$11 = ckw.this.dS().a_($$6);
                  ezq $$12 = $$11.g(ckw.this.dS(), $$6);
                  if (!$$12.c()) {
                     $$8 = $$12.c(jk.a.b);
                  }
               }

               $$7 = true;
               break;
            }

            $$6 = $$6.e();
         } while ($$6.v() >= azf.a($$2) - 1);

         if ($$7) {
            ckw.this.dS().b(new coi(ckw.this.dS(), $$0, (double)$$6.v() + $$8, $$1, $$4, $$5, ckw.this));
            ckw.this.dS().a(dzp.t, new eyw($$0, (double)$$6.v() + $$8, $$1), dzp.a.a(ckw.this));
         }
      }

      @Override
      protected awf l() {
         return awg.iE;
      }

      @Override
      protected cln.a m() {
         return cln.a.c;
      }
   }

   class b extends cln.b {
      @Override
      public void a() {
         if (ckw.this.m() != null) {
            ckw.this.K().a(ckw.this.m(), (float)ckw.this.ae(), (float)ckw.this.ad());
         } else if (ckw.this.gJ() != null) {
            ckw.this.K().a(ckw.this.gJ(), (float)ckw.this.ae(), (float)ckw.this.ad());
         }
      }
   }

   class c extends cln.c {
      private final cfd e = cfd.b().a(16.0).d().e();

      @Override
      public boolean b() {
         if (!super.b()) {
            return false;
         } else {
            int $$0 = ckw.this.dS().a(clr.class, this.e, ckw.this, ckw.this.cO().g(16.0)).size();
            return ckw.this.af.a(8) + 1 > $$0;
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
         arj $$0 = (arj)ckw.this.dS();
         ezw $$1 = ckw.this.co();

         for (int $$2 = 0; $$2 < 3; $$2++) {
            jf $$3 = ckw.this.ds().b(-2 + ckw.this.af.a(5), 1, -2 + ckw.this.af.a(5));
            clr $$4 = bty.bi.a(ckw.this.dS(), btx.f);
            if ($$4 != null) {
               $$4.a($$3, 0.0F, 0.0F);
               $$4.a($$0, ckw.this.dS().d_($$3), btx.f, null);
               $$4.a(ckw.this);
               $$4.h($$3);
               $$4.b(20 * (30 + ckw.this.af.a(90)));
               if ($$1 != null) {
                  $$0.f().a($$4.cF(), $$1);
               }

               $$0.a_($$4);
               $$0.a(dzp.t, $$3, dzp.a.a(ckw.this));
            }
         }
      }

      @Override
      protected awf l() {
         return awg.iF;
      }

      @Override
      protected cln.a m() {
         return cln.a.b;
      }
   }

   public class d extends cln.c {
      private final cfd e = cfd.b().a(16.0).a($$0x -> ((cgz)$$0x).t() == cum.l);

      @Override
      public boolean b() {
         if (ckw.this.m() != null) {
            return false;
         } else if (ckw.this.gy()) {
            return false;
         } else if (ckw.this.ag < this.c) {
            return false;
         } else if (!ckw.this.dS().ac().b(def.c)) {
            return false;
         } else {
            List<cgz> $$0 = ckw.this.dS().a(cgz.class, this.e, ckw.this, ckw.this.cO().c(16.0, 4.0, 16.0));
            if ($$0.isEmpty()) {
               return false;
            } else {
               ckw.this.a($$0.get(ckw.this.af.a($$0.size())));
               return true;
            }
         }
      }

      @Override
      public boolean c() {
         return ckw.this.gJ() != null && this.b > 0;
      }

      @Override
      public void e() {
         super.e();
         ckw.this.a(null);
      }

      @Override
      protected void k() {
         cgz $$0 = ckw.this.gJ();
         if ($$0 != null && $$0.bI()) {
            $$0.b(cum.o);
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
      protected awf l() {
         return awg.iG;
      }

      @Override
      protected cln.a m() {
         return cln.a.d;
      }
   }
}
