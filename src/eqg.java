import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.stream.Stream;

public record eqg(Map<String, enj> b, enk.b c) implements eql {
   public static final Codec<eqg> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.unboundedMap(Codec.STRING, enj.a).fieldOf("scores").forGetter(eqg::c), enk.b.e.fieldOf("entity").forGetter(eqg::d))
            .apply($$0, eqg::new)
   );

   @Override
   public eqm b() {
      return eqn.i;
   }

   @Override
   public Set<epu<?>> a() {
      return Stream.concat(Stream.of(this.c.a()), this.b.values().stream().flatMap($$0 -> $$0.a().stream())).collect(ImmutableSet.toImmutableSet());
   }

   public boolean a(enk $$0) {
      bqa $$1 = $$0.c(this.c.a());
      if ($$1 == null) {
         return false;
      } else {
         etn $$2 = $$0.d().f();

         for (Entry<String, enj> $$3 : this.b.entrySet()) {
            if (!this.a($$0, $$1, $$2, $$3.getKey(), $$3.getValue())) {
               return false;
            }
         }

         return true;
      }
   }

   protected boolean a(enk $$0, bqa $$1, etn $$2, String $$3, enj $$4) {
      etf $$5 = $$2.a($$3);
      if ($$5 == null) {
         return false;
      } else {
         etj $$6 = $$2.d($$1, $$5);
         return $$6 == null ? false : $$4.b($$0, $$6.a());
      }
   }

   public static eqg.a a(enk.b $$0) {
      return new eqg.a($$0);
   }

   public Map<String, enj> c() {
      return this.b;
   }

   public enk.b d() {
      return this.c;
   }

   public static class a implements eql.a {
      private final Builder<String, enj> a = ImmutableMap.builder();
      private final enk.b b;

      public a(enk.b $$0) {
         this.b = $$0;
      }

      public eqg.a a(String $$0, enj $$1) {
         this.a.put($$0, $$1);
         return this;
      }

      @Override
      public eql build() {
         return new eqg(this.a.build(), this.b);
      }
   }
}
