import com.mojang.serialization.Codec;
import java.util.function.Function;

public record djn<WC extends dji>(djp<WC> d, WC e) {
   public static final Codec<djn<?>> a = jb.Q.q().dispatch($$0 -> $$0.d, djp::c);
   public static final Codec<he<djn<?>>> b = acm.a(jc.ar, a);
   public static final Codec<hi<djn<?>>> c = ht.a(jc.ar, a);

   public boolean a(apf $$0) {
      return this.d.a(this.e, $$0);
   }

   public boolean a(djk $$0, ddx $$1, Function<gu, he<cnk>> $$2, apf $$3, dgw $$4, clt $$5, ddw $$6) {
      return aa.a($$1.f()) ? false : this.d.a($$0, this.e, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public djp<WC> a() {
      return this.d;
   }

   public WC b() {
      return this.e;
   }
}
