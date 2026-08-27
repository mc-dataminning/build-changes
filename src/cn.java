import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public record cn(Map<ij<bnb>, cn.b> b) {
   public static final Codec<cn> a = Codec.unboundedMap(kf.d.r(), cn.b.a).xmap(cn::new, cn::a);

   public boolean a(bnq $$0) {
      if ($$0 instanceof boi $$1 && this.a($$1.eu())) {
         return true;
      }

      return false;
   }

   public boolean a(boi $$0) {
      return this.a($$0.eu());
   }

   public boolean a(Map<ij<bnb>, bnd> $$0) {
      for (Entry<ij<bnb>, cn.b> $$1 : this.b.entrySet()) {
         bnd $$2 = $$0.get($$1.getKey());
         if (!$$1.getValue().a($$2)) {
            return false;
         }
      }

      return true;
   }

   public Map<ij<bnb>, cn.b> a() {
      return this.b;
   }

   public static class a {
      private final Builder<ij<bnb>, cn.b> a = ImmutableMap.builder();

      public static cn.a a() {
         return new cn.a();
      }

      public cn.a a(ij<bnb> $$0) {
         this.a.put($$0, new cn.b());
         return this;
      }

      public cn.a a(ij<bnb> $$0, cn.b $$1) {
         this.a.put($$0, $$1);
         return this;
      }

      public Optional<cn> b() {
         return Optional.of(new cn(this.a.build()));
      }
   }

   public static record b(cm.d b, cm.d c, Optional<Boolean> d, Optional<Boolean> e) {
      public static final Codec<cn.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  avq.a(cm.d.d, "amplifier", cm.d.c).forGetter(cn.b::a),
                  avq.a(cm.d.d, "duration", cm.d.c).forGetter(cn.b::b),
                  avq.a(Codec.BOOL, "ambient").forGetter(cn.b::c),
                  avq.a(Codec.BOOL, "visible").forGetter(cn.b::d)
               )
               .apply($$0, cn.b::new)
      );

      public b() {
         this(cm.d.c, cm.d.c, Optional.empty(), Optional.empty());
      }

      public boolean a(@Nullable bnd $$0) {
         if ($$0 == null) {
            return false;
         } else if (!this.b.d($$0.d())) {
            return false;
         } else if (!this.c.d($$0.c())) {
            return false;
         } else {
            return this.d.isPresent() && this.d.get() != $$0.e() ? false : !this.e.isPresent() || this.e.get() == $$0.f();
         }
      }

      public cm.d a() {
         return this.b;
      }

      public cm.d b() {
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
