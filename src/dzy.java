import com.mojang.serialization.Codec;
import java.util.function.Function;

public record dzy<WC extends dzt>(eaa<WC> d, WC e) {
   public static final Codec<dzy<?>> a = lp.P.q().dispatch($$0 -> $$0.d, eaa::c);
   public static final Codec<ji<dzy<?>>> b = alb.a(lq.aB, a);
   public static final Codec<jm<dzy<?>>> c = jx.a(lq.aB, a);

   public boolean a(azh $$0) {
      return this.d.a(this.e, $$0);
   }

   public boolean a(dzv $$0, dtz $$1, Function<iz, ji<dcy>> $$2, azh $$3, dxh $$4, dbg $$5, dty $$6) {
      return aa.a($$1.f()) ? false : this.d.a($$0, this.e, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public eaa<WC> a() {
      return this.d;
   }

   public WC b() {
      return this.e;
   }
}
