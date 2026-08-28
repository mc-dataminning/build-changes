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

public record ezs(Map<String, ewn> b, ewo.b c) implements ezx {
   public static final MapCodec<ezs> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.unboundedMap(Codec.STRING, ewn.a).fieldOf("scores").forGetter(ezs::c), ewo.b.e.fieldOf("entity").forGetter(ezs::d))
            .apply($$0, ezs::new)
   );

   @Override
   public ezy b() {
      return ezz.h;
   }

   @Override
   public Set<bbn<?>> a() {
      return Stream.concat(Stream.of(this.c.a()), this.b.values().stream().flatMap($$0 -> $$0.a().stream())).collect(ImmutableSet.toImmutableSet());
   }

   public boolean a(ewo $$0) {
      bvj $$1 = $$0.c(this.c.a());
      if ($$1 == null) {
         return false;
      } else {
         fdc $$2 = $$0.d().g();

         for (Entry<String, ewn> $$3 : this.b.entrySet()) {
            if (!this.a($$0, $$1, $$2, $$3.getKey(), $$3.getValue())) {
               return false;
            }
         }

         return true;
      }
   }

   protected boolean a(ewo $$0, bvj $$1, fdc $$2, String $$3, ewn $$4) {
      fcu $$5 = $$2.a($$3);
      if ($$5 == null) {
         return false;
      } else {
         fcy $$6 = $$2.d($$1, $$5);
         return $$6 == null ? false : $$4.b($$0, $$6.a());
      }
   }

   public static ezs.a a(ewo.b $$0) {
      return new ezs.a($$0);
   }

   public Map<String, ewn> c() {
      return this.b;
   }

   public ewo.b d() {
      return this.c;
   }

   public static class a implements ezx.a {
      private final Builder<String, ewn> a = ImmutableMap.builder();
      private final ewo.b b;

      public a(ewo.b $$0) {
         this.b = $$0;
      }

      public ezs.a a(String $$0, ewn $$1) {
         this.a.put($$0, $$1);
         return this;
      }

      @Override
      public ezx build() {
         return new ezs(this.a.build(), this.b);
      }
   }
}
