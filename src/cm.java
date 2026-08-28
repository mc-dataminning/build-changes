import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;

public record cm(Optional<jj<czu>> b, cw.d c, ke d, Map<kt.b<?>, kt> e) implements Predicate<czy> {
   public static final Codec<cm> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ju.a(mh.K).optionalFieldOf("items").forGetter(cm::a),
               cw.d.d.optionalFieldOf("count", cw.d.c).forGetter(cm::b),
               ke.a.optionalFieldOf("components", ke.c).forGetter(cm::c),
               kt.b.optionalFieldOf("predicates", Map.of()).forGetter(cm::d)
            )
            .apply($$0, cm::new)
   );

   public boolean a(czy $$0) {
      if (this.b.isPresent() && !$$0.a(this.b.get())) {
         return false;
      } else if (!this.c.d($$0.M())) {
         return false;
      } else if (!this.d.a($$0)) {
         return false;
      } else {
         for (kt $$1 : this.e.values()) {
            if (!$$1.a($$0)) {
               return false;
            }
         }

         return true;
      }
   }

   public Optional<jj<czu>> a() {
      return this.b;
   }

   public cw.d b() {
      return this.c;
   }

   public ke c() {
      return this.d;
   }

   public Map<kt.b<?>, kt> d() {
      return this.e;
   }

   public static class a {
      private Optional<jj<czu>> a = Optional.empty();
      private cw.d b = cw.d.c;
      private ke c;
      private final Builder<kt.b<?>, kt> d;

      private a() {
         this.c = ke.c;
         this.d = ImmutableMap.builder();
      }

      public static cm.a a() {
         return new cm.a();
      }

      public cm.a a(jg<czu> $$0, djw... $$1) {
         this.a = Optional.of(jj.a($$0x -> $$0x.h().e(), $$1));
         return this;
      }

      public cm.a a(jg<czu> $$0, axt<czu> $$1) {
         this.a = Optional.of($$0.b($$1));
         return this;
      }

      public cm.a a(cw.d $$0) {
         this.b = $$0;
         return this;
      }

      public <T extends kt> cm.a a(kt.b<T> $$0, T $$1) {
         this.d.put($$0, $$1);
         return this;
      }

      public cm.a a(ke $$0) {
         this.c = $$0;
         return this;
      }

      public cm b() {
         return new cm(this.a, this.b, this.c, this.d.build());
      }
   }
}
