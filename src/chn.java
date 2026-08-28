import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.function.Predicate;

public class chn {
   private static final float a = 4.0F;
   private static final float b = 2.0F;
   private static final float c = 2.5F;
   private static final float d = 2.5F;
   private static final float e = 1.0F;
   private static final bqv f = bqv.a(5, 16);
   private static final ImmutableList<cep<? extends ceo<? super chm>>> g = ImmutableList.of(cep.c, cep.f, cep.t, cep.o);
   private static final ImmutableList<cdi<?>> h = ImmutableList.of(
      cdi.Z, cdi.x, cdi.y, cdi.m, cdi.n, cdi.E, cdi.t, cdi.h, cdi.O, cdi.P, cdi.Q, cdi.R, new cdi[]{cdi.r, cdi.K}
   );

   protected static void a(chm $$0, azk $$1) {
   }

   public static bvg.b<chm> a() {
      return bvg.a(h, g);
   }

   protected static bvg<?> a(bvg<chm> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(cpg.a));
      $$0.b(cpg.b);
      $$0.f();
      return $$0;
   }

   private static void b(bvg<chm> $$0) {
      $$0.a(cpg.a, 0, ImmutableList.of(new byr(0.8F), new chn.a(4.0F), new bxd(45, 90), new bxh(), new bwd(cdi.P), new bwd(cdi.Q)));
   }

   private static void c(bvg<chm> $$0) {
      $$0.a(
         cpg.b,
         ImmutableList.of(
            Pair.of(0, bxx.a(btq.by, 6.0F, bqv.a(30, 60))),
            Pair.of(1, new bvr(btq.o)),
            Pair.of(
               2,
               new bxu(
                  ImmutableList.of(Pair.of(new bwk($$0x -> 2.5F, $$0x -> $$0x.o_() ? 2.5 : 3.5), 1), Pair.of(bzk.a(Predicate.not(chm::t), bvu.a(f, 2.5F)), 1))
               )
            ),
            Pair.of(3, new bxo(bqv.a(150, 250), 30.0F, 0.0F, 0.0F)),
            Pair.of(
               4,
               new bxu(
                  ImmutableMap.of(cdi.m, cdj.b),
                  ImmutableList.of(
                     Pair.of(bzk.a(Predicate.not(chm::t), bxp.a(2.0F)), 1),
                     Pair.of(bzk.a(Predicate.not(chm::t), bye.a(2.0F, 3)), 1),
                     Pair.of(new chn.b(20), 1),
                     Pair.of(new bwh(30, 60), 1)
                  )
               )
            )
         )
      );
   }

   public static void a(chm $$0) {
      $$0.dX().a(ImmutableList.of(cpg.b));
   }

   public static Predicate<cvl> b() {
      return $$0 -> $$0.a(axb.ah);
   }

   public static class a extends bvs<chm> {
      public a(float $$0) {
         super($$0);
      }

      protected void a(arg $$0, chm $$1, long $$2) {
         $$1.gD();
         super.b($$0, $$1, $$2);
      }
   }

   public static class b extends bvx<chm> {
      private final int c;

      public b(int $$0) {
         super(ImmutableMap.of());
         this.c = $$0 * 20;
      }

      protected boolean a(arg $$0, chm $$1) {
         return !$$1.bi() && $$1.gE() >= (long)this.c && !$$1.K_() && $$1.aH() && !$$1.cV() && $$1.go();
      }

      protected void a(arg $$0, chm $$1, long $$2) {
         if ($$1.gr()) {
            $$1.gC();
         } else if (!$$1.gl()) {
            $$1.gB();
         }
      }
   }
}
