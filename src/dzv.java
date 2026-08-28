import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.DynamicOps;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nullable;

public class dzv extends dxm {
   private final dzy a = new dzy();
   private final dzz b = new dzz();
   private final dzw c = new dzw();
   private dzx d = dzx.b;

   public dzv(iv $$0, eao $$1) {
      super(dxo.S, $$0, $$1);
   }

   @Nullable
   @Override
   public zf<abu> au_() {
      return aca.a(this);
   }

   @Override
   public tz a(jh.a $$0) {
      return ag.a(new tz(), $$1 -> $$1.a("shared_data", dzz.b, $$0.a(un.a), this.b));
   }

   @Override
   protected void b(tz $$0, jh.a $$1) {
      super.b($$0, $$1);
      ale<uw> $$2 = $$1.a(un.a);
      $$0.a("config", dzx.c, $$2, this.d);
      $$0.a("shared_data", dzz.b, $$2, this.b);
      $$0.a("server_data", dzy.b, $$2, this.a);
   }

   @Override
   protected void a(tz $$0, jh.a $$1) {
      super.a($$0, $$1);
      DynamicOps<uw> $$2 = $$1.a(un.a);
      $$0.<dzy>a("server_data", dzy.b, $$2).ifPresent(this.a::a);
      this.d = $$0.<dzx>a("config", dzx.c, $$2).orElse(dzx.b);
      $$0.<dzz>a("shared_data", dzz.b, $$2).ifPresent(this.b::a);
   }

   @Nullable
   public dzy a() {
      return this.n != null && !this.n.C ? this.a : null;
   }

   public dzz c() {
      return this.b;
   }

   public dzw d() {
      return this.c;
   }

   public dzx f() {
      return this.d;
   }

   @VisibleForTesting
   public void a(dzx $$0) {
      this.d = $$0;
   }

   public static final class a {
      private static final int a = 20;
      private static final float b = 0.5F;
      private static final float c = 0.02F;
      private static final int d = 20;
      private static final int e = 20;

      public static void a(djh $$0, iv $$1, eao $$2, dzw $$3, dzz $$4) {
         $$3.c();
         if ($$0.ae() % 20L == 0L) {
            a($$0, $$1, $$2, $$4);
         }

         a($$0, $$1, $$4, $$2.c(dvx.d) ? ly.N : ly.aM);
         a($$0, $$1, $$4);
      }

      public static void a(djh $$0, iv $$1, eao $$2, dzz $$3, lw $$4) {
         a($$0, $$1, $$2, $$3);
         azv $$5 = $$0.A;

         for (int $$6 = 0; $$6 < 20; $$6++) {
            fex $$7 = b($$1, $$5);
            $$0.a(ly.ah, $$7.a(), $$7.b(), $$7.c(), 0.0, 0.0, 0.0);
            $$0.a($$4, $$7.a(), $$7.b(), $$7.c(), 0.0, 0.0, 0.0);
         }
      }

      public static void a(djh $$0, iv $$1, lw $$2) {
         azv $$3 = $$0.A;

         for (int $$4 = 0; $$4 < 20; $$4++) {
            fex $$5 = a($$1, $$3);
            fex $$6 = new fex($$3.k() * 0.02, $$3.k() * 0.02, $$3.k() * 0.02);
            $$0.a($$2, $$5.a(), $$5.b(), $$5.c(), $$6.a(), $$6.b(), $$6.c());
         }
      }

      private static void a(djh $$0, iv $$1, dzz $$2, lw $$3) {
         azv $$4 = $$0.C_();
         if ($$4.i() <= 0.5F) {
            fex $$5 = b($$1, $$4);
            $$0.a(ly.ah, $$5.a(), $$5.b(), $$5.c(), 0.0, 0.0, 0.0);
            if (a($$2)) {
               $$0.a($$3, $$5.a(), $$5.b(), $$5.c(), 0.0, 0.0, 0.0);
            }
         }
      }

      private static void a(djh $$0, fex $$1, crj $$2) {
         azv $$3 = $$0.A;
         fex $$4 = $$1.a($$2.ds().b(0.0, (double)($$2.dq() / 2.0F), 0.0));
         int $$5 = azm.a($$3, 2, 5);

         for (int $$6 = 0; $$6 < $$5; $$6++) {
            fex $$7 = $$4.a($$3, 1.0F);
            $$0.a(ly.bd, $$1.a(), $$1.b(), $$1.c(), $$7.a(), $$7.b(), $$7.c());
         }
      }

      private static void a(djh $$0, iv $$1, eao $$2, dzz $$3) {
         Set<UUID> $$4 = $$3.d();
         if (!$$4.isEmpty()) {
            fex $$5 = a($$1, $$2.c(dvx.c));

            for (UUID $$6 : $$4) {
               crj $$7 = $$0.a($$6);
               if ($$7 != null && a($$1, $$3, $$7)) {
                  a($$0, $$5, $$7);
               }
            }
         }
      }

      private static boolean a(iv $$0, dzz $$1, crj $$2) {
         return $$2.du().j($$0) <= azm.k($$1.e());
      }

      private static void a(djh $$0, iv $$1, dzz $$2) {
         if (a($$2)) {
            azv $$3 = $$0.C_();
            if ($$3.i() <= 0.02F) {
               $$0.a($$1, awn.BF, awo.e, $$3.i() * 0.25F + 0.75F, $$3.i() + 0.5F, false);
            }
         }
      }

