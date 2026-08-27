import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public record dna<FC extends dpr, F extends dnn<FC>>(F d, FC e) {
   public static final Codec<dna<?, ?>> a = jb.R.q().dispatch($$0 -> $$0.d, dnn::a);
   public static final Codec<he<dna<?, ?>>> b = aen.a(jc.as, a);
   public static final Codec<hi<dna<?, ?>>> c = ht.a(jc.as, a);

   public boolean a(cqg $$0, dgx $$1, aru $$2, gu $$3) {
      return this.d.a(this.e, $$0, $$1, $$2, $$3);
   }

   public Stream<dna<?, ?>> a() {
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
