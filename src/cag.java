import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;

public class cag {
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

   protected static bjy<?> a(caf $$0, bjy<caf> $$1) {
      b($$0, $$1);
      c($$0, $$1);
      d($$0, $$1);
      $$1.a(ImmutableSet.of(ccx.a));
      $$1.b(ccx.b);
      $$1.f();
      return $$1;
   }

   protected static void a(caf $$0) {
      hd $$1 = hd.a($$0.dK().ac(), $$0.dk());
      $$0.dM().a(brz.b, $$1);
   }

   private static void b(caf $$0, bjy<caf> $$1) {
      $$1.a(ccx.a, 0, ImmutableList.of(new blu(45, 90), new bly(), bln.a(), bne.a()));
   }

   private static void c(caf $$0, bjy<caf> $$1) {
      $$1.a(ccx.b, 10, ImmutableList.of(bna.a(cag::a), a(), b(), bmq.a(bim.bt, 4)));
   }

   private static void d(caf $$0, bjy<caf> $$1) {
      $$1.a(ccx.k, 10, ImmutableList.of(bnd.a($$1x -> !a((cab)$$0, $$1x)), bmt.a(1.0F), blv.a(20)), brz.o);
   }

   private static bml<caf> a() {
      return new bml<>(
         ImmutableList.of(
            Pair.of(bmn.a(bim.bt, 8.0F), 1),
            Pair.of(bmn.a(bim.aw, 8.0F), 1),
            Pair.of(bmn.a(bim.ax, 8.0F), 1),
            Pair.of(bmn.a(8.0F), 1),
            Pair.of(new bkz(30, 60), 1)
         )
      );
   }

   private static bml<caf> b() {
      return new bml<>(
         ImmutableList.of(
            Pair.of(bmg.a(0.6F), 2),
            Pair.of(blm.a(bim.aw, 8, brz.q, 0.6F, 2), 2),
            Pair.of(blm.a(bim.ax, 8, brz.q, 0.6F, 2), 2),
            Pair.of(bng.a(brz.b, 0.6F, 2, 100), 2),
            Pair.of(bnf.a(brz.b, 0.6F, 5), 2),
            Pair.of(new bkz(30, 60), 1)
         )
      );
   }

   protected static void b(caf $$0) {
      bjy<caf> $$1 = $$0.dM();
      ccx $$2 = $$1.g().orElse(null);
      $$1.a(ImmutableList.of(ccx.k, ccx.b));
      ccx $$3 = $$1.g().orElse(null);
      if ($$2 != $$3) {
         d($$0);
      }

      $$0.v($$1.a(brz.o));
   }

   private static boolean a(cab $$0, biy $$1) {
      return a($$0).filter($$1x -> $$1x == $$1).isPresent();
   }

   private static Optional<? extends biy> a(cab $$0) {
      Optional<biy> $$1 = bkr.a($$0, brz.aa);
      if ($$1.isPresent() && btd.d($$0, $$1.get())) {
         return $$1;
      } else {
         Optional<? extends biy> $$2 = a($$0, brz.l);
         return $$2.isPresent() ? $$2 : $$0.dM().c(brz.L);
      }
   }

   private static Optional<? extends biy> a(cab $$0, brz<? extends biy> $$1) {
      return $$0.dM().c($$1).filter($$1x -> $$1x.a($$0, 12.0));
   }

   protected static void a(caf $$0, biy $$1) {
      if (!($$1 instanceof cab)) {
         cad.a($$0, $$1);
      }
   }

   protected static void b(caf $$0, biy $$1) {
      $$0.dM().b(brz.E);
      $$0.dM().a(brz.aa, $$1.cv(), 600L);
   }

   protected static void c(caf $$0) {
      if ((double)$$0.dK().z.i() < 0.0125) {
         d($$0);
      }
   }

   private static void d(caf $$0) {
      $$0.dM().g().ifPresent($$1 -> {
         if ($$1 == ccx.k) {
            $$0.gh();
         }
      });
   }
}
