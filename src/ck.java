import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.JsonOps;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public record ck(Map<he<bht>, ck.b> b) {
   public static final Codec<ck> a = Codec.unboundedMap(jb.e.r(), ck.b.a).xmap(ck::new, ck::b);

   public boolean a(bii $$0) {
      if ($$0 instanceof biy $$1 && this.a($$1.er())) {
         return true;
      }

      return false;
   }

   public boolean a(biy $$0) {
      return this.a($$0.er());
   }

   public boolean a(Map<bht, bhv> $$0) {
      for (Entry<he<bht>, ck.b> $$1 : this.b.entrySet()) {
         bhv $$2 = $$0.get($$1.getKey().a());
         if (!$$1.getValue().a($$2)) {
            return false;
         }
      }

      return true;
   }

   public static Optional<ck> a(@Nullable JsonElement $$0) {
      return $$0 != null && !$$0.isJsonNull() ? Optional.of(ac.a(a.parse(JsonOps.INSTANCE, $$0), JsonParseException::new)) : Optional.empty();
   }

   public JsonElement a() {
      return ac.a(a.encodeStart(JsonOps.INSTANCE, this), IllegalStateException::new);
   }

   public static class a {
      private final Builder<he<bht>, ck.b> a = ImmutableMap.builder();

      public static ck.a a() {
         return new ck.a();
      }

      public ck.a a(bht $$0) {
         this.a.put($$0.j(), new ck.b());
         return this;
      }

      public ck.a a(bht $$0, ck.b $$1) {
         this.a.put($$0.j(), $$1);
         return this;
      }

      public Optional<ck> b() {
         ImmutableMap<he<bht>, ck.b> $$0 = this.a.build();
         return $$0.isEmpty() ? Optional.empty() : Optional.of(new ck($$0));
      }
   }

   public static record b(cj.d b, cj.d c, Optional<Boolean> d, Optional<Boolean> e) {
      public static final Codec<ck.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  aqy.a(cj.d.d, "amplifier", cj.d.c).forGetter(ck.b::a),
                  aqy.a(cj.d.d, "duration", cj.d.c).forGetter(ck.b::b),
                  aqy.a(Codec.BOOL, "ambient").forGetter(ck.b::c),
                  aqy.a(Codec.BOOL, "visible").forGetter(ck.b::d)
               )
               .apply($$0, ck.b::new)
      );

      public b() {
         this(cj.d.c, cj.d.c, Optional.empty(), Optional.empty());
      }

      public boolean a(@Nullable bhv $$0) {
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

      public cj.d a() {
         return this.b;
      }

      public cj.d b() {
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
