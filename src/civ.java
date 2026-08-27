import java.util.List;
import javax.annotation.Nullable;

public class civ extends cjo {
   @Nullable
   private cfa e;

   public civ(bsb<? extends civ> $$0, dca $$1) {
      super($$0, $$1);
      this.bW = 10;
   }

   @Override
   protected void y() {
      super.y();
      this.cb.a(0, new bzf(this));
      this.cb.a(1, new civ.b());
      this.cb.a(2, new bys<>(this, cly.class, 8.0F, 0.6, 1.0));
      this.cb.a(4, new civ.c());
      this.cb.a(5, new civ.a());
      this.cb.a(6, new civ.d());
      this.cb.a(8, new cai(this, 0.6));
      this.cb.a(9, new bzt(this, cly.class, 3.0F, 1.0F));
      this.cb.a(10, new bzt(this, bsq.class, 8.0F));
      this.cc.a(1, new cbd(this, cnn.class).a());
      this.cc.a(2, new cbe<>(this, cly.class, true).c(300));
      this.cc.a(3, new cbe<>(this, clg.class, false).c(300));
      this.cc.a(3, new cbe<>(this, ceq.class, false));
   }

   public static btu.a t() {
      return cjd.gG().a(btv.r, 0.5).a(btv.k, 12.0).a(btv.q, 24.0);
   }

   @Override
   protected void a(akc.a $$0) {
      super.a($$0);
   }

   @Override
   public void a(uk $$0) {
      super.a($$0);
   }

   @Override
   public avn af_() {
      return avo.iM;
   }

   @Override
   public void b(uk $$0) {
      super.b($$0);
   }

   @Override
   protected void Y() {
      super.Y();
   }

   @Override
   public boolean s(brv $$0) {
      if ($$0 == null) {
         return false;
      } else if ($$0 == this) {
         return true;
      } else if (super.s($$0)) {
         return true;
      } else {
         return $$0 instanceof cjs $$1 ? this.s($$1.x()) : false;
      }
   }

   @Override
   protected avn u() {
      return avo.iK;
   }

   @Override
   protected avn n_() {
      return avo.iN;
   }

   @Override
   protected avn d(bqt $$0) {
      return avo.iP;
   }

   void a(@Nullable cfa $$0) {
      this.e = $$0;
   }

   @Nullable
   cfa gR() {
      return this.e;
   }

   @Override
   protected avn gy() {
      return avo.iL;
   }

   @Override
   public void a(int $$0, boolean $$1) {
   }

   class a extends cjo.c {
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
         bso $$0 = civ.this.p();
         double $$1 = Math.min($$0.dB(), civ.this.dB());
         double $$2 = Math.max($$0.dB(), civ.this.dB()) + 1.0;
         float $$3 = (float)aym.d($$0.dF() - civ.this.dF(), $$0.dz() - civ.this.dz());
         if (civ.this.g((brv)$$0) < 9.0) {
            for (int $$4 = 0; $$4 < 5; $$4++) {
               float $$5 = $$3 + (float)$$4 * (float) Math.PI * 0.4F;
               this.a(civ.this.dz() + (double)aym.b($$5) * 1.5, civ.this.dF() + (double)aym.a($$5) * 1.5, $$1, $$2, $$5, 0);
            }

            for (int $$6 = 0; $$6 < 8; $$6++) {
               float $$7 = $$3 + (float)$$6 * (float) Math.PI * 2.0F / 8.0F + (float) (Math.PI * 2.0 / 5.0);
               this.a(civ.this.dz() + (double)aym.b($$7) * 2.5, civ.this.dF() + (double)aym.a($$7) * 2.5, $$1, $$2, $$7, 3);
            }
         } else {
            for (int $$8 = 0; $$8 < 16; $$8++) {
               double $$9 = 1.25 * (double)($$8 + 1);
               int $$10 = 1 * $$8;
               this.a(civ.this.dz() + (double)aym.b($$3) * $$9, civ.this.dF() + (double)aym.a($$3) * $$9, $$1, $$2, $$3, $$10);
            }
         }
      }

