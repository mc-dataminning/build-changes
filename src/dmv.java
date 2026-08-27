import com.mojang.serialization.Codec;
import java.util.function.Function;

public record dmv<WC extends dmq>(dmx<WC> d, WC e) {
   public static final Codec<dmv<?>> a = jd.Q.q().dispatch($$0 -> $$0.d, dmx::c);
   public static final Codec<hg<dmv<?>>> b = aet.a(je.ar, a);
   public static final Codec<hk<dmv<?>>> c = hv.a(je.ar, a);

   public boolean a(asc $$0) {
      return this.d.a(this.e, $$0);
   }

   public boolean a(dms $$0, dhf $$1, Function<gw, hg<cqt>> $$2, asc $$3, dke $$4, cpc $$5, dhe $$6) {
      return aa.a($$1.f()) ? false : this.d.a($$0, this.e, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public dmx<WC> a() {
      return this.d;
   }

   public WC b() {
      return this.e;
   }
}
