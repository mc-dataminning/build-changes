import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.function.Predicate;

public class cea {
   private static final float a = 4.0F;
   private static final float b = 2.0F;
   private static final float c = 2.5F;
   private static final float d = 2.5F;
   private static final float e = 1.0F;
   private static final bnq f = bnq.a(5, 16);
   private static final ImmutableList<cbd<? extends cbc<? super cdz>>> g = ImmutableList.of(cbd.c, cbd.f, cbd.t, cbd.o);
   private static final ImmutableList<bzw<?>> h = ImmutableList.of(
      bzw.Z, bzw.x, bzw.y, bzw.m, bzw.n, bzw.E, bzw.t, bzw.h, bzw.O, bzw.P, bzw.Q, bzw.R, new bzw[]{bzw.r, bzw.K}
   );

   protected static void a(cdz $$0, axt $$1) {
   }

   public static bru.b<cdz> a() {
      return bru.a(h, g);
   }

   protected static bru<?> a(bru<cdz> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(clp.a));
      $$0.b(clp.b);
      $$0.f();
      return $$0;
   }

   private static void b(bru<cdz> $$0) {
      $$0.a(clp.a, 0, ImmutableList.of(new bvf(0.8F), new cea.a(4.0F), new btr(45, 90), new btv(), new bsr(bzw.P), new bsr(bzw.Q)));
   }

   private static void c(bru<cdz> $$0) {
      $$0.a(
         clp.b,
         ImmutableList.of(
            Pair.of(0, bul.a(bqg.bx, 6.0F, bnq.a(30, 60))),
            Pair.of(1, new bsf(bqg.o)),
            Pair.of(
               2,
               new bui(
                  ImmutableList.of(Pair.of(new bsy($$0x -> 2.5F, $$0x -> $$0x.p_() ? 2.5 : 3.5), 1), Pair.of(bvy.a(Predicate.not(cdz::u), bsi.a(f, 2.5F)), 1))
               )
            ),
            Pair.of(3, new buc(bnq.a(150, 250), 30.0F, 0.0F, 0.0F)),
            Pair.of(
               4,
               new bui(
                  ImmutableMap.of(bzw.m, bzx.b),
                  ImmutableList.of(
                     Pair.of(bvy.a(Predicate.not(cdz::u), bud.a(2.0F)), 1),
                     Pair.of(bvy.a(Predicate.not(cdz::u), bus.a(2.0F, 3)), 1),
                     Pair.of(new cea.b(20), 1),
                     Pair.of(new bsv(30, 60), 1)
                  )
               )
            )
         )
      );
   }

   public static void a(cdz $$0) {
      $$0.dP().a(ImmutableList.of(clp.b));
   }

   public static cvp b() {
      return cdz.bX;
   }

   public static class a extends bsg<cdz> {
      public a(float $$0) {
         super($$0);
      }

      protected void a(apu $$0, cdz $$1, long $$2) {
         $$1.gA();
         super.b($$0, $$1, $$2);
      }
   }

   public static class b extends bsl<cdz> {
      private final int c;

      public b(int $$0) {
         super(ImmutableMap.of());
         this.c = $$0 * 20;
      }

      protected boolean a(apu $$0, cdz $$1) {
         return !$$1.bc() && $$1.gB() >= (long)this.c && !$$1.gb() && $$1.aC() && !$$1.cO() && $$1.gn();
      }

      protected void a(apu $$0, cdz $$1, long $$2) {
         if ($$1.gv()) {
            $$1.gz();
         } else if (!$$1.gk()) {
            $$1.gy();
         }
      }
   }
}
