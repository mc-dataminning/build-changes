import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public record edr<FC extends egj, F extends eef<FC>>(F d, FC e) {
   public static final Codec<edr<?, ?>> a = lx.O.q().dispatch($$0 -> $$0.d, eef::a);
   public static final Codec<jp<edr<?, ?>>> b = ald.a(ly.aJ, a);
   public static final Codec<jt<edr<?, ?>>> c = ke.a(ly.aJ, a);

   public boolean a(dfs $$0, dxa $$1, azr $$2, jg $$3) {
      return this.d.a(this.e, $$0, $$1, $$2, $$3);
   }

   public Stream<edr<?, ?>> a() {
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
