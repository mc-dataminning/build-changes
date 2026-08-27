import com.mojang.serialization.Codec;
import java.util.function.Function;

public record dmk<WC extends dmf>(dmm<WC> d, WC e) {
   public static final Codec<dmk<?>> a = jc.Q.q().dispatch($$0 -> $$0.d, dmm::c);
   public static final Codec<hf<dmk<?>>> b = ael.a(jd.ar, a);
   public static final Codec<hj<dmk<?>>> c = hu.a(jd.ar, a);

   public boolean a(art $$0) {
      return this.d.a(this.e, $$0);
   }

   public boolean a(dmh $$0, dgu $$1, Function<gv, hf<cqi>> $$2, art $$3, djt $$4, cor $$5, dgt $$6) {
      return aa.a($$1.f()) ? false : this.d.a($$0, this.e, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public dmm<WC> a() {
      return this.d;
   }

   public WC b() {
      return this.e;
   }
}
