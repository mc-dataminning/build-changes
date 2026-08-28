import java.util.List;
import javax.annotation.Nullable;

public class cjy extends ckp {
   @Nullable
   private cgd e;

   public cjy(btc<? extends cjy> $$0, dca $$1) {
      super($$0, $$1);
      this.bN = 10;
   }

   @Override
   protected void z() {
      super.z();
      this.bS.a(0, new caj(this));
      this.bS.a(1, new cjy.b());
      this.bS.a(2, new bzw<>(this, cmz.class, 8.0F, 0.6, 1.0));
      this.bS.a(4, new cjy.c());
      this.bS.a(5, new cjy.a());
      this.bS.a(6, new cjy.d());
      this.bS.a(8, new cbm(this, 0.6));
      this.bS.a(9, new cax(this, cmz.class, 3.0F, 1.0F));
      this.bS.a(10, new cax(this, btt.class, 8.0F));
      this.bT.a(1, new cch(this, col.class).a());
      this.bT.a(2, new cci<>(this, cmz.class, true).c(300));
      this.bT.a(3, new cci<>(this, cmh.class, false).c(300));
      this.bT.a(3, new cci<>(this, cft.class, false));
   }

   public static buy.a u() {
      return ckf.gw().a(buz.r, 0.5).a(buz.k, 12.0).a(buz.q, 24.0);
   }

   @Override
   protected void a(ako.a $$0) {
      super.a($$0);
   }

   @Override
   public void a(us $$0) {
      super.a($$0);
   }

   @Override
   public avz ae_() {
      return awa.iz;
   }

   @Override
   public void b(us $$0) {
      super.b($$0);
   }

   @Override
   protected void Z() {
      super.Z();
   }

   @Override
   public boolean s(bsw $$0) {
      if ($$0 == null) {
         return false;
      } else if ($$0 == this) {
         return true;
      } else if (super.s($$0)) {
         return true;
      } else {
         return $$0 instanceof ckt $$1 ? this.s($$1.y()) : false;
      }
   }

   @Override
   protected avz v() {
      return awa.ix;
   }

   @Override
   protected avz o_() {
      return awa.iA;
   }

   @Override
   protected avz d(brp $$0) {
      return awa.iC;
   }

   void a(@Nullable cgd $$0) {
      this.e = $$0;
   }

   @Nullable
   cgd gL() {
      return this.e;
   }

   @Override
   protected avz gq() {
      return awa.iy;
   }

   @Override
   public void a(int $$0, boolean $$1) {
   }

   class a extends ckp.c {
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
         btr $$0 = cjy.this.p();
         double $$1 = Math.min($$0.dw(), cjy.this.dw());
         double $$2 = Math.max($$0.dw(), cjy.this.dw()) + 1.0;
         float $$3 = (float)ayz.d($$0.dA() - cjy.this.dA(), $$0.du() - cjy.this.du());
         if (cjy.this.g((bsw)$$0) < 9.0) {
            for (int $$4 = 0; $$4 < 5; $$4++) {
               float $$5 = $$3 + (float)$$4 * (float) Math.PI * 0.4F;
               this.a(cjy.this.du() + (double)ayz.b($$5) * 1.5, cjy.this.dA() + (double)ayz.a($$5) * 1.5, $$1, $$2, $$5, 0);
            }

            for (int $$6 = 0; $$6 < 8; $$6++) {
               float $$7 = $$3 + (float)$$6 * (float) Math.PI * 2.0F / 8.0F + (float) (Math.PI * 2.0 / 5.0);
               this.a(cjy.this.du() + (double)ayz.b($$7) * 2.5, cjy.this.dA() + (double)ayz.a($$7) * 2.5, $$1, $$2, $$7, 3);
            }
         } else {
            for (int $$8 = 0; $$8 < 16; $$8++) {
               double $$9 = 1.25 * (double)($$8 + 1);
               int $$10 = 1 * $$8;
               this.a(cjy.this.du() + (double)ayz.b($$3) * $$9, cjy.this.dA() + (double)ayz.a($$3) * $$9, $$1, $$2, $$3, $$10);
            }
         }
      }

