import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public record dra<FC extends dtr, F extends drn<FC>>(F d, FC e) {
   public static final Codec<dra<?, ?>> a = kd.Q.q().dispatch($$0 -> $$0.d, drn::a);
   public static final Codec<ih<dra<?, ?>>> b = agz.a(ke.aw, a);
   public static final Codec<il<dra<?, ?>>> c = iv.a(ke.aw, a);

   public boolean a(cud $$0, dkx $$1, aup $$2, hx $$3) {
      return this.d.a(this.e, $$0, $$1, $$2, $$3);
   }

   public Stream<dra<?, ?>> a() {
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
