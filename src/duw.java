import com.google.common.annotations.VisibleForTesting;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DynamicOps;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class duw extends dsr {
   private static final Logger a = LogUtils.getLogger();
   private final duz b = new duz();
   private final dva c = new dva();
   private final dux d = new dux();
   private duy e = duy.b;

   public duw(jh $$0, dvo $$1) {
      super(dst.R, $$0, $$1);
   }

   @Nullable
   @Override
   public zs<ach> ay_() {
      return aco.a(this);
   }

   @Override
   public un a(js.a $$0) {
      return ae.a(new un(), $$1 -> $$1.a("shared_data", a(dva.b, this.c, $$0)));
   }

   @Override
   protected void b(un $$0, js.a $$1) {
      super.b($$0, $$1);
      $$0.a("config", a(duy.c, this.e, $$1));
      $$0.a("shared_data", a(dva.b, this.c, $$1));
      $$0.a("server_data", a(duz.b, this.b, $$1));
   }

   private static <T> vk a(Codec<T> $$0, T $$1, js.a $$2) {
      return (vk)$$0.encodeStart($$2.a(vb.a), $$1).getOrThrow();
   }

   @Override
   protected void a(un $$0, js.a $$1) {
      super.a($$0, $$1);
      DynamicOps<vk> $$2 = $$1.a(vb.a);
      if ($$0.e("server_data")) {
         duz.b.parse($$2, $$0.c("server_data")).resultOrPartial(a::error).ifPresent(this.b::a);
      }

      if ($$0.e("config")) {
         duy.c.parse($$2, $$0.c("config")).resultOrPartial(a::error).ifPresent($$0x -> this.e = $$0x);
      }

      if ($$0.e("shared_data")) {
         dva.b.parse($$2, $$0.c("shared_data")).resultOrPartial(a::error).ifPresent(this.c::a);
      }
   }

   @Nullable
   public duz b() {
      return this.o != null && !this.o.C ? this.b : null;
   }

   public dva c() {
      return this.c;
   }

   public dux d() {
      return this.d;
   }

   public duy f() {
      return this.e;
   }

   @VisibleForTesting
   public void a(duy $$0) {
      this.e = $$0;
   }

   public static final class a {
      private static final int a = 20;
      private static final float b = 0.5F;
      private static final float c = 0.02F;
      private static final int d = 20;
      private static final int e = 20;

      public static void a(dff $$0, jh $$1, dvo $$2, dux $$3, dva $$4) {
         $$3.c();
         if ($$0.aa() % 20L == 0L) {
            a($$0, $$1, $$2, $$4);
         }

         a($$0, $$1, $$4, $$2.c(dre.d) ? ls.L : ls.aJ);
         a($$0, $$1, $$4);
      }

      public static void a(dff $$0, jh $$1, dvo $$2, dva $$3, lq $$4) {
         a($$0, $$1, $$2, $$3);
         azv $$5 = $$0.A;

         for (int $$6 = 0; $$6 < 20; $$6++) {
            ezr $$7 = b($$1, $$5);
            $$0.a(ls.ae, $$7.a(), $$7.b(), $$7.c(), 0.0, 0.0, 0.0);
            $$0.a($$4, $$7.a(), $$7.b(), $$7.c(), 0.0, 0.0, 0.0);
         }
      }

      public static void a(dff $$0, jh $$1, lq $$2) {
         azv $$3 = $$0.A;

         for (int $$4 = 0; $$4 < 20; $$4++) {
            ezr $$5 = a($$1, $$3);
            ezr $$6 = new ezr($$3.k() * 0.02, $$3.k() * 0.02, $$3.k() * 0.02);
            $$0.a($$2, $$5.a(), $$5.b(), $$5.c(), $$6.a(), $$6.b(), $$6.c());
         }
      }

      private static void a(dff $$0, jh $$1, dva $$2, lq $$3) {
         azv $$4 = $$0.E_();
         if ($$4.i() <= 0.5F) {
            ezr $$5 = b($$1, $$4);
            $$0.a(ls.ae, $$5.a(), $$5.b(), $$5.c(), 0.0, 0.0, 0.0);
            if (a($$2)) {
               $$0.a($$3, $$5.a(), $$5.b(), $$5.c(), 0.0, 0.0, 0.0);
            }
         }
      }

      private static void a(dff $$0, ezr $$1, cor $$2) {
         azv $$3 = $$0.A;
         ezr $$4 = $$1.a($$2.dw().b(0.0, (double)($$2.du() / 2.0F), 0.0));
         int $$5 = azn.a($$3, 2, 5);

         for (int $$6 = 0; $$6 < $$5; $$6++) {
            ezr $$7 = $$4.a($$3, 1.0F);
            $$0.a(ls.ba, $$1.a(), $$1.b(), $$1.c(), $$7.a(), $$7.b(), $$7.c());
         }
      }

      private static void a(dff $$0, jh $$1, dvo $$2, dva $$3) {
         Set<UUID> $$4 = $$3.d();
         if (!$$4.isEmpty()) {
            ezr $$5 = a($$1, $$2.c(dre.c));

            for (UUID $$6 : $$4) {
               cor $$7 = $$0.b($$6);
               if ($$7 != null && a($$1, $$3, $$7)) {
                  a($$0, $$5, $$7);
               }
            }
         }
      }

      private static boolean a(jh $$0, dva $$1, cor $$2) {
         return $$2.dy().j($$0) <= azn.k($$1.e());
      }

      private static void a(dff $$0, jh $$1, dva $$2) {
         if (a($$2)) {
            azv $$3 = $$0.E_();
            if ($$3.i() <= 0.02F) {
               $$0.a($$1, awo.AF, awp.e, $$3.i() * 0.25F + 0.75F, $$3.i() + 0.5F, false);
            }
         }
      }

      public static boolean a(dva $$0) {
         return $$0.b();
      }

      private static ezr a(jh $$0, azv $$1) {
         return ezr.a($$0).b(azn.a($$1, 0.4, 0.6), azn.a($$1, 0.4, 0.6), azn.a($$1, 0.4, 0.6));
      }

      private static ezr b(jh $$0, azv $$1) {
         return ezr.a($$0).b(azn.a($$1, 0.1, 0.9), azn.a($$1, 0.25, 0.75), azn.a($$1, 0.1, 0.9));
      }

      private static ezr a(jh $$0, jm $$1) {
         return ezr.c($$0).b((double)$$1.j() * 0.5, 1.75, (double)$$1.l() * 0.5);
      }
   }

   public static final class b {
      private static final int a = 14;
      private static final int b = 20;
      private static final int c = 15;

      public static void a(arq $$0, jh $$1, dvo $$2, duy $$3, duz $$4, dva $$5) {
         dvb $$6 = $$2.c(dre.b);
         if (a($$0.aa(), $$6)) {
            a($$0, $$6, $$3, $$5, $$1);
         }

         dvo $$7 = $$2;
         if ($$0.aa() >= $$4.c()) {
            $$7 = $$2.b(dre.b, $$6.a($$0, $$1, $$3, $$4, $$5));
            if (!$$2.equals($$7)) {
               a($$0, $$1, $$2, $$7, $$3, $$5);
            }
         }

         if ($$4.c || $$5.c) {
            duw.a($$0, $$1, $$2);
            if ($$5.c) {
               $$0.a($$1, $$2, $$7, 2);
            }

            $$4.c = false;
            $$5.c = false;
         }
      }

      public static void a(arq $$0, jh $$1, dvo $$2, duy $$3, duz $$4, dva $$5, cor $$6, cwf $$7) {
         dvb $$8 = $$2.c(dre.b);
         if (a($$3, $$8)) {
            if (!a($$3, $$7)) {
               a($$0, $$4, $$1, awo.AO);
            } else if ($$4.a($$6)) {
               a($$0, $$4, $$1, awo.AK);
            } else {
               List<cwf> $$9 = a($$0, $$3, $$1, $$6, $$7);
               if (!$$9.isEmpty()) {
                  $$6.b(awy.c.b($$7.h()));
                  $$7.a($$3.e().L(), (bve)$$6);
                  a($$0, $$2, $$1, $$3, $$4, $$5, $$9);
                  $$4.b($$6);
                  $$5.a($$0, $$1, $$4, $$3, $$3.d());
               }
            }
         }
      }

      static void a(arq $$0, jh $$1, dvo $$2, dvo $$3, duy $$4, dva $$5) {
         dvb $$6 = $$2.c(dre.b);
         dvb $$7 = $$3.c(dre.b);
         $$0.a($$1, $$3, 3);
         $$6.a($$0, $$1, $$7, $$4, $$5, $$3.c(dre.d));
      }

      static void a(arq $$0, dvb $$1, duy $$2, dva $$3, jh $$4) {
         if (!a($$2, $$1)) {
            $$3.a(cwf.k);
         } else {
            cwf $$5 = a($$0, $$4, $$2.f().orElse($$2.b()));
            $$3.a($$5);
         }
      }

      private static cwf a(arq $$0, jh $$1, alk<eul> $$2) {
         eul $$3 = $$0.o().bc().b($$2);
         euj $$4 = new euj.a($$0).a(exc.f, ezr.b($$1)).a(exb.l);
         List<cwf> $$5 = $$3.a($$4, $$0.E_());
         return $$5.isEmpty() ? cwf.k : ae.a($$5, $$0.E_());
      }

      private static void a(arq $$0, dvo $$1, jh $$2, duy $$3, duz $$4, dva $$5, List<cwf> $$6) {
         $$4.a($$6);
         $$5.a($$4.f());
         $$4.b($$0.aa() + 14L);
         a($$0, $$2, $$1, $$1.b(dre.b, dvb.c), $$3, $$5);
      }

      private static List<cwf> a(arq $$0, duy $$1, jh $$2, cor $$3, cwf $$4) {
         eul $$5 = $$0.o().bc().b($$1.b());
         euj $$6 = new euj.a($$0).a(exc.f, ezr.b($$2)).a($$3.gI()).a(exc.a, $$3).a(exc.i, $$4).a(exb.l);
         return $$5.a($$6);
      }

      private static boolean a(duy $$0, dvb $$1) {
         return !$$0.e().f() && $$1 != dvb.a;
      }

      private static boolean a(duy $$0, cwf $$1) {
         return cwf.c($$1, $$0.e()) && $$1.L() >= $$0.e().L();
      }

      private static boolean a(long $$0, dvb $$1) {
         return $$0 % 20L == 0L && $$1 == dvb.b;
      }

      private static void a(arq $$0, duz $$1, jh $$2, awn $$3) {
         if ($$0.aa() >= $$1.a() + 15L) {
            $$0.a(null, $$2, $$3, awp.e);
            $$1.a($$0.aa());
         }
      }
   }
}
