import java.util.List;
import javax.annotation.Nullable;

public class clf extends clw {
   @Nullable
   private chi b;

   public clf(bug<? extends clf> $$0, dev $$1) {
      super($$0, $$1);
      this.bN = 10;
   }

   @Override
   protected void D() {
      super.D();
      this.bS.a(0, new cbn(this));
      this.bS.a(1, new clf.b());
      this.bS.a(2, new cba<>(this, coh.class, 8.0F, 0.6, 1.0));
      this.bS.a(4, new clf.c());
      this.bS.a(5, new clf.a());
      this.bS.a(6, new clf.d());
      this.bS.a(8, new ccq(this, 0.6));
      this.bS.a(9, new ccb(this, coh.class, 3.0F, 1.0F));
      this.bS.a(10, new ccb(this, bux.class, 8.0F));
      this.bT.a(1, new cdl(this, cpw.class).a());
      this.bT.a(2, new cdm<>(this, coh.class, true).c(300));
      this.bT.a(3, new cdm<>(this, cno.class, false).c(300));
      this.bT.a(3, new cdm<>(this, cgy.class, false));
   }

   public static bwc.a t() {
      return clm.gB().a(bwd.v, 0.5).a(bwd.m, 12.0).a(bwd.s, 24.0);
   }

   @Override
   protected void a(ako.a $$0) {
      super.a($$0);
   }

   @Override
   public void a(uj $$0) {
      super.a($$0);
   }

   @Override
   public awj aj_() {
      return awk.iA;
   }

   @Override
   public void b(uj $$0) {
      super.b($$0);
   }

   @Override
   protected void ac() {
      super.ac();
   }

   @Override
   protected boolean t(btz $$0) {
      if ($$0 == this) {
         return true;
      } else if (super.t($$0)) {
         return true;
      } else {
         if ($$0 instanceof cma $$1 && $$1.t() != null) {
            return this.t($$1.t());
         }

         return false;
      }
   }

   @Override
   protected awj w() {
      return awk.iy;
   }

   @Override
   protected awj o_() {
      return awk.iB;
   }

   @Override
   protected awj d(bsp $$0) {
      return awk.iD;
   }

   void a(@Nullable chi $$0) {
      this.b = $$0;
   }

   @Nullable
   chi gQ() {
      return this.b;
   }

   @Override
   protected awj gv() {
      return awk.iz;
   }

   @Override
   public void a(arm $$0, int $$1, boolean $$2) {
   }

   class a extends clw.c {
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
         buv $$0 = clf.this.m();
         double $$1 = Math.min($$0.dE(), clf.this.dE());
         double $$2 = Math.max($$0.dE(), clf.this.dE()) + 1.0;
         float $$3 = (float)azj.d($$0.dI() - clf.this.dI(), $$0.dC() - clf.this.dC());
         if (clf.this.g((btz)$$0) < 9.0) {
            for (int $$4 = 0; $$4 < 5; $$4++) {
               float $$5 = $$3 + (float)$$4 * (float) Math.PI * 0.4F;
               this.a(clf.this.dC() + (double)azj.b($$5) * 1.5, clf.this.dI() + (double)azj.a($$5) * 1.5, $$1, $$2, $$5, 0);
            }

            for (int $$6 = 0; $$6 < 8; $$6++) {
               float $$7 = $$3 + (float)$$6 * (float) Math.PI * 2.0F / 8.0F + (float) (Math.PI * 2.0 / 5.0);
               this.a(clf.this.dC() + (double)azj.b($$7) * 2.5, clf.this.dI() + (double)azj.a($$7) * 2.5, $$1, $$2, $$7, 3);
            }
         } else {
            for (int $$8 = 0; $$8 < 16; $$8++) {
               double $$9 = 1.25 * (double)($$8 + 1);
               int $$10 = 1 * $$8;
               this.a(clf.this.dC() + (double)azj.b($$3) * $$9, clf.this.dI() + (double)azj.a($$3) * $$9, $$1, $$2, $$3, $$10);
            }
         }
      }

