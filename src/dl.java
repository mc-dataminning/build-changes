import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public record dl(Map<jr<btm>, dl.b> b) {
   public static final Codec<dl> a = Codec.unboundedMap(btm.a, dl.b.a).xmap(dl::new, dl::a);

   public boolean a(buj $$0) {
      if ($$0 instanceof bvf $$1 && this.a($$1.eC())) {
         return true;
      }

      return false;
   }

   public boolean a(bvf $$0) {
      return this.a($$0.eC());
   }

   public boolean a(Map<jr<btm>, bto> $$0) {
      for (Entry<jr<btm>, dl.b> $$1 : this.b.entrySet()) {
         bto $$2 = $$0.get($$1.getKey());
         if (!$$1.getValue().a($$2)) {
            return false;
         }
      }

      return true;
   }

   public Map<jr<btm>, dl.b> a() {
      return this.b;
   }

   public static class a {
      private final Builder<jr<btm>, dl.b> a = ImmutableMap.builder();

      public static dl.a a() {
         return new dl.a();
      }

      public dl.a a(jr<btm> $$0) {
         this.a.put($$0, new dl.b());
         return this;
      }

      public dl.a a(jr<btm> $$0, dl.b $$1) {
         this.a.put($$0, $$1);
         return this;
      }

      public Optional<dl> b() {
         return Optional.of(new dl(this.a.build()));
      }
   }

   public static record b(dk.d b, dk.d c, Optional<Boolean> d, Optional<Boolean> e) {
      public static final Codec<dl.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  dk.d.d.optionalFieldOf("amplifier", dk.d.c).forGetter(dl.b::a),
                  dk.d.d.optionalFieldOf("duration", dk.d.c).forGetter(dl.b::b),
                  Codec.BOOL.optionalFieldOf("ambient").forGetter(dl.b::c),
                  Codec.BOOL.optionalFieldOf("visible").forGetter(dl.b::d)
               )
               .apply($$0, dl.b::new)
      );

      public b() {
         this(dk.d.c, dk.d.c, Optional.empty(), Optional.empty());
      }

      public boolean a(@Nullable bto $$0) {
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

      public dk.d a() {
         return this.b;
      }

      public dk.d b() {
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
