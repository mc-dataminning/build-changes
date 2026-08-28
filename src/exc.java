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

public record exc(Map<String, etv> b, etw.b c) implements exh {
   public static final MapCodec<exc> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.unboundedMap(Codec.STRING, etv.a).fieldOf("scores").forGetter(exc::c), etw.b.e.fieldOf("entity").forGetter(exc::d))
            .apply($$0, exc::new)
   );

   @Override
   public exi b() {
      return exj.h;
   }

   @Override
   public Set<ewp<?>> a() {
      return Stream.concat(Stream.of(this.c.a()), this.b.values().stream().flatMap($$0 -> $$0.a().stream())).collect(ImmutableSet.toImmutableSet());
   }

   public boolean a(etw $$0) {
      btz $$1 = $$0.c(this.c.a());
      if ($$1 == null) {
         return false;
      } else {
         fam $$2 = $$0.d().f();

         for (Entry<String, etv> $$3 : this.b.entrySet()) {
            if (!this.a($$0, $$1, $$2, $$3.getKey(), $$3.getValue())) {
               return false;
            }
         }

         return true;
      }
   }

   protected boolean a(etw $$0, btz $$1, fam $$2, String $$3, etv $$4) {
      fae $$5 = $$2.a($$3);
      if ($$5 == null) {
         return false;
      } else {
         fai $$6 = $$2.d($$1, $$5);
         return $$6 == null ? false : $$4.b($$0, $$6.a());
      }
   }

   public static exc.a a(etw.b $$0) {
      return new exc.a($$0);
   }

   public Map<String, etv> c() {
      return this.b;
   }

   public etw.b d() {
      return this.c;
   }

   public static class a implements exh.a {
      private final Builder<String, etv> a = ImmutableMap.builder();
      private final etw.b b;

      public a(etw.b $$0) {
         this.b = $$0;
      }

      public exc.a a(String $$0, etv $$1) {
         this.a.put($$0, $$1);
         return this;
      }

      @Override
      public exh build() {
         return new exc(this.a.build(), this.b);
      }
   }
}
