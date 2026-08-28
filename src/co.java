import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.Predicate;

public record co(co.a c) implements dx<cyl> {
   public static final Codec<co> a = co.a.a.xmap(co::new, co::b);

   @Override
   public kr<cyl> a() {
      return ks.Z;
   }

   public boolean a(cvs $$0, cyl $$1) {
      return this.c.a($$1);
   }

   public co.a b() {
      return this.c;
   }

   public static record a(Optional<cyl.a> b, Optional<Boolean> c, Optional<Boolean> d) implements Predicate<cyl> {
      public static final Codec<co.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  cyl.a.g.optionalFieldOf("shape").forGetter(co.a::a),
                  Codec.BOOL.optionalFieldOf("has_twinkle").forGetter(co.a::b),
                  Codec.BOOL.optionalFieldOf("has_trail").forGetter(co.a::c)
               )
               .apply($$0, co.a::new)
      );

      public boolean a(cyl $$0) {
         if (this.b.isPresent() && this.b.get() != $$0.a()) {
            return false;
         } else {
            return this.c.isPresent() && this.c.get() != $$0.e() ? false : !this.d.isPresent() || this.d.get() == $$0.d();
         }
      }

      public Optional<cyl.a> a() {
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
