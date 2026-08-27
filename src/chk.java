import java.util.List;
import javax.annotation.Nullable;

public class chk extends cib {
   @Nullable
   private cdp e;

   public chk(bqr<? extends chk> $$0, czu $$1) {
      super($$0, $$1);
      this.bN = 10;
   }

   @Override
   protected void z() {
      super.z();
      this.bS.a(0, new bxv(this));
      this.bS.a(1, new chk.b());
      this.bS.a(2, new bxi<>(this, ckl.class, 8.0F, 0.6, 1.0));
      this.bS.a(4, new chk.c());
      this.bS.a(5, new chk.a());
      this.bS.a(6, new chk.d());
      this.bS.a(8, new byy(this, 0.6));
      this.bS.a(9, new byj(this, ckl.class, 3.0F, 1.0F));
      this.bS.a(10, new byj(this, brg.class, 8.0F));
      this.bT.a(1, new bzt(this, clx.class).a());
      this.bT.a(2, new bzu<>(this, ckl.class, true).c(300));
      this.bT.a(3, new bzu<>(this, cjt.class, false).c(300));
      this.bT.a(3, new bzu<>(this, cdf.class, false));
   }

   public static bsk.a u() {
      return chr.gv().a(bsl.r, 0.5).a(bsl.k, 12.0).a(bsl.q, 24.0);
   }

   @Override
   protected void a(ajo.a $$0) {
      super.a($$0);
   }

   @Override
   public void a(ty $$0) {
      super.a($$0);
   }

   @Override
   public auy ae_() {
      return auz.iu;
   }

   @Override
   public void b(ty $$0) {
      super.b($$0);
   }

   @Override
   protected void Y() {
      super.Y();
   }

   @Override
   public boolean s(bql $$0) {
      if ($$0 == null) {
         return false;
      } else if ($$0 == this) {
         return true;
      } else if (super.s($$0)) {
         return true;
      } else {
         return $$0 instanceof cif $$1 ? this.s($$1.y()) : false;
      }
   }

   @Override
   protected auy v() {
      return auz.is;
   }

   @Override
   protected auy o_() {
      return auz.iv;
   }

   @Override
   protected auy d(bpj $$0) {
      return auz.ix;
   }

   void a(@Nullable cdp $$0) {
      this.e = $$0;
   }

   @Nullable
   cdp gI() {
      return this.e;
   }

   @Override
   protected auy gp() {
      return auz.it;
   }

   @Override
   public void a(int $$0, boolean $$1) {
   }

   class a extends cib.c {
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
         bre $$0 = chk.this.p();
         double $$1 = Math.min($$0.du(), chk.this.du());
         double $$2 = Math.max($$0.du(), chk.this.du()) + 1.0;
         float $$3 = (float)axw.d($$0.dy() - chk.this.dy(), $$0.ds() - chk.this.ds());
         if (chk.this.g((bql)$$0) < 9.0) {
            for (int $$4 = 0; $$4 < 5; $$4++) {
               float $$5 = $$3 + (float)$$4 * (float) Math.PI * 0.4F;
               this.a(chk.this.ds() + (double)axw.b($$5) * 1.5, chk.this.dy() + (double)axw.a($$5) * 1.5, $$1, $$2, $$5, 0);
            }

            for (int $$6 = 0; $$6 < 8; $$6++) {
               float $$7 = $$3 + (float)$$6 * (float) Math.PI * 2.0F / 8.0F + (float) (Math.PI * 2.0 / 5.0);
               this.a(chk.this.ds() + (double)axw.b($$7) * 2.5, chk.this.dy() + (double)axw.a($$7) * 2.5, $$1, $$2, $$7, 3);
            }
         } else {
            for (int $$8 = 0; $$8 < 16; $$8++) {
               double $$9 = 1.25 * (double)($$8 + 1);
               int $$10 = 1 * $$8;
               this.a(chk.this.ds() + (double)axw.b($$3) * $$9, chk.this.dy() + (double)axw.a($$3) * $$9, $$1, $$2, $$3, $$10);
            }
         }
      }

