import com.mojang.serialization.Codec;
import java.util.function.Function;

public record eft<WC extends efo>(efv<WC> d, WC e) {
   public static final Codec<eft<?>> a = ma.N.q().dispatch($$0 -> $$0.d, efv::c);
   public static final Codec<jq<eft<?>>> b = alv.a(mb.aK, a);
   public static final Codec<ju<eft<?>>> c = kf.a(mb.aK, a);

   public boolean a(bam $$0) {
      return this.d.a(this.e, $$0);
   }

   public boolean a(efq $$0, dzp $$1, Function<jh, jq<dij>> $$2, bam $$3, edb $$4, dgn $$5, dzo $$6) {
      return ab.a($$1.f()) ? false : this.d.a($$0, this.e, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public efv<WC> a() {
      return this.d;
   }

   public WC b() {
      return this.e;
   }
}
