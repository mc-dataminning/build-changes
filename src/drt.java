import com.google.common.annotations.VisibleForTesting;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DynamicOps;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class drt extends dpq {
   private static final Logger a = LogUtils.getLogger();
   private final drw b = new drw();
   private final drx c = new drx();
   private final dru d = new dru();
   private drv e = drv.b;

   public drt(ja $$0, dsl $$1) {
      super(dps.R, $$0, $$1);
   }

   @Nullable
   @Override
   public zb<abn> av_() {
      return abu.a(this);
   }

   @Override
   public tx a(jl.a $$0) {
      return ac.a(new tx(), $$1 -> $$1.a("shared_data", a(drx.b, this.c, $$0)));
   }

   @Override
   protected void b(tx $$0, jl.a $$1) {
      super.b($$0, $$1);
      $$0.a("config", a(drv.c, this.e, $$1));
      $$0.a("shared_data", a(drx.b, this.c, $$1));
      $$0.a("server_data", a(drw.b, this.b, $$1));
   }

   private static <T> uu a(Codec<T> $$0, T $$1, jl.a $$2) {
      return (uu)$$0.encodeStart($$2.a(ul.a), $$1).getOrThrow();
   }

   @Override
   protected void a(tx $$0, jl.a $$1) {
      super.a($$0, $$1);
      DynamicOps<uu> $$2 = $$1.a(ul.a);
      if ($$0.e("server_data")) {
         drw.b.parse($$2, $$0.c("server_data")).resultOrPartial(a::error).ifPresent(this.b::a);
      }

      if ($$0.e("config")) {
         drv.c.parse($$2, $$0.c("config")).resultOrPartial(a::error).ifPresent($$0x -> this.e = $$0x);
      }

      if ($$0.e("shared_data")) {
         drx.b.parse($$2, $$0.c("shared_data")).resultOrPartial(a::error).ifPresent(this.c::a);
      }
   }

   @Nullable
   public drw b() {
      return this.n != null && !this.n.B ? this.b : null;
   }

   public drx c() {
      return this.c;
   }

   public dru d() {
      return this.d;
   }

   public drv f() {
      return this.e;
   }

   @VisibleForTesting
   public void a(drv $$0) {
      this.e = $$0;
   }

   public static final class a {
      private static final int a = 20;
      private static final float b = 0.5F;
      private static final float c = 0.02F;
      private static final int d = 20;
      private static final int e = 20;

      public static void a(dcg $$0, ja $$1, dsl $$2, dru $$3, drx $$4) {
         $$3.c();
         if ($$0.Z() % 20L == 0L) {
            a($$0, $$1, $$2, $$4);
         }

         a($$0, $$1, $$4, $$2.c(dod.d) ? lj.L : lj.aJ);
         a($$0, $$1, $$4);
      }

      public static void a(dcg $$0, ja $$1, dsl $$2, drx $$3, lh $$4) {
         a($$0, $$1, $$2, $$3);
         ayo $$5 = $$0.z;

         for (int $$6 = 0; $$6 < 20; $$6++) {
            ewh $$7 = b($$1, $$5);
            $$0.a(lj.ae, $$7.a(), $$7.b(), $$7.c(), 0.0, 0.0, 0.0);
            $$0.a($$4, $$7.a(), $$7.b(), $$7.c(), 0.0, 0.0, 0.0);
         }
      }

      public static void a(dcg $$0, ja $$1, lh $$2) {
         ayo $$3 = $$0.z;

         for (int $$4 = 0; $$4 < 20; $$4++) {
            ewh $$5 = a($$1, $$3);
            ewh $$6 = new ewh($$3.k() * 0.02, $$3.k() * 0.02, $$3.k() * 0.02);
            $$0.a($$2, $$5.a(), $$5.b(), $$5.c(), $$6.a(), $$6.b(), $$6.c());
         }
      }

      private static void a(dcg $$0, ja $$1, drx $$2, lh $$3) {
         ayo $$4 = $$0.E_();
         if ($$4.i() <= 0.5F) {
            ewh $$5 = b($$1, $$4);
            $$0.a(lj.ae, $$5.a(), $$5.b(), $$5.c(), 0.0, 0.0, 0.0);
            if (a($$2)) {
               $$0.a($$3, $$5.a(), $$5.b(), $$5.c(), 0.0, 0.0, 0.0);
            }
         }
      }

      private static void a(dcg $$0, ewh $$1, cml $$2) {
         ayo $$3 = $$0.z;
         ewh $$4 = $$1.a($$2.dp().b(0.0, (double)($$2.dm() / 2.0F), 0.0));
         int $$5 = ayg.a($$3, 2, 5);

         for (int $$6 = 0; $$6 < $$5; $$6++) {
            ewh $$7 = $$4.a($$3, 1.0F);
            $$0.a(lj.ba, $$1.a(), $$1.b(), $$1.c(), $$7.a(), $$7.b(), $$7.c());
         }
      }

      private static void a(dcg $$0, ja $$1, dsl $$2, drx $$3) {
         Set<UUID> $$4 = $$3.d();
         if (!$$4.isEmpty()) {
            ewh $$5 = a($$1, $$2.c(dod.c));

            for (UUID $$6 : $$4) {
               cml $$7 = $$0.b($$6);
               if ($$7 != null && a($$1, $$3, $$7)) {
                  a($$0, $$5, $$7);
               }
            }
         }
      }

      private static boolean a(ja $$0, drx $$1, cml $$2) {
         return $$2.dr().j($$0) <= ayg.k($$1.e());
      }

      private static void a(dcg $$0, ja $$1, drx $$2) {
         if (a($$2)) {
            ayo $$3 = $$0.E_();
            if ($$3.i() <= 0.02F) {
               $$0.a($$1, avh.AB, avi.e, $$3.i() * 0.25F + 0.75F, $$3.i() + 0.5F, false);
            }
         }
      }

      public static boolean a(drx $$0) {
         return $$0.b();
      }

      private static ewh a(ja $$0, ayo $$1) {
         return ewh.a($$0).b(ayg.a($$1, 0.4, 0.6), ayg.a($$1, 0.4, 0.6), ayg.a($$1, 0.4, 0.6));
      }

      private static ewh b(ja $$0, ayo $$1) {
         return ewh.a($$0).b(ayg.a($$1, 0.1, 0.9), ayg.a($$1, 0.25, 0.75), ayg.a($$1, 0.1, 0.9));
      }

      private static ewh a(ja $$0, jf $$1) {
         return ewh.c($$0).b((double)$$1.j() * 0.5, 1.75, (double)$$1.l() * 0.5);
      }
   }

   public static final class b {
      private static final int a = 14;
      private static final int b = 20;
      private static final int c = 15;

      public static void a(aqm $$0, ja $$1, dsl $$2, drv $$3, drw $$4, drx $$5) {
         dry $$6 = $$2.c(dod.b);
         if (a($$0.Z(), $$6)) {
            a($$0, $$6, $$3, $$5, $$1);
         }

         dsl $$7 = $$2;
         if ($$0.Z() >= $$4.c()) {
            $$7 = $$2.a(dod.b, $$6.a($$0, $$1, $$3, $$4, $$5));
            if (!$$2.equals($$7)) {
               a($$0, $$1, $$2, $$7, $$3, $$5);
            }
         }

         if ($$4.c || $$5.c) {
            drt.a($$0, $$1, $$2);
            if ($$5.c) {
               $$0.a($$1, $$2, $$7, 2);
            }

            $$4.c = false;
            $$5.c = false;
         }
      }

      public static void a(aqm $$0, ja $$1, dsl $$2, drv $$3, drw $$4, drx $$5, cml $$6, cud $$7) {
         dry $$8 = $$2.c(dod.b);
         if (a($$3, $$8)) {
            if (!a($$3, $$7)) {
               a($$0, $$4, $$1);
            } else if ($$4.a($$6)) {
               a($$0, $$4, $$1);
            } else {
               List<cud> $$9 = a($$0, $$3, $$1, $$6);
               if (!$$9.isEmpty()) {
                  $$6.b(avr.c.b($$7.g()));
                  $$7.a($$3.e().H(), $$6);
                  a($$0, $$2, $$1, $$3, $$4, $$5, $$9);
                  $$4.b($$6);
                  $$5.a($$0, $$1, $$4, $$3, $$3.d());
               }
            }
         }
      }

      static void a(aqm $$0, ja $$1, dsl $$2, dsl $$3, drv $$4, drx $$5) {
         dry $$6 = $$2.c(dod.b);
         dry $$7 = $$3.c(dod.b);
         $$0.a($$1, $$3, 3);
         $$6.a($$0, $$1, $$7, $$4, $$5, $$3.c(dod.d));
      }

      static void a(aqm $$0, dry $$1, drv $$2, drx $$3, ja $$4) {
         if (!a($$2, $$1)) {
            $$3.a(cud.l);
         } else {
            cud $$5 = a($$0, $$4, $$2.f().orElse($$2.b()));
            $$3.a($$5);
         }
      }

      private static cud a(aqm $$0, ja $$1, akj<erb> $$2) {
         erb $$3 = $$0.o().bf().b($$2);
         eqz $$4 = new eqz.a($$0).a(ets.f, ewh.b($$1)).a(etr.l);
         List<cud> $$5 = $$3.a($$4, $$0.E_());
         return $$5.isEmpty() ? cud.l : ac.a($$5, $$0.E_());
      }

      private static void a(aqm $$0, dsl $$1, ja $$2, drv $$3, drw $$4, drx $$5, List<cud> $$6) {
         $$4.a($$6);
         $$5.a($$4.f());
         $$4.b($$0.Z() + 14L);
         a($$0, $$2, $$1, $$1.a(dod.b, dry.c), $$3, $$5);
      }

      private static List<cud> a(aqm $$0, drv $$1, ja $$2, cml $$3) {
         erb $$4 = $$0.o().bf().b($$1.b());
         eqz $$5 = new eqz.a($$0).a(ets.f, ewh.b($$2)).a($$3.gw()).a(ets.a, $$3).a(etr.l);
         return $$4.a($$5);
      }

      private static boolean a(drv $$0, dry $$1) {
         return $$0.b() != eqs.a && !$$0.e().e() && $$1 != dry.a;
      }

      private static boolean a(drv $$0, cud $$1) {
         return cud.c($$1, $$0.e()) && $$1.H() >= $$0.e().H();
      }

      private static boolean a(long $$0, dry $$1) {
         return $$0 % 20L == 0L && $$1 == dry.b;
      }

      private static void a(aqm $$0, drw $$1, ja $$2) {
         if ($$0.Z() >= $$1.a() + 15L) {
            $$0.a(null, $$2, avh.AJ, avi.e);
            $$1.a($$0.Z());
         }
      }
   }
}
