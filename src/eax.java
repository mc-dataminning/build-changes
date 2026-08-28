import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public record eax<FC extends edo, F extends ebk<FC>>(F d, FC e) {
   public static final Codec<eax<?, ?>> a = lq.O.r().dispatch($$0 -> $$0.d, ebk::a);
   public static final Codec<jj<eax<?, ?>>> b = akg.a(lr.aH, a);
   public static final Codec<jn<eax<?, ?>>> c = jy.a(lr.aH, a);

   public boolean a(ddb $$0, duh $$1, ayo $$2, ja $$3) {
      return this.d.a(this.e, $$0, $$1, $$2, $$3);
   }

   public Stream<eax<?, ?>> a() {
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
