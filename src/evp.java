import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;

public class evp extends euu {
   public static final MapCodec<evp> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  xf.a.sizeLimitedListOf(256).fieldOf("lore").forGetter($$0x -> $$0x.b),
                  eut.a(256).forGetter($$0x -> $$0x.c),
                  eth.b.e.optionalFieldOf("entity").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, evp::new)
   );
   private final List<xd> b;
   private final eut c;
   private final Optional<eth.b> d;

   public evp(List<ews> $$0, List<xd> $$1, eut $$2, Optional<eth.b> $$3) {
      super($$0);
      this.b = List.copyOf($$1);
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public euw<evp> b() {
      return eux.A;
   }

   @Override
   public Set<ewa<?>> a() {
      return this.d.<Set<ewa<?>>>map($$0 -> Set.of($$0.a())).orElseGet(Set::of);
   }

   @Override
   public cvp a(cvp $$0, eth $$1) {
      $$0.a(kr.i, cym.a, $$1x -> new cym(this.a($$1x, $$1)));
      return $$0;
   }

   private List<xd> a(@Nullable cym $$0, eth $$1) {
      if ($$0 == null && this.b.isEmpty()) {
         return List.of();
      } else {
         UnaryOperator<xd> $$2 = evq.a($$1, this.d.orElse(null));
         List<xd> $$3 = this.b.stream().map($$2).toList();
         return this.c.a($$0.a(), $$3, 256);
      }
   }

   public static evp.a c() {
      return new evp.a();
   }

   public static class a extends euu.a<evp.a> {
      private Optional<eth.b> a = Optional.empty();
      private final Builder<xd> b = ImmutableList.builder();
      private eut c = eut.a.b;

      public evp.a a(eut $$0) {
         this.c = $$0;
         return this;
      }

      public evp.a a(eth.b $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public evp.a a(xd $$0) {
         this.b.add($$0);
         return this;
      }

      protected evp.a a() {
         return this;
      }

      @Override
      public euv b() {
         return new evp(this.g(), this.b.build(), this.c, this.a);
      }
   }
}
