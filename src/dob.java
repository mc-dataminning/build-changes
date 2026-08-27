import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public record dob<FC extends dqs, F extends doo<FC>>(F d, FC e) {
   public static final Codec<dob<?, ?>> a = jy.R.q().dispatch($$0 -> $$0.d, doo::a);
   public static final Codec<ib<dob<?, ?>>> b = afs.a(jz.at, a);
   public static final Codec<ig<dob<?, ?>>> c = iq.a(jz.at, a);

   public boolean a(crt $$0, dhy $$1, ate $$2, ht $$3) {
      return this.d.a(this.e, $$0, $$1, $$2, $$3);
   }

   public Stream<dob<?, ?>> a() {
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
