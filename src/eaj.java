import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public record eaj<FC extends eda, F extends eaw<FC>>(F d, FC e) {
   public static final Codec<eaj<?, ?>> a = lp.Q.q().dispatch($$0 -> $$0.d, eaw::a);
   public static final Codec<ji<eaj<?, ?>>> b = ala.a(lq.aC, a);
   public static final Codec<jm<eaj<?, ?>>> c = jx.a(lq.aC, a);

   public boolean a(dcr $$0, dtx $$1, azf $$2, iz $$3) {
      return this.d.a(this.e, $$0, $$1, $$2, $$3);
   }

   public Stream<eaj<?, ?>> a() {
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
