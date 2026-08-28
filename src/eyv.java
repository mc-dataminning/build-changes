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

public record eyv(Map<String, evq> b, evr.b c) implements eza {
   public static final MapCodec<eyv> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.unboundedMap(Codec.STRING, evq.a).fieldOf("scores").forGetter(eyv::c), evr.b.e.fieldOf("entity").forGetter(eyv::d))
            .apply($$0, eyv::new)
   );

   @Override
   public ezb b() {
      return ezc.h;
   }

   @Override
   public Set<bai<?>> a() {
      return Stream.concat(Stream.of(this.c.a()), this.b.values().stream().flatMap($$0 -> $$0.a().stream())).collect(ImmutableSet.toImmutableSet());
   }

   public boolean a(evr $$0) {
      bul $$1 = $$0.c(this.c.a());
      if ($$1 == null) {
         return false;
      } else {
         fcf $$2 = $$0.d().g();

         for (Entry<String, evq> $$3 : this.b.entrySet()) {
            if (!this.a($$0, $$1, $$2, $$3.getKey(), $$3.getValue())) {
               return false;
            }
         }

         return true;
      }
   }

   protected boolean a(evr $$0, bul $$1, fcf $$2, String $$3, evq $$4) {
      fbx $$5 = $$2.a($$3);
      if ($$5 == null) {
         return false;
      } else {
         fcb $$6 = $$2.d($$1, $$5);
         return $$6 == null ? false : $$4.b($$0, $$6.a());
      }
   }

   public static eyv.a a(evr.b $$0) {
      return new eyv.a($$0);
   }

   public Map<String, evq> c() {
      return this.b;
   }

   public evr.b d() {
      return this.c;
   }

   public static class a implements eza.a {
      private final Builder<String, evq> a = ImmutableMap.builder();
      private final evr.b b;

      public a(evr.b $$0) {
         this.b = $$0;
      }

      public eyv.a a(String $$0, evq $$1) {
         this.a.put($$0, $$1);
         return this;
      }

      @Override
      public eza build() {
         return new eyv(this.a.build(), this.b);
      }
   }
}
