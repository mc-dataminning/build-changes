import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public record bn(List<dt<buz>> b, Optional<by> c, Optional<by> d, Optional<Boolean> e) {
   public static final Codec<bn> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dt.a(mh.aN).listOf().optionalFieldOf("tags", List.of()).forGetter(bn::a),
               by.a.optionalFieldOf("direct_entity").forGetter(bn::b),
               by.a.optionalFieldOf("source_entity").forGetter(bn::c),
               Codec.BOOL.optionalFieldOf("is_direct").forGetter(bn::d)
            )
            .apply($$0, bn::new)
   );

   public boolean a(arr $$0, bux $$1) {
      return this.a($$0.y(), $$0.ds(), $$1);
   }

   public boolean a(arq $$0, ffc $$1, bux $$2) {
      for (dt<buz> $$3 : this.b) {
         if (!$$3.a($$2.l())) {
            return false;
         }
      }

      if (this.c.isPresent() && !this.c.get().a($$0, $$1, $$2.c())) {
         return false;
      } else {
         return this.d.isPresent() && !this.d.get().a($$0, $$1, $$2.d()) ? false : !this.e.isPresent() || this.e.get() == $$2.b();
      }
   }

   public List<dt<buz>> a() {
      return this.b;
   }

   public Optional<by> b() {
      return this.c;
   }

   public Optional<by> c() {
      return this.d;
   }

   public Optional<Boolean> d() {
      return this.e;
   }

   public static class a {
      private final Builder<dt<buz>> a = ImmutableList.builder();
      private Optional<by> b = Optional.empty();
      private Optional<by> c = Optional.empty();
      private Optional<Boolean> d = Optional.empty();

      public static bn.a a() {
         return new bn.a();
      }

      public bn.a a(dt<buz> $$0) {
         this.a.add($$0);
         return this;
      }

      public bn.a a(by.a $$0) {
         this.b = Optional.of($$0.b());
         return this;
      }

      public bn.a b(by.a $$0) {
         this.c = Optional.of($$0.b());
         return this;
      }

      public bn.a a(boolean $$0) {
         this.d = Optional.of($$0);
         return this;
      }

      public bn b() {
         return new bn(this.a.build(), this.b, this.c, this.d);
      }
   }
}
