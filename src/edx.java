import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public record edx<FC extends egp, F extends eel<FC>>(F d, FC e) {
   public static final Codec<edx<?, ?>> a = ly.O.q().dispatch($$0 -> $$0.d, eel::a);
   public static final Codec<jq<edx<?, ?>>> b = ale.a(lz.aJ, a);
   public static final Codec<ju<edx<?, ?>>> c = kf.a(lz.aJ, a);

   public boolean a(dfy $$0, dxg $$1, azs $$2, jh $$3) {
      return this.d.a(this.e, $$0, $$1, $$2, $$3);
   }

   public Stream<edx<?, ?>> a() {
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
