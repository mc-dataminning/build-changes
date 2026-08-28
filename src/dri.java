import com.google.common.annotations.VisibleForTesting;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DynamicOps;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dri extends dpf {
   private static final Logger a = LogUtils.getLogger();
   private final drl b = new drl();
   private final drm c = new drm();
   private final drj d = new drj();
   private drk e = drk.b;

   public dri(iz $$0, dsa $$1) {
      super(dph.R, $$0, $$1);
   }

   @Nullable
   @Override
   public zv<ach> av_() {
      return aco.a(this);
   }

   @Override
   public ur a(jk.a $$0) {
      return ac.a(new ur(), $$1 -> $$1.a("shared_data", a(drm.b, this.c, $$0)));
   }

   @Override
   protected void b(ur $$0, jk.a $$1) {
      super.b($$0, $$1);
      $$0.a("config", a(drk.c, this.e, $$1));
      $$0.a("shared_data", a(drm.b, this.c, $$1));
      $$0.a("server_data", a(drl.b, this.b, $$1));
   }

   private static <T> vo a(Codec<T> $$0, T $$1, jk.a $$2) {
      return (vo)$$0.encodeStart($$2.a(vf.a), $$1).getOrThrow();
   }

   @Override
   protected void a(ur $$0, jk.a $$1) {
      super.a($$0, $$1);
      DynamicOps<vo> $$2 = $$1.a(vf.a);
      if ($$0.e("server_data")) {
         drl.b.parse($$2, $$0.c("server_data")).resultOrPartial(a::error).ifPresent(this.b::a);
      }

      if ($$0.e("config")) {
         drk.c.parse($$2, $$0.c("config")).resultOrPartial(a::error).ifPresent($$0x -> this.e = $$0x);
      }

      if ($$0.e("shared_data")) {
         drm.b.parse($$2, $$0.c("shared_data")).resultOrPartial(a::error).ifPresent(this.c::a);
      }
   }

   @Nullable
   public drl b() {
      return this.n != null && !this.n.B ? this.b : null;
   }

   public drm c() {
      return this.c;
   }

   public drj d() {
      return this.d;
   }

   public drk f() {
      return this.e;
   }

   @VisibleForTesting
   public void a(drk $$0) {
      this.e = $$0;
   }

   public static final class a {
      private static final int a = 20;
      private static final float b = 0.5F;
      private static final float c = 0.02F;
      private static final int d = 20;
      private static final int e = 20;

      public static void a(dbw $$0, iz $$1, dsa $$2, drj $$3, drm $$4) {
         $$3.c();
         if ($$0.Z() % 20L == 0L) {
            a($$0, $$1, $$2, $$4);
         }

         a($$0, $$1, $$4, $$2.c(dns.d) ? li.L : li.aJ);
         a($$0, $$1, $$4);
      }

      public static void a(dbw $$0, iz $$1, dsa $$2, drm $$3, lg $$4) {
         a($$0, $$1, $$2, $$3);
         azf $$5 = $$0.z;

         for (int $$6 = 0; $$6 < 20; $$6++) {
            evp $$7 = b($$1, $$5);
            $$0.a(li.ae, $$7.a(), $$7.b(), $$7.c(), 0.0, 0.0, 0.0);
            $$0.a($$4, $$7.a(), $$7.b(), $$7.c(), 0.0, 0.0, 0.0);
         }
      }

      public static void a(dbw $$0, iz $$1, lg $$2) {
         azf $$3 = $$0.z;

         for (int $$4 = 0; $$4 < 20; $$4++) {
            evp $$5 = a($$1, $$3);
            evp $$6 = new evp($$3.k() * 0.02, $$3.k() * 0.02, $$3.k() * 0.02);
            $$0.a($$2, $$5.a(), $$5.b(), $$5.c(), $$6.a(), $$6.b(), $$6.c());
         }
      }

      private static void a(dbw $$0, iz $$1, drm $$2, lg $$3) {
         azf $$4 = $$0.E_();
         if ($$4.i() <= 0.5F) {
            evp $$5 = b($$1, $$4);
            $$0.a(li.ae, $$5.a(), $$5.b(), $$5.c(), 0.0, 0.0, 0.0);
            if (a($$2)) {
               $$0.a($$3, $$5.a(), $$5.b(), $$5.c(), 0.0, 0.0, 0.0);
            }
         }
      }

      private static void a(dbw $$0, evp $$1, cmv $$2) {
         azf $$3 = $$0.z;
         evp $$4 = $$1.a($$2.dn().b(0.0, (double)($$2.dk() / 2.0F), 0.0));
         int $$5 = ayx.a($$3, 2, 5);

         for (int $$6 = 0; $$6 < $$5; $$6++) {
            evp $$7 = $$4.a($$3, 1.0F);
            $$0.a(li.ba, $$1.a(), $$1.b(), $$1.c(), $$7.a(), $$7.b(), $$7.c());
         }
      }

      private static void a(dbw $$0, iz $$1, dsa $$2, drm $$3) {
         Set<UUID> $$4 = $$3.d();
         if (!$$4.isEmpty()) {
            evp $$5 = a($$1, $$2.c(dns.c));

            for (UUID $$6 : $$4) {
               cmv $$7 = $$0.b($$6);
               if ($$7 != null && a($$1, $$3, $$7)) {
                  a($$0, $$5, $$7);
               }
            }
         }
      }

      private static boolean a(iz $$0, drm $$1, cmv $$2) {
         return $$2.dp().j($$0) <= ayx.k($$1.e());
      }

      private static void a(dbw $$0, iz $$1, drm $$2) {
         if (a($$2)) {
            azf $$3 = $$0.E_();
            if ($$3.i() <= 0.02F) {
               $$0.a($$1, avz.Ay, awa.e, $$3.i() * 0.25F + 0.75F, $$3.i() + 0.5F, false);
            }
         }
      }

      public static boolean a(drm $$0) {
         return $$0.b();
      }

      private static evp a(iz $$0, azf $$1) {
         return evp.a($$0).b(ayx.a($$1, 0.4, 0.6), ayx.a($$1, 0.4, 0.6), ayx.a($$1, 0.4, 0.6));
      }

      private static evp b(iz $$0, azf $$1) {
         return evp.a($$0).b(ayx.a($$1, 0.1, 0.9), ayx.a($$1, 0.25, 0.75), ayx.a($$1, 0.1, 0.9));
      }

      private static evp a(iz $$0, je $$1) {
         return evp.c($$0).b((double)$$1.j() * 0.5, 1.75, (double)$$1.l() * 0.5);
      }
   }

   public static final class b {
      private static final int a = 14;
      private static final int b = 20;
      private static final int c = 15;

      public static void a(are $$0, iz $$1, dsa $$2, drk $$3, drl $$4, drm $$5) {
         drn $$6 = $$2.c(dns.b);
         if (a($$0.Z(), $$6)) {
            a($$0, $$6, $$3, $$5, $$1);
         }

         dsa $$7 = $$2;
         if ($$0.Z() >= $$4.c()) {
            $$7 = $$2.a(dns.b, $$6.a($$0, $$1, $$3, $$4, $$5));
            if (!$$2.equals($$7)) {
               a($$0, $$1, $$2, $$7, $$3, $$5);
            }
         }

         if ($$4.c || $$5.c) {
            dri.a($$0, $$1, $$2);
            if ($$5.c) {
               $$0.a($$1, $$2, $$7, 2);
            }

            $$4.c = false;
            $$5.c = false;
         }
      }

      public static void a(are $$0, iz $$1, dsa $$2, drk $$3, drl $$4, drm $$5, cmv $$6, cun $$7) {
         drn $$8 = $$2.c(dns.b);
         if (a($$3, $$8)) {
            if (!a($$3, $$7)) {
               a($$0, $$4, $$1);
            } else if ($$4.a($$6)) {
               a($$0, $$4, $$1);
            } else {
               List<cun> $$9 = a($$0, $$3, $$1, $$6);
               if (!$$9.isEmpty()) {
                  $$6.b(awj.c.b($$7.g()));
                  if (!$$6.f()) {
                     $$7.h($$3.e().I());
                  }

                  a($$0, $$2, $$1, $$3, $$4, $$5, $$9);
                  $$4.b($$6);
                  $$5.a($$0, $$1, $$4, $$3, $$3.d());
               }
            }
         }
      }

      static void a(are $$0, iz $$1, dsa $$2, dsa $$3, drk $$4, drm $$5) {
         drn $$6 = $$2.c(dns.b);
         drn $$7 = $$3.c(dns.b);
         $$0.a($$1, $$3, 3);
         $$6.a($$0, $$1, $$7, $$4, $$5, $$3.c(dns.d));
      }

      static void a(are $$0, drn $$1, drk $$2, drm $$3, iz $$4) {
         if (!a($$2, $$1)) {
            $$3.a(cun.l);
         } else {
            cun $$5 = a($$0, $$4, $$2.f().orElse($$2.b()));
            $$3.a($$5);
         }
      }

      private static cun a(are $$0, iz $$1, ald<eql> $$2) {
         eql $$3 = $$0.o().be().b($$2);
         eqj $$4 = new eqj.a($$0).a(etc.f, evp.b($$1)).a(etb.l);
         List<cun> $$5 = $$3.a($$4);
         return $$5.isEmpty() ? cun.l : ac.a($$5, $$0.E_());
      }

      private static void a(are $$0, dsa $$1, iz $$2, drk $$3, drl $$4, drm $$5, List<cun> $$6) {
         $$4.a($$6);
         $$5.a($$4.f());
         $$4.b($$0.Z() + 14L);
         a($$0, $$2, $$1, $$1.a(dns.b, drn.c), $$3, $$5);
      }

      private static List<cun> a(are $$0, drk $$1, iz $$2, cmv $$3) {
         eql $$4 = $$0.o().be().b($$1.b());
         eqj $$5 = new eqj.a($$0).a(etc.f, evp.b($$2)).a($$3.gy()).a(etc.a, $$3).a(etb.l);
         return $$4.a($$5);
      }

      private static boolean a(drk $$0, drn $$1) {
         return $$0.b() != eqc.a && !$$0.e().e() && $$1 != drn.a;
      }

      private static boolean a(drk $$0, cun $$1) {
         return cun.c($$1, $$0.e()) && $$1.I() >= $$0.e().I();
      }

      private static boolean a(long $$0, drn $$1) {
         return $$0 % 20L == 0L && $$1 == drn.b;
      }

      private static void a(are $$0, drl $$1, iz $$2) {
         if ($$0.Z() >= $$1.a() + 15L) {
            $$0.a(null, $$2, avz.AG, awa.e);
            $$1.a($$0.Z());
         }
      }
   }
}
