import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.function.Predicate;

public class clh {
   private static final float a = 4.0F;
   private static final float b = 2.0F;
   private static final float c = 2.5F;
   private static final float d = 2.5F;
   private static final float e = 1.0F;
   private static final bue f = bue.a(5, 16);
   private static final ImmutableList<cif<? extends cie<? super clg>>> g = ImmutableList.of(cif.c, cif.f, cif.t, cif.o);
   private static final ImmutableList<cgy<?>> h = ImmutableList.of(
      cgy.aa, cgy.y, cgy.z, cgy.n, cgy.o, cgy.F, cgy.u, cgy.h, cgy.P, cgy.Q, cgy.R, cgy.S, new cgy[]{cgy.s, cgy.L}
   );

   protected static void a(clg $$0, azz $$1) {
   }

   public static byw.b<clg> a() {
      return byw.a(h, g);
   }

   protected static byw<?> a(byw<clg> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(ctt.a));
      $$0.b(ctt.b);
      $$0.f();
      return $$0;
   }

   private static void b(byw<clg> $$0) {
      $$0.a(ctt.a, 0, ImmutableList.of(new cch(0.8F), new clh.a(4.0F), new cat(45, 90), new cax(), new bzt(cgy.Q), new bzt(cgy.R)));
   }

   private static void c(byw<clg> $$0) {
      $$0.a(
         ctt.b,
         ImmutableList.of(
            Pair.of(0, cbn.a(bxe.bT, 6.0F, bue.a(30, 60))),
            Pair.of(1, new bzh(bxe.u)),
            Pair.of(
               2,
               new cbk(
                  ImmutableList.of(Pair.of(new caa($$0x -> 2.5F, $$0x -> $$0x.n_() ? 2.5 : 3.5), 1), Pair.of(cda.a(Predicate.not(clg::t), bzk.a(f, 2.5F)), 1))
               )
            ),
            Pair.of(3, new cbe(bue.a(150, 250), 30.0F, 0.0F, 0.0F)),
            Pair.of(
               4,
               new cbk(
                  ImmutableMap.of(cgy.n, cgz.b),
                  ImmutableList.of(
                     Pair.of(cda.a(Predicate.not(clg::t), cbf.a(2.0F)), 1),
                     Pair.of(cda.a(Predicate.not(clg::t), cbu.a(2.0F, 3)), 1),
                     Pair.of(new clh.b(20), 1),
                     Pair.of(new bzx(30, 60), 1)
                  )
               )
            )
         )
      );
   }

   public static void a(clg $$0) {
      $$0.ec().a(ImmutableList.of(ctt.b));
   }

   public static Predicate<daa> b() {
      return $$0 -> $$0.a(axo.am);
   }

   public static class a extends bzi<clg> {
      public a(float $$0) {
         super($$0);
      }

      protected void a(aru $$0, clg $$1, long $$2) {
         $$1.gJ();
         super.b($$0, $$1, $$2);
      }
   }

   public static class b extends bzn<clg> {
      private final int c;

      public b(int $$0) {
         super(ImmutableMap.of());
         this.c = $$0 * 20;
      }

      protected boolean a(aru $$0, clg $$1) {
         return !$$1.bi() && $$1.gK() >= (long)this.c && !$$1.S_() && $$1.aH() && !$$1.cX() && $$1.gu();
      }

      protected void a(aru $$0, clg $$1, long $$2) {
         if ($$1.gx()) {
            $$1.gI();
         } else if (!$$1.gr()) {
            $$1.gH();
         }
      }
   }
}
