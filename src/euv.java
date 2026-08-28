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

public record euv(Map<String, ero> b, erp.b c) implements eva {
   public static final MapCodec<euv> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.unboundedMap(Codec.STRING, ero.a).fieldOf("scores").forGetter(euv::c), erp.b.e.fieldOf("entity").forGetter(euv::d))
            .apply($$0, euv::new)
   );

   @Override
   public evb b() {
      return evc.h;
   }

   @Override
   public Set<eui<?>> a() {
      return Stream.concat(Stream.of(this.c.a()), this.b.values().stream().flatMap($$0 -> $$0.a().stream())).collect(ImmutableSet.toImmutableSet());
   }

   public boolean a(erp $$0) {
      bsr $$1 = $$0.c(this.c.a());
      if ($$1 == null) {
         return false;
      } else {
         eye $$2 = $$0.d().f();

         for (Entry<String, ero> $$3 : this.b.entrySet()) {
            if (!this.a($$0, $$1, $$2, $$3.getKey(), $$3.getValue())) {
               return false;
            }
         }

         return true;
      }
   }

   protected boolean a(erp $$0, bsr $$1, eye $$2, String $$3, ero $$4) {
      exw $$5 = $$2.a($$3);
      if ($$5 == null) {
         return false;
      } else {
         eya $$6 = $$2.d($$1, $$5);
         return $$6 == null ? false : $$4.b($$0, $$6.a());
      }
   }

   public static euv.a a(erp.b $$0) {
      return new euv.a($$0);
   }

   public Map<String, ero> c() {
      return this.b;
   }

   public erp.b d() {
      return this.c;
   }

   public static class a implements eva.a {
      private final Builder<String, ero> a = ImmutableMap.builder();
      private final erp.b b;

      public a(erp.b $$0) {
         this.b = $$0;
      }

      public euv.a a(String $$0, ero $$1) {
         this.a.put($$0, $$1);
         return this;
      }

      @Override
      public eva build() {
         return new euv(this.a.build(), this.b);
      }
   }
}
