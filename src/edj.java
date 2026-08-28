import com.mojang.serialization.Codec;
import java.util.function.Function;

public record edj<WC extends ede>(edl<WC> d, WC e) {
   public static final Codec<edj<?>> a = ly.N.q().dispatch($$0 -> $$0.d, edl::c);
   public static final Codec<jq<edj<?>>> b = ale.a(lz.aI, a);
   public static final Codec<ju<edj<?>>> c = kf.a(lz.aI, a);

   public boolean a(azs $$0) {
      return this.d.a(this.e, $$0);
   }

   public boolean a(edg $$0, dxf $$1, Function<jh, jq<dgc>> $$2, azs $$3, ear $$4, deh $$5, dxe $$6) {
      return ab.a($$1.f()) ? false : this.d.a($$0, this.e, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public edl<WC> a() {
      return this.d;
   }

   public WC b() {
      return this.e;
   }
}
