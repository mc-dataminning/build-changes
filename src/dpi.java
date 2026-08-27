import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public record dpi<FC extends drz, F extends dpv<FC>>(F d, FC e) {
   public static final Codec<dpi<?, ?>> a = jy.R.q().dispatch($$0 -> $$0.d, dpv::a);
   public static final Codec<ib<dpi<?, ?>>> b = age.a(jz.au, a);
   public static final Codec<ig<dpi<?, ?>>> c = iq.a(jz.au, a);

   public boolean a(csu $$0, djf $$1, ats $$2, ht $$3) {
      return this.d.a(this.e, $$0, $$1, $$2, $$3);
   }

   public Stream<dpi<?, ?>> a() {
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
