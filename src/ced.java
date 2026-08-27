import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;

public class ced {
   private static final float a = 2.0F;
   private static final float b = 1.0F;
   private static final float c = 1.0F;
   private static final float d = 0.75F;
   private static final bnq e = bnq.a(100, 140);
   private static final int f = 2;
   private static final int g = 4;
   private static final float h = 3.5714288F;
   private static final float i = 1.25F;

   protected static void a(cec $$0, axt $$1) {
      $$0.dP().a(bzw.S, e.a($$1));
   }

   protected static bru<?> a(bru<cec> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      g($$0);
      f($$0);
      $$0.a(ImmutableSet.of(clp.a));
      $$0.b(clp.b);
      $$0.f();
      return $$0;
   }

   private static void b(bru<cec> $$0) {
      $$0.a(clp.a, 0, ImmutableList.of(new bsg(2.0F), new btr(45, 90), new btv(), new bsr(bzw.P), new bsr(bzw.S)));
   }

   private static void c(bru<cec> $$0) {
      $$0.a(
         clp.b,
         ImmutableList.of(
            Pair.of(0, bul.a(bqg.bx, 6.0F, bnq.a(30, 60))),
            Pair.of(0, new bsf(bqg.R)),
            Pair.of(1, new bsy($$0x -> 1.25F)),
            Pair.of(2, bux.a(ced::b, $$0x -> $$0x.dP().c(bzw.B))),
            Pair.of(3, bvi.a(6, 1.0F)),
            Pair.of(
               4,
               new bui(
                  ImmutableMap.of(bzw.m, bzx.b),
                  ImmutableList.of(Pair.of(bud.a(1.0F), 1), Pair.of(bus.a(1.0F, 3), 1), Pair.of(new bss(), 3), Pair.of(bvy.a(bqa::aC), 2))
               )
            )
         ),
         ImmutableSet.of(Pair.of(bzw.T, bzx.b), Pair.of(bzw.X, bzx.b))
      );
   }

   private static void d(bru<cec> $$0) {
      $$0.a(
         clp.t,
         ImmutableList.of(
            Pair.of(0, bul.a(bqg.bx, 6.0F, bnq.a(30, 60))),
            Pair.of(1, new bsy($$0x -> 1.25F)),
            Pair.of(2, bux.a(ced::b, $$0x -> $$0x.dP().c(bzw.B))),
            Pair.of(3, bvi.a(8, 1.5F)),
            Pair.of(
               5,
               new bsz(
                  ImmutableMap.of(bzw.m, bzx.b),
                  ImmutableSet.of(),
                  bsz.a.a,
                  bsz.b.b,
                  ImmutableList.of(Pair.of(bud.c(0.75F), 1), Pair.of(bud.a(1.0F, true), 1), Pair.of(bus.a(1.0F, 3), 1), Pair.of(bvy.a(bqa::bf), 5))
               )
            )
         ),
         ImmutableSet.of(Pair.of(bzw.T, bzx.b), Pair.of(bzw.X, bzx.a))
      );
   }

   private static void e(bru<cec> $$0) {
      $$0.a(
         clp.u,
         ImmutableList.of(
            Pair.of(0, bul.a(bqg.bx, 6.0F, bnq.a(30, 60))),
            Pair.of(1, bux.a(ced::b, $$0x -> $$0x.dP().c(bzw.B))),
            Pair.of(2, bvj.a(8, 1.0F)),
            Pair.of(3, bvl.a(dcj.tn)),
            Pair.of(4, new bui(ImmutableList.of(Pair.of(bud.a(1.0F), 2), Pair.of(bus.a(1.0F, 3), 1), Pair.of(new bss(), 2), Pair.of(bvy.a(bqa::aC), 1))))
         ),
         ImmutableSet.of(Pair.of(bzw.T, bzx.b), Pair.of(bzw.Y, bzx.a))
      );
   }

   private static void f(bru<cec> $$0) {
      $$0.a(
         clp.q,
         ImmutableList.of(Pair.of(0, new btm(e, auo.jM)), Pair.of(1, new btn<>(e, 2, 4, 3.5714288F, $$0x -> auo.jL, ave.bL, 0.5F, ced::a))),
         ImmutableSet.of(Pair.of(bzw.O, bzx.b), Pair.of(bzw.r, bzx.b), Pair.of(bzw.S, bzx.b), Pair.of(bzw.X, bzx.b))
      );
   }

   private static void g(bru<cec> $$0) {
      $$0.a(clp.s, 0, ImmutableList.of(bva.a(), new cee(auo.jN, auo.jI)), bzw.o);
   }

   private static <E extends bqv> boolean a(E $$0, id $$1) {
      czg $$2 = $$0.dM();
      id $$3 = $$1.d();
      if ($$2.b_($$1).c() && $$2.b_($$3).c() && $$2.b_($$1.c()).c()) {
         dpi $$4 = $$2.a_($$1);
         dpi $$5 = $$2.a_($$3);
         if (!$$4.a(ave.bL) && !$$5.a(ave.bL)) {
            elu $$6 = new elu($$0.dM(), $$0);
            els $$7 = elx.a($$6, $$1.j());
            els $$8 = elx.a($$6, $$3.j());
            return $$7 != els.e && (!$$4.i() || $$8 != els.e) ? bto.a($$0, $$1) : true;
         } else {
            return true;
         }
      } else {
         return false;
      }
   }

   private static boolean b(cec $$0) {
      return !bsn.a($$0);
   }

   public static void a(cec $$0) {
      $$0.dP().a(ImmutableList.of(clp.s, clp.u, clp.q, clp.t, clp.b));
   }

   public static cvp a() {
      return cec.bX;
   }
}
