import java.util.List;
import javax.annotation.Nullable;

public class cgz extends chq {
   @Nullable
   private cde e;

   public cgz(bqg<? extends cgz> $$0, czg $$1) {
      super($$0, $$1);
      this.bM = 10;
   }

   @Override
   protected void z() {
      super.z();
      this.bR.a(0, new bxk(this));
      this.bR.a(1, new cgz.b());
      this.bR.a(2, new bwx<>(this, cka.class, 8.0F, 0.6, 1.0));
      this.bR.a(4, new cgz.c());
      this.bR.a(5, new cgz.a());
      this.bR.a(6, new cgz.d());
      this.bR.a(8, new byn(this, 0.6));
      this.bR.a(9, new bxy(this, cka.class, 3.0F, 1.0F));
      this.bR.a(10, new bxy(this, bqv.class, 8.0F));
      this.bS.a(1, new bzi(this, clm.class).a());
      this.bS.a(2, new bzj<>(this, cka.class, true).c(300));
      this.bS.a(3, new bzj<>(this, cji.class, false).c(300));
      this.bS.a(3, new bzj<>(this, ccu.class, false));
   }

   public static brz.a u() {
      return chg.gt().a(bsa.r, 0.5).a(bsa.k, 12.0).a(bsa.q, 24.0);
   }

   @Override
   protected void a(aje.a $$0) {
      super.a($$0);
   }

   @Override
   public void a(to $$0) {
      super.a($$0);
   }

   @Override
   public aun ae_() {
      return auo.iu;
   }

   @Override
   public void b(to $$0) {
      super.b($$0);
   }

   @Override
   protected void Y() {
      super.Y();
   }

   @Override
   public boolean s(bqa $$0) {
      if ($$0 == null) {
         return false;
      } else if ($$0 == this) {
         return true;
      } else if (super.s($$0)) {
         return true;
      } else {
         return $$0 instanceof chu $$1 ? this.s($$1.y()) : false;
      }
   }

   @Override
   protected aun v() {
      return auo.is;
   }

   @Override
   protected aun o_() {
      return auo.iv;
   }

   @Override
   protected aun d(boy $$0) {
      return auo.ix;
   }

   void a(@Nullable cde $$0) {
      this.e = $$0;
   }

   @Nullable
   cde gG() {
      return this.e;
   }

   @Override
   protected aun gn() {
      return auo.it;
   }

   @Override
   public void a(int $$0, boolean $$1) {
   }

   class a extends chq.c {
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
         bqt $$0 = cgz.this.p();
         double $$1 = Math.min($$0.dt(), cgz.this.dt());
         double $$2 = Math.max($$0.dt(), cgz.this.dt()) + 1.0;
         float $$3 = (float)axm.d($$0.dx() - cgz.this.dx(), $$0.dr() - cgz.this.dr());
         if (cgz.this.g((bqa)$$0) < 9.0) {
            for (int $$4 = 0; $$4 < 5; $$4++) {
               float $$5 = $$3 + (float)$$4 * (float) Math.PI * 0.4F;
               this.a(cgz.this.dr() + (double)axm.b($$5) * 1.5, cgz.this.dx() + (double)axm.a($$5) * 1.5, $$1, $$2, $$5, 0);
            }

            for (int $$6 = 0; $$6 < 8; $$6++) {
               float $$7 = $$3 + (float)$$6 * (float) Math.PI * 2.0F / 8.0F + (float) (Math.PI * 2.0 / 5.0);
               this.a(cgz.this.dr() + (double)axm.b($$7) * 2.5, cgz.this.dx() + (double)axm.a($$7) * 2.5, $$1, $$2, $$7, 3);
            }
         } else {
            for (int $$8 = 0; $$8 < 16; $$8++) {
               double $$9 = 1.25 * (double)($$8 + 1);
               int $$10 = 1 * $$8;
               this.a(cgz.this.dr() + (double)axm.b($$3) * $$9, cgz.this.dx() + (double)axm.a($$3) * $$9, $$1, $$2, $$3, $$10);
            }
         }
      }

