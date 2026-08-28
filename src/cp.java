import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;

public record cp(Optional<jm<cul>> b, de.d c, kk d, Map<cq.a<?>, cq> e) implements Predicate<cuq> {
   public static final Codec<cp> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               jx.a(lq.G).optionalFieldOf("items").forGetter(cp::a),
               de.d.d.optionalFieldOf("count", de.d.c).forGetter(cp::b),
               kk.a.optionalFieldOf("components", kk.c).forGetter(cp::c),
               cq.b.optionalFieldOf("predicates", Map.of()).forGetter(cp::d)
            )
            .apply($$0, cp::new)
   );

   public boolean a(cuq $$0) {
      if (this.b.isPresent() && !$$0.a(this.b.get())) {
         return false;
      } else if (!this.c.d($$0.I())) {
         return false;
      } else if (!this.d.a($$0)) {
         return false;
      } else {
         for (cq $$1 : this.e.values()) {
            if (!$$1.a($$0)) {
               return false;
            }
         }

         return true;
      }
   }

   public Optional<jm<cul>> a() {
      return this.b;
   }

   public de.d b() {
      return this.c;
   }

   public kk c() {
      return this.d;
   }

   public Map<cq.a<?>, cq> d() {
      return this.e;
   }

   public static class a {
      private Optional<jm<cul>> a = Optional.empty();
      private de.d b = de.d.c;
      private kk c;
      private final Builder<cq.a<?>, cq> d;

      private a() {
         this.c = kk.c;
         this.d = ImmutableMap.builder();
      }

      public static cp.a a() {
         return new cp.a();
      }

      public cp.a a(dby... $$0) {
         this.a = Optional.of(jm.a($$0x -> $$0x.r().o(), $$0));
         return this;
      }

      public cp.a a(axf<cul> $$0) {
         this.a = Optional.of(lp.h.a($$0));
         return this;
      }

      public cp.a a(de.d $$0) {
         this.b = $$0;
         return this;
      }

      public <T extends cq> cp.a a(cq.a<T> $$0, T $$1) {
         this.d.put($$0, $$1);
         return this;
      }

      public cp.a a(kk $$0) {
         this.c = $$0;
         return this;
      }

      public cp b() {
         return new cp(this.a, this.b, this.c, this.d.build());
      }
   }
}