      private void a(double $$0, double $$1, double $$2, double $$3, float $$4, int $$5) {
         im $$6 = im.a($$0, $$3, $$1);
         boolean $$7 = false;
         double $$8 = 0.0;

         do {
            im $$9 = $$6.d();
            dpy $$10 = chk.this.dN().a_($$9);
            if ($$10.d(chk.this.dN(), $$9, ir.b)) {
               if (!chk.this.dN().u($$6)) {
                  dpy $$11 = chk.this.dN().a_($$6);
                  ety $$12 = $$11.k(chk.this.dN(), $$6);
                  if (!$$12.c()) {
                     $$8 = $$12.c(ir.a.b);
                  }
               }

               $$7 = true;
               break;
            }

            $$6 = $$6.d();
         } while ($$6.v() >= axw.a($$2) - 1);

         if ($$7) {
            chk.this.dN().b(new ckv(chk.this.dN(), $$0, (double)$$6.v() + $$8, $$1, $$4, $$5, chk.this));
            chk.this.dN().a(dur.t, new etf($$0, (double)$$6.v() + $$8, $$1), dur.a.a(chk.this));
         }
      }

      @Override
      protected auy l() {
         return auz.iy;
      }

      @Override
      protected cib.a m() {
         return cib.a.c;
      }
   }

   class b extends cib.b {
      @Override
      public void e() {
         if (chk.this.p() != null) {
            chk.this.G().a(chk.this.p(), (float)chk.this.aa(), (float)chk.this.Z());
         } else if (chk.this.gI() != null) {
            chk.this.G().a(chk.this.gI(), (float)chk.this.aa(), (float)chk.this.Z());
         }
      }
   }

   class c extends cib.c {
      private final cbu e = cbu.b().a(16.0).d().e();

      @Override
      public boolean a() {
         if (!super.a()) {
            return false;
         } else {
            int $$0 = chk.this.dN().a(cif.class, this.e, chk.this, chk.this.cI().g(16.0)).size();
            return chk.this.ah.a(8) + 1 > $$0;
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
         aqe $$0 = (aqe)chk.this.dN();
         eue $$1 = chk.this.ch();

         for (int $$2 = 0; $$2 < 3; $$2++) {
            im $$3 = chk.this.dn().b(-2 + chk.this.ah.a(5), 1, -2 + chk.this.ah.a(5));
            cif $$4 = bqr.bh.a(chk.this.dN());
            if ($$4 != null) {
               $$4.a($$3, 0.0F, 0.0F);
               $$4.a($$0, chk.this.dN().d_($$3), bri.f, null);
               $$4.a(chk.this);
               $$4.i($$3);
               $$4.b(20 * (30 + chk.this.ah.a(90)));
               if ($$1 != null) {
                  $$0.f().a($$4.cz(), $$1);
               }

               $$0.a_($$4);
               $$0.a(dur.t, $$3, dur.a.a(chk.this));
            }
         }
      }

      @Override
      protected auy l() {
         return auz.iz;
      }

      @Override
      protected cib.a m() {
         return cib.a.b;
      }
   }

   public class d extends cib.c {
      private final cbu e = cbu.b().a(16.0).a($$0x -> ((cdp)$$0x).u() == cqw.l);

      @Override
      public boolean a() {
         if (chk.this.p() != null) {
            return false;
         } else if (chk.this.gz()) {
            return false;
         } else if (chk.this.ai < this.c) {
            return false;
         } else if (!chk.this.dN().aa().b(czq.c)) {
            return false;
         } else {
            List<cdp> $$0 = chk.this.dN().a(cdp.class, this.e, chk.this, chk.this.cI().c(16.0, 4.0, 16.0));
            if ($$0.isEmpty()) {
               return false;
            } else {
               chk.this.a($$0.get(chk.this.ah.a($$0.size())));
               return true;
            }
         }
      }

      @Override
      public boolean b() {
         return chk.this.gI() != null && this.b > 0;
      }

      @Override
      public void d() {
         super.d();
         chk.this.a(null);
      }

      @Override
      protected void k() {
         cdp $$0 = chk.this.gI();
         if ($$0 != null && $$0.bB()) {
            $$0.b(cqw.o);
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
      protected auy l() {
         return auz.iA;
      }

      @Override
      protected cib.a m() {
         return cib.a.d;
      }
   }
}
