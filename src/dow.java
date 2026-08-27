import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public record dow<FC extends drn, F extends dpj<FC>>(F d, FC e) {
   public static final Codec<dow<?, ?>> a = jy.R.q().dispatch($$0 -> $$0.d, dpj::a);
   public static final Codec<ib<dow<?, ?>>> b = agc.a(jz.au, a);
   public static final Codec<ig<dow<?, ?>>> c = iq.a(jz.au, a);

   public boolean a(csm $$0, dit $$1, ato $$2, ht $$3) {
      return this.d.a(this.e, $$0, $$1, $$2, $$3);
   }

   public Stream<dow<?, ?>> a() {
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
