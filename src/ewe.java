import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;

public class ewe extends evj {
   public static final MapCodec<ewe> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  xj.a.sizeLimitedListOf(256).fieldOf("lore").forGetter($$0x -> $$0x.b),
                  evi.a(256).forGetter($$0x -> $$0x.c),
                  etw.b.e.optionalFieldOf("entity").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, ewe::new)
   );
   private final List<xh> b;
   private final evi c;
   private final Optional<etw.b> d;

   public ewe(List<exh> $$0, List<xh> $$1, evi $$2, Optional<etw.b> $$3) {
      super($$0);
      this.b = List.copyOf($$1);
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public evl<ewe> b() {
      return evm.A;
   }

   @Override
   public Set<ewp<?>> a() {
      return this.d.<Set<ewp<?>>>map($$0 -> Set.of($$0.a())).orElseGet(Set::of);
   }

   @Override
   public cvx a(cvx $$0, etw $$1) {
      $$0.a(kt.j, cyo.a, $$1x -> new cyo(this.a($$1x, $$1)));
      return $$0;
   }

   private List<xh> a(@Nullable cyo $$0, etw $$1) {
      if ($$0 == null && this.b.isEmpty()) {
         return List.of();
      } else {
         UnaryOperator<xh> $$2 = ewf.a($$1, this.d.orElse(null));
         List<xh> $$3 = this.b.stream().map($$2).toList();
         return this.c.a($$0.a(), $$3, 256);
      }
   }

   public static ewe.a c() {
      return new ewe.a();
   }

   public static class a extends evj.a<ewe.a> {
      private Optional<etw.b> a = Optional.empty();
      private final Builder<xh> b = ImmutableList.builder();
      private evi c = evi.a.b;

      public ewe.a a(evi $$0) {
         this.c = $$0;
         return this;
      }

      public ewe.a a(etw.b $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public ewe.a a(xh $$0) {
         this.b.add($$0);
         return this;
      }

      protected ewe.a a() {
         return this;
      }

      @Override
      public evk b() {
         return new ewe(this.g(), this.b.build(), this.c, this.a);
      }
   }
}
