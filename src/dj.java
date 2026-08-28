import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public record dj(Map<jp<btc>, dj.b> b) {
   public static final Codec<dj> a = Codec.unboundedMap(btc.a, dj.b.a).xmap(dj::new, dj::a);

   public boolean a(btz $$0) {
      if ($$0 instanceof buv $$1 && this.a($$1.eE())) {
         return true;
      }

      return false;
   }

   public boolean a(buv $$0) {
      return this.a($$0.eE());
   }

   public boolean a(Map<jp<btc>, bte> $$0) {
      for (Entry<jp<btc>, dj.b> $$1 : this.b.entrySet()) {
         bte $$2 = $$0.get($$1.getKey());
         if (!$$1.getValue().a($$2)) {
            return false;
         }
      }

      return true;
   }

   public Map<jp<btc>, dj.b> a() {
      return this.b;
   }

   public static class a {
      private final Builder<jp<btc>, dj.b> a = ImmutableMap.builder();

      public static dj.a a() {
         return new dj.a();
      }

      public dj.a a(jp<btc> $$0) {
         this.a.put($$0, new dj.b());
         return this;
      }

      public dj.a a(jp<btc> $$0, dj.b $$1) {
         this.a.put($$0, $$1);
         return this;
      }

      public Optional<dj> b() {
         return Optional.of(new dj(this.a.build()));
      }
   }

   public static record b(di.d b, di.d c, Optional<Boolean> d, Optional<Boolean> e) {
      public static final Codec<dj.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  di.d.d.optionalFieldOf("amplifier", di.d.c).forGetter(dj.b::a),
                  di.d.d.optionalFieldOf("duration", di.d.c).forGetter(dj.b::b),
                  Codec.BOOL.optionalFieldOf("ambient").forGetter(dj.b::c),
                  Codec.BOOL.optionalFieldOf("visible").forGetter(dj.b::d)
               )
               .apply($$0, dj.b::new)
      );

      public b() {
         this(di.d.c, di.d.c, Optional.empty(), Optional.empty());
      }

      public boolean a(@Nullable bte $$0) {
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

      public di.d a() {
         return this.b;
      }

      public di.d b() {
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
