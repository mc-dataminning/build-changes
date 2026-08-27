import com.google.common.annotations.VisibleForTesting;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DynamicOps;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dql extends doi {
   private static final Logger a = LogUtils.getLogger();
   private final dqo b = new dqo();
   private final dqp c = new dqp();
   private final dqm d = new dqm();
   private dqn e = dqn.b;

   public dql(io $$0, drd $$1) {
      super(dok.R, $$0, $$1);
   }

   @Nullable
   @Override
   public ze<abq> aw_() {
      return abx.a(this);
   }

   @Override
   public ud a(iz.a $$0) {
      return ac.a(new ud(), $$1 -> $$1.a("shared_data", a(dqp.b, this.c, $$0)));
   }

   @Override
   protected void b(ud $$0, iz.a $$1) {
      super.b($$0, $$1);
      $$0.a("config", a(dqn.c, this.e, $$1));
      $$0.a("shared_data", a(dqp.b, this.c, $$1));
      $$0.a("server_data", a(dqo.b, this.b, $$1));
   }

   private static <T> va a(Codec<T> $$0, T $$1, iz.a $$2) {
      return (va)$$0.encodeStart($$2.a(ur.a), $$1).getOrThrow();
   }

   @Override
   protected void a(ud $$0, iz.a $$1) {
      super.a($$0, $$1);
      DynamicOps<va> $$2 = $$1.a(ur.a);
      if ($$0.e("server_data")) {
         dqo.b.parse($$2, $$0.c("server_data")).resultOrPartial(a::error).ifPresent(this.b::a);
      }

      if ($$0.e("config")) {
         dqn.c.parse($$2, $$0.c("config")).resultOrPartial(a::error).ifPresent($$0x -> this.e = $$0x);
      }

      if ($$0.e("shared_data")) {
         dqp.b.parse($$2, $$0.c("shared_data")).resultOrPartial(a::error).ifPresent(this.c::a);
      }
   }

   @Nullable
   public dqo b() {
      return this.n != null && !this.n.B ? this.b : null;
   }

   public dqp c() {
      return this.c;
   }

   public dqm d() {
      return this.d;
   }

   public dqn f() {
      return this.e;
   }

   @VisibleForTesting
   public void a(dqn $$0) {
      this.e = $$0;
   }

   public static final class a {
      private static final int a = 20;
      private static final float b = 0.5F;
      private static final float c = 0.02F;
      private static final int d = 20;
      private static final int e = 20;

      public static void a(daz $$0, io $$1, drd $$2, dqm $$3, dqp $$4) {
         $$3.c();
         if ($$0.Y() % 20L == 0L) {
            a($$0, $$1, $$2, $$4);
         }

         a($$0, $$1, $$4, $$2.c(dmv.d) ? ky.L : ky.aJ);
         a($$0, $$1, $$4);
      }

      public static void a(daz $$0, io $$1, drd $$2, dqp $$3, kw $$4) {
         a($$0, $$1, $$2, $$3);
         aym $$5 = $$0.z;

         for (int $$6 = 0; $$6 < 20; $$6++) {
            eum $$7 = b($$1, $$5);
            $$0.a(ky.ae, $$7.a(), $$7.b(), $$7.c(), 0.0, 0.0, 0.0);
            $$0.a($$4, $$7.a(), $$7.b(), $$7.c(), 0.0, 0.0, 0.0);
         }
      }

      public static void a(daz $$0, io $$1, kw $$2) {
         aym $$3 = $$0.z;

         for (int $$4 = 0; $$4 < 20; $$4++) {
            eum $$5 = a($$1, $$3);
            eum $$6 = new eum($$3.k() * 0.02, $$3.k() * 0.02, $$3.k() * 0.02);
            $$0.a($$2, $$5.a(), $$5.b(), $$5.c(), $$6.a(), $$6.b(), $$6.c());
         }
      }

      private static void a(daz $$0, io $$1, dqp $$2, kw $$3) {
         aym $$4 = $$0.E_();
         if ($$4.i() <= 0.5F) {
            eum $$5 = b($$1, $$4);
            $$0.a(ky.ae, $$5.a(), $$5.b(), $$5.c(), 0.0, 0.0, 0.0);
            if (a($$2)) {
               $$0.a($$3, $$5.a(), $$5.b(), $$5.c(), 0.0, 0.0, 0.0);
            }
         }
      }

      private static void a(daz $$0, eum $$1, cly $$2) {
         aym $$3 = $$0.z;
         eum $$4 = $$1.a($$2.dn().b(0.0, (double)($$2.dk() / 2.0F), 0.0));
         int $$5 = ayf.a($$3, 2, 5);

         for (int $$6 = 0; $$6 < $$5; $$6++) {
            eum $$7 = $$4.a($$3, 1.0F);
            $$0.a(ky.ba, $$1.a(), $$1.b(), $$1.c(), $$7.a(), $$7.b(), $$7.c());
         }
      }

      private static void a(daz $$0, io $$1, drd $$2, dqp $$3) {
         Set<UUID> $$4 = $$3.d();
         if (!$$4.isEmpty()) {
            eum $$5 = a($$1, $$2.c(dmv.c));

            for (UUID $$6 : $$4) {
               cly $$7 = $$0.b($$6);
               if ($$7 != null && a($$1, $$3, $$7)) {
                  a($$0, $$5, $$7);
               }
            }
         }
      }

      private static boolean a(io $$0, dqp $$1, cly $$2) {
         return $$2.dp().j($$0) <= ayf.k($$1.e());
      }

      private static void a(daz $$0, io $$1, dqp $$2) {
         if (a($$2)) {
            aym $$3 = $$0.E_();
            if ($$3.i() <= 0.02F) {
               $$0.a($$1, avi.Ay, avj.e, $$3.i() * 0.25F + 0.75F, $$3.i() + 0.5F, false);
            }
         }
      }

      public static boolean a(dqp $$0) {
         return $$0.b();
      }

      private static eum a(io $$0, aym $$1) {
         return eum.a($$0).b(ayf.a($$1, 0.4, 0.6), ayf.a($$1, 0.4, 0.6), ayf.a($$1, 0.4, 0.6));
      }

      private static eum b(io $$0, aym $$1) {
         return eum.a($$0).b(ayf.a($$1, 0.1, 0.9), ayf.a($$1, 0.25, 0.75), ayf.a($$1, 0.1, 0.9));
      }

      private static eum a(io $$0, it $$1) {
         return eum.c($$0).b((double)$$1.j() * 0.5, 1.75, (double)$$1.l() * 0.5);
      }
   }

   public static final class b {
      private static final int a = 14;
      private static final int b = 20;
      private static final int c = 15;

      public static void a(aqn $$0, io $$1, drd $$2, dqn $$3, dqo $$4, dqp $$5) {
         dqq $$6 = $$2.c(dmv.b);
         if (a($$0.Y(), $$6)) {
            a($$0, $$6, $$3, $$5, $$1);
         }

         drd $$7 = $$2;
         if ($$0.Y() >= $$4.c()) {
            $$7 = $$2.a(dmv.b, $$6.a($$0, $$1, $$3, $$4, $$5));
            if (!$$2.equals($$7)) {
               a($$0, $$1, $$2, $$7, $$3, $$5);
            }
         }

         if ($$4.c || $$5.c) {
            dql.a($$0, $$1, $$2);
            if ($$5.c) {
               $$0.a($$1, $$2, $$7, 2);
            }

            $$4.c = false;
            $$5.c = false;
         }
      }

      public static void a(aqn $$0, io $$1, drd $$2, dqn $$3, dqo $$4, dqp $$5, cly $$6, ctq $$7) {
         dqq $$8 = $$2.c(dmv.b);
         if (a($$3, $$8)) {
            if (!a($$3, $$7)) {
               a($$0, $$4, $$1);
            } else if ($$4.a($$6)) {
               a($$0, $$4, $$1);
            } else {
               List<ctq> $$9 = a($$0, $$3, $$1, $$6);
               if (!$$9.isEmpty()) {
                  $$6.b(avs.c.b($$7.g()));
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

      static void a(aqn $$0, io $$1, drd $$2, drd $$3, dqn $$4, dqp $$5) {
         dqq $$6 = $$2.c(dmv.b);
         dqq $$7 = $$3.c(dmv.b);
         $$0.a($$1, $$3, 3);
         $$6.a($$0, $$1, $$7, $$4, $$5, $$3.c(dmv.d));
      }

      static void a(aqn $$0, dqq $$1, dqn $$2, dqp $$3, io $$4) {
         if (!a($$2, $$1)) {
            $$3.a(ctq.i);
         } else {
            ctq $$5 = a($$0, $$4, $$2.f().orElse($$2.b()));
            $$3.a($$5);
         }
      }

      private static ctq a(aqn $$0, io $$1, akm<epm> $$2) {
         epm $$3 = $$0.o().be().b($$2);
         epk $$4 = new epk.a($$0).a(erz.f, eum.b($$1)).a(ery.l);
         List<ctq> $$5 = $$3.a($$4);
         return $$5.isEmpty() ? ctq.i : ac.a($$5, $$0.E_());
      }

      private static void a(aqn $$0, drd $$1, io $$2, dqn $$3, dqo $$4, dqp $$5, List<ctq> $$6) {
         $$4.a($$6);
         $$5.a($$4.f());
         $$4.b($$0.Y() + 14L);
         a($$0, $$2, $$1, $$1.a(dmv.b, dqq.c), $$3, $$5);
      }

      private static List<ctq> a(aqn $$0, dqn $$1, io $$2, cly $$3) {
         epm $$4 = $$0.o().be().b($$1.b());
         epk $$5 = new epk.a($$0).a(erz.f, eum.b($$2)).a($$3.gy()).a(erz.a, $$3).a(ery.l);
         return $$4.a($$5);
      }

      private static boolean a(dqn $$0, dqq $$1) {
         return $$0.b() != epf.a && !$$0.e().e() && $$1 != dqq.a;
      }

      private static boolean a(dqn $$0, ctq $$1) {
         return ctq.c($$1, $$0.e()) && $$1.I() >= $$0.e().I();
      }

      private static boolean a(long $$0, dqq $$1) {
         return $$0 % 20L == 0L && $$1 == dqq.b;
      }

      private static void a(aqn $$0, dqo $$1, io $$2) {
         if ($$0.Y() >= $$1.a() + 15L) {
            $$0.a(null, $$2, avi.AG, avj.e);
            $$1.a($$0.Y());
         }
      }
   }
}
