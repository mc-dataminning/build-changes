import java.util.Optional;
import javax.annotation.Nullable;

public class dwu extends dwn implements btp {
   private static final int a = 2;
   private static final int b = 4;
   private final jn<cys> c = jn.a(4, cys.k);
   private final int[] d = new int[4];
   private final int[] e = new int[4];

   public dwu(iu $$0, dzo $$1) {
      super(dwp.H, $$0, $$1);
   }

   public static void a(aro $$0, iu $$1, dzo $$2, dwu $$3, ddq.a<dec, dcu> $$4) {
      boolean $$5 = false;

      for (int $$6 = 0; $$6 < $$3.c.size(); $$6++) {
         cys $$7 = $$3.c.get($$6);
         if (!$$7.f()) {
            $$5 = true;
            $$3.d[$$6]++;
            if ($$3.d[$$6] >= $$3.e[$$6]) {
               dec $$8 = new dec($$7);
               cys $$9 = $$4.a($$8, $$0).map($$2x -> ((dcu)$$2x.b()).a($$8, $$0.F_())).orElse($$7);
               if ($$9.a($$0.K())) {
                  btu.a($$0, (double)$$1.u(), (double)$$1.v(), (double)$$1.w(), $$9);
                  $$3.c.set($$6, cys.k);
                  $$0.a($$1, $$2, $$2, 3);
                  $$0.a(eeo.c, $$1, eeo.a.a($$2));
               }
            }
         }
      }

      if ($$5) {
         a($$0, $$1, $$2);
      }
   }

   public static void a(dip $$0, iu $$1, dzo $$2, dwu $$3) {
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

   public static void b(dip $$0, iu $$1, dzo $$2, dwu $$3) {
      azt $$4 = $$0.A;
      if ($$4.i() < 0.11F) {
         for (int $$5 = 0; $$5 < $$4.a(2) + 2; $$5++) {
            dmj.a($$0, $$1, $$2.c(dmj.c), false);
         }
      }

      int $$6 = $$2.c(dmj.e).e();

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

   public jn<cys> c() {
      return this.c;
   }

   @Override
   protected void a(tx $$0, jg.a $$1) {
      super.a($$0, $$1);
      this.c.clear();
      bts.b($$0, this.c, $$1);
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
   protected void b(tx $$0, jg.a $$1) {
      super.b($$0, $$1);
      bts.a($$0, this.c, true, $$1);
      $$0.a("CookingTimes", this.d);
      $$0.a("CookingTotalTimes", this.e);
   }

   public aby d() {
      return aby.a(this);
   }

   @Override
   public tx a(jg.a $$0) {
      tx $$1 = new tx();
      bts.a($$1, this.c, true, $$0);
      return $$1;
   }

   public boolean a(aro $$0, @Nullable bwz $$1, cys $$2) {
      for (int $$3 = 0; $$3 < this.c.size(); $$3++) {
         cys $$4 = this.c.get($$3);
         if ($$4.f()) {
            Optional<ddo<dcu>> $$5 = $$0.t().a(ddu.e, new dec($$2), $$0);
            if ($$5.isEmpty()) {
               return false;
            }

            this.e[$$3] = $$5.get().b().d();
            this.d[$$3] = 0;
            this.c.set($$3, $$2.b(1, $$1));
            $$0.a(eeo.c, this.aw_(), eeo.a.a($$1, this.m()));
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
   public void a(iu $$0, dzo $$1) {
      if (this.n != null) {
         btu.a(this.n, $$0, this.c());
      }
   }

   @Override
   protected void a(ke $$0) {
      super.a($$0);
      $$0.a(kj.ap, dbk.a).a(this.c());
   }

   @Override
   protected void a(kg.a $$0) {
      super.a($$0);
      $$0.a(kj.ap, dbk.a(this.c()));
   }

   @Override
   public void a(tx $$0) {
      $$0.r("Items");
   }
}
