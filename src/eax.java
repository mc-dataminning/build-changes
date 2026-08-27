import com.mojang.serialization.Codec;
import java.util.function.Function;

public record eax<WC extends eas>(eaz<WC> d, WC e) {
   public static final Codec<eax<?>> a = lh.P.q().dispatch($$0 -> $$0.d, eaz::c);
   public static final Codec<ja<eax<?>>> b = akp.a(li.aB, a);
   public static final Codec<je<eax<?>>> c = jp.a(li.aB, a);

   public boolean a(ayt $$0) {
      return this.d.a(this.e, $$0);
   }

   public boolean a(eau $$0, duy $$1, Function<ir, ja<dcz>> $$2, ayt $$3, dyg $$4, dbh $$5, dux $$6) {
      return ab.a($$1.g()) ? false : this.d.a($$0, this.e, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public eaz<WC> a() {
      return this.d;
   }

   public WC b() {
      return this.e;
   }
}
