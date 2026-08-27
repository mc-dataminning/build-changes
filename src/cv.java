import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public record cv(Map<ja<brf>, cv.b> b) {
   public static final Codec<cv> a = Codec.unboundedMap(lh.d.r(), cv.b.a).xmap(cv::new, cv::a);

   public boolean a(brv $$0) {
      if ($$0 instanceof bso $$1 && this.a($$1.eG())) {
         return true;
      }

      return false;
   }

   public boolean a(bso $$0) {
      return this.a($$0.eG());
   }

   public boolean a(Map<ja<brf>, brh> $$0) {
      for (Entry<ja<brf>, cv.b> $$1 : this.b.entrySet()) {
         brh $$2 = $$0.get($$1.getKey());
         if (!$$1.getValue().a($$2)) {
            return false;
         }
      }

      return true;
   }

   public Map<ja<brf>, cv.b> a() {
      return this.b;
   }

   public static class a {
      private final Builder<ja<brf>, cv.b> a = ImmutableMap.builder();

      public static cv.a a() {
         return new cv.a();
      }

      public cv.a a(ja<brf> $$0) {
         this.a.put($$0, new cv.b());
         return this;
      }

      public cv.a a(ja<brf> $$0, cv.b $$1) {
         this.a.put($$0, $$1);
         return this;
      }

      public Optional<cv> b() {
         return Optional.of(new cv(this.a.build()));
      }
   }

   public static record b(cu.d b, cu.d c, Optional<Boolean> d, Optional<Boolean> e) {
      public static final Codec<cv.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  axu.a(cu.d.d, "amplifier", cu.d.c).forGetter(cv.b::a),
                  axu.a(cu.d.d, "duration", cu.d.c).forGetter(cv.b::b),
                  axu.a(Codec.BOOL, "ambient").forGetter(cv.b::c),
                  axu.a(Codec.BOOL, "visible").forGetter(cv.b::d)
               )
               .apply($$0, cv.b::new)
      );

      public b() {
         this(cu.d.c, cu.d.c, Optional.empty(), Optional.empty());
      }

      public boolean a(@Nullable brh $$0) {
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

      public cu.d a() {
         return this.b;
      }

      public cu.d b() {
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
