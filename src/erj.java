import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSet.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class erj extends erw {
   public static final MapCodec<erj> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  lp.e.r().fieldOf("block").forGetter($$0x -> $$0x.b),
                  Codec.STRING.listOf().fieldOf("properties").forGetter($$0x -> $$0x.c.stream().map(dth::f).toList())
               )
            )
            .apply($$0, erj::new)
   );
   private final ji<dfb> b;
   private final Set<dth<?>> c;

   erj(List<etu> $$0, ji<dfb> $$1, Set<dth<?>> $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   private erj(List<etu> $$0, ji<dfb> $$1, List<String> $$2) {
      this($$0, $$1, $$2.stream().map($$1.a().l()::a).filter(Objects::nonNull).collect(Collectors.toSet()));
   }

   @Override
   public ery<erj> b() {
      return erz.D;
   }

   @Override
   public Set<etd<?>> a() {
      return ImmutableSet.of(etg.g);
   }

   @Override
   protected cur a(cur $$0, eqk $$1) {
      dse $$2 = $$1.c(etg.g);
      if ($$2 != null) {
         $$0.a(km.ab, cxc.a, $$1x -> {
            for (dth<?> $$2x : this.c) {
               if ($$2.b($$2x)) {
                  $$1x = $$1x.a($$2x, $$2);
               }
            }

            return $$1x;
         });
      }

      return $$0;
   }

   public static erj.a a(dfb $$0) {
      return new erj.a($$0);
   }

   public static class a extends erw.a<erj.a> {
      private final ji<dfb> a;
      private final Builder<dth<?>> b = ImmutableSet.builder();

      a(dfb $$0) {
         this.a = $$0.s();
      }

      public erj.a a(dth<?> $$0) {
         if (!this.a.a().l().d().contains($$0)) {
            throw new IllegalStateException("Property " + $$0 + " is not present on block " + this.a);
         } else {
            this.b.add($$0);
            return this;
         }
      }

      protected erj.a a() {
         return this;
      }

      @Override
      public erx b() {
         return new erj(this.g(), this.a, this.b.build());
      }
   }
}
