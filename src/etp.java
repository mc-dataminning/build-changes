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

public record etp(Map<String, eqj> b, eqk.b c) implements etu {
   public static final MapCodec<etp> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.unboundedMap(Codec.STRING, eqj.a).fieldOf("scores").forGetter(etp::c), eqk.b.e.fieldOf("entity").forGetter(etp::d))
            .apply($$0, etp::new)
   );

   @Override
   public etv b() {
      return etw.j;
   }

   @Override
   public Set<etd<?>> a() {
      return Stream.concat(Stream.of(this.c.a()), this.b.values().stream().flatMap($$0 -> $$0.a().stream())).collect(ImmutableSet.toImmutableSet());
   }

   public boolean a(eqk $$0) {
      bsw $$1 = $$0.c(this.c.a());
      if ($$1 == null) {
         return false;
      } else {
         ewx $$2 = $$0.d().f();

         for (Entry<String, eqj> $$3 : this.b.entrySet()) {
            if (!this.a($$0, $$1, $$2, $$3.getKey(), $$3.getValue())) {
               return false;
            }
         }

         return true;
      }
   }

   protected boolean a(eqk $$0, bsw $$1, ewx $$2, String $$3, eqj $$4) {
      ewp $$5 = $$2.a($$3);
      if ($$5 == null) {
         return false;
      } else {
         ewt $$6 = $$2.d($$1, $$5);
         return $$6 == null ? false : $$4.b($$0, $$6.a());
      }
   }

   public static etp.a a(eqk.b $$0) {
      return new etp.a($$0);
   }

   public Map<String, eqj> c() {
      return this.b;
   }

   public eqk.b d() {
      return this.c;
   }

   public static class a implements etu.a {
      private final Builder<String, eqj> a = ImmutableMap.builder();
      private final eqk.b b;

      public a(eqk.b $$0) {
         this.b = $$0;
      }

      public etp.a a(String $$0, eqj $$1) {
         this.a.put($$0, $$1);
         return this;
      }

      @Override
      public etu build() {
         return new etp(this.a.build(), this.b);
      }
   }
}
