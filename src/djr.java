import java.util.Optional;
import javax.annotation.Nullable;

public class djr extends djl implements bmc {
   private static final int a = 2;
   private static final int b = 4;
   private final iu<cpq> c = iu.a(4, cpq.h);
   private final int[] d = new int[4];
   private final int[] e = new int[4];
   private final csv.a<bme, csg> f = csv.b(csx.e);

   public djr(ib $$0, dme $$1) {
      super(djn.G, $$0, $$1);
   }

   public static void a(cwe $$0, ib $$1, dme $$2, djr $$3) {
      boolean $$4 = false;

      for (int $$5 = 0; $$5 < $$3.c.size(); $$5++) {
         cpq $$6 = $$3.c.get($$5);
         if (!$$6.b()) {
            $$4 = true;
            $$3.d[$$5]++;
            if ($$3.d[$$5] >= $$3.e[$$5]) {
               bme $$7 = new bmu($$6);
               cpq $$8 = $$3.f.a($$7, $$0).map($$2x -> ((csg)$$2x.b()).a($$7, $$0.I_())).orElse($$6);
               if ($$8.a($$0.I())) {
                  bmh.a($$0, (double)$$1.u(), (double)$$1.v(), (double)$$1.w(), $$8);
                  $$3.c.set($$5, cpq.h);
                  $$0.a($$1, $$2, $$2, 3);
                  $$0.a(dqr.c, $$1, dqr.a.a($$2));
               }
            }
         }
      }

      if ($$4) {
         a($$0, $$1, $$2);
      }
   }

   public static void b(cwe $$0, ib $$1, dme $$2, djr $$3) {
      boolean $$4 = false;

      for (int $$5 = 0; $$5 < $$3.c.size(); $$5++) {
         if ($$3.d[$$5] > 0) {
            $$4 = true;
            $$3.d[$$5] = awm.a($$3.d[$$5] - 2, 0, $$3.e[$$5]);
         }
      }

      if ($$4) {
         a($$0, $$1, $$2);
      }
   }

   public static void c(cwe $$0, ib $$1, dme $$2, djr $$3) {
      awt $$4 = $$0.z;
      if ($$4.i() < 0.11F) {
         for (int $$5 = 0; $$5 < $$4.a(2) + 2; $$5++) {
            czt.a($$0, $$1, $$2.c(czt.d), false);
         }
      }

      int $$6 = $$2.c(czt.f).e();

      for (int $$7 = 0; $$7 < $$3.c.size(); $$7++) {
         if (!$$3.c.get($$7).b() && $$4.i() < 0.2F) {
            ih $$8 = ih.b(Math.floorMod($$7 + $$6, 4));
            float $$9 = 0.3125F;
            double $$10 = (double)$$1.u() + 0.5 - (double)((float)$$8.j() * 0.3125F) + (double)((float)$$8.h().j() * 0.3125F);
            double $$11 = (double)$$1.v() + 0.5;
            double $$12 = (double)$$1.w() + 0.5 - (double)((float)$$8.l() * 0.3125F) + (double)((float)$$8.h().l() * 0.3125F);

            for (int $$13 = 0; $$13 < 4; $$13++) {
               $$0.a(kb.ab, $$10, $$11, $$12, 0.0, 5.0E-4, 0.0);
            }
         }
      }
   }

   public iu<cpq> b() {
      return this.c;
   }

   @Override
   public void a(sy $$0, in.a $$1) {
      super.a($$0, $$1);
      this.c.clear();
      bmf.b($$0, this.c);
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
   protected void b(sy $$0, in.a $$1) {
      super.b($$0, $$1);
      bmf.a($$0, this.c, true);
      $$0.a("CookingTimes", this.d);
      $$0.a("CookingTotalTimes", this.e);
   }

   public aap c() {
      return aap.a(this);
   }

   @Override
   public sy a(in.a $$0) {
      sy $$1 = new sy();
      bmf.a($$1, this.c, true);
      return $$1;
   }

   public Optional<csu<csg>> a(cpq $$0) {
      return this.c.stream().noneMatch(cpq::b) ? Optional.empty() : this.f.a(new bmu($$0), this.o);
   }

   public boolean a(@Nullable bof $$0, cpq $$1, int $$2) {
      for (int $$3 = 0; $$3 < this.c.size(); $$3++) {
         cpq $$4 = this.c.get($$3);
         if ($$4.b()) {
            this.e[$$3] = $$2;
            this.d[$$3] = 0;
            this.c.set($$3, $$1.a(1));
            this.o.a(dqr.c, this.aD_(), dqr.a.a($$0, this.n()));
            this.f();
            return true;
         }
      }

      return false;
   }

   private void f() {
      this.e();
      this.i().a(this.aD_(), this.n(), this.n(), 3);
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
