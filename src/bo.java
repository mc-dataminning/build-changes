import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record bo(Optional<Boolean> b, Optional<Boolean> c, Optional<Boolean> d, Optional<Boolean> e, Optional<Boolean> f) {
   public static final Codec<bo> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               arb.a(Codec.BOOL, "is_on_fire").forGetter(bo::a),
               arb.a(Codec.BOOL, "is_sneaking").forGetter(bo::b),
               arb.a(Codec.BOOL, "is_sprinting").forGetter(bo::c),
               arb.a(Codec.BOOL, "is_swimming").forGetter(bo::d),
               arb.a(Codec.BOOL, "is_baby").forGetter(bo::e)
            )
            .apply($$0, bo::new)
   );

   public boolean a(bil $$0) {
      if (this.b.isPresent() && $$0.bM() != this.b.get()) {
         return false;
      } else if (this.c.isPresent() && $$0.bW() != this.c.get()) {
         return false;
      } else if (this.d.isPresent() && $$0.bX() != this.d.get()) {
         return false;
      } else if (this.e.isPresent() && $$0.bY() != this.e.get()) {
         return false;
      } else {
         if (this.f.isPresent() && $$0 instanceof bjb $$1 && $$1.i_() != this.f.get()) {
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

      public static bo.a a() {
         return new bo.a();
      }

      public bo.a a(Boolean $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public bo.a b(Boolean $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      public bo.a c(Boolean $$0) {
         this.c = Optional.of($$0);
         return this;
      }

      public bo.a d(Boolean $$0) {
         this.d = Optional.of($$0);
         return this;
      }

      public bo.a e(Boolean $$0) {
         this.e = Optional.of($$0);
         return this;
      }

      public bo b() {
         return new bo(this.a, this.b, this.c, this.d, this.e);
      }
   }
}
