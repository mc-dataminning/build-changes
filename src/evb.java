import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSet.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class evb extends evp {
   public static final MapCodec<evb> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  ly.e.r().fieldOf("block").forGetter($$0x -> $$0x.b),
                  Codec.STRING.listOf().fieldOf("properties").forGetter($$0x -> $$0x.c.stream().map(dwm::f).toList())
               )
            )
            .apply($$0, evb::new)
   );
   private final jq<die> b;
   private final Set<dwm<?>> c;

   evb(List<exn> $$0, jq<die> $$1, Set<dwm<?>> $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   private evb(List<exn> $$0, jq<die> $$1, List<String> $$2) {
      this($$0, $$1, $$2.stream().map($$1.a().l()::a).filter(Objects::nonNull).collect(Collectors.toSet()));
   }

   @Override
   public evr<evb> b() {
      return evs.D;
   }

   @Override
   public Set<ewv<?>> a() {
      return ImmutableSet.of(ewy.g);
   }

   @Override
   protected cwb a(cwb $$0, euc $$1) {
      dvj $$2 = $$1.c(ewy.g);
      if ($$2 != null) {
         $$0.a(ku.am, cyd.a, $$1x -> {
            for (dwm<?> $$2x : this.c) {
               if ($$2.b($$2x)) {
                  $$1x = $$1x.a($$2x, $$2);
               }
            }

            return $$1x;
         });
      }

      return $$0;
   }

   public static evb.a a(die $$0) {
      return new evb.a($$0);
   }

   public static class a extends evp.a<evb.a> {
      private final jq<die> a;
      private final Builder<dwm<?>> b = ImmutableSet.builder();

      a(die $$0) {
         this.a = $$0.p();
      }

      public evb.a a(dwm<?> $$0) {
         if (!this.a.a().l().d().contains($$0)) {
            throw new IllegalStateException("Property " + $$0 + " is not present on block " + this.a);
         } else {
            this.b.add($$0);
            return this;
         }
      }

      protected evb.a a() {
         return this;
      }

      @Override
      public evq b() {
         return new evb(this.g(), this.a, this.b.build());
      }
   }
}
