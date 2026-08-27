import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public record dnd<FC extends dpu, F extends dnq<FC>>(F d, FC e) {
   public static final Codec<dnd<?, ?>> a = jb.R.q().dispatch($$0 -> $$0.d, dnq::a);
   public static final Codec<he<dnd<?, ?>>> b = aev.a(jc.at, a);
   public static final Codec<hi<dnd<?, ?>>> c = hs.a(jc.at, a);

   public boolean a(cqv $$0, dha $$1, ash $$2, gw $$3) {
      return this.d.a(this.e, $$0, $$1, $$2, $$3);
   }

   public Stream<dnd<?, ?>> a() {
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
