import java.util.Optional;
import javax.annotation.Nullable;

public class dql extends dqf implements bqh {
   private static final int a = 2;
   private static final int b = 4;
   private final jv<cuo> c = jv.a(4, cuo.l);
   private final int[] d = new int[4];
   private final int[] e = new int[4];
   private final czb.a<czn, cyk> f = czb.b(czd.e);

   public dql(jd $$0, dta $$1) {
      super(dqh.G, $$0, $$1);
   }

   public static void a(dcu $$0, jd $$1, dta $$2, dql $$3) {
      boolean $$4 = false;

      for (int $$5 = 0; $$5 < $$3.c.size(); $$5++) {
         cuo $$6 = $$3.c.get($$5);
         if (!$$6.e()) {
            $$4 = true;
            $$3.d[$$5]++;
            if ($$3.d[$$5] >= $$3.e[$$5]) {
               czn $$7 = new czn($$6);
               cuo $$8 = $$3.f.a($$7, $$0).map($$2x -> ((cyk)$$2x.b()).a($$7, $$0.H_())).orElse($$6);
               if ($$8.a($$0.J())) {
                  bqm.a($$0, (double)$$1.u(), (double)$$1.v(), (double)$$1.w(), $$8);
                  $$3.c.set($$5, cuo.l);
                  $$0.a($$1, $$2, $$2, 3);
                  $$0.a(dxw.c, $$1, dxw.a.a($$2));
               }
            }
         }
      }

      if ($$4) {
         a($$0, $$1, $$2);
      }
   }

   public static void b(dcu $$0, jd $$1, dta $$2, dql $$3) {
      boolean $$4 = false;

      for (int $$5 = 0; $$5 < $$3.c.size(); $$5++) {
         if ($$3.d[$$5] > 0) {
            $$4 = true;
            $$3.d[$$5] = ayn.a($$3.d[$$5] - 2, 0, $$3.e[$$5]);
         }
      }

      if ($$4) {
         a($$0, $$1, $$2);
      }
   }

   public static void c(dcu $$0, jd $$1, dta $$2, dql $$3) {
      ayv $$4 = $$0.z;
      if ($$4.i() < 0.11F) {
         for (int $$5 = 0; $$5 < $$4.a(2) + 2; $$5++) {
            dgk.a($$0, $$1, $$2.c(dgk.d), false);
         }
      }

      int $$6 = $$2.c(dgk.f).e();

      for (int $$7 = 0; $$7 < $$3.c.size(); $$7++) {
         if (!$$3.c.get($$7).e() && $$4.i() < 0.2F) {
            ji $$8 = ji.b(Math.floorMod($$7 + $$6, 4));
            float $$9 = 0.3125F;
            double $$10 = (double)$$1.u() + 0.5 - (double)((float)$$8.j() * 0.3125F) + (double)((float)$$8.h().j() * 0.3125F);
            double $$11 = (double)$$1.v() + 0.5;
            double $$12 = (double)$$1.w() + 0.5 - (double)((float)$$8.l() * 0.3125F) + (double)((float)$$8.h().l() * 0.3125F);

            for (int $$13 = 0; $$13 < 4; $$13++) {
               $$0.a(lm.ae, $$10, $$11, $$12, 0.0, 5.0E-4, 0.0);
            }
         }
      }
   }

   public jv<cuo> b() {
      return this.c;
   }

   @Override
   protected void a(ua $$0, jo.a $$1) {
      super.a($$0, $$1);
      this.c.clear();
      bqk.b($$0, this.c, $$1);
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
   protected void b(ua $$0, jo.a $$1) {
      super.b($$0, $$1);
      bqk.a($$0, this.c, true, $$1);
      $$0.a("CookingTimes", this.d);
      $$0.a("CookingTotalTimes", this.e);
   }

   public aca c() {
      return aca.a(this);
   }

   @Override
   public ua a(jo.a $$0) {
      ua $$1 = new ua();
      bqk.a($$1, this.c, true, $$0);
      return $$1;
   }

   public Optional<cyz<cyk>> b(cuo $$0) {
      return this.c.stream().noneMatch(cuo::e) ? Optional.empty() : this.f.a(new czn($$0), this.n);
   }

   public boolean a(@Nullable btl $$0, cuo $$1, int $$2) {
      for (int $$3 = 0; $$3 < this.c.size(); $$3++) {
         cuo $$4 = this.c.get($$3);
         if ($$4.e()) {
            this.e[$$3] = $$2;
            this.d[$$3] = 0;
            this.c.set($$3, $$1.b(1, $$0));
            this.n.a(dxw.c, this.az_(), dxw.a.a($$0, this.n()));
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
      this.c.clear();
   }

   public void d() {
      if (this.n != null) {
         this.f();
      }
   }

   @Override
   protected void a(dqf.b $$0) {
      super.a($$0);
      $$0.a(kq.ab, cxm.a).a(this.b());
   }

   @Override
   protected void a(km.a $$0) {
      super.a($$0);
      $$0.a(kq.ab, cxm.a(this.b()));
   }

   @Override
   public void a(ua $$0) {
      $$0.r("Items");
   }
}
