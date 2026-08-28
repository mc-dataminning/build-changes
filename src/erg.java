import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSet.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class erg extends ert {
   public static final MapCodec<erg> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  lp.e.r().fieldOf("block").forGetter($$0x -> $$0x.b),
                  Codec.STRING.listOf().fieldOf("properties").forGetter($$0x -> $$0x.c.stream().map(dte::f).toList())
               )
            )
            .apply($$0, erg::new)
   );
   private final ji<dey> b;
   private final Set<dte<?>> c;

   erg(List<etr> $$0, ji<dey> $$1, Set<dte<?>> $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   private erg(List<etr> $$0, ji<dey> $$1, List<String> $$2) {
      this($$0, $$1, $$2.stream().map($$1.a().l()::a).filter(Objects::nonNull).collect(Collectors.toSet()));
   }

   @Override
   public erv<erg> b() {
      return erw.D;
   }

   @Override
   public Set<eta<?>> a() {
      return ImmutableSet.of(etd.g);
   }

   @Override
   protected cuo a(cuo $$0, eqh $$1) {
      dsb $$2 = $$1.c(etd.g);
      if ($$2 != null) {
         $$0.a(km.ab, cwz.a, $$1x -> {
            for (dte<?> $$2x : this.c) {
               if ($$2.b($$2x)) {
                  $$1x = $$1x.a($$2x, $$2);
               }
            }

            return $$1x;
         });
      }

      return $$0;
   }

   public static erg.a a(dey $$0) {
      return new erg.a($$0);
   }

   public static class a extends ert.a<erg.a> {
      private final ji<dey> a;
      private final Builder<dte<?>> b = ImmutableSet.builder();

      a(dey $$0) {
         this.a = $$0.s();
      }

      public erg.a a(dte<?> $$0) {
         if (!this.a.a().l().d().contains($$0)) {
            throw new IllegalStateException("Property " + $$0 + " is not present on block " + this.a);
         } else {
            this.b.add($$0);
            return this;
         }
      }

      protected erg.a a() {
         return this;
      }

      @Override
      public eru b() {
         return new erg(this.g(), this.a, this.b.build());
      }
   }
}
