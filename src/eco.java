import com.mojang.serialization.Codec;
import java.util.function.Function;

public record eco<WC extends ecj>(ecq<WC> d, WC e) {
   public static final Codec<eco<?>> a = lu.N.q().dispatch($$0 -> $$0.d, ecq::c);
   public static final Codec<jn<eco<?>>> b = aky.a(lv.aI, a);
   public static final Codec<jr<eco<?>>> c = kc.a(lv.aI, a);

   public boolean a(azl $$0) {
      return this.d.a(this.e, $$0);
   }

   public boolean a(ecl $$0, dwk $$1, Function<je, jn<dfh>> $$2, azl $$3, dzw $$4, ddm $$5, dwj $$6) {
      return ab.a($$1.f()) ? false : this.d.a($$0, this.e, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public ecq<WC> a() {
      return this.d;
   }

   public WC b() {
      return this.e;
   }
}
