import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;

public record cg(Optional<iz<cry>> b, cs.d c, jx d, Map<ch.a<?>, ch> e) {
   public static final Codec<cg> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               axe.a(jk.a(ld.G), "items").forGetter(cg::a),
               axe.a(cs.d.d, "count", cs.d.c).forGetter(cg::b),
               axe.a(jx.a, "components", jx.c).forGetter(cg::c),
               axe.a(ch.b, "predicates", Map.of()).forGetter(cg::d)
            )
            .apply($$0, cg::new)
   );

   public boolean a(csd $$0) {
      if (this.b.isPresent() && !$$0.a(this.b.get())) {
         return false;
      } else if (!this.c.d($$0.G())) {
         return false;
      } else if (!this.d.a($$0)) {
         return false;
      } else {
         for (ch $$1 : this.e.values()) {
            if (!$$1.a($$0)) {
               return false;
            }
         }

         return true;
      }
   }

   public Optional<iz<cry>> a() {
      return this.b;
   }

   public cs.d b() {
      return this.c;
   }

   public jx c() {
      return this.d;
   }

   public Map<ch.a<?>, ch> d() {
      return this.e;
   }

   public static class a {
      private Optional<iz<cry>> a = Optional.empty();
      private cs.d b = cs.d.c;
      private jx c;
      private final Builder<ch.a<?>, ch> d;

      private a() {
         this.c = jx.c;
         this.d = ImmutableMap.builder();
      }

      public static cg.a a() {
         return new cg.a();
      }

      public cg.a a(czt... $$0) {
         this.a = Optional.of(iz.a($$0x -> $$0x.p().n(), $$0));
         return this;
      }

      public cg.a a(awd<cry> $$0) {
         this.a = Optional.of(lc.h.a($$0));
         return this;
      }

      public cg.a a(cs.d $$0) {
         this.b = $$0;
         return this;
      }

      public <T extends ch> cg.a a(ch.a<T> $$0, T $$1) {
         this.d.put($$0, $$1);
         return this;
      }

      public cg.a a(jx $$0) {
         this.c = $$0;
         return this;
      }

      public cg b() {
         return new cg(this.a, this.b, this.c, this.d.build());
      }
   }
}
