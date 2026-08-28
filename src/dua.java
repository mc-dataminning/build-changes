import com.google.common.annotations.VisibleForTesting;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DynamicOps;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dua extends drv {
   private static final Logger a = LogUtils.getLogger();
   private final dud b = new dud();
   private final due c = new due();
   private final dub d = new dub();
   private duc e = duc.b;

   public dua(jf $$0, dus $$1) {
      super(drx.R, $$0, $$1);
   }

   @Nullable
   @Override
   public zl<aca> az_() {
      return ach.a(this);
   }

   @Override
   public ug a(jq.a $$0) {
      return ad.a(new ug(), $$1 -> $$1.a("shared_data", a(due.b, this.c, $$0)));
   }

   @Override
   protected void b(ug $$0, jq.a $$1) {
      super.b($$0, $$1);
      $$0.a("config", a(duc.c, this.e, $$1));
      $$0.a("shared_data", a(due.b, this.c, $$1));
      $$0.a("server_data", a(dud.b, this.b, $$1));
   }

   private static <T> vd a(Codec<T> $$0, T $$1, jq.a $$2) {
      return (vd)$$0.encodeStart($$2.a(uu.a), $$1).getOrThrow();
   }

   @Override
   protected void a(ug $$0, jq.a $$1) {
      super.a($$0, $$1);
      DynamicOps<vd> $$2 = $$1.a(uu.a);
      if ($$0.e("server_data")) {
         dud.b.parse($$2, $$0.c("server_data")).resultOrPartial(a::error).ifPresent(this.b::a);
      }

      if ($$0.e("config")) {
         duc.c.parse($$2, $$0.c("config")).resultOrPartial(a::error).ifPresent($$0x -> this.e = $$0x);
      }

      if ($$0.e("shared_data")) {
         due.b.parse($$2, $$0.c("shared_data")).resultOrPartial(a::error).ifPresent(this.c::a);
      }
   }

   @Nullable
   public dud b() {
      return this.o != null && !this.o.B ? this.b : null;
   }

   public due c() {
      return this.c;
   }

   public dub d() {
      return this.d;
   }

   public duc f() {
      return this.e;
   }

   @VisibleForTesting
   public void a(duc $$0) {
      this.e = $$0;
   }

   public static final class a {
      private static final int a = 20;
      private static final float b = 0.5F;
      private static final float c = 0.02F;
      private static final int d = 20;
      private static final int e = 20;

      public static void a(dej $$0, jf $$1, dus $$2, dub $$3, due $$4) {
         $$3.c();
         if ($$0.aa() % 20L == 0L) {
            a($$0, $$1, $$2, $$4);
         }

         a($$0, $$1, $$4, $$2.c(dqi.d) ? lo.L : lo.aJ);
         a($$0, $$1, $$4);
      }

      public static void a(dej $$0, jf $$1, dus $$2, due $$3, lm $$4) {
         a($$0, $$1, $$2, $$3);
         azn $$5 = $$0.z;

         for (int $$6 = 0; $$6 < 20; $$6++) {
            eyw $$7 = b($$1, $$5);
            $$0.a(lo.ae, $$7.a(), $$7.b(), $$7.c(), 0.0, 0.0, 0.0);
            $$0.a($$4, $$7.a(), $$7.b(), $$7.c(), 0.0, 0.0, 0.0);
         }
      }

      public static void a(dej $$0, jf $$1, lm $$2) {
         azn $$3 = $$0.z;

         for (int $$4 = 0; $$4 < 20; $$4++) {
            eyw $$5 = a($$1, $$3);
            eyw $$6 = new eyw($$3.k() * 0.02, $$3.k() * 0.02, $$3.k() * 0.02);
            $$0.a($$2, $$5.a(), $$5.b(), $$5.c(), $$6.a(), $$6.b(), $$6.c());
         }
      }

      private static void a(dej $$0, jf $$1, due $$2, lm $$3) {
         azn $$4 = $$0.D_();
         if ($$4.i() <= 0.5F) {
            eyw $$5 = b($$1, $$4);
            $$0.a(lo.ae, $$5.a(), $$5.b(), $$5.c(), 0.0, 0.0, 0.0);
            if (a($$2)) {
               $$0.a($$3, $$5.a(), $$5.b(), $$5.c(), 0.0, 0.0, 0.0);
            }
         }
      }

      private static void a(dej $$0, eyw $$1, cnx $$2) {
         azn $$3 = $$0.z;
         eyw $$4 = $$1.a($$2.dq().b(0.0, (double)($$2.do() / 2.0F), 0.0));
         int $$5 = azf.a($$3, 2, 5);

         for (int $$6 = 0; $$6 < $$5; $$6++) {
            eyw $$7 = $$4.a($$3, 1.0F);
            $$0.a(lo.ba, $$1.a(), $$1.b(), $$1.c(), $$7.a(), $$7.b(), $$7.c());
         }
      }

      private static void a(dej $$0, jf $$1, dus $$2, due $$3) {
         Set<UUID> $$4 = $$3.d();
         if (!$$4.isEmpty()) {
            eyw $$5 = a($$1, $$2.c(dqi.c));

            for (UUID $$6 : $$4) {
               cnx $$7 = $$0.b($$6);
               if ($$7 != null && a($$1, $$3, $$7)) {
                  a($$0, $$5, $$7);
               }
            }
         }
      }

      private static boolean a(jf $$0, due $$1, cnx $$2) {
         return $$2.ds().j($$0) <= azf.k($$1.e());
      }

      private static void a(dej $$0, jf $$1, due $$2) {
         if (a($$2)) {
            azn $$3 = $$0.D_();
            if ($$3.i() <= 0.02F) {
               $$0.a($$1, awg.AH, awh.e, $$3.i() * 0.25F + 0.75F, $$3.i() + 0.5F, false);
            }
         }
      }

      public static boolean a(due $$0) {
         return $$0.b();
      }

      private static eyw a(jf $$0, azn $$1) {
         return eyw.a($$0).b(azf.a($$1, 0.4, 0.6), azf.a($$1, 0.4, 0.6), azf.a($$1, 0.4, 0.6));
      }

      private static eyw b(jf $$0, azn $$1) {
         return eyw.a($$0).b(azf.a($$1, 0.1, 0.9), azf.a($$1, 0.25, 0.75), azf.a($$1, 0.1, 0.9));
      }

      private static eyw a(jf $$0, jk $$1) {
         return eyw.c($$0).b((double)$$1.j() * 0.5, 1.75, (double)$$1.l() * 0.5);
      }
   }

   public static final class b {
      private static final int a = 14;
      private static final int b = 20;
      private static final int c = 15;

      public static void a(arj $$0, jf $$1, dus $$2, duc $$3, dud $$4, due $$5) {
         duf $$6 = $$2.c(dqi.b);
         if (a($$0.aa(), $$6)) {
            a($$0, $$6, $$3, $$5, $$1);
         }

         dus $$7 = $$2;
         if ($$0.aa() >= $$4.c()) {
            $$7 = $$2.b(dqi.b, $$6.a($$0, $$1, $$3, $$4, $$5));
            if (!$$2.equals($$7)) {
               a($$0, $$1, $$2, $$7, $$3, $$5);
            }
         }

         if ($$4.c || $$5.c) {
            dua.a($$0, $$1, $$2);
            if ($$5.c) {
               $$0.a($$1, $$2, $$7, 2);
            }

            $$4.c = false;
            $$5.c = false;
         }
      }

      public static void a(arj $$0, jf $$1, dus $$2, duc $$3, dud $$4, due $$5, cnx $$6, cvs $$7) {
         duf $$8 = $$2.c(dqi.b);
         if (a($$3, $$8)) {
            if (!a($$3, $$7)) {
               a($$0, $$4, $$1, awg.AQ);
            } else if ($$4.a($$6)) {
               a($$0, $$4, $$1, awg.AM);
            } else {
               List<cvs> $$9 = a($$0, $$3, $$1, $$6);
               if (!$$9.isEmpty()) {
                  $$6.b(awq.c.b($$7.h()));
                  $$7.a($$3.e().K(), (bun)$$6);
                  a($$0, $$2, $$1, $$3, $$4, $$5, $$9);
                  $$4.b($$6);
                  $$5.a($$0, $$1, $$4, $$3, $$3.d());
               }
            }
         }
      }

      static void a(arj $$0, jf $$1, dus $$2, dus $$3, duc $$4, due $$5) {
         duf $$6 = $$2.c(dqi.b);
         duf $$7 = $$3.c(dqi.b);
         $$0.a($$1, $$3, 3);
         $$6.a($$0, $$1, $$7, $$4, $$5, $$3.c(dqi.d));
      }

      static void a(arj $$0, duf $$1, duc $$2, due $$3, jf $$4) {
         if (!a($$2, $$1)) {
            $$3.a(cvs.k);
         } else {
            cvs $$5 = a($$0, $$4, $$2.f().orElse($$2.b()));
            $$3.a($$5);
         }
      }

      private static cvs a(arj $$0, jf $$1, ald<etq> $$2) {
         etq $$3 = $$0.o().bd().b($$2);
         eto $$4 = new eto.a($$0).a(ewh.f, eyw.b($$1)).a(ewg.l);
         List<cvs> $$5 = $$3.a($$4, $$0.D_());
         return $$5.isEmpty() ? cvs.k : ad.a($$5, $$0.D_());
      }

      private static void a(arj $$0, dus $$1, jf $$2, duc $$3, dud $$4, due $$5, List<cvs> $$6) {
         $$4.a($$6);
         $$5.a($$4.f());
         $$4.b($$0.aa() + 14L);
         a($$0, $$2, $$1, $$1.b(dqi.b, duf.c), $$3, $$5);
      }

      private static List<cvs> a(arj $$0, duc $$1, jf $$2, cnx $$3) {
         etq $$4 = $$0.o().bd().b($$1.b());
         eto $$5 = new eto.a($$0).a(ewh.f, eyw.b($$2)).a($$3.gz()).a(ewh.a, $$3).a(ewg.l);
         return $$4.a($$5);
      }

      private static boolean a(duc $$0, duf $$1) {
         return !$$0.e().f() && $$1 != duf.a;
      }

      private static boolean a(duc $$0, cvs $$1) {
         return cvs.c($$1, $$0.e()) && $$1.K() >= $$0.e().K();
      }

      private static boolean a(long $$0, duf $$1) {
         return $$0 % 20L == 0L && $$1 == duf.b;
      }

      private static void a(arj $$0, dud $$1, jf $$2, awf $$3) {
         if ($$0.aa() >= $$1.a() + 15L) {
            $$0.a(null, $$2, $$3, awh.e);
            $$1.a($$0.aa());
         }
      }
   }
}
