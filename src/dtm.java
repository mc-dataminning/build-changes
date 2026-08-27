import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public record dtm<FC extends dwd, F extends dtz<FC>>(F d, FC e) {
   public static final Codec<dtm<?, ?>> a = kf.Q.q().dispatch($$0 -> $$0.d, dtz::a);
   public static final Codec<ij<dtm<?, ?>>> b = aiu.a(kg.aw, a);
   public static final Codec<in<dtm<?, ?>>> c = ix.a(kg.aw, a);

   public boolean a(cwm $$0, dng $$1, awp $$2, hz $$3) {
      return this.d.a(this.e, $$0, $$1, $$2, $$3);
   }

   public Stream<dtm<?, ?>> a() {
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
