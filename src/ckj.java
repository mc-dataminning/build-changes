import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.function.Predicate;

public class ckj {
   private static final float a = 4.0F;
   private static final float b = 2.0F;
   private static final float c = 2.5F;
   private static final float d = 2.5F;
   private static final float e = 1.0F;
   private static final btj f = btj.a(5, 16);
   private static final ImmutableList<chi<? extends chh<? super cki>>> g = ImmutableList.of(chi.c, chi.f, chi.t, chi.o);
   private static final ImmutableList<cgb<?>> h = ImmutableList.of(
      cgb.aa, cgb.y, cgb.z, cgb.n, cgb.o, cgb.F, cgb.u, cgb.h, cgb.P, cgb.Q, cgb.R, cgb.S, new cgb[]{cgb.s, cgb.L}
   );

   protected static void a(cki $$0, azt $$1) {
   }

   public static bxz.b<cki> a() {
      return bxz.a(h, g);
   }

   protected static bxz<?> a(bxz<cki> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(csl.a));
      $$0.b(csl.b);
      $$0.f();
      return $$0;
   }

   private static void b(bxz<cki> $$0) {
      $$0.a(csl.a, 0, ImmutableList.of(new cbk(0.8F), new ckj.a(4.0F), new bzw(45, 90), new caa(), new byw(cgb.Q), new byw(cgb.R)));
   }

   private static void c(bxz<cki> $$0) {
      $$0.a(
         csl.b,
         ImmutableList.of(
            Pair.of(0, caq.a(bwj.bS, 6.0F, btj.a(30, 60))),
            Pair.of(1, new byk(bwj.t)),
            Pair.of(
               2,
               new can(
                  ImmutableList.of(Pair.of(new bzd($$0x -> 2.5F, $$0x -> $$0x.n_() ? 2.5 : 3.5), 1), Pair.of(ccd.a(Predicate.not(cki::t), byn.a(f, 2.5F)), 1))
               )
            ),
            Pair.of(3, new cah(btj.a(150, 250), 30.0F, 0.0F, 0.0F)),
            Pair.of(
               4,
               new can(
                  ImmutableMap.of(cgb.n, cgc.b),
                  ImmutableList.of(
                     Pair.of(ccd.a(Predicate.not(cki::t), cai.a(2.0F)), 1),
                     Pair.of(ccd.a(Predicate.not(cki::t), cax.a(2.0F, 3)), 1),
                     Pair.of(new ckj.b(20), 1),
                     Pair.of(new bza(30, 60), 1)
                  )
               )
            )
         )
      );
   }

   public static void a(cki $$0) {
      $$0.eb().a(ImmutableList.of(csl.b));
   }

   public static Predicate<cys> b() {
      return $$0 -> $$0.a(axi.ak);
   }

   public static class a extends byl<cki> {
      public a(float $$0) {
         super($$0);
      }

      protected void a(aro $$0, cki $$1, long $$2) {
         $$1.gF();
         super.b($$0, $$1, $$2);
      }
   }

   public static class b extends byq<cki> {
      private final int c;

      public b(int $$0) {
         super(ImmutableMap.of());
         this.c = $$0 * 20;
      }

      protected boolean a(aro $$0, cki $$1) {
         return !$$1.bj() && $$1.gG() >= (long)this.c && !$$1.O_() && $$1.aJ() && !$$1.cX() && $$1.gq();
      }

      protected void a(aro $$0, cki $$1, long $$2) {
         if ($$1.gt()) {
            $$1.gE();
         } else if (!$$1.gn()) {
            $$1.gD();
         }
      }
   }
}
