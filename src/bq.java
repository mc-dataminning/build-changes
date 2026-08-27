import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record bq(Optional<Boolean> b, Optional<Boolean> c, Optional<Boolean> d, Optional<Boolean> e, Optional<Boolean> f) {
   public static final Codec<bq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               axu.a(Codec.BOOL, "is_on_fire").forGetter(bq::a),
               axu.a(Codec.BOOL, "is_sneaking").forGetter(bq::b),
               axu.a(Codec.BOOL, "is_sprinting").forGetter(bq::c),
               axu.a(Codec.BOOL, "is_swimming").forGetter(bq::d),
               axu.a(Codec.BOOL, "is_baby").forGetter(bq::e)
            )
            .apply($$0, bq::new)
   );

   public boolean a(brv $$0) {
      if (this.b.isPresent() && $$0.bV() != this.b.get()) {
         return false;
      } else if (this.c.isPresent() && $$0.cf() != this.c.get()) {
         return false;
      } else if (this.d.isPresent() && $$0.cg() != this.d.get()) {
         return false;
      } else if (this.e.isPresent() && $$0.ch() != this.e.get()) {
         return false;
      } else {
         if (this.f.isPresent() && $$0 instanceof bso $$1 && $$1.o_() != this.f.get()) {
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

      public static bq.a a() {
         return new bq.a();
      }

      public bq.a a(Boolean $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public bq.a b(Boolean $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      public bq.a c(Boolean $$0) {
         this.c = Optional.of($$0);
         return this;
      }

      public bq.a d(Boolean $$0) {
         this.d = Optional.of($$0);
         return this;
      }

      public bq.a e(Boolean $$0) {
         this.e = Optional.of($$0);
         return this;
      }

      public bq b() {
         return new bq(this.a, this.b, this.c, this.d, this.e);
      }
   }
}