      private void a(double $$0, double $$1, double $$2, double $$3, float $$4, int $$5) {
         ir $$6 = ir.a($$0, $$3, $$1);
         boolean $$7 = false;
         double $$8 = 0.0;

         do {
            ir $$9 = $$6.d();
            dtc $$10 = civ.this.dU().a_($$9);
            if ($$10.d(civ.this.dU(), $$9, iw.b)) {
               if (!civ.this.dU().u($$6)) {
                  dtc $$11 = civ.this.dU().a_($$6);
                  exn $$12 = $$11.k(civ.this.dU(), $$6);
                  if (!$$12.c()) {
                     $$8 = $$12.c(iw.a.b);
                  }
               }

               $$7 = true;
               break;
            }

            $$6 = $$6.d();
         } while ($$6.v() >= aym.a($$2) - 1);

         if ($$7) {
            civ.this.dU().b(new cmi(civ.this.dU(), $$0, (double)$$6.v() + $$8, $$1, $$4, $$5, civ.this));
            civ.this.dU().a(dxv.t, new ewu($$0, (double)$$6.v() + $$8, $$1), dxv.a.a(civ.this));
         }
      }

      @Override
      protected avn l() {
         return avo.iQ;
      }

      @Override
      protected cjo.a m() {
         return cjo.a.c;
      }
   }

   class b extends cjo.b {
      @Override
      public void e() {
         if (civ.this.p() != null) {
            civ.this.F().a(civ.this.p(), (float)civ.this.aa(), (float)civ.this.Z());
         } else if (civ.this.gR() != null) {
            civ.this.F().a(civ.this.gR(), (float)civ.this.aa(), (float)civ.this.Z());
         }
      }
   }

   class c extends cjo.c {
      private final cde e = cde.b().a(16.0).d().e();

      @Override
      public boolean a() {
         if (!super.a()) {
            return false;
         } else {
            int $$0 = civ.this.dU().a(cjs.class, this.e, civ.this, civ.this.cP().g(16.0)).size();
            return civ.this.al.a(8) + 1 > $$0;
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
         aqt $$0 = (aqt)civ.this.dU();
         ext $$1 = civ.this.co();

         for (int $$2 = 0; $$2 < 3; $$2++) {
            ir $$3 = civ.this.du().b(-2 + civ.this.al.a(5), 1, -2 + civ.this.al.a(5));
            cjs $$4 = bsb.bm.a(civ.this.dU());
            if ($$4 != null) {
               $$4.a($$3, 0.0F, 0.0F);
               $$4.a($$0, civ.this.dU().d_($$3), bss.f, null);
               $$4.a(civ.this);
               $$4.e($$3);
               $$4.b(20 * (30 + civ.this.al.a(90)));
               if ($$1 != null) {
                  $$0.f().a($$4.cG(), $$1);
               }

               $$0.a_($$4);
               $$0.a(dxv.t, $$3, dxv.a.a(civ.this));
            }
         }
      }

      @Override
      protected avn l() {
         return avo.iR;
      }

      @Override
      protected cjo.a m() {
         return cjo.a.b;
      }
   }

   public class d extends cjo.c {
      private final cde e = cde.b().a(16.0).a($$0x -> ((cfa)$$0x).t() == csy.l);

      @Override
      public boolean a() {
         if (civ.this.p() != null) {
            return false;
         } else if (civ.this.gI()) {
            return false;
         } else if (civ.this.am < this.c) {
            return false;
         } else if (!civ.this.dU().ab().b(dbw.c)) {
            return false;
         } else {
            List<cfa> $$0 = civ.this.dU().a(cfa.class, this.e, civ.this, civ.this.cP().c(16.0, 4.0, 16.0));
            if ($$0.isEmpty()) {
               return false;
            } else {
               civ.this.a($$0.get(civ.this.al.a($$0.size())));
               return true;
            }
         }
      }

      @Override
      public boolean b() {
         return civ.this.gR() != null && this.b > 0;
      }

      @Override
      public void d() {
         super.d();
         civ.this.a(null);
      }

      @Override
      protected void k() {
         cfa $$0 = civ.this.gR();
         if ($$0 != null && $$0.bI()) {
            $$0.b(csy.o);
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
      protected avn l() {
         return avo.iS;
      }

      @Override
      protected cjo.a m() {
         return cjo.a.d;
      }
   }
}
