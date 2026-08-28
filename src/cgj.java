import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.function.Predicate;

public class cgj {
   private static final float a = 2.0F;
   private static final float b = 1.0F;
   private static final float c = 1.0F;
   private static final float d = 0.75F;
   private static final bpo e = bpo.a(100, 140);
   private static final int f = 2;
   private static final int g = 4;
   private static final float h = 3.5714288F;
   private static final float i = 1.25F;

   protected static void a(cgi $$0, aym $$1) {
      $$0.dT().a(ccc.S, e.a($$1));
   }

   protected static bua<?> a(bua<cgi> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      g($$0);
      f($$0);
      $$0.a(ImmutableSet.of(cnw.a));
      $$0.b(cnw.b);
      $$0.f();
      return $$0;
   }

   private static void b(bua<cgi> $$0) {
      $$0.a(cnw.a, 0, ImmutableList.of(new bum(2.0F), new bvx(45, 90), new bwb(), new bux(ccc.P), new bux(ccc.S)));
   }

   private static void c(bua<cgi> $$0) {
      $$0.a(
         cnw.b,
         ImmutableList.of(
            Pair.of(0, bwr.a(bsj.by, 6.0F, bpo.a(30, 60))),
            Pair.of(0, new bul(bsj.R)),
            Pair.of(1, new bve($$0x -> 1.25F)),
            Pair.of(2, bxd.a(cgj::b, $$0x -> $$0x.dT().c(ccc.B))),
            Pair.of(3, bxo.a(6, 1.0F)),
            Pair.of(
               4,
               new bwo(
                  ImmutableMap.of(ccc.m, ccd.b),
                  ImmutableList.of(Pair.of(bwj.a(1.0F), 1), Pair.of(bwy.a(1.0F, 3), 1), Pair.of(new buy(), 3), Pair.of(bye.a(bsd::aE), 2))
               )
            )
         ),
         ImmutableSet.of(Pair.of(ccc.T, ccd.b), Pair.of(ccc.X, ccd.b))
      );
   }

   private static void d(bua<cgi> $$0) {
      $$0.a(
         cnw.t,
         ImmutableList.of(
            Pair.of(0, bwr.a(bsj.by, 6.0F, bpo.a(30, 60))),
            Pair.of(1, new bve($$0x -> 1.25F)),
            Pair.of(2, bxd.a(cgj::b, $$0x -> $$0x.dT().c(ccc.B))),
            Pair.of(3, bxo.a(8, 1.5F)),
            Pair.of(
               5,
               new bvf(
                  ImmutableMap.of(ccc.m, ccd.b),
                  ImmutableSet.of(),
                  bvf.a.a,
                  bvf.b.b,
                  ImmutableList.of(Pair.of(bwj.c(0.75F), 1), Pair.of(bwj.a(1.0F, true), 1), Pair.of(bwy.a(1.0F, 3), 1), Pair.of(bye.a(bsd::bh), 5))
               )
            )
         ),
         ImmutableSet.of(Pair.of(ccc.T, ccd.b), Pair.of(ccc.X, ccd.a))
      );
   }

   private static void e(bua<cgi> $$0) {
      $$0.a(
         cnw.u,
         ImmutableList.of(
            Pair.of(0, bwr.a(bsj.by, 6.0F, bpo.a(30, 60))),
            Pair.of(1, bxd.a(cgj::b, $$0x -> $$0x.dT().c(ccc.B))),
            Pair.of(2, bxp.a(8, 1.0F)),
            Pair.of(3, bxr.a(dfh.tn)),
            Pair.of(4, new bwo(ImmutableList.of(Pair.of(bwj.a(1.0F), 2), Pair.of(bwy.a(1.0F, 3), 1), Pair.of(new buy(), 2), Pair.of(bye.a(bsd::aE), 1))))
         ),
         ImmutableSet.of(Pair.of(ccc.T, ccd.b), Pair.of(ccc.Y, ccd.a))
      );
   }

   private static void f(bua<cgi> $$0) {
      $$0.a(
         cnw.q,
         ImmutableList.of(Pair.of(0, new bvs(e, avf.jR)), Pair.of(1, new bvt<>(e, 2, 4, 3.5714288F, $$0x -> avf.jQ, avu.bR, 0.5F, cgj::a))),
         ImmutableSet.of(Pair.of(ccc.O, ccd.b), Pair.of(ccc.r, ccd.b), Pair.of(ccc.S, ccd.b), Pair.of(ccc.X, ccd.b))
      );
   }

   private static void g(bua<cgi> $$0) {
      $$0.a(cnw.s, 0, ImmutableList.of(bxg.a(), new cgk(avf.jS, avf.jN)), ccc.o);
   }

   private static <E extends bta> boolean a(E $$0, ja $$1) {
      dcd $$2 = $$0.dP();
      ja $$3 = $$1.d();
      if ($$2.b_($$1).c() && $$2.b_($$3).c() && $$2.b_($$1.c()).c()) {
         dsh $$4 = $$2.a_($$1);
         dsh $$5 = $$2.a_($$3);
         if (!$$4.a(avu.bR) && !$$5.a(avu.bR)) {
            eou $$6 = new eou($$0.dP(), $$0);
            eos $$7 = eox.a($$6, $$1.j());
            eos $$8 = eox.a($$6, $$3.j());
            return $$7 != eos.e && (!$$4.i() || $$8 != eos.e) ? bvu.a($$0, $$1) : true;
         } else {
            return true;
         }
      } else {
         return false;
      }
   }

   private static boolean b(cgi $$0) {
      return !but.a($$0);
   }

   public static void a(cgi $$0) {
      $$0.dT().a(ImmutableList.of(cnw.s, cnw.u, cnw.q, cnw.t, cnw.b));
   }

   public static Predicate<cua> a() {
      return $$0 -> $$0.a(awd.al);
   }
}
