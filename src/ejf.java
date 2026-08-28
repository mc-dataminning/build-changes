import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public record ejf<FC extends elx, F extends ejt<FC>>(F d, FC e) {
   public static final Codec<ejf<?, ?>> a = mg.O.q().dispatch($$0 -> $$0.d, ejt::a);
   public static final Codec<jf<ejf<?, ?>>> b = alc.a(mh.aL, a);
   public static final Codec<jj<ejf<?, ?>>> c = ju.a(mh.aL, a);

   public boolean a(dkg $$0, ecm $$1, azv $$2, iv $$3) {
      return this.d.a(this.e, $$0, $$1, $$2, $$3);
   }

   public Stream<ejf<?, ?>> a() {
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
