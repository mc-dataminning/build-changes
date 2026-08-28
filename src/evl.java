import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class evl extends evt {
   public static final int a = 0;
   public static final MapCodec<evl> b = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  dbw.c.fieldOf("enchantment").forGetter($$0x -> $$0x.c),
                  eyo.a.fieldOf("count").forGetter($$0x -> $$0x.d),
                  Codec.INT.optionalFieldOf("limit", 0).forGetter($$0x -> $$0x.e)
               )
            )
            .apply($$0, evl::new)
   );
   private final jq<dbw> c;
   private final eyn d;
   private final int e;

   evl(List<exr> $$0, jq<dbw> $$1, eyn $$2, int $$3) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   @Override
   public evv<evl> b() {
      return evw.m;
   }

   @Override
   public Set<ewz<?>> a() {
      return Sets.union(ImmutableSet.of(exc.d), this.d.a());
   }

   private boolean c() {
      return this.e > 0;
   }

   @Override
   public cwf a(cwf $$0, eug $$1) {
      bui $$2 = $$1.c(exc.d);
      if ($$2 instanceof bve $$3) {
         int $$4 = dby.a(this.c, $$3);
         if ($$4 == 0) {
            return $$0;
         }

         float $$5 = (float)$$4 * this.d.b($$1);
         $$0.g(Math.round($$5));
         if (this.c()) {
            $$0.f(this.e);
         }
      }

      return $$0;
   }

   public static evl.a a(js.a $$0, eyn $$1) {
      js.b<dbw> $$2 = $$0.d(ma.aM);
      return new evl.a($$2.b(dcb.s), $$1);
   }

   public static class a extends evt.a<evl.a> {
      private final jq<dbw> a;
      private final eyn b;
      private int c = 0;

      public a(jq<dbw> $$0, eyn $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      protected evl.a a() {
         return this;
      }

      public evl.a a(int $$0) {
         this.c = $$0;
         return this;
      }

      @Override
      public evu b() {
         return new evl(this.g(), this.a, this.b, this.c);
      }
   }
}
