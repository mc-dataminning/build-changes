import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public record dtf<FC extends dvw, F extends dts<FC>>(F d, FC e) {
   public static final Codec<dtf<?, ?>> a = kf.Q.q().dispatch($$0 -> $$0.d, dts::a);
   public static final Codec<ij<dtf<?, ?>>> b = aiu.a(kg.aw, a);
   public static final Codec<in<dtf<?, ?>>> c = ix.a(kg.aw, a);

   public boolean a(cwi $$0, dnc $$1, awo $$2, hz $$3) {
      return this.d.a(this.e, $$0, $$1, $$2, $$3);
   }

   public Stream<dtf<?, ?>> a() {
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
