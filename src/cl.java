import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;

public record cl(Optional<ji<cyu>> b, cv.d c, kd d, Map<ks.b<?>, ks> e) implements Predicate<cyy> {
   public static final Codec<cl> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               jt.a(mg.K).optionalFieldOf("items").forGetter(cl::a),
               cv.d.d.optionalFieldOf("count", cv.d.c).forGetter(cl::b),
               kd.a.optionalFieldOf("components", kd.c).forGetter(cl::c),
               ks.b.optionalFieldOf("predicates", Map.of()).forGetter(cl::d)
            )
            .apply($$0, cl::new)
   );

   public boolean a(cyy $$0) {
      if (this.b.isPresent() && !$$0.a(this.b.get())) {
         return false;
      } else if (!this.c.d($$0.M())) {
         return false;
      } else if (!this.d.a($$0)) {
         return false;
      } else {
         for (ks $$1 : this.e.values()) {
            if (!$$1.a($$0)) {
               return false;
            }
         }

         return true;
      }
   }

   public Optional<ji<cyu>> a() {
      return this.b;
   }

   public cv.d b() {
      return this.c;
   }

   public kd c() {
      return this.d;
   }

   public Map<ks.b<?>, ks> d() {
      return this.e;
   }

   public static class a {
      private Optional<ji<cyu>> a = Optional.empty();
      private cv.d b = cv.d.c;
      private kd c;
      private final Builder<ks.b<?>, ks> d;

      private a() {
         this.c = kd.c;
         this.d = ImmutableMap.builder();
      }

      public static cl.a a() {
         return new cl.a();
      }

      public cl.a a(jf<cyu> $$0, diu... $$1) {
         this.a = Optional.of(ji.a($$0x -> $$0x.h().e(), $$1));
         return this;
      }

      public cl.a a(jf<cyu> $$0, axr<cyu> $$1) {
         this.a = Optional.of($$0.b($$1));
         return this;
      }

      public cl.a a(cv.d $$0) {
         this.b = $$0;
         return this;
      }

      public <T extends ks> cl.a a(ks.b<T> $$0, T $$1) {
         this.d.put($$0, $$1);
         return this;
      }

      public cl.a a(kd $$0) {
         this.c = $$0;
         return this;
      }

      public cl b() {
         return new cl(this.a, this.b, this.c, this.d.build());
      }
   }
}
