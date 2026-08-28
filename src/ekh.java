import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public record ekh<FC extends enb, F extends ekw<FC>>(F d, FC e) {
   public static final Codec<ekh<?, ?>> a = mh.O.q().dispatch($$0 -> $$0.d, ekw::a);
   public static final Codec<jg<ekh<?, ?>>> b = aln.a(mi.aL, a);
   public static final Codec<jk<ekh<?, ?>>> c = jv.a(mi.aL, a);

   public boolean a(dli $$0, edo $$1, bai $$2, iw $$3) {
      return this.d.a(this.e, $$0, $$1, $$2, $$3);
   }

   public Stream<ekh<?, ?>> a() {
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
