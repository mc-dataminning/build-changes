import com.mojang.serialization.Codec;
import java.util.function.Function;

public record dsy<WC extends dst>(dta<WC> d, WC e) {
   public static final Codec<dsy<?>> a = kf.P.q().dispatch($$0 -> $$0.d, dta::c);
   public static final Codec<ij<dsy<?>>> b = aiu.a(kg.av, a);
   public static final Codec<in<dsy<?>>> c = ix.a(kg.av, a);

   public boolean a(awp $$0) {
      return this.d.a(this.e, $$0);
   }

   public boolean a(dsv $$0, dnf $$1, Function<hz, ij<cwq>> $$2, awp $$3, dqh $$4, cuy $$5, dne $$6) {
      return aa.a($$1.f()) ? false : this.d.a($$0, this.e, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public dta<WC> a() {
      return this.d;
   }

   public WC b() {
      return this.e;
   }
}
