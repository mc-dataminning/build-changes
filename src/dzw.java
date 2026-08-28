import com.mojang.serialization.Codec;
import java.util.function.Function;

public record dzw<WC extends dzr>(dzy<WC> d, WC e) {
   public static final Codec<dzw<?>> a = lp.P.q().dispatch($$0 -> $$0.d, dzy::c);
   public static final Codec<ji<dzw<?>>> b = ala.a(lq.aB, a);
   public static final Codec<jm<dzw<?>>> c = jx.a(lq.aB, a);

   public boolean a(azg $$0) {
      return this.d.a(this.e, $$0);
   }

   public boolean a(dzt $$0, dtx $$1, Function<iz, ji<dcw>> $$2, azg $$3, dxf $$4, dbe $$5, dtw $$6) {
      return aa.a($$1.f()) ? false : this.d.a($$0, this.e, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public dzy<WC> a() {
      return this.d;
   }

   public WC b() {
      return this.e;
   }
}
