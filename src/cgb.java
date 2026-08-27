import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.function.Predicate;

public class cgb {
   private static final float a = 2.0F;
   private static final float b = 1.0F;
   private static final float c = 1.0F;
   private static final float d = 0.75F;
   private static final bph e = bph.a(100, 140);
   private static final int f = 2;
   private static final int g = 4;
   private static final float h = 3.5714288F;
   private static final float i = 1.25F;

   protected static void a(cga $$0, aym $$1) {
      $$0.dS().a(cbu.S, e.a($$1));
   }

   protected static bts<?> a(bts<cga> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      g($$0);
      f($$0);
      $$0.a(ImmutableSet.of(cnn.a));
      $$0.b(cnn.b);
      $$0.f();
      return $$0;
   }

   private static void b(bts<cga> $$0) {
      $$0.a(cnn.a, 0, ImmutableList.of(new bue(2.0F), new bvp(45, 90), new bvt(), new bup(cbu.P), new bup(cbu.S)));
   }

   private static void c(bts<cga> $$0) {
      $$0.a(
         cnn.b,
         ImmutableList.of(
            Pair.of(0, bwj.a(bsc.by, 6.0F, bph.a(30, 60))),
            Pair.of(0, new bud(bsc.R)),
            Pair.of(1, new buw($$0x -> 1.25F)),
            Pair.of(2, bwv.a(cgb::b, $$0x -> $$0x.dS().c(cbu.B))),
            Pair.of(3, bxg.a(6, 1.0F)),
            Pair.of(
               4,
               new bwg(
                  ImmutableMap.of(cbu.m, cbv.b),
                  ImmutableList.of(Pair.of(bwb.a(1.0F), 1), Pair.of(bwq.a(1.0F, 3), 1), Pair.of(new buq(), 3), Pair.of(bxw.a(brw::aE), 2))
               )
            )
         ),
         ImmutableSet.of(Pair.of(cbu.T, cbv.b), Pair.of(cbu.X, cbv.b))
      );
   }

   private static void d(bts<cga> $$0) {
      $$0.a(
         cnn.t,
         ImmutableList.of(
            Pair.of(0, bwj.a(bsc.by, 6.0F, bph.a(30, 60))),
            Pair.of(1, new buw($$0x -> 1.25F)),
            Pair.of(2, bwv.a(cgb::b, $$0x -> $$0x.dS().c(cbu.B))),
            Pair.of(3, bxg.a(8, 1.5F)),
            Pair.of(
               5,
               new bux(
                  ImmutableMap.of(cbu.m, cbv.b),
                  ImmutableSet.of(),
                  bux.a.a,
                  bux.b.b,
                  ImmutableList.of(Pair.of(bwb.c(0.75F), 1), Pair.of(bwb.a(1.0F, true), 1), Pair.of(bwq.a(1.0F, 3), 1), Pair.of(bxw.a(brw::bh), 5))
               )
            )
         ),
         ImmutableSet.of(Pair.of(cbu.T, cbv.b), Pair.of(cbu.X, cbv.a))
      );
   }

   private static void e(bts<cga> $$0) {
      $$0.a(
         cnn.u,
         ImmutableList.of(
            Pair.of(0, bwj.a(bsc.by, 6.0F, bph.a(30, 60))),
            Pair.of(1, bwv.a(cgb::b, $$0x -> $$0x.dS().c(cbu.B))),
            Pair.of(2, bxh.a(8, 1.0F)),
            Pair.of(3, bxj.a(dec.tn)),
            Pair.of(4, new bwg(ImmutableList.of(Pair.of(bwb.a(1.0F), 2), Pair.of(bwq.a(1.0F, 3), 1), Pair.of(new buq(), 2), Pair.of(bxw.a(brw::aE), 1))))
         ),
         ImmutableSet.of(Pair.of(cbu.T, cbv.b), Pair.of(cbu.Y, cbv.a))
      );
   }

   private static void f(bts<cga> $$0) {
      $$0.a(
         cnn.q,
         ImmutableList.of(Pair.of(0, new bvk(e, avi.jR)), Pair.of(1, new bvl<>(e, 2, 4, 3.5714288F, $$0x -> avi.jQ, avx.bR, 0.5F, cgb::a))),
         ImmutableSet.of(Pair.of(cbu.O, cbv.b), Pair.of(cbu.r, cbv.b), Pair.of(cbu.S, cbv.b), Pair.of(cbu.X, cbv.b))
      );
   }

   private static void g(bts<cga> $$0) {
      $$0.a(cnn.s, 0, ImmutableList.of(bwy.a(), new cgc(avi.jS, avi.jN)), cbu.o);
   }

   private static <E extends bss> boolean a(E $$0, io $$1) {
      daz $$2 = $$0.dP();
      io $$3 = $$1.d();
      if ($$2.b_($$1).c() && $$2.b_($$3).c() && $$2.b_($$1.c()).c()) {
         drd $$4 = $$2.a_($$1);
         drd $$5 = $$2.a_($$3);
         if (!$$4.a(avx.bR) && !$$5.a(avx.bR)) {
            enp $$6 = new enp($$0.dP(), $$0);
            enn $$7 = ens.a($$6, $$1.j());
            enn $$8 = ens.a($$6, $$3.j());
            return $$7 != enn.e && (!$$4.i() || $$8 != enn.e) ? bvm.a($$0, $$1) : true;
         } else {
            return true;
         }
      } else {
         return false;
      }
   }

   private static boolean b(cga $$0) {
      return !bul.a($$0);
   }

   public static void a(cga $$0) {
      $$0.dS().a(ImmutableList.of(cnn.s, cnn.u, cnn.q, cnn.t, cnn.b));
   }

   public static Predicate<ctq> a() {
      return $$0 -> $$0.a(awf.al);
   }
}
