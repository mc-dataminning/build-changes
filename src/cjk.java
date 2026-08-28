import java.util.List;
import javax.annotation.Nullable;

public class cjk extends ckb {
   @Nullable
   private cfo e;

   public cjk(bsn<? extends cjk> $$0, dcg $$1) {
      super($$0, $$1);
      this.bP = 10;
   }

   @Override
   protected void z() {
      super.z();
      this.bU.a(0, new bzu(this));
      this.bU.a(1, new cjk.b());
      this.bU.a(2, new bzh<>(this, cml.class, 8.0F, 0.6, 1.0));
      this.bU.a(4, new cjk.c());
      this.bU.a(5, new cjk.a());
      this.bU.a(6, new cjk.d());
      this.bU.a(8, new cax(this, 0.6));
      this.bU.a(9, new cai(this, cml.class, 3.0F, 1.0F));
      this.bU.a(10, new cai(this, bte.class, 8.0F));
      this.bV.a(1, new cbs(this, cnx.class).a());
      this.bV.a(2, new cbt<>(this, cml.class, true).c(300));
      this.bV.a(3, new cbt<>(this, clt.class, false).c(300));
      this.bV.a(3, new cbt<>(this, cfe.class, false));
   }

   public static buj.a t() {
      return cjr.gt().a(buk.v, 0.5).a(buk.m, 12.0).a(buk.s, 24.0);
   }

   @Override
   protected void a(ajt.a $$0) {
      super.a($$0);
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
   }

   @Override
   public avg ae_() {
      return avh.iz;
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
   }

   @Override
   protected void Z() {
      super.Z();
   }

   @Override
   public boolean s(bsh $$0) {
      if ($$0 == null) {
         return false;
      } else if ($$0 == this) {
         return true;
      } else if (super.s($$0)) {
         return true;
      } else {
         return $$0 instanceof ckf $$1 ? this.s($$1.x()) : false;
      }
   }

   @Override
   protected avg v() {
      return avh.ix;
   }

   @Override
   protected avg n_() {
      return avh.iA;
   }

   @Override
   protected avg d(bra $$0) {
      return avh.iC;
   }

   void a(@Nullable cfo $$0) {
      this.e = $$0;
   }

   @Nullable
   cfo gI() {
      return this.e;
   }

   @Override
   protected avg gn() {
      return avh.iy;
   }

   @Override
   public void a(aqm $$0, int $$1, boolean $$2) {
   }

   class a extends ckb.c {
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
         btc $$0 = cjk.this.p();
         double $$1 = Math.min($$0.dy(), cjk.this.dy());
         double $$2 = Math.max($$0.dy(), cjk.this.dy()) + 1.0;
         float $$3 = (float)ayg.d($$0.dC() - cjk.this.dC(), $$0.dw() - cjk.this.dw());
         if (cjk.this.g((bsh)$$0) < 9.0) {
            for (int $$4 = 0; $$4 < 5; $$4++) {
               float $$5 = $$3 + (float)$$4 * (float) Math.PI * 0.4F;
               this.a(cjk.this.dw() + (double)ayg.b($$5) * 1.5, cjk.this.dC() + (double)ayg.a($$5) * 1.5, $$1, $$2, $$5, 0);
            }

            for (int $$6 = 0; $$6 < 8; $$6++) {
               float $$7 = $$3 + (float)$$6 * (float) Math.PI * 2.0F / 8.0F + (float) (Math.PI * 2.0 / 5.0);
               this.a(cjk.this.dw() + (double)ayg.b($$7) * 2.5, cjk.this.dC() + (double)ayg.a($$7) * 2.5, $$1, $$2, $$7, 3);
            }
         } else {
            for (int $$8 = 0; $$8 < 16; $$8++) {
               double $$9 = 1.25 * (double)($$8 + 1);
               int $$10 = 1 * $$8;
               this.a(cjk.this.dw() + (double)ayg.b($$3) * $$9, cjk.this.dC() + (double)ayg.a($$3) * $$9, $$1, $$2, $$3, $$10);
            }
         }
      }

