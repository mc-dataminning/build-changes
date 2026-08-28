import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public record dk(Map<jq<bui>, dk.b> b) {
   public static final Codec<dk> a = Codec.unboundedMap(bui.a, dk.b.a).xmap(dk::new, dk::a);

   public boolean a(bvf $$0) {
      if ($$0 instanceof bwb $$1 && this.a($$1.eB())) {
         return true;
      }

      return false;
   }

   public boolean a(bwb $$0) {
      return this.a($$0.eB());
   }

   public boolean a(Map<jq<bui>, buk> $$0) {
      for (Entry<jq<bui>, dk.b> $$1 : this.b.entrySet()) {
         buk $$2 = $$0.get($$1.getKey());
         if (!$$1.getValue().a($$2)) {
            return false;
         }
      }

      return true;
   }

   public Map<jq<bui>, dk.b> a() {
      return this.b;
   }

   public static class a {
      private final Builder<jq<bui>, dk.b> a = ImmutableMap.builder();

      public static dk.a a() {
         return new dk.a();
      }

      public dk.a a(jq<bui> $$0) {
         this.a.put($$0, new dk.b());
         return this;
      }

      public dk.a a(jq<bui> $$0, dk.b $$1) {
         this.a.put($$0, $$1);
         return this;
      }

      public Optional<dk> b() {
         return Optional.of(new dk(this.a.build()));
      }
   }

   public static record b(dj.d b, dj.d c, Optional<Boolean> d, Optional<Boolean> e) {
      public static final Codec<dk.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  dj.d.d.optionalFieldOf("amplifier", dj.d.c).forGetter(dk.b::a),
                  dj.d.d.optionalFieldOf("duration", dj.d.c).forGetter(dk.b::b),
                  Codec.BOOL.optionalFieldOf("ambient").forGetter(dk.b::c),
                  Codec.BOOL.optionalFieldOf("visible").forGetter(dk.b::d)
               )
               .apply($$0, dk.b::new)
      );

      public b() {
         this(dj.d.c, dj.d.c, Optional.empty(), Optional.empty());
      }

      public boolean a(@Nullable buk $$0) {
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

      public dj.d a() {
         return this.b;
      }

      public dj.d b() {
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
