import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSet.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class ern extends esb {
   public static final MapCodec<ern> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  lq.e.s().fieldOf("block").forGetter($$0x -> $$0x.b),
                  Codec.STRING.listOf().fieldOf("properties").forGetter($$0x -> $$0x.c.stream().map(dtk::f).toList())
               )
            )
            .apply($$0, ern::new)
   );
   private final jj<dff> b;
   private final Set<dtk<?>> c;

   ern(List<etz> $$0, jj<dff> $$1, Set<dtk<?>> $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   private ern(List<etz> $$0, jj<dff> $$1, List<String> $$2) {
      this($$0, $$1, $$2.stream().map($$1.a().l()::a).filter(Objects::nonNull).collect(Collectors.toSet()));
   }

   @Override
   public esd<ern> b() {
      return ese.D;
   }

   @Override
   public Set<eth<?>> a() {
      return ImmutableSet.of(etk.g);
   }

   @Override
   protected cua a(cua $$0, eqo $$1) {
      dsh $$2 = $$1.c(etk.g);
      if ($$2 != null) {
         $$0.a(kn.ab, cwk.a, $$1x -> {
            for (dtk<?> $$2x : this.c) {
               if ($$2.b($$2x)) {
                  $$1x = $$1x.a($$2x, $$2);
               }
            }

            return $$1x;
         });
      }

      return $$0;
   }

   public static ern.a a(dff $$0) {
      return new ern.a($$0);
   }

   public static class a extends esb.a<ern.a> {
      private final jj<dff> a;
      private final Builder<dtk<?>> b = ImmutableSet.builder();

      a(dff $$0) {
         this.a = $$0.s();
      }

      public ern.a a(dtk<?> $$0) {
         if (!this.a.a().l().d().contains($$0)) {
            throw new IllegalStateException("Property " + $$0 + " is not present on block " + this.a);
         } else {
            this.b.add($$0);
            return this;
         }
      }

      protected ern.a a() {
         return this;
      }

      @Override
      public esc b() {
         return new ern(this.g(), this.a, this.b.build());
      }
   }
}
