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

public record esg(Map<String, epe> b, epf.b c) implements esl {
   public static final MapCodec<esg> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.unboundedMap(Codec.STRING, epe.a).fieldOf("scores").forGetter(esg::c), epf.b.e.fieldOf("entity").forGetter(esg::d))
            .apply($$0, esg::new)
   );

   @Override
   public esm b() {
      return esn.j;
   }

   @Override
   public Set<eru<?>> a() {
      return Stream.concat(Stream.of(this.c.a()), this.b.values().stream().flatMap($$0 -> $$0.a().stream())).collect(ImmutableSet.toImmutableSet());
   }

   public boolean a(epf $$0) {
      bru $$1 = $$0.c(this.c.a());
      if ($$1 == null) {
         return false;
      } else {
         evo $$2 = $$0.d().f();

         for (Entry<String, epe> $$3 : this.b.entrySet()) {
            if (!this.a($$0, $$1, $$2, $$3.getKey(), $$3.getValue())) {
               return false;
            }
         }

         return true;
      }
   }

   protected boolean a(epf $$0, bru $$1, evo $$2, String $$3, epe $$4) {
      evg $$5 = $$2.a($$3);
      if ($$5 == null) {
         return false;
      } else {
         evk $$6 = $$2.d($$1, $$5);
         return $$6 == null ? false : $$4.b($$0, $$6.a());
      }
   }

   public static esg.a a(epf.b $$0) {
      return new esg.a($$0);
   }

   public Map<String, epe> c() {
      return this.b;
   }

   public epf.b d() {
      return this.c;
   }

   public static class a implements esl.a {
      private final Builder<String, epe> a = ImmutableMap.builder();
      private final epf.b b;

      public a(epf.b $$0) {
         this.b = $$0;
      }

      public esg.a a(String $$0, epe $$1) {
         this.a.put($$0, $$1);
         return this;
      }

      @Override
      public esl build() {
         return new esg(this.a.build(), this.b);
      }
   }
}
