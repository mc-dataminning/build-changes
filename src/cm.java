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

public record cm(Map<ig<bkg>, cm.b> b) {
   public static final Codec<cm> a = Codec.unboundedMap(kc.e.r(), cm.b.a).xmap(cm::new, cm::b);

   public boolean a(bkv $$0) {
      if ($$0 instanceof bll $$1 && this.a($$1.eu())) {
         return true;
      }

      return false;
   }

   public boolean a(bll $$0) {
      return this.a($$0.eu());
   }

   public boolean a(Map<bkg, bki> $$0) {
      for (Entry<ig<bkg>, cm.b> $$1 : this.b.entrySet()) {
         bki $$2 = $$0.get($$1.getKey().a());
         if (!$$1.getValue().a($$2)) {
            return false;
         }
      }

      return true;
   }

   public static Optional<cm> a(@Nullable JsonElement $$0) {
      return $$0 != null && !$$0.isJsonNull() ? Optional.of(ac.a(a.parse(JsonOps.INSTANCE, $$0), JsonParseException::new)) : Optional.empty();
   }

   public JsonElement a() {
      return ac.a(a.encodeStart(JsonOps.INSTANCE, this), IllegalStateException::new);
   }

   public static class a {
      private final Builder<ig<bkg>, cm.b> a = ImmutableMap.builder();

      public static cm.a a() {
         return new cm.a();
      }

      public cm.a a(bkg $$0) {
         this.a.put($$0.j(), new cm.b());
         return this;
      }

      public cm.a a(bkg $$0, cm.b $$1) {
         this.a.put($$0.j(), $$1);
         return this;
      }

      public Optional<cm> b() {
         return Optional.of(new cm(this.a.build()));
      }
   }

   public static record b(cl.d b, cl.d c, Optional<Boolean> d, Optional<Boolean> e) {
      public static final Codec<cm.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  asy.a(cl.d.d, "amplifier", cl.d.c).forGetter(cm.b::a),
                  asy.a(cl.d.d, "duration", cl.d.c).forGetter(cm.b::b),
                  asy.a(Codec.BOOL, "ambient").forGetter(cm.b::c),
                  asy.a(Codec.BOOL, "visible").forGetter(cm.b::d)
               )
               .apply($$0, cm.b::new)
      );

      public b() {
         this(cl.d.c, cl.d.c, Optional.empty(), Optional.empty());
      }

      public boolean a(@Nullable bki $$0) {
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

      public cl.d a() {
         return this.b;
      }

      public cl.d b() {
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
