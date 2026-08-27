import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;

public record ch(Optional<jb<ctj>> b, ct.d c, jz d, Map<ci.a<?>, ci> e) {
   public static final Codec<ch> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               jm.a(lf.G).optionalFieldOf("items").forGetter(ch::a),
               ct.d.d.optionalFieldOf("count", ct.d.c).forGetter(ch::b),
               jz.a.optionalFieldOf("components", jz.c).forGetter(ch::c),
               ci.b.optionalFieldOf("predicates", Map.of()).forGetter(ch::d)
            )
            .apply($$0, ch::new)
   );

   public boolean a(cto $$0) {
      if (this.b.isPresent() && !$$0.a(this.b.get())) {
         return false;
      } else if (!this.c.d($$0.I())) {
         return false;
      } else if (!this.d.a($$0)) {
         return false;
      } else {
         for (ci $$1 : this.e.values()) {
            if (!$$1.a($$0)) {
               return false;
            }
         }

         return true;
      }
   }

   public Optional<jb<ctj>> a() {
      return this.b;
   }

   public ct.d b() {
      return this.c;
   }

   public jz c() {
      return this.d;
   }

   public Map<ci.a<?>, ci> d() {
      return this.e;
   }

   public static class a {
      private Optional<jb<ctj>> a = Optional.empty();
      private ct.d b = ct.d.c;
      private jz c;
      private final Builder<ci.a<?>, ci> d;

      private a() {
         this.c = jz.c;
         this.d = ImmutableMap.builder();
      }

      public static ch.a a() {
         return new ch.a();
      }

      public ch.a a(daw... $$0) {
         this.a = Optional.of(jb.a($$0x -> $$0x.q().n(), $$0));
         return this;
      }

      public ch.a a(awl<ctj> $$0) {
         this.a = Optional.of(le.h.a($$0));
         return this;
      }

      public ch.a a(ct.d $$0) {
         this.b = $$0;
         return this;
      }

      public <T extends ci> ch.a a(ci.a<T> $$0, T $$1) {
         this.d.put($$0, $$1);
         return this;
      }

      public ch.a a(jz $$0) {
         this.c = $$0;
         return this;
      }

      public ch b() {
         return new ch(this.a, this.b, this.c, this.d.build());
      }
   }
}
