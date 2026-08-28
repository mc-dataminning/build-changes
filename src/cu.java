import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;

public record cu(Optional<ju<cxc>> b, dj.d c, ks d, Map<cv.a<?>, cv> e) implements Predicate<cxg> {
   public static final Codec<cu> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               kf.a(mb.K).optionalFieldOf("items").forGetter(cu::a),
               dj.d.d.optionalFieldOf("count", dj.d.c).forGetter(cu::b),
               ks.a.optionalFieldOf("components", ks.c).forGetter(cu::c),
               cv.b.optionalFieldOf("predicates", Map.of()).forGetter(cu::d)
            )
            .apply($$0, cu::new)
   );

   public boolean a(cxg $$0) {
      if (this.b.isPresent() && !$$0.a(this.b.get())) {
         return false;
      } else if (!this.c.d($$0.M())) {
         return false;
      } else if (!this.d.a($$0)) {
         return false;
      } else {
         for (cv $$1 : this.e.values()) {
            if (!$$1.a($$0)) {
               return false;
            }
         }

         return true;
      }
   }

   public Optional<ju<cxc>> a() {
      return this.b;
   }

   public dj.d b() {
      return this.c;
   }

   public ks c() {
      return this.d;
   }

   public Map<cv.a<?>, cv> d() {
      return this.e;
   }

   public static class a {
      private Optional<ju<cxc>> a = Optional.empty();
      private dj.d b = dj.d.c;
      private ks c;
      private final Builder<cv.a<?>, cv> d;

      private a() {
         this.c = ks.c;
         this.d = ImmutableMap.builder();
      }

      public static cu.a a() {
         return new cu.a();
      }

      public cu.a a(jr<cxc> $$0, dgy... $$1) {
         this.a = Optional.of(ju.a($$0x -> $$0x.j().f(), $$1));
         return this;
      }

      public cu.a a(jr<cxc> $$0, aya<cxc> $$1) {
         this.a = Optional.of($$0.b($$1));
         return this;
      }

      public cu.a a(dj.d $$0) {
         this.b = $$0;
         return this;
      }

      public <T extends cv> cu.a a(cv.a<T> $$0, T $$1) {
         this.d.put($$0, $$1);
         return this;
      }

      public cu.a a(ks $$0) {
         this.c = $$0;
         return this;
      }

      public cu b() {
         return new cu(this.a, this.b, this.c, this.d.build());
      }
   }
}
