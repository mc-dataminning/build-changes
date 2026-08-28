import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public record bj(List<ea<bqy>> b, Optional<bu> c, Optional<bu> d) {
   public static final Codec<bj> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ea.a(lr.s).listOf().optionalFieldOf("tags", List.of()).forGetter(bj::a),
               bu.a.optionalFieldOf("direct_entity").forGetter(bj::b),
               bu.a.optionalFieldOf("source_entity").forGetter(bj::c)
            )
            .apply($$0, bj::new)
   );

   public boolean a(aql $$0, bqw $$1) {
      return this.a($$0.z(), $$0.dn(), $$1);
   }

   public boolean a(aqk $$0, evz $$1, bqw $$2) {
      for (ea<bqy> $$3 : this.b) {
         if (!$$3.a($$2.k())) {
            return false;
         }
      }

      return this.c.isPresent() && !this.c.get().a($$0, $$1, $$2.c()) ? false : !this.d.isPresent() || this.d.get().a($$0, $$1, $$2.d());
   }

   public List<ea<bqy>> a() {
      return this.b;
   }

   public Optional<bu> b() {
      return this.c;
   }

   public Optional<bu> c() {
      return this.d;
   }

   public static class a {
      private final Builder<ea<bqy>> a = ImmutableList.builder();
      private Optional<bu> b = Optional.empty();
      private Optional<bu> c = Optional.empty();

      public static bj.a a() {
         return new bj.a();
      }

      public bj.a a(ea<bqy> $$0) {
         this.a.add($$0);
         return this;
      }

      public bj.a a(bu.a $$0) {
         this.b = Optional.of($$0.b());
         return this;
      }

      public bj.a b(bu.a $$0) {
         this.c = Optional.of($$0.b());
         return this;
      }

      public bj b() {
         return new bj(this.a.build(), this.b, this.c);
      }
   }
}
