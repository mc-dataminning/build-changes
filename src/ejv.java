import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public record ejv<FC extends emp, F extends ekk<FC>>(F d, FC e) {
   public static final Codec<ejv<?, ?>> a = mg.O.q().dispatch($$0 -> $$0.d, ekk::a);
   public static final Codec<jf<ejv<?, ?>>> b = ale.a(mh.aL, a);
   public static final Codec<jj<ejv<?, ?>>> c = ju.a(mh.aL, a);

   public boolean a(dkw $$0, edc $$1, azx $$2, iv $$3) {
      return this.d.a(this.e, $$0, $$1, $$2, $$3);
   }

   public Stream<ejv<?, ?>> a() {
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
