import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public record edg<FC extends efy, F extends edu<FC>>(F d, FC e) {
   public static final Codec<edg<?, ?>> a = lv.O.q().dispatch($$0 -> $$0.d, edu::a);
   public static final Codec<jo<edg<?, ?>>> b = ala.a(lw.aK, a);
   public static final Codec<js<edg<?, ?>>> c = kd.a(lw.aK, a);

   public boolean a(dfg $$0, dwp $$1, azn $$2, jf $$3) {
      return this.d.a(this.e, $$0, $$1, $$2, $$3);
   }

   public Stream<edg<?, ?>> a() {
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
