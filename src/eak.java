import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public record eak<FC extends edb, F extends eax<FC>>(F d, FC e) {
   public static final Codec<eak<?, ?>> a = lp.Q.q().dispatch($$0 -> $$0.d, eax::a);
   public static final Codec<ji<eak<?, ?>>> b = ala.a(lq.aC, a);
   public static final Codec<jm<eak<?, ?>>> c = jx.a(lq.aC, a);

   public boolean a(dcs $$0, dty $$1, azg $$2, iz $$3) {
      return this.d.a(this.e, $$0, $$1, $$2, $$3);
   }

   public Stream<eak<?, ?>> a() {
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
