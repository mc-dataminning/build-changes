import com.google.common.annotations.VisibleForTesting;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DynamicOps;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dur extends dsm {
   private static final Logger a = LogUtils.getLogger();
   private final duu b = new duu();
   private final duv c = new duv();
   private final dus d = new dus();
   private dut e = dut.b;

   public dur(jh $$0, dvj $$1) {
      super(dso.R, $$0, $$1);
   }

   @Nullable
   @Override
   public zp<ace> ay_() {
      return acl.a(this);
   }

   @Override
   public uk a(js.a $$0) {
      return ae.a(new uk(), $$1 -> $$1.a("shared_data", a(duv.b, this.c, $$0)));
   }

   @Override
   protected void b(uk $$0, js.a $$1) {
      super.b($$0, $$1);
      $$0.a("config", a(dut.c, this.e, $$1));
      $$0.a("shared_data", a(duv.b, this.c, $$1));
      $$0.a("server_data", a(duu.b, this.b, $$1));
   }

   private static <T> vh a(Codec<T> $$0, T $$1, js.a $$2) {
      return (vh)$$0.encodeStart($$2.a(uy.a), $$1).getOrThrow();
   }

   @Override
   protected void a(uk $$0, js.a $$1) {
      super.a($$0, $$1);
      DynamicOps<vh> $$2 = $$1.a(uy.a);
      if ($$0.e("server_data")) {
         duu.b.parse($$2, $$0.c("server_data")).resultOrPartial(a::error).ifPresent(this.b::a);
      }

      if ($$0.e("config")) {
         dut.c.parse($$2, $$0.c("config")).resultOrPartial(a::error).ifPresent($$0x -> this.e = $$0x);
      }

      if ($$0.e("shared_data")) {
         duv.b.parse($$2, $$0.c("shared_data")).resultOrPartial(a::error).ifPresent(this.c::a);
      }
   }

   @Nullable
   public duu b() {
      return this.o != null && !this.o.C ? this.b : null;
   }

   public duv c() {
      return this.c;
   }

   public dus d() {
      return this.d;
   }

   public dut f() {
      return this.e;
   }

   @VisibleForTesting
   public void a(dut $$0) {
      this.e = $$0;
   }

   public static final class a {
      private static final int a = 20;
      private static final float b = 0.5F;
      private static final float c = 0.02F;
      private static final int d = 20;
      private static final int e = 20;

      public static void a(dfb $$0, jh $$1, dvj $$2, dus $$3, duv $$4) {
         $$3.c();
         if ($$0.aa() % 20L == 0L) {
            a($$0, $$1, $$2, $$4);
         }

         a($$0, $$1, $$4, $$2.c(dqz.d) ? lr.L : lr.aJ);
         a($$0, $$1, $$4);
      }

      public static void a(dfb $$0, jh $$1, dvj $$2, duv $$3, lp $$4) {
         a($$0, $$1, $$2, $$3);
         azs $$5 = $$0.A;

         for (int $$6 = 0; $$6 < 20; $$6++) {
            ezn $$7 = b($$1, $$5);
            $$0.a(lr.ae, $$7.a(), $$7.b(), $$7.c(), 0.0, 0.0, 0.0);
            $$0.a($$4, $$7.a(), $$7.b(), $$7.c(), 0.0, 0.0, 0.0);
         }
      }

      public static void a(dfb $$0, jh $$1, lp $$2) {
         azs $$3 = $$0.A;

         for (int $$4 = 0; $$4 < 20; $$4++) {
            ezn $$5 = a($$1, $$3);
            ezn $$6 = new ezn($$3.k() * 0.02, $$3.k() * 0.02, $$3.k() * 0.02);
            $$0.a($$2, $$5.a(), $$5.b(), $$5.c(), $$6.a(), $$6.b(), $$6.c());
         }
      }

      private static void a(dfb $$0, jh $$1, duv $$2, lp $$3) {
         azs $$4 = $$0.E_();
         if ($$4.i() <= 0.5F) {
            ezn $$5 = b($$1, $$4);
            $$0.a(lr.ae, $$5.a(), $$5.b(), $$5.c(), 0.0, 0.0, 0.0);
            if (a($$2)) {
               $$0.a($$3, $$5.a(), $$5.b(), $$5.c(), 0.0, 0.0, 0.0);
            }
         }
      }

      private static void a(dfb $$0, ezn $$1, com $$2) {
         azs $$3 = $$0.A;
         ezn $$4 = $$1.a($$2.dv().b(0.0, (double)($$2.dt() / 2.0F), 0.0));
         int $$5 = azk.a($$3, 2, 5);

         for (int $$6 = 0; $$6 < $$5; $$6++) {
            ezn $$7 = $$4.a($$3, 1.0F);
            $$0.a(lr.ba, $$1.a(), $$1.b(), $$1.c(), $$7.a(), $$7.b(), $$7.c());
         }
      }

      private static void a(dfb $$0, jh $$1, dvj $$2, duv $$3) {
         Set<UUID> $$4 = $$3.d();
         if (!$$4.isEmpty()) {
            ezn $$5 = a($$1, $$2.c(dqz.c));

            for (UUID $$6 : $$4) {
               com $$7 = $$0.b($$6);
               if ($$7 != null && a($$1, $$3, $$7)) {
                  a($$0, $$5, $$7);
               }
            }
         }
      }

      private static boolean a(jh $$0, duv $$1, com $$2) {
         return $$2.dx().j($$0) <= azk.k($$1.e());
      }

      private static void a(dfb $$0, jh $$1, duv $$2) {
         if (a($$2)) {
            azs $$3 = $$0.E_();
            if ($$3.i() <= 0.02F) {
               $$0.a($$1, awl.AF, awm.e, $$3.i() * 0.25F + 0.75F, $$3.i() + 0.5F, false);
            }
         }
      }

      public static boolean a(duv $$0) {
         return $$0.b();
      }

      private static ezn a(jh $$0, azs $$1) {
         return ezn.a($$0).b(azk.a($$1, 0.4, 0.6), azk.a($$1, 0.4, 0.6), azk.a($$1, 0.4, 0.6));
      }

      private static ezn b(jh $$0, azs $$1) {
         return ezn.a($$0).b(azk.a($$1, 0.1, 0.9), azk.a($$1, 0.25, 0.75), azk.a($$1, 0.1, 0.9));
      }

      private static ezn a(jh $$0, jm $$1) {
         return ezn.c($$0).b((double)$$1.j() * 0.5, 1.75, (double)$$1.l() * 0.5);
      }
   }

   public static final class b {
      private static final int a = 14;
      private static final int b = 20;
      private static final int c = 15;

      public static void a(arn $$0, jh $$1, dvj $$2, dut $$3, duu $$4, duv $$5) {
         duw $$6 = $$2.c(dqz.b);
         if (a($$0.aa(), $$6)) {
            a($$0, $$6, $$3, $$5, $$1);
         }

         dvj $$7 = $$2;
         if ($$0.aa() >= $$4.c()) {
            $$7 = $$2.b(dqz.b, $$6.a($$0, $$1, $$3, $$4, $$5));
            if (!$$2.equals($$7)) {
               a($$0, $$1, $$2, $$7, $$3, $$5);
            }
         }

         if ($$4.c || $$5.c) {
            dur.a($$0, $$1, $$2);
            if ($$5.c) {
               $$0.a($$1, $$2, $$7, 2);
            }

            $$4.c = false;
            $$5.c = false;
         }
      }

      public static void a(arn $$0, jh $$1, dvj $$2, dut $$3, duu $$4, duv $$5, com $$6, cwb $$7) {
         duw $$8 = $$2.c(dqz.b);
         if (a($$3, $$8)) {
            if (!a($$3, $$7)) {
               a($$0, $$4, $$1, awl.AO);
            } else if ($$4.a($$6)) {
               a($$0, $$4, $$1, awl.AK);
            } else {
               List<cwb> $$9 = a($$0, $$3, $$1, $$6, $$7);
               if (!$$9.isEmpty()) {
                  $$6.b(awv.c.b($$7.h()));
                  $$7.a($$3.e().L(), (bva)$$6);
                  a($$0, $$2, $$1, $$3, $$4, $$5, $$9);
                  $$4.b($$6);
                  $$5.a($$0, $$1, $$4, $$3, $$3.d());
               }
            }
         }
      }

      static void a(arn $$0, jh $$1, dvj $$2, dvj $$3, dut $$4, duv $$5) {
         duw $$6 = $$2.c(dqz.b);
         duw $$7 = $$3.c(dqz.b);
         $$0.a($$1, $$3, 3);
         $$6.a($$0, $$1, $$7, $$4, $$5, $$3.c(dqz.d));
      }

      static void a(arn $$0, duw $$1, dut $$2, duv $$3, jh $$4) {
         if (!a($$2, $$1)) {
            $$3.a(cwb.k);
         } else {
            cwb $$5 = a($$0, $$4, $$2.f().orElse($$2.b()));
            $$3.a($$5);
         }
      }

      private static cwb a(arn $$0, jh $$1, alh<euh> $$2) {
         euh $$3 = $$0.o().bc().b($$2);
         euf $$4 = new euf.a($$0).a(ewy.f, ezn.b($$1)).a(ewx.l);
         List<cwb> $$5 = $$3.a($$4, $$0.E_());
         return $$5.isEmpty() ? cwb.k : ae.a($$5, $$0.E_());
      }

      private static void a(arn $$0, dvj $$1, jh $$2, dut $$3, duu $$4, duv $$5, List<cwb> $$6) {
         $$4.a($$6);
         $$5.a($$4.f());
         $$4.b($$0.aa() + 14L);
         a($$0, $$2, $$1, $$1.b(dqz.b, duw.c), $$3, $$5);
      }

      private static List<cwb> a(arn $$0, dut $$1, jh $$2, com $$3, cwb $$4) {
         euh $$5 = $$0.o().bc().b($$1.b());
         euf $$6 = new euf.a($$0).a(ewy.f, ezn.b($$2)).a($$3.gG()).a(ewy.a, $$3).a(ewy.i, $$4).a(ewx.l);
         return $$5.a($$6);
      }

      private static boolean a(dut $$0, duw $$1) {
         return !$$0.e().f() && $$1 != duw.a;
      }

      private static boolean a(dut $$0, cwb $$1) {
         return cwb.c($$1, $$0.e()) && $$1.L() >= $$0.e().L();
      }

      private static boolean a(long $$0, duw $$1) {
         return $$0 % 20L == 0L && $$1 == duw.b;
      }

      private static void a(arn $$0, duu $$1, jh $$2, awk $$3) {
         if ($$0.aa() >= $$1.a() + 15L) {
            $$0.a(null, $$2, $$3, awm.e);
            $$1.a($$0.aa());
         }
      }
   }
}
