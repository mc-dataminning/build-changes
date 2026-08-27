import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record bn(Optional<Boolean> b, Optional<Boolean> c, Optional<Boolean> d, Optional<Boolean> e, Optional<Boolean> f) {
   public static final Codec<bn> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               atq.a(Codec.BOOL, "is_on_fire").forGetter(bn::a),
               atq.a(Codec.BOOL, "is_sneaking").forGetter(bn::b),
               atq.a(Codec.BOOL, "is_sprinting").forGetter(bn::c),
               atq.a(Codec.BOOL, "is_swimming").forGetter(bn::d),
               atq.a(Codec.BOOL, "is_baby").forGetter(bn::e)
            )
            .apply($$0, bn::new)
   );

   public boolean a(blp $$0) {
      if (this.b.isPresent() && $$0.bN() != this.b.get()) {
         return false;
      } else if (this.c.isPresent() && $$0.bX() != this.c.get()) {
         return false;
      } else if (this.d.isPresent() && $$0.bY() != this.d.get()) {
         return false;
      } else if (this.e.isPresent() && $$0.bZ() != this.e.get()) {
         return false;
      } else {
         if (this.f.isPresent() && $$0 instanceof bmf $$1 && $$1.o_() != this.f.get()) {
            return false;
         }

         return true;
      }
   }

   public Optional<Boolean> a() {
      return this.b;
   }

   public Optional<Boolean> b() {
      return this.c;
   }

   public Optional<Boolean> c() {
      return this.d;
   }

   public Optional<Boolean> d() {
      return this.e;
   }

   public Optional<Boolean> e() {
      return this.f;
   }

   public static class a {
      private Optional<Boolean> a = Optional.empty();
      private Optional<Boolean> b = Optional.empty();
      private Optional<Boolean> c = Optional.empty();
      private Optional<Boolean> d = Optional.empty();
      private Optional<Boolean> e = Optional.empty();

      public static bn.a a() {
         return new bn.a();
      }

      public bn.a a(Boolean $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public bn.a b(Boolean $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      public bn.a c(Boolean $$0) {
         this.c = Optional.of($$0);
         return this;
      }

      public bn.a d(Boolean $$0) {
         this.d = Optional.of($$0);
         return this;
      }

      public bn.a e(Boolean $$0) {
         this.e = Optional.of($$0);
         return this;
      }

      public bn b() {
         return new bn(this.a, this.b, this.c, this.d, this.e);
      }
   }
}
