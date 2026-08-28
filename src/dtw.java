import com.google.common.annotations.VisibleForTesting;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DynamicOps;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dtw extends drs {
   private static final Logger a = LogUtils.getLogger();
   private final dtz b = new dtz();
   private final dua c = new dua();
   private final dtx d = new dtx();
   private dty e = dty.b;

   public dtw(je $$0, duo $$1) {
      super(dru.R, $$0, $$1);
   }

   @Nullable
   @Override
   public zk<abz> ay_() {
      return acg.a(this);
   }

   @Override
   public uf a(jp.a $$0) {
      return ad.a(new uf(), $$1 -> $$1.a("shared_data", a(dua.b, this.c, $$0)));
   }

   @Override
   protected void b(uf $$0, jp.a $$1) {
      super.b($$0, $$1);
      $$0.a("config", a(dty.c, this.e, $$1));
      $$0.a("shared_data", a(dua.b, this.c, $$1));
      $$0.a("server_data", a(dtz.b, this.b, $$1));
   }

   private static <T> vc a(Codec<T> $$0, T $$1, jp.a $$2) {
      return (vc)$$0.encodeStart($$2.a(ut.a), $$1).getOrThrow();
   }

   @Override
   protected void a(uf $$0, jp.a $$1) {
      super.a($$0, $$1);
      DynamicOps<vc> $$2 = $$1.a(ut.a);
      if ($$0.e("server_data")) {
         dtz.b.parse($$2, $$0.c("server_data")).resultOrPartial(a::error).ifPresent(this.b::a);
      }

      if ($$0.e("config")) {
         dty.c.parse($$2, $$0.c("config")).resultOrPartial(a::error).ifPresent($$0x -> this.e = $$0x);
      }

      if ($$0.e("shared_data")) {
         dua.b.parse($$2, $$0.c("shared_data")).resultOrPartial(a::error).ifPresent(this.c::a);
      }
   }

   @Nullable
   public dtz b() {
      return this.o != null && !this.o.B ? this.b : null;
   }

   public dua c() {
      return this.c;
   }

   public dtx d() {
      return this.d;
   }

   public dty f() {
      return this.e;
   }

   @VisibleForTesting
   public void a(dty $$0) {
      this.e = $$0;
   }

   public static final class a {
      private static final int a = 20;
      private static final float b = 0.5F;
      private static final float c = 0.02F;
      private static final int d = 20;
      private static final int e = 20;

      public static void a(deg $$0, je $$1, duo $$2, dtx $$3, dua $$4) {
         $$3.c();
         if ($$0.aa() % 20L == 0L) {
            a($$0, $$1, $$2, $$4);
         }

         a($$0, $$1, $$4, $$2.c(dqf.d) ? ln.L : ln.aJ);
         a($$0, $$1, $$4);
      }

      public static void a(deg $$0, je $$1, duo $$2, dua $$3, ll $$4) {
         a($$0, $$1, $$2, $$3);
         azl $$5 = $$0.z;

         for (int $$6 = 0; $$6 < 20; $$6++) {
            eys $$7 = b($$1, $$5);
            $$0.a(ln.ae, $$7.a(), $$7.b(), $$7.c(), 0.0, 0.0, 0.0);
            $$0.a($$4, $$7.a(), $$7.b(), $$7.c(), 0.0, 0.0, 0.0);
         }
      }

      public static void a(deg $$0, je $$1, ll $$2) {
         azl $$3 = $$0.z;

         for (int $$4 = 0; $$4 < 20; $$4++) {
            eys $$5 = a($$1, $$3);
            eys $$6 = new eys($$3.k() * 0.02, $$3.k() * 0.02, $$3.k() * 0.02);
            $$0.a($$2, $$5.a(), $$5.b(), $$5.c(), $$6.a(), $$6.b(), $$6.c());
         }
      }

      private static void a(deg $$0, je $$1, dua $$2, ll $$3) {
         azl $$4 = $$0.C_();
         if ($$4.i() <= 0.5F) {
            eys $$5 = b($$1, $$4);
            $$0.a(ln.ae, $$5.a(), $$5.b(), $$5.c(), 0.0, 0.0, 0.0);
            if (a($$2)) {
               $$0.a($$3, $$5.a(), $$5.b(), $$5.c(), 0.0, 0.0, 0.0);
            }
         }
      }

      private static void a(deg $$0, eys $$1, cnu $$2) {
         azl $$3 = $$0.z;
         eys $$4 = $$1.a($$2.dq().b(0.0, (double)($$2.do() / 2.0F), 0.0));
         int $$5 = azd.a($$3, 2, 5);

         for (int $$6 = 0; $$6 < $$5; $$6++) {
            eys $$7 = $$4.a($$3, 1.0F);
            $$0.a(ln.ba, $$1.a(), $$1.b(), $$1.c(), $$7.a(), $$7.b(), $$7.c());
         }
      }

      private static void a(deg $$0, je $$1, duo $$2, dua $$3) {
         Set<UUID> $$4 = $$3.d();
         if (!$$4.isEmpty()) {
            eys $$5 = a($$1, $$2.c(dqf.c));

            for (UUID $$6 : $$4) {
               cnu $$7 = $$0.b($$6);
               if ($$7 != null && a($$1, $$3, $$7)) {
                  a($$0, $$5, $$7);
               }
            }
         }
      }

      private static boolean a(je $$0, dua $$1, cnu $$2) {
         return $$2.ds().j($$0) <= azd.k($$1.e());
      }

      private static void a(deg $$0, je $$1, dua $$2) {
         if (a($$2)) {
            azl $$3 = $$0.C_();
            if ($$3.i() <= 0.02F) {
               $$0.a($$1, awe.AH, awf.e, $$3.i() * 0.25F + 0.75F, $$3.i() + 0.5F, false);
            }
         }
      }

      public static boolean a(dua $$0) {
         return $$0.b();
      }

      private static eys a(je $$0, azl $$1) {
         return eys.a($$0).b(azd.a($$1, 0.4, 0.6), azd.a($$1, 0.4, 0.6), azd.a($$1, 0.4, 0.6));
      }

      private static eys b(je $$0, azl $$1) {
         return eys.a($$0).b(azd.a($$1, 0.1, 0.9), azd.a($$1, 0.25, 0.75), azd.a($$1, 0.1, 0.9));
      }

      private static eys a(je $$0, jj $$1) {
         return eys.c($$0).b((double)$$1.j() * 0.5, 1.75, (double)$$1.l() * 0.5);
      }
   }

   public static final class b {
      private static final int a = 14;
      private static final int b = 20;
      private static final int c = 15;

      public static void a(arh $$0, je $$1, duo $$2, dty $$3, dtz $$4, dua $$5) {
         dub $$6 = $$2.c(dqf.b);
         if (a($$0.aa(), $$6)) {
            a($$0, $$6, $$3, $$5, $$1);
         }

         duo $$7 = $$2;
         if ($$0.aa() >= $$4.c()) {
            $$7 = $$2.b(dqf.b, $$6.a($$0, $$1, $$3, $$4, $$5));
            if (!$$2.equals($$7)) {
               a($$0, $$1, $$2, $$7, $$3, $$5);
            }
         }

         if ($$4.c || $$5.c) {
            dtw.a($$0, $$1, $$2);
            if ($$5.c) {
               $$0.a($$1, $$2, $$7, 2);
            }

            $$4.c = false;
            $$5.c = false;
         }
      }

      public static void a(arh $$0, je $$1, duo $$2, dty $$3, dtz $$4, dua $$5, cnu $$6, cvp $$7) {
         dub $$8 = $$2.c(dqf.b);
         if (a($$3, $$8)) {
            if (!a($$3, $$7)) {
               a($$0, $$4, $$1, awe.AQ);
            } else if ($$4.a($$6)) {
               a($$0, $$4, $$1, awe.AM);
            } else {
               List<cvp> $$9 = a($$0, $$3, $$1, $$6);
               if (!$$9.isEmpty()) {
                  $$6.b(awo.c.b($$7.h()));
                  $$7.a($$3.e().J(), (buk)$$6);
                  a($$0, $$2, $$1, $$3, $$4, $$5, $$9);
                  $$4.b($$6);
                  $$5.a($$0, $$1, $$4, $$3, $$3.d());
               }
            }
         }
      }

      static void a(arh $$0, je $$1, duo $$2, duo $$3, dty $$4, dua $$5) {
         dub $$6 = $$2.c(dqf.b);
         dub $$7 = $$3.c(dqf.b);
         $$0.a($$1, $$3, 3);
         $$6.a($$0, $$1, $$7, $$4, $$5, $$3.c(dqf.d));
      }

      static void a(arh $$0, dub $$1, dty $$2, dua $$3, je $$4) {
         if (!a($$2, $$1)) {
            $$3.a(cvp.k);
         } else {
            cvp $$5 = a($$0, $$4, $$2.f().orElse($$2.b()));
            $$3.a($$5);
         }
      }

      private static cvp a(arh $$0, je $$1, alb<etm> $$2) {
         etm $$3 = $$0.o().bd().b($$2);
         etk $$4 = new etk.a($$0).a(ewd.f, eys.b($$1)).a(ewc.l);
         List<cvp> $$5 = $$3.a($$4, $$0.C_());
         return $$5.isEmpty() ? cvp.k : ad.a($$5, $$0.C_());
      }

      private static void a(arh $$0, duo $$1, je $$2, dty $$3, dtz $$4, dua $$5, List<cvp> $$6) {
         $$4.a($$6);
         $$5.a($$4.f());
         $$4.b($$0.aa() + 14L);
         a($$0, $$2, $$1, $$1.b(dqf.b, dub.c), $$3, $$5);
      }

      private static List<cvp> a(arh $$0, dty $$1, je $$2, cnu $$3) {
         etm $$4 = $$0.o().bd().b($$1.b());
         etk $$5 = new etk.a($$0).a(ewd.f, eys.b($$2)).a($$3.gy()).a(ewd.a, $$3).a(ewc.l);
         return $$4.a($$5);
      }

      private static boolean a(dty $$0, dub $$1) {
         return $$0.b() != etd.a && !$$0.e().f() && $$1 != dub.a;
      }

      private static boolean a(dty $$0, cvp $$1) {
         return cvp.c($$1, $$0.e()) && $$1.J() >= $$0.e().J();
      }

      private static boolean a(long $$0, dub $$1) {
         return $$0 % 20L == 0L && $$1 == dub.b;
      }

      private static void a(arh $$0, dtz $$1, je $$2, awd $$3) {
         if ($$0.aa() >= $$1.a() + 15L) {
            $$0.a(null, $$2, $$3, awf.e);
            $$1.a($$0.aa());
         }
      }
   }
}
