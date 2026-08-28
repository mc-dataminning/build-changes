import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public record cy(Map<jg<bvx>, cy.b> b) {
   public static final Codec<cy> a = Codec.unboundedMap(bvx.a, cy.b.a).xmap(cy::new, cy::a);

   public boolean a(bwv $$0) {
      if ($$0 instanceof bxw $$1 && this.a($$1.eE())) {
         return true;
      }

      return false;
   }

   public boolean a(bxw $$0) {
      return this.a($$0.eE());
   }

   public boolean a(Map<jg<bvx>, bvz> $$0) {
      for (Entry<jg<bvx>, cy.b> $$1 : this.b.entrySet()) {
         bvz $$2 = $$0.get($$1.getKey());
         if (!$$1.getValue().a($$2)) {
            return false;
         }
      }

      return true;
   }

   public Map<jg<bvx>, cy.b> a() {
      return this.b;
   }

   public static class a {
      private final Builder<jg<bvx>, cy.b> a = ImmutableMap.builder();

      public static cy.a a() {
         return new cy.a();
      }

      public cy.a a(jg<bvx> $$0) {
         this.a.put($$0, new cy.b());
         return this;
      }

      public cy.a a(jg<bvx> $$0, cy.b $$1) {
         this.a.put($$0, $$1);
         return this;
      }

      public Optional<cy> b() {
         return Optional.of(new cy(this.a.build()));
      }
   }

   public static record b(cx.d b, cx.d c, Optional<Boolean> d, Optional<Boolean> e) {
      public static final Codec<cy.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  cx.d.d.optionalFieldOf("amplifier", cx.d.c).forGetter(cy.b::a),
                  cx.d.d.optionalFieldOf("duration", cx.d.c).forGetter(cy.b::b),
                  Codec.BOOL.optionalFieldOf("ambient").forGetter(cy.b::c),
                  Codec.BOOL.optionalFieldOf("visible").forGetter(cy.b::d)
               )
               .apply($$0, cy.b::new)
      );

      public b() {
         this(cx.d.c, cx.d.c, Optional.empty(), Optional.empty());
      }

      public boolean a(@Nullable bvz $$0) {
         if ($$0 == null) {
            return false;
         } else if (!this.b.d($$0.e())) {
            return false;
         } else if (!this.c.d($$0.d())) {
            return false;
         } else {
            return this.d.isPresent() && this.d.get() != $$0.f() ? false : !this.e.isPresent() || this.e.get() == $$0.g();
         }
      }

      public cx.d a() {
         return this.b;
      }

      public cx.d b() {
         return this.c;
      }

      public Optional<Boolean> c() {
         return this.d;
      }

      public Optional<Boolean> d() {
         return this.e;
      }
   }
}
