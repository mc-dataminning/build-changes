import com.mojang.serialization.Codec;
import java.util.function.Function;

public record dzs<WC extends dzn>(dzu<WC> d, WC e) {
   public static final Codec<dzs<?>> a = lp.P.q().dispatch($$0 -> $$0.d, dzu::c);
   public static final Codec<ji<dzs<?>>> b = akx.a(lq.aB, a);
   public static final Codec<jm<dzs<?>>> c = jx.a(lq.aB, a);

   public boolean a(azc $$0) {
      return this.d.a(this.e, $$0);
   }

   public boolean a(dzp $$0, dtt $$1, Function<iz, ji<dcs>> $$2, azc $$3, dxb $$4, dba $$5, dts $$6) {
      return aa.a($$1.f()) ? false : this.d.a($$0, this.e, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public dzu<WC> a() {
      return this.d;
   }

   public WC b() {
      return this.e;
   }
}
