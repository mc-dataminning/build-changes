import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public record ejk<FC extends emc, F extends ejy<FC>>(F d, FC e) {
   public static final Codec<ejk<?, ?>> a = mg.O.q().dispatch($$0 -> $$0.d, ejy::a);
   public static final Codec<jf<ejk<?, ?>>> b = alc.a(mh.aL, a);
   public static final Codec<jj<ejk<?, ?>>> c = ju.a(mh.aL, a);

   public boolean a(dkl $$0, ecr $$1, azv $$2, iv $$3) {
      return this.d.a(this.e, $$0, $$1, $$2, $$3);
   }

   public Stream<ejk<?, ?>> a() {
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
