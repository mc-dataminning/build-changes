import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;

public class evb extends eug {
   public static final MapCodec<evb> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  xf.a.sizeLimitedListOf(256).fieldOf("lore").forGetter($$0x -> $$0x.b),
                  euf.a(256).forGetter($$0x -> $$0x.c),
                  est.b.e.optionalFieldOf("entity").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, evb::new)
   );
   private final List<xd> b;
   private final euf c;
   private final Optional<est.b> d;

   public evb(List<ewe> $$0, List<xd> $$1, euf $$2, Optional<est.b> $$3) {
      super($$0);
      this.b = List.copyOf($$1);
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public eui<evb> b() {
      return euj.A;
   }

   @Override
   public Set<evm<?>> a() {
      return this.d.<Set<evm<?>>>map($$0 -> Set.of($$0.a())).orElseGet(Set::of);
   }

   @Override
   public cvl a(cvl $$0, est $$1) {
      $$0.a(kr.i, cyi.a, $$1x -> new cyi(this.a($$1x, $$1)));
      return $$0;
   }

   private List<xd> a(@Nullable cyi $$0, est $$1) {
      if ($$0 == null && this.b.isEmpty()) {
         return List.of();
      } else {
         UnaryOperator<xd> $$2 = evc.a($$1, this.d.orElse(null));
         List<xd> $$3 = this.b.stream().map($$2).toList();
         return this.c.a($$0.a(), $$3, 256);
      }
   }

   public static evb.a c() {
      return new evb.a();
   }

   public static class a extends eug.a<evb.a> {
      private Optional<est.b> a = Optional.empty();
      private final Builder<xd> b = ImmutableList.builder();
      private euf c = euf.a.b;

      public evb.a a(euf $$0) {
         this.c = $$0;
         return this;
      }

      public evb.a a(est.b $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public evb.a a(xd $$0) {
         this.b.add($$0);
         return this;
      }

      protected evb.a a() {
         return this;
      }

      @Override
      public euh b() {
         return new evb(this.g(), this.b.build(), this.c, this.a);
      }
   }
}