      private void a(double $$0, double $$1, double $$2, double $$3, float $$4, int $$5) {
         jg $$6 = jg.a($$0, $$3, $$1);
         boolean $$7 = false;
         double $$8 = 0.0;

         do {
            jg $$9 = $$6.e();
            dvd $$10 = clf.this.dX().a_($$9);
            if ($$10.c(clf.this.dX(), $$9, jl.b)) {
               if (!clf.this.dX().u($$6)) {
                  dvd $$11 = clf.this.dX().a_($$6);
                  fab $$12 = $$11.g(clf.this.dX(), $$6);
                  if (!$$12.c()) {
                     $$8 = $$12.c(jl.a.b);
                  }
               }

               $$7 = true;
               break;
            }

            $$6 = $$6.e();
         } while ($$6.v() >= azj.a($$2) - 1);

         if ($$7) {
            clf.this.dX().b(new cot(clf.this.dX(), $$0, (double)$$6.v() + $$8, $$1, $$4, $$5, clf.this));
            clf.this.dX().a(eaa.t, new ezh($$0, (double)$$6.v() + $$8, $$1), eaa.a.a(clf.this));
         }
      }

      @Override
      protected awj l() {
         return awk.iE;
      }

      @Override
      protected clw.a m() {
         return clw.a.c;
      }
   }

   class b extends clw.b {
      @Override
      public void a() {
         if (clf.this.m() != null) {
            clf.this.K().a(clf.this.m(), (float)clf.this.ae(), (float)clf.this.ad());
         } else if (clf.this.gQ() != null) {
            clf.this.K().a(clf.this.gQ(), (float)clf.this.ae(), (float)clf.this.ad());
         }
      }
   }

   class c extends clw.c {
      private final cfm e = cfm.b().a(16.0).d().e();

      @Override
      public boolean b() {
         if (!super.b()) {
            return false;
         } else {
            int $$0 = clf.this.dX().a(cma.class, this.e, clf.this, clf.this.cS().g(16.0)).size();
            return clf.this.af.a(8) + 1 > $$0;
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
         arm $$0 = (arm)clf.this.dX();
         fah $$1 = clf.this.cs();

         for (int $$2 = 0; $$2 < 3; $$2++) {
            jg $$3 = clf.this.dx().b(-2 + clf.this.af.a(5), 1, -2 + clf.this.af.a(5));
            cma $$4 = bug.bi.a(clf.this.dX(), buf.f);
            if ($$4 != null) {
               $$4.a($$3, 0.0F, 0.0F);
               $$4.a($$0, clf.this.dX().d_($$3), buf.f, null);
               $$4.a(clf.this);
               $$4.h($$3);
               $$4.b(20 * (30 + clf.this.af.a(90)));
               if ($$1 != null) {
                  $$0.f().a($$4.cJ(), $$1);
               }

               $$0.a_($$4);
               $$0.a(eaa.t, $$3, eaa.a.a(clf.this));
            }
         }
      }

      @Override
      protected awj l() {
         return awk.iF;
      }

      @Override
      protected clw.a m() {
         return clw.a.b;
      }
   }

   public class d extends clw.c {
      private final cfm e = cfm.b().a(16.0).a($$0x -> ((chi)$$0x).t() == cuu.l);

      @Override
      public boolean b() {
         if (clf.this.m() != null) {
            return false;
         } else if (clf.this.gF()) {
            return false;
         } else if (clf.this.ag < this.c) {
            return false;
         } else if (!clf.this.dX().ac().b(der.c)) {
            return false;
         } else {
            List<chi> $$0 = clf.this.dX().a(chi.class, this.e, clf.this, clf.this.cS().c(16.0, 4.0, 16.0));
            if ($$0.isEmpty()) {
               return false;
            } else {
               clf.this.a($$0.get(clf.this.af.a($$0.size())));
               return true;
            }
         }
      }

      @Override
      public boolean c() {
         return clf.this.gQ() != null && this.b > 0;
      }

      @Override
      public void e() {
         super.e();
         clf.this.a(null);
      }

      @Override
      protected void k() {
         chi $$0 = clf.this.gQ();
         if ($$0 != null && $$0.bM()) {
            $$0.b(cuu.o);
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
         return awk.iG;
      }

      @Override
      protected clw.a m() {
         return clw.a.d;
      }
   }
}
