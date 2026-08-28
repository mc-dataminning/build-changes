import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public record ejx<FC extends emr, F extends ekm<FC>>(F d, FC e) {
   public static final Codec<ejx<?, ?>> a = mh.O.q().dispatch($$0 -> $$0.d, ekm::a);
   public static final Codec<jg<ejx<?, ?>>> b = alg.a(mi.aL, a);
   public static final Codec<jk<ejx<?, ?>>> c = jv.a(mi.aL, a);

   public boolean a(dky $$0, ede $$1, azz $$2, iw $$3) {
      return this.d.a(this.e, $$0, $$1, $$2, $$3);
   }

   public Stream<ejx<?, ?>> a() {
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
