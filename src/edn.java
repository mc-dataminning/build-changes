import com.mojang.serialization.Codec;
import java.util.function.Function;

public record edn<WC extends edi>(edp<WC> d, WC e) {
   public static final Codec<edn<?>> a = lz.N.q().dispatch($$0 -> $$0.d, edp::c);
   public static final Codec<jq<edn<?>>> b = alh.a(ma.aI, a);
   public static final Codec<ju<edn<?>>> c = kf.a(ma.aI, a);

   public boolean a(azv $$0) {
      return this.d.a(this.e, $$0);
   }

   public boolean a(edk $$0, dxj $$1, Function<jh, jq<dgh>> $$2, azv $$3, eav $$4, del $$5, dxi $$6) {
      return ab.a($$1.f()) ? false : this.d.a($$0, this.e, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public edp<WC> a() {
      return this.d;
   }

   public WC b() {
      return this.e;
   }
}
