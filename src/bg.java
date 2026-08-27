import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public record bg(List<dd<bmr>> b, Optional<br> c, Optional<br> d) {
   public static final Codec<bg> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               avq.a(dd.a(kg.r).listOf(), "tags", List.of()).forGetter(bg::a),
               avq.a(br.a, "direct_entity").forGetter(bg::b),
               avq.a(br.a, "source_entity").forGetter(bg::c)
            )
            .apply($$0, bg::new)
   );

   public boolean a(aox $$0, bmp $$1) {
      return this.a($$0.z(), $$0.dk(), $$1);
   }

   public boolean a(aow $$0, enz $$1, bmp $$2) {
      for (dd<bmr> $$3 : this.b) {
         if (!$$3.a($$2.k())) {
            return false;
         }
      }

      return this.c.isPresent() && !this.c.get().a($$0, $$1, $$2.c()) ? false : !this.d.isPresent() || this.d.get().a($$0, $$1, $$2.d());
   }

   public List<dd<bmr>> a() {
      return this.b;
   }

   public Optional<br> b() {
      return this.c;
   }

   public Optional<br> c() {
      return this.d;
   }

   public static class a {
      private final Builder<dd<bmr>> a = ImmutableList.builder();
      private Optional<br> b = Optional.empty();
      private Optional<br> c = Optional.empty();

      public static bg.a a() {
         return new bg.a();
      }

      public bg.a a(dd<bmr> $$0) {
         this.a.add($$0);
         return this;
      }

      public bg.a a(br.a $$0) {
         this.b = Optional.of($$0.b());
         return this;
      }

      public bg.a b(br.a $$0) {
         this.c = Optional.of($$0.b());
         return this;
      }

      public bg b() {
         return new bg(this.a.build(), this.b, this.c);
      }
   }
}
