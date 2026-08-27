import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public record drp<FC extends dug, F extends dsc<FC>>(F d, FC e) {
   public static final Codec<drp<?, ?>> a = kd.Q.q().dispatch($$0 -> $$0.d, dsc::a);
   public static final Codec<ih<drp<?, ?>>> b = ahd.a(ke.aw, a);
   public static final Codec<il<drp<?, ?>>> c = iv.a(ke.aw, a);

   public boolean a(cus $$0, dlm $$1, auw $$2, hx $$3) {
      return this.d.a(this.e, $$0, $$1, $$2, $$3);
   }

   public Stream<drp<?, ?>> a() {
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
