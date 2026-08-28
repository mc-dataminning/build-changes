import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;

public class ewo extends evt {
   public static final MapCodec<ewo> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  xn.a.sizeLimitedListOf(256).fieldOf("lore").forGetter($$0x -> $$0x.b),
                  evs.a(256).forGetter($$0x -> $$0x.c),
                  eug.b.e.optionalFieldOf("entity").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, ewo::new)
   );
   private final List<xl> b;
   private final evs c;
   private final Optional<eug.b> d;

   public ewo(List<exr> $$0, List<xl> $$1, evs $$2, Optional<eug.b> $$3) {
      super($$0);
      this.b = List.copyOf($$1);
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public evv<ewo> b() {
      return evw.A;
   }

   @Override
   public Set<ewz<?>> a() {
      return this.d.<Set<ewz<?>>>map($$0 -> Set.of($$0.a())).orElseGet(Set::of);
   }

   @Override
   public cwf a(cwf $$0, eug $$1) {
      $$0.a(ku.j, cyy.a, $$1x -> new cyy(this.a($$1x, $$1)));
      return $$0;
   }

   private List<xl> a(@Nullable cyy $$0, eug $$1) {
      if ($$0 == null && this.b.isEmpty()) {
         return List.of();
      } else {
         UnaryOperator<xl> $$2 = ewp.a($$1, this.d.orElse(null));
         List<xl> $$3 = this.b.stream().map($$2).toList();
         return this.c.a($$0.a(), $$3, 256);
      }
   }

   public static ewo.a c() {
      return new ewo.a();
   }

   public static class a extends evt.a<ewo.a> {
      private Optional<eug.b> a = Optional.empty();
      private final Builder<xl> b = ImmutableList.builder();
      private evs c = evs.a.b;

      public ewo.a a(evs $$0) {
         this.c = $$0;
         return this;
      }

      public ewo.a a(eug.b $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public ewo.a a(xl $$0) {
         this.b.add($$0);
         return this;
      }

      protected ewo.a a() {
         return this;
      }

      @Override
      public evu b() {
         return new ewo(this.g(), this.b.build(), this.c, this.a);
      }
   }
}
