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

public record bf(List<dc<bji>> b, Optional<bq> c, Optional<bq> d) {
   public static final Codec<bf> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               asq.a(dc.a(jz.q).listOf(), "tags", List.of()).forGetter(bf::b),
               asq.a(bq.a, "direct_entity").forGetter(bf::c),
               asq.a(bq.a, "source_entity").forGetter(bf::d)
            )
            .apply($$0, bf::new)
   );

   public boolean a(amb $$0, bjg $$1) {
      return this.a($$0.x(), $$0.dj(), $$1);
   }

   public boolean a(ama $$0, eji $$1, bjg $$2) {
      for (dc<bji> $$3 : this.b) {
         if (!$$3.a($$2.k())) {
            return false;
         }
      }

      return this.c.isPresent() && !this.c.get().a($$0, $$1, $$2.c()) ? false : !this.d.isPresent() || this.d.get().a($$0, $$1, $$2.d());
   }

   public static Optional<bf> a(@Nullable JsonElement $$0) {
      return $$0 != null && !$$0.isJsonNull() ? Optional.of(ac.a(a.parse(JsonOps.INSTANCE, $$0), JsonParseException::new)) : Optional.empty();
   }

   public JsonElement a() {
      return ac.a(a.encodeStart(JsonOps.INSTANCE, this), IllegalStateException::new);
   }

   public static class a {
      private final Builder<dc<bji>> a = ImmutableList.builder();
      private Optional<bq> b = Optional.empty();
      private Optional<bq> c = Optional.empty();

      public static bf.a a() {
         return new bf.a();
      }

      public bf.a a(dc<bji> $$0) {
         this.a.add($$0);
         return this;
      }

      public bf.a a(bq.a $$0) {
         this.b = Optional.of($$0.b());
         return this;
      }

      public bf.a b(bq.a $$0) {
         this.c = Optional.of($$0.b());
         return this;
      }

      public bf b() {
         return new bf(this.a.build(), this.b, this.c);
      }
   }
}
