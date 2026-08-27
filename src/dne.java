import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public record dne<FC extends dpv, F extends dnr<FC>>(F d, FC e) {
   public static final Codec<dne<?, ?>> a = jd.R.q().dispatch($$0 -> $$0.d, dnr::a);
   public static final Codec<hg<dne<?, ?>>> b = aeq.a(je.as, a);
   public static final Codec<hk<dne<?, ?>>> c = hv.a(je.as, a);

   public boolean a(cqk $$0, dhb $$1, arx $$2, gw $$3) {
      return this.d.a(this.e, $$0, $$1, $$2, $$3);
   }

   public Stream<dne<?, ?>> a() {
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
