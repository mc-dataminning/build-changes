import com.google.common.annotations.VisibleForTesting;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DynamicOps;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dwe extends dty {
   private static final Logger a = LogUtils.getLogger();
   private final dwh b = new dwh();
   private final dwi c = new dwi();
   private final dwf d = new dwf();
   private dwg e = dwg.b;

   public dwe(ji $$0, dww $$1) {
      super(dua.S, $$0, $$1);
   }

   @Nullable
   @Override
   public yw<abl> ax_() {
      return abs.a(this);
   }

   @Override
   public tq a(jt.a $$0) {
      return af.a(new tq(), $$1 -> $$1.a("shared_data", a(dwi.b, this.c, $$0)));
   }

   @Override
   protected void b(tq $$0, jt.a $$1) {
      super.b($$0, $$1);
      $$0.a("config", a(dwg.c, this.e, $$1));
      $$0.a("shared_data", a(dwi.b, this.c, $$1));
      $$0.a("server_data", a(dwh.b, this.b, $$1));
   }

   private static <T> un a(Codec<T> $$0, T $$1, jt.a $$2) {
      return (un)$$0.encodeStart($$2.a(ue.a), $$1).getOrThrow();
   }

   @Override
   protected void a(tq $$0, jt.a $$1) {
      super.a($$0, $$1);
      DynamicOps<un> $$2 = $$1.a(ue.a);
      if ($$0.e("server_data")) {
         dwh.b.parse($$2, $$0.c("server_data")).resultOrPartial(a::error).ifPresent(this.b::a);
      }

      if ($$0.e("config")) {
         dwg.c.parse($$2, $$0.c("config")).resultOrPartial(a::error).ifPresent($$0x -> this.e = $$0x);
      }

      if ($$0.e("shared_data")) {
         dwi.b.parse($$2, $$0.c("shared_data")).resultOrPartial(a::error).ifPresent(this.c::a);
      }
   }

   @Nullable
   public dwh b() {
      return this.o != null && !this.o.C ? this.b : null;
   }

   public dwi c() {
      return this.c;
   }

   public dwf d() {
      return this.d;
   }

   public dwg f() {
      return this.e;
   }

   @VisibleForTesting
   public void a(dwg $$0) {
      this.e = $$0;
   }

   public static final class a {
      private static final int a = 20;
      private static final float b = 0.5F;
      private static final float c = 0.02F;
      private static final int d = 20;
      private static final int e = 20;

      public static void a(dgh $$0, ji $$1, dww $$2, dwf $$3, dwi $$4) {
         $$3.c();
         if ($$0.ad() % 20L == 0L) {
            a($$0, $$1, $$2, $$4);
         }

         a($$0, $$1, $$4, $$2.c(dsl.d) ? lt.M : lt.aL);
         a($$0, $$1, $$4);
      }

      public static void a(dgh $$0, ji $$1, dww $$2, dwi $$3, lr $$4) {
         a($$0, $$1, $$2, $$3);
         azh $$5 = $$0.A;

         for (int $$6 = 0; $$6 < 20; $$6++) {
            faz $$7 = b($$1, $$5);
            $$0.a(lt.ag, $$7.a(), $$7.b(), $$7.c(), 0.0, 0.0, 0.0);
            $$0.a($$4, $$7.a(), $$7.b(), $$7.c(), 0.0, 0.0, 0.0);
         }
      }

      public static void a(dgh $$0, ji $$1, lr $$2) {
         azh $$3 = $$0.A;

         for (int $$4 = 0; $$4 < 20; $$4++) {
            faz $$5 = a($$1, $$3);
            faz $$6 = new faz($$3.k() * 0.02, $$3.k() * 0.02, $$3.k() * 0.02);
            $$0.a($$2, $$5.a(), $$5.b(), $$5.c(), $$6.a(), $$6.b(), $$6.c());
         }
      }

      private static void a(dgh $$0, ji $$1, dwi $$2, lr $$3) {
         azh $$4 = $$0.H_();
         if ($$4.i() <= 0.5F) {
            faz $$5 = b($$1, $$4);
            $$0.a(lt.ag, $$5.a(), $$5.b(), $$5.c(), 0.0, 0.0, 0.0);
            if (a($$2)) {
               $$0.a($$3, $$5.a(), $$5.b(), $$5.c(), 0.0, 0.0, 0.0);
            }
         }
      }

      private static void a(dgh $$0, faz $$1, cow $$2) {
         azh $$3 = $$0.A;
         faz $$4 = $$1.a($$2.dt().b(0.0, (double)($$2.dr() / 2.0F), 0.0));
         int $$5 = ayz.a($$3, 2, 5);

         for (int $$6 = 0; $$6 < $$5; $$6++) {
            faz $$7 = $$4.a($$3, 1.0F);
            $$0.a(lt.bc, $$1.a(), $$1.b(), $$1.c(), $$7.a(), $$7.b(), $$7.c());
         }
      }

      private static void a(dgh $$0, ji $$1, dww $$2, dwi $$3) {
         Set<UUID> $$4 = $$3.d();
         if (!$$4.isEmpty()) {
            faz $$5 = a($$1, $$2.c(dsl.c));

            for (UUID $$6 : $$4) {
               cow $$7 = $$0.b($$6);
               if ($$7 != null && a($$1, $$3, $$7)) {
                  a($$0, $$5, $$7);
               }
            }
         }
      }

      private static boolean a(ji $$0, dwi $$1, cow $$2) {
         return $$2.dv().j($$0) <= ayz.k($$1.e());
      }

      private static void a(dgh $$0, ji $$1, dwi $$2) {
         if (a($$2)) {
            azh $$3 = $$0.H_();
            if ($$3.i() <= 0.02F) {
               $$0.a($$1, awa.Bp, awb.e, $$3.i() * 0.25F + 0.75F, $$3.i() + 0.5F, false);
            }
         }
      }

      public static boolean a(dwi $$0) {
         return $$0.b();
      }

      private static faz a(ji $$0, azh $$1) {
         return faz.a($$0).b(ayz.a($$1, 0.4, 0.6), ayz.a($$1, 0.4, 0.6), ayz.a($$1, 0.4, 0.6));
      }

      private static faz b(ji $$0, azh $$1) {
         return faz.a($$0).b(ayz.a($$1, 0.1, 0.9), ayz.a($$1, 0.25, 0.75), ayz.a($$1, 0.1, 0.9));
      }

      private static faz a(ji $$0, jn $$1) {
         return faz.c($$0).b((double)$$1.j() * 0.5, 1.75, (double)$$1.l() * 0.5);
      }
   }

   public static final class b {
      private static final int a = 14;
      private static final int b = 20;
      private static final int c = 15;

      public static void a(ard $$0, ji $$1, dww $$2, dwg $$3, dwh $$4, dwi $$5) {
         dwj $$6 = $$2.c(dsl.b);
         if (a($$0.ad(), $$6)) {
            a($$0, $$6, $$3, $$5, $$1);
         }

         dww $$7 = $$2;
         if ($$0.ad() >= $$4.c()) {
            $$7 = $$2.b(dsl.b, $$6.a($$0, $$1, $$3, $$4, $$5));
            if (!$$2.equals($$7)) {
               a($$0, $$1, $$2, $$7, $$3, $$5);
            }
         }

         if ($$4.c || $$5.c) {
            dwe.a($$0, $$1, $$2);
            if ($$5.c) {
               $$0.a($$1, $$2, $$7, 2);
            }

            $$4.c = false;
            $$5.c = false;
         }
      }

      public static void a(ard $$0, ji $$1, dww $$2, dwg $$3, dwh $$4, dwi $$5, cow $$6, cwo $$7) {
         dwj $$8 = $$2.c(dsl.b);
         if (a($$3, $$8)) {
            if (!a($$3, $$7)) {
               a($$0, $$4, $$1, awa.By);
            } else if ($$4.a($$6)) {
               a($$0, $$4, $$1, awa.Bu);
            } else {
               List<cwo> $$9 = a($$0, $$3, $$1, $$6, $$7);
               if (!$$9.isEmpty()) {
                  $$6.b(awk.c.b($$7.h()));
                  $$7.a($$3.e().M(), (bvg)$$6);
                  a($$0, $$2, $$1, $$3, $$4, $$5, $$9);
                  $$4.b($$6);
                  $$5.a($$0, $$1, $$4, $$3, $$3.d());
               }
            }
         }
      }

      static void a(ard $$0, ji $$1, dww $$2, dww $$3, dwg $$4, dwi $$5) {
         dwj $$6 = $$2.c(dsl.b);
         dwj $$7 = $$3.c(dsl.b);
         $$0.a($$1, $$3, 3);
         $$6.a($$0, $$1, $$7, $$4, $$5, $$3.c(dsl.d));
      }

      static void a(ard $$0, dwj $$1, dwg $$2, dwi $$3, ji $$4) {
         if (!a($$2, $$1)) {
            $$3.a(cwo.j);
         } else {
            cwo $$5 = a($$0, $$4, $$2.f().orElse($$2.b()));
            $$3.a($$5);
         }
      }

      private static cwo a(ard $$0, ji $$1, aku<evv> $$2) {
         evv $$3 = $$0.p().bc().b($$2);
         evt $$4 = new evt.a($$0).a(eyk.f, faz.b($$1)).a(eyj.l);
         List<cwo> $$5 = $$3.a($$4, $$0.H_());
         return $$5.isEmpty() ? cwo.j : af.a($$5, $$0.H_());
      }

      private static void a(ard $$0, dww $$1, ji $$2, dwg $$3, dwh $$4, dwi $$5, List<cwo> $$6) {
         $$4.a($$6);
         $$5.a($$4.f());
         $$4.b($$0.ad() + 14L);
         a($$0, $$2, $$1, $$1.b(dsl.b, dwj.c), $$3, $$5);
      }

      private static List<cwo> a(ard $$0, dwg $$1, ji $$2, cow $$3, cwo $$4) {
         evv $$5 = $$0.p().bc().b($$1.b());
         evt $$6 = new evt.a($$0).a(eyk.f, faz.b($$2)).a($$3.gF()).a(eyk.a, $$3).a(eyk.i, $$4).a(eyj.l);
         return $$5.a($$6);
      }

      private static boolean a(dwg $$0, dwj $$1) {
         return !$$0.e().f() && $$1 != dwj.a;
      }

      private static boolean a(dwg $$0, cwo $$1) {
         return cwo.c($$1, $$0.e()) && $$1.M() >= $$0.e().M();
      }

      private static boolean a(long $$0, dwj $$1) {
         return $$0 % 20L == 0L && $$1 == dwj.b;
      }

      private static void a(ard $$0, dwh $$1, ji $$2, avz $$3) {
         if ($$0.ad() >= $$1.a() + 15L) {
            $$0.a(null, $$2, $$3, awb.e);
            $$1.a($$0.ad());
         }
      }
   }
}
