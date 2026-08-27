import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public record ct(Map<iv<bpv>, ct.b> b) {
   public static final Codec<ct> a = Codec.unboundedMap(lc.d.r(), ct.b.a).xmap(ct::new, ct::a);

   public boolean a(bql $$0) {
      if ($$0 instanceof bre $$1 && this.a($$1.ew())) {
         return true;
      }

      return false;
   }

   public boolean a(bre $$0) {
      return this.a($$0.ew());
   }

   public boolean a(Map<iv<bpv>, bpx> $$0) {
      for (Entry<iv<bpv>, ct.b> $$1 : this.b.entrySet()) {
         bpx $$2 = $$0.get($$1.getKey());
         if (!$$1.getValue().a($$2)) {
            return false;
         }
      }

      return true;
   }

   public Map<iv<bpv>, ct.b> a() {
      return this.b;
   }

   public static class a {
      private final Builder<iv<bpv>, ct.b> a = ImmutableMap.builder();

      public static ct.a a() {
         return new ct.a();
      }

      public ct.a a(iv<bpv> $$0) {
         this.a.put($$0, new ct.b());
         return this;
      }

      public ct.a a(iv<bpv> $$0, ct.b $$1) {
         this.a.put($$0, $$1);
         return this;
      }

      public Optional<ct> b() {
         return Optional.of(new ct(this.a.build()));
      }
   }

   public static record b(cs.d b, cs.d c, Optional<Boolean> d, Optional<Boolean> e) {
      public static final Codec<ct.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  axe.a(cs.d.d, "amplifier", cs.d.c).forGetter(ct.b::a),
                  axe.a(cs.d.d, "duration", cs.d.c).forGetter(ct.b::b),
                  axe.a(Codec.BOOL, "ambient").forGetter(ct.b::c),
                  axe.a(Codec.BOOL, "visible").forGetter(ct.b::d)
               )
               .apply($$0, ct.b::new)
      );

      public b() {
         this(cs.d.c, cs.d.c, Optional.empty(), Optional.empty());
      }

      public boolean a(@Nullable bpx $$0) {
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

      public cs.d a() {
         return this.b;
      }

      public cs.d b() {
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
