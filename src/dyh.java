import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public record dyh<FC extends eay, F extends dyu<FC>>(F d, FC e) {
   public static final Codec<dyh<?, ?>> a = lc.Q.q().dispatch($$0 -> $$0.d, dyu::a);
   public static final Codec<iv<dyh<?, ?>>> b = akb.a(ld.aB, a);
   public static final Codec<iz<dyh<?, ?>>> c = jk.a(ld.aB, a);

   public boolean a(dap $$0, drv $$1, ayd $$2, im $$3) {
      return this.d.a(this.e, $$0, $$1, $$2, $$3);
   }

   public Stream<dyh<?, ?>> a() {
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
