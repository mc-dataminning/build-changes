import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSet.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class exh extends exv {
   public static final MapCodec<exh> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  ma.e.r().fieldOf("block").forGetter($$0x -> $$0x.b),
                  Codec.STRING.listOf().fieldOf("properties").forGetter($$0x -> $$0x.c.stream().map(dyq::f).toList())
               )
            )
            .apply($$0, exh::new)
   );
   private final jq<dkd> b;
   private final Set<dyq<?>> c;

   exh(List<ezr> $$0, jq<dkd> $$1, Set<dyq<?>> $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   private exh(List<ezr> $$0, jq<dkd> $$1, List<String> $$2) {
      this($$0, $$1, $$2.stream().map($$1.a().l()::a).filter(Objects::nonNull).collect(Collectors.toSet()));
   }

   @Override
   public exx<exh> b() {
      return exy.D;
   }

   @Override
   public Set<bbd<?>> a() {
      return Set.of(ezc.g);
   }

   @Override
   protected cxg a(cxg $$0, ewi $$1) {
      dxo $$2 = $$1.c(ezc.g);
      if ($$2 != null) {
         $$0.a(ku.am, czi.a, $$1x -> {
            for (dyq<?> $$2x : this.c) {
               if ($$2.b($$2x)) {
                  $$1x = $$1x.a($$2x, $$2);
               }
            }

            return $$1x;
         });
      }

      return $$0;
   }

   public static exh.a a(dkd $$0) {
      return new exh.a($$0);
   }

   public static class a extends exv.a<exh.a> {
      private final jq<dkd> a;
      private final Builder<dyq<?>> b = ImmutableSet.builder();

      a(dkd $$0) {
         this.a = $$0.p();
      }

      public exh.a a(dyq<?> $$0) {
         if (!this.a.a().l().d().contains($$0)) {
            throw new IllegalStateException("Property " + $$0 + " is not present on block " + this.a);
         } else {
            this.b.add($$0);
            return this;
         }
      }

      protected exh.a a() {
         return this;
      }

      @Override
      public exw b() {
         return new exh(this.g(), this.a, this.b.build());
      }
   }
}
