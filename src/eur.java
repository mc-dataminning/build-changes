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

public record eur(Map<String, erk> b, erl.b c) implements euw {
   public static final MapCodec<eur> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.unboundedMap(Codec.STRING, erk.a).fieldOf("scores").forGetter(eur::c), erl.b.e.fieldOf("entity").forGetter(eur::d))
            .apply($$0, eur::new)
   );

   @Override
   public eux b() {
      return euy.h;
   }

   @Override
   public Set<eue<?>> a() {
      return Stream.concat(Stream.of(this.c.a()), this.b.values().stream().flatMap($$0 -> $$0.a().stream())).collect(ImmutableSet.toImmutableSet());
   }

   public boolean a(erl $$0) {
      bsq $$1 = $$0.c(this.c.a());
      if ($$1 == null) {
         return false;
      } else {
         eya $$2 = $$0.d().f();

         for (Entry<String, erk> $$3 : this.b.entrySet()) {
            if (!this.a($$0, $$1, $$2, $$3.getKey(), $$3.getValue())) {
               return false;
            }
         }

         return true;
      }
   }

   protected boolean a(erl $$0, bsq $$1, eya $$2, String $$3, erk $$4) {
      exs $$5 = $$2.a($$3);
      if ($$5 == null) {
         return false;
      } else {
         exw $$6 = $$2.d($$1, $$5);
         return $$6 == null ? false : $$4.b($$0, $$6.a());
      }
   }

   public static eur.a a(erl.b $$0) {
      return new eur.a($$0);
   }

   public Map<String, erk> c() {
      return this.b;
   }

   public erl.b d() {
      return this.c;
   }

   public static class a implements euw.a {
      private final Builder<String, erk> a = ImmutableMap.builder();
      private final erl.b b;

      public a(erl.b $$0) {
         this.b = $$0;
      }

      public eur.a a(String $$0, erk $$1) {
         this.a.put($$0, $$1);
         return this;
      }

      @Override
      public euw build() {
         return new eur(this.a.build(), this.b);
      }
   }
}
