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

public record eyw(Map<String, evr> b, evs.b c) implements ezb {
   public static final MapCodec<eyw> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.unboundedMap(Codec.STRING, evr.a).fieldOf("scores").forGetter(eyw::c), evs.b.e.fieldOf("entity").forGetter(eyw::d))
            .apply($$0, eyw::new)
   );

   @Override
   public ezc b() {
      return ezd.h;
   }

   @Override
   public Set<bai<?>> a() {
      return Stream.concat(Stream.of(this.c.a()), this.b.values().stream().flatMap($$0 -> $$0.a().stream())).collect(ImmutableSet.toImmutableSet());
   }

   public boolean a(evs $$0) {
      bum $$1 = $$0.c(this.c.a());
      if ($$1 == null) {
         return false;
      } else {
         fcg $$2 = $$0.d().g();

         for (Entry<String, evr> $$3 : this.b.entrySet()) {
            if (!this.a($$0, $$1, $$2, $$3.getKey(), $$3.getValue())) {
               return false;
            }
         }

         return true;
      }
   }

   protected boolean a(evs $$0, bum $$1, fcg $$2, String $$3, evr $$4) {
      fby $$5 = $$2.a($$3);
      if ($$5 == null) {
         return false;
      } else {
         fcc $$6 = $$2.d($$1, $$5);
         return $$6 == null ? false : $$4.b($$0, $$6.a());
      }
   }

   public static eyw.a a(evs.b $$0) {
      return new eyw.a($$0);
   }

   public Map<String, evr> c() {
      return this.b;
   }

   public evs.b d() {
      return this.c;
   }

   public static class a implements ezb.a {
      private final Builder<String, evr> a = ImmutableMap.builder();
      private final evs.b b;

      public a(evs.b $$0) {
         this.b = $$0;
      }

      public eyw.a a(String $$0, evr $$1) {
         this.a.put($$0, $$1);
         return this;
      }

      @Override
      public ezb build() {
         return new eyw(this.a.build(), this.b);
      }
   }
}