      private void a(double $$0, double $$1, double $$2, double $$3, float $$4, int $$5) {
         id $$6 = id.a($$0, $$3, $$1);
         boolean $$7 = false;
         double $$8 = 0.0;

         do {
            id $$9 = $$6.d();
            dpi $$10 = cgz.this.dM().a_($$9);
            if ($$10.d(cgz.this.dM(), $$9, ij.b)) {
               if (!cgz.this.dM().u($$6)) {
                  dpi $$11 = cgz.this.dM().a_($$6);
                  etc $$12 = $$11.k(cgz.this.dM(), $$6);
                  if (!$$12.c()) {
                     $$8 = $$12.c(ij.a.b);
                  }
               }

               $$7 = true;
               break;
            }

            $$6 = $$6.d();
         } while ($$6.v() >= axm.a($$2) - 1);

         if ($$7) {
            cgz.this.dM().b(new ckk(cgz.this.dM(), $$0, (double)$$6.v() + $$8, $$1, $$4, $$5, cgz.this));
            cgz.this.dM().a(dub.t, new esj($$0, (double)$$6.v() + $$8, $$1), dub.a.a(cgz.this));
         }
      }

      @Override
      protected aun l() {
         return auo.iy;
      }

      @Override
      protected chq.a m() {
         return chq.a.c;
      }
   }

   class b extends chq.b {
      @Override
      public void e() {
         if (cgz.this.p() != null) {
            cgz.this.G().a(cgz.this.p(), (float)cgz.this.aa(), (float)cgz.this.Z());
         } else if (cgz.this.gG() != null) {
            cgz.this.G().a(cgz.this.gG(), (float)cgz.this.aa(), (float)cgz.this.Z());
         }
      }
   }

   class c extends chq.c {
      private final cbj e = cbj.b().a(16.0).d().e();

      @Override
      public boolean a() {
         if (!super.a()) {
            return false;
         } else {
            int $$0 = cgz.this.dM().a(chu.class, this.e, cgz.this, cgz.this.cH().g(16.0)).size();
            return cgz.this.ag.a(8) + 1 > $$0;
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
         apu $$0 = (apu)cgz.this.dM();
         eti $$1 = cgz.this.cg();

         for (int $$2 = 0; $$2 < 3; $$2++) {
            id $$3 = cgz.this.dm().b(-2 + cgz.this.ag.a(5), 1, -2 + cgz.this.ag.a(5));
            chu $$4 = bqg.bh.a(cgz.this.dM());
            if ($$4 != null) {
               $$4.a($$3, 0.0F, 0.0F);
               $$4.a($$0, cgz.this.dM().d_($$3), bqx.f, null);
               $$4.a(cgz.this);
               $$4.i($$3);
               $$4.b(20 * (30 + cgz.this.ag.a(90)));
               if ($$1 != null) {
                  $$0.f().a($$4.cy(), $$1);
               }

               $$0.a_($$4);
               $$0.a(dub.t, $$3, dub.a.a(cgz.this));
            }
         }
      }

      @Override
      protected aun l() {
         return auo.iz;
      }

      @Override
      protected chq.a m() {
         return chq.a.b;
      }
   }

   public class d extends chq.c {
      private final cbj e = cbj.b().a(16.0).a($$0x -> ((cde)$$0x).u() == cql.l);

      @Override
      public boolean a() {
         if (cgz.this.p() != null) {
            return false;
         } else if (cgz.this.gx()) {
            return false;
         } else if (cgz.this.ah < this.c) {
            return false;
         } else if (!cgz.this.dM().aa().b(czc.c)) {
            return false;
         } else {
            List<cde> $$0 = cgz.this.dM().a(cde.class, this.e, cgz.this, cgz.this.cH().c(16.0, 4.0, 16.0));
            if ($$0.isEmpty()) {
               return false;
            } else {
               cgz.this.a($$0.get(cgz.this.ag.a($$0.size())));
               return true;
            }
         }
      }

      @Override
      public boolean b() {
         return cgz.this.gG() != null && this.b > 0;
      }

      @Override
      public void d() {
         super.d();
         cgz.this.a(null);
      }

      @Override
      protected void k() {
         cde $$0 = cgz.this.gG();
         if ($$0 != null && $$0.bA()) {
            $$0.b(cql.o);
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
      protected aun l() {
         return auo.iA;
      }

      @Override
      protected chq.a m() {
         return chq.a.d;
      }
   }
}
