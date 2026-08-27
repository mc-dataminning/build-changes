import java.util.Optional;
import javax.annotation.Nullable;

public class dqi extends dqc implements bpr {
   private static final int b = 2;
   private static final int c = 4;
   private final jj<cuh> d = jj.a(4, cuh.i);
   private final int[] e = new int[4];
   private final int[] f = new int[4];
   public final boolean a;
   private final czd.a<bpt, cym> g = czd.b(czf.e);

   public dqi(ir $$0, dtc $$1) {
      super(dqe.H, $$0, $$1);
      this.a = $$1.a(dfe.ph);
   }

   public static void a(dca $$0, ir $$1, dtc $$2, dqi $$3) {
      boolean $$4 = false;

      for (int $$5 = 0; $$5 < $$3.d.size(); $$5++) {
         cuh $$6 = $$3.d.get($$5);
         if (!$$6.d()) {
            $$4 = true;
            $$3.e[$$5]++;
            if ($$3.e[$$5] >= $$3.f[$$5]) {
               bpt $$7 = new bqj($$6);
               cuh $$8 = $$3.g.a($$7, $$0).map($$2x -> ((cym)$$2x.b()).a($$7, $$0.I_())).orElse($$6);
               if ($$8.a($$0.K())) {
                  bpw.a($$0, (double)$$1.u(), (double)$$1.v(), (double)$$1.w(), $$8);
                  $$3.d.set($$5, cuh.i);
                  $$0.a($$1, $$2, $$2, 3);
                  $$0.a(dxv.c, $$1, dxv.a.a($$2));
               }
            }
         }
      }

      if ($$4) {
         a($$0, $$1, $$2);
      }
   }

   public static void b(dca $$0, ir $$1, dtc $$2, dqi $$3) {
      boolean $$4 = false;

      for (int $$5 = 0; $$5 < $$3.d.size(); $$5++) {
         if ($$3.e[$$5] > 0) {
            $$4 = true;
            $$3.e[$$5] = aym.a($$3.e[$$5] - 2, 0, $$3.f[$$5]);
         }
      }

      if ($$4) {
         a($$0, $$1, $$2);
      }
   }

   public static void c(dca $$0, ir $$1, dtc $$2, dqi $$3) {
      ayt $$4 = $$0.A;
      if ($$4.i() < 0.11F) {
         for (int $$5 = 0; $$5 < $$4.a(2) + 2; $$5++) {
            dfq.a($$0, $$1, $$2.c(dfq.e), false);
         }
      }

      int $$6 = $$2.c(dfq.g).e();

      for (int $$7 = 0; $$7 < $$3.d.size(); $$7++) {
         if (!$$3.d.get($$7).d() && $$4.i() < 0.2F) {
            iw $$8 = iw.b(Math.floorMod($$7 + $$6, 4));
            float $$9 = 0.3125F;
            double $$10 = (double)$$1.u() + 0.5 - (double)((float)$$8.j() * 0.3125F) + (double)((float)$$8.h().j() * 0.3125F);
            double $$11 = (double)$$1.v() + 0.5;
            double $$12 = (double)$$1.w() + 0.5 - (double)((float)$$8.l() * 0.3125F) + (double)((float)$$8.h().l() * 0.3125F);

            for (int $$13 = 0; $$13 < 4; $$13++) {
               $$0.a(lb.ac, $$10, $$11, $$12, 0.0, 5.0E-4, 0.0);
            }
         }
      }
   }

   public jj<cuh> b() {
      return this.d;
   }

   @Override
   public void a(uk $$0, jc.a $$1) {
      super.a($$0, $$1);
      this.d.clear();
      bpu.b($$0, this.d, $$1);
      if ($$0.b("CookingTimes", 11)) {
         int[] $$2 = $$0.n("CookingTimes");
         System.arraycopy($$2, 0, this.e, 0, Math.min(this.f.length, $$2.length));
      }

      if ($$0.b("CookingTotalTimes", 11)) {
         int[] $$3 = $$0.n("CookingTotalTimes");
         System.arraycopy($$3, 0, this.f, 0, Math.min(this.f.length, $$3.length));
      }
   }

   @Override
   protected void b(uk $$0, jc.a $$1) {
      super.b($$0, $$1);
      bpu.a($$0, this.d, true, $$1);
      $$0.a("CookingTimes", this.e);
      $$0.a("CookingTotalTimes", this.f);
   }

   public ace c() {
      return ace.a(this);
   }

   @Override
   public uk a(jc.a $$0) {
      uk $$1 = new uk();
      bpu.a($$1, this.d, true, $$0);
      return $$1;
   }

   public Optional<czc<cym>> a(cuh $$0) {
      if (this.a && !this.b($$0)) {
         return Optional.empty();
      } else {
         return this.d.stream().noneMatch(cuh::d) ? Optional.empty() : this.g.a(new bqj($$0), this.n);
      }
   }

   private boolean b(cuh $$0) {
      return $$0.a(cuk.vI) ? true : cuk.AC.a($$0);
   }

   public boolean a(@Nullable brv $$0, cuh $$1, int $$2) {
      for (int $$3 = 0; $$3 < this.d.size(); $$3++) {
         cuh $$4 = this.d.get($$3);
         if ($$4.d()) {
            this.f[$$3] = $$2;
            this.e[$$3] = 0;
            this.d.set($$3, $$1.a(1));
            this.n.a(dxv.c, this.az_(), dxv.a.a($$0, this.n()));
            this.f();
            return true;
         }
      }

      return false;
   }

   private void f() {
      this.e();
      this.i().a(this.az_(), this.n(), this.n(), 3);
   }

   @Override
   public void a() {
      this.d.clear();
   }

   public void d() {
      if (this.n != null) {
         this.f();
      }
   }

   @Override
   public void a(ka $$0) {
      $$0.a(ke.Z, cxm.a).a(this.b());
   }

   @Override
   public void a(ka.a $$0) {
      $$0.a(ke.Z, cxm.a(this.b()));
   }

   @Override
   public void a(uk $$0) {
      $$0.r("Items");
   }
}
