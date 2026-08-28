import java.util.Optional;
import javax.annotation.Nullable;

public class dpp extends dpj implements bqn {
   private static final int a = 2;
   private static final int b = 4;
   private final jr<cur> c = jr.a(4, cur.l);
   private final int[] d = new int[4];
   private final int[] e = new int[4];
   private final cza.a<bqp, cyl> f = cza.b(czc.e);

   public dpp(iz $$0, dse $$1) {
      super(dpl.G, $$0, $$1);
   }

   public static void a(dca $$0, iz $$1, dse $$2, dpp $$3) {
      boolean $$4 = false;

      for (int $$5 = 0; $$5 < $$3.c.size(); $$5++) {
         cur $$6 = $$3.c.get($$5);
         if (!$$6.e()) {
            $$4 = true;
            $$3.d[$$5]++;
            if ($$3.d[$$5] >= $$3.e[$$5]) {
               bqp $$7 = new brf($$6);
               cur $$8 = $$3.f.a($$7, $$0).map($$2x -> ((cyl)$$2x.b()).a($$7, $$0.H_())).orElse($$6);
               if ($$8.a($$0.J())) {
                  bqs.a($$0, (double)$$1.u(), (double)$$1.v(), (double)$$1.w(), $$8);
                  $$3.c.set($$5, cur.l);
                  $$0.a($$1, $$2, $$2, 3);
                  $$0.a(dwx.c, $$1, dwx.a.a($$2));
               }
            }
         }
      }

      if ($$4) {
         a($$0, $$1, $$2);
      }
   }

   public static void b(dca $$0, iz $$1, dse $$2, dpp $$3) {
      boolean $$4 = false;

      for (int $$5 = 0; $$5 < $$3.c.size(); $$5++) {
         if ($$3.d[$$5] > 0) {
            $$4 = true;
            $$3.d[$$5] = ayz.a($$3.d[$$5] - 2, 0, $$3.e[$$5]);
         }
      }

      if ($$4) {
         a($$0, $$1, $$2);
      }
   }

   public static void c(dca $$0, iz $$1, dse $$2, dpp $$3) {
      azh $$4 = $$0.z;
      if ($$4.i() < 0.11F) {
         for (int $$5 = 0; $$5 < $$4.a(2) + 2; $$5++) {
            dfp.a($$0, $$1, $$2.c(dfp.d), false);
         }
      }

      int $$6 = $$2.c(dfp.f).e();

      for (int $$7 = 0; $$7 < $$3.c.size(); $$7++) {
         if (!$$3.c.get($$7).e() && $$4.i() < 0.2F) {
            je $$8 = je.b(Math.floorMod($$7 + $$6, 4));
            float $$9 = 0.3125F;
            double $$10 = (double)$$1.u() + 0.5 - (double)((float)$$8.j() * 0.3125F) + (double)((float)$$8.h().j() * 0.3125F);
            double $$11 = (double)$$1.v() + 0.5;
            double $$12 = (double)$$1.w() + 0.5 - (double)((float)$$8.l() * 0.3125F) + (double)((float)$$8.h().l() * 0.3125F);

            for (int $$13 = 0; $$13 < 4; $$13++) {
               $$0.a(li.ae, $$10, $$11, $$12, 0.0, 5.0E-4, 0.0);
            }
         }
      }
   }

   public jr<cur> b() {
      return this.c;
   }

   @Override
   protected void a(us $$0, jk.a $$1) {
      super.a($$0, $$1);
      this.c.clear();
      bqq.b($$0, this.c, $$1);
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
   protected void b(us $$0, jk.a $$1) {
      super.b($$0, $$1);
      bqq.a($$0, this.c, true, $$1);
      $$0.a("CookingTimes", this.d);
      $$0.a("CookingTotalTimes", this.e);
   }

   public acp c() {
      return acp.a(this);
   }

   @Override
   public us a(jk.a $$0) {
      us $$1 = new us();
      bqq.a($$1, this.c, true, $$0);
      return $$1;
   }

   public Optional<cyz<cyl>> b(cur $$0) {
      return this.c.stream().noneMatch(cur::e) ? Optional.empty() : this.f.a(new brf($$0), this.n);
   }

   public boolean a(@Nullable bsw $$0, cur $$1, int $$2) {
      for (int $$3 = 0; $$3 < this.c.size(); $$3++) {
         cur $$4 = this.c.get($$3);
         if ($$4.e()) {
            this.e[$$3] = $$2;
            this.d[$$3] = 0;
            this.c.set($$3, $$1.a(1));
            this.n.a(dwx.c, this.ay_(), dwx.a.a($$0, this.n()));
            this.f();
            return true;
         }
      }

      return false;
   }

   private void f() {
      this.e();
      this.i().a(this.ay_(), this.n(), this.n(), 3);
   }

   @Override
   public void a() {
      this.c.clear();
   }

   public void d() {
      if (this.n != null) {
         this.f();
      }
   }

   @Override
   protected void a(dpj.b $$0) {
      super.a($$0);
      $$0.a(km.aa, cxn.a).a(this.b());
   }

   @Override
   protected void a(ki.a $$0) {
      super.a($$0);
      $$0.a(km.aa, cxn.a(this.b()));
   }

   @Override
   public void a(us $$0) {
      $$0.r("Items");
   }
}
