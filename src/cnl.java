import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Set;

public class cnl {
   public static final float a = 0.6F;
   public static final float b = 4.0F;
   public static final float c = 8.0F;
   public static final float d = 24.0F;
   static final List<cgi<? extends cgh<? super cnk>>> e = ImmutableList.of(cgi.c, cgi.f, cgi.d, cgi.z);
   static final List<cfb<?>> f = ImmutableList.of(
      cfb.n, cfb.h, cfb.B, cfb.E, cfb.o, cfb.m, cfb.aU, cfb.aZ, cfb.aV, cfb.aW, cfb.aX, cfb.aY, new cfb[]{cfb.ba, cfb.bb, cfb.x, cfb.y, cfb.t}
   );
   private static final int g = 100;

   protected static bwz<?> a(cnk $$0, bwz<cnk> $$1) {
      a($$1);
      b($$1);
      b($$0, $$1);
      $$1.a(Set.of(crf.a));
      $$1.b(crf.k);
      $$1.f();
      return $$1;
   }

   private static void a(bwz<cnk> $$0) {
      $$0.a(crf.a, 0, ImmutableList.of(new cak(0.8F), new byw(45, 90)));
   }

   private static void b(bwz<cnk> $$0) {
      $$0.a(
         crf.b,
         ImmutableList.of(
            Pair.of(0, cac.a(($$0x, $$1) -> $$1.ec().c(cfb.B))),
            Pair.of(1, cac.a(($$0x, $$1) -> $$1.go())),
            Pair.of(2, new cnl.a(20, 40)),
            Pair.of(3, new bzn(ImmutableList.of(Pair.of(new bya(20, 100), 1), Pair.of(bzi.a(0.6F), 2))))
         )
      );
   }

   private static void b(cnk $$0, bwz<cnk> $$1) {
      $$1.a(
         crf.k,
         ImmutableList.of(
            Pair.of(0, caf.a(cgh.a($$0, 100).negate()::test)), Pair.of(1, new cno()), Pair.of(2, new cnn()), Pair.of(3, new cnp()), Pair.of(4, new cnq())
         ),
         ImmutableSet.of(Pair.of(cfb.o, cfc.a), Pair.of(cfb.m, cfc.b))
      );
   }

   static void a(cnk $$0) {
      $$0.ec().a(ImmutableList.of(crf.k, crf.b));
   }

   public static class a extends bza {
      @VisibleForTesting
      public a(int $$0, int $$1) {
         super($$0, $$1);
      }

      @Override
      protected void c(arx $$0, bvz $$1, long $$2) {
         super.c($$0, $$1, $$2);
         $$1.a(awv.cM);
         $$1.b(bwj.p);
      }

      @Override
      protected void b(arx $$0, bvz $$1, long $$2) {
         super.b($$0, $$1, $$2);
         $$1.b(bwj.a);
         if ($$1.ec().a(cfb.o)) {
            $$1.ec().a(cfb.aV, bba.a, 60L);
         }
      }
   }
}
