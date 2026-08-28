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

public record ewr(Map<String, etk> b, etl.b c) implements eww {
   public static final MapCodec<ewr> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.unboundedMap(Codec.STRING, etk.a).fieldOf("scores").forGetter(ewr::c), etl.b.e.fieldOf("entity").forGetter(ewr::d))
            .apply($$0, ewr::new)
   );

   @Override
   public ewx b() {
      return ewy.h;
   }

   @Override
   public Set<ewe<?>> a() {
      return Stream.concat(Stream.of(this.c.a()), this.b.values().stream().flatMap($$0 -> $$0.a().stream())).collect(ImmutableSet.toImmutableSet());
   }

   public boolean a(etl $$0) {
      btr $$1 = $$0.c(this.c.a());
      if ($$1 == null) {
         return false;
      } else {
         fab $$2 = $$0.d().f();

         for (Entry<String, etk> $$3 : this.b.entrySet()) {
            if (!this.a($$0, $$1, $$2, $$3.getKey(), $$3.getValue())) {
               return false;
            }
         }

         return true;
      }
   }

   protected boolean a(etl $$0, btr $$1, fab $$2, String $$3, etk $$4) {
      ezt $$5 = $$2.a($$3);
      if ($$5 == null) {
         return false;
      } else {
         ezx $$6 = $$2.d($$1, $$5);
         return $$6 == null ? false : $$4.b($$0, $$6.a());
      }
   }

   public static ewr.a a(etl.b $$0) {
      return new ewr.a($$0);
   }

   public Map<String, etk> c() {
      return this.b;
   }

   public etl.b d() {
      return this.c;
   }

   public static class a implements eww.a {
      private final Builder<String, etk> a = ImmutableMap.builder();
      private final etl.b b;

      public a(etl.b $$0) {
         this.b = $$0;
      }

      public ewr.a a(String $$0, etk $$1) {
         this.a.put($$0, $$1);
         return this;
      }

      @Override
      public eww build() {
         return new ewr(this.a.build(), this.b);
      }
   }
}
