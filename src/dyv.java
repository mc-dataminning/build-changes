import java.util.Arrays;
import java.util.Optional;
import javax.annotation.Nullable;

public class dyv extends dyo implements but {
   private static final int a = 2;
   private static final int b = 4;
   private final jp<dak> c = jp.a(4, dak.l);
   private final int[] d = new int[4];
   private final int[] e = new int[4];

   public dyv(iw $$0, ebq $$1) {
      super(dyq.H, $$0, $$1);
   }

   public static void a(asb $$0, iw $$1, ebq $$2, dyv $$3, dfi.a<dfu, dem> $$4) {
      boolean $$5 = false;

      for (int $$6 = 0; $$6 < $$3.c.size(); $$6++) {
         dak $$7 = $$3.c.get($$6);
         if (!$$7.f()) {
            $$5 = true;
            $$3.d[$$6]++;
            if ($$3.d[$$6] >= $$3.e[$$6]) {
               dfu $$8 = new dfu($$7);
               dak $$9 = $$4.a($$8, $$0).map($$2x -> ((dem)$$2x.b()).a($$8, $$0.J_())).orElse($$7);
               if ($$9.a($$0.K())) {
                  buy.a($$0, (double)$$1.u(), (double)$$1.v(), (double)$$1.w(), $$9);
                  $$3.c.set($$6, dak.l);
                  $$0.a($$1, $$2, $$2, 3);
                  $$0.a(egq.c, $$1, egq.a.a($$2));
               }
            }
         }
      }

      if ($$5) {
         a($$0, $$1, $$2);
      }
   }

   public static void a(dkj $$0, iw $$1, ebq $$2, dyv $$3) {
      boolean $$4 = false;

      for (int $$5 = 0; $$5 < $$3.c.size(); $$5++) {
         if ($$3.d[$$5] > 0) {
            $$4 = true;
            $$3.d[$$5] = azz.a($$3.d[$$5] - 2, 0, $$3.e[$$5]);
         }
      }

      if ($$4) {
         a($$0, $$1, $$2);
      }
   }

   public static void b(dkj $$0, iw $$1, ebq $$2, dyv $$3) {
      bai $$4 = $$0.A;
      if ($$4.i() < 0.11F) {
         for (int $$5 = 0; $$5 < $$4.a(2) + 2; $$5++) {
            doe.a($$0, $$1, $$2.c(doe.c), false);
         }
      }

      int $$6 = $$2.c(doe.e).e();

      for (int $$7 = 0; $$7 < $$3.c.size(); $$7++) {
         if (!$$3.c.get($$7).f() && $$4.i() < 0.2F) {
            jc $$8 = jc.b(Math.floorMod($$7 + $$6, 4));
            float $$9 = 0.3125F;
            double $$10 = (double)$$1.u() + 0.5 - (double)((float)$$8.j() * 0.3125F) + (double)((float)$$8.h().j() * 0.3125F);
            double $$11 = (double)$$1.v() + 0.5;
            double $$12 = (double)$$1.w() + 0.5 - (double)((float)$$8.l() * 0.3125F) + (double)((float)$$8.h().l() * 0.3125F);

            for (int $$13 = 0; $$13 < 4; $$13++) {
               $$0.a(lz.ah, $$10, $$11, $$12, 0.0, 5.0E-4, 0.0);
            }
         }
      }
   }

   public jp<dak> c() {
      return this.c;
   }

   @Override
   protected void a(ua $$0, ji.a $$1) {
      super.a($$0, $$1);
      this.c.clear();
      buw.b($$0, this.c, $$1);
      $$0.k("CookingTimes").ifPresentOrElse($$0x -> System.arraycopy($$0x, 0, this.d, 0, Math.min(this.e.length, $$0x.length)), () -> Arrays.fill(this.d, 0));
      $$0.k("CookingTotalTimes")
         .ifPresentOrElse($$0x -> System.arraycopy($$0x, 0, this.e, 0, Math.min(this.e.length, $$0x.length)), () -> Arrays.fill(this.e, 0));
   }

   @Override
   protected void b(ua $$0, ji.a $$1) {
      super.b($$0, $$1);
      buw.a($$0, this.c, true, $$1);
      $$0.a("CookingTimes", this.d);
      $$0.a("CookingTotalTimes", this.e);
   }

   public acl d() {
      return acl.a(this);
   }

   @Override
   public ua a(ji.a $$0) {
      ua $$1 = new ua();
      buw.a($$1, this.c, true, $$0);
      return $$1;
   }

   public boolean a(asb $$0, @Nullable byf $$1, dak $$2) {
      for (int $$3 = 0; $$3 < this.c.size(); $$3++) {
         dak $$4 = this.c.get($$3);
         if ($$4.f()) {
            Optional<dfg<dem>> $$5 = $$0.t().a(dfm.e, new dfu($$2), $$0);
            if ($$5.isEmpty()) {
               return false;
            }

            this.e[$$3] = $$5.get().b().d();
            this.d[$$3] = 0;
            this.c.set($$3, $$2.b(1, $$1));
            $$0.a(egq.c, this.aC_(), egq.a.a($$1, this.m()));
            this.f();
            return true;
         }
      }

      return false;
   }

   private void f() {
      this.e();
      this.i().a(this.aC_(), this.m(), this.m(), 3);
   }

   @Override
   public void a() {
      this.c.clear();
   }

   @Override
   public void a(iw $$0, ebq $$1) {
      if (this.n != null) {
         buy.a(this.n, $$0, this.c());
      }
   }

   @Override
   protected void a(kg $$0) {
      super.a($$0);
      $$0.a(kl.ap, ddc.a).a(this.c());
   }

   @Override
   protected void a(ki.a $$0) {
      super.a($$0);
      $$0.a(kl.ap, ddc.a(this.c()));
   }

   @Override
   public void a(ua $$0) {
      $$0.r("Items");
   }
}
