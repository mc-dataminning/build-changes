import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public record ear<FC extends edi, F extends ebe<FC>>(F d, FC e) {
   public static final Codec<ear<?, ?>> a = lq.O.r().dispatch($$0 -> $$0.d, ebe::a);
   public static final Codec<jj<ear<?, ?>>> b = akg.a(lr.aH, a);
   public static final Codec<jn<ear<?, ?>>> c = jy.a(lr.aH, a);

   public boolean a(dcz $$0, due $$1, aym $$2, ja $$3) {
      return this.d.a(this.e, $$0, $$1, $$2, $$3);
   }

   public Stream<ear<?, ?>> a() {
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
