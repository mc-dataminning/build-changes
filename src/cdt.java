import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.function.Predicate;

public class cdt {
   private static final float a = 4.0F;
   private static final float b = 2.0F;
   private static final float c = 2.5F;
   private static final float d = 2.5F;
   private static final float e = 1.0F;
   private static final bnl f = bnl.a(5, 16);
   private static final ImmutableList<cay<? extends cax<? super cds>>> g = ImmutableList.of(cay.c, cay.f, cay.t, cay.o);
   private static final ImmutableList<bzr<?>> h = ImmutableList.of(
      bzr.Z, bzr.x, bzr.y, bzr.m, bzr.n, bzr.E, bzr.t, bzr.h, bzr.O, bzr.P, bzr.Q, bzr.R, new bzr[]{bzr.r, bzr.K}
   );

   protected static void a(cds $$0, axr $$1) {
   }

   public static brp.b<cds> a() {
      return brp.a(h, g);
   }

   protected static brp<?> a(brp<cds> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(cli.a));
      $$0.b(cli.b);
      $$0.f();
      return $$0;
   }

   private static void b(brp<cds> $$0) {
      $$0.a(cli.a, 0, ImmutableList.of(new bva(0.8F), new cdt.a(4.0F), new btm(45, 90), new btq(), new bsm(bzr.P), new bsm(bzr.Q)));
   }

   private static void c(brp<cds> $$0) {
      $$0.a(
         cli.b,
         ImmutableList.of(
            Pair.of(0, bug.a(bqb.bx, 6.0F, bnl.a(30, 60))),
            Pair.of(1, new bsa(bqb.o)),
            Pair.of(
               2,
               new bud(
                  ImmutableList.of(Pair.of(new bst($$0x -> 2.5F, $$0x -> $$0x.p_() ? 2.5 : 3.5), 1), Pair.of(bvt.a(Predicate.not(cds::u), bsd.a(f, 2.5F)), 1))
               )
            ),
            Pair.of(3, new btx(bnl.a(150, 250), 30.0F, 0.0F, 0.0F)),
            Pair.of(
               4,
               new bud(
                  ImmutableMap.of(bzr.m, bzs.b),
                  ImmutableList.of(
                     Pair.of(bvt.a(Predicate.not(cds::u), bty.a(2.0F)), 1),
                     Pair.of(bvt.a(Predicate.not(cds::u), bun.a(2.0F, 3)), 1),
                     Pair.of(new cdt.b(20), 1),
                     Pair.of(new bsq(30, 60), 1)
                  )
               )
            )
         )
      );
   }

   public static void a(cds $$0) {
      $$0.dP().a(ImmutableList.of(cli.b));
   }

   public static cvg b() {
      return cds.bX;
   }

   public static class a extends bsb<cds> {
      public a(float $$0) {
         super($$0);
      }

      protected void a(aps $$0, cds $$1, long $$2) {
         $$1.gA();
         super.b($$0, $$1, $$2);
      }
   }

   public static class b extends bsg<cds> {
      private final int c;

      public b(int $$0) {
         super(ImmutableMap.of());
         this.c = $$0 * 20;
      }

      protected boolean a(aps $$0, cds $$1) {
         return !$$1.bc() && $$1.gB() >= (long)this.c && !$$1.gb() && $$1.aC() && !$$1.cO() && $$1.gn();
      }

      protected void a(aps $$0, cds $$1, long $$2) {
         if ($$1.gv()) {
            $$1.gz();
         } else if (!$$1.gk()) {
            $$1.gy();
         }
      }
   }
}
