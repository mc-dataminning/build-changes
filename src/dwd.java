import com.google.common.annotations.VisibleForTesting;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DynamicOps;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dwd extends dtx {
   private static final Logger a = LogUtils.getLogger();
   private final dwg b = new dwg();
   private final dwh c = new dwh();
   private final dwe d = new dwe();
   private dwf e = dwf.b;

   public dwd(ji $$0, dwv $$1) {
      super(dtz.S, $$0, $$1);
   }

   @Nullable
   @Override
   public yv<abk> ax_() {
      return abr.a(this);
   }

   @Override
   public tq a(jt.a $$0) {
      return af.a(new tq(), $$1 -> $$1.a("shared_data", a(dwh.b, this.c, $$0)));
   }

   @Override
   protected void b(tq $$0, jt.a $$1) {
      super.b($$0, $$1);
      $$0.a("config", a(dwf.c, this.e, $$1));
      $$0.a("shared_data", a(dwh.b, this.c, $$1));
      $$0.a("server_data", a(dwg.b, this.b, $$1));
   }

   private static <T> un a(Codec<T> $$0, T $$1, jt.a $$2) {
      return (un)$$0.encodeStart($$2.a(ue.a), $$1).getOrThrow();
   }

   @Override
   protected void a(tq $$0, jt.a $$1) {
      super.a($$0, $$1);
      DynamicOps<un> $$2 = $$1.a(ue.a);
      if ($$0.e("server_data")) {
         dwg.b.parse($$2, $$0.c("server_data")).resultOrPartial(a::error).ifPresent(this.b::a);
      }

      if ($$0.e("config")) {
         dwf.c.parse($$2, $$0.c("config")).resultOrPartial(a::error).ifPresent($$0x -> this.e = $$0x);
      }

      if ($$0.e("shared_data")) {
         dwh.b.parse($$2, $$0.c("shared_data")).resultOrPartial(a::error).ifPresent(this.c::a);
      }
   }

   @Nullable
   public dwg b() {
      return this.o != null && !this.o.C ? this.b : null;
   }

   public dwh c() {
      return this.c;
   }

   public dwe d() {
      return this.d;
   }

   public dwf f() {
      return this.e;
   }

   @VisibleForTesting
   public void a(dwf $$0) {
      this.e = $$0;
   }

   public static final class a {
      private static final int a = 20;
      private static final float b = 0.5F;
      private static final float c = 0.02F;
      private static final int d = 20;
      private static final int e = 20;

      public static void a(dgg $$0, ji $$1, dwv $$2, dwe $$3, dwh $$4) {
         $$3.c();
         if ($$0.ad() % 20L == 0L) {
            a($$0, $$1, $$2, $$4);
         }

         a($$0, $$1, $$4, $$2.c(dsk.d) ? lt.M : lt.aL);
         a($$0, $$1, $$4);
      }

      public static void a(dgg $$0, ji $$1, dwv $$2, dwh $$3, lr $$4) {
         a($$0, $$1, $$2, $$3);
         azg $$5 = $$0.A;

         for (int $$6 = 0; $$6 < 20; $$6++) {
            fay $$7 = b($$1, $$5);
            $$0.a(lt.ag, $$7.a(), $$7.b(), $$7.c(), 0.0, 0.0, 0.0);
            $$0.a($$4, $$7.a(), $$7.b(), $$7.c(), 0.0, 0.0, 0.0);
         }
      }

      public static void a(dgg $$0, ji $$1, lr $$2) {
         azg $$3 = $$0.A;

         for (int $$4 = 0; $$4 < 20; $$4++) {
            fay $$5 = a($$1, $$3);
            fay $$6 = new fay($$3.k() * 0.02, $$3.k() * 0.02, $$3.k() * 0.02);
            $$0.a($$2, $$5.a(), $$5.b(), $$5.c(), $$6.a(), $$6.b(), $$6.c());
         }
      }

      private static void a(dgg $$0, ji $$1, dwh $$2, lr $$3) {
         azg $$4 = $$0.H_();
         if ($$4.i() <= 0.5F) {
            fay $$5 = b($$1, $$4);
            $$0.a(lt.ag, $$5.a(), $$5.b(), $$5.c(), 0.0, 0.0, 0.0);
            if (a($$2)) {
               $$0.a($$3, $$5.a(), $$5.b(), $$5.c(), 0.0, 0.0, 0.0);
            }
         }
      }

      private static void a(dgg $$0, fay $$1, cov $$2) {
         azg $$3 = $$0.A;
         fay $$4 = $$1.a($$2.du().b(0.0, (double)($$2.ds() / 2.0F), 0.0));
         int $$5 = ayy.a($$3, 2, 5);

         for (int $$6 = 0; $$6 < $$5; $$6++) {
            fay $$7 = $$4.a($$3, 1.0F);
            $$0.a(lt.bc, $$1.a(), $$1.b(), $$1.c(), $$7.a(), $$7.b(), $$7.c());
         }
      }

      private static void a(dgg $$0, ji $$1, dwv $$2, dwh $$3) {
         Set<UUID> $$4 = $$3.d();
         if (!$$4.isEmpty()) {
            fay $$5 = a($$1, $$2.c(dsk.c));

            for (UUID $$6 : $$4) {
               cov $$7 = $$0.b($$6);
               if ($$7 != null && a($$1, $$3, $$7)) {
                  a($$0, $$5, $$7);
               }
            }
         }
      }

      private static boolean a(ji $$0, dwh $$1, cov $$2) {
         return $$2.dw().j($$0) <= ayy.k($$1.e());
      }

      private static void a(dgg $$0, ji $$1, dwh $$2) {
         if (a($$2)) {
            azg $$3 = $$0.H_();
            if ($$3.i() <= 0.02F) {
               $$0.a($$1, avz.Bp, awa.e, $$3.i() * 0.25F + 0.75F, $$3.i() + 0.5F, false);
            }
         }
      }

      public static boolean a(dwh $$0) {
         return $$0.b();
      }

      private static fay a(ji $$0, azg $$1) {
         return fay.a($$0).b(ayy.a($$1, 0.4, 0.6), ayy.a($$1, 0.4, 0.6), ayy.a($$1, 0.4, 0.6));
      }

      private static fay b(ji $$0, azg $$1) {
         return fay.a($$0).b(ayy.a($$1, 0.1, 0.9), ayy.a($$1, 0.25, 0.75), ayy.a($$1, 0.1, 0.9));
      }

      private static fay a(ji $$0, jn $$1) {
         return fay.c($$0).b((double)$$1.j() * 0.5, 1.75, (double)$$1.l() * 0.5);
      }
   }

   public static final class b {
      private static final int a = 14;
      private static final int b = 20;
      private static final int c = 15;

      public static void a(arc $$0, ji $$1, dwv $$2, dwf $$3, dwg $$4, dwh $$5) {
         dwi $$6 = $$2.c(dsk.b);
         if (a($$0.ad(), $$6)) {
            a($$0, $$6, $$3, $$5, $$1);
         }

         dwv $$7 = $$2;
         if ($$0.ad() >= $$4.c()) {
            $$7 = $$2.b(dsk.b, $$6.a($$0, $$1, $$3, $$4, $$5));
            if (!$$2.equals($$7)) {
               a($$0, $$1, $$2, $$7, $$3, $$5);
            }
         }

         if ($$4.c || $$5.c) {
            dwd.a($$0, $$1, $$2);
            if ($$5.c) {
               $$0.a($$1, $$2, $$7, 2);
            }

            $$4.c = false;
            $$5.c = false;
         }
      }

      public static void a(arc $$0, ji $$1, dwv $$2, dwf $$3, dwg $$4, dwh $$5, cov $$6, cwn $$7) {
         dwi $$8 = $$2.c(dsk.b);
         if (a($$3, $$8)) {
            if (!a($$3, $$7)) {
               a($$0, $$4, $$1, avz.By);
            } else if ($$4.a($$6)) {
               a($$0, $$4, $$1, avz.Bu);
            } else {
               List<cwn> $$9 = a($$0, $$3, $$1, $$6, $$7);
               if (!$$9.isEmpty()) {
                  $$6.b(awj.c.b($$7.h()));
                  $$7.a($$3.e().M(), (bvf)$$6);
                  a($$0, $$2, $$1, $$3, $$4, $$5, $$9);
                  $$4.b($$6);
                  $$5.a($$0, $$1, $$4, $$3, $$3.d());
               }
            }
         }
      }

      static void a(arc $$0, ji $$1, dwv $$2, dwv $$3, dwf $$4, dwh $$5) {
         dwi $$6 = $$2.c(dsk.b);
         dwi $$7 = $$3.c(dsk.b);
         $$0.a($$1, $$3, 3);
         $$6.a($$0, $$1, $$7, $$4, $$5, $$3.c(dsk.d));
      }

      static void a(arc $$0, dwi $$1, dwf $$2, dwh $$3, ji $$4) {
         if (!a($$2, $$1)) {
            $$3.a(cwn.j);
         } else {
            cwn $$5 = a($$0, $$4, $$2.f().orElse($$2.b()));
            $$3.a($$5);
         }
      }

      private static cwn a(arc $$0, ji $$1, akt<evu> $$2) {
         evu $$3 = $$0.p().bc().b($$2);
         evs $$4 = new evs.a($$0).a(eyj.f, fay.b($$1)).a(eyi.l);
         List<cwn> $$5 = $$3.a($$4, $$0.H_());
         return $$5.isEmpty() ? cwn.j : af.a($$5, $$0.H_());
      }

      private static void a(arc $$0, dwv $$1, ji $$2, dwf $$3, dwg $$4, dwh $$5, List<cwn> $$6) {
         $$4.a($$6);
         $$5.a($$4.f());
         $$4.b($$0.ad() + 14L);
         a($$0, $$2, $$1, $$1.b(dsk.b, dwi.c), $$3, $$5);
      }

      private static List<cwn> a(arc $$0, dwf $$1, ji $$2, cov $$3, cwn $$4) {
         evu $$5 = $$0.p().bc().b($$1.b());
         evs $$6 = new evs.a($$0).a(eyj.f, fay.b($$2)).a($$3.gF()).a(eyj.a, $$3).a(eyj.i, $$4).a(eyi.l);
         return $$5.a($$6);
      }

      private static boolean a(dwf $$0, dwi $$1) {
         return !$$0.e().f() && $$1 != dwi.a;
      }

      private static boolean a(dwf $$0, cwn $$1) {
         return cwn.c($$1, $$0.e()) && $$1.M() >= $$0.e().M();
      }

      private static boolean a(long $$0, dwi $$1) {
         return $$0 % 20L == 0L && $$1 == dwi.b;
      }

      private static void a(arc $$0, dwg $$1, ji $$2, avy $$3) {
         if ($$0.ad() >= $$1.a() + 15L) {
            $$0.a(null, $$2, $$3, awa.e);
            $$1.a($$0.ad());
         }
      }
   }
}
