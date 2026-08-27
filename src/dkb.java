import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public record dkb<FC extends dms, F extends dko<FC>>(F d, FC e) {
   public static final Codec<dkb<?, ?>> a = jb.R.q().dispatch($$0 -> $$0.d, dko::a);
   public static final Codec<he<dkb<?, ?>>> b = acm.a(jc.as, a);
   public static final Codec<hi<dkb<?, ?>>> c = ht.a(jc.as, a);

   public boolean a(cng $$0, ddy $$1, apf $$2, gu $$3) {
      return this.d.a(this.e, $$0, $$1, $$2, $$3);
   }

   public Stream<dkb<?, ?>> a() {
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
