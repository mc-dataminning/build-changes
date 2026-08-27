import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public record cu(Map<iw<bqr>, cu.b> b) {
   public static final Codec<cu> a = Codec.unboundedMap(ld.d.r(), cu.b.a).xmap(cu::new, cu::a);

   public boolean a(brh $$0) {
      if ($$0 instanceof bsa $$1 && this.a($$1.ew())) {
         return true;
      }

      return false;
   }

   public boolean a(bsa $$0) {
      return this.a($$0.ew());
   }

   public boolean a(Map<iw<bqr>, bqt> $$0) {
      for (Entry<iw<bqr>, cu.b> $$1 : this.b.entrySet()) {
         bqt $$2 = $$0.get($$1.getKey());
         if (!$$1.getValue().a($$2)) {
            return false;
         }
      }

      return true;
   }

   public Map<iw<bqr>, cu.b> a() {
      return this.b;
   }

   public static class a {
      private final Builder<iw<bqr>, cu.b> a = ImmutableMap.builder();

      public static cu.a a() {
         return new cu.a();
      }

      public cu.a a(iw<bqr> $$0) {
         this.a.put($$0, new cu.b());
         return this;
      }

      public cu.a a(iw<bqr> $$0, cu.b $$1) {
         this.a.put($$0, $$1);
         return this;
      }

      public Optional<cu> b() {
         return Optional.of(new cu(this.a.build()));
      }
   }

   public static record b(ct.d b, ct.d c, Optional<Boolean> d, Optional<Boolean> e) {
      public static final Codec<cu.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  axh.a(ct.d.d, "amplifier", ct.d.c).forGetter(cu.b::a),
                  axh.a(ct.d.d, "duration", ct.d.c).forGetter(cu.b::b),
                  axh.a(Codec.BOOL, "ambient").forGetter(cu.b::c),
                  axh.a(Codec.BOOL, "visible").forGetter(cu.b::d)
               )
               .apply($$0, cu.b::new)
      );

      public b() {
         this(ct.d.c, ct.d.c, Optional.empty(), Optional.empty());
      }

      public boolean a(@Nullable bqt $$0) {
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

      public ct.d a() {
         return this.b;
      }

      public ct.d b() {
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
