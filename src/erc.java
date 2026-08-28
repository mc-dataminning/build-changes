import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSet.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class erc extends erp {
   public static final MapCodec<erc> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  lp.e.r().fieldOf("block").forGetter($$0x -> $$0x.b),
                  Codec.STRING.listOf().fieldOf("properties").forGetter($$0x -> $$0x.c.stream().map(dta::f).toList())
               )
            )
            .apply($$0, erc::new)
   );
   private final ji<deu> b;
   private final Set<dta<?>> c;

   erc(List<etn> $$0, ji<deu> $$1, Set<dta<?>> $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   private erc(List<etn> $$0, ji<deu> $$1, List<String> $$2) {
      this($$0, $$1, $$2.stream().map($$1.a().l()::a).filter(Objects::nonNull).collect(Collectors.toSet()));
   }

   @Override
   public err<erc> b() {
      return ers.D;
   }

   @Override
   public Set<esw<?>> a() {
      return ImmutableSet.of(esz.g);
   }

   @Override
   protected cuk a(cuk $$0, eqd $$1) {
      drx $$2 = $$1.c(esz.g);
      if ($$2 != null) {
         $$0.a(km.aa, cwv.a, $$1x -> {
            for (dta<?> $$2x : this.c) {
               if ($$2.b($$2x)) {
                  $$1x = $$1x.a($$2x, $$2);
               }
            }

            return $$1x;
         });
      }

      return $$0;
   }

   public static erc.a a(deu $$0) {
      return new erc.a($$0);
   }

   public static class a extends erp.a<erc.a> {
      private final ji<deu> a;
      private final Builder<dta<?>> b = ImmutableSet.builder();

      a(deu $$0) {
         this.a = $$0.q();
      }

      public erc.a a(dta<?> $$0) {
         if (!this.a.a().l().d().contains($$0)) {
            throw new IllegalStateException("Property " + $$0 + " is not present on block " + this.a);
         } else {
            this.b.add($$0);
            return this;
         }
      }

      protected erc.a a() {
         return this;
      }

      @Override
      public erq b() {
         return new erc(this.g(), this.a, this.b.build());
      }
   }
}
