import java.util.List;
import javax.annotation.Nullable;

public class cci extends ccz {
   @Nullable
   private byu e;

   public cci(blz<? extends cci> $$0, ctp $$1) {
      super($$0, $$1);
      this.bJ = 10;
   }

   @Override
   protected void B() {
      super.B();
      this.bO.a(0, new btb(this));
      this.bO.a(1, new cci.b());
      this.bO.a(2, new bso<>(this, cfi.class, 8.0F, 0.6, 1.0));
      this.bO.a(4, new cci.c());
      this.bO.a(5, new cci.a());
      this.bO.a(6, new cci.d());
      this.bO.a(8, new bue(this, 0.6));
      this.bO.a(9, new btp(this, cfi.class, 3.0F, 1.0F));
      this.bO.a(10, new btp(this, bmn.class, 8.0F));
      this.bP.a(1, new buz(this, cgr.class).a());
      this.bP.a(2, new bva<>(this, cfi.class, true).c(300));
      this.bP.a(3, new bva<>(this, ceq.class, false).c(300));
      this.bP.a(3, new bva<>(this, byk.class, false));
   }

   public static bnq.a w() {
      return ccp.gk().a(bnr.m, 0.5).a(bnr.g, 12.0).a(bnr.l, 24.0);
   }

   @Override
   protected void c_() {
      super.c_();
   }

   @Override
   public void a(sn $$0) {
      super.a($$0);
   }

   @Override
   public arr af_() {
      return ars.hV;
   }

   @Override
   public void b(sn $$0) {
      super.b($$0);
   }

   @Override
   protected void Z() {
      super.Z();
   }

   @Override
   public boolean s(blv $$0) {
      if ($$0 == null) {
         return false;
      } else if ($$0 == this) {
         return true;
      } else if (super.s($$0)) {
         return true;
      } else if ($$0 instanceof cdd) {
         return this.s(((cdd)$$0).A());
      } else {
         return $$0 instanceof bml && ((bml)$$0).eS() == bmq.d ? this.cg() == null && $$0.cg() == null : false;
      }
   }

   @Override
   protected arr y() {
      return ars.hT;
   }

   @Override
   protected arr n_() {
      return ars.hW;
   }

   @Override
   protected arr d(bkt $$0) {
      return ars.hY;
   }

   void a(@Nullable byu $$0) {
      this.e = $$0;
   }

   @Nullable
   byu gx() {
      return this.e;
   }

   @Override
   protected arr ge() {
      return ars.hU;
   }

   @Override
   public void a(int $$0, boolean $$1) {
   }

   class a extends ccz.c {
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
         bml $$0 = cci.this.q();
         double $$1 = Math.min($$0.dt(), cci.this.dt());
         double $$2 = Math.max($$0.dt(), cci.this.dt()) + 1.0;
         float $$3 = (float)auo.d($$0.dx() - cci.this.dx(), $$0.dr() - cci.this.dr());
         if (cci.this.f((blv)$$0) < 9.0) {
            for (int $$4 = 0; $$4 < 5; $$4++) {
               float $$5 = $$3 + (float)$$4 * (float) Math.PI * 0.4F;
               this.a(cci.this.dr() + (double)auo.b($$5) * 1.5, cci.this.dx() + (double)auo.a($$5) * 1.5, $$1, $$2, $$5, 0);
            }

            for (int $$6 = 0; $$6 < 8; $$6++) {
               float $$7 = $$3 + (float)$$6 * (float) Math.PI * 2.0F / 8.0F + (float) (Math.PI * 2.0 / 5.0);
               this.a(cci.this.dr() + (double)auo.b($$7) * 2.5, cci.this.dx() + (double)auo.a($$7) * 2.5, $$1, $$2, $$7, 3);
            }
         } else {
            for (int $$8 = 0; $$8 < 16; $$8++) {
               double $$9 = 1.25 * (double)($$8 + 1);
               int $$10 = 1 * $$8;
               this.a(cci.this.dr() + (double)auo.b($$3) * $$9, cci.this.dx() + (double)auo.a($$3) * $$9, $$1, $$2, $$3, $$10);
            }
         }
      }

