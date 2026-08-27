import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public record dxr<FC extends eai, F extends dye<FC>>(F d, FC e) {
   public static final Codec<dxr<?, ?>> a = kt.Q.q().dispatch($$0 -> $$0.d, dye::a);
   public static final Codec<in<dxr<?, ?>>> b = ajr.a(ku.az, a);
   public static final Codec<ir<dxr<?, ?>>> c = jc.a(ku.az, a);

   public boolean a(dab $$0, drf $$1, axt $$2, id $$3) {
      return this.d.a(this.e, $$0, $$1, $$2, $$3);
   }

   public Stream<dxr<?, ?>> a() {
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
