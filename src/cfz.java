import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.function.Predicate;

public class cfz {
   private static final float a = 2.0F;
   private static final float b = 1.0F;
   private static final float c = 1.0F;
   private static final float d = 0.75F;
   private static final bpf e = bpf.a(100, 140);
   private static final int f = 2;
   private static final int g = 4;
   private static final float h = 3.5714288F;
   private static final float i = 1.25F;

   protected static void a(cfy $$0, ayk $$1) {
      $$0.dS().a(cbs.S, e.a($$1));
   }

   protected static btq<?> a(btq<cfy> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      g($$0);
      f($$0);
      $$0.a(ImmutableSet.of(cnl.a));
      $$0.b(cnl.b);
      $$0.f();
      return $$0;
   }

   private static void b(btq<cfy> $$0) {
      $$0.a(cnl.a, 0, ImmutableList.of(new buc(2.0F), new bvn(45, 90), new bvr(), new bun(cbs.P), new bun(cbs.S)));
   }

   private static void c(btq<cfy> $$0) {
      $$0.a(
         cnl.b,
         ImmutableList.of(
            Pair.of(0, bwh.a(bsa.by, 6.0F, bpf.a(30, 60))),
            Pair.of(0, new bub(bsa.R)),
            Pair.of(1, new buu($$0x -> 1.25F)),
            Pair.of(2, bwt.a(cfz::b, $$0x -> $$0x.dS().c(cbs.B))),
            Pair.of(3, bxe.a(6, 1.0F)),
            Pair.of(
               4,
               new bwe(
                  ImmutableMap.of(cbs.m, cbt.b),
                  ImmutableList.of(Pair.of(bvz.a(1.0F), 1), Pair.of(bwo.a(1.0F, 3), 1), Pair.of(new buo(), 3), Pair.of(bxu.a(bru::aE), 2))
               )
            )
         ),
         ImmutableSet.of(Pair.of(cbs.T, cbt.b), Pair.of(cbs.X, cbt.b))
      );
   }

   private static void d(btq<cfy> $$0) {
      $$0.a(
         cnl.t,
         ImmutableList.of(
            Pair.of(0, bwh.a(bsa.by, 6.0F, bpf.a(30, 60))),
            Pair.of(1, new buu($$0x -> 1.25F)),
            Pair.of(2, bwt.a(cfz::b, $$0x -> $$0x.dS().c(cbs.B))),
            Pair.of(3, bxe.a(8, 1.5F)),
            Pair.of(
               5,
               new buv(
                  ImmutableMap.of(cbs.m, cbt.b),
                  ImmutableSet.of(),
                  buv.a.a,
                  buv.b.b,
                  ImmutableList.of(Pair.of(bvz.c(0.75F), 1), Pair.of(bvz.a(1.0F, true), 1), Pair.of(bwo.a(1.0F, 3), 1), Pair.of(bxu.a(bru::bh), 5))
               )
            )
         ),
         ImmutableSet.of(Pair.of(cbs.T, cbt.b), Pair.of(cbs.X, cbt.a))
      );
   }

   private static void e(btq<cfy> $$0) {
      $$0.a(
         cnl.u,
         ImmutableList.of(
            Pair.of(0, bwh.a(bsa.by, 6.0F, bpf.a(30, 60))),
            Pair.of(1, bwt.a(cfz::b, $$0x -> $$0x.dS().c(cbs.B))),
            Pair.of(2, bxf.a(8, 1.0F)),
            Pair.of(3, bxh.a(dea.tn)),
            Pair.of(4, new bwe(ImmutableList.of(Pair.of(bvz.a(1.0F), 2), Pair.of(bwo.a(1.0F, 3), 1), Pair.of(new buo(), 2), Pair.of(bxu.a(bru::aE), 1))))
         ),
         ImmutableSet.of(Pair.of(cbs.T, cbt.b), Pair.of(cbs.Y, cbt.a))
      );
   }

   private static void f(btq<cfy> $$0) {
      $$0.a(
         cnl.q,
         ImmutableList.of(Pair.of(0, new bvi(e, avh.jR)), Pair.of(1, new bvj<>(e, 2, 4, 3.5714288F, $$0x -> avh.jQ, avw.bR, 0.5F, cfz::a))),
         ImmutableSet.of(Pair.of(cbs.O, cbt.b), Pair.of(cbs.r, cbt.b), Pair.of(cbs.S, cbt.b), Pair.of(cbs.X, cbt.b))
      );
   }

   private static void g(btq<cfy> $$0) {
      $$0.a(cnl.s, 0, ImmutableList.of(bww.a(), new cga(avh.jS, avh.jN)), cbs.o);
   }

   private static <E extends bsq> boolean a(E $$0, io $$1) {
      dax $$2 = $$0.dP();
      io $$3 = $$1.d();
      if ($$2.b_($$1).c() && $$2.b_($$3).c() && $$2.b_($$1.c()).c()) {
         drb $$4 = $$2.a_($$1);
         drb $$5 = $$2.a_($$3);
         if (!$$4.a(avw.bR) && !$$5.a(avw.bR)) {
            enn $$6 = new enn($$0.dP(), $$0);
            enl $$7 = enq.a($$6, $$1.j());
            enl $$8 = enq.a($$6, $$3.j());
            return $$7 != enl.e && (!$$4.i() || $$8 != enl.e) ? bvk.a($$0, $$1) : true;
         } else {
            return true;
         }
      } else {
         return false;
      }
   }

   private static boolean b(cfy $$0) {
      return !buj.a($$0);
   }

   public static void a(cfy $$0) {
      $$0.dS().a(ImmutableList.of(cnl.s, cnl.u, cnl.q, cnl.t, cnl.b));
   }

   public static Predicate<cto> a() {
      return $$0 -> $$0.a(awe.al);
   }
}
