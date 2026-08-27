import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public record cl(Map<ih<blf>, cl.b> b) {
   public static final Codec<cl> a = Codec.unboundedMap(kd.d.r(), cl.b.a).xmap(cl::new, cl::a);

   public boolean a(blu $$0) {
      if ($$0 instanceof bmk $$1 && this.a($$1.et())) {
         return true;
      }

      return false;
   }

   public boolean a(bmk $$0) {
      return this.a($$0.et());
   }

   public boolean a(Map<blf, blh> $$0) {
      for (Entry<ih<blf>, cl.b> $$1 : this.b.entrySet()) {
         blh $$2 = $$0.get($$1.getKey().a());
         if (!$$1.getValue().a($$2)) {
            return false;
         }
      }

      return true;
   }

   public Map<ih<blf>, cl.b> a() {
      return this.b;
   }

   public static class a {
      private final Builder<ih<blf>, cl.b> a = ImmutableMap.builder();

      public static cl.a a() {
         return new cl.a();
      }

      public cl.a a(blf $$0) {
         this.a.put($$0.j(), new cl.b());
         return this;
      }

      public cl.a a(blf $$0, cl.b $$1) {
         this.a.put($$0.j(), $$1);
         return this;
      }

      public Optional<cl> b() {
         return Optional.of(new cl(this.a.build()));
      }
   }

   public static record b(ck.d b, ck.d c, Optional<Boolean> d, Optional<Boolean> e) {
      public static final Codec<cl.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  atv.a(ck.d.d, "amplifier", ck.d.c).forGetter(cl.b::a),
                  atv.a(ck.d.d, "duration", ck.d.c).forGetter(cl.b::b),
                  atv.a(Codec.BOOL, "ambient").forGetter(cl.b::c),
                  atv.a(Codec.BOOL, "visible").forGetter(cl.b::d)
               )
               .apply($$0, cl.b::new)
      );

      public b() {
         this(ck.d.c, ck.d.c, Optional.empty(), Optional.empty());
      }

      public boolean a(@Nullable blh $$0) {
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

      public ck.d a() {
         return this.b;
      }

      public ck.d b() {
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
