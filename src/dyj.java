import java.util.Arrays;
import java.util.Optional;
import javax.annotation.Nullable;

public class dyj extends dyc implements bui {
   private static final int a = 2;
   private static final int b = 4;
   private final jo<czy> c = jo.a(4, czy.k);
   private final int[] d = new int[4];
   private final int[] e = new int[4];

   public dyj(iv $$0, ebe $$1) {
      super(dye.H, $$0, $$1);
   }

   public static void a(ars $$0, iv $$1, ebe $$2, dyj $$3, dew.a<dfi, dea> $$4) {
      boolean $$5 = false;

      for (int $$6 = 0; $$6 < $$3.c.size(); $$6++) {
         czy $$7 = $$3.c.get($$6);
         if (!$$7.f()) {
            $$5 = true;
            $$3.d[$$6]++;
            if ($$3.d[$$6] >= $$3.e[$$6]) {
               dfi $$8 = new dfi($$7);
               czy $$9 = $$4.a($$8, $$0).map($$2x -> ((dea)$$2x.b()).a($$8, $$0.J_())).orElse($$7);
               if ($$9.a($$0.K())) {
                  bun.a($$0, (double)$$1.u(), (double)$$1.v(), (double)$$1.w(), $$9);
                  $$3.c.set($$6, czy.k);
                  $$0.a($$1, $$2, $$2, 3);
                  $$0.a(ege.c, $$1, ege.a.a($$2));
               }
            }
         }
      }

      if ($$5) {
         a($$0, $$1, $$2);
      }
   }

   public static void a(djx $$0, iv $$1, ebe $$2, dyj $$3) {
      boolean $$4 = false;

      for (int $$5 = 0; $$5 < $$3.c.size(); $$5++) {
         if ($$3.d[$$5] > 0) {
            $$4 = true;
            $$3.d[$$5] = azo.a($$3.d[$$5] - 2, 0, $$3.e[$$5]);
         }
      }

      if ($$4) {
         a($$0, $$1, $$2);
      }
   }

   public static void b(djx $$0, iv $$1, ebe $$2, dyj $$3) {
      azx $$4 = $$0.A;
      if ($$4.i() < 0.11F) {
         for (int $$5 = 0; $$5 < $$4.a(2) + 2; $$5++) {
            dns.a($$0, $$1, $$2.c(dns.c), false);
         }
      }

      int $$6 = $$2.c(dns.e).e();

      for (int $$7 = 0; $$7 < $$3.c.size(); $$7++) {
         if (!$$3.c.get($$7).f() && $$4.i() < 0.2F) {
            jb $$8 = jb.b(Math.floorMod($$7 + $$6, 4));
            float $$9 = 0.3125F;
            double $$10 = (double)$$1.u() + 0.5 - (double)((float)$$8.j() * 0.3125F) + (double)((float)$$8.h().j() * 0.3125F);
            double $$11 = (double)$$1.v() + 0.5;
            double $$12 = (double)$$1.w() + 0.5 - (double)((float)$$8.l() * 0.3125F) + (double)((float)$$8.h().l() * 0.3125F);

            for (int $$13 = 0; $$13 < 4; $$13++) {
               $$0.a(ly.ah, $$10, $$11, $$12, 0.0, 5.0E-4, 0.0);
            }
         }
      }
   }

   public jo<czy> c() {
      return this.c;
   }

   @Override
   protected void a(tz $$0, jh.a $$1) {
      super.a($$0, $$1);
      this.c.clear();
      bul.b($$0, this.c, $$1);
      $$0.k("CookingTimes").ifPresentOrElse($$0x -> System.arraycopy($$0x, 0, this.d, 0, Math.min(this.e.length, $$0x.length)), () -> Arrays.fill(this.d, 0));
      $$0.k("CookingTotalTimes")
         .ifPresentOrElse($$0x -> System.arraycopy($$0x, 0, this.e, 0, Math.min(this.e.length, $$0x.length)), () -> Arrays.fill(this.e, 0));
   }

   @Override
   protected void b(tz $$0, jh.a $$1) {
      super.b($$0, $$1);
      bul.a($$0, this.c, true, $$1);
      $$0.a("CookingTimes", this.d);
      $$0.a("CookingTotalTimes", this.e);
   }

   public acc d() {
      return acc.a(this);
   }

   @Override
   public tz a(jh.a $$0) {
      tz $$1 = new tz();
      bul.a($$1, this.c, true, $$0);
      return $$1;
   }

   public boolean a(ars $$0, @Nullable bxu $$1, czy $$2) {
      for (int $$3 = 0; $$3 < this.c.size(); $$3++) {
         czy $$4 = this.c.get($$3);
         if ($$4.f()) {
            Optional<deu<dea>> $$5 = $$0.t().a(dfa.e, new dfi($$2), $$0);
            if ($$5.isEmpty()) {
               return false;
            }

            this.e[$$3] = $$5.get().b().d();
            this.d[$$3] = 0;
            this.c.set($$3, $$2.b(1, $$1));
            $$0.a(ege.c, this.aB_(), ege.a.a($$1, this.m()));
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

   @Override
   public void a(iv $$0, ebe $$1) {
      if (this.n != null) {
         bun.a(this.n, $$0, this.c());
      }
   }

   @Override
   protected void a(kf $$0) {
      super.a($$0);
      $$0.a(kk.ap, dcq.a).a(this.c());
   }

   @Override
   protected void a(kh.a $$0) {
      super.a($$0);
      $$0.a(kk.ap, dcq.a(this.c()));
   }

   @Override
   public void a(tz $$0) {
      $$0.r("Items");
   }
}
