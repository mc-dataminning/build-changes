import com.mojang.serialization.Codec;
import java.util.function.Function;

public record ejj<WC extends eje>(ejl<WC> d, WC e) {
   public static final Codec<ejj<?>> a = mh.N.q().dispatch($$0 -> $$0.d, ejl::c);
   public static final Codec<jg<ejj<?>>> b = alg.a(mi.aK, a);
   public static final Codec<jk<ejj<?>>> c = jv.a(mi.aK, a);

   public boolean a(azz $$0) {
      return this.d.a(this.e, $$0);
   }

   public boolean a(ejg $$0, edd $$1, Function<iw, jg<dlc>> $$2, azz $$3, egr $$4, dje $$5, edc $$6) {
      return ac.a($$1.f()) ? false : this.d.a($$0, this.e, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public ejl<WC> a() {
      return this.d;
   }

   public WC b() {
      return this.e;
   }
}
