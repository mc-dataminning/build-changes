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

public record eyt(Map<String, evo> b, evp.b c) implements eyy {
   public static final MapCodec<eyt> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.unboundedMap(Codec.STRING, evo.a).fieldOf("scores").forGetter(eyt::c), evp.b.e.fieldOf("entity").forGetter(eyt::d))
            .apply($$0, eyt::new)
   );

   @Override
   public eyz b() {
      return eza.h;
   }

   @Override
   public Set<bah<?>> a() {
      return Stream.concat(Stream.of(this.c.a()), this.b.values().stream().flatMap($$0 -> $$0.a().stream())).collect(ImmutableSet.toImmutableSet());
   }

   public boolean a(evp $$0) {
      buj $$1 = $$0.c(this.c.a());
      if ($$1 == null) {
         return false;
      } else {
         fcd $$2 = $$0.d().g();

         for (Entry<String, evo> $$3 : this.b.entrySet()) {
            if (!this.a($$0, $$1, $$2, $$3.getKey(), $$3.getValue())) {
               return false;
            }
         }

         return true;
      }
   }

   protected boolean a(evp $$0, buj $$1, fcd $$2, String $$3, evo $$4) {
      fbv $$5 = $$2.a($$3);
      if ($$5 == null) {
         return false;
      } else {
         fbz $$6 = $$2.d($$1, $$5);
         return $$6 == null ? false : $$4.b($$0, $$6.a());
      }
   }

   public static eyt.a a(evp.b $$0) {
      return new eyt.a($$0);
   }

   public Map<String, evo> c() {
      return this.b;
   }

   public evp.b d() {
      return this.c;
   }

   public static class a implements eyy.a {
      private final Builder<String, evo> a = ImmutableMap.builder();
      private final evp.b b;

      public a(evp.b $$0) {
         this.b = $$0;
      }

      public eyt.a a(String $$0, evo $$1) {
         this.a.put($$0, $$1);
         return this;
      }

      @Override
      public eyy build() {
         return new eyt(this.a.build(), this.b);
      }
   }
}
