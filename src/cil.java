import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Optional;

public class cil {
   public static final int a = 8;
   public static final int b = 4;
   private static final bnq c = ayl.a(5, 20);
   private static final int d = 200;
   private static final int e = 8;
   private static final int f = 15;
   private static final int g = 40;
   private static final int h = 15;
   private static final int i = 200;
   private static final bnq j = bnq.a(5, 16);
   private static final float k = 1.0F;
   private static final float l = 1.3F;
   private static final float m = 0.6F;
   private static final float n = 0.4F;
   private static final float o = 0.6F;

   protected static bru<?> a(bru<cik> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      $$0.a(ImmutableSet.of(clp.a));
      $$0.b(clp.b);
      $$0.f();
      return $$0;
   }

   private static void b(bru<cik> $$0) {
      $$0.a(clp.a, 0, ImmutableList.of(new btr(45, 90), new btv()));
   }

   private static void c(bru<cik> $$0) {
      $$0.a(
         clp.b,
         10,
         ImmutableList.of(
            bsk.a(bzw.aw, 200),
            new bsf(bqg.Z, 0.6F, 2),
            bup.a(bzw.aw, 1.0F, 8, true),
            bux.a(cil::d),
            bvy.a(cik::u, bup.b(bzw.aq, 0.4F, 8, false)),
            bul.a(8.0F, bnq.a(30, 60)),
            bsi.a(j, 0.6F),
            a()
         )
      );
   }

   private static void d(bru<cik> $$0) {
      $$0.a(
         clp.k,
         10,
         ImmutableList.of(
            bsk.a(bzw.aw, 200), new bsf(bqg.Z, 0.6F, 2), buq.a(1.0F), bvy.a(cik::u, bts.a(40)), bvy.a(bpu::p_, bts.a(15)), bva.a(), bsx.a(cil::i, bzw.o)
         ),
         bzw.o
      );
   }

   private static void e(bru<cik> $$0) {
      $$0.a(clp.n, 10, ImmutableList.of(bup.b(bzw.z, 1.3F, 15, false), a(), bul.a(8.0F, bnq.a(30, 60)), bsx.a(cil::e, bzw.z)), bzw.z);
   }

   private static bui<cik> a() {
      return new bui<>(ImmutableList.of(Pair.of(bud.a(0.4F), 2), Pair.of(bus.a(0.4F, 3), 2), Pair.of(new bsv(30, 60), 1)));
   }

   protected static void a(cik $$0) {
      bru<cik> $$1 = $$0.dP();
      clp $$2 = $$1.g().orElse(null);
      $$1.a(ImmutableList.of(clp.k, clp.n, clp.b));
      clp $$3 = $$1.g().orElse(null);
      if ($$2 != $$3) {
         b($$0).ifPresent($$0::b);
      }

      $$0.v($$1.a(bzw.o));
   }

   protected static void a(cik $$0, bqt $$1) {
      if (!$$0.p_()) {
         if ($$1.ai() == bqg.az && f($$0)) {
            e($$0, $$1);
            c($$0, $$1);
         } else {
            h($$0, $$1);
         }
      }
   }

   private static void c(cik $$0, bqt $$1) {
      g($$0).forEach($$1x -> d($$1x, $$1));
   }

   private static void d(cik $$0, bqt $$1) {
      bru<cik> $$3 = $$0.dP();
      bqt $$2 = bsn.a($$0, $$3.c(bzw.z), $$1);
      $$2 = bsn.a($$0, $$3.c(bzw.o), $$2);
      e($$0, $$2);
   }

   private static void e(cik $$0, bqt $$1) {
      $$0.dP().b(bzw.o);
      $$0.dP().b(bzw.m);
      $$0.dP().a(bzw.z, $$1, (long)c.a($$0.dM().z));
   }

   private static Optional<? extends bqt> d(cik $$0) {
      return !c($$0) && !i($$0) ? $$0.dP().c(bzw.l) : Optional.empty();
   }

   static boolean a(cik $$0, id $$1) {
      Optional<id> $$2 = $$0.dP().c(bzw.aw);
      return $$2.isPresent() && $$2.get().a($$1, 8.0);
   }

   private static boolean e(cik $$0) {
      return $$0.u() && !f($$0);
   }

   private static boolean f(cik $$0) {
      if ($$0.p_()) {
         return false;
      } else {
         int $$1 = $$0.dP().c(bzw.as).orElse(0);
         int $$2 = $$0.dP().c(bzw.at).orElse(0) + 1;
         return $$1 > $$2;
      }
   }

   protected static void b(cik $$0, bqt $$1) {
      bru<cik> $$2 = $$0.dP();
      $$2.b(bzw.ax);
      $$2.b(bzw.r);
      if ($$0.p_()) {
         d($$0, $$1);
      } else {
         f($$0, $$1);
      }
   }

   private static void f(cik $$0, bqt $$1) {
      if (!$$0.dP().c(clp.n) || $$1.ai() != bqg.az) {
         if ($$1.ai() != bqg.Z) {
            if (!bsn.a($$0, $$1, 4.0)) {
               if (cbc.c($$0, $$1)) {
                  g($$0, $$1);
                  h($$0, $$1);
               }
            }
         }
      }
   }

   private static void g(cik $$0, bqt $$1) {
      bru<cik> $$2 = $$0.dP();
      $$2.b(bzw.E);
      $$2.b(bzw.r);
      $$2.a(bzw.o, $$1, 200L);
   }

   private static void h(cik $$0, bqt $$1) {
      g($$0).forEach($$1x -> i($$1x, $$1));
   }

   private static void i(cik $$0, bqt $$1) {
      if (!c($$0)) {
         Optional<bqt> $$2 = $$0.dP().c(bzw.o);
         bqt $$3 = bsn.a($$0, $$2, $$1);
         g($$0, $$3);
      }
   }

   public static Optional<aun> b(cik $$0) {
      return $$0.dP().g().map($$1 -> a($$0, $$1));
   }

   private static aun a(cik $$0, clp $$1) {
      if ($$1 == clp.n || $$0.y()) {
         return auo.mf;
      } else if ($$1 == clp.k) {
         return auo.ma;
      } else {
         return h($$0) ? auo.mf : auo.lZ;
      }
   }

   private static List<cik> g(cik $$0) {
      return $$0.dP().c(bzw.ap).orElse(ImmutableList.of());
   }

   private static boolean h(cik $$0) {
      return $$0.dP().a(bzw.aw);
   }

   private static boolean i(cik $$0) {
      return $$0.dP().a(bzw.r);
   }

   protected static boolean c(cik $$0) {
      return $$0.dP().a(bzw.ax);
   }
}
