import java.util.List;
import javax.annotation.Nullable;

public class ceg extends cex {
   @Nullable
   private cap e;

   public ceg(bnu<? extends ceg> $$0, cvn $$1) {
      super($$0, $$1);
      this.bJ = 10;
   }

   @Override
   protected void B() {
      super.B();
      this.bO.a(0, new buv(this));
      this.bO.a(1, new ceg.b());
      this.bO.a(2, new bui<>(this, chh.class, 8.0F, 0.6, 1.0));
      this.bO.a(4, new ceg.c());
      this.bO.a(5, new ceg.a());
      this.bO.a(6, new ceg.d());
      this.bO.a(8, new bvy(this, 0.6));
      this.bO.a(9, new bvj(this, chh.class, 3.0F, 1.0F));
      this.bO.a(10, new bvj(this, boi.class, 8.0F));
      this.bP.a(1, new bwt(this, cir.class).a());
      this.bP.a(2, new bwu<>(this, chh.class, true).c(300));
      this.bP.a(3, new bwu<>(this, cgp.class, false).c(300));
      this.bP.a(3, new bwu<>(this, caf.class, false));
   }

   public static bpk.a w() {
      return cen.gm().a(bpl.o, 0.5).a(bpl.i, 12.0).a(bpl.n, 24.0);
   }

   @Override
   protected void c_() {
      super.c_();
   }

   @Override
   public void a(sw $$0) {
      super.a($$0);
   }

   @Override
   public atj ag_() {
      return atk.ik;
   }

   @Override
   public void b(sw $$0) {
      super.b($$0);
   }

   @Override
   protected void aa() {
      super.aa();
   }

   @Override
   public boolean r(bno $$0) {
      if ($$0 == null) {
         return false;
      } else if ($$0 == this) {
         return true;
      } else if (super.r($$0)) {
         return true;
      } else {
         return $$0 instanceof cfb $$1 ? this.r($$1.A()) : false;
      }
   }

   @Override
   protected atj y() {
      return atk.ii;
   }

   @Override
   protected atj n_() {
      return atk.il;
   }

   @Override
   protected atj d(bmn $$0) {
      return atk.in;
   }

   void a(@Nullable cap $$0) {
      this.e = $$0;
   }

   @Nullable
   cap gz() {
      return this.e;
   }

   @Override
   protected atj gg() {
      return atk.ij;
   }

   @Override
   public void a(int $$0, boolean $$1) {
   }

   class a extends cex.c {
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
         bog $$0 = ceg.this.q();
         double $$1 = Math.min($$0.dt(), ceg.this.dt());
         double $$2 = Math.max($$0.dt(), ceg.this.dt()) + 1.0;
         float $$3 = (float)awh.d($$0.dx() - ceg.this.dx(), $$0.dr() - ceg.this.dr());
         if (ceg.this.f((bno)$$0) < 9.0) {
            for (int $$4 = 0; $$4 < 5; $$4++) {
               float $$5 = $$3 + (float)$$4 * (float) Math.PI * 0.4F;
               this.a(ceg.this.dr() + (double)awh.b($$5) * 1.5, ceg.this.dx() + (double)awh.a($$5) * 1.5, $$1, $$2, $$5, 0);
            }

            for (int $$6 = 0; $$6 < 8; $$6++) {
               float $$7 = $$3 + (float)$$6 * (float) Math.PI * 2.0F / 8.0F + (float) (Math.PI * 2.0 / 5.0);
               this.a(ceg.this.dr() + (double)awh.b($$7) * 2.5, ceg.this.dx() + (double)awh.a($$7) * 2.5, $$1, $$2, $$7, 3);
            }
         } else {
            for (int $$8 = 0; $$8 < 16; $$8++) {
               double $$9 = 1.25 * (double)($$8 + 1);
               int $$10 = 1 * $$8;
               this.a(ceg.this.dr() + (double)awh.b($$3) * $$9, ceg.this.dx() + (double)awh.a($$3) * $$9, $$1, $$2, $$3, $$10);
            }
         }
      }

