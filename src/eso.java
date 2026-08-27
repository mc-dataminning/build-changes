import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSet.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class eso extends eta {
   public static final Codec<eso> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  lh.e.r().fieldOf("block").forGetter($$0x -> $$0x.b),
                  Codec.STRING.listOf().fieldOf("properties").forGetter($$0x -> $$0x.c.stream().map(duf::f).toList())
               )
            )
            .apply($$0, eso::new)
   );
   private final ja<dfc> b;
   private final Set<duf<?>> c;

   eso(List<euu> $$0, ja<dfc> $$1, Set<duf<?>> $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   private eso(List<euu> $$0, ja<dfc> $$1, List<String> $$2) {
      this($$0, $$1, $$2.stream().map($$1.a().l()::a).filter(Objects::nonNull).collect(Collectors.toSet()));
   }

   @Override
   public etc b() {
      return etd.A;
   }

   @Override
   public Set<eud<?>> a() {
      return ImmutableSet.of(eug.g);
   }

   @Override
   protected cuh a(cuh $$0, erp $$1) {
      dtc $$2 = $$1.c(eug.g);
      if ($$2 != null) {
         $$0.a(ke.aa, cxb.a, $$1x -> {
            for (duf<?> $$2x : this.c) {
               if ($$2.b($$2x)) {
                  $$1x = $$1x.a($$2x, $$2);
               }
            }

            return $$1x;
         });
      }

      return $$0;
   }

   public static eso.a a(dfc $$0) {
      return new eso.a($$0);
   }

   public static class a extends eta.a<eso.a> {
      private final ja<dfc> a;
      private final Builder<duf<?>> b = ImmutableSet.builder();

      a(dfc $$0) {
         this.a = $$0.r();
      }

      public eso.a a(duf<?> $$0) {
         if (!this.a.a().l().d().contains($$0)) {
            throw new IllegalStateException("Property " + $$0 + " is not present on block " + this.a);
         } else {
            this.b.add($$0);
            return this;
         }
      }

      protected eso.a a() {
         return this;
      }

      @Override
      public etb b() {
         return new eso(this.g(), this.a, this.b.build());
      }
   }
}