      public static boolean a(dzz $$0) {
         return $$0.b();
      }

      private static fex a(iv $$0, azv $$1) {
         return fex.a($$0).b(azm.a($$1, 0.4, 0.6), azm.a($$1, 0.4, 0.6), azm.a($$1, 0.4, 0.6));
      }

      private static fex b(iv $$0, azv $$1) {
         return fex.a($$0).b(azm.a($$1, 0.1, 0.9), azm.a($$1, 0.25, 0.75), azm.a($$1, 0.1, 0.9));
      }

      private static fex a(iv $$0, jb $$1) {
         return fex.c($$0).b((double)$$1.j() * 0.5, 1.75, (double)$$1.l() * 0.5);
      }
   }

   public static final class b {
      private static final int a = 14;
      private static final int b = 20;
      private static final int c = 15;

      public static void a(arq $$0, iv $$1, eao $$2, dzx $$3, dzy $$4, dzz $$5) {
         eaa $$6 = $$2.c(dvx.b);
         if (a($$0.ae(), $$6)) {
            a($$0, $$6, $$3, $$5, $$1);
         }

         eao $$7 = $$2;
         if ($$0.ae() >= $$4.c()) {
            $$7 = $$2.b(dvx.b, $$6.a($$0, $$1, $$3, $$4, $$5));
            if ($$2 != $$7) {
               a($$0, $$1, $$2, $$7, $$3, $$5);
            }
         }

         if ($$4.c || $$5.c) {
            dzv.a($$0, $$1, $$2);
            if ($$5.c) {
               $$0.a($$1, $$2, $$7, 2);
            }

            $$4.c = false;
            $$5.c = false;
         }
      }

      public static void a(arq $$0, iv $$1, eao $$2, dzx $$3, dzy $$4, dzz $$5, crj $$6, czk $$7) {
         eaa $$8 = $$2.c(dvx.b);
         if (a($$3, $$8)) {
            if (!a($$3, $$7)) {
               a($$0, $$4, $$1, awn.BO);
            } else if ($$4.a($$6)) {
               a($$0, $$4, $$1, awn.BK);
            } else {
               List<czk> $$9 = a($$0, $$3, $$1, $$6, $$7);
               if (!$$9.isEmpty()) {
                  $$6.b(awx.c.b($$7.h()));
                  $$7.a($$3.e().M(), (bxj)$$6);
                  a($$0, $$2, $$1, $$3, $$4, $$5, $$9);
                  $$4.b($$6);
                  $$5.a($$0, $$1, $$4, $$3, $$3.d());
               }
            }
         }
      }

      static void a(arq $$0, iv $$1, eao $$2, eao $$3, dzx $$4, dzz $$5) {
         eaa $$6 = $$2.c(dvx.b);
         eaa $$7 = $$3.c(dvx.b);
         $$0.a($$1, $$3, 3);
         $$6.a($$0, $$1, $$7, $$4, $$5, $$3.c(dvx.d));
      }

      static void a(arq $$0, eaa $$1, dzx $$2, dzz $$3, iv $$4) {
         if (!a($$2, $$1)) {
            $$3.a(czk.k);
         } else {
            czk $$5 = a($$0, $$4, $$2.f().orElse($$2.b()));
            $$3.a($$5);
         }
      }

      private static czk a(arq $$0, iv $$1, alf<ezt> $$2) {
         ezt $$3 = $$0.p().bc().b($$2);
         ezr $$4 = new ezr.a($$0).a(fci.f, fex.b($$1)).a(fch.l);
         List<czk> $$5 = $$3.a($$4, $$0.C_());
         return $$5.isEmpty() ? czk.k : ag.a($$5, $$0.C_());
      }

      private static void a(arq $$0, eao $$1, iv $$2, dzx $$3, dzy $$4, dzz $$5, List<czk> $$6) {
         $$4.a($$6);
         $$5.a($$4.f());
         $$4.b($$0.ae() + 14L);
         a($$0, $$2, $$1, $$1.b(dvx.b, eaa.c), $$3, $$5);
      }

      private static List<czk> a(arq $$0, dzx $$1, iv $$2, crj $$3, czk $$4) {
         ezt $$5 = $$0.p().bc().b($$1.b());
         ezr $$6 = new ezr.a($$0).a(fci.f, fex.b($$2)).a($$3.eg()).a(fci.a, $$3).a(fci.i, $$4).a(fch.l);
         return $$5.a($$6);
      }

      private static boolean a(dzx $$0, eaa $$1) {
         return !$$0.e().f() && $$1 != eaa.a;
      }

      private static boolean a(dzx $$0, czk $$1) {
         return czk.c($$1, $$0.e()) && $$1.M() >= $$0.e().M();
      }

      private static boolean a(long $$0, eaa $$1) {
         return $$0 % 20L == 0L && $$1 == eaa.b;
      }

      private static void a(arq $$0, dzy $$1, iv $$2, awm $$3) {
         if ($$0.ae() >= $$1.a() + 15L) {
            $$0.a(null, $$2, $$3, awo.e);
            $$1.a($$0.ae());
         }
      }
   }
}
