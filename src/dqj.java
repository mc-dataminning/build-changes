import com.google.common.annotations.VisibleForTesting;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DynamicOps;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dqj extends dog {
   private static final Logger a = LogUtils.getLogger();
   private final dqm b = new dqm();
   private final dqn c = new dqn();
   private final dqk d = new dqk();
   private dql e = dql.b;

   public dqj(io $$0, drb $$1) {
      super(doi.R, $$0, $$1);
   }

   @Nullable
   @Override
   public ze<abq> av_() {
      return abx.a(this);
   }

   @Override
   public ud a(iz.a $$0) {
      return ac.a(new ud(), $$1 -> $$1.a("shared_data", a(dqn.b, this.c, $$0)));
   }

   @Override
   protected void b(ud $$0, iz.a $$1) {
      super.b($$0, $$1);
      $$0.a("config", a(dql.c, this.e, $$1));
      $$0.a("shared_data", a(dqn.b, this.c, $$1));
      $$0.a("server_data", a(dqm.b, this.b, $$1));
   }

   private static <T> va a(Codec<T> $$0, T $$1, iz.a $$2) {
      return (va)$$0.encodeStart($$2.a(ur.a), $$1).getOrThrow();
   }

   @Override
   protected void a(ud $$0, iz.a $$1) {
      super.a($$0, $$1);
      DynamicOps<va> $$2 = $$1.a(ur.a);
      if ($$0.e("server_data")) {
         dqm.b.parse($$2, $$0.c("server_data")).resultOrPartial(a::error).ifPresent(this.b::a);
      }

      if ($$0.e("config")) {
         dql.c.parse($$2, $$0.c("config")).resultOrPartial(a::error).ifPresent($$0x -> this.e = $$0x);
      }

      if ($$0.e("shared_data")) {
         dqn.b.parse($$2, $$0.c("shared_data")).resultOrPartial(a::error).ifPresent(this.c::a);
      }
   }

   @Nullable
   public dqm b() {
      return this.n != null && !this.n.B ? this.b : null;
   }

   public dqn c() {
      return this.c;
   }

   public dqk d() {
      return this.d;
   }

   public dql f() {
      return this.e;
   }

   @VisibleForTesting
   public void a(dql $$0) {
      this.e = $$0;
   }

   public static final class a {
      private static final int a = 20;
      private static final float b = 0.5F;
      private static final float c = 0.02F;
      private static final int d = 20;
      private static final int e = 20;

      public static void a(dax $$0, io $$1, drb $$2, dqk $$3, dqn $$4) {
         $$3.c();
         if ($$0.Y() % 20L == 0L) {
            a($$0, $$1, $$2, $$4);
         }

         a($$0, $$1, $$4, $$2.c(dmt.d) ? ky.L : ky.aJ);
         a($$0, $$1, $$4);
      }

      public static void a(dax $$0, io $$1, drb $$2, dqn $$3, kw $$4) {
         a($$0, $$1, $$2, $$3);
         ayk $$5 = $$0.z;

         for (int $$6 = 0; $$6 < 20; $$6++) {
            euk $$7 = b($$1, $$5);
            $$0.a(ky.ae, $$7.a(), $$7.b(), $$7.c(), 0.0, 0.0, 0.0);
            $$0.a($$4, $$7.a(), $$7.b(), $$7.c(), 0.0, 0.0, 0.0);
         }
      }

      public static void a(dax $$0, io $$1, kw $$2) {
         ayk $$3 = $$0.z;

         for (int $$4 = 0; $$4 < 20; $$4++) {
            euk $$5 = a($$1, $$3);
            euk $$6 = new euk($$3.k() * 0.02, $$3.k() * 0.02, $$3.k() * 0.02);
            $$0.a($$2, $$5.a(), $$5.b(), $$5.c(), $$6.a(), $$6.b(), $$6.c());
         }
      }

      private static void a(dax $$0, io $$1, dqn $$2, kw $$3) {
         ayk $$4 = $$0.E_();
         if ($$4.i() <= 0.5F) {
            euk $$5 = b($$1, $$4);
            $$0.a(ky.ae, $$5.a(), $$5.b(), $$5.c(), 0.0, 0.0, 0.0);
            if (a($$2)) {
               $$0.a($$3, $$5.a(), $$5.b(), $$5.c(), 0.0, 0.0, 0.0);
            }
         }
      }

      private static void a(dax $$0, euk $$1, clw $$2) {
         ayk $$3 = $$0.z;
         euk $$4 = $$1.a($$2.dn().b(0.0, (double)($$2.dk() / 2.0F), 0.0));
         int $$5 = ayd.a($$3, 2, 5);

         for (int $$6 = 0; $$6 < $$5; $$6++) {
            euk $$7 = $$4.a($$3, 1.0F);
            $$0.a(ky.ba, $$1.a(), $$1.b(), $$1.c(), $$7.a(), $$7.b(), $$7.c());
         }
      }

      private static void a(dax $$0, io $$1, drb $$2, dqn $$3) {
         Set<UUID> $$4 = $$3.d();
         if (!$$4.isEmpty()) {
            euk $$5 = a($$1, $$2.c(dmt.c));

            for (UUID $$6 : $$4) {
               clw $$7 = $$0.b($$6);
               if ($$7 != null && a($$1, $$3, $$7)) {
                  a($$0, $$5, $$7);
               }
            }
         }
      }

      private static boolean a(io $$0, dqn $$1, clw $$2) {
         return $$2.dp().j($$0) <= ayd.k($$1.e());
      }

      private static void a(dax $$0, io $$1, dqn $$2) {
         if (a($$2)) {
            ayk $$3 = $$0.E_();
            if ($$3.i() <= 0.02F) {
               $$0.a($$1, avh.Ay, avi.e, $$3.i() * 0.25F + 0.75F, $$3.i() + 0.5F, false);
            }
         }
      }

      public static boolean a(dqn $$0) {
         return $$0.b();
      }

      private static euk a(io $$0, ayk $$1) {
         return euk.a($$0).b(ayd.a($$1, 0.4, 0.6), ayd.a($$1, 0.4, 0.6), ayd.a($$1, 0.4, 0.6));
      }

      private static euk b(io $$0, ayk $$1) {
         return euk.a($$0).b(ayd.a($$1, 0.1, 0.9), ayd.a($$1, 0.25, 0.75), ayd.a($$1, 0.1, 0.9));
      }

      private static euk a(io $$0, it $$1) {
         return euk.c($$0).b((double)$$1.j() * 0.5, 1.75, (double)$$1.l() * 0.5);
      }
   }

   public static final class b {
      private static final int a = 14;
      private static final int b = 20;
      private static final int c = 15;

      public static void a(aqm $$0, io $$1, drb $$2, dql $$3, dqm $$4, dqn $$5) {
         dqo $$6 = $$2.c(dmt.b);
         if (a($$0.Y(), $$6)) {
            a($$0, $$6, $$3, $$5, $$1);
         }

         drb $$7 = $$2;
         if ($$0.Y() >= $$4.c()) {
            $$7 = $$2.a(dmt.b, $$6.a($$0, $$1, $$3, $$4, $$5));
            if (!$$2.equals($$7)) {
               a($$0, $$1, $$2, $$7, $$3, $$5);
            }
         }

         if ($$4.c || $$5.c) {
            dqj.a($$0, $$1, $$2);
            if ($$5.c) {
               $$0.a($$1, $$2, $$7, 2);
            }

            $$4.c = false;
            $$5.c = false;
         }
      }

      public static void a(aqm $$0, io $$1, drb $$2, dql $$3, dqm $$4, dqn $$5, clw $$6, cto $$7) {
         dqo $$8 = $$2.c(dmt.b);
         if (a($$3, $$8)) {
            if (!a($$3, $$7)) {
               a($$0, $$4, $$1);
            } else if ($$4.a($$6)) {
               a($$0, $$4, $$1);
            } else {
               List<cto> $$9 = a($$0, $$3, $$1, $$6);
               if (!$$9.isEmpty()) {
                  $$6.b(avr.c.b($$7.g()));
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

      static void a(aqm $$0, io $$1, drb $$2, drb $$3, dql $$4, dqn $$5) {
         dqo $$6 = $$2.c(dmt.b);
         dqo $$7 = $$3.c(dmt.b);
         $$0.a($$1, $$3, 3);
         $$6.a($$0, $$1, $$7, $$4, $$5, $$3.c(dmt.d));
      }

      static void a(aqm $$0, dqo $$1, dql $$2, dqn $$3, io $$4) {
         if (!a($$2, $$1)) {
            $$3.a(cto.i);
         } else {
            cto $$5 = a($$0, $$4, $$2.f().orElse($$2.b()));
            $$3.a($$5);
         }
      }

      private static cto a(aqm $$0, io $$1, akl<epk> $$2) {
         epk $$3 = $$0.o().be().b($$2);
         epi $$4 = new epi.a($$0).a(erx.f, euk.b($$1)).a(erw.l);
         List<cto> $$5 = $$3.a($$4);
         return $$5.isEmpty() ? cto.i : ac.a($$5, $$0.E_());
      }

      private static void a(aqm $$0, drb $$1, io $$2, dql $$3, dqm $$4, dqn $$5, List<cto> $$6) {
         $$4.a($$6);
         $$5.a($$4.f());
         $$4.b($$0.Y() + 14L);
         a($$0, $$2, $$1, $$1.a(dmt.b, dqo.c), $$3, $$5);
      }

      private static List<cto> a(aqm $$0, dql $$1, io $$2, clw $$3) {
         epk $$4 = $$0.o().be().b($$1.b());
         epi $$5 = new epi.a($$0).a(erx.f, euk.b($$2)).a($$3.gy()).a(erx.a, $$3).a(erw.l);
         return $$4.a($$5);
      }

      private static boolean a(dql $$0, dqo $$1) {
         return $$0.b() != epd.a && !$$0.e().e() && $$1 != dqo.a;
      }

      private static boolean a(dql $$0, cto $$1) {
         return cto.c($$1, $$0.e()) && $$1.I() >= $$0.e().I();
      }

      private static boolean a(long $$0, dqo $$1) {
         return $$0 % 20L == 0L && $$1 == dqo.b;
      }

      private static void a(aqm $$0, dqm $$1, io $$2) {
         if ($$0.Y() >= $$1.a() + 15L) {
            $$0.a(null, $$2, avh.AG, avi.e);
            $$1.a($$0.Y());
         }
      }
   }
}
