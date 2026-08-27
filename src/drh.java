import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public record drh<FC extends dty, F extends dru<FC>>(F d, FC e) {
   public static final Codec<drh<?, ?>> a = kd.Q.q().dispatch($$0 -> $$0.d, dru::a);
   public static final Codec<ih<drh<?, ?>>> b = ahc.a(ke.aw, a);
   public static final Codec<il<drh<?, ?>>> c = iv.a(ke.aw, a);

   public boolean a(cuk $$0, dle $$1, auv $$2, hx $$3) {
      return this.d.a(this.e, $$0, $$1, $$2, $$3);
   }

   public Stream<drh<?, ?>> a() {
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
