import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public record bg(List<dn<bqp>> b, Optional<br> c, Optional<br> d) {
   public static final Codec<bg> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dn.a(lf.s).listOf().optionalFieldOf("tags", List.of()).forGetter(bg::a),
               br.a.optionalFieldOf("direct_entity").forGetter(bg::b),
               br.a.optionalFieldOf("source_entity").forGetter(bg::c)
            )
            .apply($$0, bg::new)
   );

   public boolean a(aqn $$0, bqn $$1) {
      return this.a($$0.z(), $$0.dn(), $$1);
   }

   public boolean a(aqm $$0, euk $$1, bqn $$2) {
      for (dn<bqp> $$3 : this.b) {
         if (!$$3.a($$2.k())) {
            return false;
         }
      }

      return this.c.isPresent() && !this.c.get().a($$0, $$1, $$2.c()) ? false : !this.d.isPresent() || this.d.get().a($$0, $$1, $$2.d());
   }

   public List<dn<bqp>> a() {
      return this.b;
   }

   public Optional<br> b() {
      return this.c;
   }

   public Optional<br> c() {
      return this.d;
   }

   public static class a {
      private final Builder<dn<bqp>> a = ImmutableList.builder();
      private Optional<br> b = Optional.empty();
      private Optional<br> c = Optional.empty();

      public static bg.a a() {
         return new bg.a();
      }

      public bg.a a(dn<bqp> $$0) {
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
