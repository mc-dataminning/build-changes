import java.util.List;
import javax.annotation.Nullable;

public class cjx extends cko {
   @Nullable
   private cgc e;

   public cjx(btb<? extends cjx> $$0, dbz $$1) {
      super($$0, $$1);
      this.bN = 10;
   }

   @Override
   protected void z() {
      super.z();
      this.bS.a(0, new cai(this));
      this.bS.a(1, new cjx.b());
      this.bS.a(2, new bzv<>(this, cmy.class, 8.0F, 0.6, 1.0));
      this.bS.a(4, new cjx.c());
      this.bS.a(5, new cjx.a());
      this.bS.a(6, new cjx.d());
      this.bS.a(8, new cbl(this, 0.6));
      this.bS.a(9, new caw(this, cmy.class, 3.0F, 1.0F));
      this.bS.a(10, new caw(this, bts.class, 8.0F));
      this.bT.a(1, new ccg(this, cok.class).a());
      this.bT.a(2, new cch<>(this, cmy.class, true).c(300));
      this.bT.a(3, new cch<>(this, cmg.class, false).c(300));
      this.bT.a(3, new cch<>(this, cfs.class, false));
   }

   public static bux.a u() {
      return cke.gw().a(buy.r, 0.5).a(buy.k, 12.0).a(buy.q, 24.0);
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
   public boolean s(bsv $$0) {
      if ($$0 == null) {
         return false;
      } else if ($$0 == this) {
         return true;
      } else if (super.s($$0)) {
         return true;
      } else {
         return $$0 instanceof cks $$1 ? this.s($$1.y()) : false;
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
   protected avz d(bro $$0) {
      return awa.iC;
   }

   void a(@Nullable cgc $$0) {
      this.e = $$0;
   }

   @Nullable
   cgc gL() {
      return this.e;
   }

   @Override
   protected avz gq() {
      return awa.iy;
   }

   @Override
   public void a(int $$0, boolean $$1) {
   }

   class a extends cko.c {
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
         btq $$0 = cjx.this.p();
         double $$1 = Math.min($$0.dw(), cjx.this.dw());
         double $$2 = Math.max($$0.dw(), cjx.this.dw()) + 1.0;
         float $$3 = (float)ayz.d($$0.dA() - cjx.this.dA(), $$0.du() - cjx.this.du());
         if (cjx.this.g((bsv)$$0) < 9.0) {
            for (int $$4 = 0; $$4 < 5; $$4++) {
               float $$5 = $$3 + (float)$$4 * (float) Math.PI * 0.4F;
               this.a(cjx.this.du() + (double)ayz.b($$5) * 1.5, cjx.this.dA() + (double)ayz.a($$5) * 1.5, $$1, $$2, $$5, 0);
            }

            for (int $$6 = 0; $$6 < 8; $$6++) {
               float $$7 = $$3 + (float)$$6 * (float) Math.PI * 2.0F / 8.0F + (float) (Math.PI * 2.0 / 5.0);
               this.a(cjx.this.du() + (double)ayz.b($$7) * 2.5, cjx.this.dA() + (double)ayz.a($$7) * 2.5, $$1, $$2, $$7, 3);
            }
         } else {
            for (int $$8 = 0; $$8 < 16; $$8++) {
               double $$9 = 1.25 * (double)($$8 + 1);
               int $$10 = 1 * $$8;
               this.a(cjx.this.du() + (double)ayz.b($$3) * $$9, cjx.this.dA() + (double)ayz.a($$3) * $$9, $$1, $$2, $$3, $$10);
            }
         }
      }

      private void a(double $$0, double $$1, double $$2, double $$3, float $$4, int $$5) {
         iz $$6 = iz.a($$0, $$3, $$1);
         boolean $$7 = false;
         double $$8 = 0.0;

         do {
            iz $$9 = $$6.d();
            dsd $$10 = cjx.this.dP().a_($$9);
            if ($$10.d(cjx.this.dP(), $$9, je.b)) {
               if (!cjx.this.dP().u($$6)) {
                  dsd $$11 = cjx.this.dP().a_($$6);
                  ewl $$12 = $$11.k(cjx.this.dP(), $$6);
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
            cjx.this.dP().b(new cni(cjx.this.dP(), $$0, (double)$$6.v() + $$8, $$1, $$4, $$5, cjx.this));
            cjx.this.dP().a(dww.t, new evs($$0, (double)$$6.v() + $$8, $$1), dww.a.a(cjx.this));
         }
      }

      @Override
      protected avz l() {
         return awa.iD;
      }

      @Override
      protected cko.a m() {
         return cko.a.c;
      }
   }

   class b extends cko.b {
      @Override
      public void e() {
         if (cjx.this.p() != null) {
            cjx.this.G().a(cjx.this.p(), (float)cjx.this.ab(), (float)cjx.this.aa());
         } else if (cjx.this.gL() != null) {
            cjx.this.G().a(cjx.this.gL(), (float)cjx.this.ab(), (float)cjx.this.aa());
         }
      }
   }

   class c extends cko.c {
      private final ceh e = ceh.b().a(16.0).d().e();

      @Override
      public boolean a() {
         if (!super.a()) {
            return false;
         } else {
            int $$0 = cjx.this.dP().a(cks.class, this.e, cjx.this, cjx.this.cK().g(16.0)).size();
            return cjx.this.ah.a(8) + 1 > $$0;
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
         arf $$0 = (arf)cjx.this.dP();
         ewr $$1 = cjx.this.cj();

         for (int $$2 = 0; $$2 < 3; $$2++) {
            iz $$3 = cjx.this.dp().b(-2 + cjx.this.ah.a(5), 1, -2 + cjx.this.ah.a(5));
            cks $$4 = btb.bi.a(cjx.this.dP());
            if ($$4 != null) {
               $$4.a($$3, 0.0F, 0.0F);
               $$4.a($$0, cjx.this.dP().d_($$3), btu.f, null);
               $$4.a(cjx.this);
               $$4.i($$3);
               $$4.b(20 * (30 + cjx.this.ah.a(90)));
               if ($$1 != null) {
                  $$0.f().a($$4.cB(), $$1);
               }

               $$0.a_($$4);
               $$0.a(dww.t, $$3, dww.a.a(cjx.this));
            }
         }
      }

      @Override
      protected avz l() {
         return awa.iE;
      }

      @Override
      protected cko.a m() {
         return cko.a.b;
      }
   }

   public class d extends cko.c {
      private final ceh e = ceh.b().a(16.0).a($$0x -> ((cgc)$$0x).u() == ctj.l);

      @Override
      public boolean a() {
         if (cjx.this.p() != null) {
            return false;
         } else if (cjx.this.gA()) {
            return false;
         } else if (cjx.this.ai < this.c) {
            return false;
         } else if (!cjx.this.dP().ab().b(dbv.c)) {
            return false;
         } else {
            List<cgc> $$0 = cjx.this.dP().a(cgc.class, this.e, cjx.this, cjx.this.cK().c(16.0, 4.0, 16.0));
            if ($$0.isEmpty()) {
               return false;
            } else {
               cjx.this.a($$0.get(cjx.this.ah.a($$0.size())));
               return true;
            }
         }
      }

      @Override
      public boolean b() {
         return cjx.this.gL() != null && this.b > 0;
      }

      @Override
      public void d() {
         super.d();
         cjx.this.a(null);
      }

      @Override
      protected void k() {
         cgc $$0 = cjx.this.gL();
         if ($$0 != null && $$0.bD()) {
            $$0.b(ctj.o);
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
      protected cko.a m() {
         return cko.a.d;
      }
   }
}
