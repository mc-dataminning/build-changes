import com.google.common.annotations.VisibleForTesting;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DynamicOps;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class doq extends dmo {
   private static final Logger a = LogUtils.getLogger();
   private final dot b = new dot();
   private final dou c = new dou();
   private final dor d = new dor();
   private dos e = dos.b;

   public doq(id $$0, dpi $$1) {
      super(dmq.R, $$0, $$1);
   }

   @Nullable
   @Override
   public yp<aba> av_() {
      return abh.a(this);
   }

   @Override
   public to a(ip.a $$0) {
      return ac.a(new to(), $$1 -> $$1.a("shared_data", a(dou.b, this.c, $$0)));
   }

   @Override
   protected void b(to $$0, ip.a $$1) {
      super.b($$0, $$1);
      $$0.a("config", a(dos.c, this.e, $$1));
      $$0.a("shared_data", a(dou.b, this.c, $$1));
      $$0.a("server_data", a(dot.b, this.b, $$1));
   }

   private static <T> ul a(Codec<T> $$0, T $$1, ip.a $$2) {
      return ac.a($$0.encodeStart($$2.a(uc.a), $$1), IllegalStateException::new);
   }

   @Override
   public void a(to $$0, ip.a $$1) {
      super.a($$0, $$1);
      DynamicOps<ul> $$2 = $$1.a(uc.a);
      if ($$0.e("server_data")) {
         dot.b.parse($$2, $$0.c("server_data")).resultOrPartial(a::error).ifPresent(this.b::a);
      }

      if ($$0.e("config")) {
         dos.c.parse($$2, $$0.c("config")).resultOrPartial(a::error).ifPresent($$0x -> this.e = $$0x);
      }

      if ($$0.e("shared_data")) {
         dou.b.parse($$2, $$0.c("shared_data")).resultOrPartial(a::error).ifPresent(this.c::a);
      }
   }

   @Nullable
   public dot b() {
      return this.o != null && !this.o.B ? this.b : null;
   }

   public dou c() {
      return this.c;
   }

   public dor d() {
      return this.d;
   }

   public dos f() {
      return this.e;
   }

   @VisibleForTesting
   public void a(dos $$0) {
      this.e = $$0;
   }

   public static final class a {
      private static final int a = 20;
      private static final float b = 0.5F;
      private static final float c = 0.02F;
      private static final int d = 20;
      private static final int e = 20;

      public static void a(czg $$0, id $$1, dpi $$2, dor $$3, dou $$4) {
         $$3.c();
         if ($$0.Y() % 20L == 0L) {
            b($$0, $$1, $$2, $$4);
         }

         a($$0, $$1, $$4);
         b($$0, $$1, $$4);
      }

      public static void a(czg $$0, id $$1, dpi $$2, dou $$3) {
         b($$0, $$1, $$2, $$3);
         axt $$4 = $$0.z;

         for (int $$5 = 0; $$5 < 20; $$5++) {
            esj $$6 = b($$1, $$4);
            $$0.a(kn.ac, $$6.a(), $$6.b(), $$6.c(), 0.0, 0.0, 0.0);
            $$0.a(kn.aH, $$6.a(), $$6.b(), $$6.c(), 0.0, 0.0, 0.0);
         }
      }

      public static void a(czg $$0, id $$1) {
         axt $$2 = $$0.z;

         for (int $$3 = 0; $$3 < 20; $$3++) {
            esj $$4 = a($$1, $$2);
            esj $$5 = new esj($$2.k() * 0.02, $$2.k() * 0.02, $$2.k() * 0.02);
            $$0.a(kn.aH, $$4.a(), $$4.b(), $$4.c(), $$5.a(), $$5.b(), $$5.c());
         }
      }

      private static void a(czg $$0, id $$1, dou $$2) {
         axt $$3 = $$0.E_();
         if ($$3.i() <= 0.5F) {
            esj $$4 = b($$1, $$3);
            $$0.a(kn.ac, $$4.a(), $$4.b(), $$4.c(), 0.0, 0.0, 0.0);
            if (a($$2)) {
               $$0.a(kn.aH, $$4.a(), $$4.b(), $$4.c(), 0.0, 0.0, 0.0);
            }
         }
      }

      private static void a(czg $$0, esj $$1, cka $$2) {
         axt $$3 = $$0.z;
         esj $$4 = $$1.a($$2.dk().b(0.0, (double)($$2.dh() / 2.0F), 0.0));
         int $$5 = axm.a($$3, 2, 5);

         for (int $$6 = 0; $$6 < $$5; $$6++) {
            esj $$7 = $$4.a($$3, 1.0F);
            $$0.a(kn.aX, $$1.a(), $$1.b(), $$1.c(), $$7.a(), $$7.b(), $$7.c());
         }
      }

      private static void b(czg $$0, id $$1, dpi $$2, dou $$3) {
         Set<UUID> $$4 = $$3.d();
         if (!$$4.isEmpty()) {
            esj $$5 = a($$1, $$2.c(dlb.c));

            for (UUID $$6 : $$4) {
               cka $$7 = $$0.b($$6);
               if ($$7 != null && a($$1, $$3, $$7)) {
                  a($$0, $$5, $$7);
               }
            }
         }
      }

      private static boolean a(id $$0, dou $$1, cka $$2) {
         return $$2.dm().j($$0) <= axm.k($$1.e());
      }

      private static void b(czg $$0, id $$1, dou $$2) {
         if (a($$2)) {
            axt $$3 = $$0.E_();
            if ($$3.i() <= 0.02F) {
               $$0.a($$1, auo.Af, aup.e, $$3.i() * 0.25F + 0.75F, $$3.i() + 0.5F, false);
            }
         }
      }

      public static boolean a(dou $$0) {
         return $$0.b();
      }

      private static esj a(id $$0, axt $$1) {
         return esj.a($$0).b(axm.a($$1, 0.4, 0.6), axm.a($$1, 0.4, 0.6), axm.a($$1, 0.4, 0.6));
      }

      private static esj b(id $$0, axt $$1) {
         return esj.a($$0).b(axm.a($$1, 0.1, 0.9), axm.a($$1, 0.25, 0.75), axm.a($$1, 0.1, 0.9));
      }

      private static esj a(id $$0, ij $$1) {
         return esj.c($$0).b((double)$$1.j() * 0.5, 1.75, (double)$$1.l() * 0.5);
      }
   }

   public static final class b {
      private static final int a = 14;
      private static final int b = 20;
      private static final int c = 15;

      public static void a(apu $$0, id $$1, dpi $$2, dos $$3, dot $$4, dou $$5) {
         dov $$6 = $$2.c(dlb.b);
         if (a($$0.Y(), $$6)) {
            a($$0, $$6, $$3, $$5, $$1);
         }

         dpi $$7 = $$2;
         if ($$0.Y() >= $$4.c()) {
            $$7 = $$2.a(dlb.b, $$6.a($$0, $$1, $$3, $$4, $$5));
            if (!$$2.equals($$7)) {
               a($$0, $$1, $$2, $$7, $$3, $$5);
            }
         }

         if ($$4.c || $$5.c) {
            doq.a($$0, $$1, $$2);
            if ($$5.c) {
               $$0.a($$1, $$2, $$7, 2);
            }

            $$4.c = false;
            $$5.c = false;
         }
      }

      public static void a(apu $$0, id $$1, dpi $$2, dos $$3, dot $$4, dou $$5, cka $$6, crs $$7) {
         dov $$8 = $$2.c(dlb.b);
         if (a($$3, $$8)) {
            if (!a($$3, $$7)) {
               a($$0, $$4, $$1);
            } else if ($$4.a($$6)) {
               a($$0, $$4, $$1);
            } else {
               List<crs> $$9 = a($$0, $$3, $$1, $$6);
               if (!$$9.isEmpty()) {
                  $$6.b(auz.c.b($$7.f()));
                  if (!$$6.f()) {
                     $$7.g($$3.e().G());
                  }

                  a($$0, $$2, $$1, $$3, $$4, $$5, $$9);
                  $$4.b($$6);
                  $$5.a($$0, $$1, $$4, $$3, $$3.d());
               }
            }
         }
      }

      static void a(apu $$0, id $$1, dpi $$2, dpi $$3, dos $$4, dou $$5) {
         dov $$6 = $$2.c(dlb.b);
         dov $$7 = $$3.c(dlb.b);
         $$0.a($$1, $$3, 3);
         $$6.a($$0, $$1, $$7, $$4, $$5);
      }

      static void a(apu $$0, dov $$1, dos $$2, dou $$3, id $$4) {
         if (!a($$2, $$1)) {
            $$3.a(crs.i);
         } else {
            crs $$5 = a($$0, $$4, $$2.f().orElse($$2.b()));
            $$3.a($$5);
         }
      }

      private static crs a(apu $$0, id $$1, ajv $$2) {
         ens $$3 = $$0.o().aM().getLootTable($$2);
         enq $$4 = new enq.a($$0).a(epx.f, esj.b($$1)).a(epw.k);
         List<crs> $$5 = $$3.a($$4);
         return $$5.isEmpty() ? crs.i : ac.a($$5, $$0.E_());
      }

      private static void a(apu $$0, dpi $$1, id $$2, dos $$3, dot $$4, dou $$5, List<crs> $$6) {
         $$4.a($$6);
         $$5.a($$4.f());
         $$4.b($$0.Y() + 14L);
         a($$0, $$2, $$1, $$1.a(dlb.b, dov.c), $$3, $$5);
      }

      private static List<crs> a(apu $$0, dos $$1, id $$2, cka $$3) {
         ens $$4 = $$0.o().aM().getLootTable($$1.b());
         enq $$5 = new enq.a($$0).a(epx.f, esj.b($$2)).a($$3.gv()).a(epx.a, $$3).a(epw.k);
         return $$4.a($$5);
      }

      private static boolean a(dos $$0, dov $$1) {
         return !$$0.b().equals(eni.a) && !$$0.e().d() && $$1 != dov.a;
      }

      private static boolean a(dos $$0, crs $$1) {
         return crs.c($$1, $$0.e()) && $$1.G() >= $$0.e().G();
      }

      private static boolean a(long $$0, dov $$1) {
         return $$0 % 20L == 0L && $$1 == dov.b;
      }

      private static void a(apu $$0, dot $$1, id $$2) {
         if ($$0.Y() >= $$1.a() + 15L) {
            $$0.a(null, $$2, auo.An, aup.e);
            $$1.a($$0.Y());
         }
      }
   }
}
