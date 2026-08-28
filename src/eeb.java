import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public record eeb<FC extends egt, F extends eep<FC>>(F d, FC e) {
   public static final Codec<eeb<?, ?>> a = lz.O.q().dispatch($$0 -> $$0.d, eep::a);
   public static final Codec<jq<eeb<?, ?>>> b = alh.a(ma.aJ, a);
   public static final Codec<ju<eeb<?, ?>>> c = kf.a(ma.aJ, a);

   public boolean a(dgd $$0, dxk $$1, azv $$2, jh $$3) {
      return this.d.a(this.e, $$0, $$1, $$2, $$3);
   }

   public Stream<eeb<?, ?>> a() {
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
