import com.google.common.annotations.VisibleForTesting;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DynamicOps;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class doh extends dmf {
   private static final Logger a = LogUtils.getLogger();
   private final dok b = new dok();
   private final dol c = new dol();
   private final doi d = new doi();
   private doj e = doj.b;

   public doh(ib $$0, doz $$1) {
      super(dmh.R, $$0, $$1);
   }

   @Nullable
   @Override
   public yn<aay> aw_() {
      return abf.a(this);
   }

   @Override
   public tm a(in.a $$0) {
      return ac.a(new tm(), $$1 -> $$1.a("shared_data", a(dol.b, this.c, $$0)));
   }

   @Override
   protected void b(tm $$0, in.a $$1) {
      super.b($$0, $$1);
      $$0.a("config", a(doj.c, this.e, $$1));
      $$0.a("shared_data", a(dol.b, this.c, $$1));
      $$0.a("server_data", a(dok.b, this.b, $$1));
   }

   private static <T> uj a(Codec<T> $$0, T $$1, in.a $$2) {
      return ac.a($$0.encodeStart($$2.a(ua.a), $$1), IllegalStateException::new);
   }

   @Override
   public void a(tm $$0, in.a $$1) {
      super.a($$0, $$1);
      DynamicOps<uj> $$2 = $$1.a(ua.a);
      if ($$0.e("server_data")) {
         dok.b.parse($$2, $$0.c("server_data")).resultOrPartial(a::error).ifPresent(this.b::a);
      }

      if ($$0.e("config")) {
         doj.c.parse($$2, $$0.c("config")).resultOrPartial(a::error).ifPresent($$0x -> this.e = $$0x);
      }

      if ($$0.e("shared_data")) {
         dol.b.parse($$2, $$0.c("shared_data")).resultOrPartial(a::error).ifPresent(this.c::a);
      }
   }

   @Nullable
   public dok b() {
      return this.o != null && !this.o.B ? this.b : null;
   }

   public dol c() {
      return this.c;
   }

   public doi d() {
      return this.d;
   }

   public doj f() {
      return this.e;
   }

   @VisibleForTesting
   public void a(doj $$0) {
      this.e = $$0;
   }

   public static final class a {
      private static final int a = 20;
      private static final float b = 0.5F;
      private static final float c = 0.02F;
      private static final int d = 20;
      private static final int e = 20;

      public static void a(cyx $$0, ib $$1, doz $$2, doi $$3, dol $$4) {
         $$3.c();
         if ($$0.Y() % 20L == 0L) {
            b($$0, $$1, $$2, $$4);
         }

         a($$0, $$1, $$4);
         b($$0, $$1, $$4);
      }

      public static void a(cyx $$0, ib $$1, doz $$2, dol $$3) {
         b($$0, $$1, $$2, $$3);
         axr $$4 = $$0.z;

         for (int $$5 = 0; $$5 < 20; $$5++) {
            esa $$6 = b($$1, $$4);
            $$0.a(kl.ac, $$6.a(), $$6.b(), $$6.c(), 0.0, 0.0, 0.0);
            $$0.a(kl.aH, $$6.a(), $$6.b(), $$6.c(), 0.0, 0.0, 0.0);
         }
      }

      public static void a(cyx $$0, ib $$1) {
         axr $$2 = $$0.z;

         for (int $$3 = 0; $$3 < 20; $$3++) {
            esa $$4 = a($$1, $$2);
            esa $$5 = new esa($$2.k() * 0.02, $$2.k() * 0.02, $$2.k() * 0.02);
            $$0.a(kl.aH, $$4.a(), $$4.b(), $$4.c(), $$5.a(), $$5.b(), $$5.c());
         }
      }

      private static void a(cyx $$0, ib $$1, dol $$2) {
         axr $$3 = $$0.E_();
         if ($$3.i() <= 0.5F) {
            esa $$4 = b($$1, $$3);
            $$0.a(kl.ac, $$4.a(), $$4.b(), $$4.c(), 0.0, 0.0, 0.0);
            if (a($$2)) {
               $$0.a(kl.aH, $$4.a(), $$4.b(), $$4.c(), 0.0, 0.0, 0.0);
            }
         }
      }

      private static void a(cyx $$0, esa $$1, cjt $$2) {
         axr $$3 = $$0.z;
         esa $$4 = $$1.a($$2.dk().b(0.0, (double)($$2.dh() / 2.0F), 0.0));
         int $$5 = axk.a($$3, 2, 5);

         for (int $$6 = 0; $$6 < $$5; $$6++) {
            esa $$7 = $$4.a($$3, 1.0F);
            $$0.a(kl.aX, $$1.a(), $$1.b(), $$1.c(), $$7.a(), $$7.b(), $$7.c());
         }
      }

      private static void b(cyx $$0, ib $$1, doz $$2, dol $$3) {
         Set<UUID> $$4 = $$3.d();
         if (!$$4.isEmpty()) {
            esa $$5 = a($$1, $$2.c(dks.c));

            for (UUID $$6 : $$4) {
               cjt $$7 = $$0.b($$6);
               if ($$7 != null && a($$1, $$3, $$7)) {
                  a($$0, $$5, $$7);
               }
            }
         }
      }

      private static boolean a(ib $$0, dol $$1, cjt $$2) {
         return $$2.dm().j($$0) <= axk.k($$1.e());
      }

      private static void b(cyx $$0, ib $$1, dol $$2) {
         if (a($$2)) {
            axr $$3 = $$0.E_();
            if ($$3.i() <= 0.02F) {
               $$0.a($$1, aum.Af, aun.e, $$3.i() * 0.25F + 0.75F, $$3.i() + 0.5F, false);
            }
         }
      }

      public static boolean a(dol $$0) {
         return $$0.b();
      }

      private static esa a(ib $$0, axr $$1) {
         return esa.a($$0).b(axk.a($$1, 0.4, 0.6), axk.a($$1, 0.4, 0.6), axk.a($$1, 0.4, 0.6));
      }

      private static esa b(ib $$0, axr $$1) {
         return esa.a($$0).b(axk.a($$1, 0.1, 0.9), axk.a($$1, 0.25, 0.75), axk.a($$1, 0.1, 0.9));
      }

      private static esa a(ib $$0, ih $$1) {
         return esa.c($$0).b((double)$$1.j() * 0.5, 1.75, (double)$$1.l() * 0.5);
      }
   }

   public static final class b {
      private static final int a = 14;
      private static final int b = 20;
      private static final int c = 15;

      public static void a(aps $$0, ib $$1, doz $$2, doj $$3, dok $$4, dol $$5) {
         dom $$6 = $$2.c(dks.b);
         if (a($$0.Y(), $$6)) {
            a($$0, $$6, $$3, $$5, $$1);
         }

         doz $$7 = $$2;
         if ($$0.Y() >= $$4.c()) {
            $$7 = $$2.a(dks.b, $$6.a($$0, $$1, $$3, $$4, $$5));
            if (!$$2.equals($$7)) {
               a($$0, $$1, $$2, $$7, $$3, $$5);
            }
         }

         if ($$4.c || $$5.c) {
            doh.a($$0, $$1, $$2);
            if ($$5.c) {
               $$0.a($$1, $$2, $$7, 2);
            }

            $$4.c = false;
            $$5.c = false;
         }
      }

      public static void a(aps $$0, ib $$1, doz $$2, doj $$3, dok $$4, dol $$5, cjt $$6, crj $$7) {
         dom $$8 = $$2.c(dks.b);
         if (a($$3, $$8)) {
            if (!a($$3, $$7)) {
               a($$0, $$4, $$1);
            } else if ($$4.a($$6)) {
               a($$0, $$4, $$1);
            } else {
               List<crj> $$9 = a($$0, $$3, $$1, $$6);
               if (!$$9.isEmpty()) {
                  $$6.b(auw.c.b($$7.f()));
                  if (!$$6.f()) {
                     $$7.g($$3.e().G());
                  }

                  a($$0, $$2, $$1, $$3, $$4, $$5, $$9);
                  $$4.b($$6);
                  $$5.a($$0, $$1, $$4, $$3, $$3.d());
               }
            }
         }
      }

      static void a(aps $$0, ib $$1, doz $$2, doz $$3, doj $$4, dol $$5) {
         dom $$6 = $$2.c(dks.b);
         dom $$7 = $$3.c(dks.b);
         $$0.a($$1, $$3, 3);
         $$6.a($$0, $$1, $$7, $$4, $$5);
      }

      static void a(aps $$0, dom $$1, doj $$2, dol $$3, ib $$4) {
         if (!a($$2, $$1)) {
            $$3.a(crj.i);
         } else {
            crj $$5 = a($$0, $$4, $$2.f().orElse($$2.b()));
            $$3.a($$5);
         }
      }

      private static crj a(aps $$0, ib $$1, ajt $$2) {
         enj $$3 = $$0.o().aM().getLootTable($$2);
         enh $$4 = new enh.a($$0).a(epo.f, esa.b($$1)).a(epn.k);
         List<crj> $$5 = $$3.a($$4);
         return $$5.isEmpty() ? crj.i : ac.a($$5, $$0.E_());
      }

      private static void a(aps $$0, doz $$1, ib $$2, doj $$3, dok $$4, dol $$5, List<crj> $$6) {
         $$4.a($$6);
         $$5.a($$4.f());
         $$4.b($$0.Y() + 14L);
         a($$0, $$2, $$1, $$1.a(dks.b, dom.c), $$3, $$5);
      }

      private static List<crj> a(aps $$0, doj $$1, ib $$2, cjt $$3) {
         enj $$4 = $$0.o().aM().getLootTable($$1.b());
         enh $$5 = new enh.a($$0).a(epo.f, esa.b($$2)).a($$3.gv()).a(epo.a, $$3).a(epn.k);
         return $$4.a($$5);
      }

      private static boolean a(doj $$0, dom $$1) {
         return !$$0.b().equals(emz.a) && !$$0.e().d() && $$1 != dom.a;
      }

      private static boolean a(doj $$0, crj $$1) {
         return crj.c($$1, $$0.e()) && $$1.G() >= $$0.e().G();
      }

      private static boolean a(long $$0, dom $$1) {
         return $$0 % 20L == 0L && $$1 == dom.b;
      }

      private static void a(aps $$0, dok $$1, ib $$2) {
         if ($$0.Y() >= $$1.a() + 15L) {
            $$0.a(null, $$2, aum.An, aun.e);
            $$1.a($$0.Y());
         }
      }
   }
}