      private void a(double $$0, double $$1, double $$2, double $$3, float $$4, int $$5) {
         ja $$6 = ja.a($$0, $$3, $$1);
         boolean $$7 = false;
         double $$8 = 0.0;

         do {
            ja $$9 = $$6.d();
            dsl $$10 = cjk.this.dR().a_($$9);
            if ($$10.d(cjk.this.dR(), $$9, jf.b)) {
               if (!cjk.this.dR().u($$6)) {
                  dsl $$11 = cjk.this.dR().a_($$6);
                  exa $$12 = $$11.k(cjk.this.dR(), $$6);
                  if (!$$12.c()) {
                     $$8 = $$12.c(jf.a.b);
                  }
               }

               $$7 = true;
               break;
            }

            $$6 = $$6.d();
         } while ($$6.v() >= ayg.a($$2) - 1);

         if ($$7) {
            cjk.this.dR().b(new cmv(cjk.this.dR(), $$0, (double)$$6.v() + $$8, $$1, $$4, $$5, cjk.this));
            cjk.this.dR().a(dxh.t, new ewh($$0, (double)$$6.v() + $$8, $$1), dxh.a.a(cjk.this));
         }
      }

      @Override
      protected avg l() {
         return avh.iD;
      }

      @Override
      protected ckb.a m() {
         return ckb.a.c;
      }
   }

   class b extends ckb.b {
      @Override
      public void e() {
         if (cjk.this.p() != null) {
            cjk.this.F().a(cjk.this.p(), (float)cjk.this.ab(), (float)cjk.this.aa());
         } else if (cjk.this.gI() != null) {
            cjk.this.F().a(cjk.this.gI(), (float)cjk.this.ab(), (float)cjk.this.aa());
         }
      }
   }

   class c extends ckb.c {
      private final cdt e = cdt.b().a(16.0).d().e();

      @Override
      public boolean a() {
         if (!super.a()) {
            return false;
         } else {
            int $$0 = cjk.this.dR().a(ckf.class, this.e, cjk.this, cjk.this.cM().g(16.0)).size();
            return cjk.this.ah.a(8) + 1 > $$0;
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
         aqm $$0 = (aqm)cjk.this.dR();
         exg $$1 = cjk.this.cl();

         for (int $$2 = 0; $$2 < 3; $$2++) {
            ja $$3 = cjk.this.dr().b(-2 + cjk.this.ah.a(5), 1, -2 + cjk.this.ah.a(5));
            ckf $$4 = bsn.bi.a(cjk.this.dR());
            if ($$4 != null) {
               $$4.a($$3, 0.0F, 0.0F);
               $$4.a($$0, cjk.this.dR().d_($$3), btg.f, null);
               $$4.a(cjk.this);
               $$4.h($$3);
               $$4.b(20 * (30 + cjk.this.ah.a(90)));
               if ($$1 != null) {
                  $$0.f().a($$4.cD(), $$1);
               }

               $$0.a_($$4);
               $$0.a(dxh.t, $$3, dxh.a.a(cjk.this));
            }
         }
      }

      @Override
      protected avg l() {
         return avh.iE;
      }

      @Override
      protected ckb.a m() {
         return ckb.a.b;
      }
   }

   public class d extends ckb.c {
      private final cdt e = cdt.b().a(16.0).a($$0x -> ((cfo)$$0x).t() == csw.l);

      @Override
      public boolean a() {
         if (cjk.this.p() != null) {
            return false;
         } else if (cjk.this.gx()) {
            return false;
         } else if (cjk.this.ai < this.c) {
            return false;
         } else if (!cjk.this.dR().ab().b(dcc.c)) {
            return false;
         } else {
            List<cfo> $$0 = cjk.this.dR().a(cfo.class, this.e, cjk.this, cjk.this.cM().c(16.0, 4.0, 16.0));
            if ($$0.isEmpty()) {
               return false;
            } else {
               cjk.this.a($$0.get(cjk.this.ah.a($$0.size())));
               return true;
            }
         }
      }

      @Override
      public boolean b() {
         return cjk.this.gI() != null && this.b > 0;
      }

      @Override
      public void d() {
         super.d();
         cjk.this.a(null);
      }

      @Override
      protected void k() {
         cfo $$0 = cjk.this.gI();
         if ($$0 != null && $$0.bF()) {
            $$0.b(csw.o);
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
      protected ckb.a m() {
         return ckb.a.d;
      }
   }
}
