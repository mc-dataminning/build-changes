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

public record etn(Map<String, eqh> b, eqi.b c) implements ets {
   public static final MapCodec<etn> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.unboundedMap(Codec.STRING, eqh.a).fieldOf("scores").forGetter(etn::c), eqi.b.e.fieldOf("entity").forGetter(etn::d))
            .apply($$0, etn::new)
   );

   @Override
   public ett b() {
      return etu.j;
   }

   @Override
   public Set<etb<?>> a() {
      return Stream.concat(Stream.of(this.c.a()), this.b.values().stream().flatMap($$0 -> $$0.a().stream())).collect(ImmutableSet.toImmutableSet());
   }

   public boolean a(eqi $$0) {
      bsu $$1 = $$0.c(this.c.a());
      if ($$1 == null) {
         return false;
      } else {
         ewv $$2 = $$0.d().f();

         for (Entry<String, eqh> $$3 : this.b.entrySet()) {
            if (!this.a($$0, $$1, $$2, $$3.getKey(), $$3.getValue())) {
               return false;
            }
         }

         return true;
      }
   }

   protected boolean a(eqi $$0, bsu $$1, ewv $$2, String $$3, eqh $$4) {
      ewn $$5 = $$2.a($$3);
      if ($$5 == null) {
         return false;
      } else {
         ewr $$6 = $$2.d($$1, $$5);
         return $$6 == null ? false : $$4.b($$0, $$6.a());
      }
   }

   public static etn.a a(eqi.b $$0) {
      return new etn.a($$0);
   }

   public Map<String, eqh> c() {
      return this.b;
   }

   public eqi.b d() {
      return this.c;
   }

   public static class a implements ets.a {
      private final Builder<String, eqh> a = ImmutableMap.builder();
      private final eqi.b b;

      public a(eqi.b $$0) {
         this.b = $$0;
      }

      public etn.a a(String $$0, eqh $$1) {
         this.a.put($$0, $$1);
         return this;
      }

      @Override
      public ets build() {
         return new etn(this.a.build(), this.b);
      }
   }
}
