import java.util.List;
import javax.annotation.Nullable;

public class ccc extends cct {
   @Nullable
   private byo e;

   public ccc(blt<? extends ccc> $$0, cti $$1) {
      super($$0, $$1);
      this.bJ = 10;
   }

   @Override
   protected void B() {
      super.B();
      this.bO.a(0, new bsv(this));
      this.bO.a(1, new ccc.b());
      this.bO.a(2, new bsi<>(this, cfb.class, 8.0F, 0.6, 1.0));
      this.bO.a(4, new ccc.c());
      this.bO.a(5, new ccc.a());
      this.bO.a(6, new ccc.d());
      this.bO.a(8, new bty(this, 0.6));
      this.bO.a(9, new btj(this, cfb.class, 3.0F, 1.0F));
      this.bO.a(10, new btj(this, bmh.class, 8.0F));
      this.bP.a(1, new but(this, cgk.class).a());
      this.bP.a(2, new buu<>(this, cfb.class, true).c(300));
      this.bP.a(3, new buu<>(this, cej.class, false).c(300));
      this.bP.a(3, new buu<>(this, bye.class, false));
   }

   public static bnk.a w() {
      return ccj.gk().a(bnl.m, 0.5).a(bnl.g, 12.0).a(bnl.l, 24.0);
   }

   @Override
   protected void c_() {
      super.c_();
   }

   @Override
   public void a(sl $$0) {
      super.a($$0);
   }

   @Override
   public arl af_() {
      return arm.hV;
   }

   @Override
   public void b(sl $$0) {
      super.b($$0);
   }

   @Override
   protected void Z() {
      super.Z();
   }

   @Override
   public boolean s(blp $$0) {
      if ($$0 == null) {
         return false;
      } else if ($$0 == this) {
         return true;
      } else if (super.s($$0)) {
         return true;
      } else if ($$0 instanceof ccx) {
         return this.s(((ccx)$$0).A());
      } else {
         return $$0 instanceof bmf && ((bmf)$$0).eS() == bmk.d ? this.cg() == null && $$0.cg() == null : false;
      }
   }

   @Override
   protected arl y() {
      return arm.hT;
   }

   @Override
   protected arl n_() {
      return arm.hW;
   }

   @Override
   protected arl d(bkn $$0) {
      return arm.hY;
   }

   void a(@Nullable byo $$0) {
      this.e = $$0;
   }

   @Nullable
   byo gx() {
      return this.e;
   }

   @Override
   protected arl ge() {
      return arm.hU;
   }

   @Override
   public void a(int $$0, boolean $$1) {
   }

   class a extends cct.c {
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
         bmf $$0 = ccc.this.q();
         double $$1 = Math.min($$0.dt(), ccc.this.dt());
         double $$2 = Math.max($$0.dt(), ccc.this.dt()) + 1.0;
         float $$3 = (float)aui.d($$0.dx() - ccc.this.dx(), $$0.dr() - ccc.this.dr());
         if (ccc.this.f((blp)$$0) < 9.0) {
            for (int $$4 = 0; $$4 < 5; $$4++) {
               float $$5 = $$3 + (float)$$4 * (float) Math.PI * 0.4F;
               this.a(ccc.this.dr() + (double)aui.b($$5) * 1.5, ccc.this.dx() + (double)aui.a($$5) * 1.5, $$1, $$2, $$5, 0);
            }

            for (int $$6 = 0; $$6 < 8; $$6++) {
               float $$7 = $$3 + (float)$$6 * (float) Math.PI * 2.0F / 8.0F + (float) (Math.PI * 2.0 / 5.0);
               this.a(ccc.this.dr() + (double)aui.b($$7) * 2.5, ccc.this.dx() + (double)aui.a($$7) * 2.5, $$1, $$2, $$7, 3);
            }
         } else {
            for (int $$8 = 0; $$8 < 16; $$8++) {
               double $$9 = 1.25 * (double)($$8 + 1);
               int $$10 = 1 * $$8;
               this.a(ccc.this.dr() + (double)aui.b($$3) * $$9, ccc.this.dx() + (double)aui.a($$3) * $$9, $$1, $$2, $$3, $$10);
            }
         }
      }

