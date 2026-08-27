import java.util.List;
import javax.annotation.Nullable;

public class byt extends bzk {
   @Nullable
   private bvf e;

   public byt(bim<? extends byt> $$0, cpl $$1) {
      super($$0, $$1);
      this.bJ = 10;
   }

   @Override
   protected void w() {
      super.w();
      this.bO.a(0, new bpn(this));
      this.bO.a(1, new byt.b());
      this.bO.a(2, new bpa<>(this, cbm.class, 8.0F, 0.6, 1.0));
      this.bO.a(4, new byt.c());
      this.bO.a(5, new byt.a());
      this.bO.a(6, new byt.d());
      this.bO.a(8, new bqq(this, 0.6));
      this.bO.a(9, new bqb(this, cbm.class, 3.0F, 1.0F));
      this.bO.a(10, new bqb(this, bja.class, 8.0F));
      this.bP.a(1, new brl(this, ccu.class).a());
      this.bP.a(2, new brm<>(this, cbm.class, true).c(300));
      this.bP.a(3, new brm<>(this, cau.class, false).c(300));
      this.bP.a(3, new brm<>(this, buv.class, false));
   }

   public static bkd.a q() {
      return bza.gg().a(bke.d, 0.5).a(bke.b, 12.0).a(bke.a, 24.0);
   }

   @Override
   protected void a_() {
      super.a_();
   }

   @Override
   public void a(qr $$0) {
      super.a($$0);
   }

   @Override
   public aov X_() {
      return aow.hs;
   }

   @Override
   public void b(qr $$0) {
      super.b($$0);
   }

   @Override
   protected void V() {
      super.V();
   }

   @Override
   public boolean s(bii $$0) {
      if ($$0 == null) {
         return false;
      } else if ($$0 == this) {
         return true;
      } else if (super.s($$0)) {
         return true;
      } else if ($$0 instanceof bzo) {
         return this.s(((bzo)$$0).q());
      } else {
         return $$0 instanceof biy && ((biy)$$0).eQ() == bjd.d ? this.cf() == null && $$0.cf() == null : false;
      }
   }

   @Override
   protected aov r() {
      return aow.hq;
   }

   @Override
   protected aov h_() {
      return aow.ht;
   }

   @Override
   protected aov d(bhg $$0) {
      return aow.hv;
   }

   void a(@Nullable bvf $$0) {
      this.e = $$0;
   }

   @Nullable
   bvf gt() {
      return this.e;
   }

   @Override
   protected aov ga() {
      return aow.hr;
   }

   @Override
   public void a(int $$0, boolean $$1) {
   }

   class a extends bzk.c {
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
         biy $$0 = byt.this.j();
         double $$1 = Math.min($$0.dr(), byt.this.dr());
         double $$2 = Math.max($$0.dr(), byt.this.dr()) + 1.0;
         float $$3 = (float)arp.d($$0.dv() - byt.this.dv(), $$0.dp() - byt.this.dp());
         if (byt.this.f((bii)$$0) < 9.0) {
            for (int $$4 = 0; $$4 < 5; $$4++) {
               float $$5 = $$3 + (float)$$4 * (float) Math.PI * 0.4F;
               this.a(byt.this.dp() + (double)arp.b($$5) * 1.5, byt.this.dv() + (double)arp.a($$5) * 1.5, $$1, $$2, $$5, 0);
            }

            for (int $$6 = 0; $$6 < 8; $$6++) {
               float $$7 = $$3 + (float)$$6 * (float) Math.PI * 2.0F / 8.0F + (float) (Math.PI * 2.0 / 5.0);
               this.a(byt.this.dp() + (double)arp.b($$7) * 2.5, byt.this.dv() + (double)arp.a($$7) * 2.5, $$1, $$2, $$7, 3);
            }
         } else {
            for (int $$8 = 0; $$8 < 16; $$8++) {
               double $$9 = 1.25 * (double)($$8 + 1);
               int $$10 = 1 * $$8;
               this.a(byt.this.dp() + (double)arp.b($$3) * $$9, byt.this.dv() + (double)arp.a($$3) * $$9, $$1, $$2, $$3, $$10);
            }
         }
      }

