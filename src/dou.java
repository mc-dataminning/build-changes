import com.mojang.serialization.Codec;
import java.util.function.Function;

public record dou<WC extends dop>(dow<WC> d, WC e) {
   public static final Codec<dou<?>> a = jy.Q.q().dispatch($$0 -> $$0.d, dow::c);
   public static final Codec<ib<dou<?>>> b = age.a(jz.at, a);
   public static final Codec<ig<dou<?>>> c = iq.a(jz.at, a);

   public boolean a(ats $$0) {
      return this.d.a(this.e, $$0);
   }

   public boolean a(dor $$0, dje $$1, Function<ht, ib<csy>> $$2, ats $$3, dmd $$4, crh $$5, djd $$6) {
      return aa.a($$1.f()) ? false : this.d.a($$0, this.e, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public dow<WC> a() {
      return this.d;
   }

   public WC b() {
      return this.e;
   }
}