      private void a(double $$0, double $$1, double $$2, double $$3, float $$4, int $$5) {
         hx $$6 = hx.a($$0, $$3, $$1);
         boolean $$7 = false;
         double $$8 = 0.0;

         do {
            hx $$9 = $$6.d();
            dja $$10 = ccc.this.dM().a_($$9);
            if ($$10.d(ccc.this.dM(), $$9, ic.b)) {
               if (!ccc.this.dM().u($$6)) {
                  dja $$11 = ccc.this.dM().a_($$6);
                  emf $$12 = $$11.k(ccc.this.dM(), $$6);
                  if (!$$12.c()) {
                     $$8 = $$12.c(ic.a.b);
                  }
               }

               $$7 = true;
               break;
            }

            $$6 = $$6.d();
         } while ($$6.v() >= aui.a($$2) - 1);

         if ($$7) {
            ccc.this.dM().b(new cfl(ccc.this.dM(), $$0, (double)$$6.v() + $$8, $$1, $$4, $$5, ccc.this));
            ccc.this.dM().a(dnk.t, new elm($$0, (double)$$6.v() + $$8, $$1), dnk.a.a(ccc.this));
         }
      }

      @Override
      protected arl l() {
         return arm.hZ;
      }

      @Override
      protected cct.a m() {
         return cct.a.c;
      }
   }

   class b extends cct.b {
      @Override
      public void e() {
         if (ccc.this.q() != null) {
            ccc.this.I().a(ccc.this.q(), (float)ccc.this.ab(), (float)ccc.this.aa());
         } else if (ccc.this.gx() != null) {
            ccc.this.I().a(ccc.this.gx(), (float)ccc.this.ab(), (float)ccc.this.aa());
         }
      }
   }

   class c extends cct.c {
      private final bwt e = bwt.b().a(16.0).d().e();

      @Override
      public boolean a() {
         if (!super.a()) {
            return false;
         } else {
            int $$0 = ccc.this.dM().a(ccx.class, this.e, ccc.this, ccc.this.cH().g(16.0)).size();
            return ccc.this.ag.a(8) + 1 > $$0;
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
         amz $$0 = (amz)ccc.this.dM();
         eml $$1 = ccc.this.cg();

         for (int $$2 = 0; $$2 < 3; $$2++) {
            hx $$3 = ccc.this.dm().b(-2 + ccc.this.ag.a(5), 1, -2 + ccc.this.ag.a(5));
            ccx $$4 = blt.bf.a(ccc.this.dM());
            if ($$4 != null) {
               $$4.a($$3, 0.0F, 0.0F);
               $$4.a($$0, ccc.this.dM().d_($$3), bmj.f, null, null);
               $$4.a(ccc.this);
               $$4.i($$3);
               $$4.b(20 * (30 + ccc.this.ag.a(90)));
               if ($$1 != null) {
                  $$0.f().a($$4.cy(), $$1);
               }

               $$0.a_($$4);
               $$0.a(dnk.t, $$3, dnk.a.a(ccc.this));
            }
         }
      }

      @Override
      protected arl l() {
         return arm.ia;
      }

      @Override
      protected cct.a m() {
         return cct.a.b;
      }
   }

   public class d extends cct.c {
      private final bwt e = bwt.b().a(16.0).a($$0x -> ((byo)$$0x).w() == clf.l);

      @Override
      public boolean a() {
         if (ccc.this.q() != null) {
            return false;
         } else if (ccc.this.go()) {
            return false;
         } else if (ccc.this.ah < this.c) {
            return false;
         } else if (!ccc.this.dM().Z().b(cte.c)) {
            return false;
         } else {
            List<byo> $$0 = ccc.this.dM().a(byo.class, this.e, ccc.this, ccc.this.cH().c(16.0, 4.0, 16.0));
            if ($$0.isEmpty()) {
               return false;
            } else {
               ccc.this.a($$0.get(ccc.this.ag.a($$0.size())));
               return true;
            }
         }
      }

      @Override
      public boolean b() {
         return ccc.this.gx() != null && this.b > 0;
      }

      @Override
      public void d() {
         super.d();
         ccc.this.a(null);
      }

      @Override
      protected void k() {
         byo $$0 = ccc.this.gx();
         if ($$0 != null && $$0.bx()) {
            $$0.b(clf.o);
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
      protected arl l() {
         return arm.ib;
      }

      @Override
      protected cct.a m() {
         return cct.a.d;
      }
   }
}
