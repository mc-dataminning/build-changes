import com.google.common.annotations.VisibleForTesting;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DynamicOps;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dul extends dsg {
   private static final Logger a = LogUtils.getLogger();
   private final duo b = new duo();
   private final dup c = new dup();
   private final dum d = new dum();
   private dun e = dun.b;

   public dul(jg $$0, dvd $$1) {
      super(dsi.R, $$0, $$1);
   }

   @Nullable
   @Override
   public zo<acd> az_() {
      return ack.a(this);
   }

   @Override
   public uj a(jr.a $$0) {
      return ad.a(new uj(), $$1 -> $$1.a("shared_data", a(dup.b, this.c, $$0)));
   }

   @Override
   protected void b(uj $$0, jr.a $$1) {
      super.b($$0, $$1);
      $$0.a("config", a(dun.c, this.e, $$1));
      $$0.a("shared_data", a(dup.b, this.c, $$1));
      $$0.a("server_data", a(duo.b, this.b, $$1));
   }

   private static <T> vg a(Codec<T> $$0, T $$1, jr.a $$2) {
      return (vg)$$0.encodeStart($$2.a(ux.a), $$1).getOrThrow();
   }

   @Override
   protected void a(uj $$0, jr.a $$1) {
      super.a($$0, $$1);
      DynamicOps<vg> $$2 = $$1.a(ux.a);
      if ($$0.e("server_data")) {
         duo.b.parse($$2, $$0.c("server_data")).resultOrPartial(a::error).ifPresent(this.b::a);
      }

      if ($$0.e("config")) {
         dun.c.parse($$2, $$0.c("config")).resultOrPartial(a::error).ifPresent($$0x -> this.e = $$0x);
      }

      if ($$0.e("shared_data")) {
         dup.b.parse($$2, $$0.c("shared_data")).resultOrPartial(a::error).ifPresent(this.c::a);
      }
   }

   @Nullable
   public duo b() {
      return this.o != null && !this.o.C ? this.b : null;
   }

   public dup c() {
      return this.c;
   }

   public dum d() {
      return this.d;
   }

   public dun f() {
      return this.e;
   }

   @VisibleForTesting
   public void a(dun $$0) {
      this.e = $$0;
   }

   public static final class a {
      private static final int a = 20;
      private static final float b = 0.5F;
      private static final float c = 0.02F;
      private static final int d = 20;
      private static final int e = 20;

      public static void a(dev $$0, jg $$1, dvd $$2, dum $$3, dup $$4) {
         $$3.c();
         if ($$0.aa() % 20L == 0L) {
            a($$0, $$1, $$2, $$4);
         }

         a($$0, $$1, $$4, $$2.c(dqt.d) ? lq.L : lq.aJ);
         a($$0, $$1, $$4);
      }

      public static void a(dev $$0, jg $$1, dvd $$2, dup $$3, lo $$4) {
         a($$0, $$1, $$2, $$3);
         azr $$5 = $$0.A;

         for (int $$6 = 0; $$6 < 20; $$6++) {
            ezh $$7 = b($$1, $$5);
            $$0.a(lq.ae, $$7.a(), $$7.b(), $$7.c(), 0.0, 0.0, 0.0);
            $$0.a($$4, $$7.a(), $$7.b(), $$7.c(), 0.0, 0.0, 0.0);
         }
      }

      public static void a(dev $$0, jg $$1, lo $$2) {
         azr $$3 = $$0.A;

         for (int $$4 = 0; $$4 < 20; $$4++) {
            ezh $$5 = a($$1, $$3);
            ezh $$6 = new ezh($$3.k() * 0.02, $$3.k() * 0.02, $$3.k() * 0.02);
            $$0.a($$2, $$5.a(), $$5.b(), $$5.c(), $$6.a(), $$6.b(), $$6.c());
         }
      }

      private static void a(dev $$0, jg $$1, dup $$2, lo $$3) {
         azr $$4 = $$0.E_();
         if ($$4.i() <= 0.5F) {
            ezh $$5 = b($$1, $$4);
            $$0.a(lq.ae, $$5.a(), $$5.b(), $$5.c(), 0.0, 0.0, 0.0);
            if (a($$2)) {
               $$0.a($$3, $$5.a(), $$5.b(), $$5.c(), 0.0, 0.0, 0.0);
            }
         }
      }

      private static void a(dev $$0, ezh $$1, coh $$2) {
         azr $$3 = $$0.A;
         ezh $$4 = $$1.a($$2.dv().b(0.0, (double)($$2.dt() / 2.0F), 0.0));
         int $$5 = azj.a($$3, 2, 5);

         for (int $$6 = 0; $$6 < $$5; $$6++) {
            ezh $$7 = $$4.a($$3, 1.0F);
            $$0.a(lq.ba, $$1.a(), $$1.b(), $$1.c(), $$7.a(), $$7.b(), $$7.c());
         }
      }

      private static void a(dev $$0, jg $$1, dvd $$2, dup $$3) {
         Set<UUID> $$4 = $$3.d();
         if (!$$4.isEmpty()) {
            ezh $$5 = a($$1, $$2.c(dqt.c));

            for (UUID $$6 : $$4) {
               coh $$7 = $$0.b($$6);
               if ($$7 != null && a($$1, $$3, $$7)) {
                  a($$0, $$5, $$7);
               }
            }
         }
      }

      private static boolean a(jg $$0, dup $$1, coh $$2) {
         return $$2.dx().j($$0) <= azj.k($$1.e());
      }

      private static void a(dev $$0, jg $$1, dup $$2) {
         if (a($$2)) {
            azr $$3 = $$0.E_();
            if ($$3.i() <= 0.02F) {
               $$0.a($$1, awk.AF, awl.e, $$3.i() * 0.25F + 0.75F, $$3.i() + 0.5F, false);
            }
         }
      }

      public static boolean a(dup $$0) {
         return $$0.b();
      }

      private static ezh a(jg $$0, azr $$1) {
         return ezh.a($$0).b(azj.a($$1, 0.4, 0.6), azj.a($$1, 0.4, 0.6), azj.a($$1, 0.4, 0.6));
      }

      private static ezh b(jg $$0, azr $$1) {
         return ezh.a($$0).b(azj.a($$1, 0.1, 0.9), azj.a($$1, 0.25, 0.75), azj.a($$1, 0.1, 0.9));
      }

      private static ezh a(jg $$0, jl $$1) {
         return ezh.c($$0).b((double)$$1.j() * 0.5, 1.75, (double)$$1.l() * 0.5);
      }
   }

   public static final class b {
      private static final int a = 14;
      private static final int b = 20;
      private static final int c = 15;

      public static void a(arm $$0, jg $$1, dvd $$2, dun $$3, duo $$4, dup $$5) {
         duq $$6 = $$2.c(dqt.b);
         if (a($$0.aa(), $$6)) {
            a($$0, $$6, $$3, $$5, $$1);
         }

         dvd $$7 = $$2;
         if ($$0.aa() >= $$4.c()) {
            $$7 = $$2.b(dqt.b, $$6.a($$0, $$1, $$3, $$4, $$5));
            if (!$$2.equals($$7)) {
               a($$0, $$1, $$2, $$7, $$3, $$5);
            }
         }

         if ($$4.c || $$5.c) {
            dul.a($$0, $$1, $$2);
            if ($$5.c) {
               $$0.a($$1, $$2, $$7, 2);
            }

            $$4.c = false;
            $$5.c = false;
         }
      }

      public static void a(arm $$0, jg $$1, dvd $$2, dun $$3, duo $$4, dup $$5, coh $$6, cvx $$7) {
         duq $$8 = $$2.c(dqt.b);
         if (a($$3, $$8)) {
            if (!a($$3, $$7)) {
               a($$0, $$4, $$1, awk.AO);
            } else if ($$4.a($$6)) {
               a($$0, $$4, $$1, awk.AK);
            } else {
               List<cvx> $$9 = a($$0, $$3, $$1, $$6);
               if (!$$9.isEmpty()) {
                  $$6.b(awu.c.b($$7.h()));
                  $$7.a($$3.e().L(), (buv)$$6);
                  a($$0, $$2, $$1, $$3, $$4, $$5, $$9);
                  $$4.b($$6);
                  $$5.a($$0, $$1, $$4, $$3, $$3.d());
               }
            }
         }
      }

      static void a(arm $$0, jg $$1, dvd $$2, dvd $$3, dun $$4, dup $$5) {
         duq $$6 = $$2.c(dqt.b);
         duq $$7 = $$3.c(dqt.b);
         $$0.a($$1, $$3, 3);
         $$6.a($$0, $$1, $$7, $$4, $$5, $$3.c(dqt.d));
      }

      static void a(arm $$0, duq $$1, dun $$2, dup $$3, jg $$4) {
         if (!a($$2, $$1)) {
            $$3.a(cvx.k);
         } else {
            cvx $$5 = a($$0, $$4, $$2.f().orElse($$2.b()));
            $$3.a($$5);
         }
      }

      private static cvx a(arm $$0, jg $$1, alg<eub> $$2) {
         eub $$3 = $$0.o().bd().b($$2);
         etz $$4 = new etz.a($$0).a(ews.f, ezh.b($$1)).a(ewr.l);
         List<cvx> $$5 = $$3.a($$4, $$0.E_());
         return $$5.isEmpty() ? cvx.k : ad.a($$5, $$0.E_());
      }

      private static void a(arm $$0, dvd $$1, jg $$2, dun $$3, duo $$4, dup $$5, List<cvx> $$6) {
         $$4.a($$6);
         $$5.a($$4.f());
         $$4.b($$0.aa() + 14L);
         a($$0, $$2, $$1, $$1.b(dqt.b, duq.c), $$3, $$5);
      }

      private static List<cvx> a(arm $$0, dun $$1, jg $$2, coh $$3) {
         eub $$4 = $$0.o().bd().b($$1.b());
         etz $$5 = new etz.a($$0).a(ews.f, ezh.b($$2)).a($$3.gG()).a(ews.a, $$3).a(ewr.l);
         return $$4.a($$5);
      }

      private static boolean a(dun $$0, duq $$1) {
         return !$$0.e().f() && $$1 != duq.a;
      }

      private static boolean a(dun $$0, cvx $$1) {
         return cvx.c($$1, $$0.e()) && $$1.L() >= $$0.e().L();
      }

      private static boolean a(long $$0, duq $$1) {
         return $$0 % 20L == 0L && $$1 == duq.b;
      }

      private static void a(arm $$0, duo $$1, jg $$2, awj $$3) {
         if ($$0.aa() >= $$1.a() + 15L) {
            $$0.a(null, $$2, $$3, awl.e);
            $$1.a($$0.aa());
         }
      }
   }
}
