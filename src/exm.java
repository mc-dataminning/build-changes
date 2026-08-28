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

public record exm(Map<String, euf> b, eug.b c) implements exr {
   public static final MapCodec<exm> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.unboundedMap(Codec.STRING, euf.a).fieldOf("scores").forGetter(exm::c), eug.b.e.fieldOf("entity").forGetter(exm::d))
            .apply($$0, exm::new)
   );

   @Override
   public exs b() {
      return ext.h;
   }

   @Override
   public Set<ewz<?>> a() {
      return Stream.concat(Stream.of(this.c.a()), this.b.values().stream().flatMap($$0 -> $$0.a().stream())).collect(ImmutableSet.toImmutableSet());
   }

   public boolean a(eug $$0) {
      bui $$1 = $$0.c(this.c.a());
      if ($$1 == null) {
         return false;
      } else {
         faw $$2 = $$0.d().f();

         for (Entry<String, euf> $$3 : this.b.entrySet()) {
            if (!this.a($$0, $$1, $$2, $$3.getKey(), $$3.getValue())) {
               return false;
            }
         }

         return true;
      }
   }

   protected boolean a(eug $$0, bui $$1, faw $$2, String $$3, euf $$4) {
      fao $$5 = $$2.a($$3);
      if ($$5 == null) {
         return false;
      } else {
         fas $$6 = $$2.d($$1, $$5);
         return $$6 == null ? false : $$4.b($$0, $$6.a());
      }
   }

   public static exm.a a(eug.b $$0) {
      return new exm.a($$0);
   }

   public Map<String, euf> c() {
      return this.b;
   }

   public eug.b d() {
      return this.c;
   }

   public static class a implements exr.a {
      private final Builder<String, euf> a = ImmutableMap.builder();
      private final eug.b b;

      public a(eug.b $$0) {
         this.b = $$0;
      }

      public exm.a a(String $$0, euf $$1) {
         this.a.put($$0, $$1);
         return this;
      }

      @Override
      public exr build() {
         return new exm(this.a.build(), this.b);
      }
   }
}
