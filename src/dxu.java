import com.google.common.annotations.VisibleForTesting;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DynamicOps;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dxu extends dvl {
   private static final Logger a = LogUtils.getLogger();
   private final dxx b = new dxx();
   private final dxy c = new dxy();
   private final dxv d = new dxv();
   private dxw e = dxw.b;

   public dxu(jj $$0, dym $$1) {
      super(dvn.S, $$0, $$1);
   }

   @Nullable
   @Override
   public zc<abr> at_() {
      return abx.a(this);
   }

   @Override
   public tw a(ju.a $$0) {
      return af.a(new tw(), $$1 -> $$1.a("shared_data", a(dxy.b, this.c, $$0)));
   }

   @Override
   protected void b(tw $$0, ju.a $$1) {
      super.b($$0, $$1);
      $$0.a("config", a(dxw.c, this.e, $$1));
      $$0.a("shared_data", a(dxy.b, this.c, $$1));
      $$0.a("server_data", a(dxx.b, this.b, $$1));
   }

   private static <T> ut a(Codec<T> $$0, T $$1, ju.a $$2) {
      return (ut)$$0.encodeStart($$2.a(uk.a), $$1).getOrThrow();
   }

   @Override
   protected void a(tw $$0, ju.a $$1) {
      super.a($$0, $$1);
      DynamicOps<ut> $$2 = $$1.a(uk.a);
      if ($$0.e("server_data")) {
         dxx.b.parse($$2, $$0.c("server_data")).resultOrPartial(a::error).ifPresent(this.b::a);
      }

      if ($$0.e("config")) {
         dxw.c.parse($$2, $$0.c("config")).resultOrPartial(a::error).ifPresent($$0x -> this.e = $$0x);
      }

      if ($$0.e("shared_data")) {
         dxy.b.parse($$2, $$0.c("shared_data")).resultOrPartial(a::error).ifPresent(this.c::a);
      }
   }

   @Nullable
   public dxx a() {
      return this.n != null && !this.n.C ? this.b : null;
   }

   public dxy c() {
      return this.c;
   }

   public dxv d() {
      return this.d;
   }

   public dxw f() {
      return this.e;
   }

   @VisibleForTesting
   public void a(dxw $$0) {
      this.e = $$0;
   }

   public static final class a {
      private static final int a = 20;
      private static final float b = 0.5F;
      private static final float c = 0.02F;
      private static final int d = 20;
      private static final int e = 20;

      public static void a(dhp $$0, jj $$1, dym $$2, dxv $$3, dxy $$4) {
         $$3.c();
         if ($$0.ae() % 20L == 0L) {
            a($$0, $$1, $$2, $$4);
         }

         a($$0, $$1, $$4, $$2.c(dtx.d) ? lv.N : lv.aM);
         a($$0, $$1, $$4);
      }

      public static void a(dhp $$0, jj $$1, dym $$2, dxy $$3, lt $$4) {
         a($$0, $$1, $$2, $$3);
         azs $$5 = $$0.A;

         for (int $$6 = 0; $$6 < 20; $$6++) {
            fcu $$7 = b($$1, $$5);
            $$0.a(lv.ah, $$7.a(), $$7.b(), $$7.c(), 0.0, 0.0, 0.0);
            $$0.a($$4, $$7.a(), $$7.b(), $$7.c(), 0.0, 0.0, 0.0);
         }
      }

      public static void a(dhp $$0, jj $$1, lt $$2) {
         azs $$3 = $$0.A;

         for (int $$4 = 0; $$4 < 20; $$4++) {
            fcu $$5 = a($$1, $$3);
            fcu $$6 = new fcu($$3.k() * 0.02, $$3.k() * 0.02, $$3.k() * 0.02);
            $$0.a($$2, $$5.a(), $$5.b(), $$5.c(), $$6.a(), $$6.b(), $$6.c());
         }
      }

      private static void a(dhp $$0, jj $$1, dxy $$2, lt $$3) {
         azs $$4 = $$0.C_();
         if ($$4.i() <= 0.5F) {
            fcu $$5 = b($$1, $$4);
            $$0.a(lv.ah, $$5.a(), $$5.b(), $$5.c(), 0.0, 0.0, 0.0);
            if (a($$2)) {
               $$0.a($$3, $$5.a(), $$5.b(), $$5.c(), 0.0, 0.0, 0.0);
            }
         }
      }

      private static void a(dhp $$0, fcu $$1, cqi $$2) {
         azs $$3 = $$0.A;
         fcu $$4 = $$1.a($$2.dt().b(0.0, (double)($$2.dr() / 2.0F), 0.0));
         int $$5 = azk.a($$3, 2, 5);

         for (int $$6 = 0; $$6 < $$5; $$6++) {
            fcu $$7 = $$4.a($$3, 1.0F);
            $$0.a(lv.bd, $$1.a(), $$1.b(), $$1.c(), $$7.a(), $$7.b(), $$7.c());
         }
      }

      private static void a(dhp $$0, jj $$1, dym $$2, dxy $$3) {
         Set<UUID> $$4 = $$3.d();
         if (!$$4.isEmpty()) {
            fcu $$5 = a($$1, $$2.c(dtx.c));

            for (UUID $$6 : $$4) {
               cqi $$7 = $$0.a($$6);
               if ($$7 != null && a($$1, $$3, $$7)) {
                  a($$0, $$5, $$7);
               }
            }
         }
      }

      private static boolean a(jj $$0, dxy $$1, cqi $$2) {
         return $$2.dv().j($$0) <= azk.k($$1.e());
      }

      private static void a(dhp $$0, jj $$1, dxy $$2) {
         if (a($$2)) {
            azs $$3 = $$0.C_();
            if ($$3.i() <= 0.02F) {
               $$0.a($$1, awk.Bz, awl.e, $$3.i() * 0.25F + 0.75F, $$3.i() + 0.5F, false);
            }
         }
      }

      public static boolean a(dxy $$0) {
         return $$0.b();
      }

      private static fcu a(jj $$0, azs $$1) {
         return fcu.a($$0).b(azk.a($$1, 0.4, 0.6), azk.a($$1, 0.4, 0.6), azk.a($$1, 0.4, 0.6));
      }

      private static fcu b(jj $$0, azs $$1) {
         return fcu.a($$0).b(azk.a($$1, 0.1, 0.9), azk.a($$1, 0.25, 0.75), azk.a($$1, 0.1, 0.9));
      }

      private static fcu a(jj $$0, jo $$1) {
         return fcu.c($$0).b((double)$$1.j() * 0.5, 1.75, (double)$$1.l() * 0.5);
      }
   }

   public static final class b {
      private static final int a = 14;
      private static final int b = 20;
      private static final int c = 15;

      public static void a(arn $$0, jj $$1, dym $$2, dxw $$3, dxx $$4, dxy $$5) {
         dxz $$6 = $$2.c(dtx.b);
         if (a($$0.ae(), $$6)) {
            a($$0, $$6, $$3, $$5, $$1);
         }

         dym $$7 = $$2;
         if ($$0.ae() >= $$4.c()) {
            $$7 = $$2.b(dtx.b, $$6.a($$0, $$1, $$3, $$4, $$5));
            if ($$2 != $$7) {
               a($$0, $$1, $$2, $$7, $$3, $$5);
            }
         }

         if ($$4.c || $$5.c) {
            dxu.a($$0, $$1, $$2);
            if ($$5.c) {
               $$0.a($$1, $$2, $$7, 2);
            }

            $$4.c = false;
            $$5.c = false;
         }
      }

      public static void a(arn $$0, jj $$1, dym $$2, dxw $$3, dxx $$4, dxy $$5, cqi $$6, cxy $$7) {
         dxz $$8 = $$2.c(dtx.b);
         if (a($$3, $$8)) {
            if (!a($$3, $$7)) {
               a($$0, $$4, $$1, awk.BI);
            } else if ($$4.a($$6)) {
               a($$0, $$4, $$1, awk.BE);
            } else {
               List<cxy> $$9 = a($$0, $$3, $$1, $$6, $$7);
               if (!$$9.isEmpty()) {
                  $$6.b(awu.c.b($$7.h()));
                  $$7.a($$3.e().M(), (bwr)$$6);
                  a($$0, $$2, $$1, $$3, $$4, $$5, $$9);
                  $$4.b($$6);
                  $$5.a($$0, $$1, $$4, $$3, $$3.d());
               }
            }
         }
      }

      static void a(arn $$0, jj $$1, dym $$2, dym $$3, dxw $$4, dxy $$5) {
         dxz $$6 = $$2.c(dtx.b);
         dxz $$7 = $$3.c(dtx.b);
         $$0.a($$1, $$3, 3);
         $$6.a($$0, $$1, $$7, $$4, $$5, $$3.c(dtx.d));
      }

      static void a(arn $$0, dxz $$1, dxw $$2, dxy $$3, jj $$4) {
         if (!a($$2, $$1)) {
            $$3.a(cxy.k);
         } else {
            cxy $$5 = a($$0, $$4, $$2.f().orElse($$2.b()));
            $$3.a($$5);
         }
      }

      private static cxy a(arn $$0, jj $$1, alc<exq> $$2) {
         exq $$3 = $$0.p().bc().b($$2);
         exo $$4 = new exo.a($$0).a(faf.f, fcu.b($$1)).a(fae.l);
         List<cxy> $$5 = $$3.a($$4, $$0.C_());
         return $$5.isEmpty() ? cxy.k : af.a($$5, $$0.C_());
      }

      private static void a(arn $$0, dym $$1, jj $$2, dxw $$3, dxx $$4, dxy $$5, List<cxy> $$6) {
         $$4.a($$6);
         $$5.a($$4.f());
         $$4.b($$0.ae() + 14L);
         a($$0, $$2, $$1, $$1.b(dtx.b, dxz.c), $$3, $$5);
      }

      private static List<cxy> a(arn $$0, dxw $$1, jj $$2, cqi $$3, cxy $$4) {
         exq $$5 = $$0.p().bc().b($$1.b());
         exo $$6 = new exo.a($$0).a(faf.f, fcu.b($$2)).a($$3.eg()).a(faf.a, $$3).a(faf.i, $$4).a(fae.l);
         return $$5.a($$6);
      }

      private static boolean a(dxw $$0, dxz $$1) {
         return !$$0.e().f() && $$1 != dxz.a;
      }

      private static boolean a(dxw $$0, cxy $$1) {
         return cxy.c($$1, $$0.e()) && $$1.M() >= $$0.e().M();
      }

      private static boolean a(long $$0, dxz $$1) {
         return $$0 % 20L == 0L && $$1 == dxz.b;
      }

      private static void a(arn $$0, dxx $$1, jj $$2, awj $$3) {
         if ($$0.ae() >= $$1.a() + 15L) {
            $$0.a(null, $$2, $$3, awl.e);
            $$1.a($$0.ae());
         }
      }
   }
}
