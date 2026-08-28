import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.DynamicOps;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nullable;

public class ean extends dye {
   private final eaq a = new eaq();
   private final ear b = new ear();
   private final eao c = new eao();
   private eap d = eap.b;

   public ean(iw $$0, ebg $$1) {
      super(dyg.S, $$0, $$1);
   }

   @Nullable
   @Override
   public zj<aby> ay_() {
      return ace.a(this);
   }

   @Override
   public ua a(ji.a $$0) {
      return ag.a(new ua(), $$1 -> $$1.a("shared_data", ear.b, $$0.a(uo.a), this.b));
   }

   @Override
   protected void b(ua $$0, ji.a $$1) {
      super.b($$0, $$1);
      ali<va> $$2 = $$1.a(uo.a);
      $$0.a("config", eap.c, $$2, this.d);
      $$0.a("shared_data", ear.b, $$2, this.b);
      $$0.a("server_data", eaq.b, $$2, this.a);
   }

   @Override
   protected void a(ua $$0, ji.a $$1) {
      super.a($$0, $$1);
      DynamicOps<va> $$2 = $$1.a(uo.a);
      $$0.<eaq>a("server_data", eaq.b, $$2).ifPresent(this.a::a);
      this.d = $$0.<eap>a("config", eap.c, $$2).orElse(eap.b);
      $$0.<ear>a("shared_data", ear.b, $$2).ifPresent(this.b::a);
   }

   @Nullable
   public eaq a() {
      return this.n != null && !this.n.C ? this.a : null;
   }

   public ear c() {
      return this.b;
   }

   public eao d() {
      return this.c;
   }

   public eap f() {
      return this.d;
   }

   @VisibleForTesting
   public void a(eap $$0) {
      this.d = $$0;
   }

   public static final class a {
      private static final int a = 20;
      private static final float b = 0.5F;
      private static final float c = 0.02F;
      private static final int d = 20;
      private static final int e = 20;

      public static void a(djz $$0, iw $$1, ebg $$2, eao $$3, ear $$4) {
         $$3.c();
         if ($$0.ae() % 20L == 0L) {
            a($$0, $$1, $$2, $$4);
         }

         a($$0, $$1, $$4, $$2.c(dwp.d) ? lz.N : lz.aM);
         a($$0, $$1, $$4);
      }

      public static void a(djz $$0, iw $$1, ebg $$2, ear $$3, lx $$4) {
         a($$0, $$1, $$2, $$3);
         azz $$5 = $$0.A;

         for (int $$6 = 0; $$6 < 20; $$6++) {
            ffs $$7 = b($$1, $$5);
            $$0.a(lz.ah, $$7.a(), $$7.b(), $$7.c(), 0.0, 0.0, 0.0);
            $$0.a($$4, $$7.a(), $$7.b(), $$7.c(), 0.0, 0.0, 0.0);
         }
      }

      public static void a(djz $$0, iw $$1, lx $$2) {
         azz $$3 = $$0.A;

         for (int $$4 = 0; $$4 < 20; $$4++) {
            ffs $$5 = a($$1, $$3);
            ffs $$6 = new ffs($$3.k() * 0.02, $$3.k() * 0.02, $$3.k() * 0.02);
            $$0.a($$2, $$5.a(), $$5.b(), $$5.c(), $$6.a(), $$6.b(), $$6.c());
         }
      }

      private static void a(djz $$0, iw $$1, ear $$2, lx $$3) {
         azz $$4 = $$0.G_();
         if ($$4.i() <= 0.5F) {
            ffs $$5 = b($$1, $$4);
            $$0.a(lz.ah, $$5.a(), $$5.b(), $$5.c(), 0.0, 0.0, 0.0);
            if (a($$2)) {
               $$0.a($$3, $$5.a(), $$5.b(), $$5.c(), 0.0, 0.0, 0.0);
            }
         }
      }

      private static void a(djz $$0, ffs $$1, crz $$2) {
         azz $$3 = $$0.A;
         ffs $$4 = $$1.a($$2.dt().b(0.0, (double)($$2.dr() / 2.0F), 0.0));
         int $$5 = azq.a($$3, 2, 5);

         for (int $$6 = 0; $$6 < $$5; $$6++) {
            ffs $$7 = $$4.a($$3, 1.0F);
            $$0.a(lz.bd, $$1.a(), $$1.b(), $$1.c(), $$7.a(), $$7.b(), $$7.c());
         }
      }

      private static void a(djz $$0, iw $$1, ebg $$2, ear $$3) {
         Set<UUID> $$4 = $$3.d();
         if (!$$4.isEmpty()) {
            ffs $$5 = a($$1, $$2.c(dwp.c));

            for (UUID $$6 : $$4) {
               crz $$7 = $$0.a($$6);
               if ($$7 != null && a($$1, $$3, $$7)) {
                  a($$0, $$5, $$7);
               }
            }
         }
      }

      private static boolean a(iw $$0, ear $$1, crz $$2) {
         return $$2.dv().j($$0) <= azq.k($$1.e());
      }

      private static void a(djz $$0, iw $$1, ear $$2) {
         if (a($$2)) {
            azz $$3 = $$0.G_();
            if ($$3.i() <= 0.02F) {
               $$0.a($$1, awr.BF, aws.e, $$3.i() * 0.25F + 0.75F, $$3.i() + 0.5F, false);
            }
         }
      }

