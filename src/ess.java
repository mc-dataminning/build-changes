import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;

public class ess extends erw {
   public static final MapCodec<ess> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  xr.a.sizeLimitedListOf(256).fieldOf("lore").forGetter($$0x -> $$0x.b),
                  erv.a(256).forGetter($$0x -> $$0x.c),
                  eqk.b.e.optionalFieldOf("entity").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, ess::new)
   );
   private final List<xp> b;
   private final erv c;
   private final Optional<eqk.b> d;

   public ess(List<etu> $$0, List<xp> $$1, erv $$2, Optional<eqk.b> $$3) {
      super($$0);
      this.b = List.copyOf($$1);
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public ery<ess> b() {
      return erz.A;
   }

   @Override
   public Set<etd<?>> a() {
      return this.d.<Set<etd<?>>>map($$0 -> Set.of($$0.a())).orElseGet(Set::of);
   }

   @Override
   public cur a(cur $$0, eqk $$1) {
      $$0.a(km.i, cxo.a, $$1x -> new cxo(this.a($$1x, $$1)));
      return $$0;
   }

   private List<xp> a(@Nullable cxo $$0, eqk $$1) {
      if ($$0 == null && this.b.isEmpty()) {
         return List.of();
      } else {
         UnaryOperator<xp> $$2 = est.a($$1, this.d.orElse(null));
         List<xp> $$3 = this.b.stream().map($$2).toList();
         return this.c.a($$0.a(), $$3, 256);
      }
   }

   public static ess.a c() {
      return new ess.a();
   }

   public static class a extends erw.a<ess.a> {
      private Optional<eqk.b> a = Optional.empty();
      private final Builder<xp> b = ImmutableList.builder();
      private erv c = erv.a.b;

      public ess.a a(erv $$0) {
         this.c = $$0;
         return this;
      }

      public ess.a a(eqk.b $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public ess.a a(xp $$0) {
         this.b.add($$0);
         return this;
      }

      protected ess.a a() {
         return this;
      }

      @Override
      public erx b() {
         return new ess(this.g(), this.b.build(), this.c, this.a);
      }
   }
}
