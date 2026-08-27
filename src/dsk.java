import com.google.common.annotations.VisibleForTesting;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DynamicOps;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dsk extends dqc {
   private static final Logger a = LogUtils.getLogger();
   private final dsn b = new dsn();
   private final dso c = new dso();
   private final dsl d = new dsl();
   private dsm e = dsm.b;

   public dsk(ir $$0, dtc $$1) {
      super(dqe.S, $$0, $$1);
   }

   @Nullable
   @Override
   public zl<abw> av_() {
      return ace.a(this);
   }

   @Override
   public uk a(jc.a $$0) {
      return ad.a(new uk(), $$1 -> $$1.a("shared_data", a(dso.b, this.c, $$0)));
   }

   @Override
   protected void b(uk $$0, jc.a $$1) {
      super.b($$0, $$1);
      $$0.a("config", a(dsm.c, this.e, $$1));
      $$0.a("shared_data", a(dso.b, this.c, $$1));
      $$0.a("server_data", a(dsn.b, this.b, $$1));
   }

   private static <T> vh a(Codec<T> $$0, T $$1, jc.a $$2) {
      return ad.a($$0.encodeStart($$2.a(uy.a), $$1), IllegalStateException::new);
   }

   @Override
   public void a(uk $$0, jc.a $$1) {
      super.a($$0, $$1);
      DynamicOps<vh> $$2 = $$1.a(uy.a);
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
      return this.n != null && !this.n.C ? this.b : null;
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

      public static void a(dca $$0, ir $$1, dtc $$2, dsl $$3, dso $$4) {
         $$3.c();
         if ($$0.Z() % 20L == 0L) {
            b($$0, $$1, $$2, $$4);
         }

         a($$0, $$1, $$4);
         b($$0, $$1, $$4);
      }

      public static void a(dca $$0, ir $$1, dtc $$2, dso $$3) {
         b($$0, $$1, $$2, $$3);
         ayt $$4 = $$0.A;

         for (int $$5 = 0; $$5 < 20; $$5++) {
            ewu $$6 = b($$1, $$4);
            $$0.a(lb.ac, $$6.a(), $$6.b(), $$6.c(), 0.0, 0.0, 0.0);
            $$0.a(lb.aK, $$6.a(), $$6.b(), $$6.c(), 0.0, 0.0, 0.0);
         }
      }

      public static void a(dca $$0, ir $$1) {
         ayt $$2 = $$0.A;

         for (int $$3 = 0; $$3 < 20; $$3++) {
            ewu $$4 = a($$1, $$2);
            ewu $$5 = new ewu($$2.k() * 0.02, $$2.k() * 0.02, $$2.k() * 0.02);
            $$0.a(lb.aK, $$4.a(), $$4.b(), $$4.c(), $$5.a(), $$5.b(), $$5.c());
         }
      }

      private static void a(dca $$0, ir $$1, dso $$2) {
         ayt $$3 = $$0.F_();
         if ($$3.i() <= 0.5F) {
            ewu $$4 = b($$1, $$3);
            $$0.a(lb.ac, $$4.a(), $$4.b(), $$4.c(), 0.0, 0.0, 0.0);
            if (a($$2)) {
               $$0.a(lb.aK, $$4.a(), $$4.b(), $$4.c(), 0.0, 0.0, 0.0);
            }
         }
      }

      private static void a(dca $$0, ewu $$1, cly $$2) {
         ayt $$3 = $$0.A;
         ewu $$4 = $$1.a($$2.ds().b(0.0, (double)($$2.dp() / 2.0F), 0.0));
         int $$5 = aym.a($$3, 2, 5);

         for (int $$6 = 0; $$6 < $$5; $$6++) {
            ewu $$7 = $$4.a($$3, 1.0F);
            $$0.a(lb.ba, $$1.a(), $$1.b(), $$1.c(), $$7.a(), $$7.b(), $$7.c());
         }
      }

      private static void b(dca $$0, ir $$1, dtc $$2, dso $$3) {
         Set<UUID> $$4 = $$3.d();
         if (!$$4.isEmpty()) {
            ewu $$5 = a($$1, $$2.c(dom.c));

            for (UUID $$6 : $$4) {
               cly $$7 = $$0.c($$6);
               if ($$7 != null && a($$1, $$3, $$7)) {
                  a($$0, $$5, $$7);
               }
            }
         }
      }

      private static boolean a(ir $$0, dso $$1, cly $$2) {
         return $$2.du().j($$0) <= aym.k($$1.e());
      }

      private static void b(dca $$0, ir $$1, dso $$2) {
         if (a($$2)) {
            ayt $$3 = $$0.F_();
            if ($$3.i() <= 0.02F) {
               $$0.a($$1, avo.AW, avq.e, $$3.i() * 0.25F + 0.75F, $$3.i() + 0.5F, false);
            }
         }
      }

      public static boolean a(dso $$0) {
         return $$0.b();
      }

      private static ewu a(ir $$0, ayt $$1) {
         return ewu.a($$0).b(aym.a($$1, 0.4, 0.6), aym.a($$1, 0.4, 0.6), aym.a($$1, 0.4, 0.6));
      }

      private static ewu b(ir $$0, ayt $$1) {
         return ewu.a($$0).b(aym.a($$1, 0.1, 0.9), aym.a($$1, 0.25, 0.75), aym.a($$1, 0.1, 0.9));
      }

      private static ewu a(ir $$0, iw $$1) {
         return ewu.c($$0).b((double)$$1.j() * 0.5, 1.75, (double)$$1.l() * 0.5);
      }
   }

   public static final class b {
      private static final int a = 14;
      private static final int b = 20;
      private static final int c = 15;

      public static void a(aqt $$0, ir $$1, dtc $$2, dsm $$3, dsn $$4, dso $$5) {
         dsp $$6 = $$2.c(dom.b);
         if (a($$0.Z(), $$6)) {
            a($$0, $$6, $$3, $$5, $$1);
         }

         dtc $$7 = $$2;
         if ($$0.Z() >= $$4.c()) {
            $$7 = $$2.a(dom.b, $$6.a($$0, $$1, $$3, $$4, $$5));
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

      public static void a(aqt $$0, ir $$1, dtc $$2, dsm $$3, dsn $$4, dso $$5, cly $$6, cuh $$7) {
         dsp $$8 = $$2.c(dom.b);
         if (a($$3, $$8)) {
            if (!a($$3, $$7)) {
               a($$0, $$4, $$1);
            } else if ($$4.a($$6)) {
               a($$0, $$4, $$1);
            } else {
               List<cuh> $$9 = a($$0, $$3, $$1, $$6);
               if (!$$9.isEmpty()) {
                  $$6.b(avz.c.b($$7.f()));
                  if (!$$6.f()) {
                     $$7.h($$3.e().G());
                  }

                  a($$0, $$2, $$1, $$3, $$4, $$5, $$9);
                  $$4.b($$6);
                  $$5.a($$0, $$1, $$4, $$3, $$3.d());
               }
            }
         }
      }

      static void a(aqt $$0, ir $$1, dtc $$2, dtc $$3, dsm $$4, dso $$5) {
         dsp $$6 = $$2.c(dom.b);
         dsp $$7 = $$3.c(dom.b);
         $$0.a($$1, $$3, 3);
         $$6.a($$0, $$1, $$7, $$4, $$5);
      }

      static void a(aqt $$0, dsp $$1, dsm $$2, dso $$3, ir $$4) {
         if (!a($$2, $$1)) {
            $$3.a(cuh.i);
         } else {
            cuh $$5 = a($$0, $$4, $$2.f().orElse($$2.b()));
            $$3.a($$5);
         }
      }

      private static cuh a(aqt $$0, ir $$1, aks<eru> $$2) {
         eru $$3 = $$0.o().be().b($$2);
         ers $$4 = new ers.a($$0).a(eug.f, ewu.b($$1)).a(euf.k);
         List<cuh> $$5 = $$3.a($$4);
         return $$5.isEmpty() ? cuh.i : ad.a($$5, $$0.F_());
      }

      private static void a(aqt $$0, dtc $$1, ir $$2, dsm $$3, dsn $$4, dso $$5, List<cuh> $$6) {
         $$4.a($$6);
         $$5.a($$4.f());
         $$4.b($$0.Z() + 14L);
         a($$0, $$2, $$1, $$1.a(dom.b, dsp.c), $$3, $$5);
      }

      private static List<cuh> a(aqt $$0, dsm $$1, ir $$2, cly $$3) {
         eru $$4 = $$0.o().be().b($$1.b());
         ers $$5 = new ers.a($$0).a(eug.f, ewu.b($$2)).a($$3.gJ()).a(eug.a, $$3).a(euf.k);
         return $$4.a($$5);
      }

      private static boolean a(dsm $$0, dsp $$1) {
         return $$0.b() != ern.a && !$$0.e().d() && $$1 != dsp.a;
      }

      private static boolean a(dsm $$0, cuh $$1) {
         return cuh.c($$1, $$0.e()) && $$1.G() >= $$0.e().G();
      }

      private static boolean a(long $$0, dsp $$1) {
         return $$0 % 20L == 0L && $$1 == dsp.b;
      }

      private static void a(aqt $$0, dsn $$1, ir $$2) {
         if ($$0.Z() >= $$1.a() + 15L) {
            $$0.a(null, $$2, avo.Be, avq.e);
            $$1.a($$0.Z());
         }
      }
   }
}
