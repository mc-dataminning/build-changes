import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public record dpn<FC extends dse, F extends dqa<FC>>(F d, FC e) {
   public static final Codec<dpn<?, ?>> a = kc.R.q().dispatch($$0 -> $$0.d, dqa::a);
   public static final Codec<ig<dpn<?, ?>>> b = agi.a(kd.au, a);
   public static final Codec<ik<dpn<?, ?>>> c = iu.a(kd.au, a);

   public boolean a(csz $$0, djk $$1, atw $$2, hx $$3) {
      return this.d.a(this.e, $$0, $$1, $$2, $$3);
   }

   public Stream<dpn<?, ?>> a() {
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
