import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.function.Predicate;

public class bzk {
   private static final float a = 4.0F;
   private static final float b = 2.0F;
   private static final float c = 2.5F;
   private static final float d = 2.5F;
   private static final float e = 1.0F;
   private static final bjl f = bjl.a(5, 16);
   private static final ImmutableList<bws<? extends bwr<? super bzj>>> g = ImmutableList.of(bws.c, bws.f, bws.s, bws.n);
   private static final ImmutableList<bvm<?>> h = ImmutableList.of(
      bvm.Y, bvm.x, bvm.y, bvm.m, bvm.n, bvm.E, bvm.t, bvm.h, bvm.N, bvm.O, bvm.P, bvm.Q, new bvm[]{bvm.r, bvm.J}
   );

   protected static void a(bzj $$0, auu $$1) {
   }

   public static bnk.b<bzj> a() {
      return bnk.a(h, g);
   }

   protected static bnk<?> a(bnk<bzj> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(cgt.a));
      $$0.b(cgt.b);
      $$0.f();
      return $$0;
   }

   private static void b(bnk<bzj> $$0) {
      $$0.a(cgt.a, 0, ImmutableList.of(new bqv(0.8F), new bzk.a(4.0F), new bph(45, 90), new bpl(), new boh(bvm.O), new boh(bvm.P)));
   }

   private static void c(bnk<bzj> $$0) {
      $$0.a(
         cgt.b,
         ImmutableList.of(
            Pair.of(0, bqb.a(bly.bv, 6.0F, bjl.a(30, 60))),
            Pair.of(1, new bnv(bly.m, 1.0F)),
            Pair.of(
               2,
               new bpy(
                  ImmutableList.of(Pair.of(new boo($$0x -> 2.5F, $$0x -> $$0x.o_() ? 2.5 : 3.5), 1), Pair.of(bro.a(Predicate.not(bzj::w), bny.a(f, 2.5F)), 1))
               )
            ),
            Pair.of(3, new bps(bjl.a(150, 250), 30.0F, 0.0F, 0.0F)),
            Pair.of(
               4,
               new bpy(
                  ImmutableMap.of(bvm.m, bvn.b),
                  ImmutableList.of(
                     Pair.of(bro.a(Predicate.not(bzj::w), bpt.a(2.0F)), 1),
                     Pair.of(bro.a(Predicate.not(bzj::w), bqi.a(2.0F, 3)), 1),
                     Pair.of(new bzk.b(20), 1),
                     Pair.of(new bol(30, 60), 1)
                  )
               )
            )
         )
      );
   }

   public static void a(bzj $$0) {
      $$0.dO().a(ImmutableList.of(cgt.b));
   }

   public static cpy b() {
      return bzj.bT;
   }

   public static class a extends bnw {
      public a(float $$0) {
         super($$0);
      }

      @Override
      protected void b(and $$0, bmt $$1, long $$2) {
         if ($$1 instanceof bzj $$3) {
            $$3.gr();
         }

         super.b($$0, $$1, $$2);
      }
   }

   public static class b extends bob<bzj> {
      private final int c;

      public b(int $$0) {
         super(ImmutableMap.of());
         this.c = $$0 * 20;
      }

      protected boolean a(and $$0, bzj $$1) {
         return !$$1.aZ() && $$1.gs() >= (long)this.c && !$$1.fS() && $$1.aC() && !$$1.cO() && $$1.ge();
      }

      protected void a(and $$0, bzj $$1, long $$2) {
         if ($$1.gm()) {
            $$1.gq();
         } else if (!$$1.gb()) {
            $$1.gp();
         }
      }
   }
}
