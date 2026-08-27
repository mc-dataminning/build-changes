import java.util.List;
import javax.annotation.Nullable;

public class cez extends cfq {
   @Nullable
   private cbi e;

   public cez(bol<? extends cez> $$0, cwe $$1) {
      super($$0, $$1);
      this.bK = 10;
   }

   @Override
   protected void B() {
      super.B();
      this.bP.a(0, new bvo(this));
      this.bP.a(1, new cez.b());
      this.bP.a(2, new bvb<>(this, cia.class, 8.0F, 0.6, 1.0));
      this.bP.a(4, new cez.c());
      this.bP.a(5, new cez.a());
      this.bP.a(6, new cez.d());
      this.bP.a(8, new bwr(this, 0.6));
      this.bP.a(9, new bwc(this, cia.class, 3.0F, 1.0F));
      this.bP.a(10, new bwc(this, boz.class, 8.0F));
      this.bQ.a(1, new bxm(this, cjk.class).a());
      this.bQ.a(2, new bxn<>(this, cia.class, true).c(300));
      this.bQ.a(3, new bxn<>(this, chi.class, false).c(300));
      this.bQ.a(3, new bxn<>(this, cay.class, false));
   }

   public static bqd.a w() {
      return cfg.gr().a(bqe.o, 0.5).a(bqe.i, 12.0).a(bqe.n, 24.0);
   }

   @Override
   protected void c_() {
      super.c_();
   }

   @Override
   public void a(sy $$0) {
      super.a($$0);
   }

   @Override
   public ato ag_() {
      return atp.il;
   }

   @Override
   public void b(sy $$0) {
      super.b($$0);
   }

   @Override
   protected void aa() {
      super.aa();
   }

   @Override
   public boolean r(bof $$0) {
      if ($$0 == null) {
         return false;
      } else if ($$0 == this) {
         return true;
      } else if (super.r($$0)) {
         return true;
      } else {
         return $$0 instanceof cfu $$1 ? this.r($$1.A()) : false;
      }
   }

   @Override
   protected ato y() {
      return atp.ij;
   }

   @Override
   protected ato n_() {
      return atp.im;
   }

   @Override
   protected ato d(bne $$0) {
      return atp.io;
   }

   void a(@Nullable cbi $$0) {
      this.e = $$0;
   }

   @Nullable
   cbi gE() {
      return this.e;
   }

   @Override
   protected ato gl() {
      return atp.ik;
   }

   @Override
   public void a(int $$0, boolean $$1) {
   }

   class a extends cfq.c {
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
         box $$0 = cez.this.q();
         double $$1 = Math.min($$0.dq(), cez.this.dq());
         double $$2 = Math.max($$0.dq(), cez.this.dq()) + 1.0;
         float $$3 = (float)awm.d($$0.du() - cez.this.du(), $$0.do() - cez.this.do());
         if (cez.this.f((bof)$$0) < 9.0) {
            for (int $$4 = 0; $$4 < 5; $$4++) {
               float $$5 = $$3 + (float)$$4 * (float) Math.PI * 0.4F;
               this.a(cez.this.do() + (double)awm.b($$5) * 1.5, cez.this.du() + (double)awm.a($$5) * 1.5, $$1, $$2, $$5, 0);
            }

            for (int $$6 = 0; $$6 < 8; $$6++) {
               float $$7 = $$3 + (float)$$6 * (float) Math.PI * 2.0F / 8.0F + (float) (Math.PI * 2.0 / 5.0);
               this.a(cez.this.do() + (double)awm.b($$7) * 2.5, cez.this.du() + (double)awm.a($$7) * 2.5, $$1, $$2, $$7, 3);
            }
         } else {
            for (int $$8 = 0; $$8 < 16; $$8++) {
               double $$9 = 1.25 * (double)($$8 + 1);
               int $$10 = 1 * $$8;
               this.a(cez.this.do() + (double)awm.b($$3) * $$9, cez.this.du() + (double)awm.a($$3) * $$9, $$1, $$2, $$3, $$10);
            }
         }
      }

