import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record bp(Optional<Boolean> b, Optional<Boolean> c, Optional<Boolean> d, Optional<Boolean> e, Optional<Boolean> f) {
   public static final Codec<bp> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               avp.a(Codec.BOOL, "is_on_fire").forGetter(bp::a),
               avp.a(Codec.BOOL, "is_sneaking").forGetter(bp::b),
               avp.a(Codec.BOOL, "is_sprinting").forGetter(bp::c),
               avp.a(Codec.BOOL, "is_swimming").forGetter(bp::d),
               avp.a(Codec.BOOL, "is_baby").forGetter(bp::e)
            )
            .apply($$0, bp::new)
   );

   public boolean a(bno $$0) {
      if (this.b.isPresent() && $$0.bN() != this.b.get()) {
         return false;
      } else if (this.c.isPresent() && $$0.bX() != this.c.get()) {
         return false;
      } else if (this.d.isPresent() && $$0.bY() != this.d.get()) {
         return false;
      } else if (this.e.isPresent() && $$0.bZ() != this.e.get()) {
         return false;
      } else {
         if (this.f.isPresent() && $$0 instanceof bog $$1 && $$1.o_() != this.f.get()) {
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

      public static bp.a a() {
         return new bp.a();
      }

      public bp.a a(Boolean $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public bp.a b(Boolean $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      public bp.a c(Boolean $$0) {
         this.c = Optional.of($$0);
         return this;
      }

      public bp.a d(Boolean $$0) {
         this.d = Optional.of($$0);
         return this;
      }

      public bp.a e(Boolean $$0) {
         this.e = Optional.of($$0);
         return this;
      }

      public bp b() {
         return new bp(this.a, this.b, this.c, this.d, this.e);
      }
   }
}
