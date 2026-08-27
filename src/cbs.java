import java.util.List;
import javax.annotation.Nullable;

public class cbs extends ccj {
   @Nullable
   private bye e;

   public cbs(blj<? extends cbs> $$0, csy $$1) {
      super($$0, $$1);
      this.bJ = 10;
   }

   @Override
   protected void B() {
      super.B();
      this.bO.a(0, new bsl(this));
      this.bO.a(1, new cbs.b());
      this.bO.a(2, new bry<>(this, cer.class, 8.0F, 0.6, 1.0));
      this.bO.a(4, new cbs.c());
      this.bO.a(5, new cbs.a());
      this.bO.a(6, new cbs.d());
      this.bO.a(8, new bto(this, 0.6));
      this.bO.a(9, new bsz(this, cer.class, 3.0F, 1.0F));
      this.bO.a(10, new bsz(this, blx.class, 8.0F));
      this.bP.a(1, new buj(this, cga.class).a());
      this.bP.a(2, new buk<>(this, cer.class, true).c(300));
      this.bP.a(3, new buk<>(this, cdz.class, false).c(300));
      this.bP.a(3, new buk<>(this, bxu.class, false));
   }

   public static bna.a w() {
      return cbz.gk().a(bnb.m, 0.5).a(bnb.g, 12.0).a(bnb.l, 24.0);
   }

   @Override
   protected void c_() {
      super.c_();
   }

   @Override
   public void a(sj $$0) {
      super.a($$0);
   }

   @Override
   public arb af_() {
      return arc.hV;
   }

   @Override
   public void b(sj $$0) {
      super.b($$0);
   }

   @Override
   protected void Z() {
      super.Z();
   }

   @Override
   public boolean s(blf $$0) {
      if ($$0 == null) {
         return false;
      } else if ($$0 == this) {
         return true;
      } else if (super.s($$0)) {
         return true;
      } else if ($$0 instanceof ccn) {
         return this.s(((ccn)$$0).A());
      } else {
         return $$0 instanceof blv && ((blv)$$0).eS() == bma.d ? this.cg() == null && $$0.cg() == null : false;
      }
   }

   @Override
   protected arb y() {
      return arc.hT;
   }

   @Override
   protected arb n_() {
      return arc.hW;
   }

   @Override
   protected arb d(bkd $$0) {
      return arc.hY;
   }

   void a(@Nullable bye $$0) {
      this.e = $$0;
   }

   @Nullable
   bye gx() {
      return this.e;
   }

   @Override
   protected arb ge() {
      return arc.hU;
   }

   @Override
   public void a(int $$0, boolean $$1) {
   }

   class a extends ccj.c {
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
         blv $$0 = cbs.this.q();
         double $$1 = Math.min($$0.dt(), cbs.this.dt());
         double $$2 = Math.max($$0.dt(), cbs.this.dt()) + 1.0;
         float $$3 = (float)aty.d($$0.dx() - cbs.this.dx(), $$0.dr() - cbs.this.dr());
         if (cbs.this.f((blf)$$0) < 9.0) {
            for (int $$4 = 0; $$4 < 5; $$4++) {
               float $$5 = $$3 + (float)$$4 * (float) Math.PI * 0.4F;
               this.a(cbs.this.dr() + (double)aty.b($$5) * 1.5, cbs.this.dx() + (double)aty.a($$5) * 1.5, $$1, $$2, $$5, 0);
            }

            for (int $$6 = 0; $$6 < 8; $$6++) {
               float $$7 = $$3 + (float)$$6 * (float) Math.PI * 2.0F / 8.0F + (float) (Math.PI * 2.0 / 5.0);
               this.a(cbs.this.dr() + (double)aty.b($$7) * 2.5, cbs.this.dx() + (double)aty.a($$7) * 2.5, $$1, $$2, $$7, 3);
            }
         } else {
            for (int $$8 = 0; $$8 < 16; $$8++) {
               double $$9 = 1.25 * (double)($$8 + 1);
               int $$10 = 1 * $$8;
               this.a(cbs.this.dr() + (double)aty.b($$3) * $$9, cbs.this.dx() + (double)aty.a($$3) * $$9, $$1, $$2, $$3, $$10);
            }
         }
      }

