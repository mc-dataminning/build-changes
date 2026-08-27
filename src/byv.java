import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.function.Predicate;

public class byv {
   private static final float a = 4.0F;
   private static final float b = 2.0F;
   private static final float c = 2.5F;
   private static final float d = 2.5F;
   private static final float e = 1.0F;
   private static final biw f = biw.a(5, 16);
   private static final ImmutableList<bwd<? extends bwc<? super byu>>> g = ImmutableList.of(bwd.c, bwd.f, bwd.s, bwd.n);
   private static final ImmutableList<bux<?>> h = ImmutableList.of(
      bux.Y, bux.x, bux.y, bux.m, bux.n, bux.E, bux.t, bux.h, bux.N, bux.O, bux.P, bux.Q, new bux[]{bux.r, bux.J}
   );

   protected static void a(byu $$0, auf $$1) {
   }

   public static bmv.b<byu> a() {
      return bmv.a(h, g);
   }

   protected static bmv<?> a(bmv<byu> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(cgd.a));
      $$0.b(cgd.b);
      $$0.f();
      return $$0;
   }

   private static void b(bmv<byu> $$0) {
      $$0.a(cgd.a, 0, ImmutableList.of(new bqg(0.8F), new byv.a(4.0F), new bos(45, 90), new bow(), new bns(bux.O), new bns(bux.P)));
   }

   private static void c(bmv<byu> $$0) {
      $$0.a(
         cgd.b,
         ImmutableList.of(
            Pair.of(0, bpm.a(blj.bv, 6.0F, biw.a(30, 60))),
            Pair.of(1, new bng(blj.m, 1.0F)),
            Pair.of(
               2,
               new bpj(
                  ImmutableList.of(Pair.of(new bnz($$0x -> 2.5F, $$0x -> $$0x.o_() ? 2.5 : 3.5), 1), Pair.of(bqz.a(Predicate.not(byu::w), bnj.a(f, 2.5F)), 1))
               )
            ),
            Pair.of(3, new bpd(biw.a(150, 250), 30.0F, 0.0F, 0.0F)),
            Pair.of(
               4,
               new bpj(
                  ImmutableMap.of(bux.m, buy.b),
                  ImmutableList.of(
                     Pair.of(bqz.a(Predicate.not(byu::w), bpe.a(2.0F)), 1),
                     Pair.of(bqz.a(Predicate.not(byu::w), bpt.a(2.0F, 3)), 1),
                     Pair.of(new byv.b(20), 1),
                     Pair.of(new bnw(30, 60), 1)
                  )
               )
            )
         )
      );
   }

   public static void a(byu $$0) {
      $$0.dO().a(ImmutableList.of(cgd.b));
   }

   public static cpi b() {
      return byu.bT;
   }

   public static class a extends bnh {
      public a(float $$0) {
         super($$0);
      }

      @Override
      protected void b(amp $$0, bme $$1, long $$2) {
         if ($$1 instanceof byu $$3) {
            $$3.gr();
         }

         super.b($$0, $$1, $$2);
      }
   }

   public static class b extends bnm<byu> {
      private final int c;

      public b(int $$0) {
         super(ImmutableMap.of());
         this.c = $$0 * 20;
      }

      protected boolean a(amp $$0, byu $$1) {
         return !$$1.aZ() && $$1.gs() >= (long)this.c && !$$1.fS() && $$1.aC() && !$$1.cO() && $$1.ge();
      }

      protected void a(amp $$0, byu $$1, long $$2) {
         if ($$1.gm()) {
            $$1.gq();
         } else if (!$$1.gb()) {
            $$1.gp();
         }
      }
   }
}
