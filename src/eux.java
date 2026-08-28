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

public record eux(Map<String, erq> b, err.b c) implements evc {
   public static final MapCodec<eux> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.unboundedMap(Codec.STRING, erq.a).fieldOf("scores").forGetter(eux::c), err.b.e.fieldOf("entity").forGetter(eux::d))
            .apply($$0, eux::new)
   );

   @Override
   public evd b() {
      return eve.h;
   }

   @Override
   public Set<euk<?>> a() {
      return Stream.concat(Stream.of(this.c.a()), this.b.values().stream().flatMap($$0 -> $$0.a().stream())).collect(ImmutableSet.toImmutableSet());
   }

   public boolean a(err $$0) {
      bsr $$1 = $$0.c(this.c.a());
      if ($$1 == null) {
         return false;
      } else {
         eyg $$2 = $$0.d().f();

         for (Entry<String, erq> $$3 : this.b.entrySet()) {
            if (!this.a($$0, $$1, $$2, $$3.getKey(), $$3.getValue())) {
               return false;
            }
         }

         return true;
      }
   }

   protected boolean a(err $$0, bsr $$1, eyg $$2, String $$3, erq $$4) {
      exy $$5 = $$2.a($$3);
      if ($$5 == null) {
         return false;
      } else {
         eyc $$6 = $$2.d($$1, $$5);
         return $$6 == null ? false : $$4.b($$0, $$6.a());
      }
   }

   public static eux.a a(err.b $$0) {
      return new eux.a($$0);
   }

   public Map<String, erq> c() {
      return this.b;
   }

   public err.b d() {
      return this.c;
   }

   public static class a implements evc.a {
      private final Builder<String, erq> a = ImmutableMap.builder();
      private final err.b b;

      public a(err.b $$0) {
         this.b = $$0;
      }

      public eux.a a(String $$0, erq $$1) {
         this.a.put($$0, $$1);
         return this;
      }

      @Override
      public evc build() {
         return new eux(this.a.build(), this.b);
      }
   }
}
