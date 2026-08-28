import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public record eam<FC extends edd, F extends eaz<FC>>(F d, FC e) {
   public static final Codec<eam<?, ?>> a = lp.Q.q().dispatch($$0 -> $$0.d, eaz::a);
   public static final Codec<ji<eam<?, ?>>> b = alb.a(lq.aC, a);
   public static final Codec<jm<eam<?, ?>>> c = jx.a(lq.aC, a);

   public boolean a(dcu $$0, dua $$1, azh $$2, iz $$3) {
      return this.d.a(this.e, $$0, $$1, $$2, $$3);
   }

   public Stream<eam<?, ?>> a() {
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
