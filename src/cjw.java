import java.util.List;
import javax.annotation.Nullable;

public class cjw extends ckn {
   @Nullable
   private cga e;

   public cjw(bsx<? extends cjw> $$0, dcw $$1) {
      super($$0, $$1);
      this.bP = 10;
   }

   @Override
   protected void B() {
      super.B();
      this.bU.a(0, new cag(this));
      this.bU.a(1, new cjw.b());
      this.bU.a(2, new bzt<>(this, cmx.class, 8.0F, 0.6, 1.0));
      this.bU.a(4, new cjw.c());
      this.bU.a(5, new cjw.a());
      this.bU.a(6, new cjw.d());
      this.bU.a(8, new cbj(this, 0.6));
      this.bU.a(9, new cau(this, cmx.class, 3.0F, 1.0F));
      this.bU.a(10, new cau(this, btp.class, 8.0F));
      this.bV.a(1, new cce(this, coj.class).a());
      this.bV.a(2, new ccf<>(this, cmx.class, true).c(300));
      this.bV.a(3, new ccf<>(this, cmf.class, false).c(300));
      this.bV.a(3, new ccf<>(this, cfq.class, false));
   }

   public static buv.a t() {
      return ckd.gq().a(buw.v, 0.5).a(buw.m, 12.0).a(buw.s, 24.0);
   }

   @Override
   protected void a(aka.a $$0) {
      super.a($$0);
   }

   @Override
   public void a(ub $$0) {
      super.a($$0);
   }

   @Override
   public avo ai_() {
      return avp.iz;
   }

   @Override
   public void b(ub $$0) {
      super.b($$0);
   }

   @Override
   protected void ab() {
      super.ab();
   }

   @Override
   public boolean s(bsr $$0) {
      if ($$0 == null) {
         return false;
      } else if ($$0 == this) {
         return true;
      } else if (super.s($$0)) {
         return true;
      } else {
         return $$0 instanceof ckr $$1 ? this.s($$1.x()) : false;
      }
   }

   @Override
   protected avo v() {
      return avp.ix;
   }

   @Override
   protected avo n_() {
      return avp.iA;
   }

   @Override
   protected avo d(brk $$0) {
      return avp.iC;
   }

   void a(@Nullable cga $$0) {
      this.e = $$0;
   }

   @Nullable
   cga gF() {
      return this.e;
   }

   @Override
   protected avo gk() {
      return avp.iy;
   }

   @Override
   public void a(aqu $$0, int $$1, boolean $$2) {
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
         btn $$0 = cjw.this.p();
         double $$1 = Math.min($$0.dv(), cjw.this.dv());
         double $$2 = Math.max($$0.dv(), cjw.this.dv()) + 1.0;
         float $$3 = (float)ayo.d($$0.dz() - cjw.this.dz(), $$0.dt() - cjw.this.dt());
         if (cjw.this.g((bsr)$$0) < 9.0) {
            for (int $$4 = 0; $$4 < 5; $$4++) {
               float $$5 = $$3 + (float)$$4 * (float) Math.PI * 0.4F;
               this.a(cjw.this.dt() + (double)ayo.b($$5) * 1.5, cjw.this.dz() + (double)ayo.a($$5) * 1.5, $$1, $$2, $$5, 0);
            }

            for (int $$6 = 0; $$6 < 8; $$6++) {
               float $$7 = $$3 + (float)$$6 * (float) Math.PI * 2.0F / 8.0F + (float) (Math.PI * 2.0 / 5.0);
               this.a(cjw.this.dt() + (double)ayo.b($$7) * 2.5, cjw.this.dz() + (double)ayo.a($$7) * 2.5, $$1, $$2, $$7, 3);
            }
         } else {
            for (int $$8 = 0; $$8 < 16; $$8++) {
               double $$9 = 1.25 * (double)($$8 + 1);
               int $$10 = 1 * $$8;
               this.a(cjw.this.dt() + (double)ayo.b($$3) * $$9, cjw.this.dz() + (double)ayo.a($$3) * $$9, $$1, $$2, $$3, $$10);
            }
         }
      }

