import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public record efk<FC extends eic, F extends efy<FC>>(F d, FC e) {
   public static final Codec<efk<?, ?>> a = mb.O.q().dispatch($$0 -> $$0.d, efy::a);
   public static final Codec<jr<efk<?, ?>>> b = akr.a(mc.aL, a);
   public static final Codec<jv<efk<?, ?>>> c = kg.a(mc.aL, a);

   public boolean a(dhg $$0, dyt $$1, azh $$2, ji $$3) {
      return this.d.a(this.e, $$0, $$1, $$2, $$3);
   }

   public Stream<efk<?, ?>> a() {
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
