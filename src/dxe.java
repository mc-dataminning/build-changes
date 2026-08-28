import java.util.Optional;
import javax.annotation.Nullable;

public class dxe extends dwx implements bts {
   private static final int a = 2;
   private static final int b = 4;
   private final jn<cyy> c = jn.a(4, cyy.k);
   private final int[] d = new int[4];
   private final int[] e = new int[4];

   public dxe(iu $$0, dzz $$1) {
      super(dwz.H, $$0, $$1);
   }

   public static void a(arq $$0, iu $$1, dzz $$2, dxe $$3, ddw.a<dei, dda> $$4) {
      boolean $$5 = false;

      for (int $$6 = 0; $$6 < $$3.c.size(); $$6++) {
         cyy $$7 = $$3.c.get($$6);
         if (!$$7.f()) {
            $$5 = true;
            $$3.d[$$6]++;
            if ($$3.d[$$6] >= $$3.e[$$6]) {
               dei $$8 = new dei($$7);
               cyy $$9 = $$4.a($$8, $$0).map($$2x -> ((dda)$$2x.b()).a($$8, $$0.F_())).orElse($$7);
               if ($$9.a($$0.K())) {
                  btx.a($$0, (double)$$1.u(), (double)$$1.v(), (double)$$1.w(), $$9);
                  $$3.c.set($$6, cyy.k);
                  $$0.a($$1, $$2, $$2, 3);
                  $$0.a(eez.c, $$1, eez.a.a($$2));
               }
            }
         }
      }

      if ($$5) {
         a($$0, $$1, $$2);
      }
   }

   public static void a(div $$0, iu $$1, dzz $$2, dxe $$3) {
      boolean $$4 = false;

      for (int $$5 = 0; $$5 < $$3.c.size(); $$5++) {
         if ($$3.d[$$5] > 0) {
            $$4 = true;
            $$3.d[$$5] = azm.a($$3.d[$$5] - 2, 0, $$3.e[$$5]);
         }
      }

      if ($$4) {
         a($$0, $$1, $$2);
      }
   }

   public static void b(div $$0, iu $$1, dzz $$2, dxe $$3) {
      azv $$4 = $$0.A;
      if ($$4.i() < 0.11F) {
         for (int $$5 = 0; $$5 < $$4.a(2) + 2; $$5++) {
            dmp.a($$0, $$1, $$2.c(dmp.c), false);
         }
      }

      int $$6 = $$2.c(dmp.e).e();

      for (int $$7 = 0; $$7 < $$3.c.size(); $$7++) {
         if (!$$3.c.get($$7).f() && $$4.i() < 0.2F) {
            ja $$8 = ja.b(Math.floorMod($$7 + $$6, 4));
            float $$9 = 0.3125F;
            double $$10 = (double)$$1.u() + 0.5 - (double)((float)$$8.j() * 0.3125F) + (double)((float)$$8.h().j() * 0.3125F);
            double $$11 = (double)$$1.v() + 0.5;
            double $$12 = (double)$$1.w() + 0.5 - (double)((float)$$8.l() * 0.3125F) + (double)((float)$$8.h().l() * 0.3125F);

            for (int $$13 = 0; $$13 < 4; $$13++) {
               $$0.a(lx.ah, $$10, $$11, $$12, 0.0, 5.0E-4, 0.0);
            }
         }
      }
   }

   public jn<cyy> c() {
      return this.c;
   }

   @Override
   protected void a(tz $$0, jg.a $$1) {
      super.a($$0, $$1);
      this.c.clear();
      btv.b($$0, this.c, $$1);
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
   protected void b(tz $$0, jg.a $$1) {
      super.b($$0, $$1);
      btv.a($$0, this.c, true, $$1);
      $$0.a("CookingTimes", this.d);
      $$0.a("CookingTotalTimes", this.e);
   }

   public aca d() {
      return aca.a(this);
   }

   @Override
   public tz a(jg.a $$0) {
      tz $$1 = new tz();
      btv.a($$1, this.c, true, $$0);
      return $$1;
   }

   public boolean a(arq $$0, @Nullable bxc $$1, cyy $$2) {
      for (int $$3 = 0; $$3 < this.c.size(); $$3++) {
         cyy $$4 = this.c.get($$3);
         if ($$4.f()) {
            Optional<ddu<dda>> $$5 = $$0.t().a(dea.e, new dei($$2), $$0);
            if ($$5.isEmpty()) {
               return false;
            }

            this.e[$$3] = $$5.get().b().d();
            this.d[$$3] = 0;
            this.c.set($$3, $$2.b(1, $$1));
            $$0.a(eez.c, this.aw_(), eez.a.a($$1, this.m()));
            this.f();
            return true;
         }
      }

      return false;
   }

   private void f() {
      this.e();
      this.i().a(this.aw_(), this.m(), this.m(), 3);
   }

   @Override
   public void a() {
      this.c.clear();
   }

   @Override
   public void a(iu $$0, dzz $$1) {
      if (this.n != null) {
         btx.a(this.n, $$0, this.c());
      }
   }

   @Override
   protected void a(ke $$0) {
      super.a($$0);
      $$0.a(kj.ap, dbq.a).a(this.c());
   }

   @Override
   protected void a(kg.a $$0) {
      super.a($$0);
      $$0.a(kj.ap, dbq.a(this.c()));
   }

   @Override
   public void a(tz $$0) {
      $$0.r("Items");
   }
}
