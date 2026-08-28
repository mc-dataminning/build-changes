import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public record efj<FC extends eib, F extends efx<FC>>(F d, FC e) {
   public static final Codec<efj<?, ?>> a = mb.O.q().dispatch($$0 -> $$0.d, efx::a);
   public static final Codec<jr<efj<?, ?>>> b = akr.a(mc.aL, a);
   public static final Codec<jv<efj<?, ?>>> c = kg.a(mc.aL, a);

   public boolean a(dhf $$0, dys $$1, azh $$2, ji $$3) {
      return this.d.a(this.e, $$0, $$1, $$2, $$3);
   }

   public Stream<efj<?, ?>> a() {
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
