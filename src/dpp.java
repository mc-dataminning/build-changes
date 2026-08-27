import com.google.common.annotations.VisibleForTesting;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DynamicOps;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dpp extends dnm {
   private static final Logger a = LogUtils.getLogger();
   private final dps b = new dps();
   private final dpt c = new dpt();
   private final dpq d = new dpq();
   private dpr e = dpr.b;

   public dpp(in $$0, dqh $$1) {
      super(dno.R, $$0, $$1);
   }

   @Nullable
   @Override
   public zb<abm> av_() {
      return abt.a(this);
   }

   @Override
   public ua a(iy.a $$0) {
      return ac.a(new ua(), $$1 -> $$1.a("shared_data", a(dpt.b, this.c, $$0)));
   }

   @Override
   protected void b(ua $$0, iy.a $$1) {
      super.b($$0, $$1);
      $$0.a("config", a(dpr.c, this.e, $$1));
      $$0.a("shared_data", a(dpt.b, this.c, $$1));
      $$0.a("server_data", a(dps.b, this.b, $$1));
   }

   private static <T> ux a(Codec<T> $$0, T $$1, iy.a $$2) {
      return ac.a($$0.encodeStart($$2.a(uo.a), $$1), IllegalStateException::new);
   }

   @Override
   public void a(ua $$0, iy.a $$1) {
      super.a($$0, $$1);
      DynamicOps<ux> $$2 = $$1.a(uo.a);
      if ($$0.e("server_data")) {
         dps.b.parse($$2, $$0.c("server_data")).resultOrPartial(a::error).ifPresent(this.b::a);
      }

      if ($$0.e("config")) {
         dpr.c.parse($$2, $$0.c("config")).resultOrPartial(a::error).ifPresent($$0x -> this.e = $$0x);
      }

      if ($$0.e("shared_data")) {
         dpt.b.parse($$2, $$0.c("shared_data")).resultOrPartial(a::error).ifPresent(this.c::a);
      }
   }

   @Nullable
   public dps b() {
      return this.n != null && !this.n.B ? this.b : null;
   }

   public dpt c() {
      return this.c;
   }

   public dpq d() {
      return this.d;
   }

   public dpr f() {
      return this.e;
   }

   @VisibleForTesting
   public void a(dpr $$0) {
      this.e = $$0;
   }

   public static final class a {
      private static final int a = 20;
      private static final float b = 0.5F;
      private static final float c = 0.02F;
      private static final int d = 20;
      private static final int e = 20;

      public static void a(dad $$0, in $$1, dqh $$2, dpq $$3, dpt $$4) {
         $$3.c();
         if ($$0.Y() % 20L == 0L) {
            b($$0, $$1, $$2, $$4);
         }

         a($$0, $$1, $$4);
         b($$0, $$1, $$4);
      }

      public static void a(dad $$0, in $$1, dqh $$2, dpt $$3) {
         b($$0, $$1, $$2, $$3);
         ayg $$4 = $$0.z;

         for (int $$5 = 0; $$5 < 20; $$5++) {
            etp $$6 = b($$1, $$4);
            $$0.a(kx.ab, $$6.a(), $$6.b(), $$6.c(), 0.0, 0.0, 0.0);
            $$0.a(kx.aG, $$6.a(), $$6.b(), $$6.c(), 0.0, 0.0, 0.0);
         }
      }

      public static void a(dad $$0, in $$1) {
         ayg $$2 = $$0.z;

         for (int $$3 = 0; $$3 < 20; $$3++) {
            etp $$4 = a($$1, $$2);
            etp $$5 = new etp($$2.k() * 0.02, $$2.k() * 0.02, $$2.k() * 0.02);
            $$0.a(kx.aG, $$4.a(), $$4.b(), $$4.c(), $$5.a(), $$5.b(), $$5.c());
         }
      }

      private static void a(dad $$0, in $$1, dpt $$2) {
         ayg $$3 = $$0.E_();
         if ($$3.i() <= 0.5F) {
            etp $$4 = b($$1, $$3);
            $$0.a(kx.ab, $$4.a(), $$4.b(), $$4.c(), 0.0, 0.0, 0.0);
            if (a($$2)) {
               $$0.a(kx.aG, $$4.a(), $$4.b(), $$4.c(), 0.0, 0.0, 0.0);
            }
         }
      }

      private static void a(dad $$0, etp $$1, clh $$2) {
         ayg $$3 = $$0.z;
         etp $$4 = $$1.a($$2.dl().b(0.0, (double)($$2.di() / 2.0F), 0.0));
         int $$5 = axz.a($$3, 2, 5);

         for (int $$6 = 0; $$6 < $$5; $$6++) {
            etp $$7 = $$4.a($$3, 1.0F);
            $$0.a(kx.aW, $$1.a(), $$1.b(), $$1.c(), $$7.a(), $$7.b(), $$7.c());
         }
      }

      private static void b(dad $$0, in $$1, dqh $$2, dpt $$3) {
         Set<UUID> $$4 = $$3.d();
         if (!$$4.isEmpty()) {
            etp $$5 = a($$1, $$2.c(dlz.c));

            for (UUID $$6 : $$4) {
               clh $$7 = $$0.b($$6);
               if ($$7 != null && a($$1, $$3, $$7)) {
                  a($$0, $$5, $$7);
               }
            }
         }
      }

      private static boolean a(in $$0, dpt $$1, clh $$2) {
         return $$2.dn().j($$0) <= axz.k($$1.e());
      }

      private static void b(dad $$0, in $$1, dpt $$2) {
         if (a($$2)) {
            ayg $$3 = $$0.E_();
            if ($$3.i() <= 0.02F) {
               $$0.a($$1, avc.An, avd.e, $$3.i() * 0.25F + 0.75F, $$3.i() + 0.5F, false);
            }
         }
      }

      public static boolean a(dpt $$0) {
         return $$0.b();
      }

      private static etp a(in $$0, ayg $$1) {
         return etp.a($$0).b(axz.a($$1, 0.4, 0.6), axz.a($$1, 0.4, 0.6), axz.a($$1, 0.4, 0.6));
      }

      private static etp b(in $$0, ayg $$1) {
         return etp.a($$0).b(axz.a($$1, 0.1, 0.9), axz.a($$1, 0.25, 0.75), axz.a($$1, 0.1, 0.9));
      }

      private static etp a(in $$0, is $$1) {
         return etp.c($$0).b((double)$$1.j() * 0.5, 1.75, (double)$$1.l() * 0.5);
      }
   }

   public static final class b {
      private static final int a = 14;
      private static final int b = 20;
      private static final int c = 15;

      public static void a(aqh $$0, in $$1, dqh $$2, dpr $$3, dps $$4, dpt $$5) {
         dpu $$6 = $$2.c(dlz.b);
         if (a($$0.Y(), $$6)) {
            a($$0, $$6, $$3, $$5, $$1);
         }

         dqh $$7 = $$2;
         if ($$0.Y() >= $$4.c()) {
            $$7 = $$2.a(dlz.b, $$6.a($$0, $$1, $$3, $$4, $$5));
            if (!$$2.equals($$7)) {
               a($$0, $$1, $$2, $$7, $$3, $$5);
            }
         }

         if ($$4.c || $$5.c) {
            dpp.a($$0, $$1, $$2);
            if ($$5.c) {
               $$0.a($$1, $$2, $$7, 2);
            }

            $$4.c = false;
            $$5.c = false;
         }
      }

      public static void a(aqh $$0, in $$1, dqh $$2, dpr $$3, dps $$4, dpt $$5, clh $$6, csz $$7) {
         dpu $$8 = $$2.c(dlz.b);
         if (a($$3, $$8)) {
            if (!a($$3, $$7)) {
               a($$0, $$4, $$1);
            } else if ($$4.a($$6)) {
               a($$0, $$4, $$1);
            } else {
               List<csz> $$9 = a($$0, $$3, $$1, $$6);
               if (!$$9.isEmpty()) {
                  $$6.b(avm.c.b($$7.f()));
                  if (!$$6.f()) {
                     $$7.h($$3.e().G());
                  }

                  a($$0, $$2, $$1, $$3, $$4, $$5, $$9);
                  $$4.b($$6);
                  $$5.a($$0, $$1, $$4, $$3, $$3.d());
               }
            }
         }
      }

      static void a(aqh $$0, in $$1, dqh $$2, dqh $$3, dpr $$4, dpt $$5) {
         dpu $$6 = $$2.c(dlz.b);
         dpu $$7 = $$3.c(dlz.b);
         $$0.a($$1, $$3, 3);
         $$6.a($$0, $$1, $$7, $$4, $$5);
      }

      static void a(aqh $$0, dpu $$1, dpr $$2, dpt $$3, in $$4) {
         if (!a($$2, $$1)) {
            $$3.a(csz.i);
         } else {
            csz $$5 = a($$0, $$4, $$2.f().orElse($$2.b()));
            $$3.a($$5);
         }
      }

      private static csz a(aqh $$0, in $$1, akg<eoq> $$2) {
         eoq $$3 = $$0.o().be().b($$2);
         eoo $$4 = new eoo.a($$0).a(erc.f, etp.b($$1)).a(erb.k);
         List<csz> $$5 = $$3.a($$4);
         return $$5.isEmpty() ? csz.i : ac.a($$5, $$0.E_());
      }

      private static void a(aqh $$0, dqh $$1, in $$2, dpr $$3, dps $$4, dpt $$5, List<csz> $$6) {
         $$4.a($$6);
         $$5.a($$4.f());
         $$4.b($$0.Y() + 14L);
         a($$0, $$2, $$1, $$1.a(dlz.b, dpu.c), $$3, $$5);
      }

      private static List<csz> a(aqh $$0, dpr $$1, in $$2, clh $$3) {
         eoq $$4 = $$0.o().be().b($$1.b());
         eoo $$5 = new eoo.a($$0).a(erc.f, etp.b($$2)).a($$3.gw()).a(erc.a, $$3).a(erb.k);
         return $$4.a($$5);
      }

      private static boolean a(dpr $$0, dpu $$1) {
         return $$0.b() != eoj.a && !$$0.e().d() && $$1 != dpu.a;
      }

      private static boolean a(dpr $$0, csz $$1) {
         return csz.c($$1, $$0.e()) && $$1.G() >= $$0.e().G();
      }

      private static boolean a(long $$0, dpu $$1) {
         return $$0 % 20L == 0L && $$1 == dpu.b;
      }

      private static void a(aqh $$0, dps $$1, in $$2) {
         if ($$0.Y() >= $$1.a() + 15L) {
            $$0.a(null, $$2, avc.Av, avd.e);
            $$1.a($$0.Y());
         }
      }
   }
}
