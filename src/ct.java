import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;

public record ct(Optional<jt<cvt>> b, di.d c, kr d, Map<cu.a<?>, cu> e) implements Predicate<cvx> {
   public static final Codec<ct> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ke.a(ly.K).optionalFieldOf("items").forGetter(ct::a),
               di.d.d.optionalFieldOf("count", di.d.c).forGetter(ct::b),
               kr.a.optionalFieldOf("components", kr.c).forGetter(ct::c),
               cu.b.optionalFieldOf("predicates", Map.of()).forGetter(ct::d)
            )
            .apply($$0, ct::new)
   );

   public boolean a(cvx $$0) {
      if (this.b.isPresent() && !$$0.a(this.b.get())) {
         return false;
      } else if (!this.c.d($$0.L())) {
         return false;
      } else if (!this.d.a($$0)) {
         return false;
      } else {
         for (cu $$1 : this.e.values()) {
            if (!$$1.a($$0)) {
               return false;
            }
         }

         return true;
      }
   }

   public Optional<jt<cvt>> a() {
      return this.b;
   }

   public di.d b() {
      return this.c;
   }

   public kr c() {
      return this.d;
   }

   public Map<cu.a<?>, cu> d() {
      return this.e;
   }

   public static class a {
      private Optional<jt<cvt>> a = Optional.empty();
      private di.d b = di.d.c;
      private kr c;
      private final Builder<cu.a<?>, cu> d;

      private a() {
         this.c = kr.c;
         this.d = ImmutableMap.builder();
      }

      public static ct.a a() {
         return new ct.a();
      }

      public ct.a a(jq<cvt> $$0, deu... $$1) {
         this.a = Optional.of(jt.a($$0x -> $$0x.j().f(), $$1));
         return this;
      }

      public ct.a a(jq<cvt> $$0, axp<cvt> $$1) {
         this.a = Optional.of($$0.b($$1));
         return this;
      }

      public ct.a a(di.d $$0) {
         this.b = $$0;
         return this;
      }

      public <T extends cu> ct.a a(cu.a<T> $$0, T $$1) {
         this.d.put($$0, $$1);
         return this;
      }

      public ct.a a(kr $$0) {
         this.c = $$0;
         return this;
      }

      public ct b() {
         return new ct(this.a, this.b, this.c, this.d.build());
      }
   }
}
