import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.function.Predicate;

public class cgz {
   private static final float a = 2.0F;
   private static final float b = 1.0F;
   private static final float c = 1.0F;
   private static final float d = 0.75F;
   private static final bqe e = bqe.a(100, 140);
   private static final int f = 2;
   private static final int g = 4;
   private static final float h = 3.5714288F;
   private static final float i = 1.25F;

   protected static void a(cgy $$0, azg $$1) {
      $$0.dS().a(ccs.S, e.a($$1));
   }

   protected static buq<?> a(buq<cgy> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      g($$0);
      f($$0);
      $$0.a(ImmutableSet.of(col.a));
      $$0.b(col.b);
      $$0.f();
      return $$0;
   }

   private static void b(buq<cgy> $$0) {
      $$0.a(col.a, 0, ImmutableList.of(new bvc(2.0F), new bwn(45, 90), new bwr(), new bvn(ccs.P), new bvn(ccs.S)));
   }

   private static void c(buq<cgy> $$0) {
      $$0.a(
         col.b,
         ImmutableList.of(
            Pair.of(0, bxh.a(bsz.by, 6.0F, bqe.a(30, 60))),
            Pair.of(0, new bvb(bsz.R)),
            Pair.of(1, new bvu($$0x -> 1.25F)),
            Pair.of(2, bxt.a(cgz::b, $$0x -> $$0x.dS().c(ccs.B))),
            Pair.of(3, bye.a(6, 1.0F)),
            Pair.of(
               4,
               new bxe(
                  ImmutableMap.of(ccs.m, cct.b),
                  ImmutableList.of(Pair.of(bwz.a(1.0F), 1), Pair.of(bxo.a(1.0F, 3), 1), Pair.of(new bvo(), 3), Pair.of(byu.a(bst::aE), 2))
               )
            )
         ),
         ImmutableSet.of(Pair.of(ccs.T, cct.b), Pair.of(ccs.X, cct.b))
      );
   }

   private static void d(buq<cgy> $$0) {
      $$0.a(
         col.t,
         ImmutableList.of(
            Pair.of(0, bxh.a(bsz.by, 6.0F, bqe.a(30, 60))),
            Pair.of(1, new bvu($$0x -> 1.25F)),
            Pair.of(2, bxt.a(cgz::b, $$0x -> $$0x.dS().c(ccs.B))),
            Pair.of(3, bye.a(8, 1.5F)),
            Pair.of(
               5,
               new bvv(
                  ImmutableMap.of(ccs.m, cct.b),
                  ImmutableSet.of(),
                  bvv.a.a,
                  bvv.b.b,
                  ImmutableList.of(Pair.of(bwz.c(0.75F), 1), Pair.of(bwz.a(1.0F, true), 1), Pair.of(bxo.a(1.0F, 3), 1), Pair.of(byu.a(bst::bh), 5))
               )
            )
         ),
         ImmutableSet.of(Pair.of(ccs.T, cct.b), Pair.of(ccs.X, cct.a))
      );
   }

   private static void e(buq<cgy> $$0) {
      $$0.a(
         col.u,
         ImmutableList.of(
            Pair.of(0, bxh.a(bsz.by, 6.0F, bqe.a(30, 60))),
            Pair.of(1, bxt.a(cgz::b, $$0x -> $$0x.dS().c(ccs.B))),
            Pair.of(2, byf.a(8, 1.0F)),
            Pair.of(3, byh.a(dfa.tn)),
            Pair.of(4, new bxe(ImmutableList.of(Pair.of(bwz.a(1.0F), 2), Pair.of(bxo.a(1.0F, 3), 1), Pair.of(new bvo(), 2), Pair.of(byu.a(bst::aE), 1))))
         ),
         ImmutableSet.of(Pair.of(ccs.T, cct.b), Pair.of(ccs.Y, cct.a))
      );
   }

   private static void f(buq<cgy> $$0) {
      $$0.a(
         col.q,
         ImmutableList.of(Pair.of(0, new bwi(e, avz.jR)), Pair.of(1, new bwj<>(e, 2, 4, 3.5714288F, $$0x -> avz.jQ, awo.bR, 0.5F, cgz::a))),
         ImmutableSet.of(Pair.of(ccs.O, cct.b), Pair.of(ccs.r, cct.b), Pair.of(ccs.S, cct.b), Pair.of(ccs.X, cct.b))
      );
   }

   private static void g(buq<cgy> $$0) {
      $$0.a(col.s, 0, ImmutableList.of(bxw.a(), new cha(avz.jS, avz.jN)), ccs.o);
   }

   private static <E extends btq> boolean a(E $$0, iz $$1) {
      dbx $$2 = $$0.dP();
      iz $$3 = $$1.d();
      if ($$2.b_($$1).c() && $$2.b_($$3).c() && $$2.b_($$1.c()).c()) {
         dsb $$4 = $$2.a_($$1);
         dsb $$5 = $$2.a_($$3);
         if (!$$4.a(awo.bR) && !$$5.a(awo.bR)) {
            eon $$6 = new eon($$0.dP(), $$0);
            eol $$7 = eoq.a($$6, $$1.j());
            eol $$8 = eoq.a($$6, $$3.j());
            return $$7 != eol.e && (!$$4.i() || $$8 != eol.e) ? bwk.a($$0, $$1) : true;
         } else {
            return true;
         }
      } else {
         return false;
      }
   }

   private static boolean b(cgy $$0) {
      return !bvj.a($$0);
   }

   public static void a(cgy $$0) {
      $$0.dS().a(ImmutableList.of(col.s, col.u, col.q, col.t, col.b));
   }

   public static Predicate<cuo> a() {
      return $$0 -> $$0.a(awx.al);
   }
}