      private void a(double $$0, double $$1, double $$2, double $$3, float $$4, int $$5) {
         gu $$6 = gu.a($$0, $$3, $$1);
         boolean $$7 = false;
         double $$8 = 0.0;

         do {
            gu $$9 = $$6.d();
            dez $$10 = byt.this.dK().a_($$9);
            if ($$10.d(byt.this.dK(), $$9, ha.b)) {
               if (!byt.this.dK().t($$6)) {
                  dez $$11 = byt.this.dK().a_($$6);
                  ehw $$12 = $$11.k(byt.this.dK(), $$6);
                  if (!$$12.c()) {
                     $$8 = $$12.c(ha.a.b);
                  }
               }

               $$7 = true;
               break;
            }

            $$6 = $$6.d();
         } while ($$6.v() >= arp.a($$2) - 1);

         if ($$7) {
            byt.this.dK().b(new cbw(byt.this.dK(), $$0, (double)$$6.v() + $$8, $$1, $$4, $$5, byt.this));
            byt.this.dK().a(djj.t, new ehd($$0, (double)$$6.v() + $$8, $$1), djj.a.a(byt.this));
         }
      }

      @Override
      protected aov l() {
         return aow.hw;
      }

      @Override
      protected bzk.a m() {
         return bzk.a.c;
      }
   }

   class b extends bzk.b {
      @Override
      public void e() {
         if (byt.this.j() != null) {
            byt.this.D().a(byt.this.j(), (float)byt.this.X(), (float)byt.this.W());
         } else if (byt.this.gt() != null) {
            byt.this.D().a(byt.this.gt(), (float)byt.this.X(), (float)byt.this.W());
         }
      }
   }

   class c extends bzk.c {
      private final btk e = btk.b().a(16.0).d().e();

      @Override
      public boolean a() {
         if (!super.a()) {
            return false;
         } else {
            int $$0 = byt.this.dK().a(bzo.class, this.e, byt.this, byt.this.cG().g(16.0)).size();
            return byt.this.ag.a(8) + 1 > $$0;
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
         akk $$0 = (akk)byt.this.dK();

         for (int $$1 = 0; $$1 < 3; $$1++) {
            gu $$2 = byt.this.dk().b(-2 + byt.this.ag.a(5), 1, -2 + byt.this.ag.a(5));
            bzo $$3 = bim.be.a(byt.this.dK());
            if ($$3 != null) {
               $$3.a($$2, 0.0F, 0.0F);
               $$3.a($$0, byt.this.dK().d_($$2), bjc.f, null, null);
               $$3.a(byt.this);
               $$3.i($$2);
               $$3.b(20 * (30 + byt.this.ag.a(90)));
               $$0.a_($$3);
               $$0.a(djj.t, $$2, djj.a.a(byt.this));
            }
         }
      }

      @Override
      protected aov l() {
         return aow.hx;
      }

      @Override
      protected bzk.a m() {
         return bzk.a.b;
      }
   }

   public class d extends bzk.c {
      private final btk e = btk.b().a(16.0).a($$0x -> ((bvf)$$0x).q() == chl.l);

      @Override
      public boolean a() {
         if (byt.this.j() != null) {
            return false;
         } else if (byt.this.gk()) {
            return false;
         } else if (byt.this.ah < this.c) {
            return false;
         } else if (!byt.this.dK().X().b(cph.c)) {
            return false;
         } else {
            List<bvf> $$0 = byt.this.dK().a(bvf.class, this.e, byt.this, byt.this.cG().c(16.0, 4.0, 16.0));
            if ($$0.isEmpty()) {
               return false;
            } else {
               byt.this.a($$0.get(byt.this.ag.a($$0.size())));
               return true;
            }
         }
      }

      @Override
      public boolean b() {
         return byt.this.gt() != null && this.b > 0;
      }

      @Override
      public void d() {
         super.d();
         byt.this.a(null);
      }

      @Override
      protected void k() {
         bvf $$0 = byt.this.gt();
         if ($$0 != null && $$0.bv()) {
            $$0.b(chl.o);
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
      protected aov l() {
         return aow.hy;
      }

      @Override
      protected bzk.a m() {
         return bzk.a.d;
      }
   }
}
