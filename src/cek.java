import java.util.List;
import javax.annotation.Nullable;

public class cek extends cfb {
   @Nullable
   private cat e;

   public cek(bnw<? extends cek> $$0, cvr $$1) {
      super($$0, $$1);
      this.bJ = 10;
   }

   @Override
   protected void B() {
      super.B();
      this.bO.a(0, new buz(this));
      this.bO.a(1, new cek.b());
      this.bO.a(2, new bum<>(this, chl.class, 8.0F, 0.6, 1.0));
      this.bO.a(4, new cek.c());
      this.bO.a(5, new cek.a());
      this.bO.a(6, new cek.d());
      this.bO.a(8, new bwc(this, 0.6));
      this.bO.a(9, new bvn(this, chl.class, 3.0F, 1.0F));
      this.bO.a(10, new bvn(this, bok.class, 8.0F));
      this.bP.a(1, new bwx(this, civ.class).a());
      this.bP.a(2, new bwy<>(this, chl.class, true).c(300));
      this.bP.a(3, new bwy<>(this, cgt.class, false).c(300));
      this.bP.a(3, new bwy<>(this, caj.class, false));
   }

   public static bpo.a w() {
      return cer.gm().a(bpp.o, 0.5).a(bpp.i, 12.0).a(bpp.n, 24.0);
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
   public atk ag_() {
      return atl.il;
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
   public boolean r(bnq $$0) {
      if ($$0 == null) {
         return false;
      } else if ($$0 == this) {
         return true;
      } else if (super.r($$0)) {
         return true;
      } else {
         return $$0 instanceof cff $$1 ? this.r($$1.A()) : false;
      }
   }

   @Override
   protected atk y() {
      return atl.ij;
   }

   @Override
   protected atk n_() {
      return atl.im;
   }

   @Override
   protected atk d(bmp $$0) {
      return atl.io;
   }

   void a(@Nullable cat $$0) {
      this.e = $$0;
   }

   @Nullable
   cat gz() {
      return this.e;
   }

   @Override
   protected atk gg() {
      return atl.ik;
   }

   @Override
   public void a(int $$0, boolean $$1) {
   }

   class a extends cfb.c {
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
         boi $$0 = cek.this.q();
         double $$1 = Math.min($$0.dt(), cek.this.dt());
         double $$2 = Math.max($$0.dt(), cek.this.dt()) + 1.0;
         float $$3 = (float)awi.d($$0.dx() - cek.this.dx(), $$0.dr() - cek.this.dr());
         if (cek.this.f((bnq)$$0) < 9.0) {
            for (int $$4 = 0; $$4 < 5; $$4++) {
               float $$5 = $$3 + (float)$$4 * (float) Math.PI * 0.4F;
               this.a(cek.this.dr() + (double)awi.b($$5) * 1.5, cek.this.dx() + (double)awi.a($$5) * 1.5, $$1, $$2, $$5, 0);
            }

            for (int $$6 = 0; $$6 < 8; $$6++) {
               float $$7 = $$3 + (float)$$6 * (float) Math.PI * 2.0F / 8.0F + (float) (Math.PI * 2.0 / 5.0);
               this.a(cek.this.dr() + (double)awi.b($$7) * 2.5, cek.this.dx() + (double)awi.a($$7) * 2.5, $$1, $$2, $$7, 3);
            }
         } else {
            for (int $$8 = 0; $$8 < 16; $$8++) {
               double $$9 = 1.25 * (double)($$8 + 1);
               int $$10 = 1 * $$8;
               this.a(cek.this.dr() + (double)awi.b($$3) * $$9, cek.this.dx() + (double)awi.a($$3) * $$9, $$1, $$2, $$3, $$10);
            }
         }
      }

      private void a(double $$0, double $$1, double $$2, double $$3, float $$4, int $$5) {
         hz $$6 = hz.a($$0, $$3, $$1);
         boolean $$7 = false;
         double $$8 = 0.0;

         do {
            hz $$9 = $$6.d();
            dlj $$10 = cek.this.dM().a_($$9);
            if ($$10.d(cek.this.dM(), $$9, ie.b)) {
               if (!cek.this.dM().u($$6)) {
                  dlj $$11 = cek.this.dM().a_($$6);
                  eos $$12 = $$11.k(cek.this.dM(), $$6);
                  if (!$$12.c()) {
                     $$8 = $$12.c(ie.a.b);
                  }
               }

               $$7 = true;
               break;
            }

            $$6 = $$6.d();
         } while ($$6.v() >= awi.a($$2) - 1);

         if ($$7) {
            cek.this.dM().b(new chv(cek.this.dM(), $$0, (double)$$6.v() + $$8, $$1, $$4, $$5, cek.this));
            cek.this.dM().a(dpw.t, new enz($$0, (double)$$6.v() + $$8, $$1), dpw.a.a(cek.this));
         }
      }

      @Override
      protected atk l() {
         return atl.ip;
      }

      @Override
      protected cfb.a m() {
         return cfb.a.c;
      }
   }

   class b extends cfb.b {
      @Override
      public void e() {
         if (cek.this.q() != null) {
            cek.this.I().a(cek.this.q(), (float)cek.this.fH(), (float)cek.this.ab());
         } else if (cek.this.gz() != null) {
            cek.this.I().a(cek.this.gz(), (float)cek.this.fH(), (float)cek.this.ab());
         }
      }
   }

   class c extends cfb.c {
      private final byy e = byy.b().a(16.0).d().e();

      @Override
      public boolean a() {
         if (!super.a()) {
            return false;
         } else {
            int $$0 = cek.this.dM().a(cff.class, this.e, cek.this, cek.this.cH().g(16.0)).size();
            return cek.this.af.a(8) + 1 > $$0;
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
         aow $$0 = (aow)cek.this.dM();
         eoy $$1 = cek.this.cg();

         for (int $$2 = 0; $$2 < 3; $$2++) {
            hz $$3 = cek.this.dm().b(-2 + cek.this.af.a(5), 1, -2 + cek.this.af.a(5));
            cff $$4 = bnw.bg.a(cek.this.dM());
            if ($$4 != null) {
               $$4.a($$3, 0.0F, 0.0F);
               $$4.a($$0, cek.this.dM().d_($$3), bom.f, null, null);
               $$4.a(cek.this);
               $$4.i($$3);
               $$4.b(20 * (30 + cek.this.af.a(90)));
               if ($$1 != null) {
                  $$0.f().a($$4.cy(), $$1);
               }

               $$0.a_($$4);
               $$0.a(dpw.t, $$3, dpw.a.a(cek.this));
            }
         }
      }

      @Override
      protected atk l() {
         return atl.iq;
      }

      @Override
      protected cfb.a m() {
         return cfb.a.b;
      }
   }

   public class d extends cfb.c {
      private final byy e = byy.b().a(16.0).a($$0x -> ((cat)$$0x).w() == cnr.l);

      @Override
      public boolean a() {
         if (cek.this.q() != null) {
            return false;
         } else if (cek.this.gq()) {
            return false;
         } else if (cek.this.ag < this.c) {
            return false;
         } else if (!cek.this.dM().Z().b(cvn.c)) {
            return false;
         } else {
            List<cat> $$0 = cek.this.dM().a(cat.class, this.e, cek.this, cek.this.cH().c(16.0, 4.0, 16.0));
            if ($$0.isEmpty()) {
               return false;
            } else {
               cek.this.a($$0.get(cek.this.af.a($$0.size())));
               return true;
            }
         }
      }

      @Override
      public boolean b() {
         return cek.this.gz() != null && this.b > 0;
      }

      @Override
      public void d() {
         super.d();
         cek.this.a(null);
      }

      @Override
      protected void k() {
         cat $$0 = cek.this.gz();
         if ($$0 != null && $$0.bx()) {
            $$0.b(cnr.o);
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
      protected atk l() {
         return atl.ir;
      }

      @Override
      protected cfb.a m() {
         return cfb.a.d;
      }
   }
}
