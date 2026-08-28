import com.google.common.annotations.VisibleForTesting;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DynamicOps;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dsi extends dqf {
   private static final Logger a = LogUtils.getLogger();
   private final dsl b = new dsl();
   private final dsm c = new dsm();
   private final dsj d = new dsj();
   private dsk e = dsk.b;

   public dsi(jd $$0, dta $$1) {
      super(dqh.R, $$0, $$1);
   }

   @Nullable
   @Override
   public zf<abt> av_() {
      return aca.a(this);
   }

   @Override
   public ua a(jo.a $$0) {
      return ad.a(new ua(), $$1 -> $$1.a("shared_data", a(dsm.b, this.c, $$0)));
   }

   @Override
   protected void b(ua $$0, jo.a $$1) {
      super.b($$0, $$1);
      $$0.a("config", a(dsk.c, this.e, $$1));
      $$0.a("shared_data", a(dsm.b, this.c, $$1));
      $$0.a("server_data", a(dsl.b, this.b, $$1));
   }

   private static <T> ux a(Codec<T> $$0, T $$1, jo.a $$2) {
      return (ux)$$0.encodeStart($$2.a(uo.a), $$1).getOrThrow();
   }

   @Override
   protected void a(ua $$0, jo.a $$1) {
      super.a($$0, $$1);
      DynamicOps<ux> $$2 = $$1.a(uo.a);
      if ($$0.e("server_data")) {
         dsl.b.parse($$2, $$0.c("server_data")).resultOrPartial(a::error).ifPresent(this.b::a);
      }

      if ($$0.e("config")) {
         dsk.c.parse($$2, $$0.c("config")).resultOrPartial(a::error).ifPresent($$0x -> this.e = $$0x);
      }

      if ($$0.e("shared_data")) {
         dsm.b.parse($$2, $$0.c("shared_data")).resultOrPartial(a::error).ifPresent(this.c::a);
      }
   }

   @Nullable
   public dsl b() {
      return this.n != null && !this.n.B ? this.b : null;
   }

   public dsm c() {
      return this.c;
   }

   public dsj d() {
      return this.d;
   }

   public dsk f() {
      return this.e;
   }

   @VisibleForTesting
   public void a(dsk $$0) {
      this.e = $$0;
   }

   public static final class a {
      private static final int a = 20;
      private static final float b = 0.5F;
      private static final float c = 0.02F;
      private static final int d = 20;
      private static final int e = 20;

      public static void a(dcu $$0, jd $$1, dta $$2, dsj $$3, dsm $$4) {
         $$3.c();
         if ($$0.Z() % 20L == 0L) {
            a($$0, $$1, $$2, $$4);
         }

         a($$0, $$1, $$4, $$2.c(dos.d) ? lm.L : lm.aJ);
         a($$0, $$1, $$4);
      }

      public static void a(dcu $$0, jd $$1, dta $$2, dsm $$3, lk $$4) {
         a($$0, $$1, $$2, $$3);
         ayv $$5 = $$0.z;

         for (int $$6 = 0; $$6 < 20; $$6++) {
            eww $$7 = b($$1, $$5);
            $$0.a(lm.ae, $$7.a(), $$7.b(), $$7.c(), 0.0, 0.0, 0.0);
            $$0.a($$4, $$7.a(), $$7.b(), $$7.c(), 0.0, 0.0, 0.0);
         }
      }

      public static void a(dcu $$0, jd $$1, lk $$2) {
         ayv $$3 = $$0.z;

         for (int $$4 = 0; $$4 < 20; $$4++) {
            eww $$5 = a($$1, $$3);
            eww $$6 = new eww($$3.k() * 0.02, $$3.k() * 0.02, $$3.k() * 0.02);
            $$0.a($$2, $$5.a(), $$5.b(), $$5.c(), $$6.a(), $$6.b(), $$6.c());
         }
      }

      private static void a(dcu $$0, jd $$1, dsm $$2, lk $$3) {
         ayv $$4 = $$0.E_();
         if ($$4.i() <= 0.5F) {
            eww $$5 = b($$1, $$4);
            $$0.a(lm.ae, $$5.a(), $$5.b(), $$5.c(), 0.0, 0.0, 0.0);
            if (a($$2)) {
               $$0.a($$3, $$5.a(), $$5.b(), $$5.c(), 0.0, 0.0, 0.0);
            }
         }
      }

      private static void a(dcu $$0, eww $$1, cmv $$2) {
         ayv $$3 = $$0.z;
         eww $$4 = $$1.a($$2.do().b(0.0, (double)($$2.dl() / 2.0F), 0.0));
         int $$5 = ayn.a($$3, 2, 5);

         for (int $$6 = 0; $$6 < $$5; $$6++) {
            eww $$7 = $$4.a($$3, 1.0F);
            $$0.a(lm.ba, $$1.a(), $$1.b(), $$1.c(), $$7.a(), $$7.b(), $$7.c());
         }
      }

      private static void a(dcu $$0, jd $$1, dta $$2, dsm $$3) {
         Set<UUID> $$4 = $$3.d();
         if (!$$4.isEmpty()) {
            eww $$5 = a($$1, $$2.c(dos.c));

            for (UUID $$6 : $$4) {
               cmv $$7 = $$0.b($$6);
               if ($$7 != null && a($$1, $$3, $$7)) {
                  a($$0, $$5, $$7);
               }
            }
         }
      }

      private static boolean a(jd $$0, dsm $$1, cmv $$2) {
         return $$2.dq().j($$0) <= ayn.k($$1.e());
      }

      private static void a(dcu $$0, jd $$1, dsm $$2) {
         if (a($$2)) {
            ayv $$3 = $$0.E_();
            if ($$3.i() <= 0.02F) {
               $$0.a($$1, avo.AB, avp.e, $$3.i() * 0.25F + 0.75F, $$3.i() + 0.5F, false);
            }
         }
      }

      public static boolean a(dsm $$0) {
         return $$0.b();
      }

      private static eww a(jd $$0, ayv $$1) {
         return eww.a($$0).b(ayn.a($$1, 0.4, 0.6), ayn.a($$1, 0.4, 0.6), ayn.a($$1, 0.4, 0.6));
      }

      private static eww b(jd $$0, ayv $$1) {
         return eww.a($$0).b(ayn.a($$1, 0.1, 0.9), ayn.a($$1, 0.25, 0.75), ayn.a($$1, 0.1, 0.9));
      }

      private static eww a(jd $$0, ji $$1) {
         return eww.c($$0).b((double)$$1.j() * 0.5, 1.75, (double)$$1.l() * 0.5);
      }
   }

   public static final class b {
      private static final int a = 14;
      private static final int b = 20;
      private static final int c = 15;

      public static void a(aqt $$0, jd $$1, dta $$2, dsk $$3, dsl $$4, dsm $$5) {
         dsn $$6 = $$2.c(dos.b);
         if (a($$0.Z(), $$6)) {
            a($$0, $$6, $$3, $$5, $$1);
         }

         dta $$7 = $$2;
         if ($$0.Z() >= $$4.c()) {
            $$7 = $$2.a(dos.b, $$6.a($$0, $$1, $$3, $$4, $$5));
            if (!$$2.equals($$7)) {
               a($$0, $$1, $$2, $$7, $$3, $$5);
            }
         }

         if ($$4.c || $$5.c) {
            dsi.a($$0, $$1, $$2);
            if ($$5.c) {
               $$0.a($$1, $$2, $$7, 2);
            }

            $$4.c = false;
            $$5.c = false;
         }
      }

      public static void a(aqt $$0, jd $$1, dta $$2, dsk $$3, dsl $$4, dsm $$5, cmv $$6, cuo $$7) {
         dsn $$8 = $$2.c(dos.b);
         if (a($$3, $$8)) {
            if (!a($$3, $$7)) {
               a($$0, $$4, $$1, avo.AK);
            } else if ($$4.a($$6)) {
               a($$0, $$4, $$1, avo.AG);
            } else {
               List<cuo> $$9 = a($$0, $$3, $$1, $$6);
               if (!$$9.isEmpty()) {
                  $$6.b(avy.c.b($$7.g()));
                  $$7.a($$3.e().H(), $$6);
                  a($$0, $$2, $$1, $$3, $$4, $$5, $$9);
                  $$4.b($$6);
                  $$5.a($$0, $$1, $$4, $$3, $$3.d());
               }
            }
         }
      }

      static void a(aqt $$0, jd $$1, dta $$2, dta $$3, dsk $$4, dsm $$5) {
         dsn $$6 = $$2.c(dos.b);
         dsn $$7 = $$3.c(dos.b);
         $$0.a($$1, $$3, 3);
         $$6.a($$0, $$1, $$7, $$4, $$5, $$3.c(dos.d));
      }

      static void a(aqt $$0, dsn $$1, dsk $$2, dsm $$3, jd $$4) {
         if (!a($$2, $$1)) {
            $$3.a(cuo.l);
         } else {
            cuo $$5 = a($$0, $$4, $$2.f().orElse($$2.b()));
            $$3.a($$5);
         }
      }

      private static cuo a(aqt $$0, jd $$1, akp<erq> $$2) {
         erq $$3 = $$0.o().be().b($$2);
         ero $$4 = new ero.a($$0).a(euh.f, eww.b($$1)).a(eug.l);
         List<cuo> $$5 = $$3.a($$4, $$0.E_());
         return $$5.isEmpty() ? cuo.l : ad.a($$5, $$0.E_());
      }

      private static void a(aqt $$0, dta $$1, jd $$2, dsk $$3, dsl $$4, dsm $$5, List<cuo> $$6) {
         $$4.a($$6);
         $$5.a($$4.f());
         $$4.b($$0.Z() + 14L);
         a($$0, $$2, $$1, $$1.a(dos.b, dsn.c), $$3, $$5);
      }

      private static List<cuo> a(aqt $$0, dsk $$1, jd $$2, cmv $$3) {
         erq $$4 = $$0.o().be().b($$1.b());
         ero $$5 = new ero.a($$0).a(euh.f, eww.b($$2)).a($$3.gv()).a(euh.a, $$3).a(eug.l);
         return $$4.a($$5);
      }

      private static boolean a(dsk $$0, dsn $$1) {
         return $$0.b() != erh.a && !$$0.e().e() && $$1 != dsn.a;
      }

      private static boolean a(dsk $$0, cuo $$1) {
         return cuo.c($$1, $$0.e()) && $$1.H() >= $$0.e().H();
      }

      private static boolean a(long $$0, dsn $$1) {
         return $$0 % 20L == 0L && $$1 == dsn.b;
      }

      private static void a(aqt $$0, dsl $$1, jd $$2, avn $$3) {
         if ($$0.Z() >= $$1.a() + 15L) {
            $$0.a(null, $$2, $$3, avp.e);
            $$1.a($$0.Z());
         }
      }
   }
}
