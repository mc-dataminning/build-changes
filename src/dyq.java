import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public record dyq<FC extends ebh, F extends dzd<FC>>(F d, FC e) {
   public static final Codec<dyq<?, ?>> a = ld.Q.q().dispatch($$0 -> $$0.d, dzd::a);
   public static final Codec<iw<dyq<?, ?>>> b = akd.a(le.aC, a);
   public static final Codec<ja<dyq<?, ?>>> c = jl.a(le.aC, a);

   public boolean a(day $$0, dse $$1, ayg $$2, in $$3) {
      return this.d.a(this.e, $$0, $$1, $$2, $$3);
   }

   public Stream<dyq<?, ?>> a() {
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