      private void a(double $$0, double $$1, double $$2, double $$3, float $$4, int $$5) {
         ib $$6 = ib.a($$0, $$3, $$1);
         boolean $$7 = false;
         double $$8 = 0.0;

         do {
            ib $$9 = $$6.d();
            dme $$10 = cez.this.dJ().a_($$9);
            if ($$10.d(cez.this.dJ(), $$9, ih.b)) {
               if (!cez.this.dJ().u($$6)) {
                  dme $$11 = cez.this.dJ().a_($$6);
                  epo $$12 = $$11.k(cez.this.dJ(), $$6);
                  if (!$$12.c()) {
                     $$8 = $$12.c(ih.a.b);
                  }
               }

               $$7 = true;
               break;
            }

            $$6 = $$6.d();
         } while ($$6.v() >= awm.a($$2) - 1);

         if ($$7) {
            cez.this.dJ().b(new cik(cez.this.dJ(), $$0, (double)$$6.v() + $$8, $$1, $$4, $$5, cez.this));
            cez.this.dJ().a(dqr.t, new eov($$0, (double)$$6.v() + $$8, $$1), dqr.a.a(cez.this));
         }
      }

      @Override
      protected ato l() {
         return atp.ip;
      }

      @Override
      protected cfq.a m() {
         return cfq.a.c;
      }
   }

   class b extends cfq.b {
      @Override
      public void e() {
         if (cez.this.q() != null) {
            cez.this.I().a(cez.this.q(), (float)cez.this.fJ(), (float)cez.this.ab());
         } else if (cez.this.gE() != null) {
            cez.this.I().a(cez.this.gE(), (float)cez.this.fJ(), (float)cez.this.ab());
         }
      }
   }

   class c extends cfq.c {
      private final bzn e = bzn.b().a(16.0).d().e();

      @Override
      public boolean a() {
         if (!super.a()) {
            return false;
         } else {
            int $$0 = cez.this.dJ().a(cfu.class, this.e, cez.this, cez.this.cE().g(16.0)).size();
            return cez.this.af.a(8) + 1 > $$0;
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
         apa $$0 = (apa)cez.this.dJ();
         epu $$1 = cez.this.cd();

         for (int $$2 = 0; $$2 < 3; $$2++) {
            ib $$3 = cez.this.dj().b(-2 + cez.this.af.a(5), 1, -2 + cez.this.af.a(5));
            cfu $$4 = bol.bg.a(cez.this.dJ());
            if ($$4 != null) {
               $$4.a($$3, 0.0F, 0.0F);
               $$4.a($$0, cez.this.dJ().d_($$3), bpb.f, null);
               $$4.a(cez.this);
               $$4.i($$3);
               $$4.b(20 * (30 + cez.this.af.a(90)));
               if ($$1 != null) {
                  $$0.f().a($$4.cv(), $$1);
               }

               $$0.a_($$4);
               $$0.a(dqr.t, $$3, dqr.a.a(cez.this));
            }
         }
      }

      @Override
      protected ato l() {
         return atp.iq;
      }

      @Override
      protected cfq.a m() {
         return cfq.a.b;
      }
   }

   public class d extends cfq.c {
      private final bzn e = bzn.b().a(16.0).a($$0x -> ((cbi)$$0x).w() == cog.l);

      @Override
      public boolean a() {
         if (cez.this.q() != null) {
            return false;
         } else if (cez.this.gv()) {
            return false;
         } else if (cez.this.ag < this.c) {
            return false;
         } else if (!cez.this.dJ().Z().b(cwa.c)) {
            return false;
         } else {
            List<cbi> $$0 = cez.this.dJ().a(cbi.class, this.e, cez.this, cez.this.cE().c(16.0, 4.0, 16.0));
            if ($$0.isEmpty()) {
               return false;
            } else {
               cez.this.a($$0.get(cez.this.af.a($$0.size())));
               return true;
            }
         }
      }

      @Override
      public boolean b() {
         return cez.this.gE() != null && this.b > 0;
      }

      @Override
      public void d() {
         super.d();
         cez.this.a(null);
      }

      @Override
      protected void k() {
         cbi $$0 = cez.this.gE();
         if ($$0 != null && $$0.bx()) {
            $$0.b(cog.o);
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
      protected ato l() {
         return atp.ir;
      }

      @Override
      protected cfq.a m() {
         return cfq.a.d;
      }
   }
}
