import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public record ebm<FC extends eek, F extends eca<FC>>(F d, FC e) {
   public static final Codec<ebm<?, ?>> a = lh.Q.q().dispatch($$0 -> $$0.d, eca::a);
   public static final Codec<ja<ebm<?, ?>>> b = akp.a(li.aC, a);
   public static final Codec<je<ebm<?, ?>>> c = jp.a(li.aC, a);

   public boolean a(dcv $$0, duz $$1, ayt $$2, ir $$3) {
      return this.d.a(this.e, $$0, $$1, $$2, $$3);
   }

   public Stream<ebm<?, ?>> a() {
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
