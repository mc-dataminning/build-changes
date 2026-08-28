import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.DynamicOps;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nullable;

public class dzo extends dxf {
   private final dzr a = new dzr();
   private final dzs b = new dzs();
   private final dzp c = new dzp();
   private dzq d = dzq.b;

   public dzo(iu $$0, eah $$1) {
      super(dxh.S, $$0, $$1);
   }

   @Nullable
   @Override
   public zf<abu> au_() {
      return aca.a(this);
   }

   @Override
   public tz a(jg.a $$0) {
      return af.a(new tz(), $$1 -> $$1.a("shared_data", dzs.b, $$0.a(un.a), this.b));
   }

   @Override
   protected void b(tz $$0, jg.a $$1) {
      super.b($$0, $$1);
      ale<uw> $$2 = $$1.a(un.a);
      $$0.a("config", dzq.c, $$2, this.d);
      $$0.a("shared_data", dzs.b, $$2, this.b);
      $$0.a("server_data", dzr.b, $$2, this.a);
   }

   @Override
   protected void a(tz $$0, jg.a $$1) {
      super.a($$0, $$1);
      DynamicOps<uw> $$2 = $$1.a(un.a);
      $$0.<dzr>a("server_data", dzr.b, $$2).ifPresent(this.a::a);
      this.d = $$0.<dzq>a("config", dzq.c, $$2).orElse(dzq.b);
      $$0.<dzs>a("shared_data", dzs.b, $$2).ifPresent(this.b::a);
   }

   @Nullable
   public dzr a() {
      return this.n != null && !this.n.C ? this.a : null;
   }

   public dzs c() {
      return this.b;
   }

   public dzp d() {
      return this.c;
   }

   public dzq f() {
      return this.d;
   }

   @VisibleForTesting
   public void a(dzq $$0) {
      this.d = $$0;
   }

   public static final class a {
      private static final int a = 20;
      private static final float b = 0.5F;
      private static final float c = 0.02F;
      private static final int d = 20;
      private static final int e = 20;

      public static void a(dja $$0, iu $$1, eah $$2, dzp $$3, dzs $$4) {
         $$3.c();
         if ($$0.ae() % 20L == 0L) {
            a($$0, $$1, $$2, $$4);
         }

         a($$0, $$1, $$4, $$2.c(dvq.d) ? lx.N : lx.aM);
         a($$0, $$1, $$4);
      }

      public static void a(dja $$0, iu $$1, eah $$2, dzs $$3, lv $$4) {
         a($$0, $$1, $$2, $$3);
         azv $$5 = $$0.A;

         for (int $$6 = 0; $$6 < 20; $$6++) {
            feq $$7 = b($$1, $$5);
            $$0.a(lx.ah, $$7.a(), $$7.b(), $$7.c(), 0.0, 0.0, 0.0);
            $$0.a($$4, $$7.a(), $$7.b(), $$7.c(), 0.0, 0.0, 0.0);
         }
      }

      public static void a(dja $$0, iu $$1, lv $$2) {
         azv $$3 = $$0.A;

         for (int $$4 = 0; $$4 < 20; $$4++) {
            feq $$5 = a($$1, $$3);
            feq $$6 = new feq($$3.k() * 0.02, $$3.k() * 0.02, $$3.k() * 0.02);
            $$0.a($$2, $$5.a(), $$5.b(), $$5.c(), $$6.a(), $$6.b(), $$6.c());
         }
      }

      private static void a(dja $$0, iu $$1, dzs $$2, lv $$3) {
         azv $$4 = $$0.C_();
         if ($$4.i() <= 0.5F) {
            feq $$5 = b($$1, $$4);
            $$0.a(lx.ah, $$5.a(), $$5.b(), $$5.c(), 0.0, 0.0, 0.0);
            if (a($$2)) {
               $$0.a($$3, $$5.a(), $$5.b(), $$5.c(), 0.0, 0.0, 0.0);
            }
         }
      }

      private static void a(dja $$0, feq $$1, crc $$2) {
         azv $$3 = $$0.A;
         feq $$4 = $$1.a($$2.dt().b(0.0, (double)($$2.dr() / 2.0F), 0.0));
         int $$5 = azm.a($$3, 2, 5);

         for (int $$6 = 0; $$6 < $$5; $$6++) {
            feq $$7 = $$4.a($$3, 1.0F);
            $$0.a(lx.bd, $$1.a(), $$1.b(), $$1.c(), $$7.a(), $$7.b(), $$7.c());
         }
      }

      private static void a(dja $$0, iu $$1, eah $$2, dzs $$3) {
         Set<UUID> $$4 = $$3.d();
         if (!$$4.isEmpty()) {
            feq $$5 = a($$1, $$2.c(dvq.c));

            for (UUID $$6 : $$4) {
               crc $$7 = $$0.a($$6);
               if ($$7 != null && a($$1, $$3, $$7)) {
                  a($$0, $$5, $$7);
               }
            }
         }
      }

      private static boolean a(iu $$0, dzs $$1, crc $$2) {
         return $$2.dv().j($$0) <= azm.k($$1.e());
      }

      private static void a(dja $$0, iu $$1, dzs $$2) {
         if (a($$2)) {
            azv $$3 = $$0.C_();
            if ($$3.i() <= 0.02F) {
               $$0.a($$1, awn.BF, awo.e, $$3.i() * 0.25F + 0.75F, $$3.i() + 0.5F, false);
            }
         }
      }

