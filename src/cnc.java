import java.util.List;
import javax.annotation.Nullable;

public class cnc extends cnt {
   @Nullable
   private cje a;

   public cnc(bwb<? extends cnc> $$0, dhp $$1) {
      super($$0, $$1);
      this.bw = 10;
   }

   @Override
   protected void D() {
      super.D();
      this.bB.a(0, new cdh(this));
      this.bB.a(1, new cnc.b());
      this.bB.a(2, new ccu<>(this, cqi.class, 8.0F, 0.6, 1.0));
      this.bB.a(3, new ccu<>(this, coo.class, 8.0F, 0.6, 1.0));
      this.bB.a(4, new cnc.c());
      this.bB.a(5, new cnc.a());
      this.bB.a(6, new cnc.d());
      this.bB.a(8, new cek(this, 0.6));
      this.bB.a(9, new cdv(this, cqi.class, 3.0F, 1.0F));
      this.bB.a(10, new cdv(this, bwt.class, 8.0F));
      this.bC.a(1, new cff(this, crw.class).a());
      this.bC.a(2, new cfg<>(this, cqi.class, true).c(300));
      this.bC.a(3, new cfg<>(this, cpp.class, false).c(300));
      this.bC.a(3, new cfg<>(this, cis.class, false));
   }

   public static bxw.a m() {
      return cnj.gt().a(bxx.v, 0.5).a(bxx.m, 12.0).a(bxx.s, 24.0);
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
   }

   @Override
   public void a(tw $$0) {
      super.a($$0);
   }

   @Override
   public awj ad_() {
      return awk.iU;
   }

   @Override
   public void b(tw $$0) {
      super.b($$0);
   }

   @Override
   protected boolean t(bvs $$0) {
      if ($$0 == this) {
         return true;
      } else if (super.t($$0)) {
         return true;
      } else {
         if ($$0 instanceof cnx $$1 && $$1.m() != null) {
            return this.t($$1.m());
         }

         return false;
      }
   }

   @Override
   protected awj u() {
      return awk.iS;
   }

   @Override
   protected awj l_() {
      return awk.iV;
   }

   @Override
   protected awj e(buh $$0) {
      return awk.iX;
   }

   void a(@Nullable cje $$0) {
      this.a = $$0;
   }

   @Nullable
   cje gI() {
      return this.a;
   }

   @Override
   protected awj q() {
      return awk.iT;
   }

   @Override
   public void a(arn $$0, int $$1, boolean $$2) {
   }

   class a extends cnt.c {
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
         bwr $$0 = cnc.this.f();
         double $$1 = Math.min($$0.dC(), cnc.this.dC());
         double $$2 = Math.max($$0.dC(), cnc.this.dC()) + 1.0;
         float $$3 = (float)azk.d($$0.dG() - cnc.this.dG(), $$0.dA() - cnc.this.dA());
         if (cnc.this.g((bvs)$$0) < 9.0) {
            for (int $$4 = 0; $$4 < 5; $$4++) {
               float $$5 = $$3 + (float)$$4 * (float) Math.PI * 0.4F;
               this.a(cnc.this.dA() + (double)azk.b($$5) * 1.5, cnc.this.dG() + (double)azk.a($$5) * 1.5, $$1, $$2, $$5, 0);
            }

            for (int $$6 = 0; $$6 < 8; $$6++) {
               float $$7 = $$3 + (float)$$6 * (float) Math.PI * 2.0F / 8.0F + (float) (Math.PI * 2.0 / 5.0);
               this.a(cnc.this.dA() + (double)azk.b($$7) * 2.5, cnc.this.dG() + (double)azk.a($$7) * 2.5, $$1, $$2, $$7, 3);
            }
         } else {
            for (int $$8 = 0; $$8 < 16; $$8++) {
               double $$9 = 1.25 * (double)($$8 + 1);
               int $$10 = 1 * $$8;
               this.a(cnc.this.dA() + (double)azk.b($$3) * $$9, cnc.this.dG() + (double)azk.a($$3) * $$9, $$1, $$2, $$3, $$10);
            }
         }
      }

