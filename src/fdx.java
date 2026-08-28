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

public record fdx(Map<String, fas> b, fat.b c) implements fec {
   public static final MapCodec<fdx> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.unboundedMap(Codec.STRING, fas.a).fieldOf("scores").forGetter(fdx::c), fat.b.e.fieldOf("entity").forGetter(fdx::d))
            .apply($$0, fdx::new)
   );

   @Override
   public fed b() {
      return fee.h;
   }

   @Override
   public Set<bbk<?>> a() {
      return Stream.concat(Stream.of(this.c.a()), this.b.values().stream().flatMap($$0 -> $$0.a().stream())).collect(ImmutableSet.toImmutableSet());
   }

   public boolean a(fat $$0) {
      bxe $$1 = $$0.c(this.c.a());
      if ($$1 == null) {
         return false;
      } else {
         fhh $$2 = $$0.d().g();

         for (Entry<String, fas> $$3 : this.b.entrySet()) {
            if (!this.a($$0, $$1, $$2, $$3.getKey(), $$3.getValue())) {
               return false;
            }
         }

         return true;
      }
   }

   protected boolean a(fat $$0, bxe $$1, fhh $$2, String $$3, fas $$4) {
      fgz $$5 = $$2.a($$3);
      if ($$5 == null) {
         return false;
      } else {
         fhd $$6 = $$2.d($$1, $$5);
         return $$6 == null ? false : $$4.b($$0, $$6.a());
      }
   }

   public static fdx.a a(fat.b $$0) {
      return new fdx.a($$0);
   }

   public Map<String, fas> c() {
      return this.b;
   }

   public fat.b d() {
      return this.c;
   }

   public static class a implements fec.a {
      private final Builder<String, fas> a = ImmutableMap.builder();
      private final fat.b b;

      public a(fat.b $$0) {
         this.b = $$0;
      }

      public fdx.a a(String $$0, fas $$1) {
         this.a.put($$0, $$1);
         return this;
      }

      @Override
      public fec build() {
         return new fdx(this.a.build(), this.b);
      }
   }
}
