import com.mojang.serialization.Codec;
import java.util.function.Function;

public record ejh<WC extends ejc>(ejj<WC> d, WC e) {
   public static final Codec<ejh<?>> a = mg.N.q().dispatch($$0 -> $$0.d, ejj::c);
   public static final Codec<jf<ejh<?>>> b = ale.a(mh.aK, a);
   public static final Codec<jj<ejh<?>>> c = ju.a(mh.aK, a);

   public boolean a(azx $$0) {
      return this.d.a(this.e, $$0);
   }

   public boolean a(eje $$0, edb $$1, Function<iv, jf<dla>> $$2, azx $$3, egp $$4, djc $$5, eda $$6) {
      return ac.a($$1.f()) ? false : this.d.a($$0, this.e, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public ejj<WC> a() {
      return this.d;
   }

   public WC b() {
      return this.e;
   }
}
