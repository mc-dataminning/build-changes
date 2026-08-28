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

public record fcx(Map<String, ezs> b, ezt.b c) implements fdc {
   public static final MapCodec<fcx> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.unboundedMap(Codec.STRING, ezs.a).fieldOf("scores").forGetter(fcx::c), ezt.b.e.fieldOf("entity").forGetter(fcx::d))
            .apply($$0, fcx::new)
   );

   @Override
   public fdd b() {
      return fde.h;
   }

   @Override
   public Set<bax<?>> a() {
      return Stream.concat(Stream.of(this.c.a()), this.b.values().stream().flatMap($$0 -> $$0.a().stream())).collect(ImmutableSet.toImmutableSet());
   }

   public boolean a(ezt $$0) {
      bwi $$1 = $$0.c(this.c.a());
      if ($$1 == null) {
         return false;
      } else {
         fgh $$2 = $$0.d().g();

         for (Entry<String, ezs> $$3 : this.b.entrySet()) {
            if (!this.a($$0, $$1, $$2, $$3.getKey(), $$3.getValue())) {
               return false;
            }
         }

         return true;
      }
   }

   protected boolean a(ezt $$0, bwi $$1, fgh $$2, String $$3, ezs $$4) {
      ffz $$5 = $$2.a($$3);
      if ($$5 == null) {
         return false;
      } else {
         fgd $$6 = $$2.d($$1, $$5);
         return $$6 == null ? false : $$4.b($$0, $$6.a());
      }
   }

   public static fcx.a a(ezt.b $$0) {
      return new fcx.a($$0);
   }

   public Map<String, ezs> c() {
      return this.b;
   }

   public ezt.b d() {
      return this.c;
   }

   public static class a implements fdc.a {
      private final Builder<String, ezs> a = ImmutableMap.builder();
      private final ezt.b b;

      public a(ezt.b $$0) {
         this.b = $$0;
      }

      public fcx.a a(String $$0, ezs $$1) {
         this.a.put($$0, $$1);
         return this;
      }

      @Override
      public fdc build() {
         return new fcx(this.a.build(), this.b);
      }
   }
}
