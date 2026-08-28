import com.google.common.annotations.VisibleForTesting;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DynamicOps;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dsk extends dqh {
   private static final Logger a = LogUtils.getLogger();
   private final dsn b = new dsn();
   private final dso c = new dso();
   private final dsl d = new dsl();
   private dsm e = dsm.b;

   public dsk(jd $$0, dtc $$1) {
      super(dqj.R, $$0, $$1);
   }

   @Nullable
   @Override
   public zg<abu> az_() {
      return acb.a(this);
   }

   @Override
   public ub a(jo.a $$0) {
      return ad.a(new ub(), $$1 -> $$1.a("shared_data", a(dso.b, this.c, $$0)));
   }

   @Override
   protected void b(ub $$0, jo.a $$1) {
      super.b($$0, $$1);
      $$0.a("config", a(dsm.c, this.e, $$1));
      $$0.a("shared_data", a(dso.b, this.c, $$1));
      $$0.a("server_data", a(dsn.b, this.b, $$1));
   }

   private static <T> uy a(Codec<T> $$0, T $$1, jo.a $$2) {
      return (uy)$$0.encodeStart($$2.a(up.a), $$1).getOrThrow();
   }

   @Override
   protected void a(ub $$0, jo.a $$1) {
      super.a($$0, $$1);
      DynamicOps<uy> $$2 = $$1.a(up.a);
      if ($$0.e("server_data")) {
         dsn.b.parse($$2, $$0.c("server_data")).resultOrPartial(a::error).ifPresent(this.b::a);
      }

      if ($$0.e("config")) {
         dsm.c.parse($$2, $$0.c("config")).resultOrPartial(a::error).ifPresent($$0x -> this.e = $$0x);
      }

      if ($$0.e("shared_data")) {
         dso.b.parse($$2, $$0.c("shared_data")).resultOrPartial(a::error).ifPresent(this.c::a);
      }
   }

   @Nullable
   public dsn b() {
      return this.n != null && !this.n.B ? this.b : null;
   }

   public dso c() {
      return this.c;
   }

   public dsl d() {
      return this.d;
   }

   public dsm f() {
      return this.e;
   }

   @VisibleForTesting
   public void a(dsm $$0) {
      this.e = $$0;
   }

   public static final class a {
      private static final int a = 20;
      private static final float b = 0.5F;
      private static final float c = 0.02F;
      private static final int d = 20;
      private static final int e = 20;

      public static void a(dcw $$0, jd $$1, dtc $$2, dsl $$3, dso $$4) {
         $$3.c();
         if ($$0.Z() % 20L == 0L) {
            a($$0, $$1, $$2, $$4);
         }

         a($$0, $$1, $$4, $$2.c(dou.d) ? lm.L : lm.aJ);
         a($$0, $$1, $$4);
      }

      public static void a(dcw $$0, jd $$1, dtc $$2, dso $$3, lk $$4) {
         a($$0, $$1, $$2, $$3);
         ayw $$5 = $$0.z;

         for (int $$6 = 0; $$6 < 20; $$6++) {
            exa $$7 = b($$1, $$5);
            $$0.a(lm.ae, $$7.a(), $$7.b(), $$7.c(), 0.0, 0.0, 0.0);
            $$0.a($$4, $$7.a(), $$7.b(), $$7.c(), 0.0, 0.0, 0.0);
         }
      }

      public static void a(dcw $$0, jd $$1, lk $$2) {
         ayw $$3 = $$0.z;

         for (int $$4 = 0; $$4 < 20; $$4++) {
            exa $$5 = a($$1, $$3);
            exa $$6 = new exa($$3.k() * 0.02, $$3.k() * 0.02, $$3.k() * 0.02);
            $$0.a($$2, $$5.a(), $$5.b(), $$5.c(), $$6.a(), $$6.b(), $$6.c());
         }
      }

      private static void a(dcw $$0, jd $$1, dso $$2, lk $$3) {
         ayw $$4 = $$0.E_();
         if ($$4.i() <= 0.5F) {
            exa $$5 = b($$1, $$4);
            $$0.a(lm.ae, $$5.a(), $$5.b(), $$5.c(), 0.0, 0.0, 0.0);
            if (a($$2)) {
               $$0.a($$3, $$5.a(), $$5.b(), $$5.c(), 0.0, 0.0, 0.0);
            }
         }
      }

      private static void a(dcw $$0, exa $$1, cmx $$2) {
         ayw $$3 = $$0.z;
         exa $$4 = $$1.a($$2.dn().b(0.0, (double)($$2.dl() / 2.0F), 0.0));
         int $$5 = ayo.a($$3, 2, 5);

         for (int $$6 = 0; $$6 < $$5; $$6++) {
            exa $$7 = $$4.a($$3, 1.0F);
            $$0.a(lm.ba, $$1.a(), $$1.b(), $$1.c(), $$7.a(), $$7.b(), $$7.c());
         }
      }

      private static void a(dcw $$0, jd $$1, dtc $$2, dso $$3) {
         Set<UUID> $$4 = $$3.d();
         if (!$$4.isEmpty()) {
            exa $$5 = a($$1, $$2.c(dou.c));

            for (UUID $$6 : $$4) {
               cmx $$7 = $$0.b($$6);
               if ($$7 != null && a($$1, $$3, $$7)) {
                  a($$0, $$5, $$7);
               }
            }
         }
      }

      private static boolean a(jd $$0, dso $$1, cmx $$2) {
         return $$2.dp().j($$0) <= ayo.k($$1.e());
      }

      private static void a(dcw $$0, jd $$1, dso $$2) {
         if (a($$2)) {
            ayw $$3 = $$0.E_();
            if ($$3.i() <= 0.02F) {
               $$0.a($$1, avp.AB, avq.e, $$3.i() * 0.25F + 0.75F, $$3.i() + 0.5F, false);
            }
         }
      }

      public static boolean a(dso $$0) {
         return $$0.b();
      }

      private static exa a(jd $$0, ayw $$1) {
         return exa.a($$0).b(ayo.a($$1, 0.4, 0.6), ayo.a($$1, 0.4, 0.6), ayo.a($$1, 0.4, 0.6));
      }

      private static exa b(jd $$0, ayw $$1) {
         return exa.a($$0).b(ayo.a($$1, 0.1, 0.9), ayo.a($$1, 0.25, 0.75), ayo.a($$1, 0.1, 0.9));
      }

      private static exa a(jd $$0, ji $$1) {
         return exa.c($$0).b((double)$$1.j() * 0.5, 1.75, (double)$$1.l() * 0.5);
      }
   }

   public static final class b {
      private static final int a = 14;
      private static final int b = 20;
      private static final int c = 15;

      public static void a(aqu $$0, jd $$1, dtc $$2, dsm $$3, dsn $$4, dso $$5) {
         dsp $$6 = $$2.c(dou.b);
         if (a($$0.Z(), $$6)) {
            a($$0, $$6, $$3, $$5, $$1);
         }

         dtc $$7 = $$2;
         if ($$0.Z() >= $$4.c()) {
            $$7 = $$2.a(dou.b, $$6.a($$0, $$1, $$3, $$4, $$5));
            if (!$$2.equals($$7)) {
               a($$0, $$1, $$2, $$7, $$3, $$5);
            }
         }

         if ($$4.c || $$5.c) {
            dsk.a($$0, $$1, $$2);
            if ($$5.c) {
               $$0.a($$1, $$2, $$7, 2);
            }

            $$4.c = false;
            $$5.c = false;
         }
      }

      public static void a(aqu $$0, jd $$1, dtc $$2, dsm $$3, dsn $$4, dso $$5, cmx $$6, cuq $$7) {
         dsp $$8 = $$2.c(dou.b);
         if (a($$3, $$8)) {
            if (!a($$3, $$7)) {
               a($$0, $$4, $$1, avp.AK);
            } else if ($$4.a($$6)) {
               a($$0, $$4, $$1, avp.AG);
            } else {
               List<cuq> $$9 = a($$0, $$3, $$1, $$6);
               if (!$$9.isEmpty()) {
                  $$6.b(avz.c.b($$7.g()));
                  $$7.a($$3.e().H(), $$6);
                  a($$0, $$2, $$1, $$3, $$4, $$5, $$9);
                  $$4.b($$6);
                  $$5.a($$0, $$1, $$4, $$3, $$3.d());
               }
            }
         }
      }

      static void a(aqu $$0, jd $$1, dtc $$2, dtc $$3, dsm $$4, dso $$5) {
         dsp $$6 = $$2.c(dou.b);
         dsp $$7 = $$3.c(dou.b);
         $$0.a($$1, $$3, 3);
         $$6.a($$0, $$1, $$7, $$4, $$5, $$3.c(dou.d));
      }

      static void a(aqu $$0, dsp $$1, dsm $$2, dso $$3, jd $$4) {
         if (!a($$2, $$1)) {
            $$3.a(cuq.l);
         } else {
            cuq $$5 = a($$0, $$4, $$2.f().orElse($$2.b()));
            $$3.a($$5);
         }
      }

      private static cuq a(aqu $$0, jd $$1, akq<eru> $$2) {
         eru $$3 = $$0.o().be().b($$2);
         ers $$4 = new ers.a($$0).a(eul.f, exa.b($$1)).a(euk.l);
         List<cuq> $$5 = $$3.a($$4, $$0.E_());
         return $$5.isEmpty() ? cuq.l : ad.a($$5, $$0.E_());
      }

      private static void a(aqu $$0, dtc $$1, jd $$2, dsm $$3, dsn $$4, dso $$5, List<cuq> $$6) {
         $$4.a($$6);
         $$5.a($$4.f());
         $$4.b($$0.Z() + 14L);
         a($$0, $$2, $$1, $$1.a(dou.b, dsp.c), $$3, $$5);
      }

      private static List<cuq> a(aqu $$0, dsm $$1, jd $$2, cmx $$3) {
         eru $$4 = $$0.o().be().b($$1.b());
         ers $$5 = new ers.a($$0).a(eul.f, exa.b($$2)).a($$3.gv()).a(eul.a, $$3).a(euk.l);
         return $$4.a($$5);
      }

      private static boolean a(dsm $$0, dsp $$1) {
         return $$0.b() != erl.a && !$$0.e().e() && $$1 != dsp.a;
      }

      private static boolean a(dsm $$0, cuq $$1) {
         return cuq.c($$1, $$0.e()) && $$1.H() >= $$0.e().H();
      }

      private static boolean a(long $$0, dsp $$1) {
         return $$0 % 20L == 0L && $$1 == dsp.b;
      }

      private static void a(aqu $$0, dsn $$1, jd $$2, avo $$3) {
         if ($$0.Z() >= $$1.a() + 15L) {
            $$0.a(null, $$2, $$3, avq.e);
            $$1.a($$0.Z());
         }
      }
   }
}
