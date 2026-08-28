import com.google.common.annotations.VisibleForTesting;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DynamicOps;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dti extends dre {
   private static final Logger a = LogUtils.getLogger();
   private final dtl b = new dtl();
   private final dtm c = new dtm();
   private final dtj d = new dtj();
   private dtk e = dtk.b;

   public dti(je $$0, dua $$1) {
      super(drg.R, $$0, $$1);
   }

   @Nullable
   @Override
   public zk<abz> aA_() {
      return acg.a(this);
   }

   @Override
   public uf a(jp.a $$0) {
      return ad.a(new uf(), $$1 -> $$1.a("shared_data", a(dtm.b, this.c, $$0)));
   }

   @Override
   protected void b(uf $$0, jp.a $$1) {
      super.b($$0, $$1);
      $$0.a("config", a(dtk.c, this.e, $$1));
      $$0.a("shared_data", a(dtm.b, this.c, $$1));
      $$0.a("server_data", a(dtl.b, this.b, $$1));
   }

   private static <T> vc a(Codec<T> $$0, T $$1, jp.a $$2) {
      return (vc)$$0.encodeStart($$2.a(ut.a), $$1).getOrThrow();
   }

   @Override
   protected void a(uf $$0, jp.a $$1) {
      super.a($$0, $$1);
      DynamicOps<vc> $$2 = $$1.a(ut.a);
      if ($$0.e("server_data")) {
         dtl.b.parse($$2, $$0.c("server_data")).resultOrPartial(a::error).ifPresent(this.b::a);
      }

      if ($$0.e("config")) {
         dtk.c.parse($$2, $$0.c("config")).resultOrPartial(a::error).ifPresent($$0x -> this.e = $$0x);
      }

      if ($$0.e("shared_data")) {
         dtm.b.parse($$2, $$0.c("shared_data")).resultOrPartial(a::error).ifPresent(this.c::a);
      }
   }

   @Nullable
   public dtl b() {
      return this.o != null && !this.o.B ? this.b : null;
   }

   public dtm c() {
      return this.c;
   }

   public dtj d() {
      return this.d;
   }

   public dtk f() {
      return this.e;
   }

   @VisibleForTesting
   public void a(dtk $$0) {
      this.e = $$0;
   }

   public static final class a {
      private static final int a = 20;
      private static final float b = 0.5F;
      private static final float c = 0.02F;
      private static final int d = 20;
      private static final int e = 20;

      public static void a(dds $$0, je $$1, dua $$2, dtj $$3, dtm $$4) {
         $$3.c();
         if ($$0.aa() % 20L == 0L) {
            a($$0, $$1, $$2, $$4);
         }

         a($$0, $$1, $$4, $$2.c(dpr.d) ? ln.L : ln.aJ);
         a($$0, $$1, $$4);
      }

      public static void a(dds $$0, je $$1, dua $$2, dtm $$3, ll $$4) {
         a($$0, $$1, $$2, $$3);
         azk $$5 = $$0.z;

         for (int $$6 = 0; $$6 < 20; $$6++) {
            eye $$7 = b($$1, $$5);
            $$0.a(ln.ae, $$7.a(), $$7.b(), $$7.c(), 0.0, 0.0, 0.0);
            $$0.a($$4, $$7.a(), $$7.b(), $$7.c(), 0.0, 0.0, 0.0);
         }
      }

      public static void a(dds $$0, je $$1, ll $$2) {
         azk $$3 = $$0.z;

         for (int $$4 = 0; $$4 < 20; $$4++) {
            eye $$5 = a($$1, $$3);
            eye $$6 = new eye($$3.k() * 0.02, $$3.k() * 0.02, $$3.k() * 0.02);
            $$0.a($$2, $$5.a(), $$5.b(), $$5.c(), $$6.a(), $$6.b(), $$6.c());
         }
      }

      private static void a(dds $$0, je $$1, dtm $$2, ll $$3) {
         azk $$4 = $$0.C_();
         if ($$4.i() <= 0.5F) {
            eye $$5 = b($$1, $$4);
            $$0.a(ln.ae, $$5.a(), $$5.b(), $$5.c(), 0.0, 0.0, 0.0);
            if (a($$2)) {
               $$0.a($$3, $$5.a(), $$5.b(), $$5.c(), 0.0, 0.0, 0.0);
            }
         }
      }

      private static void a(dds $$0, eye $$1, cnp $$2) {
         azk $$3 = $$0.z;
         eye $$4 = $$1.a($$2.dq().b(0.0, (double)($$2.do() / 2.0F), 0.0));
         int $$5 = azc.a($$3, 2, 5);

         for (int $$6 = 0; $$6 < $$5; $$6++) {
            eye $$7 = $$4.a($$3, 1.0F);
            $$0.a(ln.ba, $$1.a(), $$1.b(), $$1.c(), $$7.a(), $$7.b(), $$7.c());
         }
      }

      private static void a(dds $$0, je $$1, dua $$2, dtm $$3) {
         Set<UUID> $$4 = $$3.d();
         if (!$$4.isEmpty()) {
            eye $$5 = a($$1, $$2.c(dpr.c));

            for (UUID $$6 : $$4) {
               cnp $$7 = $$0.b($$6);
               if ($$7 != null && a($$1, $$3, $$7)) {
                  a($$0, $$5, $$7);
               }
            }
         }
      }

      private static boolean a(je $$0, dtm $$1, cnp $$2) {
         return $$2.ds().j($$0) <= azc.k($$1.e());
      }

      private static void a(dds $$0, je $$1, dtm $$2) {
         if (a($$2)) {
            azk $$3 = $$0.C_();
            if ($$3.i() <= 0.02F) {
               $$0.a($$1, awd.AH, awe.e, $$3.i() * 0.25F + 0.75F, $$3.i() + 0.5F, false);
            }
         }
      }

      public static boolean a(dtm $$0) {
         return $$0.b();
      }

      private static eye a(je $$0, azk $$1) {
         return eye.a($$0).b(azc.a($$1, 0.4, 0.6), azc.a($$1, 0.4, 0.6), azc.a($$1, 0.4, 0.6));
      }

      private static eye b(je $$0, azk $$1) {
         return eye.a($$0).b(azc.a($$1, 0.1, 0.9), azc.a($$1, 0.25, 0.75), azc.a($$1, 0.1, 0.9));
      }

      private static eye a(je $$0, jj $$1) {
         return eye.c($$0).b((double)$$1.j() * 0.5, 1.75, (double)$$1.l() * 0.5);
      }
   }

   public static final class b {
      private static final int a = 14;
      private static final int b = 20;
      private static final int c = 15;

      public static void a(arg $$0, je $$1, dua $$2, dtk $$3, dtl $$4, dtm $$5) {
         dtn $$6 = $$2.c(dpr.b);
         if (a($$0.aa(), $$6)) {
            a($$0, $$6, $$3, $$5, $$1);
         }

         dua $$7 = $$2;
         if ($$0.aa() >= $$4.c()) {
            $$7 = $$2.b(dpr.b, $$6.a($$0, $$1, $$3, $$4, $$5));
            if (!$$2.equals($$7)) {
               a($$0, $$1, $$2, $$7, $$3, $$5);
            }
         }

         if ($$4.c || $$5.c) {
            dti.a($$0, $$1, $$2);
            if ($$5.c) {
               $$0.a($$1, $$2, $$7, 2);
            }

            $$4.c = false;
            $$5.c = false;
         }
      }

      public static void a(arg $$0, je $$1, dua $$2, dtk $$3, dtl $$4, dtm $$5, cnp $$6, cvl $$7) {
         dtn $$8 = $$2.c(dpr.b);
         if (a($$3, $$8)) {
            if (!a($$3, $$7)) {
               a($$0, $$4, $$1, awd.AQ);
            } else if ($$4.a($$6)) {
               a($$0, $$4, $$1, awd.AM);
            } else {
               List<cvl> $$9 = a($$0, $$3, $$1, $$6);
               if (!$$9.isEmpty()) {
                  $$6.b(awn.c.b($$7.h()));
                  $$7.a($$3.e().J(), (buf)$$6);
                  a($$0, $$2, $$1, $$3, $$4, $$5, $$9);
                  $$4.b($$6);
                  $$5.a($$0, $$1, $$4, $$3, $$3.d());
               }
            }
         }
      }

      static void a(arg $$0, je $$1, dua $$2, dua $$3, dtk $$4, dtm $$5) {
         dtn $$6 = $$2.c(dpr.b);
         dtn $$7 = $$3.c(dpr.b);
         $$0.a($$1, $$3, 3);
         $$6.a($$0, $$1, $$7, $$4, $$5, $$3.c(dpr.d));
      }

      static void a(arg $$0, dtn $$1, dtk $$2, dtm $$3, je $$4) {
         if (!a($$2, $$1)) {
            $$3.a(cvl.k);
         } else {
            cvl $$5 = a($$0, $$4, $$2.f().orElse($$2.b()));
            $$3.a($$5);
         }
      }

      private static cvl a(arg $$0, je $$1, ala<esy> $$2) {
         esy $$3 = $$0.o().bd().b($$2);
         esw $$4 = new esw.a($$0).a(evp.f, eye.b($$1)).a(evo.l);
         List<cvl> $$5 = $$3.a($$4, $$0.C_());
         return $$5.isEmpty() ? cvl.k : ad.a($$5, $$0.C_());
      }

      private static void a(arg $$0, dua $$1, je $$2, dtk $$3, dtl $$4, dtm $$5, List<cvl> $$6) {
         $$4.a($$6);
         $$5.a($$4.f());
         $$4.b($$0.aa() + 14L);
         a($$0, $$2, $$1, $$1.b(dpr.b, dtn.c), $$3, $$5);
      }

      private static List<cvl> a(arg $$0, dtk $$1, je $$2, cnp $$3) {
         esy $$4 = $$0.o().bd().b($$1.b());
         esw $$5 = new esw.a($$0).a(evp.f, eye.b($$2)).a($$3.gy()).a(evp.a, $$3).a(evo.l);
         return $$4.a($$5);
      }

      private static boolean a(dtk $$0, dtn $$1) {
         return $$0.b() != esp.a && !$$0.e().f() && $$1 != dtn.a;
      }

      private static boolean a(dtk $$0, cvl $$1) {
         return cvl.c($$1, $$0.e()) && $$1.J() >= $$0.e().J();
      }

      private static boolean a(long $$0, dtn $$1) {
         return $$0 % 20L == 0L && $$1 == dtn.b;
      }

      private static void a(arg $$0, dtl $$1, je $$2, awc $$3) {
         if ($$0.aa() >= $$1.a() + 15L) {
            $$0.a(null, $$2, $$3, awe.e);
            $$1.a($$0.aa());
         }
      }
   }
}
