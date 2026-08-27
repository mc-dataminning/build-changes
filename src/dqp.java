import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public record dqp<FC extends dtg, F extends drc<FC>>(F d, FC e) {
   public static final Codec<dqp<?, ?>> a = kb.Q.q().dispatch($$0 -> $$0.d, drc::a);
   public static final Codec<ie<dqp<?, ?>>> b = agp.a(kc.av, a);
   public static final Codec<ij<dqp<?, ?>>> c = it.a(kc.av, a);

   public boolean a(ctt $$0, dkm $$1, auf $$2, hv $$3) {
      return this.d.a(this.e, $$0, $$1, $$2, $$3);
   }

   public Stream<dqp<?, ?>> a() {
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
