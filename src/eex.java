import com.mojang.serialization.Codec;
import java.util.function.Function;

public record eex<WC extends ees>(eez<WC> d, WC e) {
   public static final Codec<eex<?>> a = mb.N.q().dispatch($$0 -> $$0.d, eez::c);
   public static final Codec<jr<eex<?>>> b = akr.a(mc.aK, a);
   public static final Codec<jv<eex<?>>> c = kg.a(mc.aK, a);

   public boolean a(azh $$0) {
      return this.d.a(this.e, $$0);
   }

   public boolean a(eeu $$0, dyt $$1, Function<ji, jr<dhl>> $$2, azh $$3, ecf $$4, dfp $$5, dys $$6) {
      return ab.a($$1.f()) ? false : this.d.a($$0, this.e, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public eez<WC> a() {
      return this.d;
   }

   public WC b() {
      return this.e;
   }
}
