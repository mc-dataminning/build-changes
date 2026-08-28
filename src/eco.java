import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public record eco<FC extends efg, F extends edc<FC>>(F d, FC e) {
   public static final Codec<eco<?, ?>> a = lu.O.q().dispatch($$0 -> $$0.d, edc::a);
   public static final Codec<jn<eco<?, ?>>> b = akx.a(lv.aI, a);
   public static final Codec<jr<eco<?, ?>>> c = kc.a(lv.aI, a);

   public boolean a(dep $$0, dvx $$1, azk $$2, je $$3) {
      return this.d.a(this.e, $$0, $$1, $$2, $$3);
   }

   public Stream<eco<?, ?>> a() {
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
