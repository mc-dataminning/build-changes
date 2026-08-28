import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Set;

public class cnu {
   public static final float a = 0.6F;
   public static final float b = 4.0F;
   public static final float c = 8.0F;
   public static final float d = 24.0F;
   static final List<cgr<? extends cgq<? super cnt>>> e = ImmutableList.of(cgr.c, cgr.f, cgr.d, cgr.z);
   static final List<cfk<?>> f = ImmutableList.of(
      cfk.n, cfk.h, cfk.B, cfk.E, cfk.o, cfk.m, cfk.aU, cfk.aZ, cfk.aV, cfk.aW, cfk.aX, cfk.aY, new cfk[]{cfk.ba, cfk.bb, cfk.x, cfk.y, cfk.t}
   );
   private static final int g = 100;

   protected static bxi<?> a(cnt $$0, bxi<cnt> $$1) {
      a($$1);
      b($$1);
      b($$0, $$1);
      $$1.a(Set.of(cro.a));
      $$1.b(cro.k);
      $$1.f();
      return $$1;
   }

   private static void a(bxi<cnt> $$0) {
      $$0.a(cro.a, 0, ImmutableList.of(new cat(0.8F), new bzf(45, 90)));
   }

   private static void b(bxi<cnt> $$0) {
      $$0.a(
         cro.b,
         ImmutableList.of(
            Pair.of(0, cal.a(($$0x, $$1) -> $$1.ec().c(cfk.B))),
            Pair.of(1, cal.a(($$0x, $$1) -> $$1.go())),
            Pair.of(2, new cnu.a(20, 40)),
            Pair.of(3, new bzw(ImmutableList.of(Pair.of(new byj(20, 100), 1), Pair.of(bzr.a(0.6F), 2))))
         )
      );
   }

   private static void b(cnt $$0, bxi<cnt> $$1) {
      $$1.a(
         cro.k,
         ImmutableList.of(
            Pair.of(0, cao.a(cgq.a($$0, 100).negate()::test)), Pair.of(1, new cnx()), Pair.of(2, new cnw()), Pair.of(3, new cny()), Pair.of(4, new cnz())
         ),
         ImmutableSet.of(Pair.of(cfk.o, cfl.a), Pair.of(cfk.m, cfl.b))
      );
   }

   static void a(cnt $$0) {
      $$0.ec().a(ImmutableList.of(cro.k, cro.b));
   }

   public static class a extends bzj {
      @VisibleForTesting
      public a(int $$0, int $$1) {
         super($$0, $$1);
      }

      @Override
      protected void c(ash $$0, bwi $$1, long $$2) {
         super.c($$0, $$1, $$2);
         $$1.a(axf.cM);
         $$1.b(bws.p);
      }

      @Override
      protected void b(ash $$0, bwi $$1, long $$2) {
         super.b($$0, $$1, $$2);
         $$1.b(bws.a);
         if ($$1.ec().a(cfk.o)) {
            $$1.ec().a(cfk.aV, bbk.a, 60L);
         }
      }
   }
}
