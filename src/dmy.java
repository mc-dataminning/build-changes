import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public record dmy<FC extends dpp, F extends dnl<FC>>(F d, FC e) {
   public static final Codec<dmy<?, ?>> a = jc.R.q().dispatch($$0 -> $$0.d, dnl::a);
   public static final Codec<hf<dmy<?, ?>>> b = ael.a(jd.as, a);
   public static final Codec<hj<dmy<?, ?>>> c = hu.a(jd.as, a);

   public boolean a(cqe $$0, dgv $$1, art $$2, gv $$3) {
      return this.d.a(this.e, $$0, $$1, $$2, $$3);
   }

   public Stream<dmy<?, ?>> a() {
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
