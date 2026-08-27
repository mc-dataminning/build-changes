import com.mojang.serialization.Codec;
import java.util.function.Function;

public record dmq<WC extends dml>(dms<WC> d, WC e) {
   public static final Codec<dmq<?>> a = jd.Q.q().dispatch($$0 -> $$0.d, dms::c);
   public static final Codec<hg<dmq<?>>> b = aeq.a(je.ar, a);
   public static final Codec<hk<dmq<?>>> c = hv.a(je.ar, a);

   public boolean a(arx $$0) {
      return this.d.a(this.e, $$0);
   }

   public boolean a(dmn $$0, dha $$1, Function<gw, hg<cqo>> $$2, arx $$3, djz $$4, cox $$5, dgz $$6) {
      return aa.a($$1.f()) ? false : this.d.a($$0, this.e, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public dms<WC> a() {
      return this.d;
   }

   public WC b() {
      return this.e;
   }
}
