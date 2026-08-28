import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.stream.Stream;

public record etl(Map<String, eqf> b, eqg.b c) implements etq {
   public static final MapCodec<etl> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.unboundedMap(Codec.STRING, eqf.a).fieldOf("scores").forGetter(etl::c), eqg.b.e.fieldOf("entity").forGetter(etl::d))
            .apply($$0, etl::new)
   );

   @Override
   public etr b() {
      return ets.j;
   }

   @Override
   public Set<esz<?>> a() {
      return Stream.concat(Stream.of(this.c.a()), this.b.values().stream().flatMap($$0 -> $$0.a().stream())).collect(ImmutableSet.toImmutableSet());
   }

   public boolean a(eqg $$0) {
      bss $$1 = $$0.c(this.c.a());
      if ($$1 == null) {
         return false;
      } else {
         ewt $$2 = $$0.d().f();

         for (Entry<String, eqf> $$3 : this.b.entrySet()) {
            if (!this.a($$0, $$1, $$2, $$3.getKey(), $$3.getValue())) {
               return false;
            }
         }

         return true;
      }
   }

   protected boolean a(eqg $$0, bss $$1, ewt $$2, String $$3, eqf $$4) {
      ewl $$5 = $$2.a($$3);
      if ($$5 == null) {
         return false;
      } else {
         ewp $$6 = $$2.d($$1, $$5);
         return $$6 == null ? false : $$4.b($$0, $$6.a());
      }
   }

   public static etl.a a(eqg.b $$0) {
      return new etl.a($$0);
   }

   public Map<String, eqf> c() {
      return this.b;
   }

   public eqg.b d() {
      return this.c;
   }

   public static class a implements etq.a {
      private final Builder<String, eqf> a = ImmutableMap.builder();
      private final eqg.b b;

      public a(eqg.b $$0) {
         this.b = $$0;
      }

      public etl.a a(String $$0, eqf $$1) {
         this.a.put($$0, $$1);
         return this;
      }

      @Override
      public etq build() {
         return new etl(this.a.build(), this.b);
      }
   }
}
