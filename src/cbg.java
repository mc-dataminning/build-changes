import java.util.List;
import javax.annotation.Nullable;

public class cbg extends cbx {
   @Nullable
   private bxs e;

   public cbg(bkz<? extends cbg> $$0, csf $$1) {
      super($$0, $$1);
      this.bJ = 10;
   }

   @Override
   protected void B() {
      super.B();
      this.bO.a(0, new bsa(this));
      this.bO.a(1, new cbg.b());
      this.bO.a(2, new brn<>(this, cdz.class, 8.0F, 0.6, 1.0));
      this.bO.a(4, new cbg.c());
      this.bO.a(5, new cbg.a());
      this.bO.a(6, new cbg.d());
      this.bO.a(8, new btd(this, 0.6));
      this.bO.a(9, new bso(this, cdz.class, 3.0F, 1.0F));
      this.bO.a(10, new bso(this, bln.class, 8.0F));
      this.bP.a(1, new bty(this, cfh.class).a());
      this.bP.a(2, new btz<>(this, cdz.class, true).c(300));
      this.bP.a(3, new btz<>(this, cdh.class, false).c(300));
      this.bP.a(3, new btz<>(this, bxi.class, false));
   }

   public static bmq.a w() {
      return cbn.gl().a(bmr.m, 0.5).a(bmr.g, 12.0).a(bmr.l, 24.0);
   }

   @Override
   protected void c_() {
      super.c_();
   }

   @Override
   public void a(sd $$0) {
      super.a($$0);
   }

   @Override
   public aqu af_() {
      return aqv.hM;
   }

   @Override
   public void b(sd $$0) {
      super.b($$0);
   }

   @Override
   protected void Z() {
      super.Z();
   }

   @Override
   public boolean s(bkv $$0) {
      if ($$0 == null) {
         return false;
      } else if ($$0 == this) {
         return true;
      } else if (super.s($$0)) {
         return true;
      } else if ($$0 instanceof ccb) {
         return this.s(((ccb)$$0).A());
      } else {
         return $$0 instanceof bll && ((bll)$$0).eT() == blq.d ? this.cg() == null && $$0.cg() == null : false;
      }
   }

   @Override
   protected aqu y() {
      return aqv.hK;
   }

   @Override
   protected aqu n_() {
      return aqv.hN;
   }

   @Override
   protected aqu d(bjt $$0) {
      return aqv.hP;
   }

   void a(@Nullable bxs $$0) {
      this.e = $$0;
   }

   @Nullable
   bxs gy() {
      return this.e;
   }

   @Override
   protected aqu gf() {
      return aqv.hL;
   }

   @Override
   public void a(int $$0, boolean $$1) {
   }

   class a extends cbx.c {
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
         bll $$0 = cbg.this.q();
         double $$1 = Math.min($$0.du(), cbg.this.du());
         double $$2 = Math.max($$0.du(), cbg.this.du()) + 1.0;
         float $$3 = (float)atq.d($$0.dy() - cbg.this.dy(), $$0.ds() - cbg.this.ds());
         if (cbg.this.f((bkv)$$0) < 9.0) {
            for (int $$4 = 0; $$4 < 5; $$4++) {
               float $$5 = $$3 + (float)$$4 * (float) Math.PI * 0.4F;
               this.a(cbg.this.ds() + (double)atq.b($$5) * 1.5, cbg.this.dy() + (double)atq.a($$5) * 1.5, $$1, $$2, $$5, 0);
            }

            for (int $$6 = 0; $$6 < 8; $$6++) {
               float $$7 = $$3 + (float)$$6 * (float) Math.PI * 2.0F / 8.0F + (float) (Math.PI * 2.0 / 5.0);
               this.a(cbg.this.ds() + (double)atq.b($$7) * 2.5, cbg.this.dy() + (double)atq.a($$7) * 2.5, $$1, $$2, $$7, 3);
            }
         } else {
            for (int $$8 = 0; $$8 < 16; $$8++) {
               double $$9 = 1.25 * (double)($$8 + 1);
               int $$10 = 1 * $$8;
               this.a(cbg.this.ds() + (double)atq.b($$3) * $$9, cbg.this.dy() + (double)atq.a($$3) * $$9, $$1, $$2, $$3, $$10);
            }
         }
      }

