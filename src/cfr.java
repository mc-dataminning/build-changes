import java.util.List;
import javax.annotation.Nullable;

public class cfr extends cgi {
   @Nullable
   private cbz e;

   public cfr(bpc<? extends cfr> $$0, cwz $$1) {
      super($$0, $$1);
      this.bM = 10;
   }

   @Override
   protected void z() {
      super.z();
      this.bR.a(0, new bwf(this));
      this.bR.a(1, new cfr.b());
      this.bR.a(2, new bvs<>(this, cis.class, 8.0F, 0.6, 1.0));
      this.bR.a(4, new cfr.c());
      this.bR.a(5, new cfr.a());
      this.bR.a(6, new cfr.d());
      this.bR.a(8, new bxi(this, 0.6));
      this.bR.a(9, new bwt(this, cis.class, 3.0F, 1.0F));
      this.bR.a(10, new bwt(this, bpq.class, 8.0F));
      this.bS.a(1, new byd(this, cke.class).a());
      this.bS.a(2, new bye<>(this, cis.class, true).c(300));
      this.bS.a(3, new bye<>(this, cia.class, false).c(300));
      this.bS.a(3, new bye<>(this, cbp.class, false));
   }

   public static bqu.a s() {
      return cfy.gt().a(bqv.r, 0.5).a(bqv.k, 12.0).a(bqv.q, 24.0);
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
      return aty.io;
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
   public boolean s(bow $$0) {
      if ($$0 == null) {
         return false;
      } else if ($$0 == this) {
         return true;
      } else if (super.s($$0)) {
         return true;
      } else {
         return $$0 instanceof cgm $$1 ? this.s($$1.s()) : false;
      }
   }

   @Override
   protected atx v() {
      return aty.im;
   }

   @Override
   protected atx n_() {
      return aty.ip;
   }

   @Override
   protected atx d(bnv $$0) {
      return aty.ir;
   }

   void a(@Nullable cbz $$0) {
      this.e = $$0;
   }

   @Nullable
   cbz gG() {
      return this.e;
   }

   @Override
   protected atx gn() {
      return aty.in;
   }

   @Override
   public void a(int $$0, boolean $$1) {
   }

   class a extends cgi.c {
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
         bpo $$0 = cfr.this.p();
         double $$1 = Math.min($$0.dt(), cfr.this.dt());
         double $$2 = Math.max($$0.dt(), cfr.this.dt()) + 1.0;
         float $$3 = (float)aww.d($$0.dx() - cfr.this.dx(), $$0.dr() - cfr.this.dr());
         if (cfr.this.g((bow)$$0) < 9.0) {
            for (int $$4 = 0; $$4 < 5; $$4++) {
               float $$5 = $$3 + (float)$$4 * (float) Math.PI * 0.4F;
               this.a(cfr.this.dr() + (double)aww.b($$5) * 1.5, cfr.this.dx() + (double)aww.a($$5) * 1.5, $$1, $$2, $$5, 0);
            }

            for (int $$6 = 0; $$6 < 8; $$6++) {
               float $$7 = $$3 + (float)$$6 * (float) Math.PI * 2.0F / 8.0F + (float) (Math.PI * 2.0 / 5.0);
               this.a(cfr.this.dr() + (double)aww.b($$7) * 2.5, cfr.this.dx() + (double)aww.a($$7) * 2.5, $$1, $$2, $$7, 3);
            }
         } else {
            for (int $$8 = 0; $$8 < 16; $$8++) {
               double $$9 = 1.25 * (double)($$8 + 1);
               int $$10 = 1 * $$8;
               this.a(cfr.this.dr() + (double)aww.b($$3) * $$9, cfr.this.dx() + (double)aww.a($$3) * $$9, $$1, $$2, $$3, $$10);
            }
         }
      }

      private void a(double $$0, double $$1, double $$2, double $$3, float $$4, int $$5) {
         ib $$6 = ib.a($$0, $$3, $$1);
         boolean $$7 = false;
         double $$8 = 0.0;

         do {
            ib $$9 = $$6.d();
            dmz $$10 = cfr.this.dM().a_($$9);
            if ($$10.d(cfr.this.dM(), $$9, ih.b)) {
               if (!cfr.this.dM().u($$6)) {
                  dmz $$11 = cfr.this.dM().a_($$6);
                  eqk $$12 = $$11.k(cfr.this.dM(), $$6);
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
            cfr.this.dM().b(new cjc(cfr.this.dM(), $$0, (double)$$6.v() + $$8, $$1, $$4, $$5, cfr.this));
            cfr.this.dM().a(drn.t, new epr($$0, (double)$$6.v() + $$8, $$1), drn.a.a(cfr.this));
         }
      }

      @Override
      protected atx l() {
         return aty.is;
      }

      @Override
      protected cgi.a m() {
         return cgi.a.c;
      }
   }

   class b extends cgi.b {
      @Override
      public void e() {
         if (cfr.this.p() != null) {
            cfr.this.G().a(cfr.this.p(), (float)cfr.this.aa(), (float)cfr.this.Z());
         } else if (cfr.this.gG() != null) {
            cfr.this.G().a(cfr.this.gG(), (float)cfr.this.aa(), (float)cfr.this.Z());
         }
      }
   }

   class c extends cgi.c {
      private final cae e = cae.b().a(16.0).d().e();

      @Override
      public boolean a() {
         if (!super.a()) {
            return false;
         } else {
            int $$0 = cfr.this.dM().a(cgm.class, this.e, cfr.this, cfr.this.cH().g(16.0)).size();
            return cfr.this.ag.a(8) + 1 > $$0;
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
         apf $$0 = (apf)cfr.this.dM();
         eqq $$1 = cfr.this.cg();

         for (int $$2 = 0; $$2 < 3; $$2++) {
            ib $$3 = cfr.this.dm().b(-2 + cfr.this.ag.a(5), 1, -2 + cfr.this.ag.a(5));
            cgm $$4 = bpc.bh.a(cfr.this.dM());
            if ($$4 != null) {
               $$4.a($$3, 0.0F, 0.0F);
               $$4.a($$0, cfr.this.dM().d_($$3), bps.f, null);
               $$4.a(cfr.this);
               $$4.i($$3);
               $$4.b(20 * (30 + cfr.this.ag.a(90)));
               if ($$1 != null) {
                  $$0.f().a($$4.cy(), $$1);
               }

               $$0.a_($$4);
               $$0.a(drn.t, $$3, drn.a.a(cfr.this));
            }
         }
      }

      @Override
      protected atx l() {
         return aty.it;
      }

      @Override
      protected cgi.a m() {
         return cgi.a.b;
      }
   }

   public class d extends cgi.c {
      private final cae e = cae.b().a(16.0).a($$0x -> ((cbz)$$0x).s() == cpb.l);

      @Override
      public boolean a() {
         if (cfr.this.p() != null) {
            return false;
         } else if (cfr.this.gx()) {
            return false;
         } else if (cfr.this.ah < this.c) {
            return false;
         } else if (!cfr.this.dM().Z().b(cwv.c)) {
            return false;
         } else {
            List<cbz> $$0 = cfr.this.dM().a(cbz.class, this.e, cfr.this, cfr.this.cH().c(16.0, 4.0, 16.0));
            if ($$0.isEmpty()) {
               return false;
            } else {
               cfr.this.a($$0.get(cfr.this.ag.a($$0.size())));
               return true;
            }
         }
      }

      @Override
      public boolean b() {
         return cfr.this.gG() != null && this.b > 0;
      }

      @Override
      public void d() {
         super.d();
         cfr.this.a(null);
      }

      @Override
      protected void k() {
         cbz $$0 = cfr.this.gG();
         if ($$0 != null && $$0.bA()) {
            $$0.b(cpb.o);
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
         return aty.iu;
      }

      @Override
      protected cgi.a m() {
         return cgi.a.d;
      }
   }
}
