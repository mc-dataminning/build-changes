import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public record drg<FC extends dtx, F extends drt<FC>>(F d, FC e) {
   public static final Codec<drg<?, ?>> a = kd.Q.q().dispatch($$0 -> $$0.d, drt::a);
   public static final Codec<ih<drg<?, ?>>> b = ahc.a(ke.aw, a);
   public static final Codec<il<drg<?, ?>>> c = iv.a(ke.aw, a);

   public boolean a(cuj $$0, dld $$1, auu $$2, hx $$3) {
      return this.d.a(this.e, $$0, $$1, $$2, $$3);
   }

   public Stream<drg<?, ?>> a() {
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
