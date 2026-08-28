import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public record edc<FC extends efu, F extends edq<FC>>(F d, FC e) {
   public static final Codec<edc<?, ?>> a = lu.O.q().dispatch($$0 -> $$0.d, edq::a);
   public static final Codec<jn<edc<?, ?>>> b = aky.a(lv.aJ, a);
   public static final Codec<jr<edc<?, ?>>> c = kc.a(lv.aJ, a);

   public boolean a(dfd $$0, dwl $$1, azl $$2, je $$3) {
      return this.d.a(this.e, $$0, $$1, $$2, $$3);
   }

   public Stream<edc<?, ?>> a() {
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
