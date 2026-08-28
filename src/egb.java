import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public record egb<FC extends eit, F extends egp<FC>>(F d, FC e) {
   public static final Codec<egb<?, ?>> a = ma.O.q().dispatch($$0 -> $$0.d, egp::a);
   public static final Codec<jq<egb<?, ?>>> b = all.a(mb.aL, a);
   public static final Codec<ju<egb<?, ?>>> c = kf.a(mb.aL, a);

   public boolean a(dhx $$0, dzk $$1, bac $$2, jh $$3) {
      return this.d.a(this.e, $$0, $$1, $$2, $$3);
   }

   public Stream<egb<?, ?>> a() {
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
