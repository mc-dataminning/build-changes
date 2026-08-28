import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public record egi<FC extends eja, F extends egw<FC>>(F d, FC e) {
   public static final Codec<egi<?, ?>> a = ma.O.q().dispatch($$0 -> $$0.d, egw::a);
   public static final Codec<jq<egi<?, ?>>> b = alv.a(mb.aL, a);
   public static final Codec<ju<egi<?, ?>>> c = kf.a(mb.aL, a);

   public boolean a(dig $$0, dzr $$1, bam $$2, jh $$3) {
      return this.d.a(this.e, $$0, $$1, $$2, $$3);
   }

   public Stream<egi<?, ?>> a() {
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
