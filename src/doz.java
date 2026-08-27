import com.mojang.serialization.Codec;
import java.util.function.Function;

public record doz<WC extends dou>(dpb<WC> d, WC e) {
   public static final Codec<doz<?>> a = kc.Q.q().dispatch($$0 -> $$0.d, dpb::c);
   public static final Codec<ig<doz<?>>> b = agi.a(kd.at, a);
   public static final Codec<ik<doz<?>>> c = iu.a(kd.at, a);

   public boolean a(atw $$0) {
      return this.d.a(this.e, $$0);
   }

   public boolean a(dow $$0, djj $$1, Function<hx, ig<ctd>> $$2, atw $$3, dmi $$4, crm $$5, dji $$6) {
      return aa.a($$1.f()) ? false : this.d.a($$0, this.e, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public dpb<WC> a() {
      return this.d;
   }

   public WC b() {
      return this.e;
   }
}
