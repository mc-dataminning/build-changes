import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public record bg(List<dl<bpl>> b, Optional<br> c, Optional<br> d) {
   public static final Codec<bg> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               axe.a(dl.a(ld.s).listOf(), "tags", List.of()).forGetter(bg::a),
               axe.a(br.a, "direct_entity").forGetter(bg::b),
               axe.a(br.a, "source_entity").forGetter(bg::c)
            )
            .apply($$0, bg::new)
   );

   public boolean a(aqf $$0, bpj $$1) {
      return this.a($$0.z(), $$0.dl(), $$1);
   }

   public boolean a(aqe $$0, etf $$1, bpj $$2) {
      for (dl<bpl> $$3 : this.b) {
         if (!$$3.a($$2.k())) {
            return false;
         }
      }

      return this.c.isPresent() && !this.c.get().a($$0, $$1, $$2.c()) ? false : !this.d.isPresent() || this.d.get().a($$0, $$1, $$2.d());
   }

   public List<dl<bpl>> a() {
      return this.b;
   }

   public Optional<br> b() {
      return this.c;
   }

   public Optional<br> c() {
      return this.d;
   }

   public static class a {
      private final Builder<dl<bpl>> a = ImmutableList.builder();
      private Optional<br> b = Optional.empty();
      private Optional<br> c = Optional.empty();

      public static bg.a a() {
         return new bg.a();
      }

      public bg.a a(dl<bpl> $$0) {
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
