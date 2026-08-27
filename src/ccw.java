import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;

public class ccw {
   private static final float a = 2.0F;
   private static final float b = 1.0F;
   private static final float c = 1.0F;
   private static final float d = 0.75F;
   private static final bmn e = bmn.a(100, 140);
   private static final int f = 2;
   private static final int g = 4;
   private static final float h = 3.5714288F;
   private static final float i = 1.25F;

   protected static void a(ccv $$0, axd $$1) {
      $$0.dP().a(byr.S, e.a($$1));
   }

   protected static bqp<?> a(bqp<ccv> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      g($$0);
      f($$0);
      $$0.a(ImmutableSet.of(ckh.a));
      $$0.b(ckh.b);
      $$0.f();
      return $$0;
   }

   private static void b(bqp<ccv> $$0) {
      $$0.a(ckh.a, 0, ImmutableList.of(new brb(2.0F), new bsm(45, 90), new bsq(), new brm(byr.P), new brm(byr.S)));
   }

   private static void c(bqp<ccv> $$0) {
      $$0.a(
         ckh.b,
         ImmutableList.of(
            Pair.of(0, btg.a(bpc.bx, 6.0F, bmn.a(30, 60))),
            Pair.of(0, new bra(bpc.R)),
            Pair.of(1, new brt($$0x -> 1.25F)),
            Pair.of(2, bts.a(ccw::b, $$0x -> $$0x.dP().c(byr.B))),
            Pair.of(3, bud.a(6, 1.0F)),
            Pair.of(
               4,
               new btd(
                  ImmutableMap.of(byr.m, bys.b),
                  ImmutableList.of(Pair.of(bsy.a(1.0F), 1), Pair.of(btn.a(1.0F, 3), 1), Pair.of(new brn(), 3), Pair.of(but.a(bow::aC), 2))
               )
            )
         ),
         ImmutableSet.of(Pair.of(byr.T, bys.b), Pair.of(byr.X, bys.b))
      );
   }

   private static void d(bqp<ccv> $$0) {
      $$0.a(
         ckh.t,
         ImmutableList.of(
            Pair.of(0, btg.a(bpc.bx, 6.0F, bmn.a(30, 60))),
            Pair.of(1, new brt($$0x -> 1.25F)),
            Pair.of(2, bts.a(ccw::b, $$0x -> $$0x.dP().c(byr.B))),
            Pair.of(3, bud.a(8, 1.5F)),
            Pair.of(
               5,
               new bru(
                  ImmutableMap.of(byr.m, bys.b),
                  ImmutableSet.of(),
                  bru.a.a,
                  bru.b.b,
                  ImmutableList.of(Pair.of(bsy.c(0.75F), 1), Pair.of(bsy.a(1.0F, true), 1), Pair.of(btn.a(1.0F, 3), 1), Pair.of(but.a(bow::bf), 5))
               )
            )
         ),
         ImmutableSet.of(Pair.of(byr.T, bys.b), Pair.of(byr.X, bys.a))
      );
   }

   private static void e(bqp<ccv> $$0) {
      $$0.a(
         ckh.u,
         ImmutableList.of(
            Pair.of(0, btg.a(bpc.bx, 6.0F, bmn.a(30, 60))),
            Pair.of(1, bts.a(ccw::b, $$0x -> $$0x.dP().c(byr.B))),
            Pair.of(2, bue.a(8, 1.0F)),
            Pair.of(3, bug.a(dac.tn)),
            Pair.of(4, new btd(ImmutableList.of(Pair.of(bsy.a(1.0F), 2), Pair.of(btn.a(1.0F, 3), 1), Pair.of(new brn(), 2), Pair.of(but.a(bow::aC), 1))))
         ),
         ImmutableSet.of(Pair.of(byr.T, bys.b), Pair.of(byr.Y, bys.a))
      );
   }

   private static void f(bqp<ccv> $$0) {
      $$0.a(
         ckh.q,
         ImmutableList.of(Pair.of(0, new bsh(e, aty.jG)), Pair.of(1, new bsi<>(e, 2, 4, 3.5714288F, $$0x -> aty.jF, aun.bL, 0.5F, ccw::a))),
         ImmutableSet.of(Pair.of(byr.O, bys.b), Pair.of(byr.r, bys.b), Pair.of(byr.S, bys.b), Pair.of(byr.X, bys.b))
      );
   }

   private static void g(bqp<ccv> $$0) {
      $$0.a(ckh.s, 0, ImmutableList.of(btv.a(), new ccx(aty.jH, aty.jC)), byr.o);
   }

   private static <E extends bpq> boolean a(E $$0, ib $$1) {
      cwz $$2 = $$0.dM();
      ib $$3 = $$1.d();
      if ($$2.b_($$1).c() && $$2.b_($$3).c() && $$2.b_($$1.c()).c()) {
         dmz $$4 = $$2.a_($$1);
         dmz $$5 = $$2.a_($$3);
         if (!$$4.a(aun.bL) && !$$5.a(aun.bL)) {
            eiy $$6 = ejh.a($$2, $$1.j());
            eiy $$7 = ejh.a($$2, $$3.j());
            return $$6 != eiy.e && (!$$4.i() || $$7 != eiy.e) ? bsj.a($$0, $$1) : true;
         } else {
            return true;
         }
      } else {
         return false;
      }
   }

   private static boolean b(ccv $$0) {
      return !bri.a($$0);
   }

   public static void a(ccv $$0) {
      $$0.dP().a(ImmutableList.of(ckh.s, ckh.u, ckh.q, ckh.t, ckh.b));
   }

   public static ctk a() {
      return ccv.bX;
   }
}
