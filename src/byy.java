import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;

public class byy {
   private static final float a = 2.0F;
   private static final float b = 1.0F;
   private static final float c = 1.0F;
   private static final float d = 1.0F;
   private static final float e = 0.75F;
   private static final biw f = biw.a(100, 140);
   private static final int g = 2;
   private static final int h = 4;
   private static final float i = 1.5F;
   private static final float j = 1.25F;

   protected static void a(byx $$0, auf $$1) {
      $$0.dO().a(bux.R, f.a($$1));
   }

   protected static bmv<?> a(bmv<byx> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      g($$0);
      f($$0);
      $$0.a(ImmutableSet.of(cgd.a));
      $$0.b(cgd.b);
      $$0.f();
      return $$0;
   }

   private static void b(bmv<byx> $$0) {
      $$0.a(cgd.a, 0, ImmutableList.of(new bnh(2.0F), new bos(45, 90), new bow(), new bns(bux.O), new bns(bux.R)));
   }

   private static void c(bmv<byx> $$0) {
      $$0.a(
         cgd.b,
         ImmutableList.of(
            Pair.of(0, bpm.a(blj.bv, 6.0F, biw.a(30, 60))),
            Pair.of(0, new bng(blj.P, 1.0F)),
            Pair.of(1, new bnz($$0x -> 1.25F)),
            Pair.of(2, bpy.a(byy::b, $$0x -> $$0x.dO().c(bux.B))),
            Pair.of(3, bqj.a(6, 1.0F)),
            Pair.of(
               4,
               new bpj(
                  ImmutableMap.of(bux.m, buy.b),
                  ImmutableList.of(Pair.of(bpe.a(1.0F), 1), Pair.of(bpt.a(1.0F, 3), 1), Pair.of(new bnt(), 3), Pair.of(bqz.a(blf::aC), 2))
               )
            )
         ),
         ImmutableSet.of(Pair.of(bux.S, buy.b), Pair.of(bux.W, buy.b))
      );
   }

   private static void d(bmv<byx> $$0) {
      $$0.a(
         cgd.t,
         ImmutableList.of(
            Pair.of(0, bpm.a(blj.bv, 6.0F, biw.a(30, 60))),
            Pair.of(1, new bnz($$0x -> 1.25F)),
            Pair.of(2, bpy.a(byy::b, $$0x -> $$0x.dO().c(bux.B))),
            Pair.of(3, bqj.a(8, 1.5F)),
            Pair.of(
               5,
               new boa(
                  ImmutableMap.of(bux.m, buy.b),
                  ImmutableSet.of(),
                  boa.a.a,
                  boa.b.b,
                  ImmutableList.of(Pair.of(bpe.c(0.75F), 1), Pair.of(bpe.a(1.0F, true), 1), Pair.of(bpt.a(1.0F, 3), 1), Pair.of(bqz.a(blf::bc), 5))
               )
            )
         ),
         ImmutableSet.of(Pair.of(bux.S, buy.b), Pair.of(bux.W, buy.a))
      );
   }

   private static void e(bmv<byx> $$0) {
      $$0.a(
         cgd.u,
         ImmutableList.of(
            Pair.of(0, bpm.a(blj.bv, 6.0F, biw.a(30, 60))),
            Pair.of(1, bpy.a(byy::b, $$0x -> $$0x.dO().c(bux.B))),
            Pair.of(2, bqk.a(8, 1.0F)),
            Pair.of(3, bqm.a(cwb.tn)),
            Pair.of(4, new bpj(ImmutableList.of(Pair.of(bpe.a(1.0F), 2), Pair.of(bpt.a(1.0F, 3), 1), Pair.of(new bnt(), 2), Pair.of(bqz.a(blf::aC), 1))))
         ),
         ImmutableSet.of(Pair.of(bux.S, buy.b), Pair.of(bux.X, buy.a))
      );
   }

   private static void f(bmv<byx> $$0) {
      $$0.a(
         cgd.q,
         ImmutableList.of(Pair.of(0, new bon(f, arc.jn)), Pair.of(1, new boo<>(f, 2, 4, 1.5F, $$0x -> arc.jm, arr.bK, 0.5F, byy::a))),
         ImmutableSet.of(Pair.of(bux.N, buy.b), Pair.of(bux.r, buy.b), Pair.of(bux.R, buy.b), Pair.of(bux.W, buy.b))
      );
   }

   private static void g(bmv<byx> $$0) {
      $$0.a(cgd.s, 0, ImmutableList.of(bqb.a(), new byz(arc.jo, arc.jj)), bux.o);
   }

   private static <E extends blx> boolean a(E $$0, hv $$1) {
      csy $$2 = $$0.dM();
      hv $$3 = $$1.d();
      if ($$2.b_($$1).c() && $$2.b_($$3).c() && $$2.b_($$1.c()).c()) {
         dip $$4 = $$2.a_($$1);
         dip $$5 = $$2.a_($$3);
         if (!$$4.a(arr.bK) && !$$5.a(arr.bK)) {
            eek $$6 = eet.a($$2, $$1.j());
            eek $$7 = eet.a($$2, $$3.j());
            return $$6 != eek.e && (!$$4.i() || $$7 != eek.e) ? bop.a($$0, $$1) : true;
         } else {
            return true;
         }
      } else {
         return false;
      }
   }

   private static boolean b(byx $$0) {
      return !bno.a($$0);
   }

   public static void a(byx $$0) {
      $$0.dO().a(ImmutableList.of(cgd.s, cgd.u, cgd.q, cgd.t, cgd.b));
   }

   public static cpi a() {
      return byx.bT;
   }
}
