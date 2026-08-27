import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.function.Predicate;

public class bvx {
   private static final float a = 4.0F;
   private static final float b = 2.0F;
   private static final float c = 2.5F;
   private static final float d = 2.5F;
   private static final float e = 1.0F;
   private static final bgb f = bgb.a(5, 16);
   private static final ImmutableList<btf<? extends bte<? super bvw>>> g = ImmutableList.of(btf.c, btf.f, btf.s, btf.n);
   private static final ImmutableList<bsa<?>> h = ImmutableList.of(
      bsa.Y, bsa.x, bsa.y, bsa.m, bsa.n, bsa.E, bsa.t, bsa.h, bsa.N, bsa.O, bsa.P, bsa.Q, new bsa[]{bsa.r, bsa.J}
   );

   protected static void a(bvw $$0, aru $$1) {
   }

   public static bjz.b<bvw> a() {
      return bjz.a(h, g);
   }

   protected static bjz<?> a(bjz<bvw> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(ccy.a));
      $$0.b(ccy.b);
      $$0.f();
      return $$0;
   }

   private static void b(bjz<bvw> $$0) {
      $$0.a(ccy.a, 0, ImmutableList.of(new bnj(0.8F), new bvx.a(4.0F), new blv(45, 90), new blz(), new bkw(bsa.O), new bkw(bsa.P)));
   }

   private static void c(bjz<bvw> $$0) {
      $$0.a(
         ccy.b,
         ImmutableList.of(
            Pair.of(0, bmp.a(bim.bt, 6.0F, bgb.a(30, 60))),
            Pair.of(1, new bkk(bim.l, 1.0F)),
            Pair.of(2, new bld($$0x -> 2.5F, $$0x -> $$0x.i_() ? 2.5 : 3.5)),
            Pair.of(3, boc.a(Predicate.not(bvw::q), bkn.a(f, 2.5F))),
            Pair.of(4, new bmg(bgb.a(150, 250), 30.0F, 0.0F, 0.0F)),
            Pair.of(
               5,
               new bmm(
                  ImmutableMap.of(bsa.m, bsb.b),
                  ImmutableList.of(
                     Pair.of(boc.a(Predicate.not(bvw::q), bmh.a(2.0F)), 1),
                     Pair.of(boc.a(Predicate.not(bvw::q), bmw.a(2.0F, 3)), 1),
                     Pair.of(new bvx.b(20), 1),
                     Pair.of(new bla(30, 60), 1)
                  )
               )
            )
         )
      );
   }

   public static void a(bvw $$0) {
      $$0.dM().a(ImmutableList.of(ccy.b));
   }

   public static cly b() {
      return bvw.bT;
   }

   public static class a extends bkl {
      public a(float $$0) {
         super($$0);
      }

      @Override
      protected void b(akk $$0, bjh $$1, long $$2) {
         if ($$1 instanceof bvw $$3) {
            $$3.gm();
         }

         super.b($$0, $$1, $$2);
      }
   }

   public static class b extends bkq<bvw> {
      private final int c;

      public b(int $$0) {
         super(ImmutableMap.of());
         this.c = $$0 * 20;
      }

      protected boolean a(akk $$0, bvw $$1) {
         return !$$1.aX() && $$1.gn() >= (long)this.c && !$$1.fO() && $$1.aA() && !$$1.cO() && $$1.fZ();
      }

      protected void a(akk $$0, bvw $$1, long $$2) {
         if ($$1.gh()) {
            $$1.gl();
         } else if (!$$1.fW()) {
            $$1.gk();
         }
      }
   }
}
