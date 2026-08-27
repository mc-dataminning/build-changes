import java.util.List;
import javax.annotation.Nullable;

public class civ extends cjm {
   @Nullable
   private cfa e;

   public civ(bsa<? extends civ> $$0, dax $$1) {
      super($$0, $$1);
      this.bN = 10;
   }

   @Override
   protected void z() {
      super.z();
      this.bS.a(0, new bzg(this));
      this.bS.a(1, new civ.b());
      this.bS.a(2, new byt<>(this, clw.class, 8.0F, 0.6, 1.0));
      this.bS.a(4, new civ.c());
      this.bS.a(5, new civ.a());
      this.bS.a(6, new civ.d());
      this.bS.a(8, new caj(this, 0.6));
      this.bS.a(9, new bzu(this, clw.class, 3.0F, 1.0F));
      this.bS.a(10, new bzu(this, bsq.class, 8.0F));
      this.bT.a(1, new cbe(this, cni.class).a());
      this.bT.a(2, new cbf<>(this, clw.class, true).c(300));
      this.bT.a(3, new cbf<>(this, cle.class, false).c(300));
      this.bT.a(3, new cbf<>(this, ceq.class, false));
   }

   public static btv.a u() {
      return cjc.gv().a(btw.r, 0.5).a(btw.k, 12.0).a(btw.q, 24.0);
   }

   @Override
   protected void a(ajv.a $$0) {
      super.a($$0);
   }

   @Override
   public void a(ud $$0) {
      super.a($$0);
   }

   @Override
   public avg ae_() {
      return avh.iz;
   }

   @Override
   public void b(ud $$0) {
      super.b($$0);
   }

   @Override
   protected void Y() {
      super.Y();
   }

   @Override
   public boolean s(bru $$0) {
      if ($$0 == null) {
         return false;
      } else if ($$0 == this) {
         return true;
      } else if (super.s($$0)) {
         return true;
      } else {
         return $$0 instanceof cjq $$1 ? this.s($$1.y()) : false;
      }
   }

   @Override
   protected avg v() {
      return avh.ix;
   }

   @Override
   protected avg o_() {
      return avh.iA;
   }

   @Override
   protected avg d(bqn $$0) {
      return avh.iC;
   }

   void a(@Nullable cfa $$0) {
      this.e = $$0;
   }

   @Nullable
   cfa gK() {
      return this.e;
   }

   @Override
   protected avg gp() {
      return avh.iy;
   }

   @Override
   public void a(int $$0, boolean $$1) {
   }

   class a extends cjm.c {
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
         double $$1 = Math.min($$0.dw(), civ.this.dw());
         double $$2 = Math.max($$0.dw(), civ.this.dw()) + 1.0;
         float $$3 = (float)ayd.d($$0.dA() - civ.this.dA(), $$0.du() - civ.this.du());
         if (civ.this.g((bru)$$0) < 9.0) {
            for (int $$4 = 0; $$4 < 5; $$4++) {
               float $$5 = $$3 + (float)$$4 * (float) Math.PI * 0.4F;
               this.a(civ.this.du() + (double)ayd.b($$5) * 1.5, civ.this.dA() + (double)ayd.a($$5) * 1.5, $$1, $$2, $$5, 0);
            }

            for (int $$6 = 0; $$6 < 8; $$6++) {
               float $$7 = $$3 + (float)$$6 * (float) Math.PI * 2.0F / 8.0F + (float) (Math.PI * 2.0 / 5.0);
               this.a(civ.this.du() + (double)ayd.b($$7) * 2.5, civ.this.dA() + (double)ayd.a($$7) * 2.5, $$1, $$2, $$7, 3);
            }
         } else {
            for (int $$8 = 0; $$8 < 16; $$8++) {
               double $$9 = 1.25 * (double)($$8 + 1);
               int $$10 = 1 * $$8;
               this.a(civ.this.du() + (double)ayd.b($$3) * $$9, civ.this.dA() + (double)ayd.a($$3) * $$9, $$1, $$2, $$3, $$10);
            }
         }
      }

