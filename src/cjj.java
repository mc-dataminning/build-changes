import java.util.List;
import javax.annotation.Nullable;

public class cjj extends cka {
   @Nullable
   private cfn e;

   public cjj(bsm<? extends cjj> $$0, dcf $$1) {
      super($$0, $$1);
      this.bP = 10;
   }

   @Override
   protected void z() {
      super.z();
      this.bU.a(0, new bzt(this));
      this.bU.a(1, new cjj.b());
      this.bU.a(2, new bzg<>(this, cmk.class, 8.0F, 0.6, 1.0));
      this.bU.a(4, new cjj.c());
      this.bU.a(5, new cjj.a());
      this.bU.a(6, new cjj.d());
      this.bU.a(8, new caw(this, 0.6));
      this.bU.a(9, new cah(this, cmk.class, 3.0F, 1.0F));
      this.bU.a(10, new cah(this, btd.class, 8.0F));
      this.bV.a(1, new cbr(this, cnw.class).a());
      this.bV.a(2, new cbs<>(this, cmk.class, true).c(300));
      this.bV.a(3, new cbs<>(this, cls.class, false).c(300));
      this.bV.a(3, new cbs<>(this, cfd.class, false));
   }

   public static bui.a u() {
      return cjq.gu().a(buj.v, 0.5).a(buj.m, 12.0).a(buj.s, 24.0);
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
   public boolean s(bsg $$0) {
      if ($$0 == null) {
         return false;
      } else if ($$0 == this) {
         return true;
      } else if (super.s($$0)) {
         return true;
      } else {
         return $$0 instanceof cke $$1 ? this.s($$1.y()) : false;
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
   protected avg d(bqz $$0) {
      return avh.iC;
   }

   void a(@Nullable cfn $$0) {
      this.e = $$0;
   }

   @Nullable
   cfn gJ() {
      return this.e;
   }

   @Override
   protected avg go() {
      return avh.iy;
   }

   @Override
   public void a(int $$0, boolean $$1) {
   }

   class a extends cka.c {
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
         btb $$0 = cjj.this.p();
         double $$1 = Math.min($$0.dx(), cjj.this.dx());
         double $$2 = Math.max($$0.dx(), cjj.this.dx()) + 1.0;
         float $$3 = (float)ayg.d($$0.dB() - cjj.this.dB(), $$0.dv() - cjj.this.dv());
         if (cjj.this.g((bsg)$$0) < 9.0) {
            for (int $$4 = 0; $$4 < 5; $$4++) {
               float $$5 = $$3 + (float)$$4 * (float) Math.PI * 0.4F;
               this.a(cjj.this.dv() + (double)ayg.b($$5) * 1.5, cjj.this.dB() + (double)ayg.a($$5) * 1.5, $$1, $$2, $$5, 0);
            }

            for (int $$6 = 0; $$6 < 8; $$6++) {
               float $$7 = $$3 + (float)$$6 * (float) Math.PI * 2.0F / 8.0F + (float) (Math.PI * 2.0 / 5.0);
               this.a(cjj.this.dv() + (double)ayg.b($$7) * 2.5, cjj.this.dB() + (double)ayg.a($$7) * 2.5, $$1, $$2, $$7, 3);
            }
         } else {
            for (int $$8 = 0; $$8 < 16; $$8++) {
               double $$9 = 1.25 * (double)($$8 + 1);
               int $$10 = 1 * $$8;
               this.a(cjj.this.dv() + (double)ayg.b($$3) * $$9, cjj.this.dB() + (double)ayg.a($$3) * $$9, $$1, $$2, $$3, $$10);
            }
         }
      }

      private void a(double $$0, double $$1, double $$2, double $$3, float $$4, int $$5) {
         ja $$6 = ja.a($$0, $$3, $$1);
         boolean $$7 = false;
         double $$8 = 0.0;

         do {
            ja $$9 = $$6.d();
            dsk $$10 = cjj.this.dQ().a_($$9);
            if ($$10.d(cjj.this.dQ(), $$9, jf.b)) {
               if (!cjj.this.dQ().u($$6)) {
                  dsk $$11 = cjj.this.dQ().a_($$6);
                  ewy $$12 = $$11.k(cjj.this.dQ(), $$6);
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
            cjj.this.dQ().b(new cmu(cjj.this.dQ(), $$0, (double)$$6.v() + $$8, $$1, $$4, $$5, cjj.this));
            cjj.this.dQ().a(dxg.t, new ewf($$0, (double)$$6.v() + $$8, $$1), dxg.a.a(cjj.this));
         }
      }

      @Override
      protected avg l() {
         return avh.iD;
      }

      @Override
      protected cka.a m() {
         return cka.a.c;
      }
   }

   class b extends cka.b {
      @Override
      public void e() {
         if (cjj.this.p() != null) {
            cjj.this.G().a(cjj.this.p(), (float)cjj.this.ab(), (float)cjj.this.aa());
         } else if (cjj.this.gJ() != null) {
            cjj.this.G().a(cjj.this.gJ(), (float)cjj.this.ab(), (float)cjj.this.aa());
         }
      }
   }

   class c extends cka.c {
      private final cds e = cds.b().a(16.0).d().e();

      @Override
      public boolean a() {
         if (!super.a()) {
            return false;
         } else {
            int $$0 = cjj.this.dQ().a(cke.class, this.e, cjj.this, cjj.this.cL().g(16.0)).size();
            return cjj.this.ah.a(8) + 1 > $$0;
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
         aqm $$0 = (aqm)cjj.this.dQ();
         exe $$1 = cjj.this.ck();

         for (int $$2 = 0; $$2 < 3; $$2++) {
            ja $$3 = cjj.this.dq().b(-2 + cjj.this.ah.a(5), 1, -2 + cjj.this.ah.a(5));
            cke $$4 = bsm.bi.a(cjj.this.dQ());
            if ($$4 != null) {
               $$4.a($$3, 0.0F, 0.0F);
               $$4.a($$0, cjj.this.dQ().d_($$3), btf.f, null);
               $$4.a(cjj.this);
               $$4.h($$3);
               $$4.b(20 * (30 + cjj.this.ah.a(90)));
               if ($$1 != null) {
                  $$0.f().a($$4.cC(), $$1);
               }

               $$0.a_($$4);
               $$0.a(dxg.t, $$3, dxg.a.a(cjj.this));
            }
         }
      }

      @Override
      protected avg l() {
         return avh.iE;
      }

      @Override
      protected cka.a m() {
         return cka.a.b;
      }
   }

   public class d extends cka.c {
      private final cds e = cds.b().a(16.0).a($$0x -> ((cfn)$$0x).u() == csv.l);

      @Override
      public boolean a() {
         if (cjj.this.p() != null) {
            return false;
         } else if (cjj.this.gy()) {
            return false;
         } else if (cjj.this.ai < this.c) {
            return false;
         } else if (!cjj.this.dQ().ab().b(dcb.c)) {
            return false;
         } else {
            List<cfn> $$0 = cjj.this.dQ().a(cfn.class, this.e, cjj.this, cjj.this.cL().c(16.0, 4.0, 16.0));
            if ($$0.isEmpty()) {
               return false;
            } else {
               cjj.this.a($$0.get(cjj.this.ah.a($$0.size())));
               return true;
            }
         }
      }

      @Override
      public boolean b() {
         return cjj.this.gJ() != null && this.b > 0;
      }

      @Override
      public void d() {
         super.d();
         cjj.this.a(null);
      }

      @Override
      protected void k() {
         cfn $$0 = cjj.this.gJ();
         if ($$0 != null && $$0.bE()) {
            $$0.b(csv.o);
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
      protected cka.a m() {
         return cka.a.d;
      }
   }
}
