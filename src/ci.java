import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;

public record ci(Optional<je<cuc>> b, cu.d c, kc d, Map<cj.a<?>, cj> e) {
   public static final Codec<ci> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               axu.a(jp.a(li.G), "items").forGetter(ci::a),
               axu.a(cu.d.d, "count", cu.d.c).forGetter(ci::b),
               axu.a(kc.a, "components", kc.c).forGetter(ci::c),
               axu.a(cj.b, "predicates", Map.of()).forGetter(ci::d)
            )
            .apply($$0, ci::new)
   );

   public boolean a(cuh $$0) {
      if (this.b.isPresent() && !$$0.a(this.b.get())) {
         return false;
      } else if (!this.c.d($$0.G())) {
         return false;
      } else if (!this.d.a($$0)) {
         return false;
      } else {
         for (cj $$1 : this.e.values()) {
            if (!$$1.a($$0)) {
               return false;
            }
         }

         return true;
      }
   }

   public Optional<je<cuc>> a() {
      return this.b;
   }

   public cu.d b() {
      return this.c;
   }

   public kc c() {
      return this.d;
   }

   public Map<cj.a<?>, cj> d() {
      return this.e;
   }

   public static class a {
      private Optional<je<cuc>> a = Optional.empty();
      private cu.d b = cu.d.c;
      private kc c;
      private final Builder<cj.a<?>, cj> d;

      private a() {
         this.c = kc.c;
         this.d = ImmutableMap.builder();
      }

      public static ci.a a() {
         return new ci.a();
      }

      public ci.a a(dbz... $$0) {
         this.a = Optional.of(je.a($$0x -> $$0x.q().n(), $$0));
         return this;
      }

      public ci.a a(awt<cuc> $$0) {
         this.a = Optional.of(lh.h.a($$0));
         return this;
      }

      public ci.a a(cu.d $$0) {
         this.b = $$0;
         return this;
      }

      public <T extends cj> ci.a a(cj.a<T> $$0, T $$1) {
         this.d.put($$0, $$1);
         return this;
      }

      public ci.a a(kc $$0) {
         this.c = $$0;
         return this;
      }

      public ci b() {
         return new ci(this.a, this.b, this.c, this.d.build());
      }
   }
}
