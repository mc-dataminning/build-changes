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

public record eyu(Map<String, evp> b, evq.b c) implements eyz {
   public static final MapCodec<eyu> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.unboundedMap(Codec.STRING, evp.a).fieldOf("scores").forGetter(eyu::c), evq.b.e.fieldOf("entity").forGetter(eyu::d))
            .apply($$0, eyu::new)
   );

   @Override
   public eza b() {
      return ezb.h;
   }

   @Override
   public Set<bai<?>> a() {
      return Stream.concat(Stream.of(this.c.a()), this.b.values().stream().flatMap($$0 -> $$0.a().stream())).collect(ImmutableSet.toImmutableSet());
   }

   public boolean a(evq $$0) {
      buk $$1 = $$0.c(this.c.a());
      if ($$1 == null) {
         return false;
      } else {
         fce $$2 = $$0.d().g();

         for (Entry<String, evp> $$3 : this.b.entrySet()) {
            if (!this.a($$0, $$1, $$2, $$3.getKey(), $$3.getValue())) {
               return false;
            }
         }

         return true;
      }
   }

   protected boolean a(evq $$0, buk $$1, fce $$2, String $$3, evp $$4) {
      fbw $$5 = $$2.a($$3);
      if ($$5 == null) {
         return false;
      } else {
         fca $$6 = $$2.d($$1, $$5);
         return $$6 == null ? false : $$4.b($$0, $$6.a());
      }
   }

   public static eyu.a a(evq.b $$0) {
      return new eyu.a($$0);
   }

   public Map<String, evp> c() {
      return this.b;
   }

   public evq.b d() {
      return this.c;
   }

   public static class a implements eyz.a {
      private final Builder<String, evp> a = ImmutableMap.builder();
      private final evq.b b;

      public a(evq.b $$0) {
         this.b = $$0;
      }

      public eyu.a a(String $$0, evp $$1) {
         this.a.put($$0, $$1);
         return this;
      }

      @Override
      public eyz build() {
         return new eyu(this.a.build(), this.b);
      }
   }
}