      private void a(double $$0, double $$1, double $$2, double $$3, float $$4, int $$5) {
         hx $$6 = hx.a($$0, $$3, $$1);
         boolean $$7 = false;
         double $$8 = 0.0;

         do {
            hx $$9 = $$6.d();
            djh $$10 = cci.this.dM().a_($$9);
            if ($$10.d(cci.this.dM(), $$9, ic.b)) {
               if (!cci.this.dM().u($$6)) {
                  djh $$11 = cci.this.dM().a_($$6);
                  emm $$12 = $$11.k(cci.this.dM(), $$6);
                  if (!$$12.c()) {
                     $$8 = $$12.c(ic.a.b);
                  }
               }

               $$7 = true;
               break;
            }

            $$6 = $$6.d();
         } while ($$6.v() >= auo.a($$2) - 1);

         if ($$7) {
            cci.this.dM().b(new cfs(cci.this.dM(), $$0, (double)$$6.v() + $$8, $$1, $$4, $$5, cci.this));
            cci.this.dM().a(dnr.t, new elt($$0, (double)$$6.v() + $$8, $$1), dnr.a.a(cci.this));
         }
      }

      @Override
      protected arr l() {
         return ars.hZ;
      }

      @Override
      protected ccz.a m() {
         return ccz.a.c;
      }
   }

   class b extends ccz.b {
      @Override
      public void e() {
         if (cci.this.q() != null) {
            cci.this.I().a(cci.this.q(), (float)cci.this.ab(), (float)cci.this.aa());
         } else if (cci.this.gx() != null) {
            cci.this.I().a(cci.this.gx(), (float)cci.this.ab(), (float)cci.this.aa());
         }
      }
   }

   class c extends ccz.c {
      private final bwz e = bwz.b().a(16.0).d().e();

      @Override
      public boolean a() {
         if (!super.a()) {
            return false;
         } else {
            int $$0 = cci.this.dM().a(cdd.class, this.e, cci.this, cci.this.cH().g(16.0)).size();
            return cci.this.ag.a(8) + 1 > $$0;
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
         and $$0 = (and)cci.this.dM();
         ems $$1 = cci.this.cg();

         for (int $$2 = 0; $$2 < 3; $$2++) {
            hx $$3 = cci.this.dm().b(-2 + cci.this.ag.a(5), 1, -2 + cci.this.ag.a(5));
            cdd $$4 = blz.bf.a(cci.this.dM());
            if ($$4 != null) {
               $$4.a($$3, 0.0F, 0.0F);
               $$4.a($$0, cci.this.dM().d_($$3), bmp.f, null, null);
               $$4.a(cci.this);
               $$4.i($$3);
               $$4.b(20 * (30 + cci.this.ag.a(90)));
               if ($$1 != null) {
                  $$0.f().a($$4.cy(), $$1);
               }

               $$0.a_($$4);
               $$0.a(dnr.t, $$3, dnr.a.a(cci.this));
            }
         }
      }

      @Override
      protected arr l() {
         return ars.ia;
      }

      @Override
      protected ccz.a m() {
         return ccz.a.b;
      }
   }

   public class d extends ccz.c {
      private final bwz e = bwz.b().a(16.0).a($$0x -> ((byu)$$0x).w() == clm.l);

      @Override
      public boolean a() {
         if (cci.this.q() != null) {
            return false;
         } else if (cci.this.go()) {
            return false;
         } else if (cci.this.ah < this.c) {
            return false;
         } else if (!cci.this.dM().Z().b(ctl.c)) {
            return false;
         } else {
            List<byu> $$0 = cci.this.dM().a(byu.class, this.e, cci.this, cci.this.cH().c(16.0, 4.0, 16.0));
            if ($$0.isEmpty()) {
               return false;
            } else {
               cci.this.a($$0.get(cci.this.ag.a($$0.size())));
               return true;
            }
         }
      }

      @Override
      public boolean b() {
         return cci.this.gx() != null && this.b > 0;
      }

      @Override
      public void d() {
         super.d();
         cci.this.a(null);
      }

      @Override
      protected void k() {
         byu $$0 = cci.this.gx();
         if ($$0 != null && $$0.bx()) {
            $$0.b(clm.o);
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
      protected arr l() {
         return ars.ib;
      }

      @Override
      protected ccz.a m() {
         return ccz.a.d;
      }
   }
}
