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

public record ext(Map<String, eum> b, eun.b c) implements exy {
   public static final MapCodec<ext> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.unboundedMap(Codec.STRING, eum.a).fieldOf("scores").forGetter(ext::c), eun.b.e.fieldOf("entity").forGetter(ext::d))
            .apply($$0, ext::new)
   );

   @Override
   public exz b() {
      return eya.h;
   }

   @Override
   public Set<exg<?>> a() {
      return Stream.concat(Stream.of(this.c.a()), this.b.values().stream().flatMap($$0 -> $$0.a().stream())).collect(ImmutableSet.toImmutableSet());
   }

   public boolean a(eun $$0) {
      bul $$1 = $$0.c(this.c.a());
      if ($$1 == null) {
         return false;
      } else {
         fbd $$2 = $$0.d().g();

         for (Entry<String, eum> $$3 : this.b.entrySet()) {
            if (!this.a($$0, $$1, $$2, $$3.getKey(), $$3.getValue())) {
               return false;
            }
         }

         return true;
      }
   }

   protected boolean a(eun $$0, bul $$1, fbd $$2, String $$3, eum $$4) {
      fav $$5 = $$2.a($$3);
      if ($$5 == null) {
         return false;
      } else {
         faz $$6 = $$2.d($$1, $$5);
         return $$6 == null ? false : $$4.b($$0, $$6.a());
      }
   }

   public static ext.a a(eun.b $$0) {
      return new ext.a($$0);
   }

   public Map<String, eum> c() {
      return this.b;
   }

   public eun.b d() {
      return this.c;
   }

   public static class a implements exy.a {
      private final Builder<String, eum> a = ImmutableMap.builder();
      private final eun.b b;

      public a(eun.b $$0) {
         this.b = $$0;
      }

      public ext.a a(String $$0, eum $$1) {
         this.a.put($$0, $$1);
         return this;
      }

      @Override
      public exy build() {
         return new ext(this.a.build(), this.b);
      }
   }
}
