import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.Predicate;

public record co(co.a c) implements dw<cyi> {
   public static final Codec<co> a = co.a.a.xmap(co::new, co::b);

   @Override
   public kq<cyi> a() {
      return kr.Z;
   }

   public boolean a(cvp $$0, cyi $$1) {
      return this.c.a($$1);
   }

   public co.a b() {
      return this.c;
   }

   public static record a(Optional<cyi.a> b, Optional<Boolean> c, Optional<Boolean> d) implements Predicate<cyi> {
      public static final Codec<co.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  cyi.a.g.optionalFieldOf("shape").forGetter(co.a::a),
                  Codec.BOOL.optionalFieldOf("has_twinkle").forGetter(co.a::b),
                  Codec.BOOL.optionalFieldOf("has_trail").forGetter(co.a::c)
               )
               .apply($$0, co.a::new)
      );

      public boolean a(cyi $$0) {
         if (this.b.isPresent() && this.b.get() != $$0.a()) {
            return false;
         } else {
            return this.c.isPresent() && this.c.get() != $$0.e() ? false : !this.d.isPresent() || this.d.get() == $$0.d();
         }
      }

      public Optional<cyi.a> a() {
         return this.b;
      }

      public Optional<Boolean> b() {
         return this.c;
      }

      public Optional<Boolean> c() {
         return this.d;
      }
   }
}
