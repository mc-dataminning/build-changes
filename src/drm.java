import com.google.common.annotations.VisibleForTesting;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DynamicOps;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class drm extends dpj {
   private static final Logger a = LogUtils.getLogger();
   private final drp b = new drp();
   private final drq c = new drq();
   private final drn d = new drn();
   private dro e = dro.b;

   public drm(iz $$0, dse $$1) {
      super(dpl.R, $$0, $$1);
   }

   @Nullable
   @Override
   public zw<aci> au_() {
      return acp.a(this);
   }

   @Override
   public us a(jk.a $$0) {
      return ac.a(new us(), $$1 -> $$1.a("shared_data", a(drq.b, this.c, $$0)));
   }

   @Override
   protected void b(us $$0, jk.a $$1) {
      super.b($$0, $$1);
      $$0.a("config", a(dro.c, this.e, $$1));
      $$0.a("shared_data", a(drq.b, this.c, $$1));
      $$0.a("server_data", a(drp.b, this.b, $$1));
   }

   private static <T> vp a(Codec<T> $$0, T $$1, jk.a $$2) {
      return (vp)$$0.encodeStart($$2.a(vg.a), $$1).getOrThrow();
   }

   @Override
   protected void a(us $$0, jk.a $$1) {
      super.a($$0, $$1);
      DynamicOps<vp> $$2 = $$1.a(vg.a);
      if ($$0.e("server_data")) {
         drp.b.parse($$2, $$0.c("server_data")).resultOrPartial(a::error).ifPresent(this.b::a);
      }

      if ($$0.e("config")) {
         dro.c.parse($$2, $$0.c("config")).resultOrPartial(a::error).ifPresent($$0x -> this.e = $$0x);
      }

      if ($$0.e("shared_data")) {
         drq.b.parse($$2, $$0.c("shared_data")).resultOrPartial(a::error).ifPresent(this.c::a);
      }
   }

   @Nullable
   public drp b() {
      return this.n != null && !this.n.B ? this.b : null;
   }

   public drq c() {
      return this.c;
   }

   public drn d() {
      return this.d;
   }

   public dro f() {
      return this.e;
   }

   @VisibleForTesting
   public void a(dro $$0) {
      this.e = $$0;
   }

   public static final class a {
      private static final int a = 20;
      private static final float b = 0.5F;
      private static final float c = 0.02F;
      private static final int d = 20;
      private static final int e = 20;

      public static void a(dca $$0, iz $$1, dse $$2, drn $$3, drq $$4) {
         $$3.c();
         if ($$0.Z() % 20L == 0L) {
            a($$0, $$1, $$2, $$4);
         }

         a($$0, $$1, $$4, $$2.c(dnw.d) ? li.L : li.aJ);
         a($$0, $$1, $$4);
      }

      public static void a(dca $$0, iz $$1, dse $$2, drq $$3, lg $$4) {
         a($$0, $$1, $$2, $$3);
         azh $$5 = $$0.z;

         for (int $$6 = 0; $$6 < 20; $$6++) {
            evt $$7 = b($$1, $$5);
            $$0.a(li.ae, $$7.a(), $$7.b(), $$7.c(), 0.0, 0.0, 0.0);
            $$0.a($$4, $$7.a(), $$7.b(), $$7.c(), 0.0, 0.0, 0.0);
         }
      }

      public static void a(dca $$0, iz $$1, lg $$2) {
         azh $$3 = $$0.z;

         for (int $$4 = 0; $$4 < 20; $$4++) {
            evt $$5 = a($$1, $$3);
            evt $$6 = new evt($$3.k() * 0.02, $$3.k() * 0.02, $$3.k() * 0.02);
            $$0.a($$2, $$5.a(), $$5.b(), $$5.c(), $$6.a(), $$6.b(), $$6.c());
         }
      }

      private static void a(dca $$0, iz $$1, drq $$2, lg $$3) {
         azh $$4 = $$0.E_();
         if ($$4.i() <= 0.5F) {
            evt $$5 = b($$1, $$4);
            $$0.a(li.ae, $$5.a(), $$5.b(), $$5.c(), 0.0, 0.0, 0.0);
            if (a($$2)) {
               $$0.a($$3, $$5.a(), $$5.b(), $$5.c(), 0.0, 0.0, 0.0);
            }
         }
      }

      private static void a(dca $$0, evt $$1, cmz $$2) {
         azh $$3 = $$0.z;
         evt $$4 = $$1.a($$2.dn().b(0.0, (double)($$2.dk() / 2.0F), 0.0));
         int $$5 = ayz.a($$3, 2, 5);

         for (int $$6 = 0; $$6 < $$5; $$6++) {
            evt $$7 = $$4.a($$3, 1.0F);
            $$0.a(li.ba, $$1.a(), $$1.b(), $$1.c(), $$7.a(), $$7.b(), $$7.c());
         }
      }

      private static void a(dca $$0, iz $$1, dse $$2, drq $$3) {
         Set<UUID> $$4 = $$3.d();
         if (!$$4.isEmpty()) {
            evt $$5 = a($$1, $$2.c(dnw.c));

            for (UUID $$6 : $$4) {
               cmz $$7 = $$0.b($$6);
               if ($$7 != null && a($$1, $$3, $$7)) {
                  a($$0, $$5, $$7);
               }
            }
         }
      }

      private static boolean a(iz $$0, drq $$1, cmz $$2) {
         return $$2.dp().j($$0) <= ayz.k($$1.e());
      }

      private static void a(dca $$0, iz $$1, drq $$2) {
         if (a($$2)) {
            azh $$3 = $$0.E_();
            if ($$3.i() <= 0.02F) {
               $$0.a($$1, awa.Ay, awb.e, $$3.i() * 0.25F + 0.75F, $$3.i() + 0.5F, false);
            }
         }
      }

      public static boolean a(drq $$0) {
         return $$0.b();
      }

      private static evt a(iz $$0, azh $$1) {
         return evt.a($$0).b(ayz.a($$1, 0.4, 0.6), ayz.a($$1, 0.4, 0.6), ayz.a($$1, 0.4, 0.6));
      }

      private static evt b(iz $$0, azh $$1) {
         return evt.a($$0).b(ayz.a($$1, 0.1, 0.9), ayz.a($$1, 0.25, 0.75), ayz.a($$1, 0.1, 0.9));
      }

      private static evt a(iz $$0, je $$1) {
         return evt.c($$0).b((double)$$1.j() * 0.5, 1.75, (double)$$1.l() * 0.5);
      }
   }

   public static final class b {
      private static final int a = 14;
      private static final int b = 20;
      private static final int c = 15;

      public static void a(arf $$0, iz $$1, dse $$2, dro $$3, drp $$4, drq $$5) {
         drr $$6 = $$2.c(dnw.b);
         if (a($$0.Z(), $$6)) {
            a($$0, $$6, $$3, $$5, $$1);
         }

         dse $$7 = $$2;
         if ($$0.Z() >= $$4.c()) {
            $$7 = $$2.a(dnw.b, $$6.a($$0, $$1, $$3, $$4, $$5));
            if (!$$2.equals($$7)) {
               a($$0, $$1, $$2, $$7, $$3, $$5);
            }
         }

         if ($$4.c || $$5.c) {
            drm.a($$0, $$1, $$2);
            if ($$5.c) {
               $$0.a($$1, $$2, $$7, 2);
            }

            $$4.c = false;
            $$5.c = false;
         }
      }

      public static void a(arf $$0, iz $$1, dse $$2, dro $$3, drp $$4, drq $$5, cmz $$6, cur $$7) {
         drr $$8 = $$2.c(dnw.b);
         if (a($$3, $$8)) {
            if (!a($$3, $$7)) {
               a($$0, $$4, $$1);
            } else if ($$4.a($$6)) {
               a($$0, $$4, $$1);
            } else {
               List<cur> $$9 = a($$0, $$3, $$1, $$6);
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

      static void a(arf $$0, iz $$1, dse $$2, dse $$3, dro $$4, drq $$5) {
         drr $$6 = $$2.c(dnw.b);
         drr $$7 = $$3.c(dnw.b);
         $$0.a($$1, $$3, 3);
         $$6.a($$0, $$1, $$7, $$4, $$5, $$3.c(dnw.d));
      }

      static void a(arf $$0, drr $$1, dro $$2, drq $$3, iz $$4) {
         if (!a($$2, $$1)) {
            $$3.a(cur.l);
         } else {
            cur $$5 = a($$0, $$4, $$2.f().orElse($$2.b()));
            $$3.a($$5);
         }
      }

      private static cur a(arf $$0, iz $$1, ale<eqp> $$2) {
         eqp $$3 = $$0.o().be().b($$2);
         eqn $$4 = new eqn.a($$0).a(etg.f, evt.b($$1)).a(etf.l);
         List<cur> $$5 = $$3.a($$4);
         return $$5.isEmpty() ? cur.l : ac.a($$5, $$0.E_());
      }

      private static void a(arf $$0, dse $$1, iz $$2, dro $$3, drp $$4, drq $$5, List<cur> $$6) {
         $$4.a($$6);
         $$5.a($$4.f());
         $$4.b($$0.Z() + 14L);
         a($$0, $$2, $$1, $$1.a(dnw.b, drr.c), $$3, $$5);
      }

      private static List<cur> a(arf $$0, dro $$1, iz $$2, cmz $$3) {
         eqp $$4 = $$0.o().be().b($$1.b());
         eqn $$5 = new eqn.a($$0).a(etg.f, evt.b($$2)).a($$3.gy()).a(etg.a, $$3).a(etf.l);
         return $$4.a($$5);
      }

      private static boolean a(dro $$0, drr $$1) {
         return $$0.b() != eqg.a && !$$0.e().e() && $$1 != drr.a;
      }

      private static boolean a(dro $$0, cur $$1) {
         return cur.c($$1, $$0.e()) && $$1.I() >= $$0.e().I();
      }

      private static boolean a(long $$0, drr $$1) {
         return $$0 % 20L == 0L && $$1 == drr.b;
      }

      private static void a(arf $$0, drp $$1, iz $$2) {
         if ($$0.Z() >= $$1.a() + 15L) {
            $$0.a(null, $$2, awa.AG, awb.e);
            $$1.a($$0.Z());
         }
      }
   }
}
