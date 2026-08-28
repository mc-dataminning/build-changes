import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.function.Predicate;

public record bo(kf d, Map<ku.b<?>, ku> e) implements Predicate<kg> {
   public static final bo a = new bo(kf.c, Map.of());
   public static final MapCodec<bo> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(kf.a.optionalFieldOf("components", kf.c).forGetter(bo::b), ku.b.optionalFieldOf("predicates", Map.of()).forGetter(bo::c))
            .apply($$0, bo::new)
   );
   public static final za<wn, bo> c = za.a(kf.b, bo::b, ku.d, bo::c, bo::new);

   public boolean a(kg $$0) {
      if (!this.d.a($$0)) {
         return false;
      } else {
         for (ku $$1 : this.e.values()) {
            if (!$$1.a($$0)) {
               return false;
            }
         }

         return true;
      }
   }

   public boolean a() {
      return this.d.b() && this.e.isEmpty();
   }

   public kf b() {
      return this.d;
   }

   public Map<ku.b<?>, ku> c() {
      return this.e;
   }

   public static class a {
      private kf a = kf.c;
      private final Builder<ku.b<?>, ku> b = ImmutableMap.builder();

      private a() {
      }

      public static bo.a a() {
         return new bo.a();
      }

      public <T extends ku> bo.a a(ku.b<T> $$0, T $$1) {
         this.b.put($$0, $$1);
         return this;
      }

      public bo.a a(kf $$0) {
         this.a = $$0;
         return this;
      }

      public bo b() {
         return new bo(this.a, this.b.buildOrThrow());
      }
   }
}
