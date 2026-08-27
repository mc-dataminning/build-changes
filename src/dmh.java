import com.google.common.annotations.VisibleForTesting;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dmh extends dkg {
   private static final Logger a = LogUtils.getLogger();
   private final dmk b = new dmk();
   private final dml c = new dml();
   private final dmi d = new dmi();
   private dmj e = dmj.b;

   public dmh(ib $$0, dmz $$1) {
      super(dki.R, $$0, $$1);
   }

   @Nullable
   @Override
   public yb<aam> ay_() {
      return aat.a(this);
   }

   @Override
   public ta a(in.a $$0) {
      return ac.a(new ta(), $$0x -> $$0x.a("shared_data", a(dml.b, this.c)));
   }

   @Override
   protected void b(ta $$0, in.a $$1) {
      super.b($$0, $$1);
      $$0.a("config", a(dmj.c, this.e));
      $$0.a("shared_data", a(dml.b, this.c));
      $$0.a("server_data", a(dmk.b, this.b));
   }

   private static <T> tx a(Codec<T> $$0, T $$1) {
      return ac.a($$0.encodeStart(to.a, $$1), IllegalStateException::new);
   }

   @Override
   public void a(ta $$0, in.a $$1) {
      super.a($$0, $$1);
      if ($$0.e("server_data")) {
         dmk.b.parse(to.a, $$0.c("server_data")).resultOrPartial(a::error).ifPresent(this.b::a);
      }

      if ($$0.e("config")) {
         dmj.c.parse(to.a, $$0.c("config")).resultOrPartial(a::error).ifPresent($$0x -> this.e = $$0x);
      }

      if ($$0.e("shared_data")) {
         dml.b.parse(to.a, $$0.c("shared_data")).resultOrPartial(a::error).ifPresent(this.c::a);
      }
   }

   @Nullable
   public dmk b() {
      return this.o != null && !this.o.B ? this.b : null;
   }

   public dml c() {
      return this.c;
   }

   public dmi d() {
      return this.d;
   }

   public dmj f() {
      return this.e;
   }

   @VisibleForTesting
   public void a(dmj $$0) {
      this.e = $$0;
   }

   public static final class a {
      private static final int a = 20;
      private static final float b = 0.5F;
      private static final float c = 0.02F;
      private static final int d = 20;
      private static final int e = 20;

      public static void a(cwz $$0, ib $$1, dmz $$2, dmi $$3, dml $$4) {
         $$3.c();
         if ($$0.X() % 20L == 0L) {
            b($$0, $$1, $$2, $$4);
         }

         a($$0, $$1, $$4);
         b($$0, $$1, $$4);
      }

      public static void a(cwz $$0, ib $$1, dmz $$2, dml $$3) {
         b($$0, $$1, $$2, $$3);
         axd $$4 = $$0.z;

         for (int $$5 = 0; $$5 < 20; $$5++) {
            epr $$6 = b($$1, $$4);
            $$0.a(kc.ac, $$6.a(), $$6.b(), $$6.c(), 0.0, 0.0, 0.0);
            $$0.a(kc.aH, $$6.a(), $$6.b(), $$6.c(), 0.0, 0.0, 0.0);
         }
      }

      public static void a(cwz $$0, ib $$1) {
         axd $$2 = $$0.z;

         for (int $$3 = 0; $$3 < 20; $$3++) {
            epr $$4 = a($$1, $$2);
            epr $$5 = new epr($$2.k() * 0.02, $$2.k() * 0.02, $$2.k() * 0.02);
            $$0.a(kc.aH, $$4.a(), $$4.b(), $$4.c(), $$5.a(), $$5.b(), $$5.c());
         }
      }

      private static void a(cwz $$0, ib $$1, dml $$2) {
         axd $$3 = $$0.E_();
         if ($$3.i() <= 0.5F) {
            epr $$4 = b($$1, $$3);
            $$0.a(kc.ac, $$4.a(), $$4.b(), $$4.c(), 0.0, 0.0, 0.0);
            if (a($$2)) {
               $$0.a(kc.aH, $$4.a(), $$4.b(), $$4.c(), 0.0, 0.0, 0.0);
            }
         }
      }

      private static void a(cwz $$0, epr $$1, cis $$2) {
         axd $$3 = $$0.z;
         epr $$4 = $$1.a($$2.dk().b(0.0, (double)($$2.dh() / 2.0F), 0.0));
         int $$5 = aww.a($$3, 2, 5);

         for (int $$6 = 0; $$6 < $$5; $$6++) {
            epr $$7 = $$4.a($$3, 1.0F);
            $$0.a(kc.aX, $$1.a(), $$1.b(), $$1.c(), $$7.a(), $$7.b(), $$7.c());
         }
      }

      private static void b(cwz $$0, ib $$1, dmz $$2, dml $$3) {
         Set<UUID> $$4 = $$3.d();
         if (!$$4.isEmpty()) {
            epr $$5 = a($$1, $$2.c(diu.c));

            for (UUID $$6 : $$4) {
               cis $$7 = $$0.b($$6);
               if ($$7 != null && a($$1, $$3, $$7)) {
                  a($$0, $$5, $$7);
               }
            }
         }
      }

      private static boolean a(ib $$0, dml $$1, cis $$2) {
         return $$2.dm().j($$0) <= aww.k($$1.e());
      }

      private static void b(cwz $$0, ib $$1, dml $$2) {
         if (a($$2)) {
            axd $$3 = $$0.E_();
            if ($$3.i() <= 0.02F) {
               $$0.a($$1, aty.zX, atz.e, $$3.i() * 0.25F + 0.75F, $$3.i() + 0.5F, false);
            }
         }
      }

      public static boolean a(dml $$0) {
         return $$0.b();
      }

      private static epr a(ib $$0, axd $$1) {
         return epr.a($$0).b(aww.a($$1, 0.4, 0.6), aww.a($$1, 0.4, 0.6), aww.a($$1, 0.4, 0.6));
      }

      private static epr b(ib $$0, axd $$1) {
         return epr.a($$0).b(aww.a($$1, 0.1, 0.9), aww.a($$1, 0.25, 0.75), aww.a($$1, 0.1, 0.9));
      }

      private static epr a(ib $$0, ih $$1) {
         return epr.c($$0).b((double)$$1.j() * 0.5, 1.75, (double)$$1.l() * 0.5);
      }
   }

   public static final class b {
      private static final int a = 14;
      private static final int b = 20;
      private static final int c = 15;

      public static void a(apf $$0, ib $$1, dmz $$2, dmj $$3, dmk $$4, dml $$5) {
         dmm $$6 = $$2.c(diu.b);
         if (a($$0.X(), $$6)) {
            a($$0, $$6, $$3, $$5, $$1);
         }

         dmz $$7 = $$2;
         if ($$0.X() >= $$4.c()) {
            $$7 = $$2.a(diu.b, $$6.a($$0, $$1, $$3, $$4, $$5));
            if (!$$2.equals($$7)) {
               a($$0, $$1, $$2, $$7, $$3, $$5);
            }
         }

         if ($$4.c || $$5.c) {
            dmh.a($$0, $$1, $$2);
            if ($$5.c) {
               $$0.a($$1, $$2, $$7, 2);
            }

            $$4.c = false;
            $$5.c = false;
         }
      }

      public static void a(apf $$0, ib $$1, dmz $$2, dmj $$3, dmk $$4, dml $$5, cis $$6, cqk $$7) {
         dmm $$8 = $$2.c(diu.b);
         if (a($$3, $$8)) {
            if (!a($$3, $$7)) {
               a($$0, $$4, $$1);
            } else if ($$4.a($$6)) {
               a($$0, $$4, $$1);
            } else {
               List<cqk> $$9 = a($$0, $$3, $$1, $$6);
               if (!$$9.isEmpty()) {
                  $$6.b(aui.c.b($$7.d()));
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

      static void a(apf $$0, ib $$1, dmz $$2, dmz $$3, dmj $$4, dml $$5) {
         dmm $$6 = $$2.c(diu.b);
         dmm $$7 = $$3.c(diu.b);
         $$0.a($$1, $$3, 3);
         $$6.a($$0, $$1, $$7, $$4, $$5);
      }

      static void a(apf $$0, dmm $$1, dmj $$2, dml $$3, ib $$4) {
         if (!a($$2, $$1)) {
            $$3.a(cqk.h);
         } else {
            cqk $$5 = a($$0, $$4, $$2.f().orElse($$2.b()));
            $$3.a($$5);
         }
      }

      private static cqk a(apf $$0, ib $$1, ajh $$2) {
         elc $$3 = $$0.o().aM().getLootTable($$2);
         ela $$4 = new ela.a($$0).a(enf.f, epr.b($$1)).a(ene.k);
         List<cqk> $$5 = $$3.a($$4);
         return $$5.isEmpty() ? cqk.h : ac.a($$5, $$0.E_());
      }

      private static void a(apf $$0, dmz $$1, ib $$2, dmj $$3, dmk $$4, dml $$5, List<cqk> $$6) {
         $$4.a($$6);
         $$5.a($$4.f());
         $$4.b($$0.X() + 14L);
         a($$0, $$2, $$1, $$1.a(diu.b, dmm.c), $$3, $$5);
      }

      private static List<cqk> a(apf $$0, dmj $$1, ib $$2, cis $$3) {
         elc $$4 = $$0.o().aM().getLootTable($$1.b());
         ela $$5 = new ela.a($$0).a(enf.f, epr.b($$2)).a($$3.gv()).a(enf.a, $$3).a(ene.k);
         return $$4.a($$5);
      }

      private static boolean a(dmj $$0, dmm $$1) {
         return !$$0.b().equals(eks.a) && !$$0.e().b() && $$1 != dmm.a;
      }

      private static boolean a(dmj $$0, cqk $$1) {
         return cqk.c($$1, $$0.e()) && $$1.M() >= $$0.e().M();
      }

      private static boolean a(long $$0, dmm $$1) {
         return $$0 % 20L == 0L && $$1 == dmm.b;
      }

      private static void a(apf $$0, dmk $$1, ib $$2) {
         if ($$0.X() >= $$1.a() + 15L) {
            $$0.a(null, $$2, aty.Af, atz.e);
            $$1.a($$0.X());
         }
      }
   }
}