      private void a(double $$0, double $$1, double $$2, double $$3, float $$4, int $$5) {
         io $$6 = io.a($$0, $$3, $$1);
         boolean $$7 = false;
         double $$8 = 0.0;

         do {
            io $$9 = $$6.d();
            drb $$10 = civ.this.dP().a_($$9);
            if ($$10.d(civ.this.dP(), $$9, it.b)) {
               if (!civ.this.dP().u($$6)) {
                  drb $$11 = civ.this.dP().a_($$6);
                  evd $$12 = $$11.k(civ.this.dP(), $$6);
                  if (!$$12.c()) {
                     $$8 = $$12.c(it.a.b);
                  }
               }

               $$7 = true;
               break;
            }

            $$6 = $$6.d();
         } while ($$6.v() >= ayd.a($$2) - 1);

         if ($$7) {
            civ.this.dP().b(new cmg(civ.this.dP(), $$0, (double)$$6.v() + $$8, $$1, $$4, $$5, civ.this));
            civ.this.dP().a(dvu.t, new euk($$0, (double)$$6.v() + $$8, $$1), dvu.a.a(civ.this));
         }
      }

      @Override
      protected avg l() {
         return avh.iD;
      }

      @Override
      protected cjm.a m() {
         return cjm.a.c;
      }
   }

   class b extends cjm.b {
      @Override
      public void e() {
         if (civ.this.p() != null) {
            civ.this.G().a(civ.this.p(), (float)civ.this.aa(), (float)civ.this.Z());
         } else if (civ.this.gK() != null) {
            civ.this.G().a(civ.this.gK(), (float)civ.this.aa(), (float)civ.this.Z());
         }
      }
   }

   class c extends cjm.c {
      private final cdf e = cdf.b().a(16.0).d().e();

      @Override
      public boolean a() {
         if (!super.a()) {
            return false;
         } else {
            int $$0 = civ.this.dP().a(cjq.class, this.e, civ.this, civ.this.cK().g(16.0)).size();
            return civ.this.ah.a(8) + 1 > $$0;
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
         aqm $$0 = (aqm)civ.this.dP();
         evj $$1 = civ.this.cj();

         for (int $$2 = 0; $$2 < 3; $$2++) {
            io $$3 = civ.this.dp().b(-2 + civ.this.ah.a(5), 1, -2 + civ.this.ah.a(5));
            cjq $$4 = bsa.bi.a(civ.this.dP());
            if ($$4 != null) {
               $$4.a($$3, 0.0F, 0.0F);
               $$4.a($$0, civ.this.dP().d_($$3), bss.f, null);
               $$4.a(civ.this);
               $$4.i($$3);
               $$4.b(20 * (30 + civ.this.ah.a(90)));
               if ($$1 != null) {
                  $$0.f().a($$4.cB(), $$1);
               }

               $$0.a_($$4);
               $$0.a(dvu.t, $$3, dvu.a.a(civ.this));
            }
         }
      }

      @Override
      protected avg l() {
         return avh.iE;
      }

      @Override
      protected cjm.a m() {
         return cjm.a.b;
      }
   }

   public class d extends cjm.c {
      private final cdf e = cdf.b().a(16.0).a($$0x -> ((cfa)$$0x).u() == csh.l);

      @Override
      public boolean a() {
         if (civ.this.p() != null) {
            return false;
         } else if (civ.this.gz()) {
            return false;
         } else if (civ.this.ai < this.c) {
            return false;
         } else if (!civ.this.dP().aa().b(dat.c)) {
            return false;
         } else {
            List<cfa> $$0 = civ.this.dP().a(cfa.class, this.e, civ.this, civ.this.cK().c(16.0, 4.0, 16.0));
            if ($$0.isEmpty()) {
               return false;
            } else {
               civ.this.a($$0.get(civ.this.ah.a($$0.size())));
               return true;
            }
         }
      }

      @Override
      public boolean b() {
         return civ.this.gK() != null && this.b > 0;
      }

      @Override
      public void d() {
         super.d();
         civ.this.a(null);
      }

      @Override
      protected void k() {
         cfa $$0 = civ.this.gK();
         if ($$0 != null && $$0.bD()) {
            $$0.b(csh.o);
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
      protected avg l() {
         return avh.iF;
      }

      @Override
      protected cjm.a m() {
         return cjm.a.d;
      }
   }
}
