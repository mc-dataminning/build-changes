import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.function.Predicate;

public class bxh {
   private static final float a = 4.0F;
   private static final float b = 2.0F;
   private static final float c = 2.5F;
   private static final float d = 2.5F;
   private static final float e = 1.0F;
   private static final bhm f = bhm.a(5, 16);
   private static final ImmutableList<bup<? extends buo<? super bxg>>> g = ImmutableList.of(bup.c, bup.f, bup.s, bup.n);
   private static final ImmutableList<btk<?>> h = ImmutableList.of(
      btk.Y, btk.x, btk.y, btk.m, btk.n, btk.E, btk.t, btk.h, btk.N, btk.O, btk.P, btk.Q, new btk[]{btk.r, btk.J}
   );

   protected static void a(bxg $$0, ate $$1) {
   }

   public static blj.b<bxg> a() {
      return blj.a(h, g);
   }

   protected static blj<?> a(blj<bxg> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(cei.a));
      $$0.b(cei.b);
      $$0.f();
      return $$0;
   }

   private static void b(blj<bxg> $$0) {
      $$0.a(cei.a, 0, ImmutableList.of(new bot(0.8F), new bxh.a(4.0F), new bnf(45, 90), new bnj(), new bmg(btk.O), new bmg(btk.P)));
   }

   private static void c(blj<bxg> $$0) {
      $$0.a(
         cei.b,
         ImmutableList.of(
            Pair.of(0, bnz.a(bjx.bt, 6.0F, bhm.a(30, 60))),
            Pair.of(1, new blu(bjx.l, 1.0F)),
            Pair.of(
               2,
               new bnw(
                  ImmutableList.of(Pair.of(new bmn($$0x -> 2.5F, $$0x -> $$0x.n_() ? 2.5 : 3.5), 1), Pair.of(bpm.a(Predicate.not(bxg::t), blx.a(f, 2.5F)), 1))
               )
            ),
            Pair.of(3, new bnq(bhm.a(150, 250), 30.0F, 0.0F, 0.0F)),
            Pair.of(
               4,
               new bnw(
                  ImmutableMap.of(btk.m, btl.b),
                  ImmutableList.of(
                     Pair.of(bpm.a(Predicate.not(bxg::t), bnr.a(2.0F)), 1),
                     Pair.of(bpm.a(Predicate.not(bxg::t), bog.a(2.0F, 3)), 1),
                     Pair.of(new bxh.b(20), 1),
                     Pair.of(new bmk(30, 60), 1)
                  )
               )
            )
         )
      );
   }

   public static void a(bxg $$0) {
      $$0.dN().a(ImmutableList.of(cei.b));
   }

   public static cnk b() {
      return bxg.bT;
   }

   public static class a extends blv {
      public a(float $$0) {
         super($$0);
      }

      @Override
      protected void b(alq $$0, bks $$1, long $$2) {
         if ($$1 instanceof bxg $$3) {
            $$3.gr();
         }

         super.b($$0, $$1, $$2);
      }
   }

   public static class b extends bma<bxg> {
      private final int c;

      public b(int $$0) {
         super(ImmutableMap.of());
         this.c = $$0 * 20;
      }

      protected boolean a(alq $$0, bxg $$1) {
         return !$$1.aX() && $$1.gs() >= (long)this.c && !$$1.fS() && $$1.aA() && !$$1.cO() && $$1.ge();
      }

      protected void a(alq $$0, bxg $$1, long $$2) {
         if ($$1.gm()) {
            $$1.gq();
         } else if (!$$1.gb()) {
            $$1.gp();
         }
      }
   }
}
