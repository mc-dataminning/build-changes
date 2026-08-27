import java.util.List;
import javax.annotation.Nullable;

public class cix extends cjo {
   @Nullable
   private cfc e;

   public cix(bsc<? extends cix> $$0, daz $$1) {
      super($$0, $$1);
      this.bN = 10;
   }

   @Override
   protected void z() {
      super.z();
      this.bS.a(0, new bzi(this));
      this.bS.a(1, new cix.b());
      this.bS.a(2, new byv<>(this, cly.class, 8.0F, 0.6, 1.0));
      this.bS.a(4, new cix.c());
      this.bS.a(5, new cix.a());
      this.bS.a(6, new cix.d());
      this.bS.a(8, new cal(this, 0.6));
      this.bS.a(9, new bzw(this, cly.class, 3.0F, 1.0F));
      this.bS.a(10, new bzw(this, bss.class, 8.0F));
      this.bT.a(1, new cbg(this, cnk.class).a());
      this.bT.a(2, new cbh<>(this, cly.class, true).c(300));
      this.bT.a(3, new cbh<>(this, clg.class, false).c(300));
      this.bT.a(3, new cbh<>(this, ces.class, false));
   }

   public static btx.a u() {
      return cje.gv().a(bty.r, 0.5).a(bty.k, 12.0).a(bty.q, 24.0);
   }

   @Override
   protected void a(ajw.a $$0) {
      super.a($$0);
   }

   @Override
   public void a(ud $$0) {
      super.a($$0);
   }

   @Override
   public avh ae_() {
      return avi.iz;
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
   public boolean s(brw $$0) {
      if ($$0 == null) {
         return false;
      } else if ($$0 == this) {
         return true;
      } else if (super.s($$0)) {
         return true;
      } else {
         return $$0 instanceof cjs $$1 ? this.s($$1.y()) : false;
      }
   }

   @Override
   protected avh v() {
      return avi.ix;
   }

   @Override
   protected avh o_() {
      return avi.iA;
   }

   @Override
   protected avh d(bqp $$0) {
      return avi.iC;
   }

   void a(@Nullable cfc $$0) {
      this.e = $$0;
   }

   @Nullable
   cfc gK() {
      return this.e;
   }

   @Override
   protected avh gp() {
      return avi.iy;
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
         bsq $$0 = cix.this.p();
         double $$1 = Math.min($$0.dw(), cix.this.dw());
         double $$2 = Math.max($$0.dw(), cix.this.dw()) + 1.0;
         float $$3 = (float)ayf.d($$0.dA() - cix.this.dA(), $$0.du() - cix.this.du());
         if (cix.this.g((brw)$$0) < 9.0) {
            for (int $$4 = 0; $$4 < 5; $$4++) {
               float $$5 = $$3 + (float)$$4 * (float) Math.PI * 0.4F;
               this.a(cix.this.du() + (double)ayf.b($$5) * 1.5, cix.this.dA() + (double)ayf.a($$5) * 1.5, $$1, $$2, $$5, 0);
            }

            for (int $$6 = 0; $$6 < 8; $$6++) {
               float $$7 = $$3 + (float)$$6 * (float) Math.PI * 2.0F / 8.0F + (float) (Math.PI * 2.0 / 5.0);
               this.a(cix.this.du() + (double)ayf.b($$7) * 2.5, cix.this.dA() + (double)ayf.a($$7) * 2.5, $$1, $$2, $$7, 3);
            }
         } else {
            for (int $$8 = 0; $$8 < 16; $$8++) {
               double $$9 = 1.25 * (double)($$8 + 1);
               int $$10 = 1 * $$8;
               this.a(cix.this.du() + (double)ayf.b($$3) * $$9, cix.this.dA() + (double)ayf.a($$3) * $$9, $$1, $$2, $$3, $$10);
            }
         }
      }

      private void a(double $$0, double $$1, double $$2, double $$3, float $$4, int $$5) {
         io $$6 = io.a($$0, $$3, $$1);
         boolean $$7 = false;
         double $$8 = 0.0;

         do {
            io $$9 = $$6.d();
            drd $$10 = cix.this.dP().a_($$9);
            if ($$10.d(cix.this.dP(), $$9, it.b)) {
               if (!cix.this.dP().u($$6)) {
                  drd $$11 = cix.this.dP().a_($$6);
                  evf $$12 = $$11.k(cix.this.dP(), $$6);
                  if (!$$12.c()) {
                     $$8 = $$12.c(it.a.b);
                  }
               }

               $$7 = true;
               break;
            }

            $$6 = $$6.d();
         } while ($$6.v() >= ayf.a($$2) - 1);

         if ($$7) {
            cix.this.dP().b(new cmi(cix.this.dP(), $$0, (double)$$6.v() + $$8, $$1, $$4, $$5, cix.this));
            cix.this.dP().a(dvw.t, new eum($$0, (double)$$6.v() + $$8, $$1), dvw.a.a(cix.this));
         }
      }

      @Override
      protected avh l() {
         return avi.iD;
      }

      @Override
      protected cjo.a m() {
         return cjo.a.c;
      }
   }

