import com.mojang.serialization.Codec;
import java.util.function.Function;

public record edd<WC extends ecy>(edf<WC> d, WC e) {
   public static final Codec<edd<?>> a = lx.N.q().dispatch($$0 -> $$0.d, edf::c);
   public static final Codec<jp<edd<?>>> b = ald.a(ly.aI, a);
   public static final Codec<jt<edd<?>>> c = ke.a(ly.aI, a);

   public boolean a(azr $$0) {
      return this.d.a(this.e, $$0);
   }

   public boolean a(eda $$0, dwz $$1, Function<jg, jp<dfw>> $$2, azr $$3, eal $$4, deb $$5, dwy $$6) {
      return ab.a($$1.f()) ? false : this.d.a($$0, this.e, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public edf<WC> a() {
      return this.d;
   }

   public WC b() {
      return this.e;
   }
}
