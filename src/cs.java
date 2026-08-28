import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;

public record cs(Optional<js<cvn>> b, dh.d c, kq d, Map<ct.a<?>, ct> e) implements Predicate<cvs> {
   public static final Codec<cs> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               kd.a(lw.K).optionalFieldOf("items").forGetter(cs::a),
               dh.d.d.optionalFieldOf("count", dh.d.c).forGetter(cs::b),
               kq.a.optionalFieldOf("components", kq.c).forGetter(cs::c),
               ct.b.optionalFieldOf("predicates", Map.of()).forGetter(cs::d)
            )
            .apply($$0, cs::new)
   );

   public boolean a(cvs $$0) {
      if (this.b.isPresent() && !$$0.a(this.b.get())) {
         return false;
      } else if (!this.c.d($$0.K())) {
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

   public Optional<js<cvn>> a() {
      return this.b;
   }

   public dh.d b() {
      return this.c;
   }

   public kq c() {
      return this.d;
   }

   public Map<ct.a<?>, ct> d() {
      return this.e;
   }

   public static class a {
      private Optional<js<cvn>> a = Optional.empty();
      private dh.d b = dh.d.c;
      private kq c;
      private final Builder<ct.a<?>, ct> d;

      private a() {
         this.c = kq.c;
         this.d = ImmutableMap.builder();
      }

      public static cs.a a() {
         return new cs.a();
      }

      public cs.a a(jp<cvn> $$0, dei... $$1) {
         this.a = Optional.of(js.a($$0x -> $$0x.q().n(), $$1));
         return this;
      }

      public cs.a a(jp<cvn> $$0, axl<cvn> $$1) {
         this.a = Optional.of($$0.b($$1));
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

      public cs.a a(kq $$0) {
         this.c = $$0;
         return this;
      }

      public cs b() {
         return new cs(this.a, this.b, this.c, this.d.build());
      }
   }
}
