import java.util.Optional;
import javax.annotation.Nullable;

public class dvs extends dvl implements bth {
   private static final int a = 2;
   private static final int b = 4;
   private final kb<cxy> c = kb.a(4, cxy.k);
   private final int[] d = new int[4];
   private final int[] e = new int[4];

   public dvs(jj $$0, dym $$1) {
      super(dvn.H, $$0, $$1);
   }

   public static void a(arn $$0, jj $$1, dym $$2, dvs $$3, dcs.a<dde, dbw> $$4) {
      boolean $$5 = false;

      for (int $$6 = 0; $$6 < $$3.c.size(); $$6++) {
         cxy $$7 = $$3.c.get($$6);
         if (!$$7.f()) {
            $$5 = true;
            $$3.d[$$6]++;
            if ($$3.d[$$6] >= $$3.e[$$6]) {
               dde $$8 = new dde($$7);
               cxy $$9 = $$4.a($$8, $$0).map($$2x -> ((dbw)$$2x.b()).a($$8, $$0.F_())).orElse($$7);
               if ($$9.a($$0.K())) {
                  btm.a($$0, (double)$$1.u(), (double)$$1.v(), (double)$$1.w(), $$9);
                  $$3.c.set($$6, cxy.k);
                  $$0.a($$1, $$2, $$2, 3);
                  $$0.a(edm.c, $$1, edm.a.a($$2));
               }
            }
         }
      }

      if ($$5) {
         a($$0, $$1, $$2);
      }
   }

   public static void a(dhp $$0, jj $$1, dym $$2, dvs $$3) {
      boolean $$4 = false;

      for (int $$5 = 0; $$5 < $$3.c.size(); $$5++) {
         if ($$3.d[$$5] > 0) {
            $$4 = true;
            $$3.d[$$5] = azk.a($$3.d[$$5] - 2, 0, $$3.e[$$5]);
         }
      }

      if ($$4) {
         a($$0, $$1, $$2);
      }
   }

   public static void b(dhp $$0, jj $$1, dym $$2, dvs $$3) {
      azs $$4 = $$0.A;
      if ($$4.i() < 0.11F) {
         for (int $$5 = 0; $$5 < $$4.a(2) + 2; $$5++) {
            dlj.a($$0, $$1, $$2.c(dlj.c), false);
         }
      }

      int $$6 = $$2.c(dlj.e).e();

      for (int $$7 = 0; $$7 < $$3.c.size(); $$7++) {
         if (!$$3.c.get($$7).f() && $$4.i() < 0.2F) {
            jo $$8 = jo.b(Math.floorMod($$7 + $$6, 4));
            float $$9 = 0.3125F;
            double $$10 = (double)$$1.u() + 0.5 - (double)((float)$$8.j() * 0.3125F) + (double)((float)$$8.h().j() * 0.3125F);
            double $$11 = (double)$$1.v() + 0.5;
            double $$12 = (double)$$1.w() + 0.5 - (double)((float)$$8.l() * 0.3125F) + (double)((float)$$8.h().l() * 0.3125F);

            for (int $$13 = 0; $$13 < 4; $$13++) {
               $$0.a(lv.ah, $$10, $$11, $$12, 0.0, 5.0E-4, 0.0);
            }
         }
      }
   }

   public kb<cxy> c() {
      return this.c;
   }

   @Override
   protected void a(tw $$0, ju.a $$1) {
      super.a($$0, $$1);
      this.c.clear();
      btk.b($$0, this.c, $$1);
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
   protected void b(tw $$0, ju.a $$1) {
      super.b($$0, $$1);
      btk.a($$0, this.c, true, $$1);
      $$0.a("CookingTimes", this.d);
      $$0.a("CookingTotalTimes", this.e);
   }

   public abx d() {
      return abx.a(this);
   }

   @Override
   public tw a(ju.a $$0) {
      tw $$1 = new tw();
      btk.a($$1, this.c, true, $$0);
      return $$1;
   }

   public boolean a(arn $$0, @Nullable bwr $$1, cxy $$2) {
      for (int $$3 = 0; $$3 < this.c.size(); $$3++) {
         cxy $$4 = this.c.get($$3);
         if ($$4.f()) {
            Optional<dcq<dbw>> $$5 = $$0.t().a(dcw.e, new dde($$2), $$0);
            if ($$5.isEmpty()) {
               return false;
            }

            this.e[$$3] = $$5.get().b().d();
            this.d[$$3] = 0;
            this.c.set($$3, $$2.b(1, $$1));
            $$0.a(edm.c, this.aw_(), edm.a.a($$1, this.m()));
            this.j();
            return true;
         }
      }

      return false;
   }

   private void j() {
      this.e();
      this.i().a(this.aw_(), this.m(), this.m(), 3);
   }

   @Override
   public void a() {
      this.c.clear();
   }

   @Override
   public void a(jj $$0, dym $$1) {
      if (this.n != null) {
         btm.a(this.n, $$0, this.c());
      }
   }

   public void f() {
      if (this.n != null) {
         this.j();
      }
   }

   @Override
   protected void a(kr $$0) {
      super.a($$0);
      $$0.a(kx.an, dan.a).a(this.c());
   }

   @Override
   protected void a(kt.a $$0) {
      super.a($$0);
      $$0.a(kx.an, dan.a(this.c()));
   }

   @Override
   public void a(tw $$0) {
      $$0.r("Items");
   }
}
