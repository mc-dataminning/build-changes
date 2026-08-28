import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSet.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class eri extends erv {
   public static final MapCodec<eri> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  lp.e.r().fieldOf("block").forGetter($$0x -> $$0x.b),
                  Codec.STRING.listOf().fieldOf("properties").forGetter($$0x -> $$0x.c.stream().map(dtg::f).toList())
               )
            )
            .apply($$0, eri::new)
   );
   private final ji<dfa> b;
   private final Set<dtg<?>> c;

   eri(List<ett> $$0, ji<dfa> $$1, Set<dtg<?>> $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   private eri(List<ett> $$0, ji<dfa> $$1, List<String> $$2) {
      this($$0, $$1, $$2.stream().map($$1.a().l()::a).filter(Objects::nonNull).collect(Collectors.toSet()));
   }

   @Override
   public erx<eri> b() {
      return ery.D;
   }

   @Override
   public Set<etc<?>> a() {
      return ImmutableSet.of(etf.g);
   }

   @Override
   protected cuq a(cuq $$0, eqj $$1) {
      dsd $$2 = $$1.c(etf.g);
      if ($$2 != null) {
         $$0.a(km.ab, cxb.a, $$1x -> {
            for (dtg<?> $$2x : this.c) {
               if ($$2.b($$2x)) {
                  $$1x = $$1x.a($$2x, $$2);
               }
            }

            return $$1x;
         });
      }

      return $$0;
   }

   public static eri.a a(dfa $$0) {
      return new eri.a($$0);
   }

   public static class a extends erv.a<eri.a> {
      private final ji<dfa> a;
      private final Builder<dtg<?>> b = ImmutableSet.builder();

      a(dfa $$0) {
         this.a = $$0.s();
      }

      public eri.a a(dtg<?> $$0) {
         if (!this.a.a().l().d().contains($$0)) {
            throw new IllegalStateException("Property " + $$0 + " is not present on block " + this.a);
         } else {
            this.b.add($$0);
            return this;
         }
      }

      protected eri.a a() {
         return this;
      }

      @Override
      public erw b() {
         return new eri(this.g(), this.a, this.b.build());
      }
   }
}
