import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.DynamicOps;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nullable;

public class eal extends dyc {
   private final eao a = new eao();
   private final eap b = new eap();
   private final eam c = new eam();
   private ean d = ean.b;

   public eal(iv $$0, ebe $$1) {
      super(dye.S, $$0, $$1);
   }

   @Nullable
   @Override
   public zh<abw> ay_() {
      return acc.a(this);
   }

   @Override
   public tz a(jh.a $$0) {
      return ag.a(new tz(), $$1 -> $$1.a("shared_data", eap.b, $$0.a(un.a), this.b));
   }

   @Override
   protected void b(tz $$0, jh.a $$1) {
      super.b($$0, $$1);
      alg<uy> $$2 = $$1.a(un.a);
      $$0.a("config", ean.c, $$2, this.d);
      $$0.a("shared_data", eap.b, $$2, this.b);
      $$0.a("server_data", eao.b, $$2, this.a);
   }

   @Override
   protected void a(tz $$0, jh.a $$1) {
      super.a($$0, $$1);
      DynamicOps<uy> $$2 = $$1.a(un.a);
      $$0.<eao>a("server_data", eao.b, $$2).ifPresent(this.a::a);
      this.d = $$0.<ean>a("config", ean.c, $$2).orElse(ean.b);
      $$0.<eap>a("shared_data", eap.b, $$2).ifPresent(this.b::a);
   }

   @Nullable
   public eao a() {
      return this.n != null && !this.n.C ? this.a : null;
   }

   public eap c() {
      return this.b;
   }

   public eam d() {
      return this.c;
   }

   public ean f() {
      return this.d;
   }

   @VisibleForTesting
   public void a(ean $$0) {
      this.d = $$0;
   }

   public static final class a {
      private static final int a = 20;
      private static final float b = 0.5F;
      private static final float c = 0.02F;
      private static final int d = 20;
      private static final int e = 20;

      public static void a(djx $$0, iv $$1, ebe $$2, eam $$3, eap $$4) {
         $$3.c();
         if ($$0.ae() % 20L == 0L) {
            a($$0, $$1, $$2, $$4);
         }

         a($$0, $$1, $$4, $$2.c(dwn.d) ? ly.N : ly.aM);
         a($$0, $$1, $$4);
      }

      public static void a(djx $$0, iv $$1, ebe $$2, eap $$3, lw $$4) {
         a($$0, $$1, $$2, $$3);
         azx $$5 = $$0.A;

         for (int $$6 = 0; $$6 < 20; $$6++) {
            ffq $$7 = b($$1, $$5);
            $$0.a(ly.ah, $$7.a(), $$7.b(), $$7.c(), 0.0, 0.0, 0.0);
            $$0.a($$4, $$7.a(), $$7.b(), $$7.c(), 0.0, 0.0, 0.0);
         }
      }

      public static void a(djx $$0, iv $$1, lw $$2) {
         azx $$3 = $$0.A;

         for (int $$4 = 0; $$4 < 20; $$4++) {
            ffq $$5 = a($$1, $$3);
            ffq $$6 = new ffq($$3.k() * 0.02, $$3.k() * 0.02, $$3.k() * 0.02);
            $$0.a($$2, $$5.a(), $$5.b(), $$5.c(), $$6.a(), $$6.b(), $$6.c());
         }
      }

      private static void a(djx $$0, iv $$1, eap $$2, lw $$3) {
         azx $$4 = $$0.G_();
         if ($$4.i() <= 0.5F) {
            ffq $$5 = b($$1, $$4);
            $$0.a(ly.ah, $$5.a(), $$5.b(), $$5.c(), 0.0, 0.0, 0.0);
            if (a($$2)) {
               $$0.a($$3, $$5.a(), $$5.b(), $$5.c(), 0.0, 0.0, 0.0);
            }
         }
      }

      private static void a(djx $$0, ffq $$1, crx $$2) {
         azx $$3 = $$0.A;
         ffq $$4 = $$1.a($$2.dt().b(0.0, (double)($$2.dr() / 2.0F), 0.0));
         int $$5 = azo.a($$3, 2, 5);

         for (int $$6 = 0; $$6 < $$5; $$6++) {
            ffq $$7 = $$4.a($$3, 1.0F);
            $$0.a(ly.bd, $$1.a(), $$1.b(), $$1.c(), $$7.a(), $$7.b(), $$7.c());
         }
      }

      private static void a(djx $$0, iv $$1, ebe $$2, eap $$3) {
         Set<UUID> $$4 = $$3.d();
         if (!$$4.isEmpty()) {
            ffq $$5 = a($$1, $$2.c(dwn.c));

            for (UUID $$6 : $$4) {
               crx $$7 = $$0.a($$6);
               if ($$7 != null && a($$1, $$3, $$7)) {
                  a($$0, $$5, $$7);
               }
            }
         }
      }

      private static boolean a(iv $$0, eap $$1, crx $$2) {
         return $$2.dv().j($$0) <= azo.k($$1.e());
      }

      private static void a(djx $$0, iv $$1, eap $$2) {
         if (a($$2)) {
            azx $$3 = $$0.G_();
            if ($$3.i() <= 0.02F) {
               $$0.a($$1, awp.BF, awq.e, $$3.i() * 0.25F + 0.75F, $$3.i() + 0.5F, false);
            }
         }
      }

