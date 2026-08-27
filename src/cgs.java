import java.util.List;
import javax.annotation.Nullable;

public class cgs extends chj {
   @Nullable
   private ccz e;

   public cgs(bqb<? extends cgs> $$0, cyx $$1) {
      super($$0, $$1);
      this.bM = 10;
   }

   @Override
   protected void z() {
      super.z();
      this.bR.a(0, new bxf(this));
      this.bR.a(1, new cgs.b());
      this.bR.a(2, new bws<>(this, cjt.class, 8.0F, 0.6, 1.0));
      this.bR.a(4, new cgs.c());
      this.bR.a(5, new cgs.a());
      this.bR.a(6, new cgs.d());
      this.bR.a(8, new byi(this, 0.6));
      this.bR.a(9, new bxt(this, cjt.class, 3.0F, 1.0F));
      this.bR.a(10, new bxt(this, bqq.class, 8.0F));
      this.bS.a(1, new bzd(this, clf.class).a());
      this.bS.a(2, new bze<>(this, cjt.class, true).c(300));
      this.bS.a(3, new bze<>(this, cjb.class, false).c(300));
      this.bS.a(3, new bze<>(this, ccp.class, false));
   }

   public static bru.a u() {
      return cgz.gt().a(brv.r, 0.5).a(brv.k, 12.0).a(brv.q, 24.0);
   }

   @Override
   protected void a(ajc.a $$0) {
      super.a($$0);
   }

   @Override
   public void a(tm $$0) {
      super.a($$0);
   }

   @Override
   public aul ae_() {
      return aum.iu;
   }

   @Override
   public void b(tm $$0) {
      super.b($$0);
   }

   @Override
   protected void Y() {
      super.Y();
   }

   @Override
   public boolean s(bpv $$0) {
      if ($$0 == null) {
         return false;
      } else if ($$0 == this) {
         return true;
      } else if (super.s($$0)) {
         return true;
      } else {
         return $$0 instanceof chn $$1 ? this.s($$1.y()) : false;
      }
   }

   @Override
   protected aul v() {
      return aum.is;
   }

   @Override
   protected aul o_() {
      return aum.iv;
   }

   @Override
   protected aul d(bot $$0) {
      return aum.ix;
   }

   void a(@Nullable ccz $$0) {
      this.e = $$0;
   }

   @Nullable
   ccz gG() {
      return this.e;
   }

   @Override
   protected aul gn() {
      return aum.it;
   }

   @Override
   public void a(int $$0, boolean $$1) {
   }

   class a extends chj.c {
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
         bqo $$0 = cgs.this.p();
         double $$1 = Math.min($$0.dt(), cgs.this.dt());
         double $$2 = Math.max($$0.dt(), cgs.this.dt()) + 1.0;
         float $$3 = (float)axk.d($$0.dx() - cgs.this.dx(), $$0.dr() - cgs.this.dr());
         if (cgs.this.g((bpv)$$0) < 9.0) {
            for (int $$4 = 0; $$4 < 5; $$4++) {
               float $$5 = $$3 + (float)$$4 * (float) Math.PI * 0.4F;
               this.a(cgs.this.dr() + (double)axk.b($$5) * 1.5, cgs.this.dx() + (double)axk.a($$5) * 1.5, $$1, $$2, $$5, 0);
            }

            for (int $$6 = 0; $$6 < 8; $$6++) {
               float $$7 = $$3 + (float)$$6 * (float) Math.PI * 2.0F / 8.0F + (float) (Math.PI * 2.0 / 5.0);
               this.a(cgs.this.dr() + (double)axk.b($$7) * 2.5, cgs.this.dx() + (double)axk.a($$7) * 2.5, $$1, $$2, $$7, 3);
            }
         } else {
            for (int $$8 = 0; $$8 < 16; $$8++) {
               double $$9 = 1.25 * (double)($$8 + 1);
               int $$10 = 1 * $$8;
               this.a(cgs.this.dr() + (double)axk.b($$3) * $$9, cgs.this.dx() + (double)axk.a($$3) * $$9, $$1, $$2, $$3, $$10);
            }
         }
      }

