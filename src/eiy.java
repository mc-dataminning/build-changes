import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public record eiy<FC extends elq, F extends ejm<FC>>(F d, FC e) {
   public static final Codec<eiy<?, ?>> a = mf.O.q().dispatch($$0 -> $$0.d, ejm::a);
   public static final Codec<je<eiy<?, ?>>> b = alc.a(mg.aL, a);
   public static final Codec<ji<eiy<?, ?>>> c = jt.a(mg.aL, a);

   public boolean a(djz $$0, ecf $$1, azv $$2, iu $$3) {
      return this.d.a(this.e, $$0, $$1, $$2, $$3);
   }

   public Stream<eiy<?, ?>> a() {
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
