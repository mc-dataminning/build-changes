import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSet.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class evf extends evt {
   public static final MapCodec<evf> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  lz.e.r().fieldOf("block").forGetter($$0x -> $$0x.b),
                  Codec.STRING.listOf().fieldOf("properties").forGetter($$0x -> $$0x.c.stream().map(dwq::f).toList())
               )
            )
            .apply($$0, evf::new)
   );
   private final jq<dij> b;
   private final Set<dwq<?>> c;

   evf(List<exr> $$0, jq<dij> $$1, Set<dwq<?>> $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   private evf(List<exr> $$0, jq<dij> $$1, List<String> $$2) {
      this($$0, $$1, $$2.stream().map($$1.a().l()::a).filter(Objects::nonNull).collect(Collectors.toSet()));
   }

   @Override
   public evv<evf> b() {
      return evw.D;
   }

   @Override
   public Set<ewz<?>> a() {
      return ImmutableSet.of(exc.g);
   }

   @Override
   protected cwf a(cwf $$0, eug $$1) {
      dvo $$2 = $$1.c(exc.g);
      if ($$2 != null) {
         $$0.a(ku.am, cyh.a, $$1x -> {
            for (dwq<?> $$2x : this.c) {
               if ($$2.b($$2x)) {
                  $$1x = $$1x.a($$2x, $$2);
               }
            }

            return $$1x;
         });
      }

      return $$0;
   }

   public static evf.a a(dij $$0) {
      return new evf.a($$0);
   }

   public static class a extends evt.a<evf.a> {
      private final jq<dij> a;
      private final Builder<dwq<?>> b = ImmutableSet.builder();

      a(dij $$0) {
         this.a = $$0.p();
      }

      public evf.a a(dwq<?> $$0) {
         if (!this.a.a().l().d().contains($$0)) {
            throw new IllegalStateException("Property " + $$0 + " is not present on block " + this.a);
         } else {
            this.b.add($$0);
            return this;
         }
      }

      protected evf.a a() {
         return this;
      }

      @Override
      public evu b() {
         return new evf(this.g(), this.a, this.b.build());
      }
   }
}
