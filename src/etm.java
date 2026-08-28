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

public record etm(Map<String, eqg> b, eqh.b c) implements etr {
   public static final MapCodec<etm> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.unboundedMap(Codec.STRING, eqg.a).fieldOf("scores").forGetter(etm::c), eqh.b.e.fieldOf("entity").forGetter(etm::d))
            .apply($$0, etm::new)
   );

   @Override
   public ets b() {
      return ett.j;
   }

   @Override
   public Set<eta<?>> a() {
      return Stream.concat(Stream.of(this.c.a()), this.b.values().stream().flatMap($$0 -> $$0.a().stream())).collect(ImmutableSet.toImmutableSet());
   }

   public boolean a(eqh $$0) {
      bst $$1 = $$0.c(this.c.a());
      if ($$1 == null) {
         return false;
      } else {
         ewu $$2 = $$0.d().f();

         for (Entry<String, eqg> $$3 : this.b.entrySet()) {
            if (!this.a($$0, $$1, $$2, $$3.getKey(), $$3.getValue())) {
               return false;
            }
         }

         return true;
      }
   }

   protected boolean a(eqh $$0, bst $$1, ewu $$2, String $$3, eqg $$4) {
      ewm $$5 = $$2.a($$3);
      if ($$5 == null) {
         return false;
      } else {
         ewq $$6 = $$2.d($$1, $$5);
         return $$6 == null ? false : $$4.b($$0, $$6.a());
      }
   }

   public static etm.a a(eqh.b $$0) {
      return new etm.a($$0);
   }

   public Map<String, eqg> c() {
      return this.b;
   }

   public eqh.b d() {
      return this.c;
   }

   public static class a implements etr.a {
      private final Builder<String, eqg> a = ImmutableMap.builder();
      private final eqh.b b;

      public a(eqh.b $$0) {
         this.b = $$0;
      }

      public etm.a a(String $$0, eqg $$1) {
         this.a.put($$0, $$1);
         return this;
      }

      @Override
      public etr build() {
         return new etm(this.a.build(), this.b);
      }
   }
}
