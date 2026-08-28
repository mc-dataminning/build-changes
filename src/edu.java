import com.mojang.serialization.Codec;
import java.util.function.Function;

public record edu<WC extends edp>(edw<WC> d, WC e) {
   public static final Codec<edu<?>> a = lz.N.q().dispatch($$0 -> $$0.d, edw::c);
   public static final Codec<jq<edu<?>>> b = alf.a(ma.aI, a);
   public static final Codec<ju<edu<?>>> c = kf.a(ma.aI, a);

   public boolean a(azu $$0) {
      return this.d.a(this.e, $$0);
   }

   public boolean a(edr $$0, dxq $$1, Function<jh, jq<dgo>> $$2, azu $$3, ebc $$4, des $$5, dxp $$6) {
      return ab.a($$1.f()) ? false : this.d.a($$0, this.e, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public edw<WC> a() {
      return this.d;
   }

   public WC b() {
      return this.e;
   }
}