      private void a(double $$0, double $$1, double $$2, double $$3, float $$4, int $$5) {
         ib $$6 = ib.a($$0, $$3, $$1);
         boolean $$7 = false;
         double $$8 = 0.0;

         do {
            ib $$9 = $$6.d();
            doz $$10 = cgs.this.dM().a_($$9);
            if ($$10.d(cgs.this.dM(), $$9, ih.b)) {
               if (!cgs.this.dM().u($$6)) {
                  doz $$11 = cgs.this.dM().a_($$6);
                  est $$12 = $$11.k(cgs.this.dM(), $$6);
                  if (!$$12.c()) {
                     $$8 = $$12.c(ih.a.b);
                  }
               }

               $$7 = true;
               break;
            }

            $$6 = $$6.d();
         } while ($$6.v() >= axk.a($$2) - 1);

         if ($$7) {
            cgs.this.dM().b(new ckd(cgs.this.dM(), $$0, (double)$$6.v() + $$8, $$1, $$4, $$5, cgs.this));
            cgs.this.dM().a(dts.t, new esa($$0, (double)$$6.v() + $$8, $$1), dts.a.a(cgs.this));
         }
      }

      @Override
      protected aul l() {
         return aum.iy;
      }

      @Override
      protected chj.a m() {
         return chj.a.c;
      }
   }

   class b extends chj.b {
      @Override
      public void e() {
         if (cgs.this.p() != null) {
            cgs.this.G().a(cgs.this.p(), (float)cgs.this.aa(), (float)cgs.this.Z());
         } else if (cgs.this.gG() != null) {
            cgs.this.G().a(cgs.this.gG(), (float)cgs.this.aa(), (float)cgs.this.Z());
         }
      }
   }

   class c extends chj.c {
      private final cbe e = cbe.b().a(16.0).d().e();

      @Override
      public boolean a() {
         if (!super.a()) {
            return false;
         } else {
            int $$0 = cgs.this.dM().a(chn.class, this.e, cgs.this, cgs.this.cH().g(16.0)).size();
            return cgs.this.ag.a(8) + 1 > $$0;
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
         aps $$0 = (aps)cgs.this.dM();
         esz $$1 = cgs.this.cg();

         for (int $$2 = 0; $$2 < 3; $$2++) {
            ib $$3 = cgs.this.dm().b(-2 + cgs.this.ag.a(5), 1, -2 + cgs.this.ag.a(5));
            chn $$4 = bqb.bh.a(cgs.this.dM());
            if ($$4 != null) {
               $$4.a($$3, 0.0F, 0.0F);
               $$4.a($$0, cgs.this.dM().d_($$3), bqs.f, null);
               $$4.a(cgs.this);
               $$4.i($$3);
               $$4.b(20 * (30 + cgs.this.ag.a(90)));
               if ($$1 != null) {
                  $$0.f().a($$4.cy(), $$1);
               }

               $$0.a_($$4);
               $$0.a(dts.t, $$3, dts.a.a(cgs.this));
            }
         }
      }

      @Override
      protected aul l() {
         return aum.iz;
      }

      @Override
      protected chj.a m() {
         return chj.a.b;
      }
   }

   public class d extends chj.c {
      private final cbe e = cbe.b().a(16.0).a($$0x -> ((ccz)$$0x).u() == cqc.l);

      @Override
      public boolean a() {
         if (cgs.this.p() != null) {
            return false;
         } else if (cgs.this.gx()) {
            return false;
         } else if (cgs.this.ah < this.c) {
            return false;
         } else if (!cgs.this.dM().aa().b(cyt.c)) {
            return false;
         } else {
            List<ccz> $$0 = cgs.this.dM().a(ccz.class, this.e, cgs.this, cgs.this.cH().c(16.0, 4.0, 16.0));
            if ($$0.isEmpty()) {
               return false;
            } else {
               cgs.this.a($$0.get(cgs.this.ag.a($$0.size())));
               return true;
            }
         }
      }

      @Override
      public boolean b() {
         return cgs.this.gG() != null && this.b > 0;
      }

      @Override
      public void d() {
         super.d();
         cgs.this.a(null);
      }

      @Override
      protected void k() {
         ccz $$0 = cgs.this.gG();
         if ($$0 != null && $$0.bA()) {
            $$0.b(cqc.o);
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
      protected aul l() {
         return aum.iA;
      }

      @Override
      protected chj.a m() {
         return chj.a.d;
      }
   }
}
