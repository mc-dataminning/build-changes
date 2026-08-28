import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSet.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class exg extends exu {
   public static final MapCodec<exg> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  ma.e.r().fieldOf("block").forGetter($$0x -> $$0x.b),
                  Codec.STRING.listOf().fieldOf("properties").forGetter($$0x -> $$0x.c.stream().map(dyp::f).toList())
               )
            )
            .apply($$0, exg::new)
   );
   private final jq<dke> b;
   private final Set<dyp<?>> c;

   exg(List<ezs> $$0, jq<dke> $$1, Set<dyp<?>> $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   private exg(List<ezs> $$0, jq<dke> $$1, List<String> $$2) {
      this($$0, $$1, $$2.stream().map($$1.a().l()::a).filter(Objects::nonNull).collect(Collectors.toSet()));
   }

   @Override
   public exw<exg> b() {
      return exx.D;
   }

   @Override
   public Set<eza<?>> a() {
      return ImmutableSet.of(ezd.g);
   }

   @Override
   protected cxk a(cxk $$0, ewh $$1) {
      dxn $$2 = $$1.c(ezd.g);
      if ($$2 != null) {
         $$0.a(ku.am, czm.a, $$1x -> {
            for (dyp<?> $$2x : this.c) {
               if ($$2.b($$2x)) {
                  $$1x = $$1x.a($$2x, $$2);
               }
            }

            return $$1x;
         });
      }

      return $$0;
   }

   public static exg.a a(dke $$0) {
      return new exg.a($$0);
   }

   public static class a extends exu.a<exg.a> {
      private final jq<dke> a;
      private final Builder<dyp<?>> b = ImmutableSet.builder();

      a(dke $$0) {
         this.a = $$0.p();
      }

      public exg.a a(dyp<?> $$0) {
         if (!this.a.a().l().d().contains($$0)) {
            throw new IllegalStateException("Property " + $$0 + " is not present on block " + this.a);
         } else {
            this.b.add($$0);
            return this;
         }
      }

      protected exg.a a() {
         return this;
      }

      @Override
      public exv b() {
         return new exg(this.g(), this.a, this.b.build());
      }
   }
}
