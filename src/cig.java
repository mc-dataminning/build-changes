import java.util.List;
import javax.annotation.Nullable;

public class cig extends cix {
   @Nullable
   private cel e;

   public cig(brn<? extends cig> $$0, dad $$1) {
      super($$0, $$1);
      this.bN = 10;
   }

   @Override
   protected void z() {
      super.z();
      this.bS.a(0, new byr(this));
      this.bS.a(1, new cig.b());
      this.bS.a(2, new bye<>(this, clh.class, 8.0F, 0.6, 1.0));
      this.bS.a(4, new cig.c());
      this.bS.a(5, new cig.a());
      this.bS.a(6, new cig.d());
      this.bS.a(8, new bzu(this, 0.6));
      this.bS.a(9, new bzf(this, clh.class, 3.0F, 1.0F));
      this.bS.a(10, new bzf(this, bsc.class, 8.0F));
      this.bT.a(1, new cap(this, cmt.class).a());
      this.bT.a(2, new caq<>(this, clh.class, true).c(300));
      this.bT.a(3, new caq<>(this, ckp.class, false).c(300));
      this.bT.a(3, new caq<>(this, ceb.class, false));
   }

   public static btg.a u() {
      return cin.gv().a(bth.r, 0.5).a(bth.k, 12.0).a(bth.q, 24.0);
   }

   @Override
   protected void a(ajq.a $$0) {
      super.a($$0);
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
   }

   @Override
   public avb ae_() {
      return avc.iu;
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
   }

   @Override
   protected void Y() {
      super.Y();
   }

   @Override
   public boolean s(brh $$0) {
      if ($$0 == null) {
         return false;
      } else if ($$0 == this) {
         return true;
      } else if (super.s($$0)) {
         return true;
      } else {
         return $$0 instanceof cjb $$1 ? this.s($$1.y()) : false;
      }
   }

   @Override
   protected avb v() {
      return avc.is;
   }

   @Override
   protected avb o_() {
      return avc.iv;
   }

   @Override
   protected avb d(bqf $$0) {
      return avc.ix;
   }

   void a(@Nullable cel $$0) {
      this.e = $$0;
   }

   @Nullable
   cel gI() {
      return this.e;
   }

   @Override
   protected avb gp() {
      return avc.it;
   }

   @Override
   public void a(int $$0, boolean $$1) {
   }

   class a extends cix.c {
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
         bsa $$0 = cig.this.p();
         double $$1 = Math.min($$0.du(), cig.this.du());
         double $$2 = Math.max($$0.du(), cig.this.du()) + 1.0;
         float $$3 = (float)axz.d($$0.dy() - cig.this.dy(), $$0.ds() - cig.this.ds());
         if (cig.this.g((brh)$$0) < 9.0) {
            for (int $$4 = 0; $$4 < 5; $$4++) {
               float $$5 = $$3 + (float)$$4 * (float) Math.PI * 0.4F;
               this.a(cig.this.ds() + (double)axz.b($$5) * 1.5, cig.this.dy() + (double)axz.a($$5) * 1.5, $$1, $$2, $$5, 0);
            }

            for (int $$6 = 0; $$6 < 8; $$6++) {
               float $$7 = $$3 + (float)$$6 * (float) Math.PI * 2.0F / 8.0F + (float) (Math.PI * 2.0 / 5.0);
               this.a(cig.this.ds() + (double)axz.b($$7) * 2.5, cig.this.dy() + (double)axz.a($$7) * 2.5, $$1, $$2, $$7, 3);
            }
         } else {
            for (int $$8 = 0; $$8 < 16; $$8++) {
               double $$9 = 1.25 * (double)($$8 + 1);
               int $$10 = 1 * $$8;
               this.a(cig.this.ds() + (double)axz.b($$3) * $$9, cig.this.dy() + (double)axz.a($$3) * $$9, $$1, $$2, $$3, $$10);
            }
         }
      }