      private void a(double $$0, double $$1, double $$2, double $$3, float $$4, int $$5) {
         hz $$6 = hz.a($$0, $$3, $$1);
         boolean $$7 = false;
         double $$8 = 0.0;

         do {
            hz $$9 = $$6.d();
            dlf $$10 = ceg.this.dM().a_($$9);
            if ($$10.d(ceg.this.dM(), $$9, ie.b)) {
               if (!ceg.this.dM().u($$6)) {
                  dlf $$11 = ceg.this.dM().a_($$6);
                  eol $$12 = $$11.k(ceg.this.dM(), $$6);
                  if (!$$12.c()) {
                     $$8 = $$12.c(ie.a.b);
                  }
               }

               $$7 = true;
               break;
            }

            $$6 = $$6.d();
         } while ($$6.v() >= awh.a($$2) - 1);

         if ($$7) {
            ceg.this.dM().b(new chr(ceg.this.dM(), $$0, (double)$$6.v() + $$8, $$1, $$4, $$5, ceg.this));
            ceg.this.dM().a(dpp.t, new ens($$0, (double)$$6.v() + $$8, $$1), dpp.a.a(ceg.this));
         }
      }

      @Override
      protected atj l() {
         return atk.io;
      }

      @Override
      protected cex.a m() {
         return cex.a.c;
      }
   }

   class b extends cex.b {
      @Override
      public void e() {
         if (ceg.this.q() != null) {
            ceg.this.I().a(ceg.this.q(), (float)ceg.this.fH(), (float)ceg.this.ab());
         } else if (ceg.this.gz() != null) {
            ceg.this.I().a(ceg.this.gz(), (float)ceg.this.fH(), (float)ceg.this.ab());
         }
      }
   }

   class c extends cex.c {
      private final byu e = byu.b().a(16.0).d().e();

      @Override
      public boolean a() {
         if (!super.a()) {
            return false;
         } else {
            int $$0 = ceg.this.dM().a(cfb.class, this.e, ceg.this, ceg.this.cH().g(16.0)).size();
            return ceg.this.af.a(8) + 1 > $$0;
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
         aov $$0 = (aov)ceg.this.dM();
         eor $$1 = ceg.this.cg();

         for (int $$2 = 0; $$2 < 3; $$2++) {
            hz $$3 = ceg.this.dm().b(-2 + ceg.this.af.a(5), 1, -2 + ceg.this.af.a(5));
            cfb $$4 = bnu.bg.a(ceg.this.dM());
            if ($$4 != null) {
               $$4.a($$3, 0.0F, 0.0F);
               $$4.a($$0, ceg.this.dM().d_($$3), bok.f, null, null);
               $$4.a(ceg.this);
               $$4.i($$3);
               $$4.b(20 * (30 + ceg.this.af.a(90)));
               if ($$1 != null) {
                  $$0.f().a($$4.cy(), $$1);
               }

               $$0.a_($$4);
               $$0.a(dpp.t, $$3, dpp.a.a(ceg.this));
            }
         }
      }

      @Override
      protected atj l() {
         return atk.ip;
      }

      @Override
      protected cex.a m() {
         return cex.a.b;
      }
   }

   public class d extends cex.c {
      private final byu e = byu.b().a(16.0).a($$0x -> ((cap)$$0x).w() == cnn.l);

      @Override
      public boolean a() {
         if (ceg.this.q() != null) {
            return false;
         } else if (ceg.this.gq()) {
            return false;
         } else if (ceg.this.ag < this.c) {
            return false;
         } else if (!ceg.this.dM().Z().b(cvj.c)) {
            return false;
         } else {
            List<cap> $$0 = ceg.this.dM().a(cap.class, this.e, ceg.this, ceg.this.cH().c(16.0, 4.0, 16.0));
            if ($$0.isEmpty()) {
               return false;
            } else {
               ceg.this.a($$0.get(ceg.this.af.a($$0.size())));
               return true;
            }
         }
      }

      @Override
      public boolean b() {
         return ceg.this.gz() != null && this.b > 0;
      }

      @Override
      public void d() {
         super.d();
         ceg.this.a(null);
      }

      @Override
      protected void k() {
         cap $$0 = ceg.this.gz();
         if ($$0 != null && $$0.bx()) {
            $$0.b(cnn.o);
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
      protected atj l() {
         return atk.iq;
      }

      @Override
      protected cex.a m() {
         return cex.a.d;
      }
   }
}
