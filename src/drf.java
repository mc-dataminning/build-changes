import com.google.common.annotations.VisibleForTesting;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DynamicOps;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class drf extends dpc {
   private static final Logger a = LogUtils.getLogger();
   private final dri b = new dri();
   private final drj c = new drj();
   private final drg d = new drg();
   private drh e = drh.b;

   public drf(iz $$0, drx $$1) {
      super(dpe.R, $$0, $$1);
   }

   @Nullable
   @Override
   public zs<ace> aw_() {
      return acl.a(this);
   }

   @Override
   public ur a(jk.a $$0) {
      return ac.a(new ur(), $$1 -> $$1.a("shared_data", a(drj.b, this.c, $$0)));
   }

   @Override
   protected void b(ur $$0, jk.a $$1) {
      super.b($$0, $$1);
      $$0.a("config", a(drh.c, this.e, $$1));
      $$0.a("shared_data", a(drj.b, this.c, $$1));
      $$0.a("server_data", a(dri.b, this.b, $$1));
   }

   private static <T> vo a(Codec<T> $$0, T $$1, jk.a $$2) {
      return (vo)$$0.encodeStart($$2.a(vf.a), $$1).getOrThrow();
   }

   @Override
   protected void a(ur $$0, jk.a $$1) {
      super.a($$0, $$1);
      DynamicOps<vo> $$2 = $$1.a(vf.a);
      if ($$0.e("server_data")) {
         dri.b.parse($$2, $$0.c("server_data")).resultOrPartial(a::error).ifPresent(this.b::a);
      }

      if ($$0.e("config")) {
         drh.c.parse($$2, $$0.c("config")).resultOrPartial(a::error).ifPresent($$0x -> this.e = $$0x);
      }

      if ($$0.e("shared_data")) {
         drj.b.parse($$2, $$0.c("shared_data")).resultOrPartial(a::error).ifPresent(this.c::a);
      }
   }

   @Nullable
   public dri b() {
      return this.n != null && !this.n.B ? this.b : null;
   }

   public drj c() {
      return this.c;
   }

   public drg d() {
      return this.d;
   }

   public drh f() {
      return this.e;
   }

   @VisibleForTesting
   public void a(drh $$0) {
      this.e = $$0;
   }

   public static final class a {
      private static final int a = 20;
      private static final float b = 0.5F;
      private static final float c = 0.02F;
      private static final int d = 20;
      private static final int e = 20;

      public static void a(dbt $$0, iz $$1, drx $$2, drg $$3, drj $$4) {
         $$3.c();
         if ($$0.Z() % 20L == 0L) {
            a($$0, $$1, $$2, $$4);
         }

         a($$0, $$1, $$4, $$2.c(dnp.d) ? lj.L : lj.aJ);
         a($$0, $$1, $$4);
      }

      public static void a(dbt $$0, iz $$1, drx $$2, drj $$3, lh $$4) {
         a($$0, $$1, $$2, $$3);
         azc $$5 = $$0.z;

         for (int $$6 = 0; $$6 < 20; $$6++) {
            evm $$7 = b($$1, $$5);
            $$0.a(lj.ae, $$7.a(), $$7.b(), $$7.c(), 0.0, 0.0, 0.0);
            $$0.a($$4, $$7.a(), $$7.b(), $$7.c(), 0.0, 0.0, 0.0);
         }
      }

      public static void a(dbt $$0, iz $$1, lh $$2) {
         azc $$3 = $$0.z;

         for (int $$4 = 0; $$4 < 20; $$4++) {
            evm $$5 = a($$1, $$3);
            evm $$6 = new evm($$3.k() * 0.02, $$3.k() * 0.02, $$3.k() * 0.02);
            $$0.a($$2, $$5.a(), $$5.b(), $$5.c(), $$6.a(), $$6.b(), $$6.c());
         }
      }

      private static void a(dbt $$0, iz $$1, drj $$2, lh $$3) {
         azc $$4 = $$0.E_();
         if ($$4.i() <= 0.5F) {
            evm $$5 = b($$1, $$4);
            $$0.a(lj.ae, $$5.a(), $$5.b(), $$5.c(), 0.0, 0.0, 0.0);
            if (a($$2)) {
               $$0.a($$3, $$5.a(), $$5.b(), $$5.c(), 0.0, 0.0, 0.0);
            }
         }
      }

      private static void a(dbt $$0, evm $$1, cms $$2) {
         azc $$3 = $$0.z;
         evm $$4 = $$1.a($$2.dn().b(0.0, (double)($$2.dk() / 2.0F), 0.0));
         int $$5 = ayu.a($$3, 2, 5);

         for (int $$6 = 0; $$6 < $$5; $$6++) {
            evm $$7 = $$4.a($$3, 1.0F);
            $$0.a(lj.ba, $$1.a(), $$1.b(), $$1.c(), $$7.a(), $$7.b(), $$7.c());
         }
      }

      private static void a(dbt $$0, iz $$1, drx $$2, drj $$3) {
         Set<UUID> $$4 = $$3.d();
         if (!$$4.isEmpty()) {
            evm $$5 = a($$1, $$2.c(dnp.c));

            for (UUID $$6 : $$4) {
               cms $$7 = $$0.b($$6);
               if ($$7 != null && a($$1, $$3, $$7)) {
                  a($$0, $$5, $$7);
               }
            }
         }
      }

      private static boolean a(iz $$0, drj $$1, cms $$2) {
         return $$2.dp().j($$0) <= ayu.k($$1.e());
      }

      private static void a(dbt $$0, iz $$1, drj $$2) {
         if (a($$2)) {
            azc $$3 = $$0.E_();
            if ($$3.i() <= 0.02F) {
               $$0.a($$1, avw.Ay, avx.e, $$3.i() * 0.25F + 0.75F, $$3.i() + 0.5F, false);
            }
         }
      }

      public static boolean a(drj $$0) {
         return $$0.b();
      }

      private static evm a(iz $$0, azc $$1) {
         return evm.a($$0).b(ayu.a($$1, 0.4, 0.6), ayu.a($$1, 0.4, 0.6), ayu.a($$1, 0.4, 0.6));
      }

      private static evm b(iz $$0, azc $$1) {
         return evm.a($$0).b(ayu.a($$1, 0.1, 0.9), ayu.a($$1, 0.25, 0.75), ayu.a($$1, 0.1, 0.9));
      }

      private static evm a(iz $$0, je $$1) {
         return evm.c($$0).b((double)$$1.j() * 0.5, 1.75, (double)$$1.l() * 0.5);
      }
   }

   public static final class b {
      private static final int a = 14;
      private static final int b = 20;
      private static final int c = 15;

      public static void a(arb $$0, iz $$1, drx $$2, drh $$3, dri $$4, drj $$5) {
         drk $$6 = $$2.c(dnp.b);
         if (a($$0.Z(), $$6)) {
            a($$0, $$6, $$3, $$5, $$1);
         }

         drx $$7 = $$2;
         if ($$0.Z() >= $$4.c()) {
            $$7 = $$2.a(dnp.b, $$6.a($$0, $$1, $$3, $$4, $$5));
            if (!$$2.equals($$7)) {
               a($$0, $$1, $$2, $$7, $$3, $$5);
            }
         }

         if ($$4.c || $$5.c) {
            drf.a($$0, $$1, $$2);
            if ($$5.c) {
               $$0.a($$1, $$2, $$7, 2);
            }

            $$4.c = false;
            $$5.c = false;
         }
      }

      public static void a(arb $$0, iz $$1, drx $$2, drh $$3, dri $$4, drj $$5, cms $$6, cuk $$7) {
         drk $$8 = $$2.c(dnp.b);
         if (a($$3, $$8)) {
            if (!a($$3, $$7)) {
               a($$0, $$4, $$1);
            } else if ($$4.a($$6)) {
               a($$0, $$4, $$1);
            } else {
               List<cuk> $$9 = a($$0, $$3, $$1, $$6);
               if (!$$9.isEmpty()) {
                  $$6.b(awg.c.b($$7.g()));
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

      static void a(arb $$0, iz $$1, drx $$2, drx $$3, drh $$4, drj $$5) {
         drk $$6 = $$2.c(dnp.b);
         drk $$7 = $$3.c(dnp.b);
         $$0.a($$1, $$3, 3);
         $$6.a($$0, $$1, $$7, $$4, $$5, $$3.c(dnp.d));
      }

      static void a(arb $$0, drk $$1, drh $$2, drj $$3, iz $$4) {
         if (!a($$2, $$1)) {
            $$3.a(cuk.l);
         } else {
            cuk $$5 = a($$0, $$4, $$2.f().orElse($$2.b()));
            $$3.a($$5);
         }
      }

      private static cuk a(arb $$0, iz $$1, ala<eqi> $$2) {
         eqi $$3 = $$0.o().be().b($$2);
         eqg $$4 = new eqg.a($$0).a(esz.f, evm.b($$1)).a(esy.l);
         List<cuk> $$5 = $$3.a($$4);
         return $$5.isEmpty() ? cuk.l : ac.a($$5, $$0.E_());
      }

      private static void a(arb $$0, drx $$1, iz $$2, drh $$3, dri $$4, drj $$5, List<cuk> $$6) {
         $$4.a($$6);
         $$5.a($$4.f());
         $$4.b($$0.Z() + 14L);
         a($$0, $$2, $$1, $$1.a(dnp.b, drk.c), $$3, $$5);
      }

      private static List<cuk> a(arb $$0, drh $$1, iz $$2, cms $$3) {
         eqi $$4 = $$0.o().be().b($$1.b());
         eqg $$5 = new eqg.a($$0).a(esz.f, evm.b($$2)).a($$3.gy()).a(esz.a, $$3).a(esy.l);
         return $$4.a($$5);
      }

      private static boolean a(drh $$0, drk $$1) {
         return $$0.b() != epz.a && !$$0.e().e() && $$1 != drk.a;
      }

      private static boolean a(drh $$0, cuk $$1) {
         return cuk.c($$1, $$0.e()) && $$1.I() >= $$0.e().I();
      }

      private static boolean a(long $$0, drk $$1) {
         return $$0 % 20L == 0L && $$1 == drk.b;
      }

      private static void a(arb $$0, dri $$1, iz $$2) {
         if ($$0.Z() >= $$1.a() + 15L) {
            $$0.a(null, $$2, avw.AG, avx.e);
            $$1.a($$0.Z());
         }
      }
   }
}
