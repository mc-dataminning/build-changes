import java.util.List;
import javax.annotation.Nullable;

public class cft extends cgk {
   @Nullable
   private cca e;

   public cft(bpd<? extends cft> $$0, cxb $$1) {
      super($$0, $$1);
      this.bM = 10;
   }

   @Override
   protected void z() {
      super.z();
      this.bR.a(0, new bwg(this));
      this.bR.a(1, new cft.b());
      this.bR.a(2, new bvt<>(this, ciu.class, 8.0F, 0.6, 1.0));
      this.bR.a(4, new cft.c());
      this.bR.a(5, new cft.a());
      this.bR.a(6, new cft.d());
      this.bR.a(8, new bxj(this, 0.6));
      this.bR.a(9, new bwu(this, ciu.class, 3.0F, 1.0F));
      this.bR.a(10, new bwu(this, bpr.class, 8.0F));
      this.bS.a(1, new bye(this, ckg.class).a());
      this.bS.a(2, new byf<>(this, ciu.class, true).c(300));
      this.bS.a(3, new byf<>(this, cic.class, false).c(300));
      this.bS.a(3, new byf<>(this, cbq.class, false));
   }

   public static bqv.a s() {
      return cga.gt().a(bqw.r, 0.5).a(bqw.k, 12.0).a(bqw.q, 24.0);
   }

   @Override
   protected void a(aiq.a $$0) {
      super.a($$0);
   }

   @Override
   public void a(ta $$0) {
      super.a($$0);
   }

   @Override
   public atx ae_() {
      return aty.is;
   }

   @Override
   public void b(ta $$0) {
      super.b($$0);
   }

   @Override
   protected void Y() {
      super.Y();
   }

   @Override
   public boolean s(box $$0) {
      if ($$0 == null) {
         return false;
      } else if ($$0 == this) {
         return true;
      } else if (super.s($$0)) {
         return true;
      } else {
         return $$0 instanceof cgo $$1 ? this.s($$1.s()) : false;
      }
   }

   @Override
   protected atx v() {
      return aty.iq;
   }

   @Override
   protected atx n_() {
      return aty.it;
   }

   @Override
   protected atx d(bnw $$0) {
      return aty.iv;
   }

   void a(@Nullable cca $$0) {
      this.e = $$0;
   }

   @Nullable
   cca gG() {
      return this.e;
   }

   @Override
   protected atx gn() {
      return aty.ir;
   }

   @Override
   public void a(int $$0, boolean $$1) {
   }

   class a extends cgk.c {
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
         bpp $$0 = cft.this.p();
         double $$1 = Math.min($$0.dt(), cft.this.dt());
         double $$2 = Math.max($$0.dt(), cft.this.dt()) + 1.0;
         float $$3 = (float)aww.d($$0.dx() - cft.this.dx(), $$0.dr() - cft.this.dr());
         if (cft.this.g((box)$$0) < 9.0) {
            for (int $$4 = 0; $$4 < 5; $$4++) {
               float $$5 = $$3 + (float)$$4 * (float) Math.PI * 0.4F;
               this.a(cft.this.dr() + (double)aww.b($$5) * 1.5, cft.this.dx() + (double)aww.a($$5) * 1.5, $$1, $$2, $$5, 0);
            }

            for (int $$6 = 0; $$6 < 8; $$6++) {
               float $$7 = $$3 + (float)$$6 * (float) Math.PI * 2.0F / 8.0F + (float) (Math.PI * 2.0 / 5.0);
               this.a(cft.this.dr() + (double)aww.b($$7) * 2.5, cft.this.dx() + (double)aww.a($$7) * 2.5, $$1, $$2, $$7, 3);
            }
         } else {
            for (int $$8 = 0; $$8 < 16; $$8++) {
               double $$9 = 1.25 * (double)($$8 + 1);
               int $$10 = 1 * $$8;
               this.a(cft.this.dr() + (double)aww.b($$3) * $$9, cft.this.dx() + (double)aww.a($$3) * $$9, $$1, $$2, $$3, $$10);
            }
         }
      }

