import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;

public class ceo {
   private static final float a = 2.0F;
   private static final float b = 1.0F;
   private static final float c = 1.0F;
   private static final float d = 0.75F;
   private static final bob e = bob.a(100, 140);
   private static final int f = 2;
   private static final int g = 4;
   private static final float h = 3.5714288F;
   private static final float i = 1.25F;

   protected static void a(cen $$0, ayd $$1) {
      $$0.dQ().a(cah.S, e.a($$1));
   }

   protected static bsf<?> a(bsf<cen> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      g($$0);
      f($$0);
      $$0.a(ImmutableSet.of(cma.a));
      $$0.b(cma.b);
      $$0.f();
      return $$0;
   }

   private static void b(bsf<cen> $$0) {
      $$0.a(cma.a, 0, ImmutableList.of(new bsr(2.0F), new buc(45, 90), new bug(), new btc(cah.P), new btc(cah.S)));
   }

   private static void c(bsf<cen> $$0) {
      $$0.a(
         cma.b,
         ImmutableList.of(
            Pair.of(0, buw.a(bqr.bx, 6.0F, bob.a(30, 60))),
            Pair.of(0, new bsq(bqr.R)),
            Pair.of(1, new btj($$0x -> 1.25F)),
            Pair.of(2, bvi.a(ceo::b, $$0x -> $$0x.dQ().c(cah.B))),
            Pair.of(3, bvt.a(6, 1.0F)),
            Pair.of(
               4,
               new but(
                  ImmutableMap.of(cah.m, cai.b),
                  ImmutableList.of(Pair.of(buo.a(1.0F), 1), Pair.of(bvd.a(1.0F, 3), 1), Pair.of(new btd(), 3), Pair.of(bwj.a(bql::aC), 2))
               )
            )
         ),
         ImmutableSet.of(Pair.of(cah.T, cai.b), Pair.of(cah.X, cai.b))
      );
   }

   private static void d(bsf<cen> $$0) {
      $$0.a(
         cma.t,
         ImmutableList.of(
            Pair.of(0, buw.a(bqr.bx, 6.0F, bob.a(30, 60))),
            Pair.of(1, new btj($$0x -> 1.25F)),
            Pair.of(2, bvi.a(ceo::b, $$0x -> $$0x.dQ().c(cah.B))),
            Pair.of(3, bvt.a(8, 1.5F)),
            Pair.of(
               5,
               new btk(
                  ImmutableMap.of(cah.m, cai.b),
                  ImmutableSet.of(),
                  btk.a.a,
                  btk.b.b,
                  ImmutableList.of(Pair.of(buo.c(0.75F), 1), Pair.of(buo.a(1.0F, true), 1), Pair.of(bvd.a(1.0F, 3), 1), Pair.of(bwj.a(bql::bf), 5))
               )
            )
         ),
         ImmutableSet.of(Pair.of(cah.T, cai.b), Pair.of(cah.X, cai.a))
      );
   }

   private static void e(bsf<cen> $$0) {
      $$0.a(
         cma.u,
         ImmutableList.of(
            Pair.of(0, buw.a(bqr.bx, 6.0F, bob.a(30, 60))),
            Pair.of(1, bvi.a(ceo::b, $$0x -> $$0x.dQ().c(cah.B))),
            Pair.of(2, bvu.a(8, 1.0F)),
            Pair.of(3, bvw.a(dcx.tn)),
            Pair.of(4, new but(ImmutableList.of(Pair.of(buo.a(1.0F), 2), Pair.of(bvd.a(1.0F, 3), 1), Pair.of(new btd(), 2), Pair.of(bwj.a(bql::aC), 1))))
         ),
         ImmutableSet.of(Pair.of(cah.T, cai.b), Pair.of(cah.Y, cai.a))
      );
   }

   private static void f(bsf<cen> $$0) {
      $$0.a(
         cma.q,
         ImmutableList.of(Pair.of(0, new btx(e, auz.jM)), Pair.of(1, new bty<>(e, 2, 4, 3.5714288F, $$0x -> auz.jL, avo.bL, 0.5F, ceo::a))),
         ImmutableSet.of(Pair.of(cah.O, cai.b), Pair.of(cah.r, cai.b), Pair.of(cah.S, cai.b), Pair.of(cah.X, cai.b))
      );
   }

   private static void g(bsf<cen> $$0) {
      $$0.a(cma.s, 0, ImmutableList.of(bvl.a(), new cep(auz.jN, auz.jI)), cah.o);
   }

   private static <E extends brg> boolean a(E $$0, im $$1) {
      czu $$2 = $$0.dN();
      im $$3 = $$1.d();
      if ($$2.b_($$1).c() && $$2.b_($$3).c() && $$2.b_($$1.c()).c()) {
         dpy $$4 = $$2.a_($$1);
         dpy $$5 = $$2.a_($$3);
         if (!$$4.a(avo.bL) && !$$5.a(avo.bL)) {
            emk $$6 = new emk($$0.dN(), $$0);
            emi $$7 = emn.a($$6, $$1.j());
            emi $$8 = emn.a($$6, $$3.j());
            return $$7 != emi.e && (!$$4.i() || $$8 != emi.e) ? btz.a($$0, $$1) : true;
         } else {
            return true;
         }
      } else {
         return false;
      }
   }

   private static boolean b(cen $$0) {
      return !bsy.a($$0);
   }

   public static void a(cen $$0) {
      $$0.dQ().a(ImmutableList.of(cma.s, cma.u, cma.q, cma.t, cma.b));
   }

   public static cwd a() {
      return cen.bY;
   }
}
