import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.stream.Stream;

public record eiy(Map<String, egd> b, ege.b c) implements ejd {
   public static final Codec<eiy> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.unboundedMap(Codec.STRING, egd.a).fieldOf("scores").forGetter(eiy::c), ege.b.e.fieldOf("entity").forGetter(eiy::d))
            .apply($$0, eiy::new)
   );

   @Override
   public eje b() {
      return ejf.i;
   }

   @Override
   public Set<eim<?>> a() {
      return Stream.concat(Stream.of(this.c.a()), this.b.values().stream().flatMap($$0 -> $$0.a().stream())).collect(ImmutableSet.toImmutableSet());
   }

   public boolean a(ege $$0) {
      blf $$1 = $$0.c(this.c.a());
      if ($$1 == null) {
         return false;
      } else {
         ema $$2 = $$1.dM().J();

         for (Entry<String, egd> $$3 : this.b.entrySet()) {
            if (!this.a($$0, $$1, $$2, $$3.getKey(), $$3.getValue())) {
               return false;
            }
         }

         return true;
      }
   }

   protected boolean a(ege $$0, blf $$1, ema $$2, String $$3, egd $$4) {
      elx $$5 = $$2.b($$3);
      if ($$5 == null) {
         return false;
      } else {
         String $$6 = $$1.cy();
         return !$$2.b($$6, $$5) ? false : $$4.b($$0, $$2.c($$6, $$5).b());
      }
   }

   public static eiy.a a(ege.b $$0) {
      return new eiy.a($$0);
   }

   public Map<String, egd> c() {
      return this.b;
   }

   public ege.b d() {
      return this.c;
   }

   public static class a implements ejd.a {
      private final Builder<String, egd> a = ImmutableMap.builder();
      private final ege.b b;

      public a(ege.b $$0) {
         this.b = $$0;
      }

      public eiy.a a(String $$0, egd $$1) {
         this.a.put($$0, $$1);
         return this;
      }

      @Override
      public ejd build() {
         return new eiy(this.a.build(), this.b);
      }
   }
}
