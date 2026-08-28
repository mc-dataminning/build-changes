import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.DynamicOps;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nullable;

public class dzg extends dwx {
   private final dzj a = new dzj();
   private final dzk b = new dzk();
   private final dzh c = new dzh();
   private dzi d = dzi.b;

   public dzg(iu $$0, dzz $$1) {
      super(dwz.S, $$0, $$1);
   }

   @Nullable
   @Override
   public zf<abu> at_() {
      return aca.a(this);
   }

   @Override
   public tz a(jg.a $$0) {
      return af.a(new tz(), $$1 -> $$1.a("shared_data", dzk.b, $$0.a(un.a), this.b));
   }

   @Override
   protected void b(tz $$0, jg.a $$1) {
      super.b($$0, $$1);
      ale<uw> $$2 = $$1.a(un.a);
      $$0.a("config", dzi.c, $$2, this.d);
      $$0.a("shared_data", dzk.b, $$2, this.b);
      $$0.a("server_data", dzj.b, $$2, this.a);
   }

   @Override
   protected void a(tz $$0, jg.a $$1) {
      super.a($$0, $$1);
      DynamicOps<uw> $$2 = $$1.a(un.a);
      $$0.<dzj>a("server_data", dzj.b, $$2).ifPresent(this.a::a);
      this.d = $$0.<dzi>a("config", dzi.c, $$2).orElse(dzi.b);
      $$0.<dzk>a("shared_data", dzk.b, $$2).ifPresent(this.b::a);
   }

   @Nullable
   public dzj a() {
      return this.n != null && !this.n.C ? this.a : null;
   }

   public dzk c() {
      return this.b;
   }

   public dzh d() {
      return this.c;
   }

   public dzi f() {
      return this.d;
   }

   @VisibleForTesting
   public void a(dzi $$0) {
      this.d = $$0;
   }

   public static final class a {
      private static final int a = 20;
      private static final float b = 0.5F;
      private static final float c = 0.02F;
      private static final int d = 20;
      private static final int e = 20;

      public static void a(div $$0, iu $$1, dzz $$2, dzh $$3, dzk $$4) {
         $$3.c();
         if ($$0.ae() % 20L == 0L) {
            a($$0, $$1, $$2, $$4);
         }

         a($$0, $$1, $$4, $$2.c(dvi.d) ? lx.N : lx.aM);
         a($$0, $$1, $$4);
      }

      public static void a(div $$0, iu $$1, dzz $$2, dzk $$3, lv $$4) {
         a($$0, $$1, $$2, $$3);
         azv $$5 = $$0.A;

         for (int $$6 = 0; $$6 < 20; $$6++) {
            fei $$7 = b($$1, $$5);
            $$0.a(lx.ah, $$7.a(), $$7.b(), $$7.c(), 0.0, 0.0, 0.0);
            $$0.a($$4, $$7.a(), $$7.b(), $$7.c(), 0.0, 0.0, 0.0);
         }
      }

      public static void a(div $$0, iu $$1, lv $$2) {
         azv $$3 = $$0.A;

         for (int $$4 = 0; $$4 < 20; $$4++) {
            fei $$5 = a($$1, $$3);
            fei $$6 = new fei($$3.k() * 0.02, $$3.k() * 0.02, $$3.k() * 0.02);
            $$0.a($$2, $$5.a(), $$5.b(), $$5.c(), $$6.a(), $$6.b(), $$6.c());
         }
      }

      private static void a(div $$0, iu $$1, dzk $$2, lv $$3) {
         azv $$4 = $$0.C_();
         if ($$4.i() <= 0.5F) {
            fei $$5 = b($$1, $$4);
            $$0.a(lx.ah, $$5.a(), $$5.b(), $$5.c(), 0.0, 0.0, 0.0);
            if (a($$2)) {
               $$0.a($$3, $$5.a(), $$5.b(), $$5.c(), 0.0, 0.0, 0.0);
            }
         }
      }

      private static void a(div $$0, fei $$1, cqy $$2) {
         azv $$3 = $$0.A;
         fei $$4 = $$1.a($$2.dt().b(0.0, (double)($$2.dr() / 2.0F), 0.0));
         int $$5 = azm.a($$3, 2, 5);

         for (int $$6 = 0; $$6 < $$5; $$6++) {
            fei $$7 = $$4.a($$3, 1.0F);
            $$0.a(lx.bd, $$1.a(), $$1.b(), $$1.c(), $$7.a(), $$7.b(), $$7.c());
         }
      }

      private static void a(div $$0, iu $$1, dzz $$2, dzk $$3) {
         Set<UUID> $$4 = $$3.d();
         if (!$$4.isEmpty()) {
            fei $$5 = a($$1, $$2.c(dvi.c));

            for (UUID $$6 : $$4) {
               cqy $$7 = $$0.a($$6);
               if ($$7 != null && a($$1, $$3, $$7)) {
                  a($$0, $$5, $$7);
               }
            }
         }
      }

      private static boolean a(iu $$0, dzk $$1, cqy $$2) {
         return $$2.dv().j($$0) <= azm.k($$1.e());
      }

      private static void a(div $$0, iu $$1, dzk $$2) {
         if (a($$2)) {
            azv $$3 = $$0.C_();
            if ($$3.i() <= 0.02F) {
               $$0.a($$1, awn.BC, awo.e, $$3.i() * 0.25F + 0.75F, $$3.i() + 0.5F, false);
            }
         }
      }