      public static boolean a(ear $$0) {
         return $$0.b();
      }

      private static ffs a(iw $$0, azz $$1) {
         return ffs.a($$0).b(azq.a($$1, 0.4, 0.6), azq.a($$1, 0.4, 0.6), azq.a($$1, 0.4, 0.6));
      }

      private static ffs b(iw $$0, azz $$1) {
         return ffs.a($$0).b(azq.a($$1, 0.1, 0.9), azq.a($$1, 0.25, 0.75), azq.a($$1, 0.1, 0.9));
      }

      private static ffs a(iw $$0, jc $$1) {
         return ffs.c($$0).b((double)$$1.j() * 0.5, 1.75, (double)$$1.l() * 0.5);
      }
   }

   public static final class b {
      private static final int a = 14;
      private static final int b = 20;
      private static final int c = 15;

      public static void a(aru $$0, iw $$1, ebg $$2, eap $$3, eaq $$4, ear $$5) {
         eas $$6 = $$2.c(dwp.b);
         if (a($$0.ae(), $$6)) {
            a($$0, $$6, $$3, $$5, $$1);
         }

         ebg $$7 = $$2;
         if ($$0.ae() >= $$4.c()) {
            $$7 = $$2.b(dwp.b, $$6.a($$0, $$1, $$3, $$4, $$5));
            if ($$2 != $$7) {
               a($$0, $$1, $$2, $$7, $$3, $$5);
            }
         }

         if ($$4.c || $$5.c) {
            ean.a($$0, $$1, $$2);
            if ($$5.c) {
               $$0.a($$1, $$2, $$7, 2);
            }

            $$4.c = false;
            $$5.c = false;
         }
      }

      public static void a(aru $$0, iw $$1, ebg $$2, eap $$3, eaq $$4, ear $$5, crz $$6, daa $$7) {
         eas $$8 = $$2.c(dwp.b);
         if (a($$3, $$8)) {
            if (!a($$3, $$7)) {
               a($$0, $$4, $$1, awr.BO);
            } else if ($$4.a($$6)) {
               a($$0, $$4, $$1, awr.BK);
            } else {
               List<daa> $$9 = a($$0, $$3, $$1, $$6, $$7);
               if (!$$9.isEmpty()) {
                  $$6.b(axb.c.b($$7.h()));
                  $$7.a($$3.e().M(), (bxw)$$6);
                  a($$0, $$2, $$1, $$3, $$4, $$5, $$9);
                  $$4.b($$6);
                  $$5.a($$0, $$1, $$4, $$3, $$3.d());
               }
            }
         }
      }

      static void a(aru $$0, iw $$1, ebg $$2, ebg $$3, eap $$4, ear $$5) {
         eas $$6 = $$2.c(dwp.b);
         eas $$7 = $$3.c(dwp.b);
         $$0.a($$1, $$3, 3);
         $$6.a($$0, $$1, $$7, $$4, $$5, $$3.c(dwp.d));
      }

      static void a(aru $$0, eas $$1, eap $$2, ear $$3, iw $$4) {
         if (!a($$2, $$1)) {
            $$3.a(daa.k);
         } else {
            daa $$5 = a($$0, $$4, $$2.f().orElse($$2.b()));
            $$3.a($$5);
         }
      }

      private static daa a(aru $$0, iw $$1, alj<fao> $$2) {
         fao $$3 = $$0.p().bc().b($$2);
         fam $$4 = new fam.a($$0).a(fdd.f, ffs.b($$1)).a(fdc.l);
         List<daa> $$5 = $$3.a($$4, $$0.G_());
         return $$5.isEmpty() ? daa.k : ag.a($$5, $$0.G_());
      }

      private static void a(aru $$0, ebg $$1, iw $$2, eap $$3, eaq $$4, ear $$5, List<daa> $$6) {
         $$4.a($$6);
         $$5.a($$4.f());
         $$4.b($$0.ae() + 14L);
         a($$0, $$2, $$1, $$1.b(dwp.b, eas.c), $$3, $$5);
      }

      private static List<daa> a(aru $$0, eap $$1, iw $$2, crz $$3, daa $$4) {
         fao $$5 = $$0.p().bc().b($$1.b());
         fam $$6 = new fam.a($$0).a(fdd.f, ffs.b($$2)).a($$3.eh()).a(fdd.a, $$3).a(fdd.i, $$4).a(fdc.l);
         return $$5.a($$6);
      }

      private static boolean a(eap $$0, eas $$1) {
         return !$$0.e().f() && $$1 != eas.a;
      }

      private static boolean a(eap $$0, daa $$1) {
         return daa.c($$1, $$0.e()) && $$1.M() >= $$0.e().M();
      }

      private static boolean a(long $$0, eas $$1) {
         return $$0 % 20L == 0L && $$1 == eas.b;
      }

      private static void a(aru $$0, eaq $$1, iw $$2, awq $$3) {
         if ($$0.ae() >= $$1.a() + 15L) {
            $$0.a(null, $$2, $$3, aws.e);
            $$1.a($$0.ae());
         }
      }
   }
}
