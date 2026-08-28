import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.function.Predicate;

public class cit {
   private static final float a = 2.0F;
   private static final float b = 1.0F;
   private static final float c = 1.0F;
   private static final float d = 0.75F;
   private static final brv e = brv.a(100, 140);
   private static final int f = 2;
   private static final int g = 4;
   private static final float h = 3.5714288F;
   private static final float i = 1.25F;

   protected static void a(cis $$0, azu $$1) {
      $$0.eb().a(cel.S, e.a($$1));
   }

   protected static bwj<?> a(bwj<cis> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      g($$0);
      f($$0);
      $$0.a(ImmutableSet.of(cql.a));
      $$0.b(cql.b);
      $$0.f();
      return $$0;
   }

   private static void b(bwj<cis> $$0) {
      $$0.a(cql.a, 0, ImmutableList.of(new bwv(2.0F), new byg(45, 90), new byk(), new bxg(cel.P), new bxg(cel.S)));
   }

   private static void c(bwj<cis> $$0) {
      $$0.a(
         cql.b,
         ImmutableList.of(
            Pair.of(0, bza.a(bus.bO, 6.0F, brv.a(30, 60))),
            Pair.of(0, new bwu(bus.aa)),
            Pair.of(1, new bxn($$0x -> 1.25F)),
            Pair.of(2, bzm.a(($$0x, $$1) -> b($$1), ($$0x, $$1) -> $$1.eb().c(cel.B))),
            Pair.of(3, bzx.a(6, 1.0F)),
            Pair.of(
               4,
               new byx(
                  ImmutableMap.of(cel.m, cem.b),
                  ImmutableList.of(Pair.of(bys.a(1.0F), 1), Pair.of(bzh.a(1.0F, 3), 1), Pair.of(new bxh(), 3), Pair.of(can.a(bul::aJ), 2))
               )
            )
         ),
         ImmutableSet.of(Pair.of(cel.T, cem.b), Pair.of(cel.X, cem.b))
      );
   }

   private static void d(bwj<cis> $$0) {
      $$0.a(
         cql.t,
         ImmutableList.of(
            Pair.of(0, bza.a(bus.bO, 6.0F, brv.a(30, 60))),
            Pair.of(1, new bxn($$0x -> 1.25F)),
            Pair.of(2, bzm.a(($$0x, $$1) -> b($$1), ($$0x, $$1) -> $$1.eb().c(cel.B))),
            Pair.of(3, bzx.a(8, 1.5F)),
            Pair.of(
               5,
               new bxo(
                  ImmutableMap.of(cel.m, cem.b),
                  ImmutableSet.of(),
                  bxo.a.a,
                  bxo.b.b,
                  ImmutableList.of(Pair.of(bys.c(0.75F), 1), Pair.of(bys.a(1.0F, true), 1), Pair.of(bzh.a(1.0F, 3), 1), Pair.of(can.a(bul::bm), 5))
               )
            )
         ),
         ImmutableSet.of(Pair.of(cel.T, cem.b), Pair.of(cel.X, cem.a))
      );
   }

   private static void e(bwj<cis> $$0) {
      $$0.a(
         cql.u,
         ImmutableList.of(
            Pair.of(0, bza.a(bus.bO, 6.0F, brv.a(30, 60))),
            Pair.of(1, bzm.a(($$0x, $$1) -> b($$1), ($$0x, $$1) -> $$1.eb().c(cel.B))),
            Pair.of(2, bzy.a(8, 1.0F)),
            Pair.of(3, caa.a(dis.tn)),
            Pair.of(4, new byx(ImmutableList.of(Pair.of(bys.a(1.0F), 2), Pair.of(bzh.a(1.0F, 3), 1), Pair.of(new bxh(), 2), Pair.of(can.a(bul::aJ), 1))))
         ),
         ImmutableSet.of(Pair.of(cel.T, cem.b), Pair.of(cel.Y, cem.a))
      );
   }

   private static void f(bwj<cis> $$0) {
      $$0.a(
         cql.q,
         ImmutableList.of(Pair.of(0, new byb(e, awn.jS)), Pair.of(1, new byc<>(e, 2, 4, 3.5714288F, $$0x -> awn.jR, axc.bS, 0.5F, cit::a))),
         ImmutableSet.of(Pair.of(cel.O, cem.b), Pair.of(cel.r, cem.b), Pair.of(cel.S, cem.b), Pair.of(cel.X, cem.b))
      );
   }

   private static void g(bwj<cis> $$0) {
      $$0.a(cql.s, 0, ImmutableList.of(bzp.a(), new ciu(awn.jT, awn.jO)), cel.o);
   }

   private static <E extends bvj> boolean a(E $$0, jh $$1) {
      dfm $$2 = $$0.dV();
      jh $$3 = $$1.e();
      if ($$2.b_($$1).c() && $$2.b_($$3).c() && $$2.b_($$1.d()).c()) {
         dvv $$4 = $$2.a_($$1);
         dvv $$5 = $$2.a_($$3);
         if (!$$4.a(axc.bS) && !$$5.a(axc.bS)) {
            eso $$6 = new eso($$0.dV(), $$0);
            esm $$7 = esr.a($$6, $$1.k());
            esm $$8 = esr.a($$6, $$3.k());
            return $$7 != esm.e && (!$$4.l() || $$8 != esm.e) ? byd.a($$0, $$1) : true;
         } else {
            return true;
         }
      } else {
         return false;
      }
   }

   private static boolean b(cis $$0) {
      return !bxc.a($$0);
   }

   public static void a(cis $$0) {
      $$0.eb().a(ImmutableList.of(cql.s, cql.u, cql.q, cql.t, cql.b));
   }

   public static Predicate<cwm> a() {
      return $$0 -> $$0.a(axl.ap);
   }
}
