import com.google.common.annotations.VisibleForTesting;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DynamicOps;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dvd extends dsy {
   private static final Logger a = LogUtils.getLogger();
   private final dvg b = new dvg();
   private final dvh c = new dvh();
   private final dve d = new dve();
   private dvf e = dvf.b;

   public dvd(jh $$0, dvv $$1) {
      super(dta.R, $$0, $$1);
   }

   @Nullable
   @Override
   public zq<acf> ax_() {
      return acm.a(this);
   }

   @Override
   public ul a(js.a $$0) {
      return ae.a(new ul(), $$1 -> $$1.a("shared_data", a(dvh.b, this.c, $$0)));
   }

   @Override
   protected void b(ul $$0, js.a $$1) {
      super.b($$0, $$1);
      $$0.a("config", a(dvf.c, this.e, $$1));
      $$0.a("shared_data", a(dvh.b, this.c, $$1));
      $$0.a("server_data", a(dvg.b, this.b, $$1));
   }

   private static <T> vi a(Codec<T> $$0, T $$1, js.a $$2) {
      return (vi)$$0.encodeStart($$2.a(uz.a), $$1).getOrThrow();
   }

   @Override
   protected void a(ul $$0, js.a $$1) {
      super.a($$0, $$1);
      DynamicOps<vi> $$2 = $$1.a(uz.a);
      if ($$0.e("server_data")) {
         dvg.b.parse($$2, $$0.c("server_data")).resultOrPartial(a::error).ifPresent(this.b::a);
      }

      if ($$0.e("config")) {
         dvf.c.parse($$2, $$0.c("config")).resultOrPartial(a::error).ifPresent($$0x -> this.e = $$0x);
      }

      if ($$0.e("shared_data")) {
         dvh.b.parse($$2, $$0.c("shared_data")).resultOrPartial(a::error).ifPresent(this.c::a);
      }
   }

   @Nullable
   public dvg b() {
      return this.o != null && !this.o.C ? this.b : null;
   }

   public dvh c() {
      return this.c;
   }

   public dve d() {
      return this.d;
   }

   public dvf f() {
      return this.e;
   }

   @VisibleForTesting
   public void a(dvf $$0) {
      this.e = $$0;
   }

   public static final class a {
      private static final int a = 20;
      private static final float b = 0.5F;
      private static final float c = 0.02F;
      private static final int d = 20;
      private static final int e = 20;

      public static void a(dfm $$0, jh $$1, dvv $$2, dve $$3, dvh $$4) {
         $$3.c();
         if ($$0.ab() % 20L == 0L) {
            a($$0, $$1, $$2, $$4);
         }

         a($$0, $$1, $$4, $$2.c(drl.d) ? ls.L : ls.aJ);
         a($$0, $$1, $$4);
      }

      public static void a(dfm $$0, jh $$1, dvv $$2, dvh $$3, lq $$4) {
         a($$0, $$1, $$2, $$3);
         azu $$5 = $$0.A;

         for (int $$6 = 0; $$6 < 20; $$6++) {
            ezy $$7 = b($$1, $$5);
            $$0.a(ls.ae, $$7.a(), $$7.b(), $$7.c(), 0.0, 0.0, 0.0);
            $$0.a($$4, $$7.a(), $$7.b(), $$7.c(), 0.0, 0.0, 0.0);
         }
      }

      public static void a(dfm $$0, jh $$1, lq $$2) {
         azu $$3 = $$0.A;

         for (int $$4 = 0; $$4 < 20; $$4++) {
            ezy $$5 = a($$1, $$3);
            ezy $$6 = new ezy($$3.k() * 0.02, $$3.k() * 0.02, $$3.k() * 0.02);
            $$0.a($$2, $$5.a(), $$5.b(), $$5.c(), $$6.a(), $$6.b(), $$6.c());
         }
      }

      private static void a(dfm $$0, jh $$1, dvh $$2, lq $$3) {
         azu $$4 = $$0.G_();
         if ($$4.i() <= 0.5F) {
            ezy $$5 = b($$1, $$4);
            $$0.a(ls.ae, $$5.a(), $$5.b(), $$5.c(), 0.0, 0.0, 0.0);
            if (a($$2)) {
               $$0.a($$3, $$5.a(), $$5.b(), $$5.c(), 0.0, 0.0, 0.0);
            }
         }
      }

      private static void a(dfm $$0, ezy $$1, cou $$2) {
         azu $$3 = $$0.A;
         ezy $$4 = $$1.a($$2.dt().b(0.0, (double)($$2.dr() / 2.0F), 0.0));
         int $$5 = azm.a($$3, 2, 5);

         for (int $$6 = 0; $$6 < $$5; $$6++) {
            ezy $$7 = $$4.a($$3, 1.0F);
            $$0.a(ls.ba, $$1.a(), $$1.b(), $$1.c(), $$7.a(), $$7.b(), $$7.c());
         }
      }

      private static void a(dfm $$0, jh $$1, dvv $$2, dvh $$3) {
         Set<UUID> $$4 = $$3.d();
         if (!$$4.isEmpty()) {
            ezy $$5 = a($$1, $$2.c(drl.c));

            for (UUID $$6 : $$4) {
               cou $$7 = $$0.b($$6);
               if ($$7 != null && a($$1, $$3, $$7)) {
                  a($$0, $$5, $$7);
               }
            }
         }
      }

      private static boolean a(jh $$0, dvh $$1, cou $$2) {
         return $$2.dv().j($$0) <= azm.k($$1.e());
      }

      private static void a(dfm $$0, jh $$1, dvh $$2) {
         if (a($$2)) {
            azu $$3 = $$0.G_();
            if ($$3.i() <= 0.02F) {
               $$0.a($$1, awn.AF, awo.e, $$3.i() * 0.25F + 0.75F, $$3.i() + 0.5F, false);
            }
         }
      }

      public static boolean a(dvh $$0) {
         return $$0.b();
      }

      private static ezy a(jh $$0, azu $$1) {
         return ezy.a($$0).b(azm.a($$1, 0.4, 0.6), azm.a($$1, 0.4, 0.6), azm.a($$1, 0.4, 0.6));
      }

      private static ezy b(jh $$0, azu $$1) {
         return ezy.a($$0).b(azm.a($$1, 0.1, 0.9), azm.a($$1, 0.25, 0.75), azm.a($$1, 0.1, 0.9));
      }

      private static ezy a(jh $$0, jm $$1) {
         return ezy.c($$0).b((double)$$1.j() * 0.5, 1.75, (double)$$1.l() * 0.5);
      }
   }

   public static final class b {
      private static final int a = 14;
      private static final int b = 20;
      private static final int c = 15;

      public static void a(arp $$0, jh $$1, dvv $$2, dvf $$3, dvg $$4, dvh $$5) {
         dvi $$6 = $$2.c(drl.b);
         if (a($$0.ab(), $$6)) {
            a($$0, $$6, $$3, $$5, $$1);
         }

         dvv $$7 = $$2;
         if ($$0.ab() >= $$4.c()) {
            $$7 = $$2.b(drl.b, $$6.a($$0, $$1, $$3, $$4, $$5));
            if (!$$2.equals($$7)) {
               a($$0, $$1, $$2, $$7, $$3, $$5);
            }
         }

         if ($$4.c || $$5.c) {
            dvd.a($$0, $$1, $$2);
            if ($$5.c) {
               $$0.a($$1, $$2, $$7, 2);
            }

            $$4.c = false;
            $$5.c = false;
         }
      }

      public static void a(arp $$0, jh $$1, dvv $$2, dvf $$3, dvg $$4, dvh $$5, cou $$6, cwm $$7) {
         dvi $$8 = $$2.c(drl.b);
         if (a($$3, $$8)) {
            if (!a($$3, $$7)) {
               a($$0, $$4, $$1, awn.AO);
            } else if ($$4.a($$6)) {
               a($$0, $$4, $$1, awn.AK);
            } else {
               List<cwm> $$9 = a($$0, $$3, $$1, $$6, $$7);
               if (!$$9.isEmpty()) {
                  $$6.b(awx.c.b($$7.h()));
                  $$7.a($$3.e().L(), (bvh)$$6);
                  a($$0, $$2, $$1, $$3, $$4, $$5, $$9);
                  $$4.b($$6);
                  $$5.a($$0, $$1, $$4, $$3, $$3.d());
               }
            }
         }
      }

      static void a(arp $$0, jh $$1, dvv $$2, dvv $$3, dvf $$4, dvh $$5) {
         dvi $$6 = $$2.c(drl.b);
         dvi $$7 = $$3.c(drl.b);
         $$0.a($$1, $$3, 3);
         $$6.a($$0, $$1, $$7, $$4, $$5, $$3.c(drl.d));
      }

      static void a(arp $$0, dvi $$1, dvf $$2, dvh $$3, jh $$4) {
         if (!a($$2, $$1)) {
            $$3.a(cwm.k);
         } else {
            cwm $$5 = a($$0, $$4, $$2.f().orElse($$2.b()));
            $$3.a($$5);
         }
      }

      private static cwm a(arp $$0, jh $$1, ali<eus> $$2) {
         eus $$3 = $$0.p().bc().b($$2);
         euq $$4 = new euq.a($$0).a(exj.f, ezy.b($$1)).a(exi.l);
         List<cwm> $$5 = $$3.a($$4, $$0.G_());
         return $$5.isEmpty() ? cwm.k : ae.a($$5, $$0.G_());
      }

      private static void a(arp $$0, dvv $$1, jh $$2, dvf $$3, dvg $$4, dvh $$5, List<cwm> $$6) {
         $$4.a($$6);
         $$5.a($$4.f());
         $$4.b($$0.ab() + 14L);
         a($$0, $$2, $$1, $$1.b(drl.b, dvi.c), $$3, $$5);
      }

      private static List<cwm> a(arp $$0, dvf $$1, jh $$2, cou $$3, cwm $$4) {
         eus $$5 = $$0.p().bc().b($$1.b());
         euq $$6 = new euq.a($$0).a(exj.f, ezy.b($$2)).a($$3.gD()).a(exj.a, $$3).a(exj.i, $$4).a(exi.l);
         return $$5.a($$6);
      }

      private static boolean a(dvf $$0, dvi $$1) {
         return !$$0.e().f() && $$1 != dvi.a;
      }

      private static boolean a(dvf $$0, cwm $$1) {
         return cwm.c($$1, $$0.e()) && $$1.L() >= $$0.e().L();
      }

      private static boolean a(long $$0, dvi $$1) {
         return $$0 % 20L == 0L && $$1 == dvi.b;
      }

      private static void a(arp $$0, dvg $$1, jh $$2, awm $$3) {
         if ($$0.ab() >= $$1.a() + 15L) {
            $$0.a(null, $$2, $$3, awo.e);
            $$1.a($$0.ab());
         }
      }
   }
}
