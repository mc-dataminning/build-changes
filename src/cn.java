import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public record cn(Map<il<boi>, cn.b> b) {
   public static final Codec<cn> a = Codec.unboundedMap(ki.d.r(), cn.b.a).xmap(cn::new, cn::a);

   public boolean a(box $$0) {
      if ($$0 instanceof bpp $$1 && this.a($$1.ev())) {
         return true;
      }

      return false;
   }

   public boolean a(bpp $$0) {
      return this.a($$0.ev());
   }

   public boolean a(Map<il<boi>, bok> $$0) {
      for (Entry<il<boi>, cn.b> $$1 : this.b.entrySet()) {
         bok $$2 = $$0.get($$1.getKey());
         if (!$$1.getValue().a($$2)) {
            return false;
         }
      }

      return true;
   }

   public Map<il<boi>, cn.b> a() {
      return this.b;
   }

   public static class a {
      private final Builder<il<boi>, cn.b> a = ImmutableMap.builder();

      public static cn.a a() {
         return new cn.a();
      }

      public cn.a a(il<boi> $$0) {
         this.a.put($$0, new cn.b());
         return this;
      }

      public cn.a a(il<boi> $$0, cn.b $$1) {
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
                  awe.a(cm.d.d, "amplifier", cm.d.c).forGetter(cn.b::a),
                  awe.a(cm.d.d, "duration", cm.d.c).forGetter(cn.b::b),
                  awe.a(Codec.BOOL, "ambient").forGetter(cn.b::c),
                  awe.a(Codec.BOOL, "visible").forGetter(cn.b::d)
               )
               .apply($$0, cn.b::new)
      );

      public b() {
         this(cm.d.c, cm.d.c, Optional.empty(), Optional.empty());
      }

      public boolean a(@Nullable bok $$0) {
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
