import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public record dnj<FC extends dqa, F extends dnw<FC>>(F d, FC e) {
   public static final Codec<dnj<?, ?>> a = jd.R.q().dispatch($$0 -> $$0.d, dnw::a);
   public static final Codec<hg<dnj<?, ?>>> b = aet.a(je.as, a);
   public static final Codec<hk<dnj<?, ?>>> c = hv.a(je.as, a);

   public boolean a(cqp $$0, dhg $$1, asc $$2, gw $$3) {
      return this.d.a(this.e, $$0, $$1, $$2, $$3);
   }

   public Stream<dnj<?, ?>> a() {
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
