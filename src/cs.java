import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;

public record cs(Optional<jq<cul>> b, dh.d c, ko d, Map<ct.a<?>, ct> e) implements Predicate<cuq> {
   public static final Codec<cs> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               kb.a(lu.K).optionalFieldOf("items").forGetter(cs::a),
               dh.d.d.optionalFieldOf("count", dh.d.c).forGetter(cs::b),
               ko.a.optionalFieldOf("components", ko.c).forGetter(cs::c),
               ct.b.optionalFieldOf("predicates", Map.of()).forGetter(cs::d)
            )
            .apply($$0, cs::new)
   );

   public boolean a(cuq $$0) {
      if (this.b.isPresent() && !$$0.a(this.b.get())) {
         return false;
      } else if (!this.c.d($$0.H())) {
         return false;
      } else if (!this.d.a($$0)) {
         return false;
      } else {
         for (ct $$1 : this.e.values()) {
            if (!$$1.a($$0)) {
               return false;
            }
         }

         return true;
      }
   }

   public Optional<jq<cul>> a() {
      return this.b;
   }

   public dh.d b() {
      return this.c;
   }

   public ko c() {
      return this.d;
   }

   public Map<ct.a<?>, ct> d() {
      return this.e;
   }

   public static class a {
      private Optional<jq<cul>> a = Optional.empty();
      private dh.d b = dh.d.c;
      private ko c;
      private final Builder<ct.a<?>, ct> d;

      private a() {
         this.c = ko.c;
         this.d = ImmutableMap.builder();
      }

      public static cs.a a() {
         return new cs.a();
      }

      public cs.a a(dcv... $$0) {
         this.a = Optional.of(jq.a($$0x -> $$0x.r().o(), $$0));
         return this;
      }

      public cs.a a(awu<cul> $$0) {
         this.a = Optional.of(lt.g.a($$0));
         return this;
      }

      public cs.a a(dh.d $$0) {
         this.b = $$0;
         return this;
      }

      public <T extends ct> cs.a a(ct.a<T> $$0, T $$1) {
         this.d.put($$0, $$1);
         return this;
      }

      public cs.a a(ko $$0) {
         this.c = $$0;
         return this;
      }

      public cs b() {
         return new cs(this.a, this.b, this.c, this.d.build());
      }
   }
}
