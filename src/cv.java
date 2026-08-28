import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;

public record cv(Optional<jv<cwj>> b, dk.d c, kt d, Map<cw.a<?>, cw> e) implements Predicate<cwn> {
   public static final Codec<cv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               kg.a(mc.K).optionalFieldOf("items").forGetter(cv::a),
               dk.d.d.optionalFieldOf("count", dk.d.c).forGetter(cv::b),
               kt.a.optionalFieldOf("components", kt.c).forGetter(cv::c),
               cw.b.optionalFieldOf("predicates", Map.of()).forGetter(cv::d)
            )
            .apply($$0, cv::new)
   );

   public boolean a(cwn $$0) {
      if (this.b.isPresent() && !$$0.a(this.b.get())) {
         return false;
      } else if (!this.c.d($$0.M())) {
         return false;
      } else if (!this.d.a($$0)) {
         return false;
      } else {
         for (cw $$1 : this.e.values()) {
            if (!$$1.a($$0)) {
               return false;
            }
         }

         return true;
      }
   }

   public Optional<jv<cwj>> a() {
      return this.b;
   }

   public dk.d b() {
      return this.c;
   }

   public kt c() {
      return this.d;
   }

   public Map<cw.a<?>, cw> d() {
      return this.e;
   }

   public static class a {
      private Optional<jv<cwj>> a = Optional.empty();
      private dk.d b = dk.d.c;
      private kt c;
      private final Builder<cw.a<?>, cw> d;

      private a() {
         this.c = kt.c;
         this.d = ImmutableMap.builder();
      }

      public static cv.a a() {
         return new cv.a();
      }

      public cv.a a(js<cwj> $$0, dgf... $$1) {
         this.a = Optional.of(jv.a($$0x -> $$0x.j().f(), $$1));
         return this;
      }

      public cv.a a(js<cwj> $$0, axe<cwj> $$1) {
         this.a = Optional.of($$0.b($$1));
         return this;
      }

      public cv.a a(dk.d $$0) {
         this.b = $$0;
         return this;
      }

      public <T extends cw> cv.a a(cw.a<T> $$0, T $$1) {
         this.d.put($$0, $$1);
         return this;
      }

      public cv.a a(kt $$0) {
         this.c = $$0;
         return this;
      }

      public cv b() {
         return new cv(this.a, this.b, this.c, this.d.build());
      }
   }
}
