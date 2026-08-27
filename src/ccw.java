import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Set;

public class ccw {
   public static final float a = 0.6F;
   public static final float b = 4.0F;
   public static final float c = 8.0F;
   public static final float d = 20.0F;
   static final List<bwd<? extends bwc<? super ccv>>> e = ImmutableList.of(bwd.c, bwd.f, bwd.d, bwd.x);
   static final List<bux<?>> f = ImmutableList.of(
      bux.n, bux.h, bux.B, bux.E, bux.o, bux.m, bux.aT, bux.aY, bux.aU, bux.aV, bux.aW, bux.aX, new bux[]{bux.aZ, bux.x, bux.y, bux.t}
   );

   protected static bmv<?> a(bmv<ccv> $$0) {
      b($$0);
      c($$0);
      $$0.a(Set.of(cgd.a));
      $$0.b(cgd.k);
      $$0.f();
      return $$0;
   }

   private static void b(bmv<ccv> $$0) {
      $$0.a(cgd.a, 0, ImmutableList.of(new bqg(0.8F), new bos(45, 90), new ccw.a(20, 100)));
   }

   private static void c(bmv<ccv> $$0) {
      $$0.a(
         cgd.k,
         ImmutableList.of(
            Pair.of(0, bpy.a($$0x -> $$0x.dO().c(bux.B))),
            Pair.of(1, bqb.a()),
            Pair.of(2, new ccy()),
            Pair.of(3, new ccx()),
            Pair.of(4, new ccz()),
            Pair.of(4, new bpj(ImmutableList.of(Pair.of(new bnw(20, 100), 1), Pair.of(bpe.a(0.6F), 2))))
         ),
         Set.of()
      );
   }

   static class a extends bow {
      a(int $$0, int $$1) {
         super($$0, $$1);
      }

      @Override
      protected void c(amp $$0, blx $$1, long $$2) {
         super.c($$0, $$1, $$2);
         $$1.a(arc.cq);
         $$1.b(bmh.p);
      }

      @Override
      protected void b(amp $$0, blx $$1, long $$2) {
         super.b($$0, $$1, $$2);
         $$1.b(bmh.a);
         if ($$1.dO().a(bux.o)) {
            $$1.dO().a(bux.aU, avc.a, 60L);
         }
      }
   }
}
