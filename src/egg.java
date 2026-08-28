import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public record egg<FC extends eiy, F extends egu<FC>>(F d, FC e) {
   public static final Codec<egg<?, ?>> a = mb.O.q().dispatch($$0 -> $$0.d, egu::a);
   public static final Codec<jr<egg<?, ?>>> b = akq.a(mc.aM, a);
   public static final Codec<jv<egg<?, ?>>> c = kg.a(mc.aM, a);

   public boolean a(dhy $$0, dzn $$1, azh $$2, ji $$3) {
      return this.d.a(this.e, $$0, $$1, $$2, $$3);
   }

   public Stream<egg<?, ?>> a() {
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
