import com.google.common.annotations.VisibleForTesting;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dmj extends dki {
   private static final Logger a = LogUtils.getLogger();
   private final dmm b = new dmm();
   private final dmn c = new dmn();
   private final dmk d = new dmk();
   private dml e = dml.b;

   public dmj(ib $$0, dnb $$1) {
      super(dkk.R, $$0, $$1);
   }

   @Nullable
   @Override
   public yb<aam> ay_() {
      return aat.a(this);
   }

   @Override
   public ta a(in.a $$0) {
      return ac.a(new ta(), $$0x -> $$0x.a("shared_data", a(dmn.b, this.c)));
   }

   @Override
   protected void b(ta $$0, in.a $$1) {
      super.b($$0, $$1);
      $$0.a("config", a(dml.c, this.e));
      $$0.a("shared_data", a(dmn.b, this.c));
      $$0.a("server_data", a(dmm.b, this.b));
   }

   private static <T> tx a(Codec<T> $$0, T $$1) {
      return ac.a($$0.encodeStart(to.a, $$1), IllegalStateException::new);
   }

   @Override
   public void a(ta $$0, in.a $$1) {
      super.a($$0, $$1);
      if ($$0.e("server_data")) {
         dmm.b.parse(to.a, $$0.c("server_data")).resultOrPartial(a::error).ifPresent(this.b::a);
      }

      if ($$0.e("config")) {
         dml.c.parse(to.a, $$0.c("config")).resultOrPartial(a::error).ifPresent($$0x -> this.e = $$0x);
      }

      if ($$0.e("shared_data")) {
         dmn.b.parse(to.a, $$0.c("shared_data")).resultOrPartial(a::error).ifPresent(this.c::a);
      }
   }

   @Nullable
   public dmm b() {
      return this.o != null && !this.o.B ? this.b : null;
   }

   public dmn c() {
      return this.c;
   }

   public dmk d() {
      return this.d;
   }

   public dml f() {
      return this.e;
   }

   @VisibleForTesting
   public void a(dml $$0) {
      this.e = $$0;
   }

   public static final class a {
      private static final int a = 20;
      private static final float b = 0.5F;
      private static final float c = 0.02F;
      private static final int d = 20;
      private static final int e = 20;

      public static void a(cxb $$0, ib $$1, dnb $$2, dmk $$3, dmn $$4) {
         $$3.c();
         if ($$0.X() % 20L == 0L) {
            b($$0, $$1, $$2, $$4);
         }

         a($$0, $$1, $$4);
         b($$0, $$1, $$4);
      }

      public static void a(cxb $$0, ib $$1, dnb $$2, dmn $$3) {
         b($$0, $$1, $$2, $$3);
         axd $$4 = $$0.z;

         for (int $$5 = 0; $$5 < 20; $$5++) {
            ept $$6 = b($$1, $$4);
            $$0.a(kc.ac, $$6.a(), $$6.b(), $$6.c(), 0.0, 0.0, 0.0);
            $$0.a(kc.aH, $$6.a(), $$6.b(), $$6.c(), 0.0, 0.0, 0.0);
         }
      }

      public static void a(cxb $$0, ib $$1) {
         axd $$2 = $$0.z;

         for (int $$3 = 0; $$3 < 20; $$3++) {
            ept $$4 = a($$1, $$2);
            ept $$5 = new ept($$2.k() * 0.02, $$2.k() * 0.02, $$2.k() * 0.02);
            $$0.a(kc.aH, $$4.a(), $$4.b(), $$4.c(), $$5.a(), $$5.b(), $$5.c());
         }
      }

      private static void a(cxb $$0, ib $$1, dmn $$2) {
         axd $$3 = $$0.E_();
         if ($$3.i() <= 0.5F) {
            ept $$4 = b($$1, $$3);
            $$0.a(kc.ac, $$4.a(), $$4.b(), $$4.c(), 0.0, 0.0, 0.0);
            if (a($$2)) {
               $$0.a(kc.aH, $$4.a(), $$4.b(), $$4.c(), 0.0, 0.0, 0.0);
            }
         }
      }

      private static void a(cxb $$0, ept $$1, ciu $$2) {
         axd $$3 = $$0.z;
         ept $$4 = $$1.a($$2.dk().b(0.0, (double)($$2.dh() / 2.0F), 0.0));
         int $$5 = aww.a($$3, 2, 5);

         for (int $$6 = 0; $$6 < $$5; $$6++) {
            ept $$7 = $$4.a($$3, 1.0F);
            $$0.a(kc.aX, $$1.a(), $$1.b(), $$1.c(), $$7.a(), $$7.b(), $$7.c());
         }
      }

      private static void b(cxb $$0, ib $$1, dnb $$2, dmn $$3) {
         Set<UUID> $$4 = $$3.d();
         if (!$$4.isEmpty()) {
            ept $$5 = a($$1, $$2.c(diw.c));

            for (UUID $$6 : $$4) {
               ciu $$7 = $$0.b($$6);
               if ($$7 != null && a($$1, $$3, $$7)) {
                  a($$0, $$5, $$7);
               }
            }
         }
      }

      private static boolean a(ib $$0, dmn $$1, ciu $$2) {
         return $$2.dm().j($$0) <= aww.k($$1.e());
      }

      private static void b(cxb $$0, ib $$1, dmn $$2) {
         if (a($$2)) {
            axd $$3 = $$0.E_();
            if ($$3.i() <= 0.02F) {
               $$0.a($$1, aty.Ac, atz.e, $$3.i() * 0.25F + 0.75F, $$3.i() + 0.5F, false);
            }
         }
      }

      public static boolean a(dmn $$0) {
         return $$0.b();
      }

      private static ept a(ib $$0, axd $$1) {
         return ept.a($$0).b(aww.a($$1, 0.4, 0.6), aww.a($$1, 0.4, 0.6), aww.a($$1, 0.4, 0.6));
      }

      private static ept b(ib $$0, axd $$1) {
         return ept.a($$0).b(aww.a($$1, 0.1, 0.9), aww.a($$1, 0.25, 0.75), aww.a($$1, 0.1, 0.9));
      }

      private static ept a(ib $$0, ih $$1) {
         return ept.c($$0).b((double)$$1.j() * 0.5, 1.75, (double)$$1.l() * 0.5);
      }
   }

   public static final class b {
      private static final int a = 14;
      private static final int b = 20;
      private static final int c = 15;

      public static void a(apf $$0, ib $$1, dnb $$2, dml $$3, dmm $$4, dmn $$5) {
         dmo $$6 = $$2.c(diw.b);
         if (a($$0.X(), $$6)) {
            a($$0, $$6, $$3, $$5, $$1);
         }

         dnb $$7 = $$2;
         if ($$0.X() >= $$4.c()) {
            $$7 = $$2.a(diw.b, $$6.a($$0, $$1, $$3, $$4, $$5));
            if (!$$2.equals($$7)) {
               a($$0, $$1, $$2, $$7, $$3, $$5);
            }
         }

         if ($$4.c || $$5.c) {
            dmj.a($$0, $$1, $$2);
            if ($$5.c) {
               $$0.a($$1, $$2, $$7, 2);
            }

            $$4.c = false;
            $$5.c = false;
         }
      }

      public static void a(apf $$0, ib $$1, dnb $$2, dml $$3, dmm $$4, dmn $$5, ciu $$6, cqm $$7) {
         dmo $$8 = $$2.c(diw.b);
         if (a($$3, $$8)) {
            if (!a($$3, $$7)) {
               a($$0, $$4, $$1);
            } else if ($$4.a($$6)) {
               a($$0, $$4, $$1);
            } else {
               List<cqm> $$9 = a($$0, $$3, $$1, $$6);
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

      static void a(apf $$0, ib $$1, dnb $$2, dnb $$3, dml $$4, dmn $$5) {
         dmo $$6 = $$2.c(diw.b);
         dmo $$7 = $$3.c(diw.b);
         $$0.a($$1, $$3, 3);
         $$6.a($$0, $$1, $$7, $$4, $$5);
      }

      static void a(apf $$0, dmo $$1, dml $$2, dmn $$3, ib $$4) {
         if (!a($$2, $$1)) {
            $$3.a(cqm.h);
         } else {
            cqm $$5 = a($$0, $$4, $$2.f().orElse($$2.b()));
            $$3.a($$5);
         }
      }

      private static cqm a(apf $$0, ib $$1, ajh $$2) {
         ele $$3 = $$0.o().aM().getLootTable($$2);
         elc $$4 = new elc.a($$0).a(enh.f, ept.b($$1)).a(eng.k);
         List<cqm> $$5 = $$3.a($$4);
         return $$5.isEmpty() ? cqm.h : ac.a($$5, $$0.E_());
      }

      private static void a(apf $$0, dnb $$1, ib $$2, dml $$3, dmm $$4, dmn $$5, List<cqm> $$6) {
         $$4.a($$6);
         $$5.a($$4.f());
         $$4.b($$0.X() + 14L);
         a($$0, $$2, $$1, $$1.a(diw.b, dmo.c), $$3, $$5);
      }

      private static List<cqm> a(apf $$0, dml $$1, ib $$2, ciu $$3) {
         ele $$4 = $$0.o().aM().getLootTable($$1.b());
         elc $$5 = new elc.a($$0).a(enh.f, ept.b($$2)).a($$3.gv()).a(enh.a, $$3).a(eng.k);
         return $$4.a($$5);
      }

      private static boolean a(dml $$0, dmo $$1) {
         return !$$0.b().equals(eku.a) && !$$0.e().b() && $$1 != dmo.a;
      }

      private static boolean a(dml $$0, cqm $$1) {
         return cqm.c($$1, $$0.e()) && $$1.M() >= $$0.e().M();
      }

      private static boolean a(long $$0, dmo $$1) {
         return $$0 % 20L == 0L && $$1 == dmo.b;
      }

      private static void a(apf $$0, dmm $$1, ib $$2) {
         if ($$0.X() >= $$1.a() + 15L) {
            $$0.a(null, $$2, aty.Ak, atz.e);
            $$1.a($$0.X());
         }
      }
   }
}
