import com.mojang.serialization.Codec;
import java.util.function.Function;

public record dxd<WC extends dwy>(dxf<WC> d, WC e) {
   public static final Codec<dxd<?>> a = kt.P.q().dispatch($$0 -> $$0.d, dxf::c);
   public static final Codec<in<dxd<?>>> b = ajr.a(ku.ay, a);
   public static final Codec<ir<dxd<?>>> c = jc.a(ku.ay, a);

   public boolean a(axt $$0) {
      return this.d.a(this.e, $$0);
   }

   public boolean a(dxa $$0, dre $$1, Function<id, in<daf>> $$2, axt $$3, dum $$4, cyn $$5, drd $$6) {
      return aa.a($$1.f()) ? false : this.d.a($$0, this.e, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public dxf<WC> a() {
      return this.d;
   }

   public WC b() {
      return this.e;
   }
}
