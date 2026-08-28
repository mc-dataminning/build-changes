import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public record df(Map<ji<bsb>, df.b> b) {
   public static final Codec<df> a = Codec.unboundedMap(lp.d.r(), df.b.a).xmap(df::new, df::a);

   public boolean a(bsv $$0) {
      if ($$0 instanceof btq $$1 && this.a($$1.ey())) {
         return true;
      }

      return false;
   }

   public boolean a(btq $$0) {
      return this.a($$0.ey());
   }

   public boolean a(Map<ji<bsb>, bsd> $$0) {
      for (Entry<ji<bsb>, df.b> $$1 : this.b.entrySet()) {
         bsd $$2 = $$0.get($$1.getKey());
         if (!$$1.getValue().a($$2)) {
            return false;
         }
      }

      return true;
   }

   public Map<ji<bsb>, df.b> a() {
      return this.b;
   }

   public static class a {
      private final Builder<ji<bsb>, df.b> a = ImmutableMap.builder();

      public static df.a a() {
         return new df.a();
      }

      public df.a a(ji<bsb> $$0) {
         this.a.put($$0, new df.b());
         return this;
      }

      public df.a a(ji<bsb> $$0, df.b $$1) {
         this.a.put($$0, $$1);
         return this;
      }

      public Optional<df> b() {
         return Optional.of(new df(this.a.build()));
      }
   }

   public static record b(de.d b, de.d c, Optional<Boolean> d, Optional<Boolean> e) {
      public static final Codec<df.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  de.d.d.optionalFieldOf("amplifier", de.d.c).forGetter(df.b::a),
                  de.d.d.optionalFieldOf("duration", de.d.c).forGetter(df.b::b),
                  Codec.BOOL.optionalFieldOf("ambient").forGetter(df.b::c),
                  Codec.BOOL.optionalFieldOf("visible").forGetter(df.b::d)
               )
               .apply($$0, df.b::new)
      );

      public b() {
         this(de.d.c, de.d.c, Optional.empty(), Optional.empty());
      }

      public boolean a(@Nullable bsd $$0) {
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

      public de.d a() {
         return this.b;
      }

      public de.d b() {
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
