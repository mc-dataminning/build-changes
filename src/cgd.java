import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Set;

public class cgd {
   public static final float a = 0.6F;
   public static final float b = 4.0F;
   public static final float c = 8.0F;
   public static final float d = 20.0F;
   static final List<bzh<? extends bzg<? super cgc>>> e = ImmutableList.of(bzh.c, bzh.f, bzh.d, bzh.z);
   static final List<bya<?>> f = ImmutableList.of(
      bya.n, bya.h, bya.B, bya.E, bya.o, bya.m, bya.aU, bya.aZ, bya.aV, bya.aW, bya.aX, bya.aY, new bya[]{bya.ba, bya.bb, bya.x, bya.y, bya.t}
   );

   protected static bpy<?> a(bpy<cgc> $$0) {
      b($$0);
      c($$0);
      d($$0);
      $$0.a(Set.of(cjn.a));
      $$0.b(cjn.k);
      $$0.f();
      return $$0;
   }

   private static void b(bpy<cgc> $$0) {
      $$0.a(cjn.a, 0, ImmutableList.of(new btj(0.8F), new brv(45, 90)));
   }

   private static void c(bpy<cgc> $$0) {
      $$0.a(
         cjn.b,
         ImmutableList.of(
            Pair.of(0, btb.a($$0x -> $$0x.dM().c(bya.B))),
            Pair.of(1, btb.a(cgc::gm)),
            Pair.of(2, new cgd.a(20, 40)),
            Pair.of(3, new bsm(ImmutableList.of(Pair.of(new bqz(20, 100), 1), Pair.of(bsh.a(0.6F), 2))))
         )
      );
   }

   private static void d(bpy<cgc> $$0) {
      $$0.a(
         cjn.k,
         ImmutableList.of(Pair.of(0, bte.a()), Pair.of(1, new cgg()), Pair.of(2, new cgf()), Pair.of(3, new cgh()), Pair.of(4, new cgi())),
         ImmutableSet.of(Pair.of(bya.o, byb.a), Pair.of(bya.m, byb.b))
      );
   }

   static void a(cgc $$0) {
      $$0.dM().a(ImmutableList.of(cjn.k, cjn.b));
   }

   public static class a extends brz {
      @VisibleForTesting
      public a(int $$0, int $$1) {
         super($$0, $$1);
      }

      @Override
      protected void c(apa $$0, boz $$1, long $$2) {
         super.c($$0, $$1, $$2);
         $$1.a(atp.cF);
         $$1.b(bpi.p);
      }

      @Override
      protected void b(apa $$0, boz $$1, long $$2) {
         super.b($$0, $$1, $$2);
         $$1.b(bpi.a);
         if ($$1.dM().a(bya.o)) {
            $$1.dM().a(bya.aV, axo.a, 60L);
         }
      }
   }
}
