import java.util.Optional;
import javax.annotation.Nullable;

public class dko extends dki implements bmu {
   private static final int a = 2;
   private static final int b = 4;
   private final iu<cqm> c = iu.a(4, cqm.h);
   private final int[] d = new int[4];
   private final int[] e = new int[4];
   private final cts.a<bmw, ctd> f = cts.b(ctu.e);

   public dko(ib $$0, dnb $$1) {
      super(dkk.G, $$0, $$1);
   }

   public static void a(cxb $$0, ib $$1, dnb $$2, dko $$3) {
      boolean $$4 = false;

      for (int $$5 = 0; $$5 < $$3.c.size(); $$5++) {
         cqm $$6 = $$3.c.get($$5);
         if (!$$6.b()) {
            $$4 = true;
            $$3.d[$$5]++;
            if ($$3.d[$$5] >= $$3.e[$$5]) {
               bmw $$7 = new bnm($$6);
               cqm $$8 = $$3.f.a($$7, $$0).map($$2x -> ((ctd)$$2x.b()).a($$7, $$0.H_())).orElse($$6);
               if ($$8.a($$0.I())) {
                  bmz.a($$0, (double)$$1.u(), (double)$$1.v(), (double)$$1.w(), $$8);
                  $$3.c.set($$5, cqm.h);
                  $$0.a($$1, $$2, $$2, 3);
                  $$0.a(drp.c, $$1, drp.a.a($$2));
               }
            }
         }
      }

      if ($$4) {
         a($$0, $$1, $$2);
      }
   }

   public static void b(cxb $$0, ib $$1, dnb $$2, dko $$3) {
      boolean $$4 = false;

      for (int $$5 = 0; $$5 < $$3.c.size(); $$5++) {
         if ($$3.d[$$5] > 0) {
            $$4 = true;
            $$3.d[$$5] = aww.a($$3.d[$$5] - 2, 0, $$3.e[$$5]);
         }
      }

      if ($$4) {
         a($$0, $$1, $$2);
      }
   }

   public static void c(cxb $$0, ib $$1, dnb $$2, dko $$3) {
      axd $$4 = $$0.z;
      if ($$4.i() < 0.11F) {
         for (int $$5 = 0; $$5 < $$4.a(2) + 2; $$5++) {
            daq.a($$0, $$1, $$2.c(daq.d), false);
         }
      }

      int $$6 = $$2.c(daq.f).e();

      for (int $$7 = 0; $$7 < $$3.c.size(); $$7++) {
         if (!$$3.c.get($$7).b() && $$4.i() < 0.2F) {
            ih $$8 = ih.b(Math.floorMod($$7 + $$6, 4));
            float $$9 = 0.3125F;
            double $$10 = (double)$$1.u() + 0.5 - (double)((float)$$8.j() * 0.3125F) + (double)((float)$$8.h().j() * 0.3125F);
            double $$11 = (double)$$1.v() + 0.5;
            double $$12 = (double)$$1.w() + 0.5 - (double)((float)$$8.l() * 0.3125F) + (double)((float)$$8.h().l() * 0.3125F);

            for (int $$13 = 0; $$13 < 4; $$13++) {
               $$0.a(kc.ac, $$10, $$11, $$12, 0.0, 5.0E-4, 0.0);
            }
         }
      }
   }

   public iu<cqm> b() {
      return this.c;
   }

   @Override
   public void a(ta $$0, in.a $$1) {
      super.a($$0, $$1);
      this.c.clear();
      bmx.b($$0, this.c);
      if ($$0.b("CookingTimes", 11)) {
         int[] $$2 = $$0.n("CookingTimes");
         System.arraycopy($$2, 0, this.d, 0, Math.min(this.e.length, $$2.length));
      }

      if ($$0.b("CookingTotalTimes", 11)) {
         int[] $$3 = $$0.n("CookingTotalTimes");
         System.arraycopy($$3, 0, this.e, 0, Math.min(this.e.length, $$3.length));
      }
   }

   @Override
   protected void b(ta $$0, in.a $$1) {
      super.b($$0, $$1);
      bmx.a($$0, this.c, true);
      $$0.a("CookingTimes", this.d);
      $$0.a("CookingTotalTimes", this.e);
   }

   public aat c() {
      return aat.a(this);
   }

   @Override
   public ta a(in.a $$0) {
      ta $$1 = new ta();
      bmx.a($$1, this.c, true);
      return $$1;
   }

   public Optional<ctr<ctd>> a(cqm $$0) {
      return this.c.stream().noneMatch(cqm::b) ? Optional.empty() : this.f.a(new bnm($$0), this.o);
   }

   public boolean a(@Nullable box $$0, cqm $$1, int $$2) {
      for (int $$3 = 0; $$3 < this.c.size(); $$3++) {
         cqm $$4 = this.c.get($$3);
         if ($$4.b()) {
            this.e[$$3] = $$2;
            this.d[$$3] = 0;
            this.c.set($$3, $$1.a(1));
            this.o.a(drp.c, this.aC_(), drp.a.a($$0, this.n()));
            this.f();
            return true;
         }
      }

      return false;
   }

   private void f() {
      this.e();
      this.i().a(this.aC_(), this.n(), this.n(), 3);
   }

   @Override
   public void a() {
      this.c.clear();
   }

   public void d() {
      if (this.o != null) {
         this.f();
      }
   }
}
