import com.mojang.serialization.Codec;
import java.util.function.Function;

public record dzv<WC extends dzq>(dzx<WC> d, WC e) {
   public static final Codec<dzv<?>> a = lp.P.q().dispatch($$0 -> $$0.d, dzx::c);
   public static final Codec<ji<dzv<?>>> b = ala.a(lq.aB, a);
   public static final Codec<jm<dzv<?>>> c = jx.a(lq.aB, a);

   public boolean a(azf $$0) {
      return this.d.a(this.e, $$0);
   }

   public boolean a(dzs $$0, dtw $$1, Function<iz, ji<dcv>> $$2, azf $$3, dxe $$4, dbd $$5, dtv $$6) {
      return aa.a($$1.f()) ? false : this.d.a($$0, this.e, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public dzx<WC> a() {
      return this.d;
   }

   public WC b() {
      return this.e;
   }
}
