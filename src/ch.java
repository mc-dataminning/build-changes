import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;

public record ch(Optional<ja<csu>> b, ct.d c, jy d, Map<ci.a<?>, ci> e) {
   public static final Codec<ch> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               axh.a(jl.a(le.G), "items").forGetter(ch::a),
               axh.a(ct.d.d, "count", ct.d.c).forGetter(ch::b),
               axh.a(jy.a, "components", jy.c).forGetter(ch::c),
               axh.a(ci.b, "predicates", Map.of()).forGetter(ch::d)
            )
            .apply($$0, ch::new)
   );

   public boolean a(csz $$0) {
      if (this.b.isPresent() && !$$0.a(this.b.get())) {
         return false;
      } else if (!this.c.d($$0.G())) {
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

   public Optional<ja<csu>> a() {
      return this.b;
   }

   public ct.d b() {
      return this.c;
   }

   public jy c() {
      return this.d;
   }

   public Map<ci.a<?>, ci> d() {
      return this.e;
   }

   public static class a {
      private Optional<ja<csu>> a = Optional.empty();
      private ct.d b = ct.d.c;
      private jy c;
      private final Builder<ci.a<?>, ci> d;

      private a() {
         this.c = jy.c;
         this.d = ImmutableMap.builder();
      }

      public static ch.a a() {
         return new ch.a();
      }

      public ch.a a(dac... $$0) {
         this.a = Optional.of(ja.a($$0x -> $$0x.q().n(), $$0));
         return this;
      }

      public ch.a a(awg<csu> $$0) {
         this.a = Optional.of(ld.h.a($$0));
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

      public ch.a a(jy $$0) {
         this.c = $$0;
         return this;
      }

      public ch b() {
         return new ch(this.a, this.b, this.c, this.d.build());
      }
   }
}