      private void a(double $$0, double $$1, double $$2, double $$3, float $$4, int $$5) {
         ib $$6 = ib.a($$0, $$3, $$1);
         boolean $$7 = false;
         double $$8 = 0.0;

         do {
            ib $$9 = $$6.d();
            dnb $$10 = cft.this.dM().a_($$9);
            if ($$10.d(cft.this.dM(), $$9, ih.b)) {
               if (!cft.this.dM().u($$6)) {
                  dnb $$11 = cft.this.dM().a_($$6);
                  eqm $$12 = $$11.k(cft.this.dM(), $$6);
                  if (!$$12.c()) {
                     $$8 = $$12.c(ih.a.b);
                  }
               }

               $$7 = true;
               break;
            }

            $$6 = $$6.d();
         } while ($$6.v() >= aww.a($$2) - 1);

         if ($$7) {
            cft.this.dM().b(new cje(cft.this.dM(), $$0, (double)$$6.v() + $$8, $$1, $$4, $$5, cft.this));
            cft.this.dM().a(drp.t, new ept($$0, (double)$$6.v() + $$8, $$1), drp.a.a(cft.this));
         }
      }

      @Override
      protected atx l() {
         return aty.iw;
      }

      @Override
      protected cgk.a m() {
         return cgk.a.c;
      }
   }

   class b extends cgk.b {
      @Override
      public void e() {
         if (cft.this.p() != null) {
            cft.this.G().a(cft.this.p(), (float)cft.this.aa(), (float)cft.this.Z());
         } else if (cft.this.gG() != null) {
            cft.this.G().a(cft.this.gG(), (float)cft.this.aa(), (float)cft.this.Z());
         }
      }
   }

   class c extends cgk.c {
      private final caf e = caf.b().a(16.0).d().e();

      @Override
      public boolean a() {
         if (!super.a()) {
            return false;
         } else {
            int $$0 = cft.this.dM().a(cgo.class, this.e, cft.this, cft.this.cH().g(16.0)).size();
            return cft.this.ag.a(8) + 1 > $$0;
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
         apf $$0 = (apf)cft.this.dM();
         eqs $$1 = cft.this.cg();

         for (int $$2 = 0; $$2 < 3; $$2++) {
            ib $$3 = cft.this.dm().b(-2 + cft.this.ag.a(5), 1, -2 + cft.this.ag.a(5));
            cgo $$4 = bpd.bi.a(cft.this.dM());
            if ($$4 != null) {
               $$4.a($$3, 0.0F, 0.0F);
               $$4.a($$0, cft.this.dM().d_($$3), bpt.f, null);
               $$4.a(cft.this);
               $$4.i($$3);
               $$4.b(20 * (30 + cft.this.ag.a(90)));
               if ($$1 != null) {
                  $$0.f().a($$4.cy(), $$1);
               }

               $$0.a_($$4);
               $$0.a(drp.t, $$3, drp.a.a(cft.this));
            }
         }
      }

      @Override
      protected atx l() {
         return aty.ix;
      }

      @Override
      protected cgk.a m() {
         return cgk.a.b;
      }
   }

   public class d extends cgk.c {
      private final caf e = caf.b().a(16.0).a($$0x -> ((cca)$$0x).s() == cpd.l);

      @Override
      public boolean a() {
         if (cft.this.p() != null) {
            return false;
         } else if (cft.this.gx()) {
            return false;
         } else if (cft.this.ah < this.c) {
            return false;
         } else if (!cft.this.dM().Z().b(cwx.c)) {
            return false;
         } else {
            List<cca> $$0 = cft.this.dM().a(cca.class, this.e, cft.this, cft.this.cH().c(16.0, 4.0, 16.0));
            if ($$0.isEmpty()) {
               return false;
            } else {
               cft.this.a($$0.get(cft.this.ag.a($$0.size())));
               return true;
            }
         }
      }

      @Override
      public boolean b() {
         return cft.this.gG() != null && this.b > 0;
      }

      @Override
      public void d() {
         super.d();
         cft.this.a(null);
      }

      @Override
      protected void k() {
         cca $$0 = cft.this.gG();
         if ($$0 != null && $$0.bA()) {
            $$0.b(cpd.o);
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
      protected atx l() {
         return aty.iy;
      }

      @Override
      protected cgk.a m() {
         return cgk.a.d;
      }
   }
}
