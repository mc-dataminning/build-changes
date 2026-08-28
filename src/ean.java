import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public record ean<FC extends ede, F extends eba<FC>>(F d, FC e) {
   public static final Codec<ean<?, ?>> a = lp.Q.q().dispatch($$0 -> $$0.d, eba::a);
   public static final Codec<ji<ean<?, ?>>> b = alb.a(lq.aC, a);
   public static final Codec<jm<ean<?, ?>>> c = jx.a(lq.aC, a);

   public boolean a(dcv $$0, dub $$1, azh $$2, iz $$3) {
      return this.d.a(this.e, $$0, $$1, $$2, $$3);
   }

   public Stream<ean<?, ?>> a() {
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
