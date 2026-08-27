import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.function.Predicate;

public class cel {
   private static final float a = 4.0F;
   private static final float b = 2.0F;
   private static final float c = 2.5F;
   private static final float d = 2.5F;
   private static final float e = 1.0F;
   private static final bob f = bob.a(5, 16);
   private static final ImmutableList<cbo<? extends cbn<? super cek>>> g = ImmutableList.of(cbo.c, cbo.f, cbo.t, cbo.o);
   private static final ImmutableList<cah<?>> h = ImmutableList.of(
      cah.Z, cah.x, cah.y, cah.m, cah.n, cah.E, cah.t, cah.h, cah.O, cah.P, cah.Q, cah.R, new cah[]{cah.r, cah.K}
   );

   protected static void a(cek $$0, ayd $$1) {
   }

   public static bsf.b<cek> a() {
      return bsf.a(h, g);
   }

   protected static bsf<?> a(bsf<cek> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(cma.a));
      $$0.b(cma.b);
      $$0.f();
      return $$0;
   }

   private static void b(bsf<cek> $$0) {
      $$0.a(cma.a, 0, ImmutableList.of(new bvq(0.8F), new cel.a(4.0F), new buc(45, 90), new bug(), new btc(cah.P), new btc(cah.Q)));
   }

   private static void c(bsf<cek> $$0) {
      $$0.a(
         cma.b,
         ImmutableList.of(
            Pair.of(0, buw.a(bqr.bx, 6.0F, bob.a(30, 60))),
            Pair.of(1, new bsq(bqr.o)),
            Pair.of(
               2,
               new but(
                  ImmutableList.of(Pair.of(new btj($$0x -> 2.5F, $$0x -> $$0x.p_() ? 2.5 : 3.5), 1), Pair.of(bwj.a(Predicate.not(cek::u), bst.a(f, 2.5F)), 1))
               )
            ),
            Pair.of(3, new bun(bob.a(150, 250), 30.0F, 0.0F, 0.0F)),
            Pair.of(
               4,
               new but(
                  ImmutableMap.of(cah.m, cai.b),
                  ImmutableList.of(
                     Pair.of(bwj.a(Predicate.not(cek::u), buo.a(2.0F)), 1),
                     Pair.of(bwj.a(Predicate.not(cek::u), bvd.a(2.0F, 3)), 1),
                     Pair.of(new cel.b(20), 1),
                     Pair.of(new btg(30, 60), 1)
                  )
               )
            )
         )
      );
   }

   public static void a(cek $$0) {
      $$0.dQ().a(ImmutableList.of(cma.b));
   }

   public static cwd b() {
      return cek.bY;
   }

   public static class a extends bsr<cek> {
      public a(float $$0) {
         super($$0);
      }

      protected void a(aqe $$0, cek $$1, long $$2) {
         $$1.gC();
         super.b($$0, $$1, $$2);
      }
   }

   public static class b extends bsw<cek> {
      private final int c;

      public b(int $$0) {
         super(ImmutableMap.of());
         this.c = $$0 * 20;
      }

      protected boolean a(aqe $$0, cek $$1) {
         return !$$1.bc() && $$1.gD() >= (long)this.c && !$$1.gc() && $$1.aC() && !$$1.cP() && $$1.gp();
      }

      protected void a(aqe $$0, cek $$1, long $$2) {
         if ($$1.gx()) {
            $$1.gB();
         } else if (!$$1.gm()) {
            $$1.gA();
         }
      }
   }
}
