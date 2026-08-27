import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.JsonOps;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public record bd(List<da<bhi>> b, Optional<bo> c, Optional<bo> d) {
   public static final Codec<bd> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               aqy.a(da.a(jc.p).listOf(), "tags", List.of()).forGetter(bd::b),
               aqy.a(bo.a, "direct_entity").forGetter(bd::c),
               aqy.a(bo.a, "source_entity").forGetter(bd::d)
            )
            .apply($$0, bd::new)
   );

   static Optional<bd> a(List<da<bhi>> $$0, Optional<bo> $$1, Optional<bo> $$2) {
      return $$0.isEmpty() && $$1.isEmpty() && $$2.isEmpty() ? Optional.empty() : Optional.of(new bd($$0, $$1, $$2));
   }

   public boolean a(akl $$0, bhg $$1) {
      return this.a($$0.x(), $$0.di(), $$1);
   }

   public boolean a(akk $$0, ehd $$1, bhg $$2) {
      for (da<bhi> $$3 : this.b) {
         if (!$$3.a($$2.k())) {
            return false;
         }
      }

      return this.c.isPresent() && !this.c.get().a($$0, $$1, $$2.c()) ? false : !this.d.isPresent() || this.d.get().a($$0, $$1, $$2.d());
   }

   public static Optional<bd> a(@Nullable JsonElement $$0) {
      return $$0 != null && !$$0.isJsonNull() ? Optional.of(ac.a(a.parse(JsonOps.INSTANCE, $$0), JsonParseException::new)) : Optional.empty();
   }

   public JsonElement a() {
      return ac.a(a.encodeStart(JsonOps.INSTANCE, this), IllegalStateException::new);
   }

   public static class a {
      private final Builder<da<bhi>> a = ImmutableList.builder();
      private Optional<bo> b = Optional.empty();
      private Optional<bo> c = Optional.empty();

      public static bd.a a() {
         return new bd.a();
      }

      public bd.a a(da<bhi> $$0) {
         this.a.add($$0);
         return this;
      }

      public bd.a a(bo.a $$0) {
         this.b = $$0.b();
         return this;
      }

      public bd.a b(bo.a $$0) {
         this.c = $$0.b();
         return this;
      }

      public Optional<bd> b() {
         return bd.a(this.a.build(), this.b, this.c);
      }
   }
}