      public static boolean a(eap $$0) {
         return $$0.b();
      }

      private static ffq a(iv $$0, azx $$1) {
         return ffq.a($$0).b(azo.a($$1, 0.4, 0.6), azo.a($$1, 0.4, 0.6), azo.a($$1, 0.4, 0.6));
      }

      private static ffq b(iv $$0, azx $$1) {
         return ffq.a($$0).b(azo.a($$1, 0.1, 0.9), azo.a($$1, 0.25, 0.75), azo.a($$1, 0.1, 0.9));
      }

      private static ffq a(iv $$0, jb $$1) {
         return ffq.c($$0).b((double)$$1.j() * 0.5, 1.75, (double)$$1.l() * 0.5);
      }
   }

   public static final class b {
      private static final int a = 14;
      private static final int b = 20;
      private static final int c = 15;

      public static void a(ars $$0, iv $$1, ebe $$2, ean $$3, eao $$4, eap $$5) {
         eaq $$6 = $$2.c(dwn.b);
         if (a($$0.ae(), $$6)) {
            a($$0, $$6, $$3, $$5, $$1);
         }

         ebe $$7 = $$2;
         if ($$0.ae() >= $$4.c()) {
            $$7 = $$2.b(dwn.b, $$6.a($$0, $$1, $$3, $$4, $$5));
            if ($$2 != $$7) {
               a($$0, $$1, $$2, $$7, $$3, $$5);
            }
         }

         if ($$4.c || $$5.c) {
            eal.a($$0, $$1, $$2);
            if ($$5.c) {
               $$0.a($$1, $$2, $$7, 2);
            }

            $$4.c = false;
            $$5.c = false;
         }
      }

      public static void a(ars $$0, iv $$1, ebe $$2, ean $$3, eao $$4, eap $$5, crx $$6, czy $$7) {
         eaq $$8 = $$2.c(dwn.b);
         if (a($$3, $$8)) {
            if (!a($$3, $$7)) {
               a($$0, $$4, $$1, awp.BO);
            } else if ($$4.a($$6)) {
               a($$0, $$4, $$1, awp.BK);
            } else {
               List<czy> $$9 = a($$0, $$3, $$1, $$6, $$7);
               if (!$$9.isEmpty()) {
                  $$6.b(awz.c.b($$7.h()));
                  $$7.a($$3.e().M(), (bxu)$$6);
                  a($$0, $$2, $$1, $$3, $$4, $$5, $$9);
                  $$4.b($$6);
                  $$5.a($$0, $$1, $$4, $$3, $$3.d());
               }
            }
         }
      }

      static void a(ars $$0, iv $$1, ebe $$2, ebe $$3, ean $$4, eap $$5) {
         eaq $$6 = $$2.c(dwn.b);
         eaq $$7 = $$3.c(dwn.b);
         $$0.a($$1, $$3, 3);
         $$6.a($$0, $$1, $$7, $$4, $$5, $$3.c(dwn.d));
      }

      static void a(ars $$0, eaq $$1, ean $$2, eap $$3, iv $$4) {
         if (!a($$2, $$1)) {
            $$3.a(czy.k);
         } else {
            czy $$5 = a($$0, $$4, $$2.f().orElse($$2.b()));
            $$3.a($$5);
         }
      }

      private static czy a(ars $$0, iv $$1, alh<fam> $$2) {
         fam $$3 = $$0.p().bc().b($$2);
         fak $$4 = new fak.a($$0).a(fdb.f, ffq.b($$1)).a(fda.l);
         List<czy> $$5 = $$3.a($$4, $$0.G_());
         return $$5.isEmpty() ? czy.k : ag.a($$5, $$0.G_());
      }

      private static void a(ars $$0, ebe $$1, iv $$2, ean $$3, eao $$4, eap $$5, List<czy> $$6) {
         $$4.a($$6);
         $$5.a($$4.f());
         $$4.b($$0.ae() + 14L);
         a($$0, $$2, $$1, $$1.b(dwn.b, eaq.c), $$3, $$5);
      }

      private static List<czy> a(ars $$0, ean $$1, iv $$2, crx $$3, czy $$4) {
         fam $$5 = $$0.p().bc().b($$1.b());
         fak $$6 = new fak.a($$0).a(fdb.f, ffq.b($$2)).a($$3.eh()).a(fdb.a, $$3).a(fdb.i, $$4).a(fda.l);
         return $$5.a($$6);
      }

      private static boolean a(ean $$0, eaq $$1) {
         return !$$0.e().f() && $$1 != eaq.a;
      }

      private static boolean a(ean $$0, czy $$1) {
         return czy.c($$1, $$0.e()) && $$1.M() >= $$0.e().M();
      }

      private static boolean a(long $$0, eaq $$1) {
         return $$0 % 20L == 0L && $$1 == eaq.b;
      }

      private static void a(ars $$0, eao $$1, iv $$2, awo $$3) {
         if ($$0.ae() >= $$1.a() + 15L) {
            $$0.a(null, $$2, $$3, awq.e);
            $$1.a($$0.ae());
         }
      }
   }
}
