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

public record fcd(Map<String, eyy> b, eyz.b c) implements fci {
   public static final MapCodec<fcd> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.unboundedMap(Codec.STRING, eyy.a).fieldOf("scores").forGetter(fcd::c), eyz.b.e.fieldOf("entity").forGetter(fcd::d))
            .apply($$0, fcd::new)
   );

   @Override
   public fcj b() {
      return fck.h;
   }

   @Override
   public Set<bax<?>> a() {
      return Stream.concat(Stream.of(this.c.a()), this.b.values().stream().flatMap($$0 -> $$0.a().stream())).collect(ImmutableSet.toImmutableSet());
   }

   public boolean a(eyz $$0) {
      bwd $$1 = $$0.c(this.c.a());
      if ($$1 == null) {
         return false;
      } else {
         ffn $$2 = $$0.d().g();

         for (Entry<String, eyy> $$3 : this.b.entrySet()) {
            if (!this.a($$0, $$1, $$2, $$3.getKey(), $$3.getValue())) {
               return false;
            }
         }

         return true;
      }
   }

   protected boolean a(eyz $$0, bwd $$1, ffn $$2, String $$3, eyy $$4) {
      fff $$5 = $$2.a($$3);
      if ($$5 == null) {
         return false;
      } else {
         ffj $$6 = $$2.d($$1, $$5);
         return $$6 == null ? false : $$4.b($$0, $$6.a());
      }
   }

   public static fcd.a a(eyz.b $$0) {
      return new fcd.a($$0);
   }

   public Map<String, eyy> c() {
      return this.b;
   }

   public eyz.b d() {
      return this.c;
   }

   public static class a implements fci.a {
      private final Builder<String, eyy> a = ImmutableMap.builder();
      private final eyz.b b;

      public a(eyz.b $$0) {
         this.b = $$0;
      }

      public fcd.a a(String $$0, eyy $$1) {
         this.a.put($$0, $$1);
         return this;
      }

      @Override
      public fci build() {
         return new fcd(this.a.build(), this.b);
      }
   }
}
