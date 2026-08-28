import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public record cw(Map<je<bvc>, cw.b> b) {
   public static final Codec<cw> a = Codec.unboundedMap(bvc.a, cw.b.a).xmap(cw::new, cw::a);

   public boolean a(bwa $$0) {
      if ($$0 instanceof bwz $$1 && this.a($$1.eD())) {
         return true;
      }

      return false;
   }

   public boolean a(bwz $$0) {
      return this.a($$0.eD());
   }

   public boolean a(Map<je<bvc>, bve> $$0) {
      for (Entry<je<bvc>, cw.b> $$1 : this.b.entrySet()) {
         bve $$2 = $$0.get($$1.getKey());
         if (!$$1.getValue().a($$2)) {
            return false;
         }
      }

      return true;
   }

   public Map<je<bvc>, cw.b> a() {
      return this.b;
   }

   public static class a {
      private final Builder<je<bvc>, cw.b> a = ImmutableMap.builder();

      public static cw.a a() {
         return new cw.a();
      }

      public cw.a a(je<bvc> $$0) {
         this.a.put($$0, new cw.b());
         return this;
      }

      public cw.a a(je<bvc> $$0, cw.b $$1) {
         this.a.put($$0, $$1);
         return this;
      }

      public Optional<cw> b() {
         return Optional.of(new cw(this.a.build()));
      }
   }

   public static record b(cv.d b, cv.d c, Optional<Boolean> d, Optional<Boolean> e) {
      public static final Codec<cw.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  cv.d.d.optionalFieldOf("amplifier", cv.d.c).forGetter(cw.b::a),
                  cv.d.d.optionalFieldOf("duration", cv.d.c).forGetter(cw.b::b),
                  Codec.BOOL.optionalFieldOf("ambient").forGetter(cw.b::c),
                  Codec.BOOL.optionalFieldOf("visible").forGetter(cw.b::d)
               )
               .apply($$0, cw.b::new)
      );

      public b() {
         this(cv.d.c, cv.d.c, Optional.empty(), Optional.empty());
      }

      public boolean a(@Nullable bve $$0) {
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

      public cv.d a() {
         return this.b;
      }

      public cv.d b() {
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
