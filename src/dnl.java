import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public record dnl<FC extends dqc, F extends dny<FC>>(F d, FC e) {
   public static final Codec<dnl<?, ?>> a = jd.R.q().dispatch($$0 -> $$0.d, dny::a);
   public static final Codec<hg<dnl<?, ?>>> b = aeu.a(je.as, a);
   public static final Codec<hk<dnl<?, ?>>> c = hv.a(je.as, a);

   public boolean a(cqr $$0, dhi $$1, ase $$2, gw $$3) {
      return this.d.a(this.e, $$0, $$1, $$2, $$3);
   }

   public Stream<dnl<?, ?>> a() {
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
