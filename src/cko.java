import java.util.List;
import javax.annotation.Nullable;

public class cko extends clf {
   @Nullable
   private cgr b;

   public cko(btq<? extends cko> $$0, dds $$1) {
      super($$0, $$1);
      this.bO = 10;
   }

   @Override
   protected void D() {
      super.D();
      this.bT.a(0, new caw(this));
      this.bT.a(1, new cko.b());
      this.bT.a(2, new caj<>(this, cnp.class, 8.0F, 0.6, 1.0));
      this.bT.a(4, new cko.c());
      this.bT.a(5, new cko.a());
      this.bT.a(6, new cko.d());
      this.bT.a(8, new cbz(this, 0.6));
      this.bT.a(9, new cbk(this, cnp.class, 3.0F, 1.0F));
      this.bT.a(10, new cbk(this, buh.class, 8.0F));
      this.bU.a(1, new ccu(this, cpd.class).a());
      this.bU.a(2, new ccv<>(this, cnp.class, true).c(300));
      this.bU.a(3, new ccv<>(this, cmx.class, false).c(300));
      this.bU.a(3, new ccv<>(this, cgh.class, false));
   }

   public static bvl.a t() {
      return ckv.gu().a(bvm.v, 0.5).a(bvm.m, 12.0).a(bvm.s, 24.0);
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
   }

   @Override
   public void a(uf $$0) {
      super.a($$0);
   }

   @Override
   public awc ah_() {
      return awd.iA;
   }

   @Override
   public void b(uf $$0) {
      super.b($$0);
   }

   @Override
   protected void ad() {
      super.ad();
   }

   @Override
   protected boolean t(btj $$0) {
      if ($$0 == this) {
         return true;
      } else if (super.t($$0)) {
         return true;
      } else {
         if ($$0 instanceof clj $$1 && $$1.t() != null) {
            return this.t($$1.t());
         }

         return false;
      }
   }

   @Override
   protected awc w() {
      return awd.iy;
   }

   @Override
   protected awc n_() {
      return awd.iB;
   }

   @Override
   protected awc d(bsb $$0) {
      return awd.iD;
   }

   void a(@Nullable cgr $$0) {
      this.b = $$0;
   }

   @Nullable
   cgr gJ() {
      return this.b;
   }

   @Override
   protected awc go() {
      return awd.iz;
   }

   @Override
   public void a(arg $$0, int $$1, boolean $$2) {
   }

   class a extends clf.c {
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
         buf $$0 = cko.this.m();
         double $$1 = Math.min($$0.dz(), cko.this.dz());
         double $$2 = Math.max($$0.dz(), cko.this.dz()) + 1.0;
         float $$3 = (float)azc.d($$0.dD() - cko.this.dD(), $$0.dx() - cko.this.dx());
         if (cko.this.g((btj)$$0) < 9.0) {
            for (int $$4 = 0; $$4 < 5; $$4++) {
               float $$5 = $$3 + (float)$$4 * (float) Math.PI * 0.4F;
               this.a(cko.this.dx() + (double)azc.b($$5) * 1.5, cko.this.dD() + (double)azc.a($$5) * 1.5, $$1, $$2, $$5, 0);
            }

            for (int $$6 = 0; $$6 < 8; $$6++) {
               float $$7 = $$3 + (float)$$6 * (float) Math.PI * 2.0F / 8.0F + (float) (Math.PI * 2.0 / 5.0);
               this.a(cko.this.dx() + (double)azc.b($$7) * 2.5, cko.this.dD() + (double)azc.a($$7) * 2.5, $$1, $$2, $$7, 3);
            }
         } else {
            for (int $$8 = 0; $$8 < 16; $$8++) {
               double $$9 = 1.25 * (double)($$8 + 1);
               int $$10 = 1 * $$8;
               this.a(cko.this.dx() + (double)azc.b($$3) * $$9, cko.this.dD() + (double)azc.a($$3) * $$9, $$1, $$2, $$3, $$10);
            }
         }
      }

