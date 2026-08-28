import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public record di(Map<jm<brx>, di.b> b) {
   public static final Codec<di> a = Codec.unboundedMap(brx.a, di.b.a).xmap(di::new, di::a);

   public boolean a(bsr $$0) {
      if ($$0 instanceof btn $$1 && this.a($$1.eu())) {
         return true;
      }

      return false;
   }

   public boolean a(btn $$0) {
      return this.a($$0.eu());
   }

   public boolean a(Map<jm<brx>, brz> $$0) {
      for (Entry<jm<brx>, di.b> $$1 : this.b.entrySet()) {
         brz $$2 = $$0.get($$1.getKey());
         if (!$$1.getValue().a($$2)) {
            return false;
         }
      }

      return true;
   }

   public Map<jm<brx>, di.b> a() {
      return this.b;
   }

   public static class a {
      private final Builder<jm<brx>, di.b> a = ImmutableMap.builder();

      public static di.a a() {
         return new di.a();
      }

      public di.a a(jm<brx> $$0) {
         this.a.put($$0, new di.b());
         return this;
      }

      public di.a a(jm<brx> $$0, di.b $$1) {
         this.a.put($$0, $$1);
         return this;
      }

      public Optional<di> b() {
         return Optional.of(new di(this.a.build()));
      }
   }

   public static record b(dh.d b, dh.d c, Optional<Boolean> d, Optional<Boolean> e) {
      public static final Codec<di.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  dh.d.d.optionalFieldOf("amplifier", dh.d.c).forGetter(di.b::a),
                  dh.d.d.optionalFieldOf("duration", dh.d.c).forGetter(di.b::b),
                  Codec.BOOL.optionalFieldOf("ambient").forGetter(di.b::c),
                  Codec.BOOL.optionalFieldOf("visible").forGetter(di.b::d)
               )
               .apply($$0, di.b::new)
      );

      public b() {
         this(dh.d.c, dh.d.c, Optional.empty(), Optional.empty());
      }

      public boolean a(@Nullable brz $$0) {
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

      public dh.d a() {
         return this.b;
      }

      public dh.d b() {
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
