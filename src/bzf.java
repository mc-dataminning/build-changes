import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.function.Predicate;

public class bzf {
   private static final float a = 4.0F;
   private static final float b = 2.0F;
   private static final float c = 2.5F;
   private static final float d = 2.5F;
   private static final float e = 1.0F;
   private static final bjg f = bjg.a(5, 16);
   private static final ImmutableList<bwn<? extends bwm<? super bze>>> g = ImmutableList.of(bwn.c, bwn.f, bwn.s, bwn.n);
   private static final ImmutableList<bvh<?>> h = ImmutableList.of(
      bvh.Y, bvh.x, bvh.y, bvh.m, bvh.n, bvh.E, bvh.t, bvh.h, bvh.N, bvh.O, bvh.P, bvh.Q, new bvh[]{bvh.r, bvh.J}
   );

   protected static void a(bze $$0, aup $$1) {
   }

   public static bnf.b<bze> a() {
      return bnf.a(h, g);
   }

   protected static bnf<?> a(bnf<bze> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(cgn.a));
      $$0.b(cgn.b);
      $$0.f();
      return $$0;
   }

   private static void b(bnf<bze> $$0) {
      $$0.a(cgn.a, 0, ImmutableList.of(new bqq(0.8F), new bzf.a(4.0F), new bpc(45, 90), new bpg(), new boc(bvh.O), new boc(bvh.P)));
   }

   private static void c(bnf<bze> $$0) {
      $$0.a(
         cgn.b,
         ImmutableList.of(
            Pair.of(0, bpw.a(blt.bv, 6.0F, bjg.a(30, 60))),
            Pair.of(1, new bnq(blt.m, 1.0F)),
            Pair.of(
               2,
               new bpt(
                  ImmutableList.of(Pair.of(new boj($$0x -> 2.5F, $$0x -> $$0x.o_() ? 2.5 : 3.5), 1), Pair.of(brj.a(Predicate.not(bze::w), bnt.a(f, 2.5F)), 1))
               )
            ),
            Pair.of(3, new bpn(bjg.a(150, 250), 30.0F, 0.0F, 0.0F)),
            Pair.of(
               4,
               new bpt(
                  ImmutableMap.of(bvh.m, bvi.b),
                  ImmutableList.of(
                     Pair.of(brj.a(Predicate.not(bze::w), bpo.a(2.0F)), 1),
                     Pair.of(brj.a(Predicate.not(bze::w), bqd.a(2.0F, 3)), 1),
                     Pair.of(new bzf.b(20), 1),
                     Pair.of(new bog(30, 60), 1)
                  )
               )
            )
         )
      );
   }

   public static void a(bze $$0) {
      $$0.dO().a(ImmutableList.of(cgn.b));
   }

   public static cps b() {
      return bze.bT;
   }

   public static class a extends bnr {
      public a(float $$0) {
         super($$0);
      }

      @Override
      protected void b(amz $$0, bmo $$1, long $$2) {
         if ($$1 instanceof bze $$3) {
            $$3.gr();
         }

         super.b($$0, $$1, $$2);
      }
   }

   public static class b extends bnw<bze> {
      private final int c;

      public b(int $$0) {
         super(ImmutableMap.of());
         this.c = $$0 * 20;
      }

      protected boolean a(amz $$0, bze $$1) {
         return !$$1.aZ() && $$1.gs() >= (long)this.c && !$$1.fS() && $$1.aC() && !$$1.cO() && $$1.ge();
      }

      protected void a(amz $$0, bze $$1, long $$2) {
         if ($$1.gm()) {
            $$1.gq();
         } else if (!$$1.gb()) {
            $$1.gp();
         }
      }
   }
}
