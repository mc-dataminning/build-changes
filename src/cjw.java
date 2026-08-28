import java.util.List;
import javax.annotation.Nullable;

public class cjw extends ckn {
   @Nullable
   private cgb e;

   public cjw(bta<? extends cjw> $$0, dby $$1) {
      super($$0, $$1);
      this.bN = 10;
   }

   @Override
   protected void z() {
      super.z();
      this.bS.a(0, new cah(this));
      this.bS.a(1, new cjw.b());
      this.bS.a(2, new bzu<>(this, cmx.class, 8.0F, 0.6, 1.0));
      this.bS.a(4, new cjw.c());
      this.bS.a(5, new cjw.a());
      this.bS.a(6, new cjw.d());
      this.bS.a(8, new cbk(this, 0.6));
      this.bS.a(9, new cav(this, cmx.class, 3.0F, 1.0F));
      this.bS.a(10, new cav(this, btr.class, 8.0F));
      this.bT.a(1, new ccf(this, coj.class).a());
      this.bT.a(2, new ccg<>(this, cmx.class, true).c(300));
      this.bT.a(3, new ccg<>(this, cmf.class, false).c(300));
      this.bT.a(3, new ccg<>(this, cfr.class, false));
   }

   public static buw.a u() {
      return ckd.gw().a(bux.r, 0.5).a(bux.k, 12.0).a(bux.q, 24.0);
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
   public boolean s(bsu $$0) {
      if ($$0 == null) {
         return false;
      } else if ($$0 == this) {
         return true;
      } else if (super.s($$0)) {
         return true;
      } else {
         return $$0 instanceof ckr $$1 ? this.s($$1.y()) : false;
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
   protected avz d(brn $$0) {
      return awa.iC;
   }

   void a(@Nullable cgb $$0) {
      this.e = $$0;
   }

   @Nullable
   cgb gL() {
      return this.e;
   }

   @Override
   protected avz gq() {
      return awa.iy;
   }

   @Override
   public void a(int $$0, boolean $$1) {
   }

   class a extends ckn.c {
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
         btp $$0 = cjw.this.p();
         double $$1 = Math.min($$0.dw(), cjw.this.dw());
         double $$2 = Math.max($$0.dw(), cjw.this.dw()) + 1.0;
         float $$3 = (float)ayz.d($$0.dA() - cjw.this.dA(), $$0.du() - cjw.this.du());
         if (cjw.this.g((bsu)$$0) < 9.0) {
            for (int $$4 = 0; $$4 < 5; $$4++) {
               float $$5 = $$3 + (float)$$4 * (float) Math.PI * 0.4F;
               this.a(cjw.this.du() + (double)ayz.b($$5) * 1.5, cjw.this.dA() + (double)ayz.a($$5) * 1.5, $$1, $$2, $$5, 0);
            }

            for (int $$6 = 0; $$6 < 8; $$6++) {
               float $$7 = $$3 + (float)$$6 * (float) Math.PI * 2.0F / 8.0F + (float) (Math.PI * 2.0 / 5.0);
               this.a(cjw.this.du() + (double)ayz.b($$7) * 2.5, cjw.this.dA() + (double)ayz.a($$7) * 2.5, $$1, $$2, $$7, 3);
            }
         } else {
            for (int $$8 = 0; $$8 < 16; $$8++) {
               double $$9 = 1.25 * (double)($$8 + 1);
               int $$10 = 1 * $$8;
               this.a(cjw.this.du() + (double)ayz.b($$3) * $$9, cjw.this.dA() + (double)ayz.a($$3) * $$9, $$1, $$2, $$3, $$10);
            }
         }
      }

      private void a(double $$0, double $$1, double $$2, double $$3, float $$4, int $$5) {
         iz $$6 = iz.a($$0, $$3, $$1);
         boolean $$7 = false;
         double $$8 = 0.0;

         do {
            iz $$9 = $$6.d();
            dsc $$10 = cjw.this.dP().a_($$9);
            if ($$10.d(cjw.this.dP(), $$9, je.b)) {
               if (!cjw.this.dP().u($$6)) {
                  dsc $$11 = cjw.this.dP().a_($$6);
                  ewk $$12 = $$11.k(cjw.this.dP(), $$6);
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
            cjw.this.dP().b(new cnh(cjw.this.dP(), $$0, (double)$$6.v() + $$8, $$1, $$4, $$5, cjw.this));
            cjw.this.dP().a(dwv.t, new evr($$0, (double)$$6.v() + $$8, $$1), dwv.a.a(cjw.this));
         }
      }

      @Override
      protected avz l() {
         return awa.iD;
      }

      @Override
      protected ckn.a m() {
         return ckn.a.c;
      }
   }

   class b extends ckn.b {
      @Override
      public void e() {
         if (cjw.this.p() != null) {
            cjw.this.G().a(cjw.this.p(), (float)cjw.this.ab(), (float)cjw.this.aa());
         } else if (cjw.this.gL() != null) {
            cjw.this.G().a(cjw.this.gL(), (float)cjw.this.ab(), (float)cjw.this.aa());
         }
      }
   }

   class c extends ckn.c {
      private final ceg e = ceg.b().a(16.0).d().e();

      @Override
      public boolean a() {
         if (!super.a()) {
            return false;
         } else {
            int $$0 = cjw.this.dP().a(ckr.class, this.e, cjw.this, cjw.this.cK().g(16.0)).size();
            return cjw.this.ah.a(8) + 1 > $$0;
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
         arf $$0 = (arf)cjw.this.dP();
         ewq $$1 = cjw.this.cj();

         for (int $$2 = 0; $$2 < 3; $$2++) {
            iz $$3 = cjw.this.dp().b(-2 + cjw.this.ah.a(5), 1, -2 + cjw.this.ah.a(5));
            ckr $$4 = bta.bi.a(cjw.this.dP());
            if ($$4 != null) {
               $$4.a($$3, 0.0F, 0.0F);
               $$4.a($$0, cjw.this.dP().d_($$3), btt.f, null);
               $$4.a(cjw.this);
               $$4.i($$3);
               $$4.b(20 * (30 + cjw.this.ah.a(90)));
               if ($$1 != null) {
                  $$0.f().a($$4.cB(), $$1);
               }

               $$0.a_($$4);
               $$0.a(dwv.t, $$3, dwv.a.a(cjw.this));
            }
         }
      }

      @Override
      protected avz l() {
         return awa.iE;
      }

      @Override
      protected ckn.a m() {
         return ckn.a.b;
      }
   }

   public class d extends ckn.c {
      private final ceg e = ceg.b().a(16.0).a($$0x -> ((cgb)$$0x).u() == cti.l);

      @Override
      public boolean a() {
         if (cjw.this.p() != null) {
            return false;
         } else if (cjw.this.gA()) {
            return false;
         } else if (cjw.this.ai < this.c) {
            return false;
         } else if (!cjw.this.dP().ab().b(dbu.c)) {
            return false;
         } else {
            List<cgb> $$0 = cjw.this.dP().a(cgb.class, this.e, cjw.this, cjw.this.cK().c(16.0, 4.0, 16.0));
            if ($$0.isEmpty()) {
               return false;
            } else {
               cjw.this.a($$0.get(cjw.this.ah.a($$0.size())));
               return true;
            }
         }
      }

      @Override
      public boolean b() {
         return cjw.this.gL() != null && this.b > 0;
      }

      @Override
      public void d() {
         super.d();
         cjw.this.a(null);
      }

      @Override
      protected void k() {
         cgb $$0 = cjw.this.gL();
         if ($$0 != null && $$0.bD()) {
            $$0.b(cti.o);
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
      protected ckn.a m() {
         return ckn.a.d;
      }
   }
}
