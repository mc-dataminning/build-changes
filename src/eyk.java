import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSet.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class eyk extends eyy {
   public static final MapCodec<eyk> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  md.e.r().fieldOf("block").forGetter($$0x -> $$0x.b),
                  Codec.STRING.listOf().fieldOf("properties").forGetter($$0x -> $$0x.c.stream().map(dzp::f).toList())
               )
            )
            .apply($$0, eyk::new)
   );
   private final js<dku> b;
   private final Set<dzp<?>> c;

   eyk(List<fau> $$0, js<dku> $$1, Set<dzp<?>> $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   private eyk(List<fau> $$0, js<dku> $$1, List<String> $$2) {
      this($$0, $$1, $$2.stream().map($$1.a().l()::a).filter(Objects::nonNull).collect(Collectors.toSet()));
   }

   @Override
   public eza<eyk> b() {
      return ezb.D;
   }

   @Override
   public Set<bat<?>> a() {
      return Set.of(faf.g);
   }

   @Override
   protected cxy a(cxy $$0, exl $$1) {
      dym $$2 = $$1.c(faf.g);
      if ($$2 != null) {
         $$0.a(kx.ao, czx.a, $$1x -> {
            for (dzp<?> $$2x : this.c) {
               if ($$2.b($$2x)) {
                  $$1x = $$1x.a($$2x, $$2);
               }
            }

            return $$1x;
         });
      }

      return $$0;
   }

   public static eyk.a a(dku $$0) {
      return new eyk.a($$0);
   }

   public static class a extends eyy.a<eyk.a> {
      private final js<dku> a;
      private final Builder<dzp<?>> b = ImmutableSet.builder();

      a(dku $$0) {
         this.a = $$0.p();
      }

      public eyk.a a(dzp<?> $$0) {
         if (!this.a.a().l().d().contains($$0)) {
            throw new IllegalStateException("Property " + $$0 + " is not present on block " + this.a);
         } else {
            this.b.add($$0);
            return this;
         }
      }

      protected eyk.a a() {
         return this;
      }

      @Override
      public eyz b() {
         return new eyk(this.g(), this.a, this.b.build());
      }
   }
}