      private void a(double $$0, double $$1, double $$2, double $$3, float $$4, int $$5) {
         hx $$6 = hx.a($$0, $$3, $$1);
         boolean $$7 = false;
         double $$8 = 0.0;

         do {
            hx $$9 = $$6.d();
            dhn $$10 = cbg.this.dN().a_($$9);
            if ($$10.d(cbg.this.dN(), $$9, ib.b)) {
               if (!cbg.this.dN().t($$6)) {
                  dhn $$11 = cbg.this.dN().a_($$6);
                  eks $$12 = $$11.k(cbg.this.dN(), $$6);
                  if (!$$12.c()) {
                     $$8 = $$12.c(ib.a.b);
                  }
               }

               $$7 = true;
               break;
            }

            $$6 = $$6.d();
         } while ($$6.v() >= atq.a($$2) - 1);

         if ($$7) {
            cbg.this.dN().b(new cej(cbg.this.dN(), $$0, (double)$$6.v() + $$8, $$1, $$4, $$5, cbg.this));
            cbg.this.dN().a(dlx.t, new ejz($$0, (double)$$6.v() + $$8, $$1), dlx.a.a(cbg.this));
         }
      }

      @Override
      protected aqu l() {
         return aqv.hQ;
      }

      @Override
      protected cbx.a m() {
         return cbx.a.c;
      }
   }

   class b extends cbx.b {
      @Override
      public void e() {
         if (cbg.this.q() != null) {
            cbg.this.I().a(cbg.this.q(), (float)cbg.this.ab(), (float)cbg.this.aa());
         } else if (cbg.this.gy() != null) {
            cbg.this.I().a(cbg.this.gy(), (float)cbg.this.ab(), (float)cbg.this.aa());
         }
      }
   }

   class c extends cbx.c {
      private final bvx e = bvx.b().a(16.0).d().e();

      @Override
      public boolean a() {
         if (!super.a()) {
            return false;
         } else {
            int $$0 = cbg.this.dN().a(ccb.class, this.e, cbg.this, cbg.this.cH().g(16.0)).size();
            return cbg.this.ag.a(8) + 1 > $$0;
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
         ami $$0 = (ami)cbg.this.dN();
         ekw $$1 = cbg.this.cg();

         for (int $$2 = 0; $$2 < 3; $$2++) {
            hx $$3 = cbg.this.dn().b(-2 + cbg.this.ag.a(5), 1, -2 + cbg.this.ag.a(5));
            ccb $$4 = bkz.be.a(cbg.this.dN());
            if ($$4 != null) {
               $$4.a($$3, 0.0F, 0.0F);
               $$4.a($$0, cbg.this.dN().d_($$3), blp.f, null, null);
               $$4.a(cbg.this);
               $$4.i($$3);
               $$4.b(20 * (30 + cbg.this.ag.a(90)));
               if ($$1 != null) {
                  $$0.f().a($$4.cy(), $$1);
               }

               $$0.a_($$4);
               $$0.a(dlx.t, $$3, dlx.a.a(cbg.this));
            }
         }
      }

      @Override
      protected aqu l() {
         return aqv.hR;
      }

      @Override
      protected cbx.a m() {
         return cbx.a.b;
      }
   }

   public class d extends cbx.c {
      private final bvx e = bvx.b().a(16.0).a($$0x -> ((bxs)$$0x).w() == ckc.l);

      @Override
      public boolean a() {
         if (cbg.this.q() != null) {
            return false;
         } else if (cbg.this.gp()) {
            return false;
         } else if (cbg.this.ah < this.c) {
            return false;
         } else if (!cbg.this.dN().Y().b(csb.c)) {
            return false;
         } else {
            List<bxs> $$0 = cbg.this.dN().a(bxs.class, this.e, cbg.this, cbg.this.cH().c(16.0, 4.0, 16.0));
            if ($$0.isEmpty()) {
               return false;
            } else {
               cbg.this.a($$0.get(cbg.this.ag.a($$0.size())));
               return true;
            }
         }
      }

      @Override
      public boolean b() {
         return cbg.this.gy() != null && this.b > 0;
      }

      @Override
      public void d() {
         super.d();
         cbg.this.a(null);
      }

      @Override
      protected void k() {
         bxs $$0 = cbg.this.gy();
         if ($$0 != null && $$0.bx()) {
            $$0.b(ckc.o);
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
      protected aqu l() {
         return aqv.hS;
      }

      @Override
      protected cbx.a m() {
         return cbx.a.d;
      }
   }
}
