import com.mojang.serialization.Codec;
import java.util.function.Function;

public record dqm<WC extends dqh>(dqo<WC> d, WC e) {
   public static final Codec<dqm<?>> a = kd.P.q().dispatch($$0 -> $$0.d, dqo::c);
   public static final Codec<ih<dqm<?>>> b = agz.a(ke.av, a);
   public static final Codec<il<dqm<?>>> c = iv.a(ke.av, a);

   public boolean a(aup $$0) {
      return this.d.a(this.e, $$0);
   }

   public boolean a(dqj $$0, dkw $$1, Function<hx, ih<cuh>> $$2, aup $$3, dnv $$4, csp $$5, dkv $$6) {
      return aa.a($$1.f()) ? false : this.d.a($$0, this.e, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public dqo<WC> a() {
      return this.d;
   }

   public WC b() {
      return this.e;
   }
}
