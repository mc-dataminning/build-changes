import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public record dmz<FC extends dpq, F extends dnm<FC>>(F d, FC e) {
   public static final Codec<dmz<?, ?>> a = jb.R.q().dispatch($$0 -> $$0.d, dnm::a);
   public static final Codec<he<dmz<?, ?>>> b = aen.a(jc.as, a);
   public static final Codec<hi<dmz<?, ?>>> c = ht.a(jc.as, a);

   public boolean a(cqf $$0, dgw $$1, aru $$2, gu $$3) {
      return this.d.a(this.e, $$0, $$1, $$2, $$3);
   }

   public Stream<dmz<?, ?>> a() {
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
