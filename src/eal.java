import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public record eal<FC extends edc, F extends eay<FC>>(F d, FC e) {
   public static final Codec<eal<?, ?>> a = lp.Q.q().dispatch($$0 -> $$0.d, eay::a);
   public static final Codec<ji<eal<?, ?>>> b = alb.a(lq.aC, a);
   public static final Codec<jm<eal<?, ?>>> c = jx.a(lq.aC, a);

   public boolean a(dct $$0, dtz $$1, azh $$2, iz $$3) {
      return this.d.a(this.e, $$0, $$1, $$2, $$3);
   }

   public Stream<eal<?, ?>> a() {
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
