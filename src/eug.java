import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSet.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class eug extends euu {
   public static final MapCodec<eug> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  lu.e.r().fieldOf("block").forGetter($$0x -> $$0x.b),
                  Codec.STRING.listOf().fieldOf("properties").forGetter($$0x -> $$0x.c.stream().map(dvr::f).toList())
               )
            )
            .apply($$0, eug::new)
   );
   private final jn<dhj> b;
   private final Set<dvr<?>> c;

   eug(List<ews> $$0, jn<dhj> $$1, Set<dvr<?>> $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   private eug(List<ews> $$0, jn<dhj> $$1, List<String> $$2) {
      this($$0, $$1, $$2.stream().map($$1.a().n()::a).filter(Objects::nonNull).collect(Collectors.toSet()));
   }

   @Override
   public euw<eug> b() {
      return eux.D;
   }

   @Override
   public Set<ewa<?>> a() {
      return ImmutableSet.of(ewd.g);
   }

   @Override
   protected cvp a(cvp $$0, eth $$1) {
      duo $$2 = $$1.c(ewd.g);
      if ($$2 != null) {
         $$0.a(kr.ah, cxx.a, $$1x -> {
            for (dvr<?> $$2x : this.c) {
               if ($$2.b($$2x)) {
                  $$1x = $$1x.a($$2x, $$2);
               }
            }

            return $$1x;
         });
      }

      return $$0;
   }

   public static eug.a a(dhj $$0) {
      return new eug.a($$0);
   }

   public static class a extends euu.a<eug.a> {
      private final jn<dhj> a;
      private final Builder<dvr<?>> b = ImmutableSet.builder();

      a(dhj $$0) {
         this.a = $$0.s();
      }

      public eug.a a(dvr<?> $$0) {
         if (!this.a.a().n().d().contains($$0)) {
            throw new IllegalStateException("Property " + $$0 + " is not present on block " + this.a);
         } else {
            this.b.add($$0);
            return this;
         }
      }

      protected eug.a a() {
         return this;
      }

      @Override
      public euv b() {
         return new eug(this.g(), this.a, this.b.build());
      }
   }
}
