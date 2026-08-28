import com.google.common.annotations.VisibleForTesting;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DynamicOps;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class drj extends dpg {
   private static final Logger a = LogUtils.getLogger();
   private final drm b = new drm();
   private final drn c = new drn();
   private final drk d = new drk();
   private drl e = drl.b;

   public drj(iz $$0, dsb $$1) {
      super(dpi.R, $$0, $$1);
   }

   @Nullable
   @Override
   public zv<ach> au_() {
      return aco.a(this);
   }

   @Override
   public ur a(jk.a $$0) {
      return ac.a(new ur(), $$1 -> $$1.a("shared_data", a(drn.b, this.c, $$0)));
   }

   @Override
   protected void b(ur $$0, jk.a $$1) {
      super.b($$0, $$1);
      $$0.a("config", a(drl.c, this.e, $$1));
      $$0.a("shared_data", a(drn.b, this.c, $$1));
      $$0.a("server_data", a(drm.b, this.b, $$1));
   }

   private static <T> vo a(Codec<T> $$0, T $$1, jk.a $$2) {
      return (vo)$$0.encodeStart($$2.a(vf.a), $$1).getOrThrow();
   }

   @Override
   protected void a(ur $$0, jk.a $$1) {
      super.a($$0, $$1);
      DynamicOps<vo> $$2 = $$1.a(vf.a);
      if ($$0.e("server_data")) {
         drm.b.parse($$2, $$0.c("server_data")).resultOrPartial(a::error).ifPresent(this.b::a);
      }

      if ($$0.e("config")) {
         drl.c.parse($$2, $$0.c("config")).resultOrPartial(a::error).ifPresent($$0x -> this.e = $$0x);
      }

      if ($$0.e("shared_data")) {
         drn.b.parse($$2, $$0.c("shared_data")).resultOrPartial(a::error).ifPresent(this.c::a);
      }
   }

   @Nullable
   public drm b() {
      return this.n != null && !this.n.B ? this.b : null;
   }

   public drn c() {
      return this.c;
   }

   public drk d() {
      return this.d;
   }

   public drl f() {
      return this.e;
   }

   @VisibleForTesting
   public void a(drl $$0) {
      this.e = $$0;
   }

   public static final class a {
      private static final int a = 20;
      private static final float b = 0.5F;
      private static final float c = 0.02F;
      private static final int d = 20;
      private static final int e = 20;

      public static void a(dbx $$0, iz $$1, dsb $$2, drk $$3, drn $$4) {
         $$3.c();
         if ($$0.Z() % 20L == 0L) {
            a($$0, $$1, $$2, $$4);
         }

         a($$0, $$1, $$4, $$2.c(dnt.d) ? li.L : li.aJ);
         a($$0, $$1, $$4);
      }

      public static void a(dbx $$0, iz $$1, dsb $$2, drn $$3, lg $$4) {
         a($$0, $$1, $$2, $$3);
         azg $$5 = $$0.z;

         for (int $$6 = 0; $$6 < 20; $$6++) {
            evq $$7 = b($$1, $$5);
            $$0.a(li.ae, $$7.a(), $$7.b(), $$7.c(), 0.0, 0.0, 0.0);
            $$0.a($$4, $$7.a(), $$7.b(), $$7.c(), 0.0, 0.0, 0.0);
         }
      }

      public static void a(dbx $$0, iz $$1, lg $$2) {
         azg $$3 = $$0.z;

         for (int $$4 = 0; $$4 < 20; $$4++) {
            evq $$5 = a($$1, $$3);
            evq $$6 = new evq($$3.k() * 0.02, $$3.k() * 0.02, $$3.k() * 0.02);
            $$0.a($$2, $$5.a(), $$5.b(), $$5.c(), $$6.a(), $$6.b(), $$6.c());
         }
      }

      private static void a(dbx $$0, iz $$1, drn $$2, lg $$3) {
         azg $$4 = $$0.E_();
         if ($$4.i() <= 0.5F) {
            evq $$5 = b($$1, $$4);
            $$0.a(li.ae, $$5.a(), $$5.b(), $$5.c(), 0.0, 0.0, 0.0);
            if (a($$2)) {
               $$0.a($$3, $$5.a(), $$5.b(), $$5.c(), 0.0, 0.0, 0.0);
            }
         }
      }

      private static void a(dbx $$0, evq $$1, cmw $$2) {
         azg $$3 = $$0.z;
         evq $$4 = $$1.a($$2.dn().b(0.0, (double)($$2.dk() / 2.0F), 0.0));
         int $$5 = ayy.a($$3, 2, 5);

         for (int $$6 = 0; $$6 < $$5; $$6++) {
            evq $$7 = $$4.a($$3, 1.0F);
            $$0.a(li.ba, $$1.a(), $$1.b(), $$1.c(), $$7.a(), $$7.b(), $$7.c());
         }
      }

      private static void a(dbx $$0, iz $$1, dsb $$2, drn $$3) {
         Set<UUID> $$4 = $$3.d();
         if (!$$4.isEmpty()) {
            evq $$5 = a($$1, $$2.c(dnt.c));

            for (UUID $$6 : $$4) {
               cmw $$7 = $$0.b($$6);
               if ($$7 != null && a($$1, $$3, $$7)) {
                  a($$0, $$5, $$7);
               }
            }
         }
      }

      private static boolean a(iz $$0, drn $$1, cmw $$2) {
         return $$2.dp().j($$0) <= ayy.k($$1.e());
      }

      private static void a(dbx $$0, iz $$1, drn $$2) {
         if (a($$2)) {
            azg $$3 = $$0.E_();
            if ($$3.i() <= 0.02F) {
               $$0.a($$1, avz.Ay, awa.e, $$3.i() * 0.25F + 0.75F, $$3.i() + 0.5F, false);
            }
         }
      }

      public static boolean a(drn $$0) {
         return $$0.b();
      }

      private static evq a(iz $$0, azg $$1) {
         return evq.a($$0).b(ayy.a($$1, 0.4, 0.6), ayy.a($$1, 0.4, 0.6), ayy.a($$1, 0.4, 0.6));
      }

      private static evq b(iz $$0, azg $$1) {
         return evq.a($$0).b(ayy.a($$1, 0.1, 0.9), ayy.a($$1, 0.25, 0.75), ayy.a($$1, 0.1, 0.9));
      }

      private static evq a(iz $$0, je $$1) {
         return evq.c($$0).b((double)$$1.j() * 0.5, 1.75, (double)$$1.l() * 0.5);
      }
   }

   public static final class b {
      private static final int a = 14;
      private static final int b = 20;
      private static final int c = 15;

      public static void a(are $$0, iz $$1, dsb $$2, drl $$3, drm $$4, drn $$5) {
         dro $$6 = $$2.c(dnt.b);
         if (a($$0.Z(), $$6)) {
            a($$0, $$6, $$3, $$5, $$1);
         }

         dsb $$7 = $$2;
         if ($$0.Z() >= $$4.c()) {
            $$7 = $$2.a(dnt.b, $$6.a($$0, $$1, $$3, $$4, $$5));
            if (!$$2.equals($$7)) {
               a($$0, $$1, $$2, $$7, $$3, $$5);
            }
         }

         if ($$4.c || $$5.c) {
            drj.a($$0, $$1, $$2);
            if ($$5.c) {
               $$0.a($$1, $$2, $$7, 2);
            }

            $$4.c = false;
            $$5.c = false;
         }
      }

      public static void a(are $$0, iz $$1, dsb $$2, drl $$3, drm $$4, drn $$5, cmw $$6, cuo $$7) {
         dro $$8 = $$2.c(dnt.b);
         if (a($$3, $$8)) {
            if (!a($$3, $$7)) {
               a($$0, $$4, $$1);
            } else if ($$4.a($$6)) {
               a($$0, $$4, $$1);
            } else {
               List<cuo> $$9 = a($$0, $$3, $$1, $$6);
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

      static void a(are $$0, iz $$1, dsb $$2, dsb $$3, drl $$4, drn $$5) {
         dro $$6 = $$2.c(dnt.b);
         dro $$7 = $$3.c(dnt.b);
         $$0.a($$1, $$3, 3);
         $$6.a($$0, $$1, $$7, $$4, $$5, $$3.c(dnt.d));
      }

      static void a(are $$0, dro $$1, drl $$2, drn $$3, iz $$4) {
         if (!a($$2, $$1)) {
            $$3.a(cuo.l);
         } else {
            cuo $$5 = a($$0, $$4, $$2.f().orElse($$2.b()));
            $$3.a($$5);
         }
      }

      private static cuo a(are $$0, iz $$1, ald<eqm> $$2) {
         eqm $$3 = $$0.o().be().b($$2);
         eqk $$4 = new eqk.a($$0).a(etd.f, evq.b($$1)).a(etc.l);
         List<cuo> $$5 = $$3.a($$4);
         return $$5.isEmpty() ? cuo.l : ac.a($$5, $$0.E_());
      }

      private static void a(are $$0, dsb $$1, iz $$2, drl $$3, drm $$4, drn $$5, List<cuo> $$6) {
         $$4.a($$6);
         $$5.a($$4.f());
         $$4.b($$0.Z() + 14L);
         a($$0, $$2, $$1, $$1.a(dnt.b, dro.c), $$3, $$5);
      }

      private static List<cuo> a(are $$0, drl $$1, iz $$2, cmw $$3) {
         eqm $$4 = $$0.o().be().b($$1.b());
         eqk $$5 = new eqk.a($$0).a(etd.f, evq.b($$2)).a($$3.gy()).a(etd.a, $$3).a(etc.l);
         return $$4.a($$5);
      }

      private static boolean a(drl $$0, dro $$1) {
         return $$0.b() != eqd.a && !$$0.e().e() && $$1 != dro.a;
      }

      private static boolean a(drl $$0, cuo $$1) {
         return cuo.c($$1, $$0.e()) && $$1.I() >= $$0.e().I();
      }

      private static boolean a(long $$0, dro $$1) {
         return $$0 % 20L == 0L && $$1 == dro.b;
      }

      private static void a(are $$0, drm $$1, iz $$2) {
         if ($$0.Z() >= $$1.a() + 15L) {
            $$0.a(null, $$2, avz.AG, awa.e);
            $$1.a($$0.Z());
         }
      }
   }
}