      private void a(double $$0, double $$1, double $$2, double $$3, float $$4, int $$5) {
         hv $$6 = hv.a($$0, $$3, $$1);
         boolean $$7 = false;
         double $$8 = 0.0;

         do {
            hv $$9 = $$6.d();
            dip $$10 = cbs.this.dM().a_($$9);
            if ($$10.d(cbs.this.dM(), $$9, ia.b)) {
               if (!cbs.this.dM().t($$6)) {
                  dip $$11 = cbs.this.dM().a_($$6);
                  elu $$12 = $$11.k(cbs.this.dM(), $$6);
                  if (!$$12.c()) {
                     $$8 = $$12.c(ia.a.b);
                  }
               }

               $$7 = true;
               break;
            }

            $$6 = $$6.d();
         } while ($$6.v() >= aty.a($$2) - 1);

         if ($$7) {
            cbs.this.dM().b(new cfb(cbs.this.dM(), $$0, (double)$$6.v() + $$8, $$1, $$4, $$5, cbs.this));
            cbs.this.dM().a(dmz.t, new elb($$0, (double)$$6.v() + $$8, $$1), dmz.a.a(cbs.this));
         }
      }

      @Override
      protected arb l() {
         return arc.hZ;
      }

      @Override
      protected ccj.a m() {
         return ccj.a.c;
      }
   }

   class b extends ccj.b {
      @Override
      public void e() {
         if (cbs.this.q() != null) {
            cbs.this.I().a(cbs.this.q(), (float)cbs.this.ab(), (float)cbs.this.aa());
         } else if (cbs.this.gx() != null) {
            cbs.this.I().a(cbs.this.gx(), (float)cbs.this.ab(), (float)cbs.this.aa());
         }
      }
   }

   class c extends ccj.c {
      private final bwj e = bwj.b().a(16.0).d().e();

      @Override
      public boolean a() {
         if (!super.a()) {
            return false;
         } else {
            int $$0 = cbs.this.dM().a(ccn.class, this.e, cbs.this, cbs.this.cH().g(16.0)).size();
            return cbs.this.ag.a(8) + 1 > $$0;
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
         amp $$0 = (amp)cbs.this.dM();
         ely $$1 = cbs.this.cg();

         for (int $$2 = 0; $$2 < 3; $$2++) {
            hv $$3 = cbs.this.dm().b(-2 + cbs.this.ag.a(5), 1, -2 + cbs.this.ag.a(5));
            ccn $$4 = blj.bf.a(cbs.this.dM());
            if ($$4 != null) {
               $$4.a($$3, 0.0F, 0.0F);
               $$4.a($$0, cbs.this.dM().d_($$3), blz.f, null, null);
               $$4.a(cbs.this);
               $$4.i($$3);
               $$4.b(20 * (30 + cbs.this.ag.a(90)));
               if ($$1 != null) {
                  $$0.f().a($$4.cy(), $$1);
               }

               $$0.a_($$4);
               $$0.a(dmz.t, $$3, dmz.a.a(cbs.this));
            }
         }
      }

      @Override
      protected arb l() {
         return arc.ia;
      }

      @Override
      protected ccj.a m() {
         return ccj.a.b;
      }
   }

   public class d extends ccj.c {
      private final bwj e = bwj.b().a(16.0).a($$0x -> ((bye)$$0x).w() == ckv.l);

      @Override
      public boolean a() {
         if (cbs.this.q() != null) {
            return false;
         } else if (cbs.this.go()) {
            return false;
         } else if (cbs.this.ah < this.c) {
            return false;
         } else if (!cbs.this.dM().Y().b(csu.c)) {
            return false;
         } else {
            List<bye> $$0 = cbs.this.dM().a(bye.class, this.e, cbs.this, cbs.this.cH().c(16.0, 4.0, 16.0));
            if ($$0.isEmpty()) {
               return false;
            } else {
               cbs.this.a($$0.get(cbs.this.ag.a($$0.size())));
               return true;
            }
         }
      }

      @Override
      public boolean b() {
         return cbs.this.gx() != null && this.b > 0;
      }

      @Override
      public void d() {
         super.d();
         cbs.this.a(null);
      }

      @Override
      protected void k() {
         bye $$0 = cbs.this.gx();
         if ($$0 != null && $$0.bx()) {
            $$0.b(ckv.o);
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
      protected arb l() {
         return arc.ib;
      }

      @Override
      protected ccj.a m() {
         return ccj.a.d;
      }
   }
}
