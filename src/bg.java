import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public record bg(List<dm<bqh>> b, Optional<br> c, Optional<br> d) {
   public static final Codec<bg> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               axh.a(dm.a(le.s).listOf(), "tags", List.of()).forGetter(bg::a),
               axh.a(br.a, "direct_entity").forGetter(bg::b),
               axh.a(br.a, "source_entity").forGetter(bg::c)
            )
            .apply($$0, bg::new)
   );

   public boolean a(aqi $$0, bqf $$1) {
      return this.a($$0.z(), $$0.dl(), $$1);
   }

   public boolean a(aqh $$0, etp $$1, bqf $$2) {
      for (dm<bqh> $$3 : this.b) {
         if (!$$3.a($$2.k())) {
            return false;
         }
      }

      return this.c.isPresent() && !this.c.get().a($$0, $$1, $$2.c()) ? false : !this.d.isPresent() || this.d.get().a($$0, $$1, $$2.d());
   }

   public List<dm<bqh>> a() {
      return this.b;
   }

   public Optional<br> b() {
      return this.c;
   }

   public Optional<br> c() {
      return this.d;
   }

   public static class a {
      private final Builder<dm<bqh>> a = ImmutableList.builder();
      private Optional<br> b = Optional.empty();
      private Optional<br> c = Optional.empty();

      public static bg.a a() {
         return new bg.a();
      }

      public bg.a a(dm<bqh> $$0) {
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