      public static boolean a(dzs $$0) {
         return $$0.b();
      }

      private static feq a(iu $$0, azv $$1) {
         return feq.a($$0).b(azm.a($$1, 0.4, 0.6), azm.a($$1, 0.4, 0.6), azm.a($$1, 0.4, 0.6));
      }

      private static feq b(iu $$0, azv $$1) {
         return feq.a($$0).b(azm.a($$1, 0.1, 0.9), azm.a($$1, 0.25, 0.75), azm.a($$1, 0.1, 0.9));
      }

      private static feq a(iu $$0, ja $$1) {
         return feq.c($$0).b((double)$$1.j() * 0.5, 1.75, (double)$$1.l() * 0.5);
      }
   }

   public static final class b {
      private static final int a = 14;
      private static final int b = 20;
      private static final int c = 15;

      public static void a(arq $$0, iu $$1, eah $$2, dzq $$3, dzr $$4, dzs $$5) {
         dzt $$6 = $$2.c(dvq.b);
         if (a($$0.ae(), $$6)) {
            a($$0, $$6, $$3, $$5, $$1);
         }

         eah $$7 = $$2;
         if ($$0.ae() >= $$4.c()) {
            $$7 = $$2.b(dvq.b, $$6.a($$0, $$1, $$3, $$4, $$5));
            if ($$2 != $$7) {
               a($$0, $$1, $$2, $$7, $$3, $$5);
            }
         }

         if ($$4.c || $$5.c) {
            dzo.a($$0, $$1, $$2);
            if ($$5.c) {
               $$0.a($$1, $$2, $$7, 2);
            }

            $$4.c = false;
            $$5.c = false;
         }
      }

      public static void a(arq $$0, iu $$1, eah $$2, dzq $$3, dzr $$4, dzs $$5, crc $$6, czd $$7) {
         dzt $$8 = $$2.c(dvq.b);
         if (a($$3, $$8)) {
            if (!a($$3, $$7)) {
               a($$0, $$4, $$1, awn.BO);
            } else if ($$4.a($$6)) {
               a($$0, $$4, $$1, awn.BK);
            } else {
               List<czd> $$9 = a($$0, $$3, $$1, $$6, $$7);
               if (!$$9.isEmpty()) {
                  $$6.b(awx.c.b($$7.h()));
                  $$7.a($$3.e().M(), (bxe)$$6);
                  a($$0, $$2, $$1, $$3, $$4, $$5, $$9);
                  $$4.b($$6);
                  $$5.a($$0, $$1, $$4, $$3, $$3.d());
               }
            }
         }
      }

      static void a(arq $$0, iu $$1, eah $$2, eah $$3, dzq $$4, dzs $$5) {
         dzt $$6 = $$2.c(dvq.b);
         dzt $$7 = $$3.c(dvq.b);
         $$0.a($$1, $$3, 3);
         $$6.a($$0, $$1, $$7, $$4, $$5, $$3.c(dvq.d));
      }

      static void a(arq $$0, dzt $$1, dzq $$2, dzs $$3, iu $$4) {
         if (!a($$2, $$1)) {
            $$3.a(czd.k);
         } else {
            czd $$5 = a($$0, $$4, $$2.f().orElse($$2.b()));
            $$3.a($$5);
         }
      }

      private static czd a(arq $$0, iu $$1, alf<ezm> $$2) {
         ezm $$3 = $$0.p().bc().b($$2);
         ezk $$4 = new ezk.a($$0).a(fcb.f, feq.b($$1)).a(fca.l);
         List<czd> $$5 = $$3.a($$4, $$0.C_());
         return $$5.isEmpty() ? czd.k : af.a($$5, $$0.C_());
      }

      private static void a(arq $$0, eah $$1, iu $$2, dzq $$3, dzr $$4, dzs $$5, List<czd> $$6) {
         $$4.a($$6);
         $$5.a($$4.f());
         $$4.b($$0.ae() + 14L);
         a($$0, $$2, $$1, $$1.b(dvq.b, dzt.c), $$3, $$5);
      }

      private static List<czd> a(arq $$0, dzq $$1, iu $$2, crc $$3, czd $$4) {
         ezm $$5 = $$0.p().bc().b($$1.b());
         ezk $$6 = new ezk.a($$0).a(fcb.f, feq.b($$2)).a($$3.eh()).a(fcb.a, $$3).a(fcb.i, $$4).a(fca.l);
         return $$5.a($$6);
      }

      private static boolean a(dzq $$0, dzt $$1) {
         return !$$0.e().f() && $$1 != dzt.a;
      }

      private static boolean a(dzq $$0, czd $$1) {
         return czd.c($$1, $$0.e()) && $$1.M() >= $$0.e().M();
      }

      private static boolean a(long $$0, dzt $$1) {
         return $$0 % 20L == 0L && $$1 == dzt.b;
      }

      private static void a(arq $$0, dzr $$1, iu $$2, awm $$3) {
         if ($$0.ae() >= $$1.a() + 15L) {
            $$0.a(null, $$2, $$3, awo.e);
            $$1.a($$0.ae());
         }
      }
   }
}
