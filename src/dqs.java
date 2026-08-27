import com.mojang.serialization.Codec;
import java.util.function.Function;

public record dqs<WC extends dqn>(dqu<WC> d, WC e) {
   public static final Codec<dqs<?>> a = kd.P.q().dispatch($$0 -> $$0.d, dqu::c);
   public static final Codec<ih<dqs<?>>> b = ahc.a(ke.av, a);
   public static final Codec<il<dqs<?>>> c = iv.a(ke.av, a);

   public boolean a(auu $$0) {
      return this.d.a(this.e, $$0);
   }

   public boolean a(dqp $$0, dlc $$1, Function<hx, ih<cun>> $$2, auu $$3, dob $$4, csv $$5, dlb $$6) {
      return aa.a($$1.f()) ? false : this.d.a($$0, this.e, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public dqu<WC> a() {
      return this.d;
   }

   public WC b() {
      return this.e;
   }
}
