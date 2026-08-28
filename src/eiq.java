import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public record eiq<FC extends eli, F extends eje<FC>>(F d, FC e) {
   public static final Codec<eiq<?, ?>> a = mf.O.q().dispatch($$0 -> $$0.d, eje::a);
   public static final Codec<je<eiq<?, ?>>> b = alc.a(mg.aK, a);
   public static final Codec<ji<eiq<?, ?>>> c = jt.a(mg.aK, a);

   public boolean a(dju $$0, ebx $$1, azv $$2, iu $$3) {
      return this.d.a(this.e, $$0, $$1, $$2, $$3);
   }

   public Stream<eiq<?, ?>> a() {
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
