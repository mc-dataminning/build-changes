import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSet.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class erf extends ers {
   public static final MapCodec<erf> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  lp.e.r().fieldOf("block").forGetter($$0x -> $$0x.b),
                  Codec.STRING.listOf().fieldOf("properties").forGetter($$0x -> $$0x.c.stream().map(dtd::f).toList())
               )
            )
            .apply($$0, erf::new)
   );
   private final ji<dex> b;
   private final Set<dtd<?>> c;

   erf(List<etq> $$0, ji<dex> $$1, Set<dtd<?>> $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   private erf(List<etq> $$0, ji<dex> $$1, List<String> $$2) {
      this($$0, $$1, $$2.stream().map($$1.a().l()::a).filter(Objects::nonNull).collect(Collectors.toSet()));
   }

   @Override
   public eru<erf> b() {
      return erv.D;
   }

   @Override
   public Set<esz<?>> a() {
      return ImmutableSet.of(etc.g);
   }

   @Override
   protected cun a(cun $$0, eqg $$1) {
      dsa $$2 = $$1.c(etc.g);
      if ($$2 != null) {
         $$0.a(km.aa, cwy.a, $$1x -> {
            for (dtd<?> $$2x : this.c) {
               if ($$2.b($$2x)) {
                  $$1x = $$1x.a($$2x, $$2);
               }
            }

            return $$1x;
         });
      }

      return $$0;
   }

   public static erf.a a(dex $$0) {
      return new erf.a($$0);
   }

   public static class a extends ers.a<erf.a> {
      private final ji<dex> a;
      private final Builder<dtd<?>> b = ImmutableSet.builder();

      a(dex $$0) {
         this.a = $$0.s();
      }

      public erf.a a(dtd<?> $$0) {
         if (!this.a.a().l().d().contains($$0)) {
            throw new IllegalStateException("Property " + $$0 + " is not present on block " + this.a);
         } else {
            this.b.add($$0);
            return this;
         }
      }

      protected erf.a a() {
         return this;
      }

      @Override
      public ert b() {
         return new erf(this.g(), this.a, this.b.build());
      }
   }
}
