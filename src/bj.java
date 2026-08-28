import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public record bj(List<ea<brb>> b, Optional<bu> c, Optional<bu> d, Optional<Boolean> e) {
   public static final Codec<bj> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ea.a(lr.s).listOf().optionalFieldOf("tags", List.of()).forGetter(bj::a),
               bu.a.optionalFieldOf("direct_entity").forGetter(bj::b),
               bu.a.optionalFieldOf("source_entity").forGetter(bj::c),
               Codec.BOOL.optionalFieldOf("is_direct").forGetter(bj::d)
            )
            .apply($$0, bj::new)
   );

   public boolean a(aqn $$0, bqz $$1) {
      return this.a($$0.z(), $$0.do(), $$1);
   }

   public boolean a(aqm $$0, ewf $$1, bqz $$2) {
      for (ea<brb> $$3 : this.b) {
         if (!$$3.a($$2.k())) {
            return false;
         }
      }

      if (this.c.isPresent() && !this.c.get().a($$0, $$1, $$2.c())) {
         return false;
      } else {
         return this.d.isPresent() && !this.d.get().a($$0, $$1, $$2.d()) ? false : !this.e.isPresent() || this.e.get() == $$2.b();
      }
   }

   public List<ea<brb>> a() {
      return this.b;
   }

   public Optional<bu> b() {
      return this.c;
   }

   public Optional<bu> c() {
      return this.d;
   }

   public Optional<Boolean> d() {
      return this.e;
   }

   public static class a {
      private final Builder<ea<brb>> a = ImmutableList.builder();
      private Optional<bu> b = Optional.empty();
      private Optional<bu> c = Optional.empty();
      private Optional<Boolean> d = Optional.empty();

      public static bj.a a() {
         return new bj.a();
      }

      public bj.a a(ea<brb> $$0) {
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

      public bj.a a(boolean $$0) {
         this.d = Optional.of($$0);
         return this;
      }

      public bj b() {
         return new bj(this.a.build(), this.b, this.c, this.d);
      }
   }
}
