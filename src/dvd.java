import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public record dvd<FC extends dxu, F extends dvq<FC>>(F d, FC e) {
   public static final Codec<dvd<?, ?>> a = ki.Q.q().dispatch($$0 -> $$0.d, dvq::a);
   public static final Codec<il<dvd<?, ?>>> b = ajd.a(kj.ax, a);
   public static final Codec<ip<dvd<?, ?>>> c = ja.a(kj.ax, a);

   public boolean a(cxu $$0, dow $$1, axd $$2, ib $$3) {
      return this.d.a(this.e, $$0, $$1, $$2, $$3);
   }

   public Stream<dvd<?, ?>> a() {
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
