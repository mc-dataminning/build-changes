import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public record dzk<FC extends ecb, F extends dzx<FC>>(F d, FC e) {
   public static final Codec<dzk<?, ?>> a = le.Q.q().dispatch($$0 -> $$0.d, dzx::a);
   public static final Codec<ix<dzk<?, ?>>> b = aki.a(lf.aC, a);
   public static final Codec<jb<dzk<?, ?>>> c = jm.a(lf.aC, a);

   public boolean a(dbs $$0, dsy $$1, ayk $$2, io $$3) {
      return this.d.a(this.e, $$0, $$1, $$2, $$3);
   }

   public Stream<dzk<?, ?>> a() {
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