      private void a(double $$0, double $$1, double $$2, double $$3, float $$4, int $$5) {
         iz $$6 = iz.a($$0, $$3, $$1);
         boolean $$7 = false;
         double $$8 = 0.0;

         do {
            iz $$9 = $$6.d();
            dse $$10 = cjy.this.dP().a_($$9);
            if ($$10.d(cjy.this.dP(), $$9, je.b)) {
               if (!cjy.this.dP().u($$6)) {
                  dse $$11 = cjy.this.dP().a_($$6);
                  ewm $$12 = $$11.k(cjy.this.dP(), $$6);
                  if (!$$12.c()) {
                     $$8 = $$12.c(je.a.b);
                  }
               }

               $$7 = true;
               break;
            }

            $$6 = $$6.d();
         } while ($$6.v() >= ayz.a($$2) - 1);

         if ($$7) {
            cjy.this.dP().b(new cnj(cjy.this.dP(), $$0, (double)$$6.v() + $$8, $$1, $$4, $$5, cjy.this));
            cjy.this.dP().a(dwx.t, new evt($$0, (double)$$6.v() + $$8, $$1), dwx.a.a(cjy.this));
         }
      }

      @Override
      protected avz l() {
         return awa.iD;
      }

      @Override
      protected ckp.a m() {
         return ckp.a.c;
      }
   }

   class b extends ckp.b {
      @Override
      public void e() {
         if (cjy.this.p() != null) {
            cjy.this.G().a(cjy.this.p(), (float)cjy.this.ab(), (float)cjy.this.aa());
         } else if (cjy.this.gL() != null) {
            cjy.this.G().a(cjy.this.gL(), (float)cjy.this.ab(), (float)cjy.this.aa());
         }
      }
   }

   class c extends ckp.c {
      private final cei e = cei.b().a(16.0).d().e();

      @Override
      public boolean a() {
         if (!super.a()) {
            return false;
         } else {
            int $$0 = cjy.this.dP().a(ckt.class, this.e, cjy.this, cjy.this.cK().g(16.0)).size();
            return cjy.this.ah.a(8) + 1 > $$0;
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
         arf $$0 = (arf)cjy.this.dP();
         ews $$1 = cjy.this.cj();

         for (int $$2 = 0; $$2 < 3; $$2++) {
            iz $$3 = cjy.this.dp().b(-2 + cjy.this.ah.a(5), 1, -2 + cjy.this.ah.a(5));
            ckt $$4 = btc.bi.a(cjy.this.dP());
            if ($$4 != null) {
               $$4.a($$3, 0.0F, 0.0F);
               $$4.a($$0, cjy.this.dP().d_($$3), btv.f, null);
               $$4.a(cjy.this);
               $$4.i($$3);
               $$4.b(20 * (30 + cjy.this.ah.a(90)));
               if ($$1 != null) {
                  $$0.f().a($$4.cB(), $$1);
               }

               $$0.a_($$4);
               $$0.a(dwx.t, $$3, dwx.a.a(cjy.this));
            }
         }
      }

      @Override
      protected avz l() {
         return awa.iE;
      }

      @Override
      protected ckp.a m() {
         return ckp.a.b;
      }
   }

   public class d extends ckp.c {
      private final cei e = cei.b().a(16.0).a($$0x -> ((cgd)$$0x).u() == ctk.l);

      @Override
      public boolean a() {
         if (cjy.this.p() != null) {
            return false;
         } else if (cjy.this.gA()) {
            return false;
         } else if (cjy.this.ai < this.c) {
            return false;
         } else if (!cjy.this.dP().ab().b(dbw.c)) {
            return false;
         } else {
            List<cgd> $$0 = cjy.this.dP().a(cgd.class, this.e, cjy.this, cjy.this.cK().c(16.0, 4.0, 16.0));
            if ($$0.isEmpty()) {
               return false;
            } else {
               cjy.this.a($$0.get(cjy.this.ah.a($$0.size())));
               return true;
            }
         }
      }

      @Override
      public boolean b() {
         return cjy.this.gL() != null && this.b > 0;
      }

      @Override
      public void d() {
         super.d();
         cjy.this.a(null);
      }

      @Override
      protected void k() {
         cgd $$0 = cjy.this.gL();
         if ($$0 != null && $$0.bD()) {
            $$0.b(ctk.o);
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
      protected avz l() {
         return awa.iF;
      }

      @Override
      protected ckp.a m() {
         return ckp.a.d;
      }
   }
}
