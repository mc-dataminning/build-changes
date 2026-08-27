import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.stream.Stream;

public record ems(Map<String, ejx> b, ejy.b c) implements emx {
   public static final Codec<ems> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.unboundedMap(Codec.STRING, ejx.a).fieldOf("scores").forGetter(ems::c), ejy.b.e.fieldOf("entity").forGetter(ems::d))
            .apply($$0, ems::new)
   );

   @Override
   public emy b() {
      return emz.i;
   }

   @Override
   public Set<emg<?>> a() {
      return Stream.concat(Stream.of(this.c.a()), this.b.values().stream().flatMap($$0 -> $$0.a().stream())).collect(ImmutableSet.toImmutableSet());
   }

   public boolean a(ejy $$0) {
      bof $$1 = $$0.c(this.c.a());
      if ($$1 == null) {
         return false;
      } else {
         epz $$2 = $$0.d().f();

         for (Entry<String, ejx> $$3 : this.b.entrySet()) {
            if (!this.a($$0, $$1, $$2, $$3.getKey(), $$3.getValue())) {
               return false;
            }
         }

         return true;
      }
   }

   protected boolean a(ejy $$0, bof $$1, epz $$2, String $$3, ejx $$4) {
      epr $$5 = $$2.a($$3);
      if ($$5 == null) {
         return false;
      } else {
         epv $$6 = $$2.d($$1, $$5);
         return $$6 == null ? false : $$4.b($$0, $$6.a());
      }
   }

   public static ems.a a(ejy.b $$0) {
      return new ems.a($$0);
   }

   public Map<String, ejx> c() {
      return this.b;
   }

   public ejy.b d() {
      return this.c;
   }

   public static class a implements emx.a {
      private final Builder<String, ejx> a = ImmutableMap.builder();
      private final ejy.b b;

      public a(ejy.b $$0) {
         this.b = $$0;
      }

      public ems.a a(String $$0, ejx $$1) {
         this.a.put($$0, $$1);
         return this;
      }

      @Override
      public emx build() {
         return new ems(this.a.build(), this.b);
      }
   }
}
