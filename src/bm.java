import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record bm(Optional<Boolean> b, Optional<Boolean> c, Optional<Boolean> d, Optional<Boolean> e, Optional<Boolean> f) {
   public static final Codec<bm> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               aqy.a(Codec.BOOL, "is_on_fire").forGetter(bm::a),
               aqy.a(Codec.BOOL, "is_sneaking").forGetter(bm::b),
               aqy.a(Codec.BOOL, "is_sprinting").forGetter(bm::c),
               aqy.a(Codec.BOOL, "is_swimming").forGetter(bm::d),
               aqy.a(Codec.BOOL, "is_baby").forGetter(bm::e)
            )
            .apply($$0, bm::new)
   );

   static Optional<bm> a(Optional<Boolean> $$0, Optional<Boolean> $$1, Optional<Boolean> $$2, Optional<Boolean> $$3, Optional<Boolean> $$4) {
      return $$0.isEmpty() && $$1.isEmpty() && $$2.isEmpty() && $$3.isEmpty() && $$4.isEmpty()
         ? Optional.empty()
         : Optional.of(new bm($$0, $$1, $$2, $$3, $$4));
   }

   public boolean a(bii $$0) {
      if (this.b.isPresent() && $$0.bM() != this.b.get()) {
         return false;
      } else if (this.c.isPresent() && $$0.bW() != this.c.get()) {
         return false;
      } else if (this.d.isPresent() && $$0.bX() != this.d.get()) {
         return false;
      } else if (this.e.isPresent() && $$0.bY() != this.e.get()) {
         return false;
      } else {
         if (this.f.isPresent() && $$0 instanceof biy $$1 && $$1.i_() != this.f.get()) {
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

      public static bm.a a() {
         return new bm.a();
      }

      public bm.a a(Boolean $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public bm.a b(Boolean $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      public bm.a c(Boolean $$0) {
         this.c = Optional.of($$0);
         return this;
      }

      public bm.a d(Boolean $$0) {
         this.d = Optional.of($$0);
         return this;
      }

      public bm.a e(Boolean $$0) {
         this.e = Optional.of($$0);
         return this;
      }

      public Optional<bm> b() {
         return bm.a(this.a, this.b, this.c, this.d, this.e);
      }
   }
}
