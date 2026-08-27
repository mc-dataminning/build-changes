import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public record dvf<FC extends dxw, F extends dvs<FC>>(F d, FC e) {
   public static final Codec<dvf<?, ?>> a = ki.Q.q().dispatch($$0 -> $$0.d, dvs::a);
   public static final Codec<il<dvf<?, ?>>> b = ajd.a(kj.ax, a);
   public static final Codec<ip<dvf<?, ?>>> c = ja.a(kj.ax, a);

   public boolean a(cxw $$0, doy $$1, axd $$2, ib $$3) {
      return this.d.a(this.e, $$0, $$1, $$2, $$3);
   }

   public Stream<dvf<?, ?>> a() {
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
