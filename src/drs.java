import com.google.common.annotations.VisibleForTesting;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DynamicOps;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class drs extends dpp {
   private static final Logger a = LogUtils.getLogger();
   private final drv b = new drv();
   private final drw c = new drw();
   private final drt d = new drt();
   private dru e = dru.b;

   public drs(ja $$0, dsk $$1) {
      super(dpr.R, $$0, $$1);
   }

   @Nullable
   @Override
   public zb<abn> av_() {
      return abu.a(this);
   }

   @Override
   public tx a(jl.a $$0) {
      return ac.a(new tx(), $$1 -> $$1.a("shared_data", a(drw.b, this.c, $$0)));
   }

   @Override
   protected void b(tx $$0, jl.a $$1) {
      super.b($$0, $$1);
      $$0.a("config", a(dru.c, this.e, $$1));
      $$0.a("shared_data", a(drw.b, this.c, $$1));
      $$0.a("server_data", a(drv.b, this.b, $$1));
   }

   private static <T> uu a(Codec<T> $$0, T $$1, jl.a $$2) {
      return (uu)$$0.encodeStart($$2.a(ul.a), $$1).getOrThrow();
   }

   @Override
   protected void a(tx $$0, jl.a $$1) {
      super.a($$0, $$1);
      DynamicOps<uu> $$2 = $$1.a(ul.a);
      if ($$0.e("server_data")) {
         drv.b.parse($$2, $$0.c("server_data")).resultOrPartial(a::error).ifPresent(this.b::a);
      }

      if ($$0.e("config")) {
         dru.c.parse($$2, $$0.c("config")).resultOrPartial(a::error).ifPresent($$0x -> this.e = $$0x);
      }

      if ($$0.e("shared_data")) {
         drw.b.parse($$2, $$0.c("shared_data")).resultOrPartial(a::error).ifPresent(this.c::a);
      }
   }

   @Nullable
   public drv b() {
      return this.n != null && !this.n.B ? this.b : null;
   }

   public drw c() {
      return this.c;
   }

   public drt d() {
      return this.d;
   }

   public dru f() {
      return this.e;
   }

   @VisibleForTesting
   public void a(dru $$0) {
      this.e = $$0;
   }

   public static final class a {
      private static final int a = 20;
      private static final float b = 0.5F;
      private static final float c = 0.02F;
      private static final int d = 20;
      private static final int e = 20;

      public static void a(dcf $$0, ja $$1, dsk $$2, drt $$3, drw $$4) {
         $$3.c();
         if ($$0.Z() % 20L == 0L) {
            a($$0, $$1, $$2, $$4);
         }

         a($$0, $$1, $$4, $$2.c(doc.d) ? lj.L : lj.aJ);
         a($$0, $$1, $$4);
      }

      public static void a(dcf $$0, ja $$1, dsk $$2, drw $$3, lh $$4) {
         a($$0, $$1, $$2, $$3);
         ayo $$5 = $$0.z;

         for (int $$6 = 0; $$6 < 20; $$6++) {
            ewf $$7 = b($$1, $$5);
            $$0.a(lj.ae, $$7.a(), $$7.b(), $$7.c(), 0.0, 0.0, 0.0);
            $$0.a($$4, $$7.a(), $$7.b(), $$7.c(), 0.0, 0.0, 0.0);
         }
      }

      public static void a(dcf $$0, ja $$1, lh $$2) {
         ayo $$3 = $$0.z;

         for (int $$4 = 0; $$4 < 20; $$4++) {
            ewf $$5 = a($$1, $$3);
            ewf $$6 = new ewf($$3.k() * 0.02, $$3.k() * 0.02, $$3.k() * 0.02);
            $$0.a($$2, $$5.a(), $$5.b(), $$5.c(), $$6.a(), $$6.b(), $$6.c());
         }
      }

      private static void a(dcf $$0, ja $$1, drw $$2, lh $$3) {
         ayo $$4 = $$0.E_();
         if ($$4.i() <= 0.5F) {
            ewf $$5 = b($$1, $$4);
            $$0.a(lj.ae, $$5.a(), $$5.b(), $$5.c(), 0.0, 0.0, 0.0);
            if (a($$2)) {
               $$0.a($$3, $$5.a(), $$5.b(), $$5.c(), 0.0, 0.0, 0.0);
            }
         }
      }

      private static void a(dcf $$0, ewf $$1, cmk $$2) {
         ayo $$3 = $$0.z;
         ewf $$4 = $$1.a($$2.do().b(0.0, (double)($$2.dl() / 2.0F), 0.0));
         int $$5 = ayg.a($$3, 2, 5);

         for (int $$6 = 0; $$6 < $$5; $$6++) {
            ewf $$7 = $$4.a($$3, 1.0F);
            $$0.a(lj.ba, $$1.a(), $$1.b(), $$1.c(), $$7.a(), $$7.b(), $$7.c());
         }
      }

      private static void a(dcf $$0, ja $$1, dsk $$2, drw $$3) {
         Set<UUID> $$4 = $$3.d();
         if (!$$4.isEmpty()) {
            ewf $$5 = a($$1, $$2.c(doc.c));

            for (UUID $$6 : $$4) {
               cmk $$7 = $$0.b($$6);
               if ($$7 != null && a($$1, $$3, $$7)) {
                  a($$0, $$5, $$7);
               }
            }
         }
      }

      private static boolean a(ja $$0, drw $$1, cmk $$2) {
         return $$2.dq().j($$0) <= ayg.k($$1.e());
      }

      private static void a(dcf $$0, ja $$1, drw $$2) {
         if (a($$2)) {
            ayo $$3 = $$0.E_();
            if ($$3.i() <= 0.02F) {
               $$0.a($$1, avh.AB, avi.e, $$3.i() * 0.25F + 0.75F, $$3.i() + 0.5F, false);
            }
         }
      }

      public static boolean a(drw $$0) {
         return $$0.b();
      }

      private static ewf a(ja $$0, ayo $$1) {
         return ewf.a($$0).b(ayg.a($$1, 0.4, 0.6), ayg.a($$1, 0.4, 0.6), ayg.a($$1, 0.4, 0.6));
      }

      private static ewf b(ja $$0, ayo $$1) {
         return ewf.a($$0).b(ayg.a($$1, 0.1, 0.9), ayg.a($$1, 0.25, 0.75), ayg.a($$1, 0.1, 0.9));
      }

      private static ewf a(ja $$0, jf $$1) {
         return ewf.c($$0).b((double)$$1.j() * 0.5, 1.75, (double)$$1.l() * 0.5);
      }
   }

   public static final class b {
      private static final int a = 14;
      private static final int b = 20;
      private static final int c = 15;

      public static void a(aqm $$0, ja $$1, dsk $$2, dru $$3, drv $$4, drw $$5) {
         drx $$6 = $$2.c(doc.b);
         if (a($$0.Z(), $$6)) {
            a($$0, $$6, $$3, $$5, $$1);
         }

         dsk $$7 = $$2;
         if ($$0.Z() >= $$4.c()) {
            $$7 = $$2.a(doc.b, $$6.a($$0, $$1, $$3, $$4, $$5));
            if (!$$2.equals($$7)) {
               a($$0, $$1, $$2, $$7, $$3, $$5);
            }
         }

         if ($$4.c || $$5.c) {
            drs.a($$0, $$1, $$2);
            if ($$5.c) {
               $$0.a($$1, $$2, $$7, 2);
            }

            $$4.c = false;
            $$5.c = false;
         }
      }

      public static void a(aqm $$0, ja $$1, dsk $$2, dru $$3, drv $$4, drw $$5, cmk $$6, cuc $$7) {
         drx $$8 = $$2.c(doc.b);
         if (a($$3, $$8)) {
            if (!a($$3, $$7)) {
               a($$0, $$4, $$1);
            } else if ($$4.a($$6)) {
               a($$0, $$4, $$1);
            } else {
               List<cuc> $$9 = a($$0, $$3, $$1, $$6);
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

      static void a(aqm $$0, ja $$1, dsk $$2, dsk $$3, dru $$4, drw $$5) {
         drx $$6 = $$2.c(doc.b);
         drx $$7 = $$3.c(doc.b);
         $$0.a($$1, $$3, 3);
         $$6.a($$0, $$1, $$7, $$4, $$5, $$3.c(doc.d));
      }

      static void a(aqm $$0, drx $$1, dru $$2, drw $$3, ja $$4) {
         if (!a($$2, $$1)) {
            $$3.a(cuc.l);
         } else {
            cuc $$5 = a($$0, $$4, $$2.f().orElse($$2.b()));
            $$3.a($$5);
         }
      }

      private static cuc a(aqm $$0, ja $$1, akj<eqz> $$2) {
         eqz $$3 = $$0.o().bf().b($$2);
         eqx $$4 = new eqx.a($$0).a(etq.f, ewf.b($$1)).a(etp.l);
         List<cuc> $$5 = $$3.a($$4, $$0.E_());
         return $$5.isEmpty() ? cuc.l : ac.a($$5, $$0.E_());
      }

      private static void a(aqm $$0, dsk $$1, ja $$2, dru $$3, drv $$4, drw $$5, List<cuc> $$6) {
         $$4.a($$6);
         $$5.a($$4.f());
         $$4.b($$0.Z() + 14L);
         a($$0, $$2, $$1, $$1.a(doc.b, drx.c), $$3, $$5);
      }

      private static List<cuc> a(aqm $$0, dru $$1, ja $$2, cmk $$3) {
         eqz $$4 = $$0.o().bf().b($$1.b());
         eqx $$5 = new eqx.a($$0).a(etq.f, ewf.b($$2)).a($$3.gv()).a(etq.a, $$3).a(etp.l);
         return $$4.a($$5);
      }

      private static boolean a(dru $$0, drx $$1) {
         return $$0.b() != eqq.a && !$$0.e().e() && $$1 != drx.a;
      }

      private static boolean a(dru $$0, cuc $$1) {
         return cuc.c($$1, $$0.e()) && $$1.H() >= $$0.e().H();
      }

      private static boolean a(long $$0, drx $$1) {
         return $$0 % 20L == 0L && $$1 == drx.b;
      }

      private static void a(aqm $$0, drv $$1, ja $$2) {
         if ($$0.Z() >= $$1.a() + 15L) {
            $$0.a(null, $$2, avh.AJ, avi.e);
            $$1.a($$0.Z());
         }
      }
   }
}
