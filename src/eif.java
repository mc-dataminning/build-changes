import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public record eif<FC extends ekx, F extends eit<FC>>(F d, FC e) {
   public static final Codec<eif<?, ?>> a = mf.O.q().dispatch($$0 -> $$0.d, eit::a);
   public static final Codec<je<eif<?, ?>>> b = ala.a(mg.aK, a);
   public static final Codec<ji<eif<?, ?>>> c = jt.a(mg.aK, a);

   public boolean a(djo $$0, ebm $$1, azt $$2, iu $$3) {
      return this.d.a(this.e, $$0, $$1, $$2, $$3);
   }

   public Stream<eif<?, ?>> a() {
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
