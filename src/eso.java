import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;

public class eso extends ers {
   public static final MapCodec<eso> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  xq.a.sizeLimitedListOf(256).fieldOf("lore").forGetter($$0x -> $$0x.b),
                  err.a(256).forGetter($$0x -> $$0x.c),
                  eqg.b.e.optionalFieldOf("entity").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, eso::new)
   );
   private final List<xo> b;
   private final err c;
   private final Optional<eqg.b> d;

   public eso(List<etq> $$0, List<xo> $$1, err $$2, Optional<eqg.b> $$3) {
      super($$0);
      this.b = List.copyOf($$1);
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public eru<eso> b() {
      return erv.A;
   }

   @Override
   public Set<esz<?>> a() {
      return this.d.<Set<esz<?>>>map($$0 -> Set.of($$0.a())).orElseGet(Set::of);
   }

   @Override
   public cun a(cun $$0, eqg $$1) {
      $$0.a(km.h, cxk.a, $$1x -> new cxk(this.a($$1x, $$1)));
      return $$0;
   }

   private List<xo> a(@Nullable cxk $$0, eqg $$1) {
      if ($$0 == null && this.b.isEmpty()) {
         return List.of();
      } else {
         UnaryOperator<xo> $$2 = esp.a($$1, this.d.orElse(null));
         List<xo> $$3 = this.b.stream().map($$2).toList();
         return this.c.a($$0.a(), $$3, 256);
      }
   }

   public static eso.a c() {
      return new eso.a();
   }

   public static class a extends ers.a<eso.a> {
      private Optional<eqg.b> a = Optional.empty();
      private final Builder<xo> b = ImmutableList.builder();
      private err c = err.a.b;

      public eso.a a(err $$0) {
         this.c = $$0;
         return this;
      }

      public eso.a a(eqg.b $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public eso.a a(xo $$0) {
         this.b.add($$0);
         return this;
      }

      protected eso.a a() {
         return this;
      }

      @Override
      public ert b() {
         return new eso(this.g(), this.b.build(), this.c, this.a);
      }
   }
}