      private void a(double $$0, double $$1, double $$2, double $$3, float $$4, int $$5) {
         jd $$6 = jd.a($$0, $$3, $$1);
         boolean $$7 = false;
         double $$8 = 0.0;

         do {
            jd $$9 = $$6.e();
            dtc $$10 = cjw.this.dO().a_($$9);
            if ($$10.d(cjw.this.dO(), $$9, ji.b)) {
               if (!cjw.this.dO().u($$6)) {
                  dtc $$11 = cjw.this.dO().a_($$6);
                  exv $$12 = $$11.k(cjw.this.dO(), $$6);
                  if (!$$12.c()) {
                     $$8 = $$12.c(ji.a.b);
                  }
               }

               $$7 = true;
               break;
            }

            $$6 = $$6.e();
         } while ($$6.v() >= ayo.a($$2) - 1);

         if ($$7) {
            cjw.this.dO().b(new cnh(cjw.this.dO(), $$0, (double)$$6.v() + $$8, $$1, $$4, $$5, cjw.this));
            cjw.this.dO().a(dxz.t, new exc($$0, (double)$$6.v() + $$8, $$1), dxz.a.a(cjw.this));
         }
      }

      @Override
      protected avo l() {
         return avp.iD;
      }

      @Override
      protected ckn.a m() {
         return ckn.a.c;
      }
   }

   class b extends ckn.b {
      @Override
      public void a() {
         if (cjw.this.p() != null) {
            cjw.this.I().a(cjw.this.p(), (float)cjw.this.ae(), (float)cjw.this.ac());
         } else if (cjw.this.gF() != null) {
            cjw.this.I().a(cjw.this.gF(), (float)cjw.this.ae(), (float)cjw.this.ac());
         }
      }
   }

   class c extends ckn.c {
      private final cef e = cef.b().a(16.0).d().e();

      @Override
      public boolean b() {
         if (!super.b()) {
            return false;
         } else {
            int $$0 = cjw.this.dO().a(ckr.class, this.e, cjw.this, cjw.this.cK().g(16.0)).size();
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
         aqu $$0 = (aqu)cjw.this.dO();
         eyb $$1 = cjw.this.ck();

         for (int $$2 = 0; $$2 < 3; $$2++) {
            jd $$3 = cjw.this.do().b(-2 + cjw.this.ah.a(5), 1, -2 + cjw.this.ah.a(5));
            ckr $$4 = bsx.bi.a(cjw.this.dO());
            if ($$4 != null) {
               $$4.a($$3, 0.0F, 0.0F);
               $$4.a($$0, cjw.this.dO().d_($$3), btr.f, null);
               $$4.a(cjw.this);
               $$4.h($$3);
               $$4.b(20 * (30 + cjw.this.ah.a(90)));
               if ($$1 != null) {
                  $$0.f().a($$4.cB(), $$1);
               }

               $$0.a_($$4);
               $$0.a(dxz.t, $$3, dxz.a.a(cjw.this));
            }
         }
      }

      @Override
      protected avo l() {
         return avp.iE;
      }

      @Override
      protected ckn.a m() {
         return ckn.a.b;
      }
   }

   public class d extends ckn.c {
      private final cef e = cef.b().a(16.0).a($$0x -> ((cga)$$0x).t() == cti.l);

      @Override
      public boolean b() {
         if (cjw.this.p() != null) {
            return false;
         } else if (cjw.this.gu()) {
            return false;
         } else if (cjw.this.ai < this.c) {
            return false;
         } else if (!cjw.this.dO().ab().b(dcs.c)) {
            return false;
         } else {
            List<cga> $$0 = cjw.this.dO().a(cga.class, this.e, cjw.this, cjw.this.cK().c(16.0, 4.0, 16.0));
            if ($$0.isEmpty()) {
               return false;
            } else {
               cjw.this.a($$0.get(cjw.this.ah.a($$0.size())));
               return true;
            }
         }
      }

      @Override
      public boolean c() {
         return cjw.this.gF() != null && this.b > 0;
      }

      @Override
      public void e() {
         super.e();
         cjw.this.a(null);
      }

      @Override
      protected void k() {
         cga $$0 = cjw.this.gF();
         if ($$0 != null && $$0.bE()) {
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
      protected avo l() {
         return avp.iF;
      }

      @Override
      protected ckn.a m() {
         return ckn.a.d;
      }
   }
}