   class b extends cjo.b {
      @Override
      public void e() {
         if (cix.this.p() != null) {
            cix.this.G().a(cix.this.p(), (float)cix.this.aa(), (float)cix.this.Z());
         } else if (cix.this.gK() != null) {
            cix.this.G().a(cix.this.gK(), (float)cix.this.aa(), (float)cix.this.Z());
         }
      }
   }

   class c extends cjo.c {
      private final cdh e = cdh.b().a(16.0).d().e();

      @Override
      public boolean a() {
         if (!super.a()) {
            return false;
         } else {
            int $$0 = cix.this.dP().a(cjs.class, this.e, cix.this, cix.this.cK().g(16.0)).size();
            return cix.this.ah.a(8) + 1 > $$0;
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
         aqn $$0 = (aqn)cix.this.dP();
         evl $$1 = cix.this.cj();

         for (int $$2 = 0; $$2 < 3; $$2++) {
            io $$3 = cix.this.dp().b(-2 + cix.this.ah.a(5), 1, -2 + cix.this.ah.a(5));
            cjs $$4 = bsc.bi.a(cix.this.dP());
            if ($$4 != null) {
               $$4.a($$3, 0.0F, 0.0F);
               $$4.a($$0, cix.this.dP().d_($$3), bsu.f, null);
               $$4.a(cix.this);
               $$4.i($$3);
               $$4.b(20 * (30 + cix.this.ah.a(90)));
               if ($$1 != null) {
                  $$0.f().a($$4.cB(), $$1);
               }

               $$0.a_($$4);
               $$0.a(dvw.t, $$3, dvw.a.a(cix.this));
            }
         }
      }

      @Override
      protected avh l() {
         return avi.iE;
      }

      @Override
      protected cjo.a m() {
         return cjo.a.b;
      }
   }

   public class d extends cjo.c {
      private final cdh e = cdh.b().a(16.0).a($$0x -> ((cfc)$$0x).u() == csj.l);

      @Override
      public boolean a() {
         if (cix.this.p() != null) {
            return false;
         } else if (cix.this.gz()) {
            return false;
         } else if (cix.this.ai < this.c) {
            return false;
         } else if (!cix.this.dP().aa().b(dav.c)) {
            return false;
         } else {
            List<cfc> $$0 = cix.this.dP().a(cfc.class, this.e, cix.this, cix.this.cK().c(16.0, 4.0, 16.0));
            if ($$0.isEmpty()) {
               return false;
            } else {
               cix.this.a($$0.get(cix.this.ah.a($$0.size())));
               return true;
            }
         }
      }

      @Override
      public boolean b() {
         return cix.this.gK() != null && this.b > 0;
      }

      @Override
      public void d() {
         super.d();
         cix.this.a(null);
      }

      @Override
      protected void k() {
         cfc $$0 = cix.this.gK();
         if ($$0 != null && $$0.bD()) {
            $$0.b(csj.o);
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
      protected avh l() {
         return avi.iF;
      }

      @Override
      protected cjo.a m() {
         return cjo.a.d;
      }
   }
}
