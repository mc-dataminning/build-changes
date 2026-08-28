import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public record eay<FC extends edp, F extends ebl<FC>>(F d, FC e) {
   public static final Codec<eay<?, ?>> a = lq.O.r().dispatch($$0 -> $$0.d, ebl::a);
   public static final Codec<jj<eay<?, ?>>> b = akg.a(lr.aH, a);
   public static final Codec<jn<eay<?, ?>>> c = jy.a(lr.aH, a);

   public boolean a(ddc $$0, dui $$1, ayo $$2, ja $$3) {
      return this.d.a(this.e, $$0, $$1, $$2, $$3);
   }

   public Stream<eay<?, ?>> a() {
      return Stream.concat(Stream.of(this), this.e.e());
   }

   @Override
   public String toString() {
      return "Configured: " + this.d + ": " + this.e;
   }

   public F b() {
      return this.d;
   }

   public FC c() {
      return this.e;
   }
}
