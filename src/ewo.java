import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSet.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class ewo extends exc {
   public static final MapCodec<ewo> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  mb.e.r().fieldOf("block").forGetter($$0x -> $$0x.b),
                  Codec.STRING.listOf().fieldOf("properties").forGetter($$0x -> $$0x.c.stream().map(dxx::f).toList())
               )
            )
            .apply($$0, ewo::new)
   );
   private final jr<djk> b;
   private final Set<dxx<?>> c;

   ewo(List<eyy> $$0, jr<djk> $$1, Set<dxx<?>> $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   private ewo(List<eyy> $$0, jr<djk> $$1, List<String> $$2) {
      this($$0, $$1, $$2.stream().map($$1.a().l()::a).filter(Objects::nonNull).collect(Collectors.toSet()));
   }

   @Override
   public exe<ewo> b() {
      return exf.D;
   }

   @Override
   public Set<bah<?>> a() {
      return Set.of(eyj.g);
   }

   @Override
   protected cwn a(cwn $$0, evp $$1) {
      dwv $$2 = $$1.c(eyj.g);
      if ($$2 != null) {
         $$0.a(kv.am, cyp.a, $$1x -> {
            for (dxx<?> $$2x : this.c) {
               if ($$2.b($$2x)) {
                  $$1x = $$1x.a($$2x, $$2);
               }
            }

            return $$1x;
         });
      }

      return $$0;
   }

   public static ewo.a a(djk $$0) {
      return new ewo.a($$0);
   }

   public static class a extends exc.a<ewo.a> {
      private final jr<djk> a;
      private final Builder<dxx<?>> b = ImmutableSet.builder();

      a(djk $$0) {
         this.a = $$0.p();
      }

      public ewo.a a(dxx<?> $$0) {
         if (!this.a.a().l().d().contains($$0)) {
            throw new IllegalStateException("Property " + $$0 + " is not present on block " + this.a);
         } else {
            this.b.add($$0);
            return this;
         }
      }

      protected ewo.a a() {
         return this;
      }

      @Override
      public exd b() {
         return new ewo(this.g(), this.a, this.b.build());
      }
   }
}