      public static boolean a(dzk $$0) {
         return $$0.b();
      }

      private static fei a(iu $$0, azv $$1) {
         return fei.a($$0).b(azm.a($$1, 0.4, 0.6), azm.a($$1, 0.4, 0.6), azm.a($$1, 0.4, 0.6));
      }

      private static fei b(iu $$0, azv $$1) {
         return fei.a($$0).b(azm.a($$1, 0.1, 0.9), azm.a($$1, 0.25, 0.75), azm.a($$1, 0.1, 0.9));
      }

      private static fei a(iu $$0, ja $$1) {
         return fei.c($$0).b((double)$$1.j() * 0.5, 1.75, (double)$$1.l() * 0.5);
      }
   }

   public static final class b {
      private static final int a = 14;
      private static final int b = 20;
      private static final int c = 15;

      public static void a(arq $$0, iu $$1, dzz $$2, dzi $$3, dzj $$4, dzk $$5) {
         dzl $$6 = $$2.c(dvi.b);
         if (a($$0.ae(), $$6)) {
            a($$0, $$6, $$3, $$5, $$1);
         }

         dzz $$7 = $$2;
         if ($$0.ae() >= $$4.c()) {
            $$7 = $$2.b(dvi.b, $$6.a($$0, $$1, $$3, $$4, $$5));
            if ($$2 != $$7) {
               a($$0, $$1, $$2, $$7, $$3, $$5);
            }
         }

         if ($$4.c || $$5.c) {
            dzg.a($$0, $$1, $$2);
            if ($$5.c) {
               $$0.a($$1, $$2, $$7, 2);
            }

            $$4.c = false;
            $$5.c = false;
         }
      }

      public static void a(arq $$0, iu $$1, dzz $$2, dzi $$3, dzj $$4, dzk $$5, cqy $$6, cyy $$7) {
         dzl $$8 = $$2.c(dvi.b);
         if (a($$3, $$8)) {
            if (!a($$3, $$7)) {
               a($$0, $$4, $$1, awn.BL);
            } else if ($$4.a($$6)) {
               a($$0, $$4, $$1, awn.BH);
            } else {
               List<cyy> $$9 = a($$0, $$3, $$1, $$6, $$7);
               if (!$$9.isEmpty()) {
                  $$6.b(awx.c.b($$7.h()));
                  $$7.a($$3.e().M(), (bxc)$$6);
                  a($$0, $$2, $$1, $$3, $$4, $$5, $$9);
                  $$4.b($$6);
                  $$5.a($$0, $$1, $$4, $$3, $$3.d());
               }
            }
         }
      }

      static void a(arq $$0, iu $$1, dzz $$2, dzz $$3, dzi $$4, dzk $$5) {
         dzl $$6 = $$2.c(dvi.b);
         dzl $$7 = $$3.c(dvi.b);
         $$0.a($$1, $$3, 3);
         $$6.a($$0, $$1, $$7, $$4, $$5, $$3.c(dvi.d));
      }

      static void a(arq $$0, dzl $$1, dzi $$2, dzk $$3, iu $$4) {
         if (!a($$2, $$1)) {
            $$3.a(cyy.k);
         } else {
            cyy $$5 = a($$0, $$4, $$2.f().orElse($$2.b()));
            $$3.a($$5);
         }
      }

      private static cyy a(arq $$0, iu $$1, alf<eze> $$2) {
         eze $$3 = $$0.p().bc().b($$2);
         ezc $$4 = new ezc.a($$0).a(fbt.f, fei.b($$1)).a(fbs.l);
         List<cyy> $$5 = $$3.a($$4, $$0.C_());
         return $$5.isEmpty() ? cyy.k : af.a($$5, $$0.C_());
      }

      private static void a(arq $$0, dzz $$1, iu $$2, dzi $$3, dzj $$4, dzk $$5, List<cyy> $$6) {
         $$4.a($$6);
         $$5.a($$4.f());
         $$4.b($$0.ae() + 14L);
         a($$0, $$2, $$1, $$1.b(dvi.b, dzl.c), $$3, $$5);
      }

      private static List<cyy> a(arq $$0, dzi $$1, iu $$2, cqy $$3, cyy $$4) {
         eze $$5 = $$0.p().bc().b($$1.b());
         ezc $$6 = new ezc.a($$0).a(fbt.f, fei.b($$2)).a($$3.eg()).a(fbt.a, $$3).a(fbt.i, $$4).a(fbs.l);
         return $$5.a($$6);
      }

      private static boolean a(dzi $$0, dzl $$1) {
         return !$$0.e().f() && $$1 != dzl.a;
      }

      private static boolean a(dzi $$0, cyy $$1) {
         return cyy.c($$1, $$0.e()) && $$1.M() >= $$0.e().M();
      }

      private static boolean a(long $$0, dzl $$1) {
         return $$0 % 20L == 0L && $$1 == dzl.b;
      }

      private static void a(arq $$0, dzj $$1, iu $$2, awm $$3) {
         if ($$0.ae() >= $$1.a() + 15L) {
            $$0.a(null, $$2, $$3, awo.e);
            $$1.a($$0.ae());
         }
      }
   }
}
