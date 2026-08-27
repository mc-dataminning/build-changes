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

public record esi(Map<String, epg> b, eph.b c) implements esn {
   public static final MapCodec<esi> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.unboundedMap(Codec.STRING, epg.a).fieldOf("scores").forGetter(esi::c), eph.b.e.fieldOf("entity").forGetter(esi::d))
            .apply($$0, esi::new)
   );

   @Override
   public eso b() {
      return esp.j;
   }

   @Override
   public Set<erw<?>> a() {
      return Stream.concat(Stream.of(this.c.a()), this.b.values().stream().flatMap($$0 -> $$0.a().stream())).collect(ImmutableSet.toImmutableSet());
   }

   public boolean a(eph $$0) {
      brw $$1 = $$0.c(this.c.a());
      if ($$1 == null) {
         return false;
      } else {
         evq $$2 = $$0.d().f();

         for (Entry<String, epg> $$3 : this.b.entrySet()) {
            if (!this.a($$0, $$1, $$2, $$3.getKey(), $$3.getValue())) {
               return false;
            }
         }

         return true;
      }
   }

   protected boolean a(eph $$0, brw $$1, evq $$2, String $$3, epg $$4) {
      evi $$5 = $$2.a($$3);
      if ($$5 == null) {
         return false;
      } else {
         evm $$6 = $$2.d($$1, $$5);
         return $$6 == null ? false : $$4.b($$0, $$6.a());
      }
   }

   public static esi.a a(eph.b $$0) {
      return new esi.a($$0);
   }

   public Map<String, epg> c() {
      return this.b;
   }

   public eph.b d() {
      return this.c;
   }

   public static class a implements esn.a {
      private final Builder<String, epg> a = ImmutableMap.builder();
      private final eph.b b;

      public a(eph.b $$0) {
         this.b = $$0;
      }

      public esi.a a(String $$0, epg $$1) {
         this.a.put($$0, $$1);
         return this;
      }

      @Override
      public esn build() {
         return new esi(this.a.build(), this.b);
      }
   }
}
