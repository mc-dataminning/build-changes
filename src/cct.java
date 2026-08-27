import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;

public class cct {
   private static final int a = 600;
   private static final int b = 20;
   private static final double c = 0.0125;
   private static final int d = 8;
   private static final int e = 8;
   private static final double f = 12.0;
   private static final float g = 0.6F;
   private static final int h = 2;
   private static final int i = 100;
   private static final int j = 5;

   protected static bml<?> a(ccs $$0, bml<ccs> $$1) {
      b($$0, $$1);
      c($$0, $$1);
      d($$0, $$1);
      $$1.a(ImmutableSet.of(cfk.a));
      $$1.b(cfk.b);
      $$1.f();
      return $$1;
   }

   protected static void a(ccs $$0) {
      ie $$1 = ie.a($$0.dN().ad(), $$0.dn());
      $$0.dP().a(bum.b, $$1);
   }

   private static void b(ccs $$0, bml<ccs> $$1) {
      $$1.a(cfk.a, 0, ImmutableList.of(new boh(45, 90), new bol(), boa.a(), bpr.a()));
   }

   private static void c(ccs $$0, bml<ccs> $$1) {
      $$1.a(cfk.b, 10, ImmutableList.of(bpn.a(cct::a), a(), b(), bpd.a(bkz.bt, 4)));
   }

   private static void d(ccs $$0, bml<ccs> $$1) {
      $$1.a(cfk.k, 10, ImmutableList.of(bpq.a($$1x -> !a((cco)$$0, $$1x)), bpg.a(1.0F), boi.a(20)), bum.o);
   }

   private static boy<ccs> a() {
      return new boy<>(
         ImmutableList.of(
            Pair.of(bpa.a(bkz.bt, 8.0F), 1),
            Pair.of(bpa.a(bkz.aw, 8.0F), 1),
            Pair.of(bpa.a(bkz.ax, 8.0F), 1),
            Pair.of(bpa.a(8.0F), 1),
            Pair.of(new bnm(30, 60), 1)
         )
      );
   }

   private static boy<ccs> b() {
      return new boy<>(
         ImmutableList.of(
            Pair.of(bot.a(0.6F), 2),
            Pair.of(bnz.a(bkz.aw, 8, bum.q, 0.6F, 2), 2),
            Pair.of(bnz.a(bkz.ax, 8, bum.q, 0.6F, 2), 2),
            Pair.of(bpt.a(bum.b, 0.6F, 2, 100), 2),
            Pair.of(bps.a(bum.b, 0.6F, 5), 2),
            Pair.of(new bnm(30, 60), 1)
         )
      );
   }

   protected static void b(ccs $$0) {
      bml<ccs> $$1 = $$0.dP();
      cfk $$2 = $$1.g().orElse(null);
      $$1.a(ImmutableList.of(cfk.k, cfk.b));
      cfk $$3 = $$1.g().orElse(null);
      if ($$2 != $$3) {
         d($$0);
      }

      $$0.v($$1.a(bum.o));
   }

   private static boolean a(cco $$0, bll $$1) {
      return a($$0).filter($$1x -> $$1x == $$1).isPresent();
   }

   private static Optional<? extends bll> a(cco $$0) {
      Optional<bll> $$1 = bne.a($$0, bum.aa);
      if ($$1.isPresent() && bvq.d($$0, $$1.get())) {
         return $$1;
      } else {
         Optional<? extends bll> $$2 = a($$0, bum.l);
         return $$2.isPresent() ? $$2 : $$0.dP().c(bum.L);
      }
   }

   private static Optional<? extends bll> a(cco $$0, bum<? extends bll> $$1) {
      return $$0.dP().c($$1).filter($$1x -> $$1x.a($$0, 12.0));
   }

   protected static void a(ccs $$0, bll $$1) {
      if (!($$1 instanceof cco)) {
         ccq.a($$0, $$1);
      }
   }

   protected static void b(ccs $$0, bll $$1) {
      $$0.dP().b(bum.E);
      $$0.dP().a(bum.aa, $$1.cw(), 600L);
   }

   protected static void c(ccs $$0) {
      if ((double)$$0.dN().z.i() < 0.0125) {
         d($$0);
      }
   }

   private static void d(ccs $$0) {
      $$0.dP().g().ifPresent($$1 -> {
         if ($$1 == cfk.k) {
            $$0.gm();
         }
      });
   }
}
