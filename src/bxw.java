import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.function.Predicate;

public class bxw {
   private static final float a = 4.0F;
   private static final float b = 2.0F;
   private static final float c = 2.5F;
   private static final float d = 2.5F;
   private static final float e = 1.0F;
   private static final bib f = bib.a(5, 16);
   private static final ImmutableList<bve<? extends bvd<? super bxv>>> g = ImmutableList.of(bve.c, bve.f, bve.s, bve.n);
   private static final ImmutableList<btz<?>> h = ImmutableList.of(
      btz.Y, btz.x, btz.y, btz.m, btz.n, btz.E, btz.t, btz.h, btz.N, btz.O, btz.P, btz.Q, new btz[]{btz.r, btz.J}
   );

   protected static void a(bxv $$0, ato $$1) {
   }

   public static bly.b<bxv> a() {
      return bly.a(h, g);
   }

   protected static bly<?> a(bly<bxv> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(cex.a));
      $$0.b(cex.b);
      $$0.f();
      return $$0;
   }

   private static void b(bly<bxv> $$0) {
      $$0.a(cex.a, 0, ImmutableList.of(new bpi(0.8F), new bxw.a(4.0F), new bnu(45, 90), new bny(), new bmv(btz.O), new bmv(btz.P)));
   }

   private static void c(bly<bxv> $$0) {
      $$0.a(
         cex.b,
         ImmutableList.of(
            Pair.of(0, boo.a(bkm.bt, 6.0F, bib.a(30, 60))),
            Pair.of(1, new bmj(bkm.l, 1.0F)),
            Pair.of(
               2,
               new bol(
                  ImmutableList.of(Pair.of(new bnc($$0x -> 2.5F, $$0x -> $$0x.n_() ? 2.5 : 3.5), 1), Pair.of(bqb.a(Predicate.not(bxv::t), bmm.a(f, 2.5F)), 1))
               )
            ),
            Pair.of(3, new bof(bib.a(150, 250), 30.0F, 0.0F, 0.0F)),
            Pair.of(
               4,
               new bol(
                  ImmutableMap.of(btz.m, bua.b),
                  ImmutableList.of(
                     Pair.of(bqb.a(Predicate.not(bxv::t), bog.a(2.0F)), 1),
                     Pair.of(bqb.a(Predicate.not(bxv::t), bov.a(2.0F, 3)), 1),
                     Pair.of(new bxw.b(20), 1),
                     Pair.of(new bmz(30, 60), 1)
                  )
               )
            )
         )
      );
   }

   public static void a(bxv $$0) {
      $$0.dN().a(ImmutableList.of(cex.b));
   }

   public static coc b() {
      return bxv.bT;
   }

   public static class a extends bmk {
      public a(float $$0) {
         super($$0);
      }

      @Override
      protected void b(ama $$0, blh $$1, long $$2) {
         if ($$1 instanceof bxv $$3) {
            $$3.gr();
         }

         super.b($$0, $$1, $$2);
      }
   }

   public static class b extends bmp<bxv> {
      private final int c;

      public b(int $$0) {
         super(ImmutableMap.of());
         this.c = $$0 * 20;
      }

      protected boolean a(ama $$0, bxv $$1) {
         return !$$1.aX() && $$1.gs() >= (long)this.c && !$$1.fS() && $$1.aA() && !$$1.cO() && $$1.ge();
      }

      protected void a(ama $$0, bxv $$1, long $$2) {
         if ($$1.gm()) {
            $$1.gq();
         } else if (!$$1.gb()) {
            $$1.gp();
         }
      }
   }
}
