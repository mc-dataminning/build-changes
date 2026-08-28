import com.google.common.annotations.VisibleForTesting;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DynamicOps;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dyw extends dwn {
   private static final Logger a = LogUtils.getLogger();
   private final dyz b = new dyz();
   private final dza c = new dza();
   private final dyx d = new dyx();
   private dyy e = dyy.b;

   public dyw(iu $$0, dzo $$1) {
      super(dwp.S, $$0, $$1);
   }

   @Nullable
   @Override
   public zd<abs> at_() {
      return aby.a(this);
   }

   @Override
   public tx a(jg.a $$0) {
      return af.a(new tx(), $$1 -> $$1.a("shared_data", a(dza.b, this.c, $$0)));
   }

   @Override
   protected void b(tx $$0, jg.a $$1) {
      super.b($$0, $$1);
      $$0.a("config", a(dyy.c, this.e, $$1));
      $$0.a("shared_data", a(dza.b, this.c, $$1));
      $$0.a("server_data", a(dyz.b, this.b, $$1));
   }

   private static <T> uu a(Codec<T> $$0, T $$1, jg.a $$2) {
      return (uu)$$0.encodeStart($$2.a(ul.a), $$1).getOrThrow();
   }

   @Override
   protected void a(tx $$0, jg.a $$1) {
      super.a($$0, $$1);
      DynamicOps<uu> $$2 = $$1.a(ul.a);
      if ($$0.e("server_data")) {
         dyz.b.parse($$2, $$0.c("server_data")).resultOrPartial(a::error).ifPresent(this.b::a);
      }

      if ($$0.e("config")) {
         dyy.c.parse($$2, $$0.c("config")).resultOrPartial(a::error).ifPresent($$0x -> this.e = $$0x);
      }

      if ($$0.e("shared_data")) {
         dza.b.parse($$2, $$0.c("shared_data")).resultOrPartial(a::error).ifPresent(this.c::a);
      }
   }

   @Nullable
   public dyz a() {
      return this.n != null && !this.n.C ? this.b : null;
   }

   public dza c() {
      return this.c;
   }

   public dyx d() {
      return this.d;
   }

   public dyy f() {
      return this.e;
   }

   @VisibleForTesting
   public void a(dyy $$0) {
      this.e = $$0;
   }

   public static final class a {
      private static final int a = 20;
      private static final float b = 0.5F;
      private static final float c = 0.02F;
      private static final int d = 20;
      private static final int e = 20;

      public static void a(dip $$0, iu $$1, dzo $$2, dyx $$3, dza $$4) {
         $$3.c();
         if ($$0.ae() % 20L == 0L) {
            a($$0, $$1, $$2, $$4);
         }

         a($$0, $$1, $$4, $$2.c(duz.d) ? lx.N : lx.aM);
         a($$0, $$1, $$4);
      }

      public static void a(dip $$0, iu $$1, dzo $$2, dza $$3, lv $$4) {
         a($$0, $$1, $$2, $$3);
         azt $$5 = $$0.A;

         for (int $$6 = 0; $$6 < 20; $$6++) {
            fdw $$7 = b($$1, $$5);
            $$0.a(lx.ah, $$7.a(), $$7.b(), $$7.c(), 0.0, 0.0, 0.0);
            $$0.a($$4, $$7.a(), $$7.b(), $$7.c(), 0.0, 0.0, 0.0);
         }
      }

      public static void a(dip $$0, iu $$1, lv $$2) {
         azt $$3 = $$0.A;

         for (int $$4 = 0; $$4 < 20; $$4++) {
            fdw $$5 = a($$1, $$3);
            fdw $$6 = new fdw($$3.k() * 0.02, $$3.k() * 0.02, $$3.k() * 0.02);
            $$0.a($$2, $$5.a(), $$5.b(), $$5.c(), $$6.a(), $$6.b(), $$6.c());
         }
      }

      private static void a(dip $$0, iu $$1, dza $$2, lv $$3) {
         azt $$4 = $$0.C_();
         if ($$4.i() <= 0.5F) {
            fdw $$5 = b($$1, $$4);
            $$0.a(lx.ah, $$5.a(), $$5.b(), $$5.c(), 0.0, 0.0, 0.0);
            if (a($$2)) {
               $$0.a($$3, $$5.a(), $$5.b(), $$5.c(), 0.0, 0.0, 0.0);
            }
         }
      }

      private static void a(dip $$0, fdw $$1, cqs $$2) {
         azt $$3 = $$0.A;
         fdw $$4 = $$1.a($$2.dt().b(0.0, (double)($$2.dr() / 2.0F), 0.0));
         int $$5 = azk.a($$3, 2, 5);

         for (int $$6 = 0; $$6 < $$5; $$6++) {
            fdw $$7 = $$4.a($$3, 1.0F);
            $$0.a(lx.bd, $$1.a(), $$1.b(), $$1.c(), $$7.a(), $$7.b(), $$7.c());
         }
      }

      private static void a(dip $$0, iu $$1, dzo $$2, dza $$3) {
         Set<UUID> $$4 = $$3.d();
         if (!$$4.isEmpty()) {
            fdw $$5 = a($$1, $$2.c(duz.c));

            for (UUID $$6 : $$4) {
               cqs $$7 = $$0.a($$6);
               if ($$7 != null && a($$1, $$3, $$7)) {
                  a($$0, $$5, $$7);
               }
            }
         }
      }

      private static boolean a(iu $$0, dza $$1, cqs $$2) {
         return $$2.dv().j($$0) <= azk.k($$1.e());
      }

      private static void a(dip $$0, iu $$1, dza $$2) {
         if (a($$2)) {
            azt $$3 = $$0.C_();
            if ($$3.i() <= 0.02F) {
               $$0.a($$1, awl.Bz, awm.e, $$3.i() * 0.25F + 0.75F, $$3.i() + 0.5F, false);
            }
         }
      }

      public static boolean a(dza $$0) {
         return $$0.b();
      }

      private static fdw a(iu $$0, azt $$1) {
         return fdw.a($$0).b(azk.a($$1, 0.4, 0.6), azk.a($$1, 0.4, 0.6), azk.a($$1, 0.4, 0.6));
      }

      private static fdw b(iu $$0, azt $$1) {
         return fdw.a($$0).b(azk.a($$1, 0.1, 0.9), azk.a($$1, 0.25, 0.75), azk.a($$1, 0.1, 0.9));
      }

      private static fdw a(iu $$0, ja $$1) {
         return fdw.c($$0).b((double)$$1.j() * 0.5, 1.75, (double)$$1.l() * 0.5);
      }
   }

   public static final class b {
      private static final int a = 14;
      private static final int b = 20;
      private static final int c = 15;

      public static void a(aro $$0, iu $$1, dzo $$2, dyy $$3, dyz $$4, dza $$5) {
         dzb $$6 = $$2.c(duz.b);
         if (a($$0.ae(), $$6)) {
            a($$0, $$6, $$3, $$5, $$1);
         }

         dzo $$7 = $$2;
         if ($$0.ae() >= $$4.c()) {
            $$7 = $$2.b(duz.b, $$6.a($$0, $$1, $$3, $$4, $$5));
            if ($$2 != $$7) {
               a($$0, $$1, $$2, $$7, $$3, $$5);
            }
         }

         if ($$4.c || $$5.c) {
            dyw.a($$0, $$1, $$2);
            if ($$5.c) {
               $$0.a($$1, $$2, $$7, 2);
            }

            $$4.c = false;
            $$5.c = false;
         }
      }

      public static void a(aro $$0, iu $$1, dzo $$2, dyy $$3, dyz $$4, dza $$5, cqs $$6, cys $$7) {
         dzb $$8 = $$2.c(duz.b);
         if (a($$3, $$8)) {
            if (!a($$3, $$7)) {
               a($$0, $$4, $$1, awl.BI);
            } else if ($$4.a($$6)) {
               a($$0, $$4, $$1, awl.BE);
            } else {
               List<cys> $$9 = a($$0, $$3, $$1, $$6, $$7);
               if (!$$9.isEmpty()) {
                  $$6.b(awv.c.b($$7.h()));
                  $$7.a($$3.e().M(), (bwz)$$6);
                  a($$0, $$2, $$1, $$3, $$4, $$5, $$9);
                  $$4.b($$6);
                  $$5.a($$0, $$1, $$4, $$3, $$3.d());
               }
            }
         }
      }

      static void a(aro $$0, iu $$1, dzo $$2, dzo $$3, dyy $$4, dza $$5) {
         dzb $$6 = $$2.c(duz.b);
         dzb $$7 = $$3.c(duz.b);
         $$0.a($$1, $$3, 3);
         $$6.a($$0, $$1, $$7, $$4, $$5, $$3.c(duz.d));
      }

      static void a(aro $$0, dzb $$1, dyy $$2, dza $$3, iu $$4) {
         if (!a($$2, $$1)) {
            $$3.a(cys.k);
         } else {
            cys $$5 = a($$0, $$4, $$2.f().orElse($$2.b()));
            $$3.a($$5);
         }
      }

      private static cys a(aro $$0, iu $$1, ald<eys> $$2) {
         eys $$3 = $$0.p().bc().b($$2);
         eyq $$4 = new eyq.a($$0).a(fbh.f, fdw.b($$1)).a(fbg.l);
         List<cys> $$5 = $$3.a($$4, $$0.C_());
         return $$5.isEmpty() ? cys.k : af.a($$5, $$0.C_());
      }

      private static void a(aro $$0, dzo $$1, iu $$2, dyy $$3, dyz $$4, dza $$5, List<cys> $$6) {
         $$4.a($$6);
         $$5.a($$4.f());
         $$4.b($$0.ae() + 14L);
         a($$0, $$2, $$1, $$1.b(duz.b, dzb.c), $$3, $$5);
      }

      private static List<cys> a(aro $$0, dyy $$1, iu $$2, cqs $$3, cys $$4) {
         eys $$5 = $$0.p().bc().b($$1.b());
         eyq $$6 = new eyq.a($$0).a(fbh.f, fdw.b($$2)).a($$3.eg()).a(fbh.a, $$3).a(fbh.i, $$4).a(fbg.l);
         return $$5.a($$6);
      }

      private static boolean a(dyy $$0, dzb $$1) {
         return !$$0.e().f() && $$1 != dzb.a;
      }

      private static boolean a(dyy $$0, cys $$1) {
         return cys.c($$1, $$0.e()) && $$1.M() >= $$0.e().M();
      }

      private static boolean a(long $$0, dzb $$1) {
         return $$0 % 20L == 0L && $$1 == dzb.b;
      }

      private static void a(aro $$0, dyz $$1, iu $$2, awk $$3) {
         if ($$0.ae() >= $$1.a() + 15L) {
            $$0.a(null, $$2, $$3, awm.e);
            $$1.a($$0.ae());
         }
      }
   }
}