      private void a(double $$0, double $$1, double $$2, double $$3, float $$4, int $$5) {
         in $$6 = in.a($$0, $$3, $$1);
         boolean $$7 = false;
         double $$8 = 0.0;

         do {
            in $$9 = $$6.d();
            dqh $$10 = cig.this.dN().a_($$9);
            if ($$10.d(cig.this.dN(), $$9, is.b)) {
               if (!cig.this.dN().u($$6)) {
                  dqh $$11 = cig.this.dN().a_($$6);
                  eui $$12 = $$11.k(cig.this.dN(), $$6);
                  if (!$$12.c()) {
                     $$8 = $$12.c(is.a.b);
                  }
               }

               $$7 = true;
               break;
            }

            $$6 = $$6.d();
         } while ($$6.v() >= axz.a($$2) - 1);

         if ($$7) {
            cig.this.dN().b(new clr(cig.this.dN(), $$0, (double)$$6.v() + $$8, $$1, $$4, $$5, cig.this));
            cig.this.dN().a(dva.t, new etp($$0, (double)$$6.v() + $$8, $$1), dva.a.a(cig.this));
         }
      }

      @Override
      protected avb l() {
         return avc.iy;
      }

      @Override
      protected cix.a m() {
         return cix.a.c;
      }
   }

   class b extends cix.b {
      @Override
      public void e() {
         if (cig.this.p() != null) {
            cig.this.G().a(cig.this.p(), (float)cig.this.aa(), (float)cig.this.Z());
         } else if (cig.this.gI() != null) {
            cig.this.G().a(cig.this.gI(), (float)cig.this.aa(), (float)cig.this.Z());
         }
      }
   }

   class c extends cix.c {
      private final ccq e = ccq.b().a(16.0).d().e();

      @Override
      public boolean a() {
         if (!super.a()) {
            return false;
         } else {
            int $$0 = cig.this.dN().a(cjb.class, this.e, cig.this, cig.this.cI().g(16.0)).size();
            return cig.this.ah.a(8) + 1 > $$0;
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
         aqh $$0 = (aqh)cig.this.dN();
         euo $$1 = cig.this.ch();

         for (int $$2 = 0; $$2 < 3; $$2++) {
            in $$3 = cig.this.dn().b(-2 + cig.this.ah.a(5), 1, -2 + cig.this.ah.a(5));
            cjb $$4 = brn.bh.a(cig.this.dN());
            if ($$4 != null) {
               $$4.a($$3, 0.0F, 0.0F);
               $$4.a($$0, cig.this.dN().d_($$3), bse.f, null);
               $$4.a(cig.this);
               $$4.i($$3);
               $$4.b(20 * (30 + cig.this.ah.a(90)));
               if ($$1 != null) {
                  $$0.f().a($$4.cz(), $$1);
               }

               $$0.a_($$4);
               $$0.a(dva.t, $$3, dva.a.a(cig.this));
            }
         }
      }

      @Override
      protected avb l() {
         return avc.iz;
      }

      @Override
      protected cix.a m() {
         return cix.a.b;
      }
   }

   public class d extends cix.c {
      private final ccq e = ccq.b().a(16.0).a($$0x -> ((cel)$$0x).u() == crs.l);

      @Override
      public boolean a() {
         if (cig.this.p() != null) {
            return false;
         } else if (cig.this.gz()) {
            return false;
         } else if (cig.this.ai < this.c) {
            return false;
         } else if (!cig.this.dN().aa().b(czz.c)) {
            return false;
         } else {
            List<cel> $$0 = cig.this.dN().a(cel.class, this.e, cig.this, cig.this.cI().c(16.0, 4.0, 16.0));
            if ($$0.isEmpty()) {
               return false;
            } else {
               cig.this.a($$0.get(cig.this.ah.a($$0.size())));
               return true;
            }
         }
      }

      @Override
      public boolean b() {
         return cig.this.gI() != null && this.b > 0;
      }

      @Override
      public void d() {
         super.d();
         cig.this.a(null);
      }

      @Override
      protected void k() {
         cel $$0 = cig.this.gI();
         if ($$0 != null && $$0.bB()) {
            $$0.b(crs.o);
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
      protected avb l() {
         return avc.iA;
      }

      @Override
      protected cix.a m() {
         return cix.a.d;
      }
   }
}
