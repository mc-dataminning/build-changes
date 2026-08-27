import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public record dzm<FC extends ecd, F extends dzz<FC>>(F d, FC e) {
   public static final Codec<dzm<?, ?>> a = le.Q.q().dispatch($$0 -> $$0.d, dzz::a);
   public static final Codec<ix<dzm<?, ?>>> b = akj.a(lf.aC, a);
   public static final Codec<jb<dzm<?, ?>>> c = jm.a(lf.aC, a);

   public boolean a(dbu $$0, dta $$1, aym $$2, io $$3) {
      return this.d.a(this.e, $$0, $$1, $$2, $$3);
   }

   public Stream<dzm<?, ?>> a() {
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
