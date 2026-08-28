import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public record egh<FC extends eiz, F extends egv<FC>>(F d, FC e) {
   public static final Codec<egh<?, ?>> a = ma.O.q().dispatch($$0 -> $$0.d, egv::a);
   public static final Codec<jq<egh<?, ?>>> b = alv.a(mb.aL, a);
   public static final Codec<ju<egh<?, ?>>> c = kf.a(mb.aL, a);

   public boolean a(dif $$0, dzq $$1, bam $$2, jh $$3) {
      return this.d.a(this.e, $$0, $$1, $$2, $$3);
   }

   public Stream<egh<?, ?>> a() {
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
