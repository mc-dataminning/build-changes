import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;

public class esp extends ert {
   public static final MapCodec<esp> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  xq.a.sizeLimitedListOf(256).fieldOf("lore").forGetter($$0x -> $$0x.b),
                  ers.a(256).forGetter($$0x -> $$0x.c),
                  eqh.b.e.optionalFieldOf("entity").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, esp::new)
   );
   private final List<xo> b;
   private final ers c;
   private final Optional<eqh.b> d;

   public esp(List<etr> $$0, List<xo> $$1, ers $$2, Optional<eqh.b> $$3) {
      super($$0);
      this.b = List.copyOf($$1);
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public erv<esp> b() {
      return erw.A;
   }

   @Override
   public Set<eta<?>> a() {
      return this.d.<Set<eta<?>>>map($$0 -> Set.of($$0.a())).orElseGet(Set::of);
   }

   @Override
   public cuo a(cuo $$0, eqh $$1) {
      $$0.a(km.i, cxl.a, $$1x -> new cxl(this.a($$1x, $$1)));
      return $$0;
   }

   private List<xo> a(@Nullable cxl $$0, eqh $$1) {
      if ($$0 == null && this.b.isEmpty()) {
         return List.of();
      } else {
         UnaryOperator<xo> $$2 = esq.a($$1, this.d.orElse(null));
         List<xo> $$3 = this.b.stream().map($$2).toList();
         return this.c.a($$0.a(), $$3, 256);
      }
   }

   public static esp.a c() {
      return new esp.a();
   }

   public static class a extends ert.a<esp.a> {
      private Optional<eqh.b> a = Optional.empty();
      private final Builder<xo> b = ImmutableList.builder();
      private ers c = ers.a.b;

      public esp.a a(ers $$0) {
         this.c = $$0;
         return this;
      }

      public esp.a a(eqh.b $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public esp.a a(xo $$0) {
         this.b.add($$0);
         return this;
      }

      protected esp.a a() {
         return this;
      }

      @Override
      public eru b() {
         return new esp(this.g(), this.b.build(), this.c, this.a);
      }
   }
}
