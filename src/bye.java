import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.function.Predicate;

public class bye {
   private static final float a = 4.0F;
   private static final float b = 2.0F;
   private static final float c = 2.5F;
   private static final float d = 2.5F;
   private static final float e = 1.0F;
   private static final bii f = bii.a(5, 16);
   private static final ImmutableList<bvm<? extends bvl<? super byd>>> g = ImmutableList.of(bvm.c, bvm.f, bvm.s, bvm.n);
   private static final ImmutableList<buh<?>> h = ImmutableList.of(
      buh.Y, buh.x, buh.y, buh.m, buh.n, buh.E, buh.t, buh.h, buh.N, buh.O, buh.P, buh.Q, new buh[]{buh.r, buh.J}
   );

   protected static void a(byd $$0, ats $$1) {
   }

   public static bmg.b<byd> a() {
      return bmg.a(h, g);
   }

   protected static bmg<?> a(bmg<byd> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(cff.a));
      $$0.b(cff.b);
      $$0.f();
      return $$0;
   }

   private static void b(bmg<byd> $$0) {
      $$0.a(cff.a, 0, ImmutableList.of(new bpq(0.8F), new bye.a(4.0F), new boc(45, 90), new bog(), new bnd(buh.O), new bnd(buh.P)));
   }

   private static void c(bmg<byd> $$0) {
      $$0.a(
         cff.b,
         ImmutableList.of(
            Pair.of(0, bow.a(bku.bt, 6.0F, bii.a(30, 60))),
            Pair.of(1, new bmr(bku.l, 1.0F)),
            Pair.of(
               2,
               new bot(
                  ImmutableList.of(Pair.of(new bnk($$0x -> 2.5F, $$0x -> $$0x.n_() ? 2.5 : 3.5), 1), Pair.of(bqj.a(Predicate.not(byd::w), bmu.a(f, 2.5F)), 1))
               )
            ),
            Pair.of(3, new bon(bii.a(150, 250), 30.0F, 0.0F, 0.0F)),
            Pair.of(
               4,
               new bot(
                  ImmutableMap.of(buh.m, bui.b),
                  ImmutableList.of(
                     Pair.of(bqj.a(Predicate.not(byd::w), boo.a(2.0F)), 1),
                     Pair.of(bqj.a(Predicate.not(byd::w), bpd.a(2.0F, 3)), 1),
                     Pair.of(new bye.b(20), 1),
                     Pair.of(new bnh(30, 60), 1)
                  )
               )
            )
         )
      );
   }

   public static void a(byd $$0) {
      $$0.dP().a(ImmutableList.of(cff.b));
   }

   public static cok b() {
      return byd.bT;
   }

   public static class a extends bms {
      public a(float $$0) {
         super($$0);
      }

      @Override
      protected void b(ame $$0, blp $$1, long $$2) {
         if ($$1 instanceof byd $$3) {
            $$3.gs();
         }

         super.b($$0, $$1, $$2);
      }
   }

   public static class b extends bmx<byd> {
      private final int c;

      public b(int $$0) {
         super(ImmutableMap.of());
         this.c = $$0 * 20;
      }

      protected boolean a(ame $$0, byd $$1) {
         return !$$1.aZ() && $$1.gt() >= (long)this.c && !$$1.fT() && $$1.aC() && !$$1.cP() && $$1.gf();
      }

      protected void a(ame $$0, byd $$1, long $$2) {
         if ($$1.gn()) {
            $$1.gr();
         } else if (!$$1.gc()) {
            $$1.gq();
         }
      }
   }
}
