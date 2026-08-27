import com.google.common.annotations.VisibleForTesting;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dlm extends djl {
   private static final Logger a = LogUtils.getLogger();
   private final dlp b = new dlp();
   private final dlq c = new dlq();
   private final dln d = new dln();
   private dlo e = dlo.b;

   public dlm(ib $$0, dme $$1) {
      super(djn.R, $$0, $$1);
   }

   @Nullable
   @Override
   public xz<aai> az_() {
      return aap.a(this);
   }

   @Override
   public sy a(in.a $$0) {
      return ac.a(new sy(), $$0x -> $$0x.a("shared_data", a(dlq.b, this.c)));
   }

   @Override
   protected void b(sy $$0, in.a $$1) {
      super.b($$0, $$1);
      $$0.a("config", a(dlo.c, this.e));
      $$0.a("shared_data", a(dlq.b, this.c));
      $$0.a("server_data", a(dlp.b, this.b));
   }

   private static <T> tv a(Codec<T> $$0, T $$1) {
      return ac.a($$0.encodeStart(tm.a, $$1), IllegalStateException::new);
   }

   @Override
   public void a(sy $$0, in.a $$1) {
      super.a($$0, $$1);
      if ($$0.e("server_data")) {
         dlp.b.parse(tm.a, $$0.c("server_data")).resultOrPartial(a::error).ifPresent(this.b::a);
      }

      if ($$0.e("config")) {
         dlo.c.parse(tm.a, $$0.c("config")).resultOrPartial(a::error).ifPresent($$0x -> this.e = $$0x);
      }

      if ($$0.e("shared_data")) {
         dlq.b.parse(tm.a, $$0.c("shared_data")).resultOrPartial(a::error).ifPresent(this.c::a);
      }
   }

   @Nullable
   public dlp b() {
      return this.o != null && !this.o.B ? this.b : null;
   }

   public dlq c() {
      return this.c;
   }

   public dln d() {
      return this.d;
   }

   public dlo f() {
      return this.e;
   }

   @VisibleForTesting
   public void a(dlo $$0) {
      this.e = $$0;
   }

   public static final class a {
      private static final int a = 20;
      private static final float b = 0.5F;
      private static final float c = 0.02F;
      private static final int d = 20;
      private static final int e = 20;

      public static void a(cwe $$0, ib $$1, dme $$2, dln $$3, dlq $$4) {
         $$3.c();
         if ($$0.X() % 20L == 0L) {
            b($$0, $$1, $$2, $$4);
         }

         a($$0, $$1, $$4);
         b($$0, $$1, $$4);
      }

      public static void a(cwe $$0, ib $$1, dme $$2, dlq $$3) {
         b($$0, $$1, $$2, $$3);
         awt $$4 = $$0.z;

         for (int $$5 = 0; $$5 < 20; $$5++) {
            eov $$6 = b($$1, $$4);
            $$0.a(kb.ab, $$6.a(), $$6.b(), $$6.c(), 0.0, 0.0, 0.0);
            $$0.a(kb.aG, $$6.a(), $$6.b(), $$6.c(), 0.0, 0.0, 0.0);
         }
      }

      public static void a(cwe $$0, ib $$1) {
         awt $$2 = $$0.z;

         for (int $$3 = 0; $$3 < 20; $$3++) {
            eov $$4 = a($$1, $$2);
            eov $$5 = new eov($$2.k() * 0.02, $$2.k() * 0.02, $$2.k() * 0.02);
            $$0.a(kb.aG, $$4.a(), $$4.b(), $$4.c(), $$5.a(), $$5.b(), $$5.c());
         }
      }

      private static void a(cwe $$0, ib $$1, dlq $$2) {
         awt $$3 = $$0.F_();
         if ($$3.i() <= 0.5F) {
            eov $$4 = b($$1, $$3);
            $$0.a(kb.ab, $$4.a(), $$4.b(), $$4.c(), 0.0, 0.0, 0.0);
            if (a($$2)) {
               $$0.a(kb.aG, $$4.a(), $$4.b(), $$4.c(), 0.0, 0.0, 0.0);
            }
         }
      }

      private static void a(cwe $$0, eov $$1, cia $$2) {
         awt $$3 = $$0.z;
         eov $$4 = $$1.a($$2.dh().b(0.0, (double)($$2.de() / 2.0F), 0.0));
         int $$5 = awm.a($$3, 2, 5);

         for (int $$6 = 0; $$6 < $$5; $$6++) {
            eov $$7 = $$4.a($$3, 1.0F);
            $$0.a(kb.aW, $$1.a(), $$1.b(), $$1.c(), $$7.a(), $$7.b(), $$7.c());
         }
      }

      private static void b(cwe $$0, ib $$1, dme $$2, dlq $$3) {
         Set<UUID> $$4 = $$3.d();
         if (!$$4.isEmpty()) {
            eov $$5 = a($$1, $$2.c(dhz.c));

            for (UUID $$6 : $$4) {
               cia $$7 = $$0.b($$6);
               if ($$7 != null && a($$1, $$3, $$7)) {
                  a($$0, $$5, $$7);
               }
            }
         }
      }

      private static boolean a(ib $$0, dlq $$1, cia $$2) {
         return $$2.dj().j($$0) <= awm.k($$1.e());
      }

      private static void b(cwe $$0, ib $$1, dlq $$2) {
         if (a($$2)) {
            awt $$3 = $$0.F_();
            if ($$3.i() <= 0.02F) {
               $$0.a($$1, atp.zU, atq.e, $$3.i() * 0.25F + 0.75F, $$3.i() + 0.5F, false);
            }
         }
      }

      public static boolean a(dlq $$0) {
         return $$0.b();
      }

      private static eov a(ib $$0, awt $$1) {
         return eov.a($$0).b(awm.a($$1, 0.4, 0.6), awm.a($$1, 0.4, 0.6), awm.a($$1, 0.4, 0.6));
      }

      private static eov b(ib $$0, awt $$1) {
         return eov.a($$0).b(awm.a($$1, 0.1, 0.9), awm.a($$1, 0.25, 0.75), awm.a($$1, 0.1, 0.9));
      }

      private static eov a(ib $$0, ih $$1) {
         return eov.c($$0).b((double)$$1.j() * 0.5, 1.75, (double)$$1.l() * 0.5);
      }
   }

   public static final class b {
      private static final int a = 14;
      private static final int b = 20;
      private static final int c = 15;

      public static void a(apa $$0, ib $$1, dme $$2, dlo $$3, dlp $$4, dlq $$5) {
         dlr $$6 = $$2.c(dhz.b);
         if (a($$0.X(), $$6)) {
            a($$0, $$6, $$3, $$5, $$1);
         }

         dme $$7 = $$2;
         if ($$0.X() >= $$4.c()) {
            $$7 = $$2.a(dhz.b, $$6.a($$0, $$1, $$3, $$4, $$5));
            if (!$$2.equals($$7)) {
               a($$0, $$1, $$2, $$7, $$3, $$5);
            }
         }

         if ($$4.c || $$5.c) {
            dlm.a($$0, $$1, $$2);
            if ($$5.c) {
               $$0.a($$1, $$2, $$7, 2);
            }

            $$4.c = false;
            $$5.c = false;
         }
      }

      public static void a(apa $$0, ib $$1, dme $$2, dlo $$3, dlp $$4, dlq $$5, cia $$6, cpq $$7) {
         dlr $$8 = $$2.c(dhz.b);
         if (a($$3, $$8)) {
            if (!a($$3, $$7)) {
               a($$0, $$4, $$1);
            } else if ($$4.a($$6)) {
               a($$0, $$4, $$1);
            } else {
               List<cpq> $$9 = a($$0, $$3, $$1, $$6);
               if (!$$9.isEmpty()) {
                  $$6.b(atz.c.b($$7.d()));
                  if (!$$6.f()) {
                     $$7.h($$3.e().M());
                  }

                  a($$0, $$2, $$1, $$3, $$4, $$5, $$9);
                  $$4.b($$6);
                  $$5.a($$0, $$1, $$4, $$3, $$3.d());
               }
            }
         }
      }

      static void a(apa $$0, ib $$1, dme $$2, dme $$3, dlo $$4, dlq $$5) {
         dlr $$6 = $$2.c(dhz.b);
         dlr $$7 = $$3.c(dhz.b);
         $$0.a($$1, $$3, 3);
         $$6.a($$0, $$1, $$7, $$4, $$5);
      }

      static void a(apa $$0, dlr $$1, dlo $$2, dlq $$3, ib $$4) {
         if (!a($$2, $$1)) {
            $$3.a(cpq.h);
         } else {
            cpq $$5 = a($$0, $$4, $$2.f().orElse($$2.b()));
            $$3.a($$5);
         }
      }

      private static cpq a(apa $$0, ib $$1, ajc $$2) {
         ekg $$3 = $$0.o().aM().getLootTable($$2);
         eke $$4 = new eke.a($$0).a(emj.f, eov.b($$1)).a(emi.k);
         List<cpq> $$5 = $$3.a($$4);
         return $$5.isEmpty() ? cpq.h : ac.a($$5, $$0.F_());
      }

      private static void a(apa $$0, dme $$1, ib $$2, dlo $$3, dlp $$4, dlq $$5, List<cpq> $$6) {
         $$4.a($$6);
         $$5.a($$4.f());
         $$4.b($$0.X() + 14L);
         a($$0, $$2, $$1, $$1.a(dhz.b, dlr.c), $$3, $$5);
      }

      private static List<cpq> a(apa $$0, dlo $$1, ib $$2, cia $$3) {
         ekg $$4 = $$0.o().aM().getLootTable($$1.b());
         eke $$5 = new eke.a($$0).a(emj.f, eov.b($$2)).a($$3.gr()).a(emj.a, $$3).a(emi.k);
         return $$4.a($$5);
      }

      private static boolean a(dlo $$0, dlr $$1) {
         return !$$0.b().equals(ejw.a) && !$$0.e().b() && $$1 != dlr.a;
      }

      private static boolean a(dlo $$0, cpq $$1) {
         return cpq.c($$1, $$0.e()) && $$1.M() >= $$0.e().M();
      }

      private static boolean a(long $$0, dlr $$1) {
         return $$0 % 20L == 0L && $$1 == dlr.b;
      }

      private static void a(apa $$0, dlp $$1, ib $$2) {
         if ($$0.X() >= $$1.a() + 15L) {
            $$0.a(null, $$2, atp.Ac, atq.e);
            $$1.a($$0.X());
         }
      }
   }
}
