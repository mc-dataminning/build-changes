import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Set;

public class cnp {
   public static final float a = 0.6F;
   public static final float b = 4.0F;
   public static final float c = 8.0F;
   public static final float d = 24.0F;
   static final List<cgj<? extends cgi<? super cno>>> e = ImmutableList.of(cgj.c, cgj.f, cgj.d, cgj.z);
   static final List<cfc<?>> f = ImmutableList.of(
      cfc.n, cfc.h, cfc.B, cfc.E, cfc.o, cfc.m, cfc.aU, cfc.aZ, cfc.aV, cfc.aW, cfc.aX, cfc.aY, new cfc[]{cfc.ba, cfc.bb, cfc.x, cfc.y, cfc.t}
   );
   private static final int g = 100;

   protected static bxa<?> a(cno $$0, bxa<cno> $$1) {
      a($$1);
      b($$1);
      b($$0, $$1);
      $$1.a(Set.of(cri.a));
      $$1.b(cri.k);
      $$1.f();
      return $$1;
   }

   private static void a(bxa<cno> $$0) {
      $$0.a(cri.a, 0, ImmutableList.of(new cal(0.8F), new byx(45, 90)));
   }

   private static void b(bxa<cno> $$0) {
      $$0.a(
         cri.b,
         ImmutableList.of(
            Pair.of(0, cad.a(($$0x, $$1) -> $$1.ea().c(cfc.B))),
            Pair.of(1, cad.a(($$0x, $$1) -> $$1.t())),
            Pair.of(2, new cnp.a(20, 40)),
            Pair.of(3, new bzo(ImmutableList.of(Pair.of(new byb(20, 100), 1), Pair.of(bzj.a(0.6F), 2))))
         )
      );
   }

   private static void b(cno $$0, bxa<cno> $$1) {
      $$1.a(
         cri.k,
         ImmutableList.of(
            Pair.of(0, cag.a(cgi.a($$0, 100).negate()::test)), Pair.of(1, new cns()), Pair.of(2, new cnr()), Pair.of(3, new cnt()), Pair.of(4, new cnu())
         ),
         ImmutableSet.of(Pair.of(cfc.o, cfd.a), Pair.of(cfc.m, cfd.b))
      );
   }

   static void a(cno $$0) {
      $$0.ea().a(ImmutableList.of(cri.k, cri.b));
   }

   public static class a extends bzb {
      @VisibleForTesting
      public a(int $$0, int $$1) {
         super($$0, $$1);
      }

      @Override
      protected void c(ard $$0, bwa $$1, long $$2) {
         super.c($$0, $$1, $$2);
         $$1.a(awa.cM);
         $$1.b(bwk.p);
      }

      @Override
      protected void b(ard $$0, bwa $$1, long $$2) {
         super.b($$0, $$1, $$2);
         $$1.b(bwk.a);
         if ($$1.ea().a(cfc.o)) {
            $$1.ea().a(cfc.aV, baf.a, 60L);
         }
      }
   }
}
