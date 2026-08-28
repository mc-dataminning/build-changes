import java.util.List;
import javax.annotation.Nullable;

public class cjv extends ckm {
   @Nullable
   private cga e;

   public cjv(bsz<? extends cjv> $$0, dbx $$1) {
      super($$0, $$1);
      this.bN = 10;
   }

   @Override
   protected void z() {
      super.z();
      this.bS.a(0, new cag(this));
      this.bS.a(1, new cjv.b());
      this.bS.a(2, new bzt<>(this, cmw.class, 8.0F, 0.6, 1.0));
      this.bS.a(4, new cjv.c());
      this.bS.a(5, new cjv.a());
      this.bS.a(6, new cjv.d());
      this.bS.a(8, new cbj(this, 0.6));
      this.bS.a(9, new cau(this, cmw.class, 3.0F, 1.0F));
      this.bS.a(10, new cau(this, btq.class, 8.0F));
      this.bT.a(1, new cce(this, coi.class).a());
      this.bT.a(2, new ccf<>(this, cmw.class, true).c(300));
      this.bT.a(3, new ccf<>(this, cme.class, false).c(300));
      this.bT.a(3, new ccf<>(this, cfq.class, false));
   }

   public static buv.a u() {
      return ckc.gw().a(buw.r, 0.5).a(buw.k, 12.0).a(buw.q, 24.0);
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
   }

   @Override
   public void a(ur $$0) {
      super.a($$0);
   }

   @Override
   public avy ae_() {
      return avz.iz;
   }

   @Override
   public void b(ur $$0) {
      super.b($$0);
   }

   @Override
   protected void Z() {
      super.Z();
   }

   @Override
   public boolean s(bst $$0) {
      if ($$0 == null) {
         return false;
      } else if ($$0 == this) {
         return true;
      } else if (super.s($$0)) {
         return true;
      } else {
         return $$0 instanceof ckq $$1 ? this.s($$1.y()) : false;
      }
   }

   @Override
   protected avy v() {
      return avz.ix;
   }

   @Override
   protected avy o_() {
      return avz.iA;
   }

   @Override
   protected avy d(brm $$0) {
      return avz.iC;
   }

   void a(@Nullable cga $$0) {
      this.e = $$0;
   }

   @Nullable
   cga gL() {
      return this.e;
   }

   @Override
   protected avy gq() {
      return avz.iy;
   }

   @Override
   public void a(int $$0, boolean $$1) {
   }

   class a extends ckm.c {
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
         bto $$0 = cjv.this.p();
         double $$1 = Math.min($$0.dw(), cjv.this.dw());
         double $$2 = Math.max($$0.dw(), cjv.this.dw()) + 1.0;
         float $$3 = (float)ayy.d($$0.dA() - cjv.this.dA(), $$0.du() - cjv.this.du());
         if (cjv.this.g((bst)$$0) < 9.0) {
            for (int $$4 = 0; $$4 < 5; $$4++) {
               float $$5 = $$3 + (float)$$4 * (float) Math.PI * 0.4F;
               this.a(cjv.this.du() + (double)ayy.b($$5) * 1.5, cjv.this.dA() + (double)ayy.a($$5) * 1.5, $$1, $$2, $$5, 0);
            }

            for (int $$6 = 0; $$6 < 8; $$6++) {
               float $$7 = $$3 + (float)$$6 * (float) Math.PI * 2.0F / 8.0F + (float) (Math.PI * 2.0 / 5.0);
               this.a(cjv.this.du() + (double)ayy.b($$7) * 2.5, cjv.this.dA() + (double)ayy.a($$7) * 2.5, $$1, $$2, $$7, 3);
            }
         } else {
            for (int $$8 = 0; $$8 < 16; $$8++) {
               double $$9 = 1.25 * (double)($$8 + 1);
               int $$10 = 1 * $$8;
               this.a(cjv.this.du() + (double)ayy.b($$3) * $$9, cjv.this.dA() + (double)ayy.a($$3) * $$9, $$1, $$2, $$3, $$10);
            }
         }
      }