      private void a(double $$0, double $$1, double $$2, double $$3, float $$4, int $$5) {
         jj $$6 = jj.a($$0, $$3, $$1);
         boolean $$7 = false;
         double $$8 = 0.0;

         do {
            jj $$9 = $$6.e();
            dym $$10 = cnc.this.dV().a_($$9);
            if ($$10.c(cnc.this.dV(), $$9, jo.b)) {
               if (!cnc.this.dV().u($$6)) {
                  dym $$11 = cnc.this.dV().a_($$6);
                  fdo $$12 = $$11.g(cnc.this.dV(), $$6);
                  if (!$$12.c()) {
                     $$8 = $$12.c(jo.a.b);
                  }
               }

               $$7 = true;
               break;
            }

            $$6 = $$6.e();
         } while ($$6.v() >= azk.a($$2) - 1);

         if ($$7) {
            cnc.this.dV().b(new cqt(cnc.this.dV(), $$0, (double)$$6.v() + $$8, $$1, $$4, $$5, cnc.this));
            cnc.this.dV().a(edm.t, new fcu($$0, (double)$$6.v() + $$8, $$1), edm.a.a(cnc.this));
         }
      }

      @Override
      protected awj l() {
         return awk.iY;
      }

      @Override
      protected cnt.a m() {
         return cnt.a.c;
      }
   }

   class b extends cnt.b {
      @Override
      public void a() {
         if (cnc.this.f() != null) {
            cnc.this.J().a(cnc.this.f(), (float)cnc.this.ad(), (float)cnc.this.ac());
         } else if (cnc.this.gI() != null) {
            cnc.this.J().a(cnc.this.gI(), (float)cnc.this.ad(), (float)cnc.this.ac());
         }
      }
   }

   class c extends cnt.c {
      private final chg e = chg.b().a(16.0).d().e();

      @Override
      public boolean b() {
         if (!super.b()) {
            return false;
         } else {
            int $$0 = a(cnc.this.dV()).a(cnx.class, this.e, cnc.this, cnc.this.cR().g(16.0)).size();
            return cnc.this.ae.a(8) + 1 > $$0;
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
         arn $$0 = (arn)cnc.this.dV();
         fdu $$1 = cnc.this.cr();

         for (int $$2 = 0; $$2 < 3; $$2++) {
            jj $$3 = cnc.this.dv().b(-2 + cnc.this.ae.a(5), 1, -2 + cnc.this.ae.a(5));
            cnx $$4 = bwb.bB.a(cnc.this.dV(), bwa.f);
            if ($$4 != null) {
               $$4.a($$3, 0.0F, 0.0F);
               $$4.a($$0, cnc.this.dV().d_($$3), bwa.f, null);
               $$4.a(cnc.this);
               $$4.i($$3);
               $$4.b(20 * (30 + cnc.this.ae.a(90)));
               if ($$1 != null) {
                  $$0.g().a($$4.cI(), $$1);
               }

               $$0.a_($$4);
               $$0.a(edm.t, $$3, edm.a.a(cnc.this));
            }
         }
      }

      @Override
      protected awj l() {
         return awk.iZ;
      }

      @Override
      protected cnt.a m() {
         return cnt.a.b;
      }
   }

   public class d extends cnt.c {
      private final chg e = chg.b().a(16.0).a(($$0x, $$1) -> ((cje)$$0x).t() == cwv.l);

      @Override
      public boolean b() {
         if (cnc.this.f() != null) {
            return false;
         } else if (cnc.this.gx()) {
            return false;
         } else if (cnc.this.af < this.c) {
            return false;
         } else {
            arn $$0 = a(cnc.this.dV());
            if (!$$0.O().c(dhl.c)) {
               return false;
            } else {
               List<cje> $$1 = $$0.a(cje.class, this.e, cnc.this, cnc.this.cR().c(16.0, 4.0, 16.0));
               if ($$1.isEmpty()) {
                  return false;
               } else {
                  cnc.this.a($$1.get(cnc.this.ae.a($$1.size())));
                  return true;
               }
            }
         }
      }

      @Override
      public boolean c() {
         return cnc.this.gI() != null && this.b > 0;
      }

      @Override
      public void e() {
         super.e();
         cnc.this.a(null);
      }

      @Override
      protected void k() {
         cje $$0 = cnc.this.gI();
         if ($$0 != null && $$0.bK()) {
            $$0.b(cwv.o);
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
      protected awj l() {
         return awk.ja;
      }

      @Override
      protected cnt.a m() {
         return cnt.a.d;
      }
   }
}
