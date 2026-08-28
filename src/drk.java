import com.google.common.annotations.VisibleForTesting;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DynamicOps;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class drk extends dph {
   private static final Logger a = LogUtils.getLogger();
   private final drn b = new drn();
   private final dro c = new dro();
   private final drl d = new drl();
   private drm e = drm.b;

   public drk(iz $$0, dsc $$1) {
      super(dpj.R, $$0, $$1);
   }

   @Nullable
   @Override
   public zw<aci> au_() {
      return acp.a(this);
   }

   @Override
   public us a(jk.a $$0) {
      return ac.a(new us(), $$1 -> $$1.a("shared_data", a(dro.b, this.c, $$0)));
   }

   @Override
   protected void b(us $$0, jk.a $$1) {
      super.b($$0, $$1);
      $$0.a("config", a(drm.c, this.e, $$1));
      $$0.a("shared_data", a(dro.b, this.c, $$1));
      $$0.a("server_data", a(drn.b, this.b, $$1));
   }

   private static <T> vp a(Codec<T> $$0, T $$1, jk.a $$2) {
      return (vp)$$0.encodeStart($$2.a(vg.a), $$1).getOrThrow();
   }

   @Override
   protected void a(us $$0, jk.a $$1) {
      super.a($$0, $$1);
      DynamicOps<vp> $$2 = $$1.a(vg.a);
      if ($$0.e("server_data")) {
         drn.b.parse($$2, $$0.c("server_data")).resultOrPartial(a::error).ifPresent(this.b::a);
      }

      if ($$0.e("config")) {
         drm.c.parse($$2, $$0.c("config")).resultOrPartial(a::error).ifPresent($$0x -> this.e = $$0x);
      }

      if ($$0.e("shared_data")) {
         dro.b.parse($$2, $$0.c("shared_data")).resultOrPartial(a::error).ifPresent(this.c::a);
      }
   }

   @Nullable
   public drn b() {
      return this.n != null && !this.n.B ? this.b : null;
   }

   public dro c() {
      return this.c;
   }

   public drl d() {
      return this.d;
   }

   public drm f() {
      return this.e;
   }

   @VisibleForTesting
   public void a(drm $$0) {
      this.e = $$0;
   }

   public static final class a {
      private static final int a = 20;
      private static final float b = 0.5F;
      private static final float c = 0.02F;
      private static final int d = 20;
      private static final int e = 20;

      public static void a(dby $$0, iz $$1, dsc $$2, drl $$3, dro $$4) {
         $$3.c();
         if ($$0.Z() % 20L == 0L) {
            a($$0, $$1, $$2, $$4);
         }

         a($$0, $$1, $$4, $$2.c(dnu.d) ? li.L : li.aJ);
         a($$0, $$1, $$4);
      }

      public static void a(dby $$0, iz $$1, dsc $$2, dro $$3, lg $$4) {
         a($$0, $$1, $$2, $$3);
         azh $$5 = $$0.z;

         for (int $$6 = 0; $$6 < 20; $$6++) {
            evr $$7 = b($$1, $$5);
            $$0.a(li.ae, $$7.a(), $$7.b(), $$7.c(), 0.0, 0.0, 0.0);
            $$0.a($$4, $$7.a(), $$7.b(), $$7.c(), 0.0, 0.0, 0.0);
         }
      }

      public static void a(dby $$0, iz $$1, lg $$2) {
         azh $$3 = $$0.z;

         for (int $$4 = 0; $$4 < 20; $$4++) {
            evr $$5 = a($$1, $$3);
            evr $$6 = new evr($$3.k() * 0.02, $$3.k() * 0.02, $$3.k() * 0.02);
            $$0.a($$2, $$5.a(), $$5.b(), $$5.c(), $$6.a(), $$6.b(), $$6.c());
         }
      }

      private static void a(dby $$0, iz $$1, dro $$2, lg $$3) {
         azh $$4 = $$0.E_();
         if ($$4.i() <= 0.5F) {
            evr $$5 = b($$1, $$4);
            $$0.a(li.ae, $$5.a(), $$5.b(), $$5.c(), 0.0, 0.0, 0.0);
            if (a($$2)) {
               $$0.a($$3, $$5.a(), $$5.b(), $$5.c(), 0.0, 0.0, 0.0);
            }
         }
      }

      private static void a(dby $$0, evr $$1, cmx $$2) {
         azh $$3 = $$0.z;
         evr $$4 = $$1.a($$2.dn().b(0.0, (double)($$2.dk() / 2.0F), 0.0));
         int $$5 = ayz.a($$3, 2, 5);

         for (int $$6 = 0; $$6 < $$5; $$6++) {
            evr $$7 = $$4.a($$3, 1.0F);
            $$0.a(li.ba, $$1.a(), $$1.b(), $$1.c(), $$7.a(), $$7.b(), $$7.c());
         }
      }

      private static void a(dby $$0, iz $$1, dsc $$2, dro $$3) {
         Set<UUID> $$4 = $$3.d();
         if (!$$4.isEmpty()) {
            evr $$5 = a($$1, $$2.c(dnu.c));

            for (UUID $$6 : $$4) {
               cmx $$7 = $$0.b($$6);
               if ($$7 != null && a($$1, $$3, $$7)) {
                  a($$0, $$5, $$7);
               }
            }
         }
      }

      private static boolean a(iz $$0, dro $$1, cmx $$2) {
         return $$2.dp().j($$0) <= ayz.k($$1.e());
      }

      private static void a(dby $$0, iz $$1, dro $$2) {
         if (a($$2)) {
            azh $$3 = $$0.E_();
            if ($$3.i() <= 0.02F) {
               $$0.a($$1, awa.Ay, awb.e, $$3.i() * 0.25F + 0.75F, $$3.i() + 0.5F, false);
            }
         }
      }

      public static boolean a(dro $$0) {
         return $$0.b();
      }

      private static evr a(iz $$0, azh $$1) {
         return evr.a($$0).b(ayz.a($$1, 0.4, 0.6), ayz.a($$1, 0.4, 0.6), ayz.a($$1, 0.4, 0.6));
      }

      private static evr b(iz $$0, azh $$1) {
         return evr.a($$0).b(ayz.a($$1, 0.1, 0.9), ayz.a($$1, 0.25, 0.75), ayz.a($$1, 0.1, 0.9));
      }

      private static evr a(iz $$0, je $$1) {
         return evr.c($$0).b((double)$$1.j() * 0.5, 1.75, (double)$$1.l() * 0.5);
      }
   }

   public static final class b {
      private static final int a = 14;
      private static final int b = 20;
      private static final int c = 15;

      public static void a(arf $$0, iz $$1, dsc $$2, drm $$3, drn $$4, dro $$5) {
         drp $$6 = $$2.c(dnu.b);
         if (a($$0.Z(), $$6)) {
            a($$0, $$6, $$3, $$5, $$1);
         }

         dsc $$7 = $$2;
         if ($$0.Z() >= $$4.c()) {
            $$7 = $$2.a(dnu.b, $$6.a($$0, $$1, $$3, $$4, $$5));
            if (!$$2.equals($$7)) {
               a($$0, $$1, $$2, $$7, $$3, $$5);
            }
         }

         if ($$4.c || $$5.c) {
            drk.a($$0, $$1, $$2);
            if ($$5.c) {
               $$0.a($$1, $$2, $$7, 2);
            }

            $$4.c = false;
            $$5.c = false;
         }
      }

      public static void a(arf $$0, iz $$1, dsc $$2, drm $$3, drn $$4, dro $$5, cmx $$6, cup $$7) {
         drp $$8 = $$2.c(dnu.b);
         if (a($$3, $$8)) {
            if (!a($$3, $$7)) {
               a($$0, $$4, $$1);
            } else if ($$4.a($$6)) {
               a($$0, $$4, $$1);
            } else {
               List<cup> $$9 = a($$0, $$3, $$1, $$6);
               if (!$$9.isEmpty()) {
                  $$6.b(awk.c.b($$7.g()));
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

      static void a(arf $$0, iz $$1, dsc $$2, dsc $$3, drm $$4, dro $$5) {
         drp $$6 = $$2.c(dnu.b);
         drp $$7 = $$3.c(dnu.b);
         $$0.a($$1, $$3, 3);
         $$6.a($$0, $$1, $$7, $$4, $$5, $$3.c(dnu.d));
      }

      static void a(arf $$0, drp $$1, drm $$2, dro $$3, iz $$4) {
         if (!a($$2, $$1)) {
            $$3.a(cup.l);
         } else {
            cup $$5 = a($$0, $$4, $$2.f().orElse($$2.b()));
            $$3.a($$5);
         }
      }

      private static cup a(arf $$0, iz $$1, ale<eqn> $$2) {
         eqn $$3 = $$0.o().be().b($$2);
         eql $$4 = new eql.a($$0).a(ete.f, evr.b($$1)).a(etd.l);
         List<cup> $$5 = $$3.a($$4);
         return $$5.isEmpty() ? cup.l : ac.a($$5, $$0.E_());
      }

      private static void a(arf $$0, dsc $$1, iz $$2, drm $$3, drn $$4, dro $$5, List<cup> $$6) {
         $$4.a($$6);
         $$5.a($$4.f());
         $$4.b($$0.Z() + 14L);
         a($$0, $$2, $$1, $$1.a(dnu.b, drp.c), $$3, $$5);
      }

      private static List<cup> a(arf $$0, drm $$1, iz $$2, cmx $$3) {
         eqn $$4 = $$0.o().be().b($$1.b());
         eql $$5 = new eql.a($$0).a(ete.f, evr.b($$2)).a($$3.gy()).a(ete.a, $$3).a(etd.l);
         return $$4.a($$5);
      }

      private static boolean a(drm $$0, drp $$1) {
         return $$0.b() != eqe.a && !$$0.e().e() && $$1 != drp.a;
      }

      private static boolean a(drm $$0, cup $$1) {
         return cup.c($$1, $$0.e()) && $$1.I() >= $$0.e().I();
      }

      private static boolean a(long $$0, drp $$1) {
         return $$0 % 20L == 0L && $$1 == drp.b;
      }

      private static void a(arf $$0, drn $$1, iz $$2) {
         if ($$0.Z() >= $$1.a() + 15L) {
            $$0.a(null, $$2, awa.AG, awb.e);
            $$1.a($$0.Z());
         }
      }
   }
}
