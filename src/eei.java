import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public record eei<FC extends eha, F extends eew<FC>>(F d, FC e) {
   public static final Codec<eei<?, ?>> a = lz.O.q().dispatch($$0 -> $$0.d, eew::a);
   public static final Codec<jq<eei<?, ?>>> b = alf.a(ma.aJ, a);
   public static final Codec<ju<eei<?, ?>>> c = kf.a(ma.aJ, a);

   public boolean a(dgk $$0, dxr $$1, azu $$2, jh $$3) {
      return this.d.a(this.e, $$0, $$1, $$2, $$3);
   }

   public Stream<eei<?, ?>> a() {
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
