import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public record eag<FC extends ecx, F extends eat<FC>>(F d, FC e) {
   public static final Codec<eag<?, ?>> a = lp.Q.q().dispatch($$0 -> $$0.d, eat::a);
   public static final Codec<ji<eag<?, ?>>> b = akx.a(lq.aC, a);
   public static final Codec<jm<eag<?, ?>>> c = jx.a(lq.aC, a);

   public boolean a(dco $$0, dtu $$1, azc $$2, iz $$3) {
      return this.d.a(this.e, $$0, $$1, $$2, $$3);
   }

   public Stream<eag<?, ?>> a() {
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