      private void a(double $$0, double $$1, double $$2, double $$3, float $$4, int $$5) {
         iz $$6 = iz.a($$0, $$3, $$1);
         boolean $$7 = false;
         double $$8 = 0.0;

         do {
            iz $$9 = $$6.d();
            dsb $$10 = cjv.this.dP().a_($$9);
            if ($$10.d(cjv.this.dP(), $$9, je.b)) {
               if (!cjv.this.dP().u($$6)) {
                  dsb $$11 = cjv.this.dP().a_($$6);
                  ewj $$12 = $$11.k(cjv.this.dP(), $$6);
                  if (!$$12.c()) {
                     $$8 = $$12.c(je.a.b);
                  }
               }

               $$7 = true;
               break;
            }

            $$6 = $$6.d();
         } while ($$6.v() >= ayy.a($$2) - 1);

         if ($$7) {
            cjv.this.dP().b(new cng(cjv.this.dP(), $$0, (double)$$6.v() + $$8, $$1, $$4, $$5, cjv.this));
            cjv.this.dP().a(dwu.t, new evq($$0, (double)$$6.v() + $$8, $$1), dwu.a.a(cjv.this));
         }
      }

      @Override
      protected avy l() {
         return avz.iD;
      }

      @Override
      protected ckm.a m() {
         return ckm.a.c;
      }
   }

   class b extends ckm.b {
      @Override
      public void e() {
         if (cjv.this.p() != null) {
            cjv.this.G().a(cjv.this.p(), (float)cjv.this.ab(), (float)cjv.this.aa());
         } else if (cjv.this.gL() != null) {
            cjv.this.G().a(cjv.this.gL(), (float)cjv.this.ab(), (float)cjv.this.aa());
         }
      }
   }

   class c extends ckm.c {
      private final cef e = cef.b().a(16.0).d().e();

      @Override
      public boolean a() {
         if (!super.a()) {
            return false;
         } else {
            int $$0 = cjv.this.dP().a(ckq.class, this.e, cjv.this, cjv.this.cK().g(16.0)).size();
            return cjv.this.ah.a(8) + 1 > $$0;
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
         are $$0 = (are)cjv.this.dP();
         ewp $$1 = cjv.this.cj();

         for (int $$2 = 0; $$2 < 3; $$2++) {
            iz $$3 = cjv.this.dp().b(-2 + cjv.this.ah.a(5), 1, -2 + cjv.this.ah.a(5));
            ckq $$4 = bsz.bi.a(cjv.this.dP());
            if ($$4 != null) {
               $$4.a($$3, 0.0F, 0.0F);
               $$4.a($$0, cjv.this.dP().d_($$3), bts.f, null);
               $$4.a(cjv.this);
               $$4.i($$3);
               $$4.b(20 * (30 + cjv.this.ah.a(90)));
               if ($$1 != null) {
                  $$0.f().a($$4.cB(), $$1);
               }

               $$0.a_($$4);
               $$0.a(dwu.t, $$3, dwu.a.a(cjv.this));
            }
         }
      }

      @Override
      protected avy l() {
         return avz.iE;
      }

      @Override
      protected ckm.a m() {
         return ckm.a.b;
      }
   }

   public class d extends ckm.c {
      private final cef e = cef.b().a(16.0).a($$0x -> ((cga)$$0x).u() == cth.l);

      @Override
      public boolean a() {
         if (cjv.this.p() != null) {
            return false;
         } else if (cjv.this.gA()) {
            return false;
         } else if (cjv.this.ai < this.c) {
            return false;
         } else if (!cjv.this.dP().ab().b(dbt.c)) {
            return false;
         } else {
            List<cga> $$0 = cjv.this.dP().a(cga.class, this.e, cjv.this, cjv.this.cK().c(16.0, 4.0, 16.0));
            if ($$0.isEmpty()) {
               return false;
            } else {
               cjv.this.a($$0.get(cjv.this.ah.a($$0.size())));
               return true;
            }
         }
      }

      @Override
      public boolean b() {
         return cjv.this.gL() != null && this.b > 0;
      }

      @Override
      public void d() {
         super.d();
         cjv.this.a(null);
      }

      @Override
      protected void k() {
         cga $$0 = cjv.this.gL();
         if ($$0 != null && $$0.bD()) {
            $$0.b(cth.o);
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
      protected avy l() {
         return avz.iF;
      }

      @Override
      protected ckm.a m() {
         return ckm.a.d;
      }
   }
}
