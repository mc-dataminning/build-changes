import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public record cx(Map<jf<bvv>, cx.b> b) {
   public static final Codec<cx> a = Codec.unboundedMap(bvv.a, cx.b.a).xmap(cx::new, cx::a);

   public boolean a(bwt $$0) {
      if ($$0 instanceof bxu $$1 && this.a($$1.eE())) {
         return true;
      }

      return false;
   }

   public boolean a(bxu $$0) {
      return this.a($$0.eE());
   }

   public boolean a(Map<jf<bvv>, bvx> $$0) {
      for (Entry<jf<bvv>, cx.b> $$1 : this.b.entrySet()) {
         bvx $$2 = $$0.get($$1.getKey());
         if (!$$1.getValue().a($$2)) {
            return false;
         }
      }

      return true;
   }

   public Map<jf<bvv>, cx.b> a() {
      return this.b;
   }

   public static class a {
      private final Builder<jf<bvv>, cx.b> a = ImmutableMap.builder();

      public static cx.a a() {
         return new cx.a();
      }

      public cx.a a(jf<bvv> $$0) {
         this.a.put($$0, new cx.b());
         return this;
      }

      public cx.a a(jf<bvv> $$0, cx.b $$1) {
         this.a.put($$0, $$1);
         return this;
      }

      public Optional<cx> b() {
         return Optional.of(new cx(this.a.build()));
      }
   }

   public static record b(cw.d b, cw.d c, Optional<Boolean> d, Optional<Boolean> e) {
      public static final Codec<cx.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  cw.d.d.optionalFieldOf("amplifier", cw.d.c).forGetter(cx.b::a),
                  cw.d.d.optionalFieldOf("duration", cw.d.c).forGetter(cx.b::b),
                  Codec.BOOL.optionalFieldOf("ambient").forGetter(cx.b::c),
                  Codec.BOOL.optionalFieldOf("visible").forGetter(cx.b::d)
               )
               .apply($$0, cx.b::new)
      );

      public b() {
         this(cw.d.c, cw.d.c, Optional.empty(), Optional.empty());
      }

      public boolean a(@Nullable bvx $$0) {
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

      public cw.d a() {
         return this.b;
      }

      public cw.d b() {
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
