import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public record ebq<FC extends eei, F extends ece<FC>>(F d, FC e) {
   public static final Codec<ebq<?, ?>> a = lt.O.r().dispatch($$0 -> $$0.d, ece::a);
   public static final Codec<jm<ebq<?, ?>>> b = akn.a(lu.aI, a);
   public static final Codec<jq<ebq<?, ?>>> c = kb.a(lu.aI, a);

   public boolean a(dds $$0, duz $$1, ayw $$2, jd $$3) {
      return this.d.a(this.e, $$0, $$1, $$2, $$3);
   }

   public Stream<ebq<?, ?>> a() {
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
