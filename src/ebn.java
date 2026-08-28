import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public record ebn<FC extends eee, F extends eca<FC>>(F d, FC e) {
   public static final Codec<ebn<?, ?>> a = lt.O.r().dispatch($$0 -> $$0.d, eca::a);
   public static final Codec<jm<ebn<?, ?>>> b = akm.a(lu.aI, a);
   public static final Codec<jq<ebn<?, ?>>> c = kb.a(lu.aI, a);

   public boolean a(ddq $$0, dux $$1, ayv $$2, jd $$3) {
      return this.d.a(this.e, $$0, $$1, $$2, $$3);
   }

   public Stream<ebn<?, ?>> a() {
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
