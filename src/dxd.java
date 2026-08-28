import com.google.common.annotations.VisibleForTesting;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DynamicOps;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dxd extends dux {
   private static final Logger a = LogUtils.getLogger();
   private final dxg b = new dxg();
   private final dxh c = new dxh();
   private final dxe d = new dxe();
   private dxf e = dxf.b;

   public dxd(jh $$0, dxv $$1) {
      super(duz.S, $$0, $$1);
   }

   @Nullable
   @Override
   public aac<acr> ay_() {
      return acy.a(this);
   }

   @Override
   public ux a(js.a $$0) {
      return ae.a(new ux(), $$1 -> $$1.a("shared_data", a(dxh.b, this.c, $$0)));
   }

   @Override
   protected void b(ux $$0, js.a $$1) {
      super.b($$0, $$1);
      $$0.a("config", a(dxf.c, this.e, $$1));
      $$0.a("shared_data", a(dxh.b, this.c, $$1));
      $$0.a("server_data", a(dxg.b, this.b, $$1));
   }

   private static <T> vu a(Codec<T> $$0, T $$1, js.a $$2) {
      return (vu)$$0.encodeStart($$2.a(vl.a), $$1).getOrThrow();
   }

   @Override
   protected void a(ux $$0, js.a $$1) {
      super.a($$0, $$1);
      DynamicOps<vu> $$2 = $$1.a(vl.a);
      if ($$0.e("server_data")) {
         dxg.b.parse($$2, $$0.c("server_data")).resultOrPartial(a::error).ifPresent(this.b::a);
      }

      if ($$0.e("config")) {
         dxf.c.parse($$2, $$0.c("config")).resultOrPartial(a::error).ifPresent($$0x -> this.e = $$0x);
      }

      if ($$0.e("shared_data")) {
         dxh.b.parse($$2, $$0.c("shared_data")).resultOrPartial(a::error).ifPresent(this.c::a);
      }
   }

   @Nullable
   public dxg b() {
      return this.o != null && !this.o.C ? this.b : null;
   }

   public dxh c() {
      return this.c;
   }

   public dxe d() {
      return this.d;
   }

   public dxf f() {
      return this.e;
   }

   @VisibleForTesting
   public void a(dxf $$0) {
      this.e = $$0;
   }

   public static final class a {
      private static final int a = 20;
      private static final float b = 0.5F;
      private static final float c = 0.02F;
      private static final int d = 20;
      private static final int e = 20;

      public static void a(dhi $$0, jh $$1, dxv $$2, dxe $$3, dxh $$4) {
         $$3.c();
         if ($$0.ac() % 20L == 0L) {
            a($$0, $$1, $$2, $$4);
         }

         a($$0, $$1, $$4, $$2.c(dtk.d) ? ls.L : ls.aK);
         a($$0, $$1, $$4);
      }

      public static void a(dhi $$0, jh $$1, dxv $$2, dxh $$3, lq $$4) {
         a($$0, $$1, $$2, $$3);
         bam $$5 = $$0.A;

         for (int $$6 = 0; $$6 < 20; $$6++) {
            fby $$7 = b($$1, $$5);
            $$0.a(ls.af, $$7.a(), $$7.b(), $$7.c(), 0.0, 0.0, 0.0);
            $$0.a($$4, $$7.a(), $$7.b(), $$7.c(), 0.0, 0.0, 0.0);
         }
      }

      public static void a(dhi $$0, jh $$1, lq $$2) {
         bam $$3 = $$0.A;

         for (int $$4 = 0; $$4 < 20; $$4++) {
            fby $$5 = a($$1, $$3);
            fby $$6 = new fby($$3.k() * 0.02, $$3.k() * 0.02, $$3.k() * 0.02);
            $$0.a($$2, $$5.a(), $$5.b(), $$5.c(), $$6.a(), $$6.b(), $$6.c());
         }
      }

      private static void a(dhi $$0, jh $$1, dxh $$2, lq $$3) {
         bam $$4 = $$0.H_();
         if ($$4.i() <= 0.5F) {
            fby $$5 = b($$1, $$4);
            $$0.a(ls.af, $$5.a(), $$5.b(), $$5.c(), 0.0, 0.0, 0.0);
            if (a($$2)) {
               $$0.a($$3, $$5.a(), $$5.b(), $$5.c(), 0.0, 0.0, 0.0);
            }
         }
      }

      private static void a(dhi $$0, fby $$1, cpx $$2) {
         bam $$3 = $$0.A;
         fby $$4 = $$1.a($$2.du().b(0.0, (double)($$2.ds() / 2.0F), 0.0));
         int $$5 = bae.a($$3, 2, 5);

         for (int $$6 = 0; $$6 < $$5; $$6++) {
            fby $$7 = $$4.a($$3, 1.0F);
            $$0.a(ls.bb, $$1.a(), $$1.b(), $$1.c(), $$7.a(), $$7.b(), $$7.c());
         }
      }

      private static void a(dhi $$0, jh $$1, dxv $$2, dxh $$3) {
         Set<UUID> $$4 = $$3.d();
         if (!$$4.isEmpty()) {
            fby $$5 = a($$1, $$2.c(dtk.c));

            for (UUID $$6 : $$4) {
               cpx $$7 = $$0.b($$6);
               if ($$7 != null && a($$1, $$3, $$7)) {
                  a($$0, $$5, $$7);
               }
            }
         }
      }

      private static boolean a(jh $$0, dxh $$1, cpx $$2) {
         return $$2.dw().j($$0) <= bae.k($$1.e());
      }

      private static void a(dhi $$0, jh $$1, dxh $$2) {
         if (a($$2)) {
            bam $$3 = $$0.H_();
            if ($$3.i() <= 0.02F) {
               $$0.a($$1, axf.Ba, axg.e, $$3.i() * 0.25F + 0.75F, $$3.i() + 0.5F, false);
            }
         }
      }

      public static boolean a(dxh $$0) {
         return $$0.b();
      }

      private static fby a(jh $$0, bam $$1) {
         return fby.a($$0).b(bae.a($$1, 0.4, 0.6), bae.a($$1, 0.4, 0.6), bae.a($$1, 0.4, 0.6));
      }

      private static fby b(jh $$0, bam $$1) {
         return fby.a($$0).b(bae.a($$1, 0.1, 0.9), bae.a($$1, 0.25, 0.75), bae.a($$1, 0.1, 0.9));
      }

      private static fby a(jh $$0, jm $$1) {
         return fby.c($$0).b((double)$$1.j() * 0.5, 1.75, (double)$$1.l() * 0.5);
      }
   }

   public static final class b {
      private static final int a = 14;
      private static final int b = 20;
      private static final int c = 15;

      public static void a(ash $$0, jh $$1, dxv $$2, dxf $$3, dxg $$4, dxh $$5) {
         dxi $$6 = $$2.c(dtk.b);
         if (a($$0.ac(), $$6)) {
            a($$0, $$6, $$3, $$5, $$1);
         }

         dxv $$7 = $$2;
         if ($$0.ac() >= $$4.c()) {
            $$7 = $$2.b(dtk.b, $$6.a($$0, $$1, $$3, $$4, $$5));
            if (!$$2.equals($$7)) {
               a($$0, $$1, $$2, $$7, $$3, $$5);
            }
         }

         if ($$4.c || $$5.c) {
            dxd.a($$0, $$1, $$2);
            if ($$5.c) {
               $$0.a($$1, $$2, $$7, 2);
            }

            $$4.c = false;
            $$5.c = false;
         }
      }

      public static void a(ash $$0, jh $$1, dxv $$2, dxf $$3, dxg $$4, dxh $$5, cpx $$6, cxp $$7) {
         dxi $$8 = $$2.c(dtk.b);
         if (a($$3, $$8)) {
            if (!a($$3, $$7)) {
               a($$0, $$4, $$1, axf.Bj);
            } else if ($$4.a($$6)) {
               a($$0, $$4, $$1, axf.Bf);
            } else {
               List<cxp> $$9 = a($$0, $$3, $$1, $$6, $$7);
               if (!$$9.isEmpty()) {
                  $$6.b(axp.c.b($$7.h()));
                  $$7.a($$3.e().L(), (bwg)$$6);
                  a($$0, $$2, $$1, $$3, $$4, $$5, $$9);
                  $$4.b($$6);
                  $$5.a($$0, $$1, $$4, $$3, $$3.d());
               }
            }
         }
      }

      static void a(ash $$0, jh $$1, dxv $$2, dxv $$3, dxf $$4, dxh $$5) {
         dxi $$6 = $$2.c(dtk.b);
         dxi $$7 = $$3.c(dtk.b);
         $$0.a($$1, $$3, 3);
         $$6.a($$0, $$1, $$7, $$4, $$5, $$3.c(dtk.d));
      }

      static void a(ash $$0, dxi $$1, dxf $$2, dxh $$3, jh $$4) {
         if (!a($$2, $$1)) {
            $$3.a(cxp.j);
         } else {
            cxp $$5 = a($$0, $$4, $$2.f().orElse($$2.b()));
            $$3.a($$5);
         }
      }

      private static cxp a(ash $$0, jh $$1, aly<ewu> $$2) {
         ewu $$3 = $$0.p().bc().b($$2);
         ews $$4 = new ews.a($$0).a(ezj.f, fby.b($$1)).a(ezi.l);
         List<cxp> $$5 = $$3.a($$4, $$0.H_());
         return $$5.isEmpty() ? cxp.j : ae.a($$5, $$0.H_());
      }

      private static void a(ash $$0, dxv $$1, jh $$2, dxf $$3, dxg $$4, dxh $$5, List<cxp> $$6) {
         $$4.a($$6);
         $$5.a($$4.f());
         $$4.b($$0.ac() + 14L);
         a($$0, $$2, $$1, $$1.b(dtk.b, dxi.c), $$3, $$5);
      }

      private static List<cxp> a(ash $$0, dxf $$1, jh $$2, cpx $$3, cxp $$4) {
         ewu $$5 = $$0.p().bc().b($$1.b());
         ews $$6 = new ews.a($$0).a(ezj.f, fby.b($$2)).a($$3.gF()).a(ezj.a, $$3).a(ezj.i, $$4).a(ezi.l);
         return $$5.a($$6);
      }

      private static boolean a(dxf $$0, dxi $$1) {
         return !$$0.e().f() && $$1 != dxi.a;
      }

      private static boolean a(dxf $$0, cxp $$1) {
         return cxp.c($$1, $$0.e()) && $$1.L() >= $$0.e().L();
      }

      private static boolean a(long $$0, dxi $$1) {
         return $$0 % 20L == 0L && $$1 == dxi.b;
      }

      private static void a(ash $$0, dxg $$1, jh $$2, axe $$3) {
         if ($$0.ac() >= $$1.a() + 15L) {
            $$0.a(null, $$2, $$3, axg.e);
            $$1.a($$0.ac());
         }
      }
   }
}
