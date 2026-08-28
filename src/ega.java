import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public record ega<FC extends eis, F extends ego<FC>>(F d, FC e) {
   public static final Codec<ega<?, ?>> a = ma.O.q().dispatch($$0 -> $$0.d, ego::a);
   public static final Codec<jq<ega<?, ?>>> b = alv.a(mb.aK, a);
   public static final Codec<ju<ega<?, ?>>> c = kf.a(mb.aK, a);

   public boolean a(dhy $$0, dzj $$1, bam $$2, jh $$3) {
      return this.d.a(this.e, $$0, $$1, $$2, $$3);
   }

   public Stream<ega<?, ?>> a() {
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
