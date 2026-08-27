import com.google.common.annotations.VisibleForTesting;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DynamicOps;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dpg extends dnd {
   private static final Logger a = LogUtils.getLogger();
   private final dpj b = new dpj();
   private final dpk c = new dpk();
   private final dph d = new dph();
   private dpi e = dpi.b;

   public dpg(im $$0, dpy $$1) {
      super(dnf.R, $$0, $$1);
   }

   @Nullable
   @Override
   public yz<abk> av_() {
      return abr.a(this);
   }

   @Override
   public ty a(ix.a $$0) {
      return ac.a(new ty(), $$1 -> $$1.a("shared_data", a(dpk.b, this.c, $$0)));
   }

   @Override
   protected void b(ty $$0, ix.a $$1) {
      super.b($$0, $$1);
      $$0.a("config", a(dpi.c, this.e, $$1));
      $$0.a("shared_data", a(dpk.b, this.c, $$1));
      $$0.a("server_data", a(dpj.b, this.b, $$1));
   }

   private static <T> uv a(Codec<T> $$0, T $$1, ix.a $$2) {
      return ac.a($$0.encodeStart($$2.a(um.a), $$1), IllegalStateException::new);
   }

   @Override
   public void a(ty $$0, ix.a $$1) {
      super.a($$0, $$1);
      DynamicOps<uv> $$2 = $$1.a(um.a);
      if ($$0.e("server_data")) {
         dpj.b.parse($$2, $$0.c("server_data")).resultOrPartial(a::error).ifPresent(this.b::a);
      }

      if ($$0.e("config")) {
         dpi.c.parse($$2, $$0.c("config")).resultOrPartial(a::error).ifPresent($$0x -> this.e = $$0x);
      }

      if ($$0.e("shared_data")) {
         dpk.b.parse($$2, $$0.c("shared_data")).resultOrPartial(a::error).ifPresent(this.c::a);
      }
   }

   @Nullable
   public dpj b() {
      return this.o != null && !this.o.B ? this.b : null;
   }

   public dpk c() {
      return this.c;
   }

   public dph d() {
      return this.d;
   }

   public dpi f() {
      return this.e;
   }

   @VisibleForTesting
   public void a(dpi $$0) {
      this.e = $$0;
   }

   public static final class a {
      private static final int a = 20;
      private static final float b = 0.5F;
      private static final float c = 0.02F;
      private static final int d = 20;
      private static final int e = 20;

      public static void a(czu $$0, im $$1, dpy $$2, dph $$3, dpk $$4) {
         $$3.c();
         if ($$0.Y() % 20L == 0L) {
            b($$0, $$1, $$2, $$4);
         }

         a($$0, $$1, $$4);
         b($$0, $$1, $$4);
      }

      public static void a(czu $$0, im $$1, dpy $$2, dpk $$3) {
         b($$0, $$1, $$2, $$3);
         ayd $$4 = $$0.z;

         for (int $$5 = 0; $$5 < 20; $$5++) {
            etf $$6 = b($$1, $$4);
            $$0.a(kw.ab, $$6.a(), $$6.b(), $$6.c(), 0.0, 0.0, 0.0);
            $$0.a(kw.aG, $$6.a(), $$6.b(), $$6.c(), 0.0, 0.0, 0.0);
         }
      }

      public static void a(czu $$0, im $$1) {
         ayd $$2 = $$0.z;

         for (int $$3 = 0; $$3 < 20; $$3++) {
            etf $$4 = a($$1, $$2);
            etf $$5 = new etf($$2.k() * 0.02, $$2.k() * 0.02, $$2.k() * 0.02);
            $$0.a(kw.aG, $$4.a(), $$4.b(), $$4.c(), $$5.a(), $$5.b(), $$5.c());
         }
      }

      private static void a(czu $$0, im $$1, dpk $$2) {
         ayd $$3 = $$0.E_();
         if ($$3.i() <= 0.5F) {
            etf $$4 = b($$1, $$3);
            $$0.a(kw.ab, $$4.a(), $$4.b(), $$4.c(), 0.0, 0.0, 0.0);
            if (a($$2)) {
               $$0.a(kw.aG, $$4.a(), $$4.b(), $$4.c(), 0.0, 0.0, 0.0);
            }
         }
      }

      private static void a(czu $$0, etf $$1, ckl $$2) {
         ayd $$3 = $$0.z;
         etf $$4 = $$1.a($$2.dl().b(0.0, (double)($$2.di() / 2.0F), 0.0));
         int $$5 = axw.a($$3, 2, 5);

         for (int $$6 = 0; $$6 < $$5; $$6++) {
            etf $$7 = $$4.a($$3, 1.0F);
            $$0.a(kw.aW, $$1.a(), $$1.b(), $$1.c(), $$7.a(), $$7.b(), $$7.c());
         }
      }

      private static void b(czu $$0, im $$1, dpy $$2, dpk $$3) {
         Set<UUID> $$4 = $$3.d();
         if (!$$4.isEmpty()) {
            etf $$5 = a($$1, $$2.c(dlq.c));

            for (UUID $$6 : $$4) {
               ckl $$7 = $$0.b($$6);
               if ($$7 != null && a($$1, $$3, $$7)) {
                  a($$0, $$5, $$7);
               }
            }
         }
      }

      private static boolean a(im $$0, dpk $$1, ckl $$2) {
         return $$2.dn().j($$0) <= axw.k($$1.e());
      }

      private static void b(czu $$0, im $$1, dpk $$2) {
         if (a($$2)) {
            ayd $$3 = $$0.E_();
            if ($$3.i() <= 0.02F) {
               $$0.a($$1, auz.Am, ava.e, $$3.i() * 0.25F + 0.75F, $$3.i() + 0.5F, false);
            }
         }
      }

      public static boolean a(dpk $$0) {
         return $$0.b();
      }

      private static etf a(im $$0, ayd $$1) {
         return etf.a($$0).b(axw.a($$1, 0.4, 0.6), axw.a($$1, 0.4, 0.6), axw.a($$1, 0.4, 0.6));
      }

      private static etf b(im $$0, ayd $$1) {
         return etf.a($$0).b(axw.a($$1, 0.1, 0.9), axw.a($$1, 0.25, 0.75), axw.a($$1, 0.1, 0.9));
      }

      private static etf a(im $$0, ir $$1) {
         return etf.c($$0).b((double)$$1.j() * 0.5, 1.75, (double)$$1.l() * 0.5);
      }
   }

   public static final class b {
      private static final int a = 14;
      private static final int b = 20;
      private static final int c = 15;

      public static void a(aqe $$0, im $$1, dpy $$2, dpi $$3, dpj $$4, dpk $$5) {
         dpl $$6 = $$2.c(dlq.b);
         if (a($$0.Y(), $$6)) {
            a($$0, $$6, $$3, $$5, $$1);
         }

         dpy $$7 = $$2;
         if ($$0.Y() >= $$4.c()) {
            $$7 = $$2.a(dlq.b, $$6.a($$0, $$1, $$3, $$4, $$5));
            if (!$$2.equals($$7)) {
               a($$0, $$1, $$2, $$7, $$3, $$5);
            }
         }

         if ($$4.c || $$5.c) {
            dpg.a($$0, $$1, $$2);
            if ($$5.c) {
               $$0.a($$1, $$2, $$7, 2);
            }

            $$4.c = false;
            $$5.c = false;
         }
      }

      public static void a(aqe $$0, im $$1, dpy $$2, dpi $$3, dpj $$4, dpk $$5, ckl $$6, csd $$7) {
         dpl $$8 = $$2.c(dlq.b);
         if (a($$3, $$8)) {
            if (!a($$3, $$7)) {
               a($$0, $$4, $$1);
            } else if ($$4.a($$6)) {
               a($$0, $$4, $$1);
            } else {
               List<csd> $$9 = a($$0, $$3, $$1, $$6);
               if (!$$9.isEmpty()) {
                  $$6.b(avj.c.b($$7.f()));
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

      static void a(aqe $$0, im $$1, dpy $$2, dpy $$3, dpi $$4, dpk $$5) {
         dpl $$6 = $$2.c(dlq.b);
         dpl $$7 = $$3.c(dlq.b);
         $$0.a($$1, $$3, 3);
         $$6.a($$0, $$1, $$7, $$4, $$5);
      }

      static void a(aqe $$0, dpl $$1, dpi $$2, dpk $$3, im $$4) {
         if (!a($$2, $$1)) {
            $$3.a(csd.i);
         } else {
            csd $$5 = a($$0, $$4, $$2.f().orElse($$2.b()));
            $$3.a($$5);
         }
      }

      private static csd a(aqe $$0, im $$1, akf $$2) {
         eoi $$3 = $$0.o().aM().getLootTable($$2);
         eog $$4 = new eog.a($$0).a(eqt.f, etf.b($$1)).a(eqs.k);
         List<csd> $$5 = $$3.a($$4);
         return $$5.isEmpty() ? csd.i : ac.a($$5, $$0.E_());
      }

      private static void a(aqe $$0, dpy $$1, im $$2, dpi $$3, dpj $$4, dpk $$5, List<csd> $$6) {
         $$4.a($$6);
         $$5.a($$4.f());
         $$4.b($$0.Y() + 14L);
         a($$0, $$2, $$1, $$1.a(dlq.b, dpl.c), $$3, $$5);
      }

      private static List<csd> a(aqe $$0, dpi $$1, im $$2, ckl $$3) {
         eoi $$4 = $$0.o().aM().getLootTable($$1.b());
         eog $$5 = new eog.a($$0).a(eqt.f, etf.b($$2)).a($$3.gw()).a(eqt.a, $$3).a(eqs.k);
         return $$4.a($$5);
      }

      private static boolean a(dpi $$0, dpl $$1) {
         return !$$0.b().equals(eny.a) && !$$0.e().d() && $$1 != dpl.a;
      }

      private static boolean a(dpi $$0, csd $$1) {
         return csd.c($$1, $$0.e()) && $$1.G() >= $$0.e().G();
      }

      private static boolean a(long $$0, dpl $$1) {
         return $$0 % 20L == 0L && $$1 == dpl.b;
      }

      private static void a(aqe $$0, dpj $$1, im $$2) {
         if ($$0.Y() >= $$1.a() + 15L) {
            $$0.a(null, $$2, auz.Au, ava.e);
            $$1.a($$0.Y());
         }
      }
   }
}
