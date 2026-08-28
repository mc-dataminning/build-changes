import java.util.Optional;
import javax.annotation.Nullable;

public class dvd extends dux implements bta {
   private static final int a = 2;
   private static final int b = 4;
   private final jz<cxp> c = jz.a(4, cxp.j);
   private final int[] d = new int[4];
   private final int[] e = new int[4];

   public dvd(jh $$0, dxv $$1) {
      super(duz.H, $$0, $$1);
   }

   public static void a(ash $$0, jh $$1, dxv $$2, dvd $$3, dcl.a<dcx, dbp> $$4) {
      boolean $$5 = false;

      for (int $$6 = 0; $$6 < $$3.c.size(); $$6++) {
         cxp $$7 = $$3.c.get($$6);
         if (!$$7.f()) {
            $$5 = true;
            $$3.d[$$6]++;
            if ($$3.d[$$6] >= $$3.e[$$6]) {
               dcx $$8 = new dcx($$7);
               cxp $$9 = $$4.a($$8, $$0).map($$2x -> ((dbp)$$2x.b()).a($$8, $$0.K_())).orElse($$7);
               if ($$9.a($$0.J())) {
                  btf.a($$0, (double)$$1.u(), (double)$$1.v(), (double)$$1.w(), $$9);
                  $$3.c.set($$6, cxp.j);
                  $$0.a($$1, $$2, $$2, 3);
                  $$0.a(ecr.c, $$1, ecr.a.a($$2));
               }
            }
         }
      }

      if ($$5) {
         a($$0, $$1, $$2);
      }
   }

   public static void a(dhi $$0, jh $$1, dxv $$2, dvd $$3) {
      boolean $$4 = false;

      for (int $$5 = 0; $$5 < $$3.c.size(); $$5++) {
         if ($$3.d[$$5] > 0) {
            $$4 = true;
            $$3.d[$$5] = bae.a($$3.d[$$5] - 2, 0, $$3.e[$$5]);
         }
      }

      if ($$4) {
         a($$0, $$1, $$2);
      }
   }

   public static void b(dhi $$0, jh $$1, dxv $$2, dvd $$3) {
      bam $$4 = $$0.A;
      if ($$4.i() < 0.11F) {
         for (int $$5 = 0; $$5 < $$4.a(2) + 2; $$5++) {
            dlb.a($$0, $$1, $$2.c(dlb.d), false);
         }
      }

      int $$6 = $$2.c(dlb.f).e();

      for (int $$7 = 0; $$7 < $$3.c.size(); $$7++) {
         if (!$$3.c.get($$7).f() && $$4.i() < 0.2F) {
            jm $$8 = jm.b(Math.floorMod($$7 + $$6, 4));
            float $$9 = 0.3125F;
            double $$10 = (double)$$1.u() + 0.5 - (double)((float)$$8.j() * 0.3125F) + (double)((float)$$8.h().j() * 0.3125F);
            double $$11 = (double)$$1.v() + 0.5;
            double $$12 = (double)$$1.w() + 0.5 - (double)((float)$$8.l() * 0.3125F) + (double)((float)$$8.h().l() * 0.3125F);

            for (int $$13 = 0; $$13 < 4; $$13++) {
               $$0.a(ls.af, $$10, $$11, $$12, 0.0, 5.0E-4, 0.0);
            }
         }
      }
   }

   public jz<cxp> b() {
      return this.c;
   }

   @Override
   protected void a(ux $$0, js.a $$1) {
      super.a($$0, $$1);
      this.c.clear();
      btd.b($$0, this.c, $$1);
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
   protected void b(ux $$0, js.a $$1) {
      super.b($$0, $$1);
      btd.a($$0, this.c, true, $$1);
      $$0.a("CookingTimes", this.d);
      $$0.a("CookingTotalTimes", this.e);
   }

   public acy c() {
      return acy.a(this);
   }

   @Override
   public ux a(js.a $$0) {
      ux $$1 = new ux();
      btd.a($$1, this.c, true, $$0);
      return $$1;
   }

   public boolean a(ash $$0, @Nullable bwg $$1, cxp $$2) {
      for (int $$3 = 0; $$3 < this.c.size(); $$3++) {
         cxp $$4 = this.c.get($$3);
         if ($$4.f()) {
            Optional<dcj<dbp>> $$5 = $$0.s().a(dcp.e, new dcx($$2), $$0);
            if ($$5.isEmpty()) {
               return false;
            }

            this.e[$$3] = $$5.get().b().d();
            this.d[$$3] = 0;
            this.c.set($$3, $$2.b(1, $$1));
            $$0.a(ecr.c, this.aB_(), ecr.a.a($$1, this.m()));
            this.f();
            return true;
         }
      }

      return false;
   }

   private void f() {
      this.e();
      this.i().a(this.aB_(), this.m(), this.m(), 3);
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

   @Override
   protected void a(dux.b $$0) {
      super.a($$0);
      $$0.a(ku.al, dah.a).a(this.b());
   }

   @Override
   protected void a(kq.a $$0) {
      super.a($$0);
      $$0.a(ku.al, dah.a(this.b()));
   }

   @Override
   public void a(ux $$0) {
      $$0.r("Items");
   }
}
