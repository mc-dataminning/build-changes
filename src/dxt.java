import com.mojang.serialization.Codec;
import java.util.function.Function;

public record dxt<WC extends dxo>(dxv<WC> d, WC e) {
   public static final Codec<dxt<?>> a = lc.P.q().dispatch($$0 -> $$0.d, dxv::c);
   public static final Codec<iv<dxt<?>>> b = akb.a(ld.aA, a);
   public static final Codec<iz<dxt<?>>> c = jk.a(ld.aA, a);

   public boolean a(ayd $$0) {
      return this.d.a(this.e, $$0);
   }

   public boolean a(dxq $$0, dru $$1, Function<im, iv<dat>> $$2, ayd $$3, dvc $$4, czb $$5, drt $$6) {
      return aa.a($$1.f()) ? false : this.d.a($$0, this.e, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public dxv<WC> a() {
      return this.d;
   }

   public WC b() {
      return this.e;
   }
}