      private void a(double $$0, double $$1, double $$2, double $$3, float $$4, int $$5) {
         je $$6 = je.a($$0, $$3, $$1);
         boolean $$7 = false;
         double $$8 = 0.0;

         do {
            je $$9 = $$6.e();
            dua $$10 = cko.this.dS().a_($$9);
            if ($$10.c(cko.this.dS(), $$9, jj.b)) {
               if (!cko.this.dS().u($$6)) {
                  dua $$11 = cko.this.dS().a_($$6);
                  eyx $$12 = $$11.g(cko.this.dS(), $$6);
                  if (!$$12.c()) {
                     $$8 = $$12.c(jj.a.b);
                  }
               }

               $$7 = true;
               break;
            }

            $$6 = $$6.e();
         } while ($$6.v() >= azc.a($$2) - 1);

         if ($$7) {
            cko.this.dS().b(new coa(cko.this.dS(), $$0, (double)$$6.v() + $$8, $$1, $$4, $$5, cko.this));
            cko.this.dS().a(dyx.t, new eye($$0, (double)$$6.v() + $$8, $$1), dyx.a.a(cko.this));
         }
      }

      @Override
      protected awc l() {
         return awd.iE;
      }

      @Override
      protected clf.a m() {
         return clf.a.c;
      }
   }

   class b extends clf.b {
      @Override
      public void a() {
         if (cko.this.m() != null) {
            cko.this.K().a(cko.this.m(), (float)cko.this.ag(), (float)cko.this.ae());
         } else if (cko.this.gJ() != null) {
            cko.this.K().a(cko.this.gJ(), (float)cko.this.ag(), (float)cko.this.ae());
         }
      }
   }

   class c extends clf.c {
      private final cev e = cev.b().a(16.0).d().e();

      @Override
      public boolean b() {
         if (!super.b()) {
            return false;
         } else {
            int $$0 = cko.this.dS().a(clj.class, this.e, cko.this, cko.this.cO().g(16.0)).size();
            return cko.this.af.a(8) + 1 > $$0;
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
         arg $$0 = (arg)cko.this.dS();
         ezd $$1 = cko.this.co();

         for (int $$2 = 0; $$2 < 3; $$2++) {
            je $$3 = cko.this.ds().b(-2 + cko.this.af.a(5), 1, -2 + cko.this.af.a(5));
            clj $$4 = btq.bi.a(cko.this.dS(), btp.f);
            if ($$4 != null) {
               $$4.a($$3, 0.0F, 0.0F);
               $$4.a($$0, cko.this.dS().d_($$3), btp.f, null);
               $$4.a(cko.this);
               $$4.h($$3);
               $$4.b(20 * (30 + cko.this.af.a(90)));
               if ($$1 != null) {
                  $$0.f().a($$4.cF(), $$1);
               }

               $$0.a_($$4);
               $$0.a(dyx.t, $$3, dyx.a.a(cko.this));
            }
         }
      }

      @Override
      protected awc l() {
         return awd.iF;
      }

      @Override
      protected clf.a m() {
         return clf.a.b;
      }
   }

   public class d extends clf.c {
      private final cev e = cev.b().a(16.0).a($$0x -> ((cgr)$$0x).t() == cue.l);

      @Override
      public boolean b() {
         if (cko.this.m() != null) {
            return false;
         } else if (cko.this.gy()) {
            return false;
         } else if (cko.this.ag < this.c) {
            return false;
         } else if (!cko.this.dS().ac().b(ddo.c)) {
            return false;
         } else {
            List<cgr> $$0 = cko.this.dS().a(cgr.class, this.e, cko.this, cko.this.cO().c(16.0, 4.0, 16.0));
            if ($$0.isEmpty()) {
               return false;
            } else {
               cko.this.a($$0.get(cko.this.af.a($$0.size())));
               return true;
            }
         }
      }

      @Override
      public boolean c() {
         return cko.this.gJ() != null && this.b > 0;
      }

      @Override
      public void e() {
         super.e();
         cko.this.a(null);
      }

      @Override
      protected void k() {
         cgr $$0 = cko.this.gJ();
         if ($$0 != null && $$0.bI()) {
            $$0.b(cue.o);
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
      protected awc l() {
         return awd.iG;
      }

      @Override
      protected clf.a m() {
         return clf.a.d;
      }
   }
}
